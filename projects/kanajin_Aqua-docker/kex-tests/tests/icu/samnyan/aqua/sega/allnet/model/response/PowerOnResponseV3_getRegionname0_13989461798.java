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

public class PowerOnResponseV3_getRegionname0_13989461798 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3009;

    public PowerOnResponseV3_getRegionname0_13989461798() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3009 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term3009, term3009.getClass(), "stat", 1227103734);
        setField(term3009, term3009.getClass(), "uri", "wfaXBpWAUH");
        setField(term3009, term3009.getClass(), "host", "VMeAzAHwZj");
        setField(term3009, term3009.getClass(), "place_id", "PznxWXsZME");
        setField(term3009, term3009.getClass(), "name", "ZzIujlwVsw");
        setField(term3009, term3009.getClass(), "nickname", "LWyEaeIyAo");
        setField(term3009, term3009.getClass(), "region0", "yVMkkQhvmN");
        setField(term3009, term3009.getClass(), "region_name0", "mvrkADEgpp");
        setField(term3009, term3009.getClass(), "region_name1", "pXOkjyeIRb");
        setField(term3009, term3009.getClass(), "region_name2", "GgZWSjxjyE");
        setField(term3009, term3009.getClass(), "region_name3", "EeBVbzjcCI");
        setField(term3009, term3009.getClass(), "country", "UfQtPRyWRC");
        setField(term3009, term3009.getClass(), "allnet_id", "FPvxVzzSvD");
        setField(term3009, term3009.getClass(), "client_timezone", "WHcwFgsGFC");
        setField(term3009, term3009.getClass(), "utc_time", "HzqpegHiRq");
        setField(term3009, term3009.getClass(), "setting", "jwsfVjMoJT");
        setField(term3009, term3009.getClass(), "res_ver", "ZfdXfCCFDf");
        setField(term3009, term3009.getClass(), "token", "MwwjNtdOFT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegion_name0", argTypes, term3009, args);
    }

};


