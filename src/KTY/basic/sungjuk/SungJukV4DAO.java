package kty.basic.sungjuk;

import java.util.List;

public interface SungJukV4DAO {

    int insertSungJuk(SungJukVO sj);   // 이 다섯개가 기본?
    List<SungJukVO> selectSungJuk();   // 다른것을 만들때 SungJuk대신 다른거 넣어라
    SungJukVO selectOneSungJuk(int sjno);
    int updateSungJuk(SungJukVO sj);
    int deleteSungJuk(int sjno);    // 이 다섯개가 기본?

}
