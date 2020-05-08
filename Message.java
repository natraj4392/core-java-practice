
class Natraj {
    void SentMsg() {
        System.out.println("ILU");
    }
}
class Whatsapp {
    static void DeliveredMsg(Natraj M2) {
        M2.SentMsg();
    }
}
class Instagram {
    static void DeliveredMsg(Natraj M3) {
        M3.SentMsg();
    }
}
class Message {
	public static void main(String[] args) {
        Natraj M1 = new Natraj();
        Whatsapp.DeliveredMsg(M1);
        Instagram.DeliveredMsg(M1);

    }
}