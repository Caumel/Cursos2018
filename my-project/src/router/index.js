import Vue from 'vue';
import Router from 'vue-router';
//import Courses from '@/components/Courses/Courses.vue';
import AddCourse from '@/components/addCourse/addCourse.vue';

Vue.use(Router);

export default new Router({
    routes:[
        { path: '/addCourse', component: AddCourse }
        //{ path: '/home', component: Courses }
    ]
}); 