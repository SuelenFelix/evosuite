package icu.samnyan.aqua.sega.diva.model.request.ingame;

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
import static icu.samnyan.aqua.sega.diva.model.request.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ShopExitRequest_setMdleqppvary_168213404943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270339;

    public ShopExitRequest_setMdleqppvary_168213404943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270339 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.ShopExitRequest"));
        setIntField(term270339, term270339.getClass(), "pd_id", 0);
        setIntField(term270339, term270339.getClass(), "accept_idx", 0);
        setIntField(term270339, term270339.getClass(), "start_idx", 0);
        setIntField(term270339, term270339.getClass(), "use_pv_mdl_eqp", 0);
        setIntField(term270339, term270339.getClass(), "ply_pv_id", 0);
        setField(term270339, term270339.getClass(), "mdl_eqp_cmn_ary", null);
        setField(term270339, term270339.getClass(), "c_itm_eqp_cmn_ary", null);
        setField(term270339, term270339.getClass(), "ms_itm_flg_cmn_ary", null);
        setField(term270339, term270339.getClass(), "mdl_eqp_pv_ary", null);
        setField(term270339, term270339.getClass(), "c_itm_eqp_pv_ary", null);
        setField(term270339, term270339.getClass(), "ms_itm_flg_pv_ary", null);
        setField(term270339, term270339.getClass(), "cmd", null);
        setField(term270339, term270339.getClass(), "req_id", null);
        setField(term270339, term270339.getClass(), "game_id", null);
        setField(term270339, term270339.getClass(), "r_ver", null);
        setField(term270339, term270339.getClass(), "kc_serial", null);
        setField(term270339, term270339.getClass(), "b_serial", null);
        setField(term270339, term270339.getClass(), "place_id", null);
        setField(term270339, term270339.getClass(), "time_stamp", null);
        setField(term270339, term270339.getClass(), "start_up_mode", null);
        setField(term270339, term270339.getClass(), "cmm_dly_mod", null);
        setField(term270339, term270339.getClass(), "cmm_dly_sec", null);
        setField(term270339, term270339.getClass(), "cmm_err_mod", null);
        setField(term270339, term270339.getClass(), "country_code", null);
        setField(term270339, term270339.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.ShopExitRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMdl_eqp_pv_ary", argTypes, term270339, args);
    }

};


