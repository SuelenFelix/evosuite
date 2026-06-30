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

public class BuyCstmzItmRequest_setAcceptidx_186516954618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277595;
     Object term277601;

    public BuyCstmzItmRequest_setAcceptidx_186516954618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277595 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyCstmzItmRequest"));
        setIntField(term277595, term277595.getClass(), "pd_id", 0);
        setIntField(term277595, term277595.getClass(), "accept_idx", 0);
        setIntField(term277595, term277595.getClass(), "start_idx", 0);
        setIntField(term277595, term277595.getClass(), "cstmz_itm_id", 0);
        setIntField(term277595, term277595.getClass(), "cstmz_itm_price", 0);
        setField(term277595, term277595.getClass(), "cmd", null);
        setField(term277595, term277595.getClass(), "req_id", null);
        setField(term277595, term277595.getClass(), "game_id", null);
        setField(term277595, term277595.getClass(), "r_ver", null);
        setField(term277595, term277595.getClass(), "kc_serial", null);
        setField(term277595, term277595.getClass(), "b_serial", null);
        setField(term277595, term277595.getClass(), "place_id", null);
        setField(term277595, term277595.getClass(), "time_stamp", null);
        setField(term277595, term277595.getClass(), "start_up_mode", null);
        setField(term277595, term277595.getClass(), "cmm_dly_mod", null);
        setField(term277595, term277595.getClass(), "cmm_dly_sec", null);
        setField(term277595, term277595.getClass(), "cmm_err_mod", null);
        setField(term277595, term277595.getClass(), "country_code", null);
        setField(term277595, term277595.getClass(), "region_code", null);
        term277601 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyCstmzItmRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term277601;
        callMethod(klass, "setAccept_idx", argTypes, term277595, args);
    }

};


