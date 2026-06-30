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
import java.lang.Integer;

public class BuyModuleRequest_setPdid_18208522917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258863;
     Object term258869;

    public BuyModuleRequest_setPdid_18208522917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term258863 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyModuleRequest"));
        setIntField(term258863, term258863.getClass(), "pd_id", 0);
        setIntField(term258863, term258863.getClass(), "accept_idx", 0);
        setIntField(term258863, term258863.getClass(), "start_idx", 0);
        setIntField(term258863, term258863.getClass(), "mdl_id", 0);
        setIntField(term258863, term258863.getClass(), "mdl_price", 0);
        setField(term258863, term258863.getClass(), "cmd", null);
        setField(term258863, term258863.getClass(), "req_id", null);
        setField(term258863, term258863.getClass(), "game_id", null);
        setField(term258863, term258863.getClass(), "r_ver", null);
        setField(term258863, term258863.getClass(), "kc_serial", null);
        setField(term258863, term258863.getClass(), "b_serial", null);
        setField(term258863, term258863.getClass(), "place_id", null);
        setField(term258863, term258863.getClass(), "time_stamp", null);
        setField(term258863, term258863.getClass(), "start_up_mode", null);
        setField(term258863, term258863.getClass(), "cmm_dly_mod", null);
        setField(term258863, term258863.getClass(), "cmm_dly_sec", null);
        setField(term258863, term258863.getClass(), "cmm_err_mod", null);
        setField(term258863, term258863.getClass(), "country_code", null);
        setField(term258863, term258863.getClass(), "region_code", null);
        term258869 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyModuleRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term258869;
        callMethod(klass, "setPd_id", argTypes, term258863, args);
    }

};


