from django.shortcuts import render
from rest_framework import viewsets, permissions, generics
from rest_framework.response import Response
from rest_framework import status
from .models import IssuedBooks
from Librarian.models import Books
from .serializers import IssuedBooksSerializer
from Librarian.serializers import BooksSerializer
from datetime import date, timedelta


# Create your views here.
class BookAvailabiltyList(generics.ListAPIView):
    permission_classes = [permissions.IsAuthenticated]
    queryset = Books.objects.all()
    serializer_class = BooksSerializer

# Update Book Availability
class BorrowBookViewSet(viewsets.ModelViewSet):

    permission_classes = [permissions.IsAuthenticated]
    serializer_class = BooksSerializer

    def put(self, request, *args, **kwargs):
        return self.update(request, *args, **kwargs)

#Create record of update
class BorrowUpdateViewSet(viewsets.ModelViewSet):

    permission_classes = [permissions.IsAuthenticated]
    serializer_class = IssuedBooksSerializer

    def get_queryset(self):
        queryset = self.request.user.Borrower.all()

    def perform_create(self, serializer):
        serializer.save(owner = self.request.user, dateIssued = date.today(), dateReturned = date.today() + timedelta(days = 7))

    