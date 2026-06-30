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

public class BaseRequest_getRegioncode_95775704143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261417;

    public BaseRequest_getRegioncode_95775704143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term261417 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        setField(term261417, term261417.getClass(), "cmd", null);
        setField(term261417, term261417.getClass(), "req_id", null);
        setField(term261417, term261417.getClass(), "game_id", null);
        setField(term261417, term261417.getClass(), "r_ver", null);
        setField(term261417, term261417.getClass(), "kc_serial", null);
        setField(term261417, term261417.getClass(), "b_serial", null);
        setField(term261417, term261417.getClass(), "place_id", null);
        setField(term261417, term261417.getClass(), "time_stamp", null);
        setField(term261417, term261417.getClass(), "start_up_mode", null);
        setField(term261417, term261417.getClass(), "cmm_dly_mod", null);
        setField(term261417, term261417.getClass(), "cmm_dly_sec", null);
        setField(term261417, term261417.getClass(), "cmm_err_mod", null);
        setField(term261417, term261417.getClass(), "country_code", null);
        setField(term261417, term261417.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegion_code", argTypes, term261417, args);
    }

};


