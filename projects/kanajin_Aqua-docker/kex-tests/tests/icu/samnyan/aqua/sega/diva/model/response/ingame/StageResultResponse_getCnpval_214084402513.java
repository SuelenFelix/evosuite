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

public class StageResultResponse_getCnpval_214084402513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15867;

    public StageResultResponse_getCnpval_214084402513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15867 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term16062 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16063 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16067 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term15867, term15867.getClass(), "chllng_kind", -1656687479);
        setIntField(term15867, term15867.getClass(), "lv_num_old", -249614216);
        setIntField(term15867, term15867.getClass(), "lv_pnt_old", 1870727665);
        setIntField(term15867, term15867.getClass(), "lv_num", -519881101);
        setIntField(term15867, term15867.getClass(), "lv_pnt", -680920524);
        setField(term15867, term15867.getClass(), "lv_str", "CVRGEomOth");
        setIntField(term15867, term15867.getClass(), "lv_efct_id", -916335264);
        setIntField(term15867, term15867.getClass(), "lv_plt_id", -919416536);
        setIntField(term15867, term15867.getClass(), "vcld_pts", -43417861);
        setIntField(term15867, term15867.getClass(), "prsnt_vcld_pts", -1533843432);
        setIntField(term15867, term15867.getClass(), "cnp_cid", -123338791);
        setIntField(term15867, term15867.getClass(), "cnp_val", -1467089634);
        setField(term15867, term15867.getClass(), "cnp_sp", "vSeruUyNWX");
        setField(term15867, term15867.getClass(), "crwd_kind", "UkKvaeJfEC");
        setField(term15867, term15867.getClass(), "crwd_value", "WPxXsahPRq");
        setField(term15867, term15867.getClass(), "crwd_str_0", "IENRuqmwUU");
        setField(term15867, term15867.getClass(), "crwd_str_1", "GsWxOwXvSu");
        setIntField(term15867, term15867.getClass(), "cerwd_kind", 413548937);
        setIntField(term15867, term15867.getClass(), "cerwd_value", 1901317214);
        setField(term15867, term15867.getClass(), "cerwd_str_0", "bKBSncrMEZ");
        setField(term15867, term15867.getClass(), "cerwd_str_1", "yeSXGqQExb");
        setField(term15867, term15867.getClass(), "ttl_str_ary", "uXYcXVYJZM");
        setField(term15867, term15867.getClass(), "ttl_plt_id_ary", "BJhjdJUhkz");
        setField(term15867, term15867.getClass(), "ttl_desc_ary", "cdHYQDgUZR");
        setField(term15867, term15867.getClass(), "skin_id_ary", "KAORSSPSeV");
        setField(term15867, term15867.getClass(), "skin_name_ary", "UimMMORkzd");
        setField(term15867, term15867.getClass(), "skin_illust_ary", "huVIXUWLtI");
        setField(term15867, term15867.getClass(), "skin_desc_ary", "vhKzFyKPOT");
        setIntField(term15867, term15867.getClass(), "pdddt_flg", 1166710220);
        setIntField(term16063, term16063.getClass(), "year", 2012);
        setShortField(term16063, term16063.getClass(), "month", (short) 9);
        setShortField(term16063, term16063.getClass(), "day", (short) 11);
        setField(term16062, term16062.getClass(), "date", term16063);
        setByteField(term16067, term16067.getClass(), "hour", (byte) 22);
        setByteField(term16067, term16067.getClass(), "minute", (byte) 10);
        setByteField(term16067, term16067.getClass(), "second", (byte) 8);
        setIntField(term16067, term16067.getClass(), "nano", 380008862);
        setField(term16062, term16062.getClass(), "time", term16067);
        setField(term15867, term15867.getClass(), "pdddt_tm", term16062);
        setIntField(term15867, term15867.getClass(), "nblss_ltt_stts", -1070592289);
        setIntField(term15867, term15867.getClass(), "nblss_ltt_tckt", -1464172784);
        setIntField(term15867, term15867.getClass(), "nblss_ltt_is_opn", 32185364);
        setIntField(term15867, term15867.getClass(), "nblss_ltt_prz", 1768204942);
        setIntField(term15867, term15867.getClass(), "nblss_ltt_nxt_stts", 1252951645);
        setIntField(term15867, term15867.getClass(), "nblss_ltt_nxt_tckt", 574481092);
        setField(term15867, term15867.getClass(), "my_qst_id", "nQhIgWXdRc");
        setField(term15867, term15867.getClass(), "my_qst_r_qid", "EusenEbIoF");
        setField(term15867, term15867.getClass(), "my_qst_r_knd", "SScVQYSvWH");
        setField(term15867, term15867.getClass(), "my_qst_r_vl", "MnovcqFhCl");
        setField(term15867, term15867.getClass(), "my_qst_r_nflg", "qYtAeLzOhW");
        setField(term15867, term15867.getClass(), "my_ccd_r_qid", "tJzmOfcUnY");
        setField(term15867, term15867.getClass(), "my_ccd_r_hnd", "TKlccZUpjz");
        setField(term15867, term15867.getClass(), "my_ccd_r_vp", "GGzwMoHZXC");
        setField(term15867, term15867.getClass(), "cmd", "IpmgwHTgnG");
        setField(term15867, term15867.getClass(), "req_id", "tIpkeYIezR");
        setField(term15867, term15867.getClass(), "stat", "YkZtEtthvz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCnp_val", argTypes, term15867, args);
    }

};


