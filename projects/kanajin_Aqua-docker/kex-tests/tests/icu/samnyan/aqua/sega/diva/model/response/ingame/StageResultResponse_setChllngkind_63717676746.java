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
import java.lang.Integer;

public class StageResultResponse_setChllngkind_63717676746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35766;
     Object term36109;

    public StageResultResponse_setChllngkind_63717676746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35766 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term35961 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35962 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35966 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term35766, term35766.getClass(), "chllng_kind", -1489991025);
        setIntField(term35766, term35766.getClass(), "lv_num_old", -1542979444);
        setIntField(term35766, term35766.getClass(), "lv_pnt_old", -1130401612);
        setIntField(term35766, term35766.getClass(), "lv_num", -316771104);
        setIntField(term35766, term35766.getClass(), "lv_pnt", -1374527319);
        setField(term35766, term35766.getClass(), "lv_str", "lnJvDbbuwo");
        setIntField(term35766, term35766.getClass(), "lv_efct_id", -1735276919);
        setIntField(term35766, term35766.getClass(), "lv_plt_id", -712023865);
        setIntField(term35766, term35766.getClass(), "vcld_pts", 613256157);
        setIntField(term35766, term35766.getClass(), "prsnt_vcld_pts", 454242689);
        setIntField(term35766, term35766.getClass(), "cnp_cid", 1798354517);
        setIntField(term35766, term35766.getClass(), "cnp_val", -1495693617);
        setField(term35766, term35766.getClass(), "cnp_sp", "KExnWkKGvF");
        setField(term35766, term35766.getClass(), "crwd_kind", "luGUNfvmKk");
        setField(term35766, term35766.getClass(), "crwd_value", "oOUHomyJff");
        setField(term35766, term35766.getClass(), "crwd_str_0", "KnnoLMOuur");
        setField(term35766, term35766.getClass(), "crwd_str_1", "buRpVghIvt");
        setIntField(term35766, term35766.getClass(), "cerwd_kind", -890538258);
        setIntField(term35766, term35766.getClass(), "cerwd_value", -1085899912);
        setField(term35766, term35766.getClass(), "cerwd_str_0", "oTGxFdiaIW");
        setField(term35766, term35766.getClass(), "cerwd_str_1", "jlyFvaZlmv");
        setField(term35766, term35766.getClass(), "ttl_str_ary", "sofyLEfomV");
        setField(term35766, term35766.getClass(), "ttl_plt_id_ary", "zHcDSJHKAb");
        setField(term35766, term35766.getClass(), "ttl_desc_ary", "WRIQkTdeMl");
        setField(term35766, term35766.getClass(), "skin_id_ary", "rLSEheWsHd");
        setField(term35766, term35766.getClass(), "skin_name_ary", "DoUKDhlGCY");
        setField(term35766, term35766.getClass(), "skin_illust_ary", "IeoToWsQWU");
        setField(term35766, term35766.getClass(), "skin_desc_ary", "QxiiHtQAzN");
        setIntField(term35766, term35766.getClass(), "pdddt_flg", -1458980236);
        setIntField(term35962, term35962.getClass(), "year", 2017);
        setShortField(term35962, term35962.getClass(), "month", (short) 4);
        setShortField(term35962, term35962.getClass(), "day", (short) 3);
        setField(term35961, term35961.getClass(), "date", term35962);
        setByteField(term35966, term35966.getClass(), "hour", (byte) 6);
        setByteField(term35966, term35966.getClass(), "minute", (byte) 51);
        setByteField(term35966, term35966.getClass(), "second", (byte) 10);
        setIntField(term35966, term35966.getClass(), "nano", 316377166);
        setField(term35961, term35961.getClass(), "time", term35966);
        setField(term35766, term35766.getClass(), "pdddt_tm", term35961);
        setIntField(term35766, term35766.getClass(), "nblss_ltt_stts", 890505372);
        setIntField(term35766, term35766.getClass(), "nblss_ltt_tckt", 2044137055);
        setIntField(term35766, term35766.getClass(), "nblss_ltt_is_opn", -1452324619);
        setIntField(term35766, term35766.getClass(), "nblss_ltt_prz", -1121709274);
        setIntField(term35766, term35766.getClass(), "nblss_ltt_nxt_stts", -532304223);
        setIntField(term35766, term35766.getClass(), "nblss_ltt_nxt_tckt", 666218293);
        setField(term35766, term35766.getClass(), "my_qst_id", "gQgTBlRIvX");
        setField(term35766, term35766.getClass(), "my_qst_r_qid", "ulKaKnANzj");
        setField(term35766, term35766.getClass(), "my_qst_r_knd", "ABwhdjjeJi");
        setField(term35766, term35766.getClass(), "my_qst_r_vl", "KKEcpYXNZV");
        setField(term35766, term35766.getClass(), "my_qst_r_nflg", "shLHFznysy");
        setField(term35766, term35766.getClass(), "my_ccd_r_qid", "YCKIloBHLj");
        setField(term35766, term35766.getClass(), "my_ccd_r_hnd", "qUWDhAeFJY");
        setField(term35766, term35766.getClass(), "my_ccd_r_vp", "wboNBMhRjP");
        setField(term35766, term35766.getClass(), "cmd", "HZODpafOGe");
        setField(term35766, term35766.getClass(), "req_id", "dUTYEKtTfQ");
        setField(term35766, term35766.getClass(), "stat", "HUtbHklGel");
        term36109 = new Integer(1737876343);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term36109;
        callMethod(klass, "setChllng_kind", argTypes, term35766, args);
    }

};


