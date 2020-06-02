from django.urls import path, include #import functions from django.urls class
from rest_framework.routers import DefaultRouter #import obj from class routers
from .views import BooksProfileViewSet

router = DefaultRouter()
router.register('updateBooks', BooksProfileViewSet, basename = 'updateRouter')
urlpatterns = router.urls # using obj to call funtion urls which returns a list



