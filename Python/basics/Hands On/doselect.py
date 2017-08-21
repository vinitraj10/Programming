import requests
from pprint import pprint

app_id = "WUnenn2VPGFLvYDS14kkhzlLjIu4cZwZdxaOpgul"
food = input()
url="https://api.nal.usda.gov/ndb/search/?format=json&q="+ str(food)+"&max=25&offset=0&api_key="+str(app_id)
SearchReport = requests.get(url).json()

ndbno=SearchReport['list']['item']
for data in ndbno:
	if data['ds']=="SR":
		break
ndb = data['ndbno']

#pprint(ndbno)
#https://api.nal.usda.gov/ndb/reports/?ndbno=45089777&type=b&format=json&api_key=WUnenn2VPGFLvYDS14kkhzlLjIu4cZwZdxaOpgul
food_url = "https://api.nal.usda.gov/ndb/reports/?ndbno="+str(ndb)+"&type=b&format=json&api_key="+str(app_id)
food_report=requests.get(food_url).json()
protein_val = food_report['report']['food']['nutrients'][2]['value']
protein_val_unit = food_report['report']['food']['nutrients'][2]['unit']

answer = str(protein_val)+ str(protein_val_unit)
print(answer)