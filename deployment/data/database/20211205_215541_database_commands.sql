ALTER TABLE "billets$billet" ADD "nombrebillet" INT NULL;
UPDATE "billets$billet"
 SET "nombrebillet" = 0;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('1bf73ca2-3ce2-46fd-8341-99be2660e354', 
'fcb4662d-56e8-4815-9f51-4cb7fb7bc367', 
'NombreBillet', 
'nombrebillet', 
3, 
0, 
'0', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20211205 21:55:41';
