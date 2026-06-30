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

public class BuyModuleRequest_setStartidx_171685810519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258879;
     Object term258885;

    public BuyModuleRequest_setStartidx_171685810519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term258879 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyModuleRequest"));
        setIntField(term258879, term258879.getClass(), "pd_id", 0);
        setIntField(term258879, term258879.getClass(), "accept_idx", 0);
        setIntField(term258879, term258879.getClass(), "start_idx", 0);
        setIntField(term258879, term258879.getClass(), "mdl_id", 0);
        setIntField(term258879, term258879.getClass(), "mdl_price", 0);
        setField(term258879, term258879.getClass(), "cmd", null);
        setField(term258879, term258879.getClass(), "req_id", null);
        setField(term258879, term258879.getClass(), "game_id", null);
        setField(term258879, term258879.getClass(), "r_ver", null);
        setField(term258879, term258879.getClass(), "kc_serial", null);
        setField(term258879, term258879.getClass(), "b_serial", null);
        setField(term258879, term258879.getClass(), "place_id", null);
        setField(term258879, term258879.getClass(), "time_stamp", null);
        setField(term258879, term258879.getClass(), "start_up_mode", null);
        setField(term258879, term258879.getClass(), "cmm_dly_mod", null);
        setField(term258879, term258879.getClass(), "cmm_dly_sec", null);
        setField(term258879, term258879.getClass(), "cmm_err_mod", null);
        setField(term258879, term258879.getClass(), "country_code", null);
        setField(term258879, term258879.getClass(), "region_code", null);
        term258885 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyModuleRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term258885;
        callMethod(klass, "setStart_idx", argTypes, term258879, args);
    }

};


