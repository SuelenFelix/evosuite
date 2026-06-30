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

public class StageResultResponse_setPdddttm_177701752575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53611;
     Object term53954;

    public StageResultResponse_setPdddttm_177701752575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53611 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term53806 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53807 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53811 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term53611, term53611.getClass(), "chllng_kind", 1483499310);
        setIntField(term53611, term53611.getClass(), "lv_num_old", -1516568587);
        setIntField(term53611, term53611.getClass(), "lv_pnt_old", 1537690170);
        setIntField(term53611, term53611.getClass(), "lv_num", 1133116994);
        setIntField(term53611, term53611.getClass(), "lv_pnt", -1195191239);
        setField(term53611, term53611.getClass(), "lv_str", "BiitfiJmRW");
        setIntField(term53611, term53611.getClass(), "lv_efct_id", -470798982);
        setIntField(term53611, term53611.getClass(), "lv_plt_id", 1844345719);
        setIntField(term53611, term53611.getClass(), "vcld_pts", 1704024265);
        setIntField(term53611, term53611.getClass(), "prsnt_vcld_pts", 501801161);
        setIntField(term53611, term53611.getClass(), "cnp_cid", 2103971768);
        setIntField(term53611, term53611.getClass(), "cnp_val", -939132796);
        setField(term53611, term53611.getClass(), "cnp_sp", "ILHarzuGbn");
        setField(term53611, term53611.getClass(), "crwd_kind", "uNGHHAwCFL");
        setField(term53611, term53611.getClass(), "crwd_value", "fbshyuUfqy");
        setField(term53611, term53611.getClass(), "crwd_str_0", "eupNcihLEw");
        setField(term53611, term53611.getClass(), "crwd_str_1", "iFFcolxwcm");
        setIntField(term53611, term53611.getClass(), "cerwd_kind", 159279866);
        setIntField(term53611, term53611.getClass(), "cerwd_value", 138122227);
        setField(term53611, term53611.getClass(), "cerwd_str_0", "bAsZBSqnyM");
        setField(term53611, term53611.getClass(), "cerwd_str_1", "urrmpQzmTU");
        setField(term53611, term53611.getClass(), "ttl_str_ary", "GWoZyTTlNx");
        setField(term53611, term53611.getClass(), "ttl_plt_id_ary", "ntUYcalSmz");
        setField(term53611, term53611.getClass(), "ttl_desc_ary", "lnZXLpyQoO");
        setField(term53611, term53611.getClass(), "skin_id_ary", "lOIEIGbwPj");
        setField(term53611, term53611.getClass(), "skin_name_ary", "TvmWaJWmLY");
        setField(term53611, term53611.getClass(), "skin_illust_ary", "TSUdwgvHgU");
        setField(term53611, term53611.getClass(), "skin_desc_ary", "YBQxTjzIrN");
        setIntField(term53611, term53611.getClass(), "pdddt_flg", 1795358995);
        setIntField(term53807, term53807.getClass(), "year", 2010);
        setShortField(term53807, term53807.getClass(), "month", (short) 2);
        setShortField(term53807, term53807.getClass(), "day", (short) 24);
        setField(term53806, term53806.getClass(), "date", term53807);
        setByteField(term53811, term53811.getClass(), "hour", (byte) 17);
        setByteField(term53811, term53811.getClass(), "minute", (byte) 58);
        setByteField(term53811, term53811.getClass(), "second", (byte) 56);
        setIntField(term53811, term53811.getClass(), "nano", 291725532);
        setField(term53806, term53806.getClass(), "time", term53811);
        setField(term53611, term53611.getClass(), "pdddt_tm", term53806);
        setIntField(term53611, term53611.getClass(), "nblss_ltt_stts", -781185864);
        setIntField(term53611, term53611.getClass(), "nblss_ltt_tckt", 340500914);
        setIntField(term53611, term53611.getClass(), "nblss_ltt_is_opn", -2061712635);
        setIntField(term53611, term53611.getClass(), "nblss_ltt_prz", 1182911731);
        setIntField(term53611, term53611.getClass(), "nblss_ltt_nxt_stts", 644726932);
        setIntField(term53611, term53611.getClass(), "nblss_ltt_nxt_tckt", -1515977761);
        setField(term53611, term53611.getClass(), "my_qst_id", "xfqaJVcHGx");
        setField(term53611, term53611.getClass(), "my_qst_r_qid", "bANxpqKESI");
        setField(term53611, term53611.getClass(), "my_qst_r_knd", "sgpUSVSuVZ");
        setField(term53611, term53611.getClass(), "my_qst_r_vl", "ZOYhOzwINI");
        setField(term53611, term53611.getClass(), "my_qst_r_nflg", "sPqjQQfymN");
        setField(term53611, term53611.getClass(), "my_ccd_r_qid", "tNKFzflLBd");
        setField(term53611, term53611.getClass(), "my_ccd_r_hnd", "xHLlctEoGh");
        setField(term53611, term53611.getClass(), "my_ccd_r_vp", "aqgUzcnqpE");
        setField(term53611, term53611.getClass(), "cmd", "yZDlWLIKEp");
        setField(term53611, term53611.getClass(), "req_id", "dAEiXUxDrI");
        setField(term53611, term53611.getClass(), "stat", "AgQWngzXPH");
        term53954 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53955 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53959 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term53955, term53955.getClass(), "year", 2028);
        setShortField(term53955, term53955.getClass(), "month", (short) 7);
        setShortField(term53955, term53955.getClass(), "day", (short) 22);
        setField(term53954, term53954.getClass(), "date", term53955);
        setByteField(term53959, term53959.getClass(), "hour", (byte) 18);
        setByteField(term53959, term53959.getClass(), "minute", (byte) 33);
        setByteField(term53959, term53959.getClass(), "second", (byte) 7);
        setIntField(term53959, term53959.getClass(), "nano", 763613074);
        setField(term53954, term53954.getClass(), "time", term53959);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term53954;
        callMethod(klass, "setPdddt_tm", argTypes, term53611, args);
    }

};


