import axios from 'axios';

export default {
  data (){
      return {
          msg: 'Hola, mi nombre es msg y me encuentro en Courses.js!',
          info: null
        }
      },
      mounted () {
        axios
          .get('http://localhost:8080/courses')
          .then(response => (this.info = response))
          .catch(e => {
            this.errors.push(e)
          })
      }
}