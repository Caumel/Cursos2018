import axios from 'axios';
export default{
  data (){
      return {
        teachers:[],
        errors:[],
        message: 'Soy el formulario!',
        active: false,
        idTeacher : null,
        title : null,
        hours : null,
        level : null,
        selected:''
      }
  },
  mounted () {
    axios
      .get('http://localhost:8090/teachers')
      .then(response => this.teachers = response.data)
      .catch(e => {
        this.errors.push(e)
      })
  },
  methods:{
    postCourse:function(){
      axios.post(`http://localhost:8090/courses`, {
        id:1,
        active:this.active,
        idTeacher:this.selected,
        title:this.title,
        hours:this.hours,
        level:this.level
      })
      .then(() => {
        location.reload();
      })
      .catch(e => {
        this.errors.push(e)
      })
    }
  }
}