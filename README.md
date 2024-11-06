# SWEN-746 - Design Patterns

**Author:** AJ Barea  
**Course:** SWEN-746 Model-Driven Development  
**Assignment:** Choose any two design patterns and implement them.

## Factory Method Design Pattern

1. **Product**: `Shape.java`
   - Defines the interface for the objects that the factory method creates.
2. **Concrete Product**: `Square.java`
   - Implements the `Shape` interface.
3. **Creator**: `ShapeFactory.java`
   - Abstract class that declares the factory method to return `Product` objects.
4. **Concrete Creator**: `SquareFactory.java`
   - Extends `ShapeFactory` and overrides the factory method to return `Square` objects.

## Singleton Design Pattern

1. **Singleton**: `Singleton.java`
   - Ensures that a class has only one instance and provides a global point of access to it.

## Class Diagram

![Class Diagram](src/assets/class-diagram.png)

## Requirement Diagram

[![Requirement Diagram](https://mermaid.ink/img/pako:eNq1VcFu2zAM_RVCpxZIDuu2iw8DhhYFeigwoLfCF9aiY6225Er02qDIv4-R7DjxnLVBUR9sy-Kj3nukrFdVOE0qU56eOuOpIctXBlcem9zmFuTam4FrLNj5NdwSV07DL2Qmb-E1RW4vozP4Mg6ZXjiDm6atUwKuaJpEUzArC22fq3QeQoUtQeEJ2Tg7ZvMmPGZQu-fx0x_yplw3MVUGxoaWihG0mRNxF7PfWFmuxIKm7C-m7K-oNJYAraQfMM-GK0irBmi9TJydLwCFcXxaDa0QkwDyZ-efImBw8edDYC_vUxlfpzIut3ZGGThAihpDkALIUySsoOxzJjapABRX-wQRT53YBZeRwoT7t-MN1MMSc66QwQxzoa_srkonUGYK_CbZwfJZzt_f4jyg96hLHFkdDgu6bZ7kfBjUuoff4mf4mJ4je3dZOMsoJVv-mO6M03DThnw_eq8TTgQdVCRh031-iyx93MpHpR705DLI3yeU5nj4PuiwN_7Fzrszi93O07wx_4-ft-1dK03lqYVqyDdotJwNsdNzJf_uhnKVyaumEruac5XbjYRix-5ubQuVlVgHWijvulW1G3Wtlm7uj5Xd1xbtvXPjmLQRbrfpOIqn0uYv2Kk2Ug?type=png)](https://mermaid.live/edit#pako:eNq1VcFu2zAM_RVCpxZIDuu2iw8DhhYFeigwoLfCF9aiY6225Er02qDIv4-R7DjxnLVBUR9sy-Kj3nukrFdVOE0qU56eOuOpIctXBlcem9zmFuTam4FrLNj5NdwSV07DL2Qmb-E1RW4vozP4Mg6ZXjiDm6atUwKuaJpEUzArC22fq3QeQoUtQeEJ2Tg7ZvMmPGZQu-fx0x_yplw3MVUGxoaWihG0mRNxF7PfWFmuxIKm7C-m7K-oNJYAraQfMM-GK0irBmi9TJydLwCFcXxaDa0QkwDyZ-efImBw8edDYC_vUxlfpzIut3ZGGThAihpDkALIUySsoOxzJjapABRX-wQRT53YBZeRwoT7t-MN1MMSc66QwQxzoa_srkonUGYK_CbZwfJZzt_f4jyg96hLHFkdDgu6bZ7kfBjUuoff4mf4mJ4je3dZOMsoJVv-mO6M03DThnw_eq8TTgQdVCRh031-iyx93MpHpR705DLI3yeU5nj4PuiwN_7Fzrszi93O07wx_4-ft-1dK03lqYVqyDdotJwNsdNzJf_uhnKVyaumEruac5XbjYRix-5ubQuVlVgHWijvulW1G3Wtlm7uj5Xd1xbtvXPjmLQRbrfpOIqn0uYv2Kk2Ug)
