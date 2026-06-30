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

public class StageResultResponse_getCerwdvalue_51082075120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20088;

    public StageResultResponse_getCerwdvalue_51082075120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20088 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term20283 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20284 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20288 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term20088, term20088.getClass(), "chllng_kind", 1496340209);
        setIntField(term20088, term20088.getClass(), "lv_num_old", -1748391876);
        setIntField(term20088, term20088.getClass(), "lv_pnt_old", 43258317);
        setIntField(term20088, term20088.getClass(), "lv_num", 1707220033);
        setIntField(term20088, term20088.getClass(), "lv_pnt", -1792504217);
        setField(term20088, term20088.getClass(), "lv_str", "EMiMtYgfvr");
        setIntField(term20088, term20088.getClass(), "lv_efct_id", 1824538861);
        setIntField(term20088, term20088.getClass(), "lv_plt_id", 499519708);
        setIntField(term20088, term20088.getClass(), "vcld_pts", 1501165033);
        setIntField(term20088, term20088.getClass(), "prsnt_vcld_pts", 510162332);
        setIntField(term20088, term20088.getClass(), "cnp_cid", 888506903);
        setIntField(term20088, term20088.getClass(), "cnp_val", 200252898);
        setField(term20088, term20088.getClass(), "cnp_sp", "OyYyYYnJuF");
        setField(term20088, term20088.getClass(), "crwd_kind", "aYLvcxZohT");
        setField(term20088, term20088.getClass(), "crwd_value", "mnHyQbMyld");
        setField(term20088, term20088.getClass(), "crwd_str_0", "KHtaDOIcJZ");
        setField(term20088, term20088.getClass(), "crwd_str_1", "vgdwrCZczl");
        setIntField(term20088, term20088.getClass(), "cerwd_kind", -1831826725);
        setIntField(term20088, term20088.getClass(), "cerwd_value", 752152965);
        setField(term20088, term20088.getClass(), "cerwd_str_0", "gKMNrpKBpu");
        setField(term20088, term20088.getClass(), "cerwd_str_1", "ZbHJVEqcoa");
        setField(term20088, term20088.getClass(), "ttl_str_ary", "awDQVEVIKi");
        setField(term20088, term20088.getClass(), "ttl_plt_id_ary", "HJwNgUzZZR");
        setField(term20088, term20088.getClass(), "ttl_desc_ary", "FvUCZgTXhq");
        setField(term20088, term20088.getClass(), "skin_id_ary", "wWWidPCHzx");
        setField(term20088, term20088.getClass(), "skin_name_ary", "OwPIiBRuKK");
        setField(term20088, term20088.getClass(), "skin_illust_ary", "sgfGySMODT");
        setField(term20088, term20088.getClass(), "skin_desc_ary", "ndAITnOsny");
        setIntField(term20088, term20088.getClass(), "pdddt_flg", -1577069773);
        setIntField(term20284, term20284.getClass(), "year", 2020);
        setShortField(term20284, term20284.getClass(), "month", (short) 7);
        setShortField(term20284, term20284.getClass(), "day", (short) 24);
        setField(term20283, term20283.getClass(), "date", term20284);
        setByteField(term20288, term20288.getClass(), "hour", (byte) 0);
        setByteField(term20288, term20288.getClass(), "minute", (byte) 59);
        setByteField(term20288, term20288.getClass(), "second", (byte) 56);
        setIntField(term20288, term20288.getClass(), "nano", 320219201);
        setField(term20283, term20283.getClass(), "time", term20288);
        setField(term20088, term20088.getClass(), "pdddt_tm", term20283);
        setIntField(term20088, term20088.getClass(), "nblss_ltt_stts", -266625190);
        setIntField(term20088, term20088.getClass(), "nblss_ltt_tckt", 489201218);
        setIntField(term20088, term20088.getClass(), "nblss_ltt_is_opn", 464181937);
        setIntField(term20088, term20088.getClass(), "nblss_ltt_prz", -1455526612);
        setIntField(term20088, term20088.getClass(), "nblss_ltt_nxt_stts", -941356098);
        setIntField(term20088, term20088.getClass(), "nblss_ltt_nxt_tckt", -201517446);
        setField(term20088, term20088.getClass(), "my_qst_id", "CVZnTiJucs");
        setField(term20088, term20088.getClass(), "my_qst_r_qid", "ecHEQufXoq");
        setField(term20088, term20088.getClass(), "my_qst_r_knd", "btBLMvHzJg");
        setField(term20088, term20088.getClass(), "my_qst_r_vl", "JdOMfNWgLP");
        setField(term20088, term20088.getClass(), "my_qst_r_nflg", "uWqXrwAsDU");
        setField(term20088, term20088.getClass(), "my_ccd_r_qid", "hgFbWAUtsu");
        setField(term20088, term20088.getClass(), "my_ccd_r_hnd", "HqoTWlkbwF");
        setField(term20088, term20088.getClass(), "my_ccd_r_vp", "CwNELDTAPP");
        setField(term20088, term20088.getClass(), "cmd", "GSzQdbHLHw");
        setField(term20088, term20088.getClass(), "req_id", "IkfarsYNJO");
        setField(term20088, term20088.getClass(), "stat", "aZKOWhHMEh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCerwd_value", argTypes, term20088, args);
    }

};


