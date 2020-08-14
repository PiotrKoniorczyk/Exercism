class MicroBlog {
    public String truncate(String input) {
        String result = input.codePoints()
                .limit(5)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return result;
    }
}
