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

public class PreStartResponse_getPsresult_132690714248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295114;

    public PreStartResponse_getPsresult_132690714248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term295114 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        setField(term295114, term295114.getClass(), "ps_result", null);
        setField(term295114, term295114.getClass(), "accept_idx", null);
        setField(term295114, term295114.getClass(), "nblss_ltt_stts", null);
        setField(term295114, term295114.getClass(), "nblss_ltt_tckt", null);
        setField(term295114, term295114.getClass(), "nblss_ltt_is_opn", null);
        setField(term295114, term295114.getClass(), "pd_id", null);
        setField(term295114, term295114.getClass(), "player_name", null);
        setField(term295114, term295114.getClass(), "sort_kind", null);
        setField(term295114, term295114.getClass(), "lv_num", null);
        setField(term295114, term295114.getClass(), "lv_pnt", null);
        setField(term295114, term295114.getClass(), "lv_str", null);
        setField(term295114, term295114.getClass(), "lv_efct_id", null);
        setField(term295114, term295114.getClass(), "lv_plt_id", null);
        setField(term295114, term295114.getClass(), "mdl_eqp_ary", null);
        setField(term295114, term295114.getClass(), "mdl_eqp_tm", null);
        setField(term295114, term295114.getClass(), "skn_eqp", null);
        setField(term295114, term295114.getClass(), "btn_se_eqp", null);
        setField(term295114, term295114.getClass(), "sld_se_eqp", null);
        setField(term295114, term295114.getClass(), "chn_sld_se_eqp", null);
        setField(term295114, term295114.getClass(), "sldr_tch_se_eqp", null);
        setField(term295114, term295114.getClass(), "vcld_pts", null);
        setField(term295114, term295114.getClass(), "passwd_stat", null);
        setField(term295114, term295114.getClass(), "cmd", null);
        setField(term295114, term295114.getClass(), "req_id", null);
        setField(term295114, term295114.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPs_result", argTypes, term295114, args);
    }

};


