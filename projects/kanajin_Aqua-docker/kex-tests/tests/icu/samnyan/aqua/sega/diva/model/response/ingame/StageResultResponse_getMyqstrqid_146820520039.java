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

public class StageResultResponse_getMyqstrqid_146820520039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31545;

    public StageResultResponse_getMyqstrqid_146820520039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31545 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term31740 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31741 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31745 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term31545, term31545.getClass(), "chllng_kind", 1631305277);
        setIntField(term31545, term31545.getClass(), "lv_num_old", 162113491);
        setIntField(term31545, term31545.getClass(), "lv_pnt_old", -932147928);
        setIntField(term31545, term31545.getClass(), "lv_num", 487369012);
        setIntField(term31545, term31545.getClass(), "lv_pnt", -179238712);
        setField(term31545, term31545.getClass(), "lv_str", "vbSWeJWOQh");
        setIntField(term31545, term31545.getClass(), "lv_efct_id", -2018735535);
        setIntField(term31545, term31545.getClass(), "lv_plt_id", -658524954);
        setIntField(term31545, term31545.getClass(), "vcld_pts", -2009613557);
        setIntField(term31545, term31545.getClass(), "prsnt_vcld_pts", 654195547);
        setIntField(term31545, term31545.getClass(), "cnp_cid", 1622857008);
        setIntField(term31545, term31545.getClass(), "cnp_val", 934338954);
        setField(term31545, term31545.getClass(), "cnp_sp", "hyvFdAvkOr");
        setField(term31545, term31545.getClass(), "crwd_kind", "ewbQRtustW");
        setField(term31545, term31545.getClass(), "crwd_value", "cABEHYBnys");
        setField(term31545, term31545.getClass(), "crwd_str_0", "EhlWSobaco");
        setField(term31545, term31545.getClass(), "crwd_str_1", "hEuycunsSe");
        setIntField(term31545, term31545.getClass(), "cerwd_kind", 598635505);
        setIntField(term31545, term31545.getClass(), "cerwd_value", -944986533);
        setField(term31545, term31545.getClass(), "cerwd_str_0", "IMFzXhpNCx");
        setField(term31545, term31545.getClass(), "cerwd_str_1", "xAtFmANjwD");
        setField(term31545, term31545.getClass(), "ttl_str_ary", "ICysuFllEZ");
        setField(term31545, term31545.getClass(), "ttl_plt_id_ary", "cGQJTTxcXr");
        setField(term31545, term31545.getClass(), "ttl_desc_ary", "aKaqvssiby");
        setField(term31545, term31545.getClass(), "skin_id_ary", "tTVbtBVAfo");
        setField(term31545, term31545.getClass(), "skin_name_ary", "cjaaJUnNCR");
        setField(term31545, term31545.getClass(), "skin_illust_ary", "ETbxNuJLii");
        setField(term31545, term31545.getClass(), "skin_desc_ary", "YJhnPtWtJR");
        setIntField(term31545, term31545.getClass(), "pdddt_flg", 1894454926);
        setIntField(term31741, term31741.getClass(), "year", 2023);
        setShortField(term31741, term31741.getClass(), "month", (short) 7);
        setShortField(term31741, term31741.getClass(), "day", (short) 16);
        setField(term31740, term31740.getClass(), "date", term31741);
        setByteField(term31745, term31745.getClass(), "hour", (byte) 3);
        setByteField(term31745, term31745.getClass(), "minute", (byte) 1);
        setByteField(term31745, term31745.getClass(), "second", (byte) 19);
        setIntField(term31745, term31745.getClass(), "nano", 488629554);
        setField(term31740, term31740.getClass(), "time", term31745);
        setField(term31545, term31545.getClass(), "pdddt_tm", term31740);
        setIntField(term31545, term31545.getClass(), "nblss_ltt_stts", 1415142780);
        setIntField(term31545, term31545.getClass(), "nblss_ltt_tckt", -574105759);
        setIntField(term31545, term31545.getClass(), "nblss_ltt_is_opn", -1165271567);
        setIntField(term31545, term31545.getClass(), "nblss_ltt_prz", 376834234);
        setIntField(term31545, term31545.getClass(), "nblss_ltt_nxt_stts", -1911972560);
        setIntField(term31545, term31545.getClass(), "nblss_ltt_nxt_tckt", -642716895);
        setField(term31545, term31545.getClass(), "my_qst_id", "xzGnrvbExX");
        setField(term31545, term31545.getClass(), "my_qst_r_qid", "LFZNDELxUZ");
        setField(term31545, term31545.getClass(), "my_qst_r_knd", "GNIVsSTglt");
        setField(term31545, term31545.getClass(), "my_qst_r_vl", "mzPebFiUSP");
        setField(term31545, term31545.getClass(), "my_qst_r_nflg", "HvbkjsQyDy");
        setField(term31545, term31545.getClass(), "my_ccd_r_qid", "wzSukELQFL");
        setField(term31545, term31545.getClass(), "my_ccd_r_hnd", "VZyeaOWYEj");
        setField(term31545, term31545.getClass(), "my_ccd_r_vp", "PErxMBQSUv");
        setField(term31545, term31545.getClass(), "cmd", "KZQwbvujui");
        setField(term31545, term31545.getClass(), "req_id", "JPUZuGxKlI");
        setField(term31545, term31545.getClass(), "stat", "xqIbVsUspl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMy_qst_r_qid", argTypes, term31545, args);
    }

};


