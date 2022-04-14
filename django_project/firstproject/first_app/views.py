from django.shortcuts import render
from django.http import HttpResponse
from first_app.models import Topic, Webpage, AccessRecord

def index1(request):
    # return HttpResponse('<em>hello world</em>')
    data = {'insert_me' : "hello, i am coming from view.py"}
    return render(request, 'first_app/index.html', context=data)

def help(request):
    # return HttpResponse('<em>hello world</em>')
    data = {'insert_me' : "I am here to help you"}
    return render(request, 'first_app/help.html', context=data)

def index(request):
    # return HttpResponse('<em>hello world</em>')
    webpage_list = AccessRecord.objects.order_by('date')
    date_dict = {'access_records': webpage_list}
    return render(request, 'first_app/index.html', context=date_dict)
