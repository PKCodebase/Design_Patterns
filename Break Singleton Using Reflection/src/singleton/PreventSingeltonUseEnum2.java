package singleton;

public class PreventSingeltonUseEnum2 {
    public static void main(String[] args) {
        PreventSingeltonUseEnum instance1 = PreventSingeltonUseEnum.Instance;
        PreventSingeltonUseEnum instance2 = PreventSingeltonUseEnum.Instance;

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
