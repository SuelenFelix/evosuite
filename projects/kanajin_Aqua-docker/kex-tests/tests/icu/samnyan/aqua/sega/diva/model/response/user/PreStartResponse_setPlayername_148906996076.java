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

public class PreStartResponse_setPlayername_148906996076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295142;

    public PreStartResponse_setPlayername_148906996076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term295142 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        setField(term295142, term295142.getClass(), "ps_result", null);
        setField(term295142, term295142.getClass(), "accept_idx", null);
        setField(term295142, term295142.getClass(), "nblss_ltt_stts", null);
        setField(term295142, term295142.getClass(), "nblss_ltt_tckt", null);
        setField(term295142, term295142.getClass(), "nblss_ltt_is_opn", null);
        setField(term295142, term295142.getClass(), "pd_id", null);
        setField(term295142, term295142.getClass(), "player_name", null);
        setField(term295142, term295142.getClass(), "sort_kind", null);
        setField(term295142, term295142.getClass(), "lv_num", null);
        setField(term295142, term295142.getClass(), "lv_pnt", null);
        setField(term295142, term295142.getClass(), "lv_str", null);
        setField(term295142, term295142.getClass(), "lv_efct_id", null);
        setField(term295142, term295142.getClass(), "lv_plt_id", null);
        setField(term295142, term295142.getClass(), "mdl_eqp_ary", null);
        setField(term295142, term295142.getClass(), "mdl_eqp_tm", null);
        setField(term295142, term295142.getClass(), "skn_eqp", null);
        setField(term295142, term295142.getClass(), "btn_se_eqp", null);
        setField(term295142, term295142.getClass(), "sld_se_eqp", null);
        setField(term295142, term295142.getClass(), "chn_sld_se_eqp", null);
        setField(term295142, term295142.getClass(), "sldr_tch_se_eqp", null);
        setField(term295142, term295142.getClass(), "vcld_pts", null);
        setField(term295142, term295142.getClass(), "passwd_stat", null);
        setField(term295142, term295142.getClass(), "cmd", null);
        setField(term295142, term295142.getClass(), "req_id", null);
        setField(term295142, term295142.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlayer_name", argTypes, term295142, args);
    }

};


