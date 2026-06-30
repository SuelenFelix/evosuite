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

public class StoreSsRequest_setSsselmdlid_208175747331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254375;

    public StoreSsRequest_setSsselmdlid_208175747331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term254375 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.StoreSsRequest"));
        setIntField(term254375, term254375.getClass(), "pd_id", 0);
        setField(term254375, term254375.getClass(), "ss_dat_id", null);
        setIntField(term254375, term254375.getClass(), "ss_pv_id", 0);
        setIntField(term254375, term254375.getClass(), "ss_sel_pv_id", 0);
        setField(term254375, term254375.getClass(), "ss_mdl_id", null);
        setField(term254375, term254375.getClass(), "ss_sel_mdl_id", null);
        setField(term254375, term254375.getClass(), "ss_c_itm_id", null);
        setField(term254375, term254375.getClass(), "ss_pxl_sz", null);
        setField(term254375, term254375.getClass(), "cmd", null);
        setField(term254375, term254375.getClass(), "req_id", null);
        setField(term254375, term254375.getClass(), "game_id", null);
        setField(term254375, term254375.getClass(), "r_ver", null);
        setField(term254375, term254375.getClass(), "kc_serial", null);
        setField(term254375, term254375.getClass(), "b_serial", null);
        setField(term254375, term254375.getClass(), "place_id", null);
        setField(term254375, term254375.getClass(), "time_stamp", null);
        setField(term254375, term254375.getClass(), "start_up_mode", null);
        setField(term254375, term254375.getClass(), "cmm_dly_mod", null);
        setField(term254375, term254375.getClass(), "cmm_dly_sec", null);
        setField(term254375, term254375.getClass(), "cmm_err_mod", null);
        setField(term254375, term254375.getClass(), "country_code", null);
        setField(term254375, term254375.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.StoreSsRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSs_sel_mdl_id", argTypes, term254375, args);
    }

};


