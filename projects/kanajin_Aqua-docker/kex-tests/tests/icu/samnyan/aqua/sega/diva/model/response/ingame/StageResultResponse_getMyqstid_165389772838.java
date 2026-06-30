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

public class StageResultResponse_getMyqstid_165389772838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30942;

    public StageResultResponse_getMyqstid_165389772838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30942 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term31137 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31138 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31142 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term30942, term30942.getClass(), "chllng_kind", 532666604);
        setIntField(term30942, term30942.getClass(), "lv_num_old", -13725716);
        setIntField(term30942, term30942.getClass(), "lv_pnt_old", -1695750603);
        setIntField(term30942, term30942.getClass(), "lv_num", 63677360);
        setIntField(term30942, term30942.getClass(), "lv_pnt", 1478914037);
        setField(term30942, term30942.getClass(), "lv_str", "FOKfDXQxMM");
        setIntField(term30942, term30942.getClass(), "lv_efct_id", 1630231519);
        setIntField(term30942, term30942.getClass(), "lv_plt_id", 1460702778);
        setIntField(term30942, term30942.getClass(), "vcld_pts", -1398142433);
        setIntField(term30942, term30942.getClass(), "prsnt_vcld_pts", -1112119058);
        setIntField(term30942, term30942.getClass(), "cnp_cid", 2073858334);
        setIntField(term30942, term30942.getClass(), "cnp_val", -1693535639);
        setField(term30942, term30942.getClass(), "cnp_sp", "gbxMvhrWpA");
        setField(term30942, term30942.getClass(), "crwd_kind", "huNTIobUHx");
        setField(term30942, term30942.getClass(), "crwd_value", "MrVeCmRVzF");
        setField(term30942, term30942.getClass(), "crwd_str_0", "CPVnQYACKw");
        setField(term30942, term30942.getClass(), "crwd_str_1", "sbdLhVCRsw");
        setIntField(term30942, term30942.getClass(), "cerwd_kind", 1344744036);
        setIntField(term30942, term30942.getClass(), "cerwd_value", -98060427);
        setField(term30942, term30942.getClass(), "cerwd_str_0", "soJHvZwbtF");
        setField(term30942, term30942.getClass(), "cerwd_str_1", "dTGwgkfDVj");
        setField(term30942, term30942.getClass(), "ttl_str_ary", "zHiuLPzYQM");
        setField(term30942, term30942.getClass(), "ttl_plt_id_ary", "ioYxUYJBrh");
        setField(term30942, term30942.getClass(), "ttl_desc_ary", "GXoLEdKEIe");
        setField(term30942, term30942.getClass(), "skin_id_ary", "EugWXkztim");
        setField(term30942, term30942.getClass(), "skin_name_ary", "DvRdOzzihn");
        setField(term30942, term30942.getClass(), "skin_illust_ary", "wIygCdQAKO");
        setField(term30942, term30942.getClass(), "skin_desc_ary", "JsXroBYqwr");
        setIntField(term30942, term30942.getClass(), "pdddt_flg", -1272268399);
        setIntField(term31138, term31138.getClass(), "year", 2010);
        setShortField(term31138, term31138.getClass(), "month", (short) 9);
        setShortField(term31138, term31138.getClass(), "day", (short) 28);
        setField(term31137, term31137.getClass(), "date", term31138);
        setByteField(term31142, term31142.getClass(), "hour", (byte) 6);
        setByteField(term31142, term31142.getClass(), "minute", (byte) 4);
        setByteField(term31142, term31142.getClass(), "second", (byte) 54);
        setIntField(term31142, term31142.getClass(), "nano", 604713782);
        setField(term31137, term31137.getClass(), "time", term31142);
        setField(term30942, term30942.getClass(), "pdddt_tm", term31137);
        setIntField(term30942, term30942.getClass(), "nblss_ltt_stts", 1120271104);
        setIntField(term30942, term30942.getClass(), "nblss_ltt_tckt", -128435804);
        setIntField(term30942, term30942.getClass(), "nblss_ltt_is_opn", 2136158480);
        setIntField(term30942, term30942.getClass(), "nblss_ltt_prz", 2118747457);
        setIntField(term30942, term30942.getClass(), "nblss_ltt_nxt_stts", 1868344256);
        setIntField(term30942, term30942.getClass(), "nblss_ltt_nxt_tckt", 1857693976);
        setField(term30942, term30942.getClass(), "my_qst_id", "YciMAObLwl");
        setField(term30942, term30942.getClass(), "my_qst_r_qid", "qAmVqwwdyf");
        setField(term30942, term30942.getClass(), "my_qst_r_knd", "IXPaHQnEUy");
        setField(term30942, term30942.getClass(), "my_qst_r_vl", "zhcWVVrrjs");
        setField(term30942, term30942.getClass(), "my_qst_r_nflg", "EAMaFLdmaG");
        setField(term30942, term30942.getClass(), "my_ccd_r_qid", "DYZSJMwbhX");
        setField(term30942, term30942.getClass(), "my_ccd_r_hnd", "QGcshsIIWo");
        setField(term30942, term30942.getClass(), "my_ccd_r_vp", "dPHtrzKWgf");
        setField(term30942, term30942.getClass(), "cmd", "olmFxfIVeh");
        setField(term30942, term30942.getClass(), "req_id", "iSPirUEhXs");
        setField(term30942, term30942.getClass(), "stat", "WWyLFmYpAy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMy_qst_id", argTypes, term30942, args);
    }

};


