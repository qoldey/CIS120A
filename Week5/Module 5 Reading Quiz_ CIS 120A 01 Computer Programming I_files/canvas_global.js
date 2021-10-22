/*EvaluationKIT START*/var evalkit_jshosted = document.createElement('script');evalkit_jshosted.setAttribute('type', 'text/javascript');evalkit_jshosted.setAttribute('src', 'https://ltcc.evaluationkit.com/canvas/js');document.getElementsByTagName('head')[0].appendChild(evalkit_jshosted);/*EvaluationKIT END*/
////////////////////////////////////////////////////
// DESIGN TOOLS CONFIG                            //
////////////////////////////////////////////////////
// Copyright (C) 2017  Utah State University
var DT_variables = {
        iframeID: '',
        // Path to the hosted USU Design Tools
        path: 'https://designtools.ciditools.com/',
        templateCourse: '3055',
        // OPTIONAL: Button will be hidden from view until launched using shortcut keys
        hideButton: true,
    	 // OPTIONAL: Limit by course format
	     limitByFormat: false, // Change to true to limit by format
	     // adjust the formats as needed. Format must be set for the course and in this array for tools to load
	     formatArray: [
            'online',
            'on-campus',
            'blended'
        ],
        // OPTIONAL: Limit tools loading by users role
        limitByRole: false, // set to true to limit to roles in the roleArray
        // adjust roles as needed
        roleArray: [
            'student',
            'teacher',
            'admin'
        ],
        // OPTIONAL: Limit tools to an array of Canvas user IDs
        limitByUser: false, // Change to true to limit by user
        // add users to array (Canvas user ID not SIS user ID)
        userArray: [
            '1234',
            '987654'
        ]
};

// Run the necessary code when a page loads
$(document).ready(function () {
    'use strict';
    // This runs code that looks at each page and determines what controls to create
    $.getScript(DT_variables.path + 'js/master_controls.js', function () {
        console.log('master_controls.js loaded');
    });
});
////////////////////////////////////////////////////
// END DESIGN TOOLS CONFIG                        //
////////////////////////////////////////////////////
  // Start Pope Tech Accessibility Guide
(function(){function a(a,b){var c=document.createElement("script");c.type="text/javascript",c.readyState?c.onreadystatechange=function(){("loaded"===c.readyState||"complete"===c.readyState)&&(c.onreadystatechange=null,b())}:c.onload=function(){b()},c.src=a,document.getElementsByTagName("head")[0].appendChild(c)}function b(a){return a&&("TeacherEnrollment"===a||"TaEnrollment"===a||"DesignerEnrollment"===a)}var c="username",d="enrollments";if(-1!==window.location.href.indexOf("/login/canvas"))return localStorage.removeItem(`${"pt-instructor-guide"}.${c}`),localStorage.removeItem(`${"pt-instructor-guide"}.${"uuid"}`),localStorage.removeItem(`${"pt-instructor-guide"}.${"settings"}`),void localStorage.removeItem(`${"pt-instructor-guide"}.${d}`);if(-1!==window.location.href.indexOf("?login_success=1"))return localStorage.removeItem(`${"pt-instructor-guide"}.${c}`),void $.get("/api/v1/users/self",function(a){localStorage.setItem(`${"pt-instructor-guide"}.${c}`,a.name)});var e=window.location.pathname;if(-1!==e.indexOf("/edit")||-1!==e.indexOf("/new")||-1!==e.indexOf("/syllabus")||e.match(/\/courses\/[0-9]+\/pages\/?$/)||e.match(/\/courses\/[0-9]+\/?$/)){var f=localStorage.getItem(`${"pt-instructor-guide"}.${d}`);if(null===f)$.get("/api/v1/users/self/enrollments?type[]=DesignerEnrollment&type[]=TaEnrollment&type[]=TeacherEnrollment",function(c){for(var e=0;e<c.length;++e)if(localStorage.setItem(`${"pt-instructor-guide"}.${d}`,JSON.stringify(c)),b(c[e].type)){a("https://canvas-cdn.pope.tech/loader.min.js",function(){});break}});else{f=JSON.parse(f);for(var g=0;g<f.length;++g)if(b(f[g].type)){a("https://canvas-cdn.pope.tech/loader.min.js",function(){});break}}}})();
////////////////////////////////////////////////////
// End Pope Tech Accessibility Guide              //
////////////////////////////////////////////////////