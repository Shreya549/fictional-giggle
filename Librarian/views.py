from django.shortcuts import render
from rest_framework import viewsets, permissions, generics
from rest_framework.response import Response
from rest_framework import status
from .models import Books
from .serializers import BooksSerializer


# Create your views here.
class BooksProfileViewSet(viewsets.ModelViewSet):

    permission_classes = [permissions.IsAuthenticated]
    serializer_class = BooksSerializer

    def get_queryset(self):
        books = Books.objects.all()
        return(books)

    def perform_create(self,serializer):
        serializer.save()

    def put(self, request, *args, **kwargs):
        return self.update(request, *args, **kwargs)
