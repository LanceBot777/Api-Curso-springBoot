INSERT INTO platzi_play_peliculas (titulo, duracion, genero, calificacion, fecha_estreno, estado, director)
VALUES ('Shrek', 90, 'ANIMADA', 4.80, '2024-06-01', 'D', 'Andrew Adamson')
    ON CONFLICT (titulo) DO NOTHING;

INSERT INTO platzi_play_peliculas (titulo, duracion, genero, calificacion, fecha_estreno, estado, director)
VALUES ('Inception', 148, 'CIENCIA_FICCION', 4.80, '2010-07-16', 'D', 'Christopher Nolan')
    ON CONFLICT (titulo) DO NOTHING;

INSERT INTO platzi_play_peliculas (titulo, duracion, genero, calificacion, fecha_estreno, estado, director)
VALUES ('Titanic', 195, 'DRAMA', 4.60, '1997-12-19', 'D', 'James Cameron')
    ON CONFLICT (titulo) DO NOTHING;

INSERT INTO platzi_play_peliculas (titulo, duracion, genero, calificacion, fecha_estreno, estado, director)
VALUES ('John Wick', 101, 'ACCION', 4.50, '2014-10-24', 'D', 'Chad Stahelski')
    ON CONFLICT (titulo) DO NOTHING;

INSERT INTO platzi_play_peliculas (titulo, duracion, genero, calificacion, fecha_estreno, estado, director)
VALUES ('El Conjuro', 112, 'TERROR', 3.00, '2013-07-19', 'D', 'James Wan')
    ON CONFLICT (titulo) DO NOTHING;

INSERT INTO platzi_play_peliculas (titulo, duracion, genero, calificacion, fecha_estreno, estado, director)
VALUES ('Coco', 105, 'ANIMADA', 4.70, '2017-10-27', 'D', 'Lee Unkrich')
    ON CONFLICT (titulo) DO NOTHING;

INSERT INTO platzi_play_peliculas (titulo, duracion, genero, calificacion, fecha_estreno, estado, director)
VALUES ('Interstellar', 169, 'CIENCIA_FICCION', 5.00, '2014-11-07', 'D', 'Christopher Nolan')
    ON CONFLICT (titulo) DO NOTHING;

INSERT INTO platzi_play_peliculas (titulo, duracion, genero, calificacion, fecha_estreno, estado, director)
VALUES ('Joker', 122, 'DRAMA', 4.40, '2019-10-04', 'D', 'Todd Phillips')
    ON CONFLICT (titulo) DO NOTHING;

INSERT INTO platzi_play_peliculas (titulo, duracion, genero, calificacion, fecha_estreno, estado, director)
VALUES ('Toy Story', 81, 'ANIMADA', 4.50, '1995-11-22', 'D', 'John Lasseter')
    ON CONFLICT (titulo) DO NOTHING;

INSERT INTO platzi_play_peliculas (titulo, duracion, genero, calificacion, fecha_estreno, estado, director)
VALUES ('Avengers: Endgame', 181, 'ACCION', 3.90, '2019-04-26', 'D', 'Anthony Russo, Joe Russo')
    ON CONFLICT (titulo) DO NOTHING;