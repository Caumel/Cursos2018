<template>
    <div>
        <div>
            <h1>Catálogo de cursos</h1>
        </div>
        <table id="table">
            <thead>
                <tr>
                    <th v-for="column in columns" v-bind:key="column" v-on:click="sort(column)">{{column}}
                        <div class="arrow" v-if="currentSort==column" v-bind:class="currentSortDir=='asc' ? 'arrow_up' : 'arrow_down'">
                        </div></th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <tr v-for="course in sortedCourses" v-if="course.active" v-bind:key="course.id" v-bind:title="course.title" v-bind:level="course.level" v-bind:hours="course.hours">
                    <th> {{ course.id }} </th>
                    <th> {{ course.title }} </th>
                    <th> {{ course.level }} </th>
                    <th> {{ course.hours }} </th>
                    <button id="deleteButton" v-on:click="deleteCourse(course.id)">X</button>
                </tr>
            </tbody>
        </table>
        <div id="gbuttons">
            <button v-on:click="firstPage">&#60; &#60;</button> 
            <button v-on:click="prevPage">&#60;</button>
            <button id="button" v-on:click="goTo(page)" v-for="page in pages" v-bind:key="page">{{page}}</button>
            <button v-on:click="nextPage">&#62;</button> 
            <button v-on:click="lastPage">&#62; &#62;</button>
        </div>
        <button id="newCurse"> Nuevo curso </button>  
    </div> 
</template>

<script src="./Courses.js"></script>
<style src="./Courses.css"></style>






