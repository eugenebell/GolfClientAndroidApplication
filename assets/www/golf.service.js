function getGolfCourses() {
	$.get('http://golfservice.cloudfoundry.com/golfcourses',
		function(golfcourses) {
			alert("options-->" + options);
			alert("-->" + golfcourses);
			$.each(golfcourses, function() {
				alert("id------>" + this.id);
				alert("name------>" + this.name);
				$("#select-golf-course").addOption(this.id, this.name);
			});						
		}, 'json');
}

