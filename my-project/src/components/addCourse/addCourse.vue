<template>
    <div id="app">
        {{ message }}
        <form id="app" @submit="checkForm" action="/something" method="post">
            <p v-if="errors.length">
                <b>Please correct the following error(s):</b>
                <ul>
                <li v-for="error in errors" v-bind:key="error">{{ error }}</li>
                </ul>
            </p>
            
            <p>
                <label for="title">Titulo<label>
                <input type="text" name="title" id="title" v-model="title">
            </p>
            <p>
                <input type="checkbox" id="active" v-model="active">
                <label for="checkbox">Activo</label>
            </p>
            <p>
                <input type="submit" value="Submit">  
            </p>

        </form>
    </div>
</template>
<script src="./addCourse.js"></script>
<style src="./addCourse.css" scoped></style>