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

public class BuyCstmzItmRequest_getStartidx_28915875014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277569;

    public BuyCstmzItmRequest_getStartidx_28915875014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277569 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyCstmzItmRequest"));
        setIntField(term277569, term277569.getClass(), "pd_id", 0);
        setIntField(term277569, term277569.getClass(), "accept_idx", 0);
        setIntField(term277569, term277569.getClass(), "start_idx", 0);
        setIntField(term277569, term277569.getClass(), "cstmz_itm_id", 0);
        setIntField(term277569, term277569.getClass(), "cstmz_itm_price", 0);
        setField(term277569, term277569.getClass(), "cmd", null);
        setField(term277569, term277569.getClass(), "req_id", null);
        setField(term277569, term277569.getClass(), "game_id", null);
        setField(term277569, term277569.getClass(), "r_ver", null);
        setField(term277569, term277569.getClass(), "kc_serial", null);
        setField(term277569, term277569.getClass(), "b_serial", null);
        setField(term277569, term277569.getClass(), "place_id", null);
        setField(term277569, term277569.getClass(), "time_stamp", null);
        setField(term277569, term277569.getClass(), "start_up_mode", null);
        setField(term277569, term277569.getClass(), "cmm_dly_mod", null);
        setField(term277569, term277569.getClass(), "cmm_dly_sec", null);
        setField(term277569, term277569.getClass(), "cmm_err_mod", null);
        setField(term277569, term277569.getClass(), "country_code", null);
        setField(term277569, term277569.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyCstmzItmRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStart_idx", argTypes, term277569, args);
    }

};


