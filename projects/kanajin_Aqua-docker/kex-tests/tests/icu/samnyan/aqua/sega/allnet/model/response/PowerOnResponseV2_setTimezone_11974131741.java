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

public class PowerOnResponseV2_setTimezone_11974131741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29113;

    public PowerOnResponseV2_setTimezone_11974131741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29113 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term29113, term29113.getClass(), "stat", -2070466617);
        setField(term29113, term29113.getClass(), "uri", "iVIrSxTsaM");
        setField(term29113, term29113.getClass(), "host", "FmJNEfmYgq");
        setField(term29113, term29113.getClass(), "place_id", "NqQofgWsJd");
        setField(term29113, term29113.getClass(), "name", "ZlVRdHsBMO");
        setField(term29113, term29113.getClass(), "nickname", "UMMXkhuqzw");
        setField(term29113, term29113.getClass(), "region0", "KyGXZcXJwq");
        setField(term29113, term29113.getClass(), "region_name0", "TqiCjeuoWE");
        setField(term29113, term29113.getClass(), "region_name1", "GWWfkXOYLP");
        setField(term29113, term29113.getClass(), "region_name2", "qvykDllgpT");
        setField(term29113, term29113.getClass(), "region_name3", "hzdUbcLZhZ");
        setField(term29113, term29113.getClass(), "country", "GlxnEJvYeC");
        setIntField(term29113, term29113.getClass(), "year", -1127721881);
        setIntField(term29113, term29113.getClass(), "month", 1074848808);
        setIntField(term29113, term29113.getClass(), "day", -146054762);
        setIntField(term29113, term29113.getClass(), "hour", 798043553);
        setIntField(term29113, term29113.getClass(), "minute", 533197381);
        setIntField(term29113, term29113.getClass(), "second", 1048271679);
        setField(term29113, term29113.getClass(), "setting", "SLdOGaqmNv");
        setField(term29113, term29113.getClass(), "timezone", "QZfhwDBzyR");
        setField(term29113, term29113.getClass(), "res_class", "HvnMmAOZev");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JTPAQsfRtT";
        callMethod(klass, "setTimezone", argTypes, term29113, args);
    }

};


