CREATE TABLE categories
(
  id integer NOT NULL,
  name character varying,
  parent_category_id integer,
  CONSTRAINT categories_pkey PRIMARY KEY (id)
);

CREATE TABLE product
(
  id integer NOT NULL,
  product_code character varying,
  brand_name character varying,
  description character varying,
  category_id integer,
  CONSTRAINT product_pkey PRIMARY KEY (id),
  CONSTRAINT product_category_id_fkey FOREIGN KEY (category_id)
      REFERENCES categories (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);