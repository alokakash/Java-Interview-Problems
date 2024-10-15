import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Removeduplicate {

    public List<Integer> remove(List<Integer> list) {
        return list.stream().distinct().collect(Collectors.toList());
    }

    public List<Integer> removeElementUsingSet(List<Integer> list) {
        List<Integer> lst = new ArrayList<>();

        lst.addAll(
                list.stream().collect(Collectors.toSet()));

        return lst;

    }
}
