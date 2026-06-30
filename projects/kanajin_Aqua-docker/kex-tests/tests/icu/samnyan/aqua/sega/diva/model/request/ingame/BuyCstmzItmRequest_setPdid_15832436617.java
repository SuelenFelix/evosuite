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

public class BuyCstmzItmRequest_setPdid_15832436617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277587;
     Object term277593;

    public BuyCstmzItmRequest_setPdid_15832436617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277587 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyCstmzItmRequest"));
        setIntField(term277587, term277587.getClass(), "pd_id", 0);
        setIntField(term277587, term277587.getClass(), "accept_idx", 0);
        setIntField(term277587, term277587.getClass(), "start_idx", 0);
        setIntField(term277587, term277587.getClass(), "cstmz_itm_id", 0);
        setIntField(term277587, term277587.getClass(), "cstmz_itm_price", 0);
        setField(term277587, term277587.getClass(), "cmd", null);
        setField(term277587, term277587.getClass(), "req_id", null);
        setField(term277587, term277587.getClass(), "game_id", null);
        setField(term277587, term277587.getClass(), "r_ver", null);
        setField(term277587, term277587.getClass(), "kc_serial", null);
        setField(term277587, term277587.getClass(), "b_serial", null);
        setField(term277587, term277587.getClass(), "place_id", null);
        setField(term277587, term277587.getClass(), "time_stamp", null);
        setField(term277587, term277587.getClass(), "start_up_mode", null);
        setField(term277587, term277587.getClass(), "cmm_dly_mod", null);
        setField(term277587, term277587.getClass(), "cmm_dly_sec", null);
        setField(term277587, term277587.getClass(), "cmm_err_mod", null);
        setField(term277587, term277587.getClass(), "country_code", null);
        setField(term277587, term277587.getClass(), "region_code", null);
        term277593 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyCstmzItmRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term277593;
        callMethod(klass, "setPd_id", argTypes, term277587, args);
    }

};


