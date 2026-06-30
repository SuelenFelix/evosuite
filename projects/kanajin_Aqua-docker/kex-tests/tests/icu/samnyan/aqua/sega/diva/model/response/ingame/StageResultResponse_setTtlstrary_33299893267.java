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

public class StageResultResponse_setTtlstrary_33299893267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48631;

    public StageResultResponse_setTtlstrary_33299893267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48631 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term48826 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48827 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48831 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term48631, term48631.getClass(), "chllng_kind", -1268483887);
        setIntField(term48631, term48631.getClass(), "lv_num_old", -1929689681);
        setIntField(term48631, term48631.getClass(), "lv_pnt_old", -91240911);
        setIntField(term48631, term48631.getClass(), "lv_num", -321227954);
        setIntField(term48631, term48631.getClass(), "lv_pnt", 373810833);
        setField(term48631, term48631.getClass(), "lv_str", "sCLAuKoiVL");
        setIntField(term48631, term48631.getClass(), "lv_efct_id", -215979293);
        setIntField(term48631, term48631.getClass(), "lv_plt_id", -19567889);
        setIntField(term48631, term48631.getClass(), "vcld_pts", 693500318);
        setIntField(term48631, term48631.getClass(), "prsnt_vcld_pts", 1702404702);
        setIntField(term48631, term48631.getClass(), "cnp_cid", 1141592999);
        setIntField(term48631, term48631.getClass(), "cnp_val", 848113442);
        setField(term48631, term48631.getClass(), "cnp_sp", "pFWiDEnVnU");
        setField(term48631, term48631.getClass(), "crwd_kind", "NeEetzFhTt");
        setField(term48631, term48631.getClass(), "crwd_value", "UgvuvUxKed");
        setField(term48631, term48631.getClass(), "crwd_str_0", "ljBBMsQpaM");
        setField(term48631, term48631.getClass(), "crwd_str_1", "hHNIOlOzJc");
        setIntField(term48631, term48631.getClass(), "cerwd_kind", 793974213);
        setIntField(term48631, term48631.getClass(), "cerwd_value", 722546287);
        setField(term48631, term48631.getClass(), "cerwd_str_0", "ALRSeULyWV");
        setField(term48631, term48631.getClass(), "cerwd_str_1", "WVhzXHdyFF");
        setField(term48631, term48631.getClass(), "ttl_str_ary", "GLAWYoxkyw");
        setField(term48631, term48631.getClass(), "ttl_plt_id_ary", "cfpPTNNVnW");
        setField(term48631, term48631.getClass(), "ttl_desc_ary", "VPkEFShMUB");
        setField(term48631, term48631.getClass(), "skin_id_ary", "ZIgHysIFcL");
        setField(term48631, term48631.getClass(), "skin_name_ary", "ofSfQtWBjp");
        setField(term48631, term48631.getClass(), "skin_illust_ary", "vkbIpZOlcY");
        setField(term48631, term48631.getClass(), "skin_desc_ary", "XbAeosZekH");
        setIntField(term48631, term48631.getClass(), "pdddt_flg", -2060284160);
        setIntField(term48827, term48827.getClass(), "year", 2018);
        setShortField(term48827, term48827.getClass(), "month", (short) 2);
        setShortField(term48827, term48827.getClass(), "day", (short) 14);
        setField(term48826, term48826.getClass(), "date", term48827);
        setByteField(term48831, term48831.getClass(), "hour", (byte) 2);
        setByteField(term48831, term48831.getClass(), "minute", (byte) 40);
        setByteField(term48831, term48831.getClass(), "second", (byte) 48);
        setIntField(term48831, term48831.getClass(), "nano", 371006728);
        setField(term48826, term48826.getClass(), "time", term48831);
        setField(term48631, term48631.getClass(), "pdddt_tm", term48826);
        setIntField(term48631, term48631.getClass(), "nblss_ltt_stts", -568450686);
        setIntField(term48631, term48631.getClass(), "nblss_ltt_tckt", 1314660281);
        setIntField(term48631, term48631.getClass(), "nblss_ltt_is_opn", -126399768);
        setIntField(term48631, term48631.getClass(), "nblss_ltt_prz", 318982923);
        setIntField(term48631, term48631.getClass(), "nblss_ltt_nxt_stts", -154210001);
        setIntField(term48631, term48631.getClass(), "nblss_ltt_nxt_tckt", 621910137);
        setField(term48631, term48631.getClass(), "my_qst_id", "EvGPvjswTz");
        setField(term48631, term48631.getClass(), "my_qst_r_qid", "lbnnCkEZgE");
        setField(term48631, term48631.getClass(), "my_qst_r_knd", "YaWdTQZkTw");
        setField(term48631, term48631.getClass(), "my_qst_r_vl", "QqsjlsXtmm");
        setField(term48631, term48631.getClass(), "my_qst_r_nflg", "FuWUjAYXxz");
        setField(term48631, term48631.getClass(), "my_ccd_r_qid", "rKIvvYydou");
        setField(term48631, term48631.getClass(), "my_ccd_r_hnd", "KNgeIkQoef");
        setField(term48631, term48631.getClass(), "my_ccd_r_vp", "MeMWAHyjMR");
        setField(term48631, term48631.getClass(), "cmd", "lTuLOcnSnJ");
        setField(term48631, term48631.getClass(), "req_id", "govbBrRstA");
        setField(term48631, term48631.getClass(), "stat", "zSMUNzRRyM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aKwJiIZSjJ";
        callMethod(klass, "setTtl_str_ary", argTypes, term48631, args);
    }

};


