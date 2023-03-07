package Cau3;

public class VanBan {
    private String content;
    public VanBan(){

    }

    public VanBan(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String vietHoaToanBo(){
        String tmp=content.toUpperCase();
        return tmp;
    }
    public String vietThuongToanBo(){
        String tmp=content.toLowerCase();
        return tmp;
    }
    public String chuanHoaVanBan(){
        String tmp=content.trim().replaceAll("\\s+"," ");
        return tmp;
    }
    public long demSoTu(){
        StringBuffer buffer = new StringBuffer(content);
        long size=0;
        for (int i = 0; i < buffer.length(); i++) {
            if(buffer.charAt(i)==' '&&buffer.charAt(i+1)!=' ')
            {
                size++;
            }
        }
        return size;
    }
    public String vietHoaChuCaiDauTien(){
        content=vietThuongToanBo();
        StringBuffer buffer=new StringBuffer(content);
        buffer.setCharAt(0,Character.toUpperCase(buffer.charAt(0)));
        for (int i = 0; i < buffer.length(); i++) {
            if(buffer.charAt(i)==' '&&buffer.charAt(i+1)!=' '){
                buffer.setCharAt(i+1,Character.toUpperCase(buffer.charAt(i+1)));
            }
        }
        return buffer.toString();
    }

    @Override
    public String toString() {
        return "VanBan[" +
                "content='" + content + '\'' +
                ']';
    }
}
