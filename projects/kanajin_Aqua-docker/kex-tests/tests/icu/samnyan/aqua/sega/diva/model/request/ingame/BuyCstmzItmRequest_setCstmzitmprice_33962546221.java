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

public class BuyCstmzItmRequest_setCstmzitmprice_33962546221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277619;
     Object term277625;

    public BuyCstmzItmRequest_setCstmzitmprice_33962546221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277619 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyCstmzItmRequest"));
        setIntField(term277619, term277619.getClass(), "pd_id", 0);
        setIntField(term277619, term277619.getClass(), "accept_idx", 0);
        setIntField(term277619, term277619.getClass(), "start_idx", 0);
        setIntField(term277619, term277619.getClass(), "cstmz_itm_id", 0);
        setIntField(term277619, term277619.getClass(), "cstmz_itm_price", 0);
        setField(term277619, term277619.getClass(), "cmd", null);
        setField(term277619, term277619.getClass(), "req_id", null);
        setField(term277619, term277619.getClass(), "game_id", null);
        setField(term277619, term277619.getClass(), "r_ver", null);
        setField(term277619, term277619.getClass(), "kc_serial", null);
        setField(term277619, term277619.getClass(), "b_serial", null);
        setField(term277619, term277619.getClass(), "place_id", null);
        setField(term277619, term277619.getClass(), "time_stamp", null);
        setField(term277619, term277619.getClass(), "start_up_mode", null);
        setField(term277619, term277619.getClass(), "cmm_dly_mod", null);
        setField(term277619, term277619.getClass(), "cmm_dly_sec", null);
        setField(term277619, term277619.getClass(), "cmm_err_mod", null);
        setField(term277619, term277619.getClass(), "country_code", null);
        setField(term277619, term277619.getClass(), "region_code", null);
        term277625 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyCstmzItmRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term277625;
        callMethod(klass, "setCstmz_itm_price", argTypes, term277619, args);
    }

};


