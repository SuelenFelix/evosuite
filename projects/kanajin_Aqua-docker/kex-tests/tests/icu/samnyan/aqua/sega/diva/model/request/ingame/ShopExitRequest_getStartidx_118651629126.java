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

public class ShopExitRequest_getStartidx_118651629126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270227;

    public ShopExitRequest_getStartidx_118651629126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270227 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.ShopExitRequest"));
        setIntField(term270227, term270227.getClass(), "pd_id", 0);
        setIntField(term270227, term270227.getClass(), "accept_idx", 0);
        setIntField(term270227, term270227.getClass(), "start_idx", 0);
        setIntField(term270227, term270227.getClass(), "use_pv_mdl_eqp", 0);
        setIntField(term270227, term270227.getClass(), "ply_pv_id", 0);
        setField(term270227, term270227.getClass(), "mdl_eqp_cmn_ary", null);
        setField(term270227, term270227.getClass(), "c_itm_eqp_cmn_ary", null);
        setField(term270227, term270227.getClass(), "ms_itm_flg_cmn_ary", null);
        setField(term270227, term270227.getClass(), "mdl_eqp_pv_ary", null);
        setField(term270227, term270227.getClass(), "c_itm_eqp_pv_ary", null);
        setField(term270227, term270227.getClass(), "ms_itm_flg_pv_ary", null);
        setField(term270227, term270227.getClass(), "cmd", null);
        setField(term270227, term270227.getClass(), "req_id", null);
        setField(term270227, term270227.getClass(), "game_id", null);
        setField(term270227, term270227.getClass(), "r_ver", null);
        setField(term270227, term270227.getClass(), "kc_serial", null);
        setField(term270227, term270227.getClass(), "b_serial", null);
        setField(term270227, term270227.getClass(), "place_id", null);
        setField(term270227, term270227.getClass(), "time_stamp", null);
        setField(term270227, term270227.getClass(), "start_up_mode", null);
        setField(term270227, term270227.getClass(), "cmm_dly_mod", null);
        setField(term270227, term270227.getClass(), "cmm_dly_sec", null);
        setField(term270227, term270227.getClass(), "cmm_err_mod", null);
        setField(term270227, term270227.getClass(), "country_code", null);
        setField(term270227, term270227.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.ShopExitRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStart_idx", argTypes, term270227, args);
    }

};


