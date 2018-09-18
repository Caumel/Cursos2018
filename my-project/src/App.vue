<template>
  <div id="app">
    <Courses/>
    <addCourse/>
  </div>
</template>

<script>
import addCourse from './components/addCourse/addCourse.vue'
import Courses from './components/Courses/Courses.vue'
export default {
  name: 'app',
  components: {
    addCourse,
    Courses
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
