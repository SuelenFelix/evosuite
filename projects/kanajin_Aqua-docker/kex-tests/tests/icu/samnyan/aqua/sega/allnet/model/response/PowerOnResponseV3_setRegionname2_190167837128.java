package icu.samnyan.aqua.sega.allnet.model.response;

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
import static icu.samnyan.aqua.sega.allnet.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PowerOnResponseV3_setRegionname2_190167837128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10707;

    public PowerOnResponseV3_setRegionname2_190167837128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10707 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term10707, term10707.getClass(), "stat", -244121226);
        setField(term10707, term10707.getClass(), "uri", "goAoCMhKBu");
        setField(term10707, term10707.getClass(), "host", "BWxJSgKHRT");
        setField(term10707, term10707.getClass(), "place_id", "AGXoIndFnm");
        setField(term10707, term10707.getClass(), "name", "mwmFMNEzkK");
        setField(term10707, term10707.getClass(), "nickname", "kVAmKknVln");
        setField(term10707, term10707.getClass(), "region0", "MRFLbEGYKG");
        setField(term10707, term10707.getClass(), "region_name0", "BYrGukTyof");
        setField(term10707, term10707.getClass(), "region_name1", "jiCGTTzKGB");
        setField(term10707, term10707.getClass(), "region_name2", "MqICFYzDJj");
        setField(term10707, term10707.getClass(), "region_name3", "YgQvdcBQKw");
        setField(term10707, term10707.getClass(), "country", "FiYYLuailz");
        setField(term10707, term10707.getClass(), "allnet_id", "XebAeSnCKZ");
        setField(term10707, term10707.getClass(), "client_timezone", "GeddnXjHGy");
        setField(term10707, term10707.getClass(), "utc_time", "vLTbaoAxBm");
        setField(term10707, term10707.getClass(), "setting", "BXTjEyEZxD");
        setField(term10707, term10707.getClass(), "res_ver", "oKhVzOKUFW");
        setField(term10707, term10707.getClass(), "token", "mNHyqmOAFy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UxgSdhxPCH";
        callMethod(klass, "setRegion_name2", argTypes, term10707, args);
    }

};


