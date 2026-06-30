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

public class StageResultResponse_getSkindescary_4700540729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25515;

    public StageResultResponse_getSkindescary_4700540729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25515 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term25710 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25711 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25715 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term25515, term25515.getClass(), "chllng_kind", 1091954101);
        setIntField(term25515, term25515.getClass(), "lv_num_old", 1895143076);
        setIntField(term25515, term25515.getClass(), "lv_pnt_old", 1981860404);
        setIntField(term25515, term25515.getClass(), "lv_num", 732174235);
        setIntField(term25515, term25515.getClass(), "lv_pnt", 470895808);
        setField(term25515, term25515.getClass(), "lv_str", "kwteHWzwcc");
        setIntField(term25515, term25515.getClass(), "lv_efct_id", 1787325291);
        setIntField(term25515, term25515.getClass(), "lv_plt_id", 1470349147);
        setIntField(term25515, term25515.getClass(), "vcld_pts", -255317272);
        setIntField(term25515, term25515.getClass(), "prsnt_vcld_pts", -706253892);
        setIntField(term25515, term25515.getClass(), "cnp_cid", -1341439819);
        setIntField(term25515, term25515.getClass(), "cnp_val", -728760750);
        setField(term25515, term25515.getClass(), "cnp_sp", "uMsWXqNhln");
        setField(term25515, term25515.getClass(), "crwd_kind", "MAnhIPOtHL");
        setField(term25515, term25515.getClass(), "crwd_value", "dikKjYjmRO");
        setField(term25515, term25515.getClass(), "crwd_str_0", "GJnnMDVnEP");
        setField(term25515, term25515.getClass(), "crwd_str_1", "zSMVllDpfk");
        setIntField(term25515, term25515.getClass(), "cerwd_kind", -1617383807);
        setIntField(term25515, term25515.getClass(), "cerwd_value", -1244386281);
        setField(term25515, term25515.getClass(), "cerwd_str_0", "iptRXVDoYE");
        setField(term25515, term25515.getClass(), "cerwd_str_1", "kucsxnvbES");
        setField(term25515, term25515.getClass(), "ttl_str_ary", "IdGzDFfcZf");
        setField(term25515, term25515.getClass(), "ttl_plt_id_ary", "KDdRNhZmnU");
        setField(term25515, term25515.getClass(), "ttl_desc_ary", "iMsqJaKlDC");
        setField(term25515, term25515.getClass(), "skin_id_ary", "aPkGHbZyjj");
        setField(term25515, term25515.getClass(), "skin_name_ary", "nSWdsVyJRI");
        setField(term25515, term25515.getClass(), "skin_illust_ary", "JBOPGgGKnc");
        setField(term25515, term25515.getClass(), "skin_desc_ary", "GlPTiCMCGP");
        setIntField(term25515, term25515.getClass(), "pdddt_flg", -885788574);
        setIntField(term25711, term25711.getClass(), "year", 2021);
        setShortField(term25711, term25711.getClass(), "month", (short) 8);
        setShortField(term25711, term25711.getClass(), "day", (short) 12);
        setField(term25710, term25710.getClass(), "date", term25711);
        setByteField(term25715, term25715.getClass(), "hour", (byte) 2);
        setByteField(term25715, term25715.getClass(), "minute", (byte) 17);
        setByteField(term25715, term25715.getClass(), "second", (byte) 51);
        setIntField(term25715, term25715.getClass(), "nano", 207375141);
        setField(term25710, term25710.getClass(), "time", term25715);
        setField(term25515, term25515.getClass(), "pdddt_tm", term25710);
        setIntField(term25515, term25515.getClass(), "nblss_ltt_stts", -865722613);
        setIntField(term25515, term25515.getClass(), "nblss_ltt_tckt", -1551355284);
        setIntField(term25515, term25515.getClass(), "nblss_ltt_is_opn", -1381970335);
        setIntField(term25515, term25515.getClass(), "nblss_ltt_prz", 1213549815);
        setIntField(term25515, term25515.getClass(), "nblss_ltt_nxt_stts", -1518419301);
        setIntField(term25515, term25515.getClass(), "nblss_ltt_nxt_tckt", 674879025);
        setField(term25515, term25515.getClass(), "my_qst_id", "jlcBpLoWfd");
        setField(term25515, term25515.getClass(), "my_qst_r_qid", "oYymmLqbfJ");
        setField(term25515, term25515.getClass(), "my_qst_r_knd", "YaDWphDOSz");
        setField(term25515, term25515.getClass(), "my_qst_r_vl", "nnnmCgFBLw");
        setField(term25515, term25515.getClass(), "my_qst_r_nflg", "hSSCyNEhyH");
        setField(term25515, term25515.getClass(), "my_ccd_r_qid", "jDFNSuvZqm");
        setField(term25515, term25515.getClass(), "my_ccd_r_hnd", "pLvkKHqNYX");
        setField(term25515, term25515.getClass(), "my_ccd_r_vp", "PwqnuJJwjR");
        setField(term25515, term25515.getClass(), "cmd", "NFkbBiPeiw");
        setField(term25515, term25515.getClass(), "req_id", "tlRvilQyjJ");
        setField(term25515, term25515.getClass(), "stat", "gwTUlYNpjM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkin_desc_ary", argTypes, term25515, args);
    }

};


