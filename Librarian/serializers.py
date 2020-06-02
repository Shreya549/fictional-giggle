from rest_framework import serializers
from .models import Books

class BooksSerializer(serializers.ModelSerializer):
    class Meta:
        model = Books
        fields = '__all__'
        read_only_fields = ('owner')
