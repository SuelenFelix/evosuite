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

public class PreStartResponse_setMdleqpary_91181393883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295149;

    public PreStartResponse_setMdleqpary_91181393883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term295149 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        setField(term295149, term295149.getClass(), "ps_result", null);
        setField(term295149, term295149.getClass(), "accept_idx", null);
        setField(term295149, term295149.getClass(), "nblss_ltt_stts", null);
        setField(term295149, term295149.getClass(), "nblss_ltt_tckt", null);
        setField(term295149, term295149.getClass(), "nblss_ltt_is_opn", null);
        setField(term295149, term295149.getClass(), "pd_id", null);
        setField(term295149, term295149.getClass(), "player_name", null);
        setField(term295149, term295149.getClass(), "sort_kind", null);
        setField(term295149, term295149.getClass(), "lv_num", null);
        setField(term295149, term295149.getClass(), "lv_pnt", null);
        setField(term295149, term295149.getClass(), "lv_str", null);
        setField(term295149, term295149.getClass(), "lv_efct_id", null);
        setField(term295149, term295149.getClass(), "lv_plt_id", null);
        setField(term295149, term295149.getClass(), "mdl_eqp_ary", null);
        setField(term295149, term295149.getClass(), "mdl_eqp_tm", null);
        setField(term295149, term295149.getClass(), "skn_eqp", null);
        setField(term295149, term295149.getClass(), "btn_se_eqp", null);
        setField(term295149, term295149.getClass(), "sld_se_eqp", null);
        setField(term295149, term295149.getClass(), "chn_sld_se_eqp", null);
        setField(term295149, term295149.getClass(), "sldr_tch_se_eqp", null);
        setField(term295149, term295149.getClass(), "vcld_pts", null);
        setField(term295149, term295149.getClass(), "passwd_stat", null);
        setField(term295149, term295149.getClass(), "cmd", null);
        setField(term295149, term295149.getClass(), "req_id", null);
        setField(term295149, term295149.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMdl_eqp_ary", argTypes, term295149, args);
    }

};


