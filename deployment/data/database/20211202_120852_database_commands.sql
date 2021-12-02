ALTER TABLE "administration$account" ADD "genre" VARCHAR_IGNORECASE(5) NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('dd850c0e-2562-4f4e-8640-1f1add9069e1', 
'3078a23e-13b2-4a9b-84e4-2881fdee53c6', 
'Genre', 
'genre', 
40, 
5, 
'', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20211202 12:08:52';
