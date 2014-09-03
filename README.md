60DayProject
============
Members:

Chris Lee
github: cblee23
slack: chrislee

Dustin Fehlman
github: DustinFehlman
slack: dustinf.

John Harris
github: fluidlikewater
slack: biojohn

Kyle Kelly:
github: gokylekelly
slack: gokylekelly

GIT URL:

https://github.com/fluidlikewater/60DayProject.git

Requirements:
Given a list of products separate those products into as few boxes as possible given that no box can contain more than one product type.

tisha[1:45 PM]Each box has 9 units

tisha[1:46 PM]All shoes are 3 Units
tisha[1:46 PM]Call clothes are 2 units
tisha[1:46 PM]All bags are 3 units
tisha [1:46 PM]All houswares (towels and such) are 5 units
tisha[1:47 PM]Beauty items are 2 units
tisha[1:47 PM]Accessories are 1 unit


JSON format:

{
   "items": [
       {
           "name": "Cool Shoes",
           "itemType": "shoe",
           "sku": "12345678"
       },
       {
           "name": "Cool Heels",
           "itemType": "shoe",
           "sku": "12345678"
       },
       {
           "name": "Cool Heels",
           "itemType": "shoe",
           "sku": "12345678"
       },
       {
           "name": "Cool Accessory",
           "itemType": "accessory",
           "sku": "23456789"
       },
       {
           "name": "Cool Blender",
           "itemType": "housewares",
           "sku": "987765432"
       }
   ]
}
