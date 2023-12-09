import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from './product.class';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {

  private static productslist: Product[] = null;
    constructor(private http: HttpClient) { }


    getProducts(): Observable<Product[]> {
      const products = 'http://localhost:8082/get';
        return this.http.get<Product[]>(products);
    }

    create(prod: Product): Observable<Product[]> {
      const createProd = 'http://localhost:8082/add';
      return this.http.post<Product[]>(createProd, prod);
    }

    update(prod: Product): Observable<Product[]>{
      const updateProd = `http://localhost:8082/update/${prod.id}`;
      return this.http.patch<Product[]>(updateProd, prod);
    }


    delete(id: number): Observable<Product[]>{
      const deleteProd = `http://localhost:8082/delete/${id}`;
      return this.http.delete<Product[]>(deleteProd);
    }
}
