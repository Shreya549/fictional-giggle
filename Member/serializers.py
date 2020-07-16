from rest_framework import serializers
from .models import IssuedBooks

class IssuedBooksSerializer(serializers.ModelSerializer):
    class Meta:
        model = IssuedBooks
        fields = '__all__'
        read_only_fields = ('owner', 'date')
