import './App.css'
import {useEffect, useState} from "react";
import ProductList from "./ProductList.jsx";

function App() {

    const [products, setProducts] = useState([]);
    const [categories, setCategories] = useState([]);
    const [selectedCategory, setSelectedCategory] = useState(null);
    const [searchTerm, setSearchTerm] = useState("");
    const [sortOrder, setSortOrder] = useState("asc");


    useEffect(() => {
        fetch("http://localhost:8080/api/products")
            .then(response => response.json())
            .then(data => setProducts(data));

        fetch("http://localhost:8080/api/categories")
            .then(response => response.json())
            .then(data => setProducts(data));

    }, []);

    const handleSearchChange = (event) => {
        setSearchTerm(event.target.value);
    };

    return (
        <div className='container'>
            <h1 className='my-4'>Seeds Catalog</h1>
            <div className='row align-items-center mb-4'>
                <div className='col-md-3 col-sm-12 mb-2'>
                    <p>Category Filter</p>
                </div>
                <div className='col-md-5 col-sm-12 mb-2'>
                    <input
                        type='text'
                        className='form-control'
                        placeholder='Search for products'
                        onChange={handleSearchChange}
                    />
                </div>
            </div>
            <div>
                {products.length ?
                    (<ProductList products={products}/>) :
                    (<p>No Products Found.</p>)}
            </div>
        </div>
    );
}

export default App
