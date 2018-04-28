package main

import (
	"fmt"
	"net/http"
	"log"
	"io"
)


func main() {
	
	fmt.Print("Hello go")

	http.HandleFunc("/",sayHello)

	err := http.ListenAndServe(":8080",nil)
	if err!=nil{
		log.Fatal(err)
	}
}

func sayHello(w http.ResponseWriter, r *http.Request){
	io.WriteString(w,"hello web")
}