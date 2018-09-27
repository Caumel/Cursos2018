<template>
    <div id="app">
        <form id="app">

            <p>
                <label id="active" for="checkbox">Activo</label>
                <input type="checkbox" id="active" v-model="active">
            </p>

            <p>
            <label id="teacher" for="selected" >Profesor</label>
            <select v-model="selected">
                <option disabled value="">Please select one teacher</option>
                <option v-for="teacher in teachers" v-bind:key="teacher.id" v-bind:value="teacher.id" > {{teacher.name}}</option>
            </select>
            </p>

            <p>
                <label for="title">Titulo</label>
                <input type="text" name="title" id="title" v-model="title">
            </p>

            <p>
            <label id="teacher" for="level" >Nivel</label>
            <select v-model="level">
                <option disabled value="">Please select the level</option>
                <option>Básico</option>
                <option>Intermedio</option>
                <option>Avanzado</option>
            </select>
            </p>
             <p>
                <label for="hours">Horas</label>
                <input type="number" name="hours" id="hours" v-model="hours">
            </p>
            <p>
                <input v-on:click="postCourse()" type="button" value="Añadir curso">  
            </p>
            {{active}}
            {{selected}}
            {{title}}
            {{hours}}
            {{level}}
        </form>
    </div>
</template>
<script src="./addCourse.js"></script>
<style src="./addCourse.css" scoped></style>