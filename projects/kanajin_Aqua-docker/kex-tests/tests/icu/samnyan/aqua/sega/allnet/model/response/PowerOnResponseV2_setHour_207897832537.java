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

public class PowerOnResponseV2_setHour_207897832537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27821;
     Object term27997;

    public PowerOnResponseV2_setHour_207897832537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27821 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term27821, term27821.getClass(), "stat", -851097944);
        setField(term27821, term27821.getClass(), "uri", "LWEYaXeKBe");
        setField(term27821, term27821.getClass(), "host", "cNoFvpHBHw");
        setField(term27821, term27821.getClass(), "place_id", "DoSWbCtsBg");
        setField(term27821, term27821.getClass(), "name", "NrXtkbXwDc");
        setField(term27821, term27821.getClass(), "nickname", "EUapSrAmOe");
        setField(term27821, term27821.getClass(), "region0", "dUHylIprea");
        setField(term27821, term27821.getClass(), "region_name0", "FKDqHRpMcc");
        setField(term27821, term27821.getClass(), "region_name1", "mIRMQIxHUD");
        setField(term27821, term27821.getClass(), "region_name2", "FbBMtntDbw");
        setField(term27821, term27821.getClass(), "region_name3", "zRnpRGaHlI");
        setField(term27821, term27821.getClass(), "country", "dVHfxjbMRK");
        setIntField(term27821, term27821.getClass(), "year", 803925431);
        setIntField(term27821, term27821.getClass(), "month", 76929641);
        setIntField(term27821, term27821.getClass(), "day", -2003192918);
        setIntField(term27821, term27821.getClass(), "hour", -1362856620);
        setIntField(term27821, term27821.getClass(), "minute", -1835839814);
        setIntField(term27821, term27821.getClass(), "second", -1404350380);
        setField(term27821, term27821.getClass(), "setting", "LzwyLxKJpw");
        setField(term27821, term27821.getClass(), "timezone", "ZhWJlplAVK");
        setField(term27821, term27821.getClass(), "res_class", "pnmjTuTojv");
        term27997 = new Integer(-2013924238);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term27997;
        callMethod(klass, "setHour", argTypes, term27821, args);
    }

};


