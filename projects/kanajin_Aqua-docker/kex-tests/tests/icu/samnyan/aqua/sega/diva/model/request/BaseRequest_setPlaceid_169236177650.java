package icu.samnyan.aqua.sega.diva.model.request;

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
import static icu.samnyan.aqua.sega.diva.model.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BaseRequest_setPlaceid_169236177650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261424;

    public BaseRequest_setPlaceid_169236177650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term261424 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        setField(term261424, term261424.getClass(), "cmd", null);
        setField(term261424, term261424.getClass(), "req_id", null);
        setField(term261424, term261424.getClass(), "game_id", null);
        setField(term261424, term261424.getClass(), "r_ver", null);
        setField(term261424, term261424.getClass(), "kc_serial", null);
        setField(term261424, term261424.getClass(), "b_serial", null);
        setField(term261424, term261424.getClass(), "place_id", null);
        setField(term261424, term261424.getClass(), "time_stamp", null);
        setField(term261424, term261424.getClass(), "start_up_mode", null);
        setField(term261424, term261424.getClass(), "cmm_dly_mod", null);
        setField(term261424, term261424.getClass(), "cmm_dly_sec", null);
        setField(term261424, term261424.getClass(), "cmm_err_mod", null);
        setField(term261424, term261424.getClass(), "country_code", null);
        setField(term261424, term261424.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlace_id", argTypes, term261424, args);
    }

};


