var app = angular.module('myApp', []);

app.controller('myCtrl', function($scope, $http) {
	
	$scope.manutencoes = new Object();

	$scope.salvar = function() {
		$http.post("http://localhost:8080/pagina/manutencoes", {
			'id' : $scope.id,
			'nome' : $scope.nome,
			'categorias' : $scope.categorias,
			'data' : $scope.data

		})
	};

});

//jquery 
//angula $ funcao salvar postar 