package Interface;

public class KeThuaInterface implements ViduInterface{
    @Override
    public void thongTin(String ten, String cccd, int namsinh) {

    }

    @Override
    public double tinhLuong(double luongNgay, int soNgayCong) {
        return luongNgay * soNgayCong;
    }
}
