from django import forms
from django.core import validators

def check_for_A(value):
    if value[0].lower() != 'a':
        raise forms.ValidationError('Name should start with A')

class FormName(forms.Form):
    name = forms.CharField(validators=[check_for_A])
    email = forms.EmailField()
    verify_email = forms.EmailField(label='Please enter email:')
    text = forms.CharField(widget=forms.Textarea)
    botcapture = forms.CharField(required=False, widget=forms.HiddenInput, validators=[validators.MaxLengthValidator(0)])

    def clean(self):
        get_all_data=super().clean()
        email = get_all_data['email']
        verify_email = get_all_data['verify_email']
        if email != verify_email:
            raise forms.ValidationError("email not matched")

# check with methos old way
    # def clean_botcapture(self):
    #     botcapture = self.cleaned_data['botcapture']
    #     print(botcapture)
    #     if len(botcapture)>0:
    #         raise forms.ValidationError("Goth BOT !!")
        # return botcapture
