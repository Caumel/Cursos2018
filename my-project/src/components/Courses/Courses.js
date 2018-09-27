import axios from 'axios';
export default {
  data (){
      return {
          courses: [],
          columns:['id','title','level','hours'],
          currentSort:'title',
          currentSortDir:'asc',
          pageSize:4,
          currentPage:1,
          //points:[],
          pages: 0
      }
  },
  mounted () {
    axios
      .get('http://localhost:8090/courses')
      .then(response => {
        this.courses = response.data
        if (this.courses.length % this.pageSize > 0) this.pages = Math.trunc(this.courses.length/this.pageSize)+1;
        else this.pages = this.courses.length/this.pageSize;
        //this.points = this.getPointsFromPageNumber(number);
      }
        
        )
      .catch(e => {
        this.errors.push(e)
      })
  },
  methods:{
    sort:function(s) {
      if(s === this.currentSort) {
        this.currentSortDir = this.currentSortDir==='asc'?'desc':'asc';
      }
      this.currentSort = s;
    },
    nextPage:function() {
      if((this.currentPage*this.pageSize) < this.courses.length) this.currentPage++;
    },
    prevPage:function() {
      if(this.currentPage > 1) this.currentPage--;
    },
    firstPage:function() {
      this.currentPage = 1;
    },
    lastPage:function() {
      if (this.courses.length%this.pageSize > 0) this.currentPage = Math.trunc(this.courses.length/this.pageSize)+1
      else this.currentPage = this.courses.length/this.pageSize;
    },
    goTo:function(n) {
      this.currentPage = n
    },
    /*getPointsFromPageNumber(pageNumber){
      const points = new Array();
      for(let i = 0; i < pageNumber; i++){
        points.push((i + 1).toString());
      }
      return points;
    }*/
  },
    computed:{
      sortedCourses:function() {
        return this.courses.sort((a,b) => {
          let modifier = 1;
          if(this.currentSortDir === 'desc') modifier = -1;
          if(a[this.currentSort] < b[this.currentSort]) return -1 * modifier;
          if(a[this.currentSort] > b[this.currentSort]) return 1 * modifier;
          return 0;
        }).filter((row, index) => {
          let start = (this.currentPage-1)*this.pageSize;
          let end = this.currentPage*this.pageSize;
          if(index >= start && index < end) return true;
        });
      }
    }
  }
  