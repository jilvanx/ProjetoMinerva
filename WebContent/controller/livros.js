var livroModulo = angular.module('livroModulo', []);

livroModulo.controller("livrosController", function($scope, $http){
	
	urlLivro = 'http://localhost:8080/ProjetoMinerva/rest/livros';
	
	$scope.listarLivros = function() {
		
		$http.get(urlLivro).success(function (livros){
			
			$scope.livros = livros;
			
		}).error(function (erro){
			alert(erro);
		});
			
	}
	
	$scope.selecionaLivro = function(livroSelecionado){
		$scope.livro = livroSelecionado;
	}

	$scope.limparCampos = function(){
		$scope.livro = null;
	}
	
	$scope.salvar = function(){
		
		if ($scope.livro.codigo == undefined){
			
			$http.post(urlLivro, $scope.livro).success(function(livro){
				
				//$scope.livros.push($scope.livro);
				$scope.listarLivros();
				$scope.limparCampos();
				
			}).error(function (erro){
				alert(erro);
			});
			
		} else {
			$http.put(urlLivro, $scope.livro).success(function(livro){
				
				$scope.listarLivros();
				$scope.limparCampos();
				
			}).error(function (erro){
				alert(erro);
			});
		}
		
		$scope.limparCampos();
	}

	$scope.excluir = function(){
		if ($scope.livro.codigo == undefined){
			
			alert("Favor selecionar um livro para excluir!");
			
		}else{
			
			$http.delete(urlLivro + '/' + $scope.livro.codigo).success(function(){
				$scope.listarLivros();
				$scope.limparCampos();
			}).error(function (erro){
				alert(erro);
			});
			
		}
	}
	
	
	$scope.listarLivros();
	
});