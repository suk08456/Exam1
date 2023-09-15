public class Exam3 {
    public static void main(String[] args) {

        청둥오리 a청둥오리 = new 청둥오리(); // 청둥오리가 만들어집니다. 청둥오리는 기본 날개를 가지고 태어납니다.

        a청둥오리.날다(); // 청둥오리가 날개로 천천히 날아갑니다.

        흰오리 a흰오리 = new 흰오리(); // 흰오리가 만들어집니다. 청둥오리는 불사조 날개를 가지고 태어납니다.

        a흰오리.날다(); // 흰오리가 불사조 날개로 불타오르며 날아갑니다.

        붉은오리 a붉은오리 = new 붉은오리(); // 붉은오리가 만들어집니다. 붉은오리는 로켓 날개를 가지고 태어납니다.

        a붉은오리.날다(); // 붉은오리가 로켓날개로 놀라운 속도로 굉음을 내며 날아갑니다

    }
}

class 오리 {
    String 오리이름;
    날개 a날개아이템;

    void 날다() {
        System.out.print(오리이름);
        a날개아이템.사용();
    }

    void birth() {
        System.out.println(오리이름 + "가 만들어집니다. " + 오리이름 + "는 " + a날개아이템.날개이름 + "를 가지고 태어납니다.");
    }
}

class 청둥오리 extends 오리 {
    청둥오리() {
        오리이름 = "청둥오리";
        a날개아이템 = new 기본날개();
        birth();
    }
}

class 흰오리 extends 오리 {
    흰오리() {
        오리이름 = "흰오리";
        a날개아이템 = new 불사조날개();
        birth();
    }
}

class 붉은오리 extends 오리 {
    붉은오리() {
        오리이름 = "붉은오리";
        a날개아이템 = new 로켓날개();
        birth();
    }
}

class 날개 {
    String 날개이름;
    String 날기모션;

    void 사용() {
        System.out.println("가 " + 날개이름 + "로 " + 날기모션 + " 날아갑니다.");
    }
}

class 기본날개 extends 날개 {
    기본날개() {
        날개이름 = "기본날개";
        날기모션 = "천천히";
    }
}

class 불사조날개 extends 날개 {
    불사조날개() {
        날개이름 = "불사조날개";
        날기모션 = "불타오르며";
    }
}

class 로켓날개 extends 날개 {
    로켓날개() {
        날개이름 = "로켓날개";
        날기모션 = "놀라운 속도로 굉음을 내며";
    }
}