from django.db import models
import uuid

# Create your models here.
class Books(models.Model):
    uuid = models.UUIDField(default = uuid.uuid4, primary_key = True)
    name = models.CharField(max_length = 100)
    isbn = models.CharField(max_length = 20, unique = True)
    genre = models.CharField(max_length = 50)
    details = models.TextField(null = True)
    copies = models.IntegerField(default = 1)
    inStock = models.BooleanField(default=True)



