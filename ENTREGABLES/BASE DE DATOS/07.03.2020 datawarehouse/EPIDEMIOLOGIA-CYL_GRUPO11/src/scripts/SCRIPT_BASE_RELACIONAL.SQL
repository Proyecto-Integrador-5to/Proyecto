
CREATE TABLE public.PROVINCIAS (
                codigo_ine NUMERIC(10) NOT NULL,
                posicion VARCHAR(20) NOT NULL,
                provincias VARCHAR(15) NOT NULL,
                CONSTRAINT provincias_pk PRIMARY KEY (codigo_ine)
);


CREATE TABLE public.CASOS (
                fallecimientos NUMERIC(7) NOT NULL,
                altas NUMERIC(7) NOT NULL,
                nuevos_posibles_casos NUMERIC(7) NOT NULL,
                casos_confirmados NUMERIC(7) NOT NULL,
                fecha DATE NOT NULL,
                codigo_ine NUMERIC(10) NOT NULL
);


ALTER TABLE public.CASOS ADD CONSTRAINT provincias_id_casos_fk
FOREIGN KEY (codigo_ine)
REFERENCES public.PROVINCIAS (codigo_ine)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;