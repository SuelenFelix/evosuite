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

public class StageResultResponse_setCerwdstr1_71199600666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48006;

    public StageResultResponse_setCerwdstr1_71199600666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48006 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term48201 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48202 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48206 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term48006, term48006.getClass(), "chllng_kind", -1443680397);
        setIntField(term48006, term48006.getClass(), "lv_num_old", -1331169079);
        setIntField(term48006, term48006.getClass(), "lv_pnt_old", 1109050836);
        setIntField(term48006, term48006.getClass(), "lv_num", 1978065000);
        setIntField(term48006, term48006.getClass(), "lv_pnt", -2121133707);
        setField(term48006, term48006.getClass(), "lv_str", "HGhGqMiMOk");
        setIntField(term48006, term48006.getClass(), "lv_efct_id", -1005498887);
        setIntField(term48006, term48006.getClass(), "lv_plt_id", 1329150584);
        setIntField(term48006, term48006.getClass(), "vcld_pts", -1825382367);
        setIntField(term48006, term48006.getClass(), "prsnt_vcld_pts", -1791371074);
        setIntField(term48006, term48006.getClass(), "cnp_cid", -1151122332);
        setIntField(term48006, term48006.getClass(), "cnp_val", 953387911);
        setField(term48006, term48006.getClass(), "cnp_sp", "VtTzFdKpZI");
        setField(term48006, term48006.getClass(), "crwd_kind", "yCqQIOXRXO");
        setField(term48006, term48006.getClass(), "crwd_value", "aevLPMVcYW");
        setField(term48006, term48006.getClass(), "crwd_str_0", "orHcHVrwHz");
        setField(term48006, term48006.getClass(), "crwd_str_1", "mkEWcQdwUn");
        setIntField(term48006, term48006.getClass(), "cerwd_kind", -1550025613);
        setIntField(term48006, term48006.getClass(), "cerwd_value", 814617314);
        setField(term48006, term48006.getClass(), "cerwd_str_0", "VRjVlzFSIx");
        setField(term48006, term48006.getClass(), "cerwd_str_1", "fNlDLqQZFT");
        setField(term48006, term48006.getClass(), "ttl_str_ary", "szCfpoTDXX");
        setField(term48006, term48006.getClass(), "ttl_plt_id_ary", "blnSDUyHkS");
        setField(term48006, term48006.getClass(), "ttl_desc_ary", "byyepwHlHN");
        setField(term48006, term48006.getClass(), "skin_id_ary", "akVNsUcFra");
        setField(term48006, term48006.getClass(), "skin_name_ary", "BKiHMTzLoY");
        setField(term48006, term48006.getClass(), "skin_illust_ary", "arrHHpXCBD");
        setField(term48006, term48006.getClass(), "skin_desc_ary", "zzfzxQYlis");
        setIntField(term48006, term48006.getClass(), "pdddt_flg", -159489307);
        setIntField(term48202, term48202.getClass(), "year", 2027);
        setShortField(term48202, term48202.getClass(), "month", (short) 7);
        setShortField(term48202, term48202.getClass(), "day", (short) 23);
        setField(term48201, term48201.getClass(), "date", term48202);
        setByteField(term48206, term48206.getClass(), "hour", (byte) 12);
        setByteField(term48206, term48206.getClass(), "minute", (byte) 6);
        setByteField(term48206, term48206.getClass(), "second", (byte) 19);
        setIntField(term48206, term48206.getClass(), "nano", 8025683);
        setField(term48201, term48201.getClass(), "time", term48206);
        setField(term48006, term48006.getClass(), "pdddt_tm", term48201);
        setIntField(term48006, term48006.getClass(), "nblss_ltt_stts", 1317020952);
        setIntField(term48006, term48006.getClass(), "nblss_ltt_tckt", -742710703);
        setIntField(term48006, term48006.getClass(), "nblss_ltt_is_opn", -355505521);
        setIntField(term48006, term48006.getClass(), "nblss_ltt_prz", 1227316523);
        setIntField(term48006, term48006.getClass(), "nblss_ltt_nxt_stts", -58633039);
        setIntField(term48006, term48006.getClass(), "nblss_ltt_nxt_tckt", 448061908);
        setField(term48006, term48006.getClass(), "my_qst_id", "TJJQwVEzxz");
        setField(term48006, term48006.getClass(), "my_qst_r_qid", "kHtEHBrsFo");
        setField(term48006, term48006.getClass(), "my_qst_r_knd", "EmAvkhGlPV");
        setField(term48006, term48006.getClass(), "my_qst_r_vl", "mBrbyQVzve");
        setField(term48006, term48006.getClass(), "my_qst_r_nflg", "FQODEbQeKa");
        setField(term48006, term48006.getClass(), "my_ccd_r_qid", "iLsUPvsdys");
        setField(term48006, term48006.getClass(), "my_ccd_r_hnd", "zsglFxvzdp");
        setField(term48006, term48006.getClass(), "my_ccd_r_vp", "zhXtSGLnJR");
        setField(term48006, term48006.getClass(), "cmd", "XlNXxsYNss");
        setField(term48006, term48006.getClass(), "req_id", "jheRZWjuaB");
        setField(term48006, term48006.getClass(), "stat", "IERziToRSQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mDTRMwjBpc";
        callMethod(klass, "setCerwd_str_1", argTypes, term48006, args);
    }

};


