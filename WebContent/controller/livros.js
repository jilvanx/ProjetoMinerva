var livroModulo = angular.module('livroModulo', []);

livroModulo.controller("livrosController", function($scope, $http){
	
	urlLivro = 'http://localhost:8080/Projeto2HttpJaxRS/rest/livros';
	
	$scope.listarLivros = function() {
		
//		$http.get(urlLivro).then(function (livros){
//			
//			$scope.livros = livros;
//			
//		}).error(function (erro){
//			alert(erro);
//		});
		
		$http.get(urlLivro).then(successCallback, errorCallback);

		function successCallback(livros){
			$scope.livros = livros;
		}
		function errorCallback(error){
			alert(erro);
		}		
	}
	
	$scope.listarLivros();
	
});