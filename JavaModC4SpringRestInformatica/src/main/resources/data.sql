DROP TABLE IF EXISTS fabricantes;
DROP TABLE IF EXISTS articulos;

CREATE TABLE IF NOT EXISTS fabricantes (
						codigo INT AUTO_INCREMENT,
						nombre VARCHAR(100) DEFAULT NULL,
						PRIMARY KEY(codigo)
						);
                        
CREATE TABLE IF NOT EXISTS articulos (
						codigo INT AUTO_INCREMENT,
						nombre VARCHAR(100) DEFAULT NULL,
						precio INT DEFAULT NULL,
						fabricante INT DEFAULT NULL,
						PRIMARY KEY(codigo),
						FOREIGN KEY (fabricante) REFERENCES fabricantes (codigo)
						ON DELETE CASCADE ON UPDATE CASCADE
						);
                        

INSERT INTO fabricantes (nombre) VALUES ('Tornillos SL');
INSERT INTO fabricantes (nombre) VALUES ('Herramientas SL');
INSERT INTO fabricantes (nombre) VALUES ('Martillos SL');
INSERT INTO fabricantes (nombre) VALUES ('Taladros SL');
INSERT INTO fabricantes (nombre) VALUES ('Electricidad SL');

INSERT INTO articulos (nombre, precio, fabricante) VALUES ('Tornillos', 2, 1);
INSERT INTO articulos (nombre, precio, fabricante) VALUES ('Martillos', 10, 1);
INSERT INTO articulos (nombre, precio, fabricante) VALUES ('Tornavis', 20, 1);

INSERT INTO articulos (nombre, precio, fabricante) VALUES ('Tornillos', 200, 2);
INSERT INTO articulos (nombre, precio, fabricante) VALUES ('Martillos', 1000, 2);
INSERT INTO articulos (nombre, precio, fabricante) VALUES ('Tornavis', 2000, 2);

INSERT INTO articulos (nombre, precio, fabricante) VALUES ('Tornillos', 2, 3);
INSERT INTO articulos (nombre, precio, fabricante) VALUES ('Martillos', 1, 3);
INSERT INTO articulos (nombre, precio, fabricante) VALUES ('Tornavis', 2, 3);

INSERT INTO articulos (nombre, precio, fabricante) VALUES ('Tornillos', 10, 4);
INSERT INTO articulos (nombre, precio, fabricante) VALUES ('Martillos', 50, 4);
INSERT INTO articulos (nombre, precio, fabricante) VALUES ('Tornavis', 100, 4);

INSERT INTO articulos (nombre, precio, fabricante) VALUES ('Tornillos', 20, 5);
INSERT INTO articulos (nombre, precio, fabricante) VALUES ('Martillos', 100, 5);
INSERT INTO articulos (nombre, precio, fabricante) VALUES ('Tornavis', 200, 5);