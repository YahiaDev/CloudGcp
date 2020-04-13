<template>
  <div class="home">
    <img alt="Vue logo" src="../assets/logo.png">
    <HelloWorld msg="Book App"/>
    <books></books>
  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'
import books from '@/components/books'

export default {
  name: 'Home',
  components: {
    HelloWorld,
    books
  }
}
</script>
