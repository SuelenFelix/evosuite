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

public class PowerOnResponseV2_getSecond_66878028166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31205;

    public PowerOnResponseV2_getSecond_66878028166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31205 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term31205, term31205.getClass(), "stat", 0);
        setField(term31205, term31205.getClass(), "uri", null);
        setField(term31205, term31205.getClass(), "host", null);
        setField(term31205, term31205.getClass(), "place_id", null);
        setField(term31205, term31205.getClass(), "name", null);
        setField(term31205, term31205.getClass(), "nickname", null);
        setField(term31205, term31205.getClass(), "region0", null);
        setField(term31205, term31205.getClass(), "region_name0", null);
        setField(term31205, term31205.getClass(), "region_name1", null);
        setField(term31205, term31205.getClass(), "region_name2", null);
        setField(term31205, term31205.getClass(), "region_name3", null);
        setField(term31205, term31205.getClass(), "country", null);
        setIntField(term31205, term31205.getClass(), "year", 0);
        setIntField(term31205, term31205.getClass(), "month", 0);
        setIntField(term31205, term31205.getClass(), "day", 0);
        setIntField(term31205, term31205.getClass(), "hour", 0);
        setIntField(term31205, term31205.getClass(), "minute", 0);
        setIntField(term31205, term31205.getClass(), "second", 0);
        setField(term31205, term31205.getClass(), "setting", null);
        setField(term31205, term31205.getClass(), "timezone", null);
        setField(term31205, term31205.getClass(), "res_class", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSecond", argTypes, term31205, args);
    }

};


