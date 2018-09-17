<template>
    <div>
        <div>
            <h1>Catálogo de cursos</h1>
        </div>
        <table id="table">
            <thead>
                <tr>
                    <th v-on:click="sort(columnas[0])">{{columnas[0]}}</th>
                    <th v-on:click="sort(columnas[1])">{{columnas[1]}}</th>
                    <th v-on:click="sort(columnas[2])">{{columnas[2]}}</th>
                    <th v-on:click="sort(columnas[3])">{{columnas[3]}}</th>
                </tr>
            </thead>
            <tbody>
                <tr v-for="course in sortedCourses" v-bind:key="course.id" v-bind:title="course.title" v-bind:level="course.level" v-bind:hours="course.hours" v-if="course.active">
                    <th> {{ course.id }} </th>
                    <th> {{ course.title }} </th>
                    <th> {{ course.level }} </th>
                    <th> {{ course.hours }} </th>
                </tr>
            </tbody>
        </table>
        <button v-on:click="firstPage">&#60; &#60;</button> 
        <button v-on:click="prevPage">&#60;</button>
        <button id="red" v-on:click="goTo(point)" v-for="point in points" v-bind:key="point">{{point}}</button>
        <button v-on:click="nextPage">&#62;</button> 
        <button v-on:click="lastPage">&#62; &#62;</button>  
    </div> 
</template>
<script src="./Courses.js"></script>
<style src="./Courses.css"></style>







