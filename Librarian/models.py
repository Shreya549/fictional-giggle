from django.db import models
from django.contrib.auth.models import User
import uuid

# Create your models here.
class Books(models.Model):
    uuid = models.UUIDField(default = uuid.uuid4, primary_key = True)
    publication = models.CharField(max_length = 100, default = 'Unknown')
    name = models.CharField(max_length = 100)
    isbn = models.CharField(max_length = 20)
    genre = models.CharField(max_length = 50)
    details = models.TextField(null = True)
    inStock = models.BooleanField(default=True)
    isAvailable = models.BooleanField(default = True)
    current_user = models.CharField(max_length=15, null = True)



