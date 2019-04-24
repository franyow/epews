INSERT INTO credito (COD_CREDITO,IMG_CREDITO,NOMBRE_CREDITO ,DESCRIPCION_CREDITO) VALUES (1,'https://www.pichincha.com/portal/Portals/0/adam/Submenu/lUoL0XRNf02YSYFs2bk-Sg/Icon/Personas-Credito-educativo.jpg?w=300&h=200&mode=crop','Crédito educativo','Estudia lo que siempre quisiste, en la universidad de tu elección.');
INSERT INTO credito (COD_CREDITO,IMG_CREDITO,NOMBRE_CREDITO ,DESCRIPCION_CREDITO) VALUES (2,'https://www.pichincha.com/portal/Portals/0/adam/Submenu/TjNl-oEvDUqGx8gMpSaUNQ/Icon/Personas-Credito-ecologico.jpg?w=300&h=200&mode=crop','Crédito ecológico','Dale vida a tus propósitos con sostenibilidad ambiental.');
INSERT INTO credito (COD_CREDITO,IMG_CREDITO,NOMBRE_CREDITO ,DESCRIPCION_CREDITO) VALUES (3,'https://www.pichincha.com/portal/Portals/0/adam/Submenu/W2zUNjJY1USH4wwPWEuUtg/Icon/Personas-Credito-hipotecario.jpg?w=300&h=200&mode=crop','Crédito hipotecario','Tener casa propia es una de las decisiones más importantes de tu vida. Tómala.');
INSERT INTO credito (COD_CREDITO,IMG_CREDITO,NOMBRE_CREDITO ,DESCRIPCION_CREDITO) VALUES (4,'https://www.pichincha.com/portal/Portals/0/adam/Submenu/3tobtfSKDEOKEYsY8G2F1A/Icon/Personas-Credito-vehicular.jpg?w=300&h=200&mode=crop','Crédito Vehicular', 'Conduce tu vida sobre ruedas. Elige el vehículo que se ajusta a tus necesidades.');
INSERT INTO credito (COD_CREDITO,IMG_CREDITO,NOMBRE_CREDITO ,DESCRIPCION_CREDITO) VALUES (5,'https://www.pichincha.com/portal/Portals/0/adam/Submenu/CcBeElZVJkO_ut4A8pablQ/Icon/Personas-Credito-de-linea-abierta.jpg?w=300&h=200&mode=crop','Linea Abierta', 'Nos interesa tu crecimiento, completa aquel proyecto personal que tienes en mente.');
INSERT INTO credito (COD_CREDITO,IMG_CREDITO,NOMBRE_CREDITO ,DESCRIPCION_CREDITO) VALUES (6,'https://www.pichincha.com/portal/Portals/0/adam/Submenu/O2fQdJeEiEOjEG-OqEynzg/Icon/Personas-Credito-multiproposito.jpg?w=300&h=200&mode=crop','Crédito Multipropósito','Llegó el momento de hacer realidad tus propósitos. Todos tenemos algo pendiente por cumplir.');


INSERT INTO agencia (COD_AGENCIA, NOMBRE_AGENCIA, DIRECCION_AGENCIA, TELEFONO_AGENCIA,LAT_AGENCIA, LONG_AGENCIA)  VALUES(1,'Ag. Zarate','AV GRAN CHIMU 437 - 439','265-6654','-6.8019846','-79.8469525');
INSERT INTO agencia (COD_AGENCIA, NOMBRE_AGENCIA, DIRECCION_AGENCIA, TELEFONO_AGENCIA,LAT_AGENCIA, LONG_AGENCIA)  VALUES(2,'Ag. Fiori','AV. ALFREDO MENDIOLA 1998 - LOCAL 3 ESQ. TOMAS VALLE','245-1654','-11.9831069','-77.0646921');
INSERT INTO agencia (COD_AGENCIA, NOMBRE_AGENCIA, DIRECCION_AGENCIA, TELEFONO_AGENCIA,LAT_AGENCIA, LONG_AGENCIA)  VALUES(3,'Ag. La Molina','AV. RAUL FERRERO Nº1139','265-6354','-12.0939127','-76.9663171');
INSERT INTO agencia (COD_AGENCIA, NOMBRE_AGENCIA, DIRECCION_AGENCIA, TELEFONO_AGENCIA,LAT_AGENCIA, LONG_AGENCIA)  VALUES(4,'Ag. San Miguel','AV. LA MARINA 2281 - SAN MIGUEL','252-3351','-12.0768298','-77.0824769');



INSERT INTO DETALLE_CREDITO(ID,BENEFICIOS,COD_CREDITO,REQUISITOS) VALUES (1,'Tasa preferencial del 9%.
Período de gracia hasta 6 meses, una vez terminado tus estudios.
Adicional, financia tu manutención hasta USD 15.000 para carreras de Postgrado y hasta USD 20.000 para carreras de Pregrado (solo en el exterior).',1,'Financia hasta  USD. 25.000.
Selecciona el día de pago de tu preferencia.
Realiza pagos parciales o totales por adelantado sin recargos.');

INSERT INTO DETALLE_CREDITO(ID,BENEFICIOS,COD_CREDITO,REQUISITOS) VALUES (2,'Monto mínimo USD. 3.000, máximo USD. 300.000.
Tasa vigente según tarifario.*
Financiamiento hasta el 70% del valor comercial del bien, en compra de vivienda nueva.',2,'Ahorras en el pago de servicios como agua y luz.
Recibes tres meses de gracia.
Generas menor impacto ambiental.');

INSERT INTO DETALLE_CREDITO(ID,BENEFICIOS,COD_CREDITO,REQUISITOS) VALUES (3,'Monto mínimo USD. 3.000, máximo USD. 300.000.
Financiamiento hasta el 70% del valor del bien.',3,'Financia hasta USD. 300.000 o el 70% del avalúo del bien.
Recibe tres meses de gracia para capital e interés.
Selecciona el día de pago de tu preferencia.');

INSERT INTO DETALLE_CREDITO(ID,BENEFICIOS,COD_CREDITO,REQUISITOS) VALUES (4,'Plazo hasta 60 meses. 
Vehículos livianos de uso particular, comercial o taxis.
Condiciones especiales para vehículos ecológicos.',4,'Financiamiento de vehículo y accesorios.
Crédito complementario para cubrir gastos administrativos, dispositivo satelital, entre otros.');

INSERT INTO DETALLE_CREDITO(ID,BENEFICIOS,COD_CREDITO,REQUISITOS) VALUES (5,'Monto mínimo USD. 3.000, máximo USD. 150.000.
Plazo de 3 a 7 años.',5,'Financia hasta USD. 150.000 sin exceder el 70% del valor comercial del inmueble hipotecado.
Selecciona el día de pago de tu preferencia.
Realiza pagos parciales o totales por adelantado sin recargos');

INSERT INTO DETALLE_CREDITO(ID,BENEFICIOS,COD_CREDITO,REQUISITOS) VALUES (6,'Monto mínimo USD. 600, máximo USD. 25.000. 
Plazo de 3 a 36 meses. Tasa de interés según tarifario. 
Ver tarifario Cuota mensual se debita de tu cuenta.',6,'Financia hasta  USD. 25.000.
Selecciona el día de pago de tu preferencia.
Realiza pagos parciales o totales por adelantado sin recargos.');
