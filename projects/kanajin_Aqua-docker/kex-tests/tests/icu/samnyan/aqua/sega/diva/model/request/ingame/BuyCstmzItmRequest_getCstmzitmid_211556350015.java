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

public class BuyCstmzItmRequest_getCstmzitmid_211556350015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277575;

    public BuyCstmzItmRequest_getCstmzitmid_211556350015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277575 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyCstmzItmRequest"));
        setIntField(term277575, term277575.getClass(), "pd_id", 0);
        setIntField(term277575, term277575.getClass(), "accept_idx", 0);
        setIntField(term277575, term277575.getClass(), "start_idx", 0);
        setIntField(term277575, term277575.getClass(), "cstmz_itm_id", 0);
        setIntField(term277575, term277575.getClass(), "cstmz_itm_price", 0);
        setField(term277575, term277575.getClass(), "cmd", null);
        setField(term277575, term277575.getClass(), "req_id", null);
        setField(term277575, term277575.getClass(), "game_id", null);
        setField(term277575, term277575.getClass(), "r_ver", null);
        setField(term277575, term277575.getClass(), "kc_serial", null);
        setField(term277575, term277575.getClass(), "b_serial", null);
        setField(term277575, term277575.getClass(), "place_id", null);
        setField(term277575, term277575.getClass(), "time_stamp", null);
        setField(term277575, term277575.getClass(), "start_up_mode", null);
        setField(term277575, term277575.getClass(), "cmm_dly_mod", null);
        setField(term277575, term277575.getClass(), "cmm_dly_sec", null);
        setField(term277575, term277575.getClass(), "cmm_err_mod", null);
        setField(term277575, term277575.getClass(), "country_code", null);
        setField(term277575, term277575.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyCstmzItmRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCstmz_itm_id", argTypes, term277575, args);
    }

};


