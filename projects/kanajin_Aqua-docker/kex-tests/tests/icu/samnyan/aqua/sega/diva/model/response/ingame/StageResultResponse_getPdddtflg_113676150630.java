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

public class StageResultResponse_getPdddtflg_113676150630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26118;

    public StageResultResponse_getPdddtflg_113676150630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26118 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term26313 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26314 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26318 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term26118, term26118.getClass(), "chllng_kind", -1538936030);
        setIntField(term26118, term26118.getClass(), "lv_num_old", -752870423);
        setIntField(term26118, term26118.getClass(), "lv_pnt_old", -1698809299);
        setIntField(term26118, term26118.getClass(), "lv_num", 401512128);
        setIntField(term26118, term26118.getClass(), "lv_pnt", -2069930777);
        setField(term26118, term26118.getClass(), "lv_str", "uXYojRmxrM");
        setIntField(term26118, term26118.getClass(), "lv_efct_id", 1543696412);
        setIntField(term26118, term26118.getClass(), "lv_plt_id", -1385748168);
        setIntField(term26118, term26118.getClass(), "vcld_pts", -270592367);
        setIntField(term26118, term26118.getClass(), "prsnt_vcld_pts", 178847646);
        setIntField(term26118, term26118.getClass(), "cnp_cid", 273590437);
        setIntField(term26118, term26118.getClass(), "cnp_val", -348612876);
        setField(term26118, term26118.getClass(), "cnp_sp", "cxRwRcodud");
        setField(term26118, term26118.getClass(), "crwd_kind", "GDGBPlYeLn");
        setField(term26118, term26118.getClass(), "crwd_value", "jdQANIXSTq");
        setField(term26118, term26118.getClass(), "crwd_str_0", "stVcZLTNpu");
        setField(term26118, term26118.getClass(), "crwd_str_1", "LgXdqWrsLL");
        setIntField(term26118, term26118.getClass(), "cerwd_kind", 1302807565);
        setIntField(term26118, term26118.getClass(), "cerwd_value", -838848221);
        setField(term26118, term26118.getClass(), "cerwd_str_0", "bbHWyibNmy");
        setField(term26118, term26118.getClass(), "cerwd_str_1", "vYYOYhWMWZ");
        setField(term26118, term26118.getClass(), "ttl_str_ary", "FLQJOzEXff");
        setField(term26118, term26118.getClass(), "ttl_plt_id_ary", "qlaIVJBSfQ");
        setField(term26118, term26118.getClass(), "ttl_desc_ary", "lYvIWBFFsq");
        setField(term26118, term26118.getClass(), "skin_id_ary", "tThwsqWKcE");
        setField(term26118, term26118.getClass(), "skin_name_ary", "bkSgsDrkCN");
        setField(term26118, term26118.getClass(), "skin_illust_ary", "hwjlcimgJH");
        setField(term26118, term26118.getClass(), "skin_desc_ary", "TLxQzxvizR");
        setIntField(term26118, term26118.getClass(), "pdddt_flg", 1163761623);
        setIntField(term26314, term26314.getClass(), "year", 2025);
        setShortField(term26314, term26314.getClass(), "month", (short) 11);
        setShortField(term26314, term26314.getClass(), "day", (short) 3);
        setField(term26313, term26313.getClass(), "date", term26314);
        setByteField(term26318, term26318.getClass(), "hour", (byte) 21);
        setByteField(term26318, term26318.getClass(), "minute", (byte) 24);
        setByteField(term26318, term26318.getClass(), "second", (byte) 23);
        setIntField(term26318, term26318.getClass(), "nano", 210986721);
        setField(term26313, term26313.getClass(), "time", term26318);
        setField(term26118, term26118.getClass(), "pdddt_tm", term26313);
        setIntField(term26118, term26118.getClass(), "nblss_ltt_stts", 718742281);
        setIntField(term26118, term26118.getClass(), "nblss_ltt_tckt", 1532723756);
        setIntField(term26118, term26118.getClass(), "nblss_ltt_is_opn", -124088550);
        setIntField(term26118, term26118.getClass(), "nblss_ltt_prz", 777492093);
        setIntField(term26118, term26118.getClass(), "nblss_ltt_nxt_stts", 1414025609);
        setIntField(term26118, term26118.getClass(), "nblss_ltt_nxt_tckt", 255145822);
        setField(term26118, term26118.getClass(), "my_qst_id", "uUgJfKAzDM");
        setField(term26118, term26118.getClass(), "my_qst_r_qid", "gZPZNkweEp");
        setField(term26118, term26118.getClass(), "my_qst_r_knd", "vfennwtmqe");
        setField(term26118, term26118.getClass(), "my_qst_r_vl", "zZxoNkohbw");
        setField(term26118, term26118.getClass(), "my_qst_r_nflg", "DQrjPcLysX");
        setField(term26118, term26118.getClass(), "my_ccd_r_qid", "VWPFyrpmmb");
        setField(term26118, term26118.getClass(), "my_ccd_r_hnd", "gYYKrIeThw");
        setField(term26118, term26118.getClass(), "my_ccd_r_vp", "UsxeLMVkAK");
        setField(term26118, term26118.getClass(), "cmd", "ITrhiKKzcb");
        setField(term26118, term26118.getClass(), "req_id", "qMKmSzOQXg");
        setField(term26118, term26118.getClass(), "stat", "CURQCMkqbZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPdddt_flg", argTypes, term26118, args);
    }

};


