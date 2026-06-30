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

public class PowerOnResponseV2_setRegionname0_190168032429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25177;

    public PowerOnResponseV2_setRegionname0_190168032429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25177 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term25177, term25177.getClass(), "stat", 252575029);
        setField(term25177, term25177.getClass(), "uri", "gHRMJRsBGm");
        setField(term25177, term25177.getClass(), "host", "rZyrfnMvHa");
        setField(term25177, term25177.getClass(), "place_id", "GMyMhTZeDC");
        setField(term25177, term25177.getClass(), "name", "KqQOTshBOL");
        setField(term25177, term25177.getClass(), "nickname", "cuWgFcYkPC");
        setField(term25177, term25177.getClass(), "region0", "HfbcOKkXBm");
        setField(term25177, term25177.getClass(), "region_name0", "pLbTzSMbsN");
        setField(term25177, term25177.getClass(), "region_name1", "lFSbxerCPP");
        setField(term25177, term25177.getClass(), "region_name2", "vjaZIyixCm");
        setField(term25177, term25177.getClass(), "region_name3", "gAAPyftlIR");
        setField(term25177, term25177.getClass(), "country", "kevWstoxwq");
        setIntField(term25177, term25177.getClass(), "year", 57189932);
        setIntField(term25177, term25177.getClass(), "month", 1460722225);
        setIntField(term25177, term25177.getClass(), "day", 1743224434);
        setIntField(term25177, term25177.getClass(), "hour", 842904495);
        setIntField(term25177, term25177.getClass(), "minute", 1008080511);
        setIntField(term25177, term25177.getClass(), "second", 1935707624);
        setField(term25177, term25177.getClass(), "setting", "aSYOhFwzSm");
        setField(term25177, term25177.getClass(), "timezone", "pVZlzrBeDB");
        setField(term25177, term25177.getClass(), "res_class", "EfSUvjuZAA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PrHWfHydsG";
        callMethod(klass, "setRegion_name0", argTypes, term25177, args);
    }

};


