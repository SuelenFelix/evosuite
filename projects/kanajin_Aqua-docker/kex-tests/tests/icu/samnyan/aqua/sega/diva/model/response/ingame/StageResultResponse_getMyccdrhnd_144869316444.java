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

public class StageResultResponse_getMyccdrhnd_144869316444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34560;

    public StageResultResponse_getMyccdrhnd_144869316444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34560 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term34755 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term34756 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34760 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term34560, term34560.getClass(), "chllng_kind", 263859424);
        setIntField(term34560, term34560.getClass(), "lv_num_old", 1436978289);
        setIntField(term34560, term34560.getClass(), "lv_pnt_old", 696225243);
        setIntField(term34560, term34560.getClass(), "lv_num", -1421649118);
        setIntField(term34560, term34560.getClass(), "lv_pnt", -511248284);
        setField(term34560, term34560.getClass(), "lv_str", "RldCZqgRbO");
        setIntField(term34560, term34560.getClass(), "lv_efct_id", 788630042);
        setIntField(term34560, term34560.getClass(), "lv_plt_id", 1430066560);
        setIntField(term34560, term34560.getClass(), "vcld_pts", 836734074);
        setIntField(term34560, term34560.getClass(), "prsnt_vcld_pts", -1747711865);
        setIntField(term34560, term34560.getClass(), "cnp_cid", 682812715);
        setIntField(term34560, term34560.getClass(), "cnp_val", -1092883950);
        setField(term34560, term34560.getClass(), "cnp_sp", "LOVugCAgJs");
        setField(term34560, term34560.getClass(), "crwd_kind", "SNmHXwCiFY");
        setField(term34560, term34560.getClass(), "crwd_value", "HZfkWoqyUW");
        setField(term34560, term34560.getClass(), "crwd_str_0", "QRwANPSyfT");
        setField(term34560, term34560.getClass(), "crwd_str_1", "DbZKLwYBgy");
        setIntField(term34560, term34560.getClass(), "cerwd_kind", 950385621);
        setIntField(term34560, term34560.getClass(), "cerwd_value", -232352320);
        setField(term34560, term34560.getClass(), "cerwd_str_0", "LnNRVsjmxw");
        setField(term34560, term34560.getClass(), "cerwd_str_1", "PlOnDkNrvX");
        setField(term34560, term34560.getClass(), "ttl_str_ary", "MltgFGldop");
        setField(term34560, term34560.getClass(), "ttl_plt_id_ary", "JCWSoxnBJs");
        setField(term34560, term34560.getClass(), "ttl_desc_ary", "vAxcpvjEEa");
        setField(term34560, term34560.getClass(), "skin_id_ary", "FCkOgIBqXE");
        setField(term34560, term34560.getClass(), "skin_name_ary", "kadRHthQRD");
        setField(term34560, term34560.getClass(), "skin_illust_ary", "cGbJSRSpNn");
        setField(term34560, term34560.getClass(), "skin_desc_ary", "MzXzaqaiHW");
        setIntField(term34560, term34560.getClass(), "pdddt_flg", -232333014);
        setIntField(term34756, term34756.getClass(), "year", 2014);
        setShortField(term34756, term34756.getClass(), "month", (short) 11);
        setShortField(term34756, term34756.getClass(), "day", (short) 8);
        setField(term34755, term34755.getClass(), "date", term34756);
        setByteField(term34760, term34760.getClass(), "hour", (byte) 8);
        setByteField(term34760, term34760.getClass(), "minute", (byte) 43);
        setByteField(term34760, term34760.getClass(), "second", (byte) 32);
        setIntField(term34760, term34760.getClass(), "nano", 154434838);
        setField(term34755, term34755.getClass(), "time", term34760);
        setField(term34560, term34560.getClass(), "pdddt_tm", term34755);
        setIntField(term34560, term34560.getClass(), "nblss_ltt_stts", -139694079);
        setIntField(term34560, term34560.getClass(), "nblss_ltt_tckt", -1602072035);
        setIntField(term34560, term34560.getClass(), "nblss_ltt_is_opn", 1902624392);
        setIntField(term34560, term34560.getClass(), "nblss_ltt_prz", 904607217);
        setIntField(term34560, term34560.getClass(), "nblss_ltt_nxt_stts", 434914590);
        setIntField(term34560, term34560.getClass(), "nblss_ltt_nxt_tckt", 1983756621);
        setField(term34560, term34560.getClass(), "my_qst_id", "jWOWtrhVkA");
        setField(term34560, term34560.getClass(), "my_qst_r_qid", "IyOhWYyaDV");
        setField(term34560, term34560.getClass(), "my_qst_r_knd", "omWrkCSFzy");
        setField(term34560, term34560.getClass(), "my_qst_r_vl", "VFYvUTgYFB");
        setField(term34560, term34560.getClass(), "my_qst_r_nflg", "BrWqhEIUUj");
        setField(term34560, term34560.getClass(), "my_ccd_r_qid", "WfUmxdiHcU");
        setField(term34560, term34560.getClass(), "my_ccd_r_hnd", "BRrftvRvmF");
        setField(term34560, term34560.getClass(), "my_ccd_r_vp", "fvoyRbZTsm");
        setField(term34560, term34560.getClass(), "cmd", "iOCnOQXWTl");
        setField(term34560, term34560.getClass(), "req_id", "ARnOWpgtAg");
        setField(term34560, term34560.getClass(), "stat", "MRrYxZoJBW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMy_ccd_r_hnd", argTypes, term34560, args);
    }

};


