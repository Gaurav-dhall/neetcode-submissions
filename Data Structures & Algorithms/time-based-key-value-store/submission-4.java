class TimeMap {
    public Map<String,Map<Integer,String>> data;
    public TimeMap() {
       data= new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
    data.putIfAbsent(key, new HashMap<>());
    data.get(key).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        int t=timestamp;
       Map<Integer,String> time=data.get(key);
       if(time==null){
        return "";
       }

       while(t>=0&&time.get(t)==null){
            t--;
       }
       

       return t==-1?"": time.get(t);
    }
}
