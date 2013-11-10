/*global angular*/
/*jshint indent: 2, undef: true, unused: true, strict: true, trailing: true, camelcase: true, eqeqeq: true, immed: true, white: true, quotmark: single, curly: true */
'use strict';
var dbg;
angular.module('tilosApp')
  .directive('activeLink', ['$location', function (location) {
  return {
    restrict: 'A',
    link: function (scope, element, attrs) {
      var clazz = attrs.activeLink;

      //TODO it shoud be more error prone
      var path = element.children()[0].href;
      path = path.substring(1 + path.indexOf('#'));
      if (path.charAt(0) !== '/') {
        path = '/' + path;
      }

      scope.location = location;
      scope.$watch('location.path()', function (newPath) {
        dbg = element;
        if (path === newPath) {
          element.addClass(clazz);
        } else {
          element.removeClass(clazz);
        }
      });

    }
  };
}]);