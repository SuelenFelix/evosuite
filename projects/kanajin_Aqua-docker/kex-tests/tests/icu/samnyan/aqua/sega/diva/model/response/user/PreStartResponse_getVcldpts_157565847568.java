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

public class PreStartResponse_getVcldpts_157565847568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295134;

    public PreStartResponse_getVcldpts_157565847568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term295134 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        setField(term295134, term295134.getClass(), "ps_result", null);
        setField(term295134, term295134.getClass(), "accept_idx", null);
        setField(term295134, term295134.getClass(), "nblss_ltt_stts", null);
        setField(term295134, term295134.getClass(), "nblss_ltt_tckt", null);
        setField(term295134, term295134.getClass(), "nblss_ltt_is_opn", null);
        setField(term295134, term295134.getClass(), "pd_id", null);
        setField(term295134, term295134.getClass(), "player_name", null);
        setField(term295134, term295134.getClass(), "sort_kind", null);
        setField(term295134, term295134.getClass(), "lv_num", null);
        setField(term295134, term295134.getClass(), "lv_pnt", null);
        setField(term295134, term295134.getClass(), "lv_str", null);
        setField(term295134, term295134.getClass(), "lv_efct_id", null);
        setField(term295134, term295134.getClass(), "lv_plt_id", null);
        setField(term295134, term295134.getClass(), "mdl_eqp_ary", null);
        setField(term295134, term295134.getClass(), "mdl_eqp_tm", null);
        setField(term295134, term295134.getClass(), "skn_eqp", null);
        setField(term295134, term295134.getClass(), "btn_se_eqp", null);
        setField(term295134, term295134.getClass(), "sld_se_eqp", null);
        setField(term295134, term295134.getClass(), "chn_sld_se_eqp", null);
        setField(term295134, term295134.getClass(), "sldr_tch_se_eqp", null);
        setField(term295134, term295134.getClass(), "vcld_pts", null);
        setField(term295134, term295134.getClass(), "passwd_stat", null);
        setField(term295134, term295134.getClass(), "cmd", null);
        setField(term295134, term295134.getClass(), "req_id", null);
        setField(term295134, term295134.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVcld_pts", argTypes, term295134, args);
    }

};


