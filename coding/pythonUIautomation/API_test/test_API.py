import requests


def test_first():
    param = {'page':2}

    response = requests.get("https://reqres.in/api/users", params=param)
    print(response.status_code)
    print(response.text)
    print(response.json()['data'][0]['id'])