/**
 * 
 */

$(document).ready(function(){
	init();
});

function init() {
	$.get("/", function(data, status){
		var html ="<tbody>";
		for (var i = 0; i < data.length; i++) {
		    var o = data[i];
		    html += "<td>" + o.id + "</td>" +
		    "<td>" + o.name + "</td>" +
		    "<td>" + o.age + "</td>" +
		    "<td>" + o.location + "</td>" +
		    "<td>" + o.userType + "</td>";
		}
		html += "</tbody>";
		$(".table").html(html);
    });
}