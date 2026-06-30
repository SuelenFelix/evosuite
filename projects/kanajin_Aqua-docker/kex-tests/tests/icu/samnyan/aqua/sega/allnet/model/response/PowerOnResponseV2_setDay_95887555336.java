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

public class PowerOnResponseV2_setDay_95887555336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27503;
     Object term27679;

    public PowerOnResponseV2_setDay_95887555336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27503 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term27503, term27503.getClass(), "stat", 1768204942);
        setField(term27503, term27503.getClass(), "uri", "BrWqhEIUUj");
        setField(term27503, term27503.getClass(), "host", "WfUmxdiHcU");
        setField(term27503, term27503.getClass(), "place_id", "BRrftvRvmF");
        setField(term27503, term27503.getClass(), "name", "fvoyRbZTsm");
        setField(term27503, term27503.getClass(), "nickname", "iOCnOQXWTl");
        setField(term27503, term27503.getClass(), "region0", "ARnOWpgtAg");
        setField(term27503, term27503.getClass(), "region_name0", "MRrYxZoJBW");
        setField(term27503, term27503.getClass(), "region_name1", "fheZXFNQZh");
        setField(term27503, term27503.getClass(), "region_name2", "YxHVWlebna");
        setField(term27503, term27503.getClass(), "region_name3", "IEmAQCkrPE");
        setField(term27503, term27503.getClass(), "country", "lqFGhtlNRM");
        setIntField(term27503, term27503.getClass(), "year", 1252951645);
        setIntField(term27503, term27503.getClass(), "month", 574481092);
        setIntField(term27503, term27503.getClass(), "day", -310528004);
        setIntField(term27503, term27503.getClass(), "hour", -634976996);
        setIntField(term27503, term27503.getClass(), "minute", -1015274146);
        setIntField(term27503, term27503.getClass(), "second", -49052672);
        setField(term27503, term27503.getClass(), "setting", "GLxLHUsuLw");
        setField(term27503, term27503.getClass(), "timezone", "HuKdqrrxIm");
        setField(term27503, term27503.getClass(), "res_class", "yJKKddLqMb");
        term27679 = new Integer(339372704);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term27679;
        callMethod(klass, "setDay", argTypes, term27503, args);
    }

};


