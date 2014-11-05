import org.example.Book

class BootStrap {

    def init = { servletContext ->
        if (!Book.count()){
            new Book(title: "l'alchimiste", author: "Paulo Cohelo").save(failOnError: true)
            new Book(title: "les desorientes", author: "Amina Malouf").save(failOnError: true)
        }
    }
    def destroy = {
    }
}
