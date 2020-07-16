from django.urls import path, include #import functions from django.urls class
from rest_framework.routers import DefaultRouter 
#import obj from class router
from .views import BookAvailabiltyList, BorrowBookViewSet

router = DefaultRouter()
router.register('updateAvailability', BooksProfileViewSet, basename = 'updateRouter')
urlpatterns = router.urls # using obj to call funtion urls which returns a list

urlpatterns += [
    path('checkAvailability/', BookAvailabiltyList.as_view())
]



