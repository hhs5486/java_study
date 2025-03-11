import java.util.stream.Stream;

public class text {
  public static void main(String[] args) {
    Stream.of("a1","a2","a3").map(s -> s.substring(1)).mapToInt(Integer::parseInt).max().ifPresent(System.out::println);
    Stream.of("갈매기","나비","다람쥐","라마").filter(s->s.length()==2).forEach(System.out::println);
    Stream<String> stream=Stream.of("서울","워싱턴","베이징","파리","마드리드","런던").sorted();
    System.out.println(stream.findFirst());
  }
}
