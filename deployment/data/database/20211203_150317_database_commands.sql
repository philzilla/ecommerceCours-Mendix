ALTER TABLE "billets$billet" ADD "affiche" VARCHAR_IGNORECASE(200) NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('c9ddd26f-5d28-4631-9537-ea171d965d28', 
'fcb4662d-56e8-4815-9f51-4cb7fb7bc367', 
'Affiche', 
'affiche', 
30, 
200, 
'', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20211203 15:03:17';
