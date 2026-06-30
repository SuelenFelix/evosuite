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

public class StageResultResponse_setPrsntvcldpts_214482458755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41231;
     Object term41574;

    public StageResultResponse_setPrsntvcldpts_214482458755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41231 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term41426 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term41427 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41431 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term41231, term41231.getClass(), "chllng_kind", 2132934139);
        setIntField(term41231, term41231.getClass(), "lv_num_old", -1261824381);
        setIntField(term41231, term41231.getClass(), "lv_pnt_old", 1594426218);
        setIntField(term41231, term41231.getClass(), "lv_num", -2060535464);
        setIntField(term41231, term41231.getClass(), "lv_pnt", -1242946317);
        setField(term41231, term41231.getClass(), "lv_str", "DcKqrrTdId");
        setIntField(term41231, term41231.getClass(), "lv_efct_id", -1541566235);
        setIntField(term41231, term41231.getClass(), "lv_plt_id", -189738995);
        setIntField(term41231, term41231.getClass(), "vcld_pts", 1943019963);
        setIntField(term41231, term41231.getClass(), "prsnt_vcld_pts", 186472650);
        setIntField(term41231, term41231.getClass(), "cnp_cid", 279675992);
        setIntField(term41231, term41231.getClass(), "cnp_val", -1626074989);
        setField(term41231, term41231.getClass(), "cnp_sp", "fwtOJhjXbW");
        setField(term41231, term41231.getClass(), "crwd_kind", "ltWBKZaXwJ");
        setField(term41231, term41231.getClass(), "crwd_value", "FSQpgxQnsH");
        setField(term41231, term41231.getClass(), "crwd_str_0", "LBPwnVMEpP");
        setField(term41231, term41231.getClass(), "crwd_str_1", "cwALzyQVjH");
        setIntField(term41231, term41231.getClass(), "cerwd_kind", -552272253);
        setIntField(term41231, term41231.getClass(), "cerwd_value", -633523956);
        setField(term41231, term41231.getClass(), "cerwd_str_0", "jlYNjpdkoz");
        setField(term41231, term41231.getClass(), "cerwd_str_1", "DZAGnhJkeU");
        setField(term41231, term41231.getClass(), "ttl_str_ary", "xQuVexkiVz");
        setField(term41231, term41231.getClass(), "ttl_plt_id_ary", "LqNgPziYtv");
        setField(term41231, term41231.getClass(), "ttl_desc_ary", "wiDfuaXnrP");
        setField(term41231, term41231.getClass(), "skin_id_ary", "btdGZUcaZl");
        setField(term41231, term41231.getClass(), "skin_name_ary", "WnEAVdCxna");
        setField(term41231, term41231.getClass(), "skin_illust_ary", "lnPIxHHyEK");
        setField(term41231, term41231.getClass(), "skin_desc_ary", "unvQfYuBUz");
        setIntField(term41231, term41231.getClass(), "pdddt_flg", 1761540885);
        setIntField(term41427, term41427.getClass(), "year", 2025);
        setShortField(term41427, term41427.getClass(), "month", (short) 9);
        setShortField(term41427, term41427.getClass(), "day", (short) 25);
        setField(term41426, term41426.getClass(), "date", term41427);
        setByteField(term41431, term41431.getClass(), "hour", (byte) 20);
        setByteField(term41431, term41431.getClass(), "minute", (byte) 0);
        setByteField(term41431, term41431.getClass(), "second", (byte) 25);
        setIntField(term41431, term41431.getClass(), "nano", 65871584);
        setField(term41426, term41426.getClass(), "time", term41431);
        setField(term41231, term41231.getClass(), "pdddt_tm", term41426);
        setIntField(term41231, term41231.getClass(), "nblss_ltt_stts", -168498989);
        setIntField(term41231, term41231.getClass(), "nblss_ltt_tckt", 388247095);
        setIntField(term41231, term41231.getClass(), "nblss_ltt_is_opn", -1320402633);
        setIntField(term41231, term41231.getClass(), "nblss_ltt_prz", 919602316);
        setIntField(term41231, term41231.getClass(), "nblss_ltt_nxt_stts", 1833713431);
        setIntField(term41231, term41231.getClass(), "nblss_ltt_nxt_tckt", -706222608);
        setField(term41231, term41231.getClass(), "my_qst_id", "RqnYUpQBbG");
        setField(term41231, term41231.getClass(), "my_qst_r_qid", "sKnuhmcjCC");
        setField(term41231, term41231.getClass(), "my_qst_r_knd", "oCBbVNwMnb");
        setField(term41231, term41231.getClass(), "my_qst_r_vl", "miJxAzOVJy");
        setField(term41231, term41231.getClass(), "my_qst_r_nflg", "kjqlBVaviD");
        setField(term41231, term41231.getClass(), "my_ccd_r_qid", "iVRXRDCrcM");
        setField(term41231, term41231.getClass(), "my_ccd_r_hnd", "WAZFhrxcSM");
        setField(term41231, term41231.getClass(), "my_ccd_r_vp", "gCRUlTuVMX");
        setField(term41231, term41231.getClass(), "cmd", "tYBgGQtkhi");
        setField(term41231, term41231.getClass(), "req_id", "PhGPFLIMKH");
        setField(term41231, term41231.getClass(), "stat", "pWCYcLhoms");
        term41574 = new Integer(-2003607923);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term41574;
        callMethod(klass, "setPrsnt_vcld_pts", argTypes, term41231, args);
    }

};


