import java.util.*;
import java.util.stream.*;
class Demo{
    public static void main(String[] args){
        List<Integer> num = Arrays.asList(1,2,3,4,5,6);
        List<Integer> even = num.stream()
                                .filter(n->n%2==0)
                                .collect(Collectors.toList());

        System.out.println(even);                         
    }
}
