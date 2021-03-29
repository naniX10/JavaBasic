package kty.basic.day10;

import kty.basic.sungjuk.SungJukService;
import kty.basic.sungjuk.SungJukServiceImpl;
import kty.basic.sungjuk.SungJukVO;

public class SungJukV5bMain {
    public static void main(String[] args) {
        //SungJukService sjsrv = new SungJukServiceImpl();
        SungJukService sjsrv = SungJukServiceImpl.getInstance();


        SungJukVO sj = sjsrv.readSungJuk();
        sjsrv.computeSungJuk(sj);
        sjsrv.pringSungJuk(sj);

    }

}












