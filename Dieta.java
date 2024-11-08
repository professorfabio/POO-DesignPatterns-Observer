public class Dieta extends Observable {
       private List observers = new ArrayList();
       private double peso;
 
       public Dieta(double peso) {
            this.peso = peso;
       }
 
       public void setPeso(double peso) {
           this.peso = peso;
           // Quando a alteração do peso ocorre notifica os observadores.
           this.notifyObservers();
       }
        public void registerObserver(Observer observer) {
            observers.add(observer);
       }
        public void removeObserver(Observer observer) {
            observers.remove(observer);
       }
        public void notifyObservers() {
            // Chama o método de atualização dos observers disponíveis.
            for (Observer ob : observers) {
            System.out.println("Notificando observers!");
              ob.update(this.peso);
            }
       }
}


