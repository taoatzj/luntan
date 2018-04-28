package main

import (
	"io"
	"net/http"
	"log"
)

type MyHandle struct{}

func main() {
	mux := http.NewServeMux()

	mux.Handle("/",&MyHandle{})
	
	err := http.ListenAndServe(":8080",mux)

	if err!=nil{
		log.Fatal(err)
	}
}


func (*MyHandle) ServeHTTP(w http.ResponseWriter, r *http.Request) {
	io.WriteString(w, "URL"+r.URL.String())
}