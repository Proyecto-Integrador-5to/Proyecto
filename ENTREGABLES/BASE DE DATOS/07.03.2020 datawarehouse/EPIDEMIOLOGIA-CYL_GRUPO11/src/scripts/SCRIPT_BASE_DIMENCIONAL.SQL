
CREATE TABLE public.DIM_FECHA (
                SK_FECHA INTEGER NOT NULL,
                ANIO INTEGER NOT NULL,
                MES INTEGER NOT NULL,
                NOMBRE_MES VARCHAR(15) NOT NULL,
                DIA INTEGER NOT NULL,
                FECHA DATE NOT NULL,
                CONSTRAINT dim_fecha_pk PRIMARY KEY (SK_FECHA)
);


CREATE TABLE public.DIM_PROVINCIAS (
                SK_CODIGO_INE INTEGER NOT NULL,
                PK_CODIGO_INE NUMERIC(10) NOT NULL,
                provincias VARCHAR(15) NOT NULL,
                posicion VARCHAR(20) NOT NULL,
                VALIDO_HASTA DATE,
                VALIDO_DESDE DATE,
                VERSION INTEGER NOT NULL,
                CONSTRAINT dim_provincias_pk PRIMARY KEY (SK_CODIGO_INE)
);


CREATE TABLE public.TRANSCURSO_EPIDEMIOLOGICO (
                SK_CODIGO_INE INTEGER NOT NULL,
                SK_FECHA INTEGER NOT NULL,
                casos_confirmados NUMERIC(10) NOT NULL,
                nuevos_posibles_casos NUMERIC(10) NOT NULL,
                altas NUMERIC(10) NOT NULL,
                fallecimientos NUMERIC(10) NOT NULL,
                CONSTRAINT transcurso_epidemiologico_pk PRIMARY KEY (SK_CODIGO_INE, SK_FECHA)
);


ALTER TABLE public.TRANSCURSO_EPIDEMIOLOGICO ADD CONSTRAINT dim_fecha_hechos_fk
FOREIGN KEY (SK_FECHA)
REFERENCES public.DIM_FECHA (SK_FECHA)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.TRANSCURSO_EPIDEMIOLOGICO ADD CONSTRAINT dim_provincias_hechos_fk
FOREIGN KEY (SK_CODIGO_INE)
REFERENCES public.DIM_PROVINCIAS (SK_CODIGO_INE)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;