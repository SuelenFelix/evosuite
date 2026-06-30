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
import java.lang.Integer;

public class PowerOnResponseV2_setYear_160211378882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31335;
     Object term31343;

    public PowerOnResponseV2_setYear_160211378882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31335 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term31335, term31335.getClass(), "stat", 0);
        setField(term31335, term31335.getClass(), "uri", null);
        setField(term31335, term31335.getClass(), "host", null);
        setField(term31335, term31335.getClass(), "place_id", null);
        setField(term31335, term31335.getClass(), "name", null);
        setField(term31335, term31335.getClass(), "nickname", null);
        setField(term31335, term31335.getClass(), "region0", null);
        setField(term31335, term31335.getClass(), "region_name0", null);
        setField(term31335, term31335.getClass(), "region_name1", null);
        setField(term31335, term31335.getClass(), "region_name2", null);
        setField(term31335, term31335.getClass(), "region_name3", null);
        setField(term31335, term31335.getClass(), "country", null);
        setIntField(term31335, term31335.getClass(), "year", 0);
        setIntField(term31335, term31335.getClass(), "month", 0);
        setIntField(term31335, term31335.getClass(), "day", 0);
        setIntField(term31335, term31335.getClass(), "hour", 0);
        setIntField(term31335, term31335.getClass(), "minute", 0);
        setIntField(term31335, term31335.getClass(), "second", 0);
        setField(term31335, term31335.getClass(), "setting", null);
        setField(term31335, term31335.getClass(), "timezone", null);
        setField(term31335, term31335.getClass(), "res_class", null);
        term31343 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term31343;
        callMethod(klass, "setYear", argTypes, term31335, args);
    }

};


