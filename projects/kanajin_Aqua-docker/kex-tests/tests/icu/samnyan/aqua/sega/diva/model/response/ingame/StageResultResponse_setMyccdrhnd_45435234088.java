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

public class StageResultResponse_setMyccdrhnd_45435234088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61604;

    public StageResultResponse_setMyccdrhnd_45435234088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61604 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term61799 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term61800 = newInstance(Class.forName("java.time.LocalDate"));
        Object term61804 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term61604, term61604.getClass(), "chllng_kind", 86144663);
        setIntField(term61604, term61604.getClass(), "lv_num_old", -1480903995);
        setIntField(term61604, term61604.getClass(), "lv_pnt_old", -2111772603);
        setIntField(term61604, term61604.getClass(), "lv_num", 637942911);
        setIntField(term61604, term61604.getClass(), "lv_pnt", -395396657);
        setField(term61604, term61604.getClass(), "lv_str", "ZybsWgYCUR");
        setIntField(term61604, term61604.getClass(), "lv_efct_id", 1677171453);
        setIntField(term61604, term61604.getClass(), "lv_plt_id", -2108979704);
        setIntField(term61604, term61604.getClass(), "vcld_pts", 1629835601);
        setIntField(term61604, term61604.getClass(), "prsnt_vcld_pts", 1866184476);
        setIntField(term61604, term61604.getClass(), "cnp_cid", -17998574);
        setIntField(term61604, term61604.getClass(), "cnp_val", 145080354);
        setField(term61604, term61604.getClass(), "cnp_sp", "YZNLZnNFNI");
        setField(term61604, term61604.getClass(), "crwd_kind", "uHcUlIseio");
        setField(term61604, term61604.getClass(), "crwd_value", "bsmWXOcLZJ");
        setField(term61604, term61604.getClass(), "crwd_str_0", "ltTwdndtbe");
        setField(term61604, term61604.getClass(), "crwd_str_1", "XaldiIeyMi");
        setIntField(term61604, term61604.getClass(), "cerwd_kind", -2087321012);
        setIntField(term61604, term61604.getClass(), "cerwd_value", -1613074612);
        setField(term61604, term61604.getClass(), "cerwd_str_0", "lkujDCFpdm");
        setField(term61604, term61604.getClass(), "cerwd_str_1", "sGfzmhpQEH");
        setField(term61604, term61604.getClass(), "ttl_str_ary", "FqGkFGXAbg");
        setField(term61604, term61604.getClass(), "ttl_plt_id_ary", "SSWEZgFiFO");
        setField(term61604, term61604.getClass(), "ttl_desc_ary", "spphrCslQA");
        setField(term61604, term61604.getClass(), "skin_id_ary", "EPkEFVlZrY");
        setField(term61604, term61604.getClass(), "skin_name_ary", "jySnpYEVPv");
        setField(term61604, term61604.getClass(), "skin_illust_ary", "VdHqujFzSo");
        setField(term61604, term61604.getClass(), "skin_desc_ary", "cZbOKEdKPs");
        setIntField(term61604, term61604.getClass(), "pdddt_flg", 1054908502);
        setIntField(term61800, term61800.getClass(), "year", 2023);
        setShortField(term61800, term61800.getClass(), "month", (short) 5);
        setShortField(term61800, term61800.getClass(), "day", (short) 23);
        setField(term61799, term61799.getClass(), "date", term61800);
        setByteField(term61804, term61804.getClass(), "hour", (byte) 0);
        setByteField(term61804, term61804.getClass(), "minute", (byte) 50);
        setByteField(term61804, term61804.getClass(), "second", (byte) 5);
        setIntField(term61804, term61804.getClass(), "nano", 296286825);
        setField(term61799, term61799.getClass(), "time", term61804);
        setField(term61604, term61604.getClass(), "pdddt_tm", term61799);
        setIntField(term61604, term61604.getClass(), "nblss_ltt_stts", -1226802566);
        setIntField(term61604, term61604.getClass(), "nblss_ltt_tckt", 1162813858);
        setIntField(term61604, term61604.getClass(), "nblss_ltt_is_opn", 494596414);
        setIntField(term61604, term61604.getClass(), "nblss_ltt_prz", 1226377461);
        setIntField(term61604, term61604.getClass(), "nblss_ltt_nxt_stts", -1540486514);
        setIntField(term61604, term61604.getClass(), "nblss_ltt_nxt_tckt", 1471031478);
        setField(term61604, term61604.getClass(), "my_qst_id", "nvXqvMSAjc");
        setField(term61604, term61604.getClass(), "my_qst_r_qid", "agbhgbQisl");
        setField(term61604, term61604.getClass(), "my_qst_r_knd", "EZvlAVCXCm");
        setField(term61604, term61604.getClass(), "my_qst_r_vl", "axtbmWOSRY");
        setField(term61604, term61604.getClass(), "my_qst_r_nflg", "TLlyjzxJUz");
        setField(term61604, term61604.getClass(), "my_ccd_r_qid", "YclIWGPKZY");
        setField(term61604, term61604.getClass(), "my_ccd_r_hnd", "gChBjLUhbg");
        setField(term61604, term61604.getClass(), "my_ccd_r_vp", "enWkULOykY");
        setField(term61604, term61604.getClass(), "cmd", "BPdcafiAQX");
        setField(term61604, term61604.getClass(), "req_id", "GvmOxwMrOk");
        setField(term61604, term61604.getClass(), "stat", "WXUKmhwFsK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OcfokBTzZZ";
        callMethod(klass, "setMy_ccd_r_hnd", argTypes, term61604, args);
    }

};


