CREATE TABLE "billets$commande" (
	"id" BIGINT NOT NULL,
	"idcommande" BIGINT NULL,
	PRIMARY KEY("id"));
CREATE SEQUENCE "billets$commande_idcommande_mxseq" AS BIGINT START WITH 1;
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"remote", 
"remote_primary_key")
 VALUES ('26d4c507-a4fe-49d6-9f18-56542d45b51f', 
'Billets.Commande', 
'billets$commande', 
false, 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('269392d8-dae8-47cc-a90d-4baba9325ee4', 
'26d4c507-a4fe-49d6-9f18-56542d45b51f', 
'IdCommande', 
'idcommande', 
0, 
0, 
'1', 
true);
INSERT INTO "mendixsystem$sequence" ("attribute_id", 
"name", 
"start_value", 
"current_value")
 VALUES ('269392d8-dae8-47cc-a90d-4baba9325ee4', 
'billets$commande_idcommande_mxseq', 
1, 
0);
CREATE TABLE "billets$commande_billet" (
	"billets$commandeid" BIGINT NOT NULL,
	"billets$billetid" BIGINT NOT NULL,
	PRIMARY KEY("billets$commandeid","billets$billetid"),
	CONSTRAINT "uniq_billets$commande_billet_billets$commandeid" UNIQUE ("billets$commandeid"));
CREATE INDEX "idx_billets$commande_billet_billets$billet_billets$commande" ON "billets$commande_billet" ("billets$billetid" ASC,"billets$commandeid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('4cd922bf-dbaa-4d90-bafc-7c2d58fa8519', 
'Billets.Commande_Billet', 
'billets$commande_billet', 
'26d4c507-a4fe-49d6-9f18-56542d45b51f', 
'fcb4662d-56e8-4815-9f51-4cb7fb7bc367', 
'billets$commandeid', 
'billets$billetid', 
'idx_billets$commande_billet_billets$billet_billets$commande');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_billets$commande_billet_billets$commandeid', 
'4cd922bf-dbaa-4d90-bafc-7c2d58fa8519', 
'82bbdd24-d893-3db0-a011-7f74e92aaf56');
CREATE TABLE "billets$billet" (
	"id" BIGINT NOT NULL,
	"ref" INT NULL,
	"nom" VARCHAR_IGNORECASE(200) NULL,
	"prixht" DECIMAL(28, 8) NULL,
	"idproduct" BIGINT NULL,
	"createddate" TIMESTAMP NULL,
	"changeddate" TIMESTAMP NULL,
	"system$owner" BIGINT NULL,
	"system$changedby" BIGINT NULL,
	PRIMARY KEY("id"));
CREATE SEQUENCE "billets$billet_idproduct_mxseq" AS BIGINT START WITH 1;
CREATE INDEX "idx_billets$billet_system$owner" ON "billets$billet" ("system$owner" ASC,"id" ASC);
CREATE INDEX "idx_billets$billet_system$changedby" ON "billets$billet" ("system$changedby" ASC,"id" ASC);
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"remote", 
"remote_primary_key")
 VALUES ('fcb4662d-56e8-4815-9f51-4cb7fb7bc367', 
'Billets.Billet', 
'billets$billet', 
false, 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('0e90d924-9eee-4c53-8ef3-30d6a98394a8', 
'fcb4662d-56e8-4815-9f51-4cb7fb7bc367', 
'Ref', 
'ref', 
3, 
0, 
'0', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('2743879a-a206-4ca4-a1c5-4ba2a95cb1f3', 
'fcb4662d-56e8-4815-9f51-4cb7fb7bc367', 
'Nom', 
'nom', 
30, 
200, 
'', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('35a20f0f-30e0-4387-b40e-985de7e81c8e', 
'fcb4662d-56e8-4815-9f51-4cb7fb7bc367', 
'PrixHT', 
'prixht', 
5, 
0, 
'0', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('cca64a4b-d5df-467a-bd24-c7781ebb10d6', 
'fcb4662d-56e8-4815-9f51-4cb7fb7bc367', 
'IdProduct', 
'idproduct', 
0, 
0, 
'1', 
true);
INSERT INTO "mendixsystem$sequence" ("attribute_id", 
"name", 
"start_value", 
"current_value")
 VALUES ('cca64a4b-d5df-467a-bd24-c7781ebb10d6', 
'billets$billet_idproduct_mxseq', 
1, 
0);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('60948060-7335-3385-a9e0-21744a22c70c', 
'fcb4662d-56e8-4815-9f51-4cb7fb7bc367', 
'createdDate', 
'createddate', 
20, 
0, 
'', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('033cd514-9180-365e-a0fe-bfd2fe7aa3a7', 
'fcb4662d-56e8-4815-9f51-4cb7fb7bc367', 
'changedDate', 
'changeddate', 
20, 
0, 
'', 
false);
INSERT INTO "mendixsystem$index" ("id", 
"table_id", 
"index_name")
 VALUES ('5ce816d9-eaf2-3dd8-b1b1-2340c3b3e118', 
'fcb4662d-56e8-4815-9f51-4cb7fb7bc367', 
'idx_billets$billet_system$owner');
INSERT INTO "mendixsystem$index_column" ("index_id", 
"column_id", 
"sort_order", 
"ordinal")
 VALUES ('5ce816d9-eaf2-3dd8-b1b1-2340c3b3e118', 
'8b3a144a-3931-3436-824c-b3c36d31bf88', 
false, 
0);
INSERT INTO "mendixsystem$index" ("id", 
"table_id", 
"index_name")
 VALUES ('b1564da5-5423-3c9d-b7ca-9f531c49e388', 
'fcb4662d-56e8-4815-9f51-4cb7fb7bc367', 
'idx_billets$billet_system$changedby');
INSERT INTO "mendixsystem$index_column" ("index_id", 
"column_id", 
"sort_order", 
"ordinal")
 VALUES ('b1564da5-5423-3c9d-b7ca-9f531c49e388', 
'75e6f967-ae6b-3df7-a338-a4fdd874c2ee', 
false, 
0);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name")
 VALUES ('8b3a144a-3931-3436-824c-b3c36d31bf88', 
'System.owner', 
'system$owner', 
'fcb4662d-56e8-4815-9f51-4cb7fb7bc367', 
'282e2e60-88a5-469d-84a5-ba8d9151644f', 
'id', 
'system$owner');
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name")
 VALUES ('75e6f967-ae6b-3df7-a338-a4fdd874c2ee', 
'System.changedBy', 
'system$changedby', 
'fcb4662d-56e8-4815-9f51-4cb7fb7bc367', 
'282e2e60-88a5-469d-84a5-ba8d9151644f', 
'id', 
'system$changedby');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20211203 14:10:49';
