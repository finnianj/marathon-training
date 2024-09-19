package online.finnianj.marathon_training.user;

public record Address(
    String street, 
    String suite, 
    String city, 
    String zipcode, 
    Geo geo
) {
}
