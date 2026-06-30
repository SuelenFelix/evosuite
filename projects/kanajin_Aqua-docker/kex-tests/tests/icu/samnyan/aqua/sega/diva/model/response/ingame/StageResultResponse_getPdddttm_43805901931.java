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

public class StageResultResponse_getPdddttm_43805901931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26721;

    public StageResultResponse_getPdddttm_43805901931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26721 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term26916 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26917 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26921 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term26721, term26721.getClass(), "chllng_kind", -573608449);
        setIntField(term26721, term26721.getClass(), "lv_num_old", -1660057757);
        setIntField(term26721, term26721.getClass(), "lv_pnt_old", 1816273440);
        setIntField(term26721, term26721.getClass(), "lv_num", -96541009);
        setIntField(term26721, term26721.getClass(), "lv_pnt", -43719302);
        setField(term26721, term26721.getClass(), "lv_str", "VZwkkQktrm");
        setIntField(term26721, term26721.getClass(), "lv_efct_id", 1024134939);
        setIntField(term26721, term26721.getClass(), "lv_plt_id", 109078154);
        setIntField(term26721, term26721.getClass(), "vcld_pts", -314165467);
        setIntField(term26721, term26721.getClass(), "prsnt_vcld_pts", 963694071);
        setIntField(term26721, term26721.getClass(), "cnp_cid", -995785731);
        setIntField(term26721, term26721.getClass(), "cnp_val", 1349815364);
        setField(term26721, term26721.getClass(), "cnp_sp", "wIuJvIvEMb");
        setField(term26721, term26721.getClass(), "crwd_kind", "EyojsbSjWT");
        setField(term26721, term26721.getClass(), "crwd_value", "szGicGyWDL");
        setField(term26721, term26721.getClass(), "crwd_str_0", "lkdvUiYwRq");
        setField(term26721, term26721.getClass(), "crwd_str_1", "XuxkPrpfND");
        setIntField(term26721, term26721.getClass(), "cerwd_kind", 2128383340);
        setIntField(term26721, term26721.getClass(), "cerwd_value", 1238598518);
        setField(term26721, term26721.getClass(), "cerwd_str_0", "OxNXeKMDje");
        setField(term26721, term26721.getClass(), "cerwd_str_1", "hGTqHomrbc");
        setField(term26721, term26721.getClass(), "ttl_str_ary", "NNMBrIWEBw");
        setField(term26721, term26721.getClass(), "ttl_plt_id_ary", "GrTaccOQzl");
        setField(term26721, term26721.getClass(), "ttl_desc_ary", "uuSYOUCVHU");
        setField(term26721, term26721.getClass(), "skin_id_ary", "DfWwbodtVw");
        setField(term26721, term26721.getClass(), "skin_name_ary", "kTbFMpVWqx");
        setField(term26721, term26721.getClass(), "skin_illust_ary", "HegRNsidFg");
        setField(term26721, term26721.getClass(), "skin_desc_ary", "udRdJkgXmH");
        setIntField(term26721, term26721.getClass(), "pdddt_flg", -558146961);
        setIntField(term26917, term26917.getClass(), "year", 2016);
        setShortField(term26917, term26917.getClass(), "month", (short) 6);
        setShortField(term26917, term26917.getClass(), "day", (short) 15);
        setField(term26916, term26916.getClass(), "date", term26917);
        setByteField(term26921, term26921.getClass(), "hour", (byte) 21);
        setByteField(term26921, term26921.getClass(), "minute", (byte) 23);
        setByteField(term26921, term26921.getClass(), "second", (byte) 23);
        setIntField(term26921, term26921.getClass(), "nano", 433372070);
        setField(term26916, term26916.getClass(), "time", term26921);
        setField(term26721, term26721.getClass(), "pdddt_tm", term26916);
        setIntField(term26721, term26721.getClass(), "nblss_ltt_stts", 1505480070);
        setIntField(term26721, term26721.getClass(), "nblss_ltt_tckt", -829088844);
        setIntField(term26721, term26721.getClass(), "nblss_ltt_is_opn", -31751777);
        setIntField(term26721, term26721.getClass(), "nblss_ltt_prz", -246967963);
        setIntField(term26721, term26721.getClass(), "nblss_ltt_nxt_stts", -1777140369);
        setIntField(term26721, term26721.getClass(), "nblss_ltt_nxt_tckt", 993627098);
        setField(term26721, term26721.getClass(), "my_qst_id", "FBCXbjHVXO");
        setField(term26721, term26721.getClass(), "my_qst_r_qid", "dIWAnvmLiC");
        setField(term26721, term26721.getClass(), "my_qst_r_knd", "CuWebzZQjZ");
        setField(term26721, term26721.getClass(), "my_qst_r_vl", "wRVaaJxKYI");
        setField(term26721, term26721.getClass(), "my_qst_r_nflg", "yOQuJXRvOo");
        setField(term26721, term26721.getClass(), "my_ccd_r_qid", "XmLHcnVsch");
        setField(term26721, term26721.getClass(), "my_ccd_r_hnd", "Yrvtdcltri");
        setField(term26721, term26721.getClass(), "my_ccd_r_vp", "RxrsjXRVcT");
        setField(term26721, term26721.getClass(), "cmd", "cfRimmJxqA");
        setField(term26721, term26721.getClass(), "req_id", "oOnRVGqFmy");
        setField(term26721, term26721.getClass(), "stat", "LaXzFIlWMk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPdddt_tm", argTypes, term26721, args);
    }

};


