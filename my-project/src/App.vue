<template>
  <div id="app">
        <mainHtml/>
  </div>
</template>

<script>
import mainHtml from './components/mainHtml.vue'

export default {
  name: 'app',
  components: {
    mainHtml
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
