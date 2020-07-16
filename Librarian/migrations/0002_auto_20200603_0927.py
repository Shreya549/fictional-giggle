# Generated by Django 3.0.6 on 2020-06-03 03:57

from django.conf import settings
from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    dependencies = [
        migrations.swappable_dependency(settings.AUTH_USER_MODEL),
        ('Librarian', '0001_initial'),
    ]

    operations = [
        migrations.AddField(
            model_name='books',
            name='current_user',
            field=models.ForeignKey(null=True, on_delete=django.db.models.deletion.CASCADE, related_name='current_reader', to=settings.AUTH_USER_MODEL),
        ),
        migrations.AddField(
            model_name='books',
            name='isAvailable',
            field=models.BooleanField(default=True),
        ),
        migrations.AddField(
            model_name='books',
            name='publication',
            field=models.CharField(default='Unknown', max_length=100),
        ),
    ]
