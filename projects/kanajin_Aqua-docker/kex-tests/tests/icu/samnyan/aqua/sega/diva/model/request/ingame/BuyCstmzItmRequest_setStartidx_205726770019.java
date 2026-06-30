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

public class BuyCstmzItmRequest_setStartidx_205726770019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277603;
     Object term277609;

    public BuyCstmzItmRequest_setStartidx_205726770019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277603 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyCstmzItmRequest"));
        setIntField(term277603, term277603.getClass(), "pd_id", 0);
        setIntField(term277603, term277603.getClass(), "accept_idx", 0);
        setIntField(term277603, term277603.getClass(), "start_idx", 0);
        setIntField(term277603, term277603.getClass(), "cstmz_itm_id", 0);
        setIntField(term277603, term277603.getClass(), "cstmz_itm_price", 0);
        setField(term277603, term277603.getClass(), "cmd", null);
        setField(term277603, term277603.getClass(), "req_id", null);
        setField(term277603, term277603.getClass(), "game_id", null);
        setField(term277603, term277603.getClass(), "r_ver", null);
        setField(term277603, term277603.getClass(), "kc_serial", null);
        setField(term277603, term277603.getClass(), "b_serial", null);
        setField(term277603, term277603.getClass(), "place_id", null);
        setField(term277603, term277603.getClass(), "time_stamp", null);
        setField(term277603, term277603.getClass(), "start_up_mode", null);
        setField(term277603, term277603.getClass(), "cmm_dly_mod", null);
        setField(term277603, term277603.getClass(), "cmm_dly_sec", null);
        setField(term277603, term277603.getClass(), "cmm_err_mod", null);
        setField(term277603, term277603.getClass(), "country_code", null);
        setField(term277603, term277603.getClass(), "region_code", null);
        term277609 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyCstmzItmRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term277609;
        callMethod(klass, "setStart_idx", argTypes, term277603, args);
    }

};


