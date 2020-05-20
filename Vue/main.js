Vue.component('product-component',{
    props:['product'],
    computed: {

    },
    methods:{
        getBids(product){

        },
        getDescription: function(product){
            return (product.productDescription).split(";")
        }

    },
    template:`
        <div>
            <h3>{{ product.productName }}</h3>
            <ul>
                <li>Product ID : {{product.productId}}</li>
                <li v-for ="line in getDescription(product) ">{{line}}</li>
            </ul>
            <button v-on:click="getBids(product)">getBids</button>
        </div>
    `
});


var app=new Vue({
    el: "#app",
    data: {
        hello: "hello ankit",
        products: [],

        products: 

    },

    methods: {
        
    },

    mounted(){
        fetch("http://localhost:8095/products")
        .then(response => response.json())
        .then((data) => {
          this.products = data;
        })
    },

/*
    template:`
        <div> 
            <p> {{ hello }}</p>
        </div>
    `
*/

    template:`
        <div>
            <product-component v-for = "item in products" v-bind:product = "item" />
        </div>
    `

})