var app = angular.module('myApp', []);

app.controller('myCtrl', function($scope, $http) {
	
	$scope.variavequalquer = new Object();

	$scope.salvar = function() {
		$http.post("http://localhost:8080/pagina/post1", {
			'id' : $scope.id,
			'nome' : $scope.nome,
			'categorias' : $scope.categorias,
			'data' : $scope.data

		})
	};

	$scope.qualquerPalavraBusca = function() {
		$http.get("http://localhost:8080/pagina/getAll1").then(function(resposta) {
			$scope.manutencoes = resposta.data;
		});
	}
	$scope.qualquerPalavraBusca();
	
	 $scope.delete = function(){
 $http.delete("http://localhost:8080/pagina/delete/"+$scope.id);
		  }

	$scope.BATISMONOME = function() {
		$http.put("http://localhost:8080/pagina/put1/ " + $scope.id, {

			'nome' : $scope.nome,
			'categorias' : $scope.categorias
			})
	}
}); 
	
	
	
	
	
	
	

// jquery
// angular $ função salvar postar

