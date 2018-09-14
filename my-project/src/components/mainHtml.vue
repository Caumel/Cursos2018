<template>
  <div class="hello">
    <courses/>
  </div>
</template>

<script>
import courses from './Courses/Courses.vue'
export default {
  name: 'app',
  components: {
    courses
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
