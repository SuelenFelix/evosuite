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

public class StageResultResponse_setTtlpltidary_200076479368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49256;

    public StageResultResponse_setTtlpltidary_200076479368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49256 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term49451 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49452 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49456 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term49256, term49256.getClass(), "chllng_kind", 241533020);
        setIntField(term49256, term49256.getClass(), "lv_num_old", 2081679151);
        setIntField(term49256, term49256.getClass(), "lv_pnt_old", -1030167086);
        setIntField(term49256, term49256.getClass(), "lv_num", -434230943);
        setIntField(term49256, term49256.getClass(), "lv_pnt", 698633875);
        setField(term49256, term49256.getClass(), "lv_str", "lYbeaINKud");
        setIntField(term49256, term49256.getClass(), "lv_efct_id", 548468113);
        setIntField(term49256, term49256.getClass(), "lv_plt_id", 1701819905);
        setIntField(term49256, term49256.getClass(), "vcld_pts", 1721418943);
        setIntField(term49256, term49256.getClass(), "prsnt_vcld_pts", -111082612);
        setIntField(term49256, term49256.getClass(), "cnp_cid", 1253334988);
        setIntField(term49256, term49256.getClass(), "cnp_val", 1086709736);
        setField(term49256, term49256.getClass(), "cnp_sp", "BrwuUkkatt");
        setField(term49256, term49256.getClass(), "crwd_kind", "NjmSJhbVEM");
        setField(term49256, term49256.getClass(), "crwd_value", "aftnGRjhKN");
        setField(term49256, term49256.getClass(), "crwd_str_0", "TirWkyiCHh");
        setField(term49256, term49256.getClass(), "crwd_str_1", "lsQrIFMkgZ");
        setIntField(term49256, term49256.getClass(), "cerwd_kind", -1606698075);
        setIntField(term49256, term49256.getClass(), "cerwd_value", 90996421);
        setField(term49256, term49256.getClass(), "cerwd_str_0", "VgAyBhgBhq");
        setField(term49256, term49256.getClass(), "cerwd_str_1", "nhpssUKjpK");
        setField(term49256, term49256.getClass(), "ttl_str_ary", "lnJVsFNsCN");
        setField(term49256, term49256.getClass(), "ttl_plt_id_ary", "CUagRkEuzN");
        setField(term49256, term49256.getClass(), "ttl_desc_ary", "eWIWfWobXm");
        setField(term49256, term49256.getClass(), "skin_id_ary", "lkPJVVXhDd");
        setField(term49256, term49256.getClass(), "skin_name_ary", "OpMnUyJTrb");
        setField(term49256, term49256.getClass(), "skin_illust_ary", "ACBGZgugev");
        setField(term49256, term49256.getClass(), "skin_desc_ary", "rcbQDpUkab");
        setIntField(term49256, term49256.getClass(), "pdddt_flg", -1805802783);
        setIntField(term49452, term49452.getClass(), "year", 2025);
        setShortField(term49452, term49452.getClass(), "month", (short) 8);
        setShortField(term49452, term49452.getClass(), "day", (short) 22);
        setField(term49451, term49451.getClass(), "date", term49452);
        setByteField(term49456, term49456.getClass(), "hour", (byte) 6);
        setByteField(term49456, term49456.getClass(), "minute", (byte) 48);
        setByteField(term49456, term49456.getClass(), "second", (byte) 49);
        setIntField(term49456, term49456.getClass(), "nano", 46400229);
        setField(term49451, term49451.getClass(), "time", term49456);
        setField(term49256, term49256.getClass(), "pdddt_tm", term49451);
        setIntField(term49256, term49256.getClass(), "nblss_ltt_stts", -529831900);
        setIntField(term49256, term49256.getClass(), "nblss_ltt_tckt", 1574493440);
        setIntField(term49256, term49256.getClass(), "nblss_ltt_is_opn", 1854694585);
        setIntField(term49256, term49256.getClass(), "nblss_ltt_prz", -1260562836);
        setIntField(term49256, term49256.getClass(), "nblss_ltt_nxt_stts", 694100722);
        setIntField(term49256, term49256.getClass(), "nblss_ltt_nxt_tckt", -680529431);
        setField(term49256, term49256.getClass(), "my_qst_id", "oZAbUeXmhW");
        setField(term49256, term49256.getClass(), "my_qst_r_qid", "NDSDpOeQda");
        setField(term49256, term49256.getClass(), "my_qst_r_knd", "HlKwxzAqTg");
        setField(term49256, term49256.getClass(), "my_qst_r_vl", "xKjkdjTYfe");
        setField(term49256, term49256.getClass(), "my_qst_r_nflg", "HcfabJkuEQ");
        setField(term49256, term49256.getClass(), "my_ccd_r_qid", "JlnoFYxLfk");
        setField(term49256, term49256.getClass(), "my_ccd_r_hnd", "tMMLkDkFYW");
        setField(term49256, term49256.getClass(), "my_ccd_r_vp", "EYJXMlkLoO");
        setField(term49256, term49256.getClass(), "cmd", "qJtkJJhOSV");
        setField(term49256, term49256.getClass(), "req_id", "vQbiGKncal");
        setField(term49256, term49256.getClass(), "stat", "NTSNSiYeUu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SBTEFDmQVY";
        callMethod(klass, "setTtl_plt_id_ary", argTypes, term49256, args);
    }

};


