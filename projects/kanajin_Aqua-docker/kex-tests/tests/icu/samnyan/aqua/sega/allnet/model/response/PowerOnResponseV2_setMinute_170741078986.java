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

public class PowerOnResponseV2_setMinute_170741078986 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31375;
     Object term31383;

    public PowerOnResponseV2_setMinute_170741078986() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31375 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term31375, term31375.getClass(), "stat", 0);
        setField(term31375, term31375.getClass(), "uri", null);
        setField(term31375, term31375.getClass(), "host", null);
        setField(term31375, term31375.getClass(), "place_id", null);
        setField(term31375, term31375.getClass(), "name", null);
        setField(term31375, term31375.getClass(), "nickname", null);
        setField(term31375, term31375.getClass(), "region0", null);
        setField(term31375, term31375.getClass(), "region_name0", null);
        setField(term31375, term31375.getClass(), "region_name1", null);
        setField(term31375, term31375.getClass(), "region_name2", null);
        setField(term31375, term31375.getClass(), "region_name3", null);
        setField(term31375, term31375.getClass(), "country", null);
        setIntField(term31375, term31375.getClass(), "year", 0);
        setIntField(term31375, term31375.getClass(), "month", 0);
        setIntField(term31375, term31375.getClass(), "day", 0);
        setIntField(term31375, term31375.getClass(), "hour", 0);
        setIntField(term31375, term31375.getClass(), "minute", 0);
        setIntField(term31375, term31375.getClass(), "second", 0);
        setField(term31375, term31375.getClass(), "setting", null);
        setField(term31375, term31375.getClass(), "timezone", null);
        setField(term31375, term31375.getClass(), "res_class", null);
        term31383 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term31383;
        callMethod(klass, "setMinute", argTypes, term31375, args);
    }

};


