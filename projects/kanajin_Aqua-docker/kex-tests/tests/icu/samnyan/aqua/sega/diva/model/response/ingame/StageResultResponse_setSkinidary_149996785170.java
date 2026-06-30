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

public class StageResultResponse_setSkinidary_149996785170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50506;

    public StageResultResponse_setSkinidary_149996785170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50506 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term50701 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term50702 = newInstance(Class.forName("java.time.LocalDate"));
        Object term50706 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term50506, term50506.getClass(), "chllng_kind", 1641342112);
        setIntField(term50506, term50506.getClass(), "lv_num_old", -1551790945);
        setIntField(term50506, term50506.getClass(), "lv_pnt_old", 2039538484);
        setIntField(term50506, term50506.getClass(), "lv_num", 1235736068);
        setIntField(term50506, term50506.getClass(), "lv_pnt", 329424176);
        setField(term50506, term50506.getClass(), "lv_str", "YUIUZeZiMK");
        setIntField(term50506, term50506.getClass(), "lv_efct_id", -1897199214);
        setIntField(term50506, term50506.getClass(), "lv_plt_id", -1016478729);
        setIntField(term50506, term50506.getClass(), "vcld_pts", -206889003);
        setIntField(term50506, term50506.getClass(), "prsnt_vcld_pts", 638046409);
        setIntField(term50506, term50506.getClass(), "cnp_cid", 427274898);
        setIntField(term50506, term50506.getClass(), "cnp_val", -1654552020);
        setField(term50506, term50506.getClass(), "cnp_sp", "rrPETbKRef");
        setField(term50506, term50506.getClass(), "crwd_kind", "viZRlrisPY");
        setField(term50506, term50506.getClass(), "crwd_value", "VSfRsPLslq");
        setField(term50506, term50506.getClass(), "crwd_str_0", "dwygneuBjP");
        setField(term50506, term50506.getClass(), "crwd_str_1", "LfKgkzPZpX");
        setIntField(term50506, term50506.getClass(), "cerwd_kind", -1049546692);
        setIntField(term50506, term50506.getClass(), "cerwd_value", 1397781598);
        setField(term50506, term50506.getClass(), "cerwd_str_0", "belyXxMqFm");
        setField(term50506, term50506.getClass(), "cerwd_str_1", "LPotuCwkwB");
        setField(term50506, term50506.getClass(), "ttl_str_ary", "zpCKXLOzse");
        setField(term50506, term50506.getClass(), "ttl_plt_id_ary", "qhlWSiHAHt");
        setField(term50506, term50506.getClass(), "ttl_desc_ary", "XrKIhxpIJD");
        setField(term50506, term50506.getClass(), "skin_id_ary", "RSuRSjiLvm");
        setField(term50506, term50506.getClass(), "skin_name_ary", "aoeNWgMpNx");
        setField(term50506, term50506.getClass(), "skin_illust_ary", "RQvXfSweVs");
        setField(term50506, term50506.getClass(), "skin_desc_ary", "jGxArBjtep");
        setIntField(term50506, term50506.getClass(), "pdddt_flg", -44720365);
        setIntField(term50702, term50702.getClass(), "year", 2019);
        setShortField(term50702, term50702.getClass(), "month", (short) 7);
        setShortField(term50702, term50702.getClass(), "day", (short) 19);
        setField(term50701, term50701.getClass(), "date", term50702);
        setByteField(term50706, term50706.getClass(), "hour", (byte) 10);
        setByteField(term50706, term50706.getClass(), "minute", (byte) 54);
        setByteField(term50706, term50706.getClass(), "second", (byte) 55);
        setIntField(term50706, term50706.getClass(), "nano", 244650454);
        setField(term50701, term50701.getClass(), "time", term50706);
        setField(term50506, term50506.getClass(), "pdddt_tm", term50701);
        setIntField(term50506, term50506.getClass(), "nblss_ltt_stts", 1963632911);
        setIntField(term50506, term50506.getClass(), "nblss_ltt_tckt", -1100497683);
        setIntField(term50506, term50506.getClass(), "nblss_ltt_is_opn", 155423433);
        setIntField(term50506, term50506.getClass(), "nblss_ltt_prz", -815471632);
        setIntField(term50506, term50506.getClass(), "nblss_ltt_nxt_stts", -1469668708);
        setIntField(term50506, term50506.getClass(), "nblss_ltt_nxt_tckt", 1796950482);
        setField(term50506, term50506.getClass(), "my_qst_id", "dUXsPNSUez");
        setField(term50506, term50506.getClass(), "my_qst_r_qid", "PxGDfPOAFS");
        setField(term50506, term50506.getClass(), "my_qst_r_knd", "dZVxzYEeZe");
        setField(term50506, term50506.getClass(), "my_qst_r_vl", "TnCQRmzwPf");
        setField(term50506, term50506.getClass(), "my_qst_r_nflg", "ZGnUKGTWCn");
        setField(term50506, term50506.getClass(), "my_ccd_r_qid", "cHRLXsgRzr");
        setField(term50506, term50506.getClass(), "my_ccd_r_hnd", "QpqQKmCtoC");
        setField(term50506, term50506.getClass(), "my_ccd_r_vp", "AYRvbRJxWI");
        setField(term50506, term50506.getClass(), "cmd", "MGNiaVqEDc");
        setField(term50506, term50506.getClass(), "req_id", "qeVNCFrTbT");
        setField(term50506, term50506.getClass(), "stat", "sreEtRBWQl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UKQejaeJWY";
        callMethod(klass, "setSkin_id_ary", argTypes, term50506, args);
    }

};


