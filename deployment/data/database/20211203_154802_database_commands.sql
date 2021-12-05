ALTER TABLE "billets$commande" ADD "numerocommande" VARCHAR_IGNORECASE(200) NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('e313072c-8714-4fbd-ac4a-615a59380246', 
'26d4c507-a4fe-49d6-9f18-56542d45b51f', 
'NumeroCommande', 
'numerocommande', 
30, 
200, 
'', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20211203 15:48:02';
