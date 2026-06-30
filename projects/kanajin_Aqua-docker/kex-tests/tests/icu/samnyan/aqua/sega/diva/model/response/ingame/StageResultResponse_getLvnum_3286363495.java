package icu.samnyan.aqua.sega.diva.model.response.ingame;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static icu.samnyan.aqua.sega.diva.model.response.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class StageResultResponse_getLvnum_3286363495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11043;

    public StageResultResponse_getLvnum_3286363495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11043 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term11238 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11239 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11243 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term11043, term11043.getClass(), "chllng_kind", 1386130016);
        setIntField(term11043, term11043.getClass(), "lv_num_old", 1072005683);
        setIntField(term11043, term11043.getClass(), "lv_pnt_old", 1861318859);
        setIntField(term11043, term11043.getClass(), "lv_num", 1474524152);
        setIntField(term11043, term11043.getClass(), "lv_pnt", 568954359);
        setField(term11043, term11043.getClass(), "lv_str", "wzsPSPcRdj");
        setIntField(term11043, term11043.getClass(), "lv_efct_id", 53410913);
        setIntField(term11043, term11043.getClass(), "lv_plt_id", -375014958);
        setIntField(term11043, term11043.getClass(), "vcld_pts", 1107176718);
        setIntField(term11043, term11043.getClass(), "prsnt_vcld_pts", 480137250);
        setIntField(term11043, term11043.getClass(), "cnp_cid", -341152642);
        setIntField(term11043, term11043.getClass(), "cnp_val", -2015854073);
        setField(term11043, term11043.getClass(), "cnp_sp", "kGMQdqJYyB");
        setField(term11043, term11043.getClass(), "crwd_kind", "XJJNClzHRf");
        setField(term11043, term11043.getClass(), "crwd_value", "HDaezxQfQR");
        setField(term11043, term11043.getClass(), "crwd_str_0", "iikZEapDlu");
        setField(term11043, term11043.getClass(), "crwd_str_1", "nhoHrZfnIN");
        setIntField(term11043, term11043.getClass(), "cerwd_kind", 538259104);
        setIntField(term11043, term11043.getClass(), "cerwd_value", 96566506);
        setField(term11043, term11043.getClass(), "cerwd_str_0", "ZkMALXpEAZ");
        setField(term11043, term11043.getClass(), "cerwd_str_1", "tXfQjSqDzN");
        setField(term11043, term11043.getClass(), "ttl_str_ary", "BjugTaMcxJ");
        setField(term11043, term11043.getClass(), "ttl_plt_id_ary", "vGiuZVPJNH");
        setField(term11043, term11043.getClass(), "ttl_desc_ary", "tlzpzIjMib");
        setField(term11043, term11043.getClass(), "skin_id_ary", "AZdLeSugwv");
        setField(term11043, term11043.getClass(), "skin_name_ary", "RMsXuyzKJV");
        setField(term11043, term11043.getClass(), "skin_illust_ary", "FwPbDZcHmB");
        setField(term11043, term11043.getClass(), "skin_desc_ary", "hOncybyCAH");
        setIntField(term11043, term11043.getClass(), "pdddt_flg", -343325701);
        setIntField(term11239, term11239.getClass(), "year", 2022);
        setShortField(term11239, term11239.getClass(), "month", (short) 2);
        setShortField(term11239, term11239.getClass(), "day", (short) 26);
        setField(term11238, term11238.getClass(), "date", term11239);
        setByteField(term11243, term11243.getClass(), "hour", (byte) 11);
        setByteField(term11243, term11243.getClass(), "minute", (byte) 42);
        setByteField(term11243, term11243.getClass(), "second", (byte) 15);
        setIntField(term11243, term11243.getClass(), "nano", 377731937);
        setField(term11238, term11238.getClass(), "time", term11243);
        setField(term11043, term11043.getClass(), "pdddt_tm", term11238);
        setIntField(term11043, term11043.getClass(), "nblss_ltt_stts", 107945604);
        setIntField(term11043, term11043.getClass(), "nblss_ltt_tckt", -1963464809);
        setIntField(term11043, term11043.getClass(), "nblss_ltt_is_opn", 71190297);
        setIntField(term11043, term11043.getClass(), "nblss_ltt_prz", 1202361360);
        setIntField(term11043, term11043.getClass(), "nblss_ltt_nxt_stts", -2015048153);
        setIntField(term11043, term11043.getClass(), "nblss_ltt_nxt_tckt", -2063457669);
        setField(term11043, term11043.getClass(), "my_qst_id", "QduALnDSVo");
        setField(term11043, term11043.getClass(), "my_qst_r_qid", "izPpKDErnQ");
        setField(term11043, term11043.getClass(), "my_qst_r_knd", "NnpwZBUTvx");
        setField(term11043, term11043.getClass(), "my_qst_r_vl", "tlQSNgTkQX");
        setField(term11043, term11043.getClass(), "my_qst_r_nflg", "PCipZnmBOF");
        setField(term11043, term11043.getClass(), "my_ccd_r_qid", "zcorEihhLK");
        setField(term11043, term11043.getClass(), "my_ccd_r_hnd", "GrqozDKFOk");
        setField(term11043, term11043.getClass(), "my_ccd_r_vp", "CFyoseFGLF");
        setField(term11043, term11043.getClass(), "cmd", "SFqCrhEWLm");
        setField(term11043, term11043.getClass(), "req_id", "GZdcJyZntS");
        setField(term11043, term11043.getClass(), "stat", "OIHoJeysUi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLv_num", argTypes, term11043, args);
    }

};


