class OrderedStream {

    private String[] stream;
    private int ptr;
    public OrderedStream(int n) {
        this.stream = new String[n + 1];
        this.ptr = 1;
    }
    
    public List<String> insert(int id, String value) {
        stream[id] = value;
        List<String> list = new LinkedList<>();
        while (ptr < stream.length && stream[ptr] != null) {
            list.add(stream[ptr++]);
        }
        return list;
    }
}
