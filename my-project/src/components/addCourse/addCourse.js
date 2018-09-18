
export default{
  data (){
      return {
        errors:[],
        message: 'Soy el formulario!',
        active: null,
        idTeacher = null,
        title = null,
        hours = null,
        level = null,
      }
  },
  methods(){
    checkForm:function(e) {
      if(this.active && this.title) return true;
      this.errors = [];
      if(!this.active) this.errors.push("Check required.");
      if(!this.title) this.errors.push("Title required.");
      e.preventDefault();
    }
  }
}