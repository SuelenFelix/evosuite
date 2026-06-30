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

public class StageResultResponse_setLvpltid_69503328153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40021;
     Object term40364;

    public StageResultResponse_setLvpltid_69503328153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40021 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term40216 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40217 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40221 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term40021, term40021.getClass(), "chllng_kind", 1077647088);
        setIntField(term40021, term40021.getClass(), "lv_num_old", -705176810);
        setIntField(term40021, term40021.getClass(), "lv_pnt_old", -1584779593);
        setIntField(term40021, term40021.getClass(), "lv_num", 303007547);
        setIntField(term40021, term40021.getClass(), "lv_pnt", 1498738343);
        setField(term40021, term40021.getClass(), "lv_str", "fSLHLeuNoa");
        setIntField(term40021, term40021.getClass(), "lv_efct_id", -1635571857);
        setIntField(term40021, term40021.getClass(), "lv_plt_id", 1407309162);
        setIntField(term40021, term40021.getClass(), "vcld_pts", -534033672);
        setIntField(term40021, term40021.getClass(), "prsnt_vcld_pts", -1162790806);
        setIntField(term40021, term40021.getClass(), "cnp_cid", -1264595049);
        setIntField(term40021, term40021.getClass(), "cnp_val", -2058884635);
        setField(term40021, term40021.getClass(), "cnp_sp", "IwgPFurObw");
        setField(term40021, term40021.getClass(), "crwd_kind", "WLaHlrYQyz");
        setField(term40021, term40021.getClass(), "crwd_value", "CaeIUTuUFo");
        setField(term40021, term40021.getClass(), "crwd_str_0", "rzoDGjHkzG");
        setField(term40021, term40021.getClass(), "crwd_str_1", "NsphHxYiuC");
        setIntField(term40021, term40021.getClass(), "cerwd_kind", 1064185088);
        setIntField(term40021, term40021.getClass(), "cerwd_value", -1249782654);
        setField(term40021, term40021.getClass(), "cerwd_str_0", "XYJztkznbY");
        setField(term40021, term40021.getClass(), "cerwd_str_1", "NeTiWVoyjZ");
        setField(term40021, term40021.getClass(), "ttl_str_ary", "CGeclMyIOP");
        setField(term40021, term40021.getClass(), "ttl_plt_id_ary", "yyWOYvIBsp");
        setField(term40021, term40021.getClass(), "ttl_desc_ary", "mmpgARMYFV");
        setField(term40021, term40021.getClass(), "skin_id_ary", "NUqhsZprdZ");
        setField(term40021, term40021.getClass(), "skin_name_ary", "jkzgCqWJrA");
        setField(term40021, term40021.getClass(), "skin_illust_ary", "rawiXxuyRn");
        setField(term40021, term40021.getClass(), "skin_desc_ary", "ZyAecZGope");
        setIntField(term40021, term40021.getClass(), "pdddt_flg", 399302934);
        setIntField(term40217, term40217.getClass(), "year", 2011);
        setShortField(term40217, term40217.getClass(), "month", (short) 6);
        setShortField(term40217, term40217.getClass(), "day", (short) 26);
        setField(term40216, term40216.getClass(), "date", term40217);
        setByteField(term40221, term40221.getClass(), "hour", (byte) 22);
        setByteField(term40221, term40221.getClass(), "minute", (byte) 39);
        setByteField(term40221, term40221.getClass(), "second", (byte) 11);
        setIntField(term40221, term40221.getClass(), "nano", 686293604);
        setField(term40216, term40216.getClass(), "time", term40221);
        setField(term40021, term40021.getClass(), "pdddt_tm", term40216);
        setIntField(term40021, term40021.getClass(), "nblss_ltt_stts", -1823255084);
        setIntField(term40021, term40021.getClass(), "nblss_ltt_tckt", 793345010);
        setIntField(term40021, term40021.getClass(), "nblss_ltt_is_opn", -2092117838);
        setIntField(term40021, term40021.getClass(), "nblss_ltt_prz", 1524590776);
        setIntField(term40021, term40021.getClass(), "nblss_ltt_nxt_stts", 1523896653);
        setIntField(term40021, term40021.getClass(), "nblss_ltt_nxt_tckt", -1731921726);
        setField(term40021, term40021.getClass(), "my_qst_id", "uYnmxkwLfB");
        setField(term40021, term40021.getClass(), "my_qst_r_qid", "RVZTQxYOUO");
        setField(term40021, term40021.getClass(), "my_qst_r_knd", "tydPpKxAbv");
        setField(term40021, term40021.getClass(), "my_qst_r_vl", "CJxQpJUfLJ");
        setField(term40021, term40021.getClass(), "my_qst_r_nflg", "NUUjAyqOva");
        setField(term40021, term40021.getClass(), "my_ccd_r_qid", "EoAMIIUdDX");
        setField(term40021, term40021.getClass(), "my_ccd_r_hnd", "OATNwRncsv");
        setField(term40021, term40021.getClass(), "my_ccd_r_vp", "rACmzcmIPm");
        setField(term40021, term40021.getClass(), "cmd", "OCtePrLDhe");
        setField(term40021, term40021.getClass(), "req_id", "yqEphNxUPZ");
        setField(term40021, term40021.getClass(), "stat", "mJJxTuZuKO");
        term40364 = new Integer(919994471);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term40364;
        callMethod(klass, "setLv_plt_id", argTypes, term40021, args);
    }

};


