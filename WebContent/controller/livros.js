var livroModulo = angular.module('livroModulo', []);

livroModulo.controller("livrosController", function($scope, $http){
	
	urlLivro = 'http://localhost:8080/ProjetoMinerva/rest/livros';
	
	$scope.listarLivros = function() {
		
	     $http.get(urlLivro).then(successCallback, errorCallback);
	     function successCallback(response){
	    	 $scope.livros = response.data;
	     }
	     function errorCallback(error){
	         alert(erro);
	     }	
	     
	}
	
	$scope.selecionaLivro = function(livroSelecionado){
		$scope.livro = livroSelecionado;
	}

	$scope.limparCampos = function(){
		$scope.livro = null;
	}
	
	$scope.salvar = function(){
		
		if ($scope.livro.codigo == undefined){
			
			$http.post(urlLivro, $scope.livro).then(successCallback, errorCallback);
			
			function successCallback(response){
				$scope.livros.push(response.data);
		        $scope.limparCampos();
		        $scope.listarLivros();
			}
			function errorCallback(error){
				alert(erro);
			}
				
		} else {
			
			$http.put(urlLivro, $scope.livro).then(successCallback, errorCallback);
			function successCallback(response){
				$scope.listarLivros();
				$scope.limparCampos();
			}
			function errorCallback(error){
				alert(erro);
			}			 
			
		}
		

	}

	$scope.excluir = function(){
		if ($scope.livro.codigo == undefined){
			
			alert("Favor selecionar um livro para excluir!");
			
		}else{
			
			$http.delete(urlLivro + '/' + $scope.livro.codigo).then(successCallback, errorCallback);
			function successCallback(){
				$scope.listarLivros();
				$scope.limparCampos();
			}
			function errorCallback(error){
				alert(erro);
			}			 
			
		}
	}
	
	
	$scope.listarLivros();
	
});

