-- 1 Teste -->

SELECT Nome,Ano FROM Filmes

-- 2 Teste -->

SELECT Nome,Ano FROM Filmes ORDER BY Ano

-- 3 Teste -->

SELECT Nome,Ano,Duracao FROM Filmes WHERE Nome = 'de volta para o futuro'

-- 4 Teste -->

SELECT Nome,Ano,Duracao FROM Filmes WHERE Ano = 1997

-- 5 Teste -->

SELECT Nome,Ano,Duracao FROM Filmes WHERE Ano > 2000

-- 6 Teste -->

SELECT Nome,Ano,Duracao FROM Filmes WHERE Duracao > 100 AND Duracao < 150 ORDER BY Duracao

-- 7 Teste -->

SELECT Ano, COUNT(*)  Quantidade FROM Filmes GROUP BY Ano ORDER BY  Quantidade DESC

-- 8 Teste -->

SELECT * FROM Atores WHERE Genero = 'M'

-- 9 Teste -->

SELECT * FROM Atores WHERE Genero = 'F' ORDER BY PrimeiroNome

-- 10 Teste -->

SELECT Filmes.Nome, Generos.Genero FROM Filmes JOIN FilmesGenero ON Filmes.Id = FilmesGenero.IdFilme JOIN Generos ON Generos.Id = FilmesGenero.IdGenero

-- 11 Teste -->

SELECT Filmes.Nome, Generos.Genero FROM Filmes JOIN FilmesGenero ON Filmes.Id = FilmesGenero.IdFilme JOIN Generos ON Generos.Id = FilmesGenero.IdGenero WHERE Generos.Genero = 'Mistério'

-- 12 Teste -->

SELECT Filmes.Nome, Atores.PrimeiroNome,Atores.UltimoNome,ElencoFilme.Papel FROM Filmes JOIN ElencoFilme ON Filmes.Id = ElencoFilme.IdFilme 
JOIN Atores ON Atores.Id = ElencoFilme.IdAtor