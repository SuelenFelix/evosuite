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

public class StageResultResponse_getLvpntold_10026756274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10440;

    public StageResultResponse_getLvpntold_10026756274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10440 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term10635 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10636 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10640 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term10440, term10440.getClass(), "chllng_kind", -1347665717);
        setIntField(term10440, term10440.getClass(), "lv_num_old", -1888585309);
        setIntField(term10440, term10440.getClass(), "lv_pnt_old", 683666002);
        setIntField(term10440, term10440.getClass(), "lv_num", 1596213415);
        setIntField(term10440, term10440.getClass(), "lv_pnt", -268815336);
        setField(term10440, term10440.getClass(), "lv_str", "sQvGcVjdEx");
        setIntField(term10440, term10440.getClass(), "lv_efct_id", -1210583429);
        setIntField(term10440, term10440.getClass(), "lv_plt_id", -663691365);
        setIntField(term10440, term10440.getClass(), "vcld_pts", 339854490);
        setIntField(term10440, term10440.getClass(), "prsnt_vcld_pts", -615654495);
        setIntField(term10440, term10440.getClass(), "cnp_cid", -1476117762);
        setIntField(term10440, term10440.getClass(), "cnp_val", -341962980);
        setField(term10440, term10440.getClass(), "cnp_sp", "rLHAoqXgPh");
        setField(term10440, term10440.getClass(), "crwd_kind", "zUlRdimJtU");
        setField(term10440, term10440.getClass(), "crwd_value", "vwbEQQNQrx");
        setField(term10440, term10440.getClass(), "crwd_str_0", "xtftXXMbem");
        setField(term10440, term10440.getClass(), "crwd_str_1", "cudZvLMQon");
        setIntField(term10440, term10440.getClass(), "cerwd_kind", 1532716628);
        setIntField(term10440, term10440.getClass(), "cerwd_value", -1801760683);
        setField(term10440, term10440.getClass(), "cerwd_str_0", "lihXWlGDxk");
        setField(term10440, term10440.getClass(), "cerwd_str_1", "JmcmxoGhIK");
        setField(term10440, term10440.getClass(), "ttl_str_ary", "jXzmYyrnnT");
        setField(term10440, term10440.getClass(), "ttl_plt_id_ary", "igCAtimmYB");
        setField(term10440, term10440.getClass(), "ttl_desc_ary", "DyiXbeYIaN");
        setField(term10440, term10440.getClass(), "skin_id_ary", "VGizxZnyHX");
        setField(term10440, term10440.getClass(), "skin_name_ary", "kVEZMHmRtR");
        setField(term10440, term10440.getClass(), "skin_illust_ary", "ekxGuOYIwi");
        setField(term10440, term10440.getClass(), "skin_desc_ary", "RbVQXSpxXy");
        setIntField(term10440, term10440.getClass(), "pdddt_flg", 1141317871);
        setIntField(term10636, term10636.getClass(), "year", 2015);
        setShortField(term10636, term10636.getClass(), "month", (short) 4);
        setShortField(term10636, term10636.getClass(), "day", (short) 14);
        setField(term10635, term10635.getClass(), "date", term10636);
        setByteField(term10640, term10640.getClass(), "hour", (byte) 18);
        setByteField(term10640, term10640.getClass(), "minute", (byte) 24);
        setByteField(term10640, term10640.getClass(), "second", (byte) 32);
        setIntField(term10640, term10640.getClass(), "nano", 369233818);
        setField(term10635, term10635.getClass(), "time", term10640);
        setField(term10440, term10440.getClass(), "pdddt_tm", term10635);
        setIntField(term10440, term10440.getClass(), "nblss_ltt_stts", 890669485);
        setIntField(term10440, term10440.getClass(), "nblss_ltt_tckt", 691577392);
        setIntField(term10440, term10440.getClass(), "nblss_ltt_is_opn", -893623680);
        setIntField(term10440, term10440.getClass(), "nblss_ltt_prz", -1963434938);
        setIntField(term10440, term10440.getClass(), "nblss_ltt_nxt_stts", 906181092);
        setIntField(term10440, term10440.getClass(), "nblss_ltt_nxt_tckt", 1045657203);
        setField(term10440, term10440.getClass(), "my_qst_id", "YpJbIgJWWv");
        setField(term10440, term10440.getClass(), "my_qst_r_qid", "JppkknKVOw");
        setField(term10440, term10440.getClass(), "my_qst_r_knd", "iljANwuEjk");
        setField(term10440, term10440.getClass(), "my_qst_r_vl", "kNqaJKIATy");
        setField(term10440, term10440.getClass(), "my_qst_r_nflg", "vKQukfbJUd");
        setField(term10440, term10440.getClass(), "my_ccd_r_qid", "lFRJFUMVbx");
        setField(term10440, term10440.getClass(), "my_ccd_r_hnd", "sZdUNdggUW");
        setField(term10440, term10440.getClass(), "my_ccd_r_vp", "OqbwYQfvAe");
        setField(term10440, term10440.getClass(), "cmd", "tRxZafjqIx");
        setField(term10440, term10440.getClass(), "req_id", "DhjNLmRMCu");
        setField(term10440, term10440.getClass(), "stat", "PgPzMSEjjX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLv_pnt_old", argTypes, term10440, args);
    }

};


