
import axios from 'axios'

export default {
  name: 'books',
  components: {},
  props: [],
  data () {
    return {
      book: { title: '', description: '' },
      books: []
    }
  },
  computed: {

  },
  mounted () {
    console.log(process.env.VUE_APP_ROOT_API)
    axios.get(process.env.VUE_APP_ROOT_API + '/api/book/books').then(response => {
      this.books = response.data
    })
  },
  methods: {
    addBook () {
      axios.post(process.env.VUE_APP_ROOT_API + '/api/book/add', this.book).then(response => {
        this.books = response.data
        this.book = { title: '', description: '' }
      })
    }
  }
}
