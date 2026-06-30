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

public class PowerOnResponseV2_setSecond_58382770787 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31385;
     Object term31393;

    public PowerOnResponseV2_setSecond_58382770787() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31385 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term31385, term31385.getClass(), "stat", 0);
        setField(term31385, term31385.getClass(), "uri", null);
        setField(term31385, term31385.getClass(), "host", null);
        setField(term31385, term31385.getClass(), "place_id", null);
        setField(term31385, term31385.getClass(), "name", null);
        setField(term31385, term31385.getClass(), "nickname", null);
        setField(term31385, term31385.getClass(), "region0", null);
        setField(term31385, term31385.getClass(), "region_name0", null);
        setField(term31385, term31385.getClass(), "region_name1", null);
        setField(term31385, term31385.getClass(), "region_name2", null);
        setField(term31385, term31385.getClass(), "region_name3", null);
        setField(term31385, term31385.getClass(), "country", null);
        setIntField(term31385, term31385.getClass(), "year", 0);
        setIntField(term31385, term31385.getClass(), "month", 0);
        setIntField(term31385, term31385.getClass(), "day", 0);
        setIntField(term31385, term31385.getClass(), "hour", 0);
        setIntField(term31385, term31385.getClass(), "minute", 0);
        setIntField(term31385, term31385.getClass(), "second", 0);
        setField(term31385, term31385.getClass(), "setting", null);
        setField(term31385, term31385.getClass(), "timezone", null);
        setField(term31385, term31385.getClass(), "res_class", null);
        term31393 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term31393;
        callMethod(klass, "setSecond", argTypes, term31385, args);
    }

};


