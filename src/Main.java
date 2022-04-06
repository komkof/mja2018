class Main {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        var output = new java.util.ArrayList() {{
            add("You have chosen a square ");
        }};
        switch (scanner.nextInt()) {
            case 1:
                output.add("square");
                break;
            case 2:
                output.add("circle");
                break;
            case 3:
                output.add("triangle");
                break;
            case 4:
                output.add("rhombus");
                break;
            default:
                output.clear();
                output.add("There is no such shape!");
        }
        output.forEach(System.out::print);
    }
}