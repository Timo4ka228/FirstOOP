class Phone {
    int price;
    int mass;
    String name;

    public Phone (int price, int countPhones, int mass, String name){
        this.price = price;
        this.mass = mass;
        this.name = name;
    }
}
class Store {
    Phone [] phones;
    public Store (){
        phones = new Phone[0];
    }
    public void addPhones (Phone [] p) {
        Phone [] newPhones = new Phone [phones.length + p.length];
        for (int i = 0; i < phones.length; i++) {
            newPhones[i] = phones[i];
        }
        for (int i = 0; i < p.length; i++) {
            newPhones[i + phones.length] = p[i];
        }
        phones = newPhones;
    }
    public void massOfPhones (Phone [] phones) {
        int mass = 0;
        for (int i = 0; i < phones.length; i++) {
            mass = phones[i].mass + mass;
        }
        System.out.println(mass);
    }
    public void addPhone (Phone phone) {
        Phone [] newPhones = new Phone [phones.length + 1];
        for (int i = 0; i < phones.length; i++) {
            newPhones[i] = phones[i];
        }
        newPhones[phones.length] = phone;
        phones = newPhones;
    }
}
public class ClassesDone {
    public static void main(String[] args) {

        Phone [] arrayOfPhones = new Phone[10];
        for (int i = 0; i < arrayOfPhones.length; i++) {
            arrayOfPhones[i] = new Phone(100 * i, i, 300, "IPhone " + i);
        }
        Store appStore = new Store();
        Phone newPhone = new Phone(100,1,300,"Iphone 10");
        appStore.addPhone(newPhone);
        for (int i = 0; i < appStore.phones.length; i++) {
            System.out.println(appStore.phones[i].name);
        }
        appStore.addPhones(arrayOfPhones);
        for (int i = 0; i < appStore.phones.length; i++) {
            System.out.println(appStore.phones[i].name);
        }
        appStore.massOfPhones(arrayOfPhones);
//        Phone newPhone = new Phone(100,1,300,"Iphone 10");
//        appStore.addPhone(newPhone);
//        for (int i = 0; i < appStore.phones.length; i++) {
//            System.out.println(appStore.phones[i].name);
//        }

    }
}
