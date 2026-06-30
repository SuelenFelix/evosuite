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

public class StageResultResponse_getLvnumold_944528593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62915;

    public StageResultResponse_getLvnumold_944528593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62915 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        setIntField(term62915, term62915.getClass(), "chllng_kind", 0);
        setIntField(term62915, term62915.getClass(), "lv_num_old", 0);
        setIntField(term62915, term62915.getClass(), "lv_pnt_old", 0);
        setIntField(term62915, term62915.getClass(), "lv_num", 0);
        setIntField(term62915, term62915.getClass(), "lv_pnt", 0);
        setField(term62915, term62915.getClass(), "lv_str", null);
        setIntField(term62915, term62915.getClass(), "lv_efct_id", 0);
        setIntField(term62915, term62915.getClass(), "lv_plt_id", 0);
        setIntField(term62915, term62915.getClass(), "vcld_pts", 0);
        setIntField(term62915, term62915.getClass(), "prsnt_vcld_pts", 0);
        setIntField(term62915, term62915.getClass(), "cnp_cid", 0);
        setIntField(term62915, term62915.getClass(), "cnp_val", 0);
        setField(term62915, term62915.getClass(), "cnp_sp", null);
        setField(term62915, term62915.getClass(), "crwd_kind", null);
        setField(term62915, term62915.getClass(), "crwd_value", null);
        setField(term62915, term62915.getClass(), "crwd_str_0", null);
        setField(term62915, term62915.getClass(), "crwd_str_1", null);
        setIntField(term62915, term62915.getClass(), "cerwd_kind", 0);
        setIntField(term62915, term62915.getClass(), "cerwd_value", 0);
        setField(term62915, term62915.getClass(), "cerwd_str_0", null);
        setField(term62915, term62915.getClass(), "cerwd_str_1", null);
        setField(term62915, term62915.getClass(), "ttl_str_ary", null);
        setField(term62915, term62915.getClass(), "ttl_plt_id_ary", null);
        setField(term62915, term62915.getClass(), "ttl_desc_ary", null);
        setField(term62915, term62915.getClass(), "skin_id_ary", null);
        setField(term62915, term62915.getClass(), "skin_name_ary", null);
        setField(term62915, term62915.getClass(), "skin_illust_ary", null);
        setField(term62915, term62915.getClass(), "skin_desc_ary", null);
        setIntField(term62915, term62915.getClass(), "pdddt_flg", 0);
        setField(term62915, term62915.getClass(), "pdddt_tm", null);
        setIntField(term62915, term62915.getClass(), "nblss_ltt_stts", 0);
        setIntField(term62915, term62915.getClass(), "nblss_ltt_tckt", 0);
        setIntField(term62915, term62915.getClass(), "nblss_ltt_is_opn", 0);
        setIntField(term62915, term62915.getClass(), "nblss_ltt_prz", 0);
        setIntField(term62915, term62915.getClass(), "nblss_ltt_nxt_stts", 0);
        setIntField(term62915, term62915.getClass(), "nblss_ltt_nxt_tckt", 0);
        setField(term62915, term62915.getClass(), "my_qst_id", null);
        setField(term62915, term62915.getClass(), "my_qst_r_qid", null);
        setField(term62915, term62915.getClass(), "my_qst_r_knd", null);
        setField(term62915, term62915.getClass(), "my_qst_r_vl", null);
        setField(term62915, term62915.getClass(), "my_qst_r_nflg", null);
        setField(term62915, term62915.getClass(), "my_ccd_r_qid", null);
        setField(term62915, term62915.getClass(), "my_ccd_r_hnd", null);
        setField(term62915, term62915.getClass(), "my_ccd_r_vp", null);
        setField(term62915, term62915.getClass(), "cmd", null);
        setField(term62915, term62915.getClass(), "req_id", null);
        setField(term62915, term62915.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLv_num_old", argTypes, term62915, args);
    }

};


