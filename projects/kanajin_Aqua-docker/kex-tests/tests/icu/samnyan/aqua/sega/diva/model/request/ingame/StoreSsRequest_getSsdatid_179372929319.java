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

public class StoreSsRequest_getSsdatid_179372929319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254321;

    public StoreSsRequest_getSsdatid_179372929319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term254321 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.StoreSsRequest"));
        setIntField(term254321, term254321.getClass(), "pd_id", 0);
        setField(term254321, term254321.getClass(), "ss_dat_id", null);
        setIntField(term254321, term254321.getClass(), "ss_pv_id", 0);
        setIntField(term254321, term254321.getClass(), "ss_sel_pv_id", 0);
        setField(term254321, term254321.getClass(), "ss_mdl_id", null);
        setField(term254321, term254321.getClass(), "ss_sel_mdl_id", null);
        setField(term254321, term254321.getClass(), "ss_c_itm_id", null);
        setField(term254321, term254321.getClass(), "ss_pxl_sz", null);
        setField(term254321, term254321.getClass(), "cmd", null);
        setField(term254321, term254321.getClass(), "req_id", null);
        setField(term254321, term254321.getClass(), "game_id", null);
        setField(term254321, term254321.getClass(), "r_ver", null);
        setField(term254321, term254321.getClass(), "kc_serial", null);
        setField(term254321, term254321.getClass(), "b_serial", null);
        setField(term254321, term254321.getClass(), "place_id", null);
        setField(term254321, term254321.getClass(), "time_stamp", null);
        setField(term254321, term254321.getClass(), "start_up_mode", null);
        setField(term254321, term254321.getClass(), "cmm_dly_mod", null);
        setField(term254321, term254321.getClass(), "cmm_dly_sec", null);
        setField(term254321, term254321.getClass(), "cmm_err_mod", null);
        setField(term254321, term254321.getClass(), "country_code", null);
        setField(term254321, term254321.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.StoreSsRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSs_dat_id", argTypes, term254321, args);
    }

};


