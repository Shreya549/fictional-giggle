from django.db import models
from Librarian.models import Books
from django.contrib.auth.models import User
import uuid

# Create your models here.
class IssuedBooks(models.Model):
    uuid = models.UUIDField(default = uuid.uuid4, primary_key = True)
    book = models.ForeignKey(
        Books, on_delete = models.CASCADE, related_name='book'
    )
    dateIssued = models.DateField()
    dateToReturn = models.DateField(null = True)
    dateReturned = models.DateField(null = True)
    duration = models.IntegerField(default = 7)
    owner = models.ForeignKey(
        User, on_delete = models.CASCADE, related_name = 'Borrower'
    )

