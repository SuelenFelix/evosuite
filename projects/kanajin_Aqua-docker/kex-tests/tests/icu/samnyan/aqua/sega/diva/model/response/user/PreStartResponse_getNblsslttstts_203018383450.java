package icu.samnyan.aqua.sega.diva.model.response.user;

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
import static icu.samnyan.aqua.sega.diva.model.response.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PreStartResponse_getNblsslttstts_203018383450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295116;

    public PreStartResponse_getNblsslttstts_203018383450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term295116 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        setField(term295116, term295116.getClass(), "ps_result", null);
        setField(term295116, term295116.getClass(), "accept_idx", null);
        setField(term295116, term295116.getClass(), "nblss_ltt_stts", null);
        setField(term295116, term295116.getClass(), "nblss_ltt_tckt", null);
        setField(term295116, term295116.getClass(), "nblss_ltt_is_opn", null);
        setField(term295116, term295116.getClass(), "pd_id", null);
        setField(term295116, term295116.getClass(), "player_name", null);
        setField(term295116, term295116.getClass(), "sort_kind", null);
        setField(term295116, term295116.getClass(), "lv_num", null);
        setField(term295116, term295116.getClass(), "lv_pnt", null);
        setField(term295116, term295116.getClass(), "lv_str", null);
        setField(term295116, term295116.getClass(), "lv_efct_id", null);
        setField(term295116, term295116.getClass(), "lv_plt_id", null);
        setField(term295116, term295116.getClass(), "mdl_eqp_ary", null);
        setField(term295116, term295116.getClass(), "mdl_eqp_tm", null);
        setField(term295116, term295116.getClass(), "skn_eqp", null);
        setField(term295116, term295116.getClass(), "btn_se_eqp", null);
        setField(term295116, term295116.getClass(), "sld_se_eqp", null);
        setField(term295116, term295116.getClass(), "chn_sld_se_eqp", null);
        setField(term295116, term295116.getClass(), "sldr_tch_se_eqp", null);
        setField(term295116, term295116.getClass(), "vcld_pts", null);
        setField(term295116, term295116.getClass(), "passwd_stat", null);
        setField(term295116, term295116.getClass(), "cmd", null);
        setField(term295116, term295116.getClass(), "req_id", null);
        setField(term295116, term295116.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNblss_ltt_stts", argTypes, term295116, args);
    }

};


