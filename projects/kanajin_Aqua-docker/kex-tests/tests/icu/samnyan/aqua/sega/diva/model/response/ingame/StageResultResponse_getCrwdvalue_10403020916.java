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

public class StageResultResponse_getCrwdvalue_10403020916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17676;

    public StageResultResponse_getCrwdvalue_10403020916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17676 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term17871 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17872 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17876 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term17676, term17676.getClass(), "chllng_kind", 798043553);
        setIntField(term17676, term17676.getClass(), "lv_num_old", 533197381);
        setIntField(term17676, term17676.getClass(), "lv_pnt_old", 1048271679);
        setIntField(term17676, term17676.getClass(), "lv_num", -1529797673);
        setIntField(term17676, term17676.getClass(), "lv_pnt", -868676396);
        setField(term17676, term17676.getClass(), "lv_str", "JWodNQzjjV");
        setIntField(term17676, term17676.getClass(), "lv_efct_id", 1922684808);
        setIntField(term17676, term17676.getClass(), "lv_plt_id", -2005784375);
        setIntField(term17676, term17676.getClass(), "vcld_pts", -288604325);
        setIntField(term17676, term17676.getClass(), "prsnt_vcld_pts", -1268314569);
        setIntField(term17676, term17676.getClass(), "cnp_cid", 877649659);
        setIntField(term17676, term17676.getClass(), "cnp_val", -1332748804);
        setField(term17676, term17676.getClass(), "cnp_sp", "CAgxWjhxNf");
        setField(term17676, term17676.getClass(), "crwd_kind", "goAoCMhKBu");
        setField(term17676, term17676.getClass(), "crwd_value", "BWxJSgKHRT");
        setField(term17676, term17676.getClass(), "crwd_str_0", "AGXoIndFnm");
        setField(term17676, term17676.getClass(), "crwd_str_1", "mwmFMNEzkK");
        setIntField(term17676, term17676.getClass(), "cerwd_kind", 1774507971);
        setIntField(term17676, term17676.getClass(), "cerwd_value", -1420269858);
        setField(term17676, term17676.getClass(), "cerwd_str_0", "kVAmKknVln");
        setField(term17676, term17676.getClass(), "cerwd_str_1", "MRFLbEGYKG");
        setField(term17676, term17676.getClass(), "ttl_str_ary", "BYrGukTyof");
        setField(term17676, term17676.getClass(), "ttl_plt_id_ary", "jiCGTTzKGB");
        setField(term17676, term17676.getClass(), "ttl_desc_ary", "MqICFYzDJj");
        setField(term17676, term17676.getClass(), "skin_id_ary", "YgQvdcBQKw");
        setField(term17676, term17676.getClass(), "skin_name_ary", "FiYYLuailz");
        setField(term17676, term17676.getClass(), "skin_illust_ary", "XebAeSnCKZ");
        setField(term17676, term17676.getClass(), "skin_desc_ary", "GeddnXjHGy");
        setIntField(term17676, term17676.getClass(), "pdddt_flg", -2119545015);
        setIntField(term17872, term17872.getClass(), "year", 2017);
        setShortField(term17872, term17872.getClass(), "month", (short) 6);
        setShortField(term17872, term17872.getClass(), "day", (short) 8);
        setField(term17871, term17871.getClass(), "date", term17872);
        setByteField(term17876, term17876.getClass(), "hour", (byte) 0);
        setByteField(term17876, term17876.getClass(), "minute", (byte) 18);
        setByteField(term17876, term17876.getClass(), "second", (byte) 55);
        setIntField(term17876, term17876.getClass(), "nano", 680586717);
        setField(term17871, term17871.getClass(), "time", term17876);
        setField(term17676, term17676.getClass(), "pdddt_tm", term17871);
        setIntField(term17676, term17676.getClass(), "nblss_ltt_stts", 1272542218);
        setIntField(term17676, term17676.getClass(), "nblss_ltt_tckt", 1209799204);
        setIntField(term17676, term17676.getClass(), "nblss_ltt_is_opn", 1094107751);
        setIntField(term17676, term17676.getClass(), "nblss_ltt_prz", 844222656);
        setIntField(term17676, term17676.getClass(), "nblss_ltt_nxt_stts", -18216811);
        setIntField(term17676, term17676.getClass(), "nblss_ltt_nxt_tckt", -1813280137);
        setField(term17676, term17676.getClass(), "my_qst_id", "vLTbaoAxBm");
        setField(term17676, term17676.getClass(), "my_qst_r_qid", "BXTjEyEZxD");
        setField(term17676, term17676.getClass(), "my_qst_r_knd", "oKhVzOKUFW");
        setField(term17676, term17676.getClass(), "my_qst_r_vl", "mNHyqmOAFy");
        setField(term17676, term17676.getClass(), "my_qst_r_nflg", "UxgSdhxPCH");
        setField(term17676, term17676.getClass(), "my_ccd_r_qid", "DAujxZPHJC");
        setField(term17676, term17676.getClass(), "my_ccd_r_hnd", "IlBhdrCvHq");
        setField(term17676, term17676.getClass(), "my_ccd_r_vp", "OirVUQhauU");
        setField(term17676, term17676.getClass(), "cmd", "GLbyDfbNZI");
        setField(term17676, term17676.getClass(), "req_id", "oNLcCYDAsO");
        setField(term17676, term17676.getClass(), "stat", "CNqMxLvtcJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCrwd_value", argTypes, term17676, args);
    }

};


