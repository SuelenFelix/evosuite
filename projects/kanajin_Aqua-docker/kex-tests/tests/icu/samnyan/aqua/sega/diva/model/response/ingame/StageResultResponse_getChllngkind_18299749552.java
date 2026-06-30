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

public class StageResultResponse_getChllngkind_18299749552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9234;

    public StageResultResponse_getChllngkind_18299749552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9234 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term9429 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9430 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9434 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term9234, term9234.getClass(), "chllng_kind", 1596070772);
        setIntField(term9234, term9234.getClass(), "lv_num_old", 97029295);
        setIntField(term9234, term9234.getClass(), "lv_pnt_old", -1371869594);
        setIntField(term9234, term9234.getClass(), "lv_num", -2095575670);
        setIntField(term9234, term9234.getClass(), "lv_pnt", 1225272962);
        setField(term9234, term9234.getClass(), "lv_str", "pORebkoRdD");
        setIntField(term9234, term9234.getClass(), "lv_efct_id", 1324040357);
        setIntField(term9234, term9234.getClass(), "lv_plt_id", -1588772968);
        setIntField(term9234, term9234.getClass(), "vcld_pts", -93135961);
        setIntField(term9234, term9234.getClass(), "prsnt_vcld_pts", -112921587);
        setIntField(term9234, term9234.getClass(), "cnp_cid", 933028652);
        setIntField(term9234, term9234.getClass(), "cnp_val", 287287233);
        setField(term9234, term9234.getClass(), "cnp_sp", "mXGCWJDOqA");
        setField(term9234, term9234.getClass(), "crwd_kind", "dpNsDgfPso");
        setField(term9234, term9234.getClass(), "crwd_value", "hCWPJQKpdc");
        setField(term9234, term9234.getClass(), "crwd_str_0", "WzMEhMXkKx");
        setField(term9234, term9234.getClass(), "crwd_str_1", "XOiDvlDhdc");
        setIntField(term9234, term9234.getClass(), "cerwd_kind", 962840079);
        setIntField(term9234, term9234.getClass(), "cerwd_value", 1540719661);
        setField(term9234, term9234.getClass(), "cerwd_str_0", "AdxvLJhNLe");
        setField(term9234, term9234.getClass(), "cerwd_str_1", "lHfTrWKMPk");
        setField(term9234, term9234.getClass(), "ttl_str_ary", "JDaAnsVTGV");
        setField(term9234, term9234.getClass(), "ttl_plt_id_ary", "mLUZFTfjle");
        setField(term9234, term9234.getClass(), "ttl_desc_ary", "xIeFjkHkOe");
        setField(term9234, term9234.getClass(), "skin_id_ary", "SdCKLMIYnX");
        setField(term9234, term9234.getClass(), "skin_name_ary", "OJJtVNPyKZ");
        setField(term9234, term9234.getClass(), "skin_illust_ary", "AKNapTAfmD");
        setField(term9234, term9234.getClass(), "skin_desc_ary", "xJgPlLxpgC");
        setIntField(term9234, term9234.getClass(), "pdddt_flg", 1265463001);
        setIntField(term9430, term9430.getClass(), "year", 2021);
        setShortField(term9430, term9430.getClass(), "month", (short) 1);
        setShortField(term9430, term9430.getClass(), "day", (short) 18);
        setField(term9429, term9429.getClass(), "date", term9430);
        setByteField(term9434, term9434.getClass(), "hour", (byte) 13);
        setByteField(term9434, term9434.getClass(), "minute", (byte) 38);
        setByteField(term9434, term9434.getClass(), "second", (byte) 26);
        setIntField(term9434, term9434.getClass(), "nano", 544608644);
        setField(term9429, term9429.getClass(), "time", term9434);
        setField(term9234, term9234.getClass(), "pdddt_tm", term9429);
        setIntField(term9234, term9234.getClass(), "nblss_ltt_stts", 335112684);
        setIntField(term9234, term9234.getClass(), "nblss_ltt_tckt", 1551099402);
        setIntField(term9234, term9234.getClass(), "nblss_ltt_is_opn", -2027534003);
        setIntField(term9234, term9234.getClass(), "nblss_ltt_prz", 1063420942);
        setIntField(term9234, term9234.getClass(), "nblss_ltt_nxt_stts", 1375330971);
        setIntField(term9234, term9234.getClass(), "nblss_ltt_nxt_tckt", -478195677);
        setField(term9234, term9234.getClass(), "my_qst_id", "EYtfuJaxiM");
        setField(term9234, term9234.getClass(), "my_qst_r_qid", "gCWtLVKVVe");
        setField(term9234, term9234.getClass(), "my_qst_r_knd", "fWKJoSoCwE");
        setField(term9234, term9234.getClass(), "my_qst_r_vl", "wfaXBpWAUH");
        setField(term9234, term9234.getClass(), "my_qst_r_nflg", "VMeAzAHwZj");
        setField(term9234, term9234.getClass(), "my_ccd_r_qid", "PznxWXsZME");
        setField(term9234, term9234.getClass(), "my_ccd_r_hnd", "ZzIujlwVsw");
        setField(term9234, term9234.getClass(), "my_ccd_r_vp", "LWyEaeIyAo");
        setField(term9234, term9234.getClass(), "cmd", "yVMkkQhvmN");
        setField(term9234, term9234.getClass(), "req_id", "mvrkADEgpp");
        setField(term9234, term9234.getClass(), "stat", "pXOkjyeIRb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChllng_kind", argTypes, term9234, args);
    }

};


