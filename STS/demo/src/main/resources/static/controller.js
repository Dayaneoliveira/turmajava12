var app = angular.module('myApp', []);

app.controller('myCtrl', function($scope, $http) {
	
	$scope.manutencoes = new Object();

	$scope.salvar = function() {
		$http.post("http://localhost:8080/pagina/post1", {
			'id' : $scope.id,
			'nome' : $scope.nome,
			'categorias' : $scope.categorias,
			'data' : $scope.data

		})
	};
	$scope.buscarTodos = function() {
		$http.get("http://localhost:8080/pagina/getAll1").then(function(resposta) {
			$scope.manutencoes = resposta.data;
		});
	}
	$scope.buscarTodos();


});

//jquery 
//angula $ funcao salvar postar 