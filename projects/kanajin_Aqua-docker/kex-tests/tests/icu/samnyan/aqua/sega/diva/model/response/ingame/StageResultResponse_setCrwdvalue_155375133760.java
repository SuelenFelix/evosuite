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

public class StageResultResponse_setCrwdvalue_155375133760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44296;

    public StageResultResponse_setCrwdvalue_155375133760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44296 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term44491 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term44492 = newInstance(Class.forName("java.time.LocalDate"));
        Object term44496 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term44296, term44296.getClass(), "chllng_kind", 1267740164);
        setIntField(term44296, term44296.getClass(), "lv_num_old", 1363887997);
        setIntField(term44296, term44296.getClass(), "lv_pnt_old", -1744763945);
        setIntField(term44296, term44296.getClass(), "lv_num", 852281447);
        setIntField(term44296, term44296.getClass(), "lv_pnt", 1248430530);
        setField(term44296, term44296.getClass(), "lv_str", "CJlAiZDIQO");
        setIntField(term44296, term44296.getClass(), "lv_efct_id", -1911828505);
        setIntField(term44296, term44296.getClass(), "lv_plt_id", 241725499);
        setIntField(term44296, term44296.getClass(), "vcld_pts", 823179298);
        setIntField(term44296, term44296.getClass(), "prsnt_vcld_pts", 1174484848);
        setIntField(term44296, term44296.getClass(), "cnp_cid", 939889496);
        setIntField(term44296, term44296.getClass(), "cnp_val", -495242269);
        setField(term44296, term44296.getClass(), "cnp_sp", "osgWaTBVoE");
        setField(term44296, term44296.getClass(), "crwd_kind", "mvkMYcgAod");
        setField(term44296, term44296.getClass(), "crwd_value", "esbhDGQDgF");
        setField(term44296, term44296.getClass(), "crwd_str_0", "tKlyiBloWu");
        setField(term44296, term44296.getClass(), "crwd_str_1", "uIgRFcwqLd");
        setIntField(term44296, term44296.getClass(), "cerwd_kind", 932810106);
        setIntField(term44296, term44296.getClass(), "cerwd_value", -2138801137);
        setField(term44296, term44296.getClass(), "cerwd_str_0", "AvdsiEyCve");
        setField(term44296, term44296.getClass(), "cerwd_str_1", "XMArCaVAEc");
        setField(term44296, term44296.getClass(), "ttl_str_ary", "URWnZtbrQH");
        setField(term44296, term44296.getClass(), "ttl_plt_id_ary", "hpTAdtnQku");
        setField(term44296, term44296.getClass(), "ttl_desc_ary", "GdMAXFBAtl");
        setField(term44296, term44296.getClass(), "skin_id_ary", "KWVRAlcIqd");
        setField(term44296, term44296.getClass(), "skin_name_ary", "GeVOqtDiGv");
        setField(term44296, term44296.getClass(), "skin_illust_ary", "vbRAJCwftU");
        setField(term44296, term44296.getClass(), "skin_desc_ary", "baJbjUImxp");
        setIntField(term44296, term44296.getClass(), "pdddt_flg", -1470115841);
        setIntField(term44492, term44492.getClass(), "year", 2024);
        setShortField(term44492, term44492.getClass(), "month", (short) 2);
        setShortField(term44492, term44492.getClass(), "day", (short) 29);
        setField(term44491, term44491.getClass(), "date", term44492);
        setByteField(term44496, term44496.getClass(), "hour", (byte) 17);
        setByteField(term44496, term44496.getClass(), "minute", (byte) 54);
        setByteField(term44496, term44496.getClass(), "second", (byte) 21);
        setIntField(term44496, term44496.getClass(), "nano", 605973408);
        setField(term44491, term44491.getClass(), "time", term44496);
        setField(term44296, term44296.getClass(), "pdddt_tm", term44491);
        setIntField(term44296, term44296.getClass(), "nblss_ltt_stts", 480909331);
        setIntField(term44296, term44296.getClass(), "nblss_ltt_tckt", -2024983877);
        setIntField(term44296, term44296.getClass(), "nblss_ltt_is_opn", 1757149811);
        setIntField(term44296, term44296.getClass(), "nblss_ltt_prz", 1505375686);
        setIntField(term44296, term44296.getClass(), "nblss_ltt_nxt_stts", -132005524);
        setIntField(term44296, term44296.getClass(), "nblss_ltt_nxt_tckt", -1235127374);
        setField(term44296, term44296.getClass(), "my_qst_id", "lPERFqPpGz");
        setField(term44296, term44296.getClass(), "my_qst_r_qid", "jleFBTYSNb");
        setField(term44296, term44296.getClass(), "my_qst_r_knd", "WmSSWHEELj");
        setField(term44296, term44296.getClass(), "my_qst_r_vl", "ggFhMyQvdw");
        setField(term44296, term44296.getClass(), "my_qst_r_nflg", "vZpMxQNHKu");
        setField(term44296, term44296.getClass(), "my_ccd_r_qid", "QLMSDWYwBC");
        setField(term44296, term44296.getClass(), "my_ccd_r_hnd", "feyxNWUenU");
        setField(term44296, term44296.getClass(), "my_ccd_r_vp", "qvqwmSUIiP");
        setField(term44296, term44296.getClass(), "cmd", "eNOEXYoAtV");
        setField(term44296, term44296.getClass(), "req_id", "SNqwfZGLFh");
        setField(term44296, term44296.getClass(), "stat", "sMqpXbgEga");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nYJlDpoMcL";
        callMethod(klass, "setCrwd_value", argTypes, term44296, args);
    }

};


