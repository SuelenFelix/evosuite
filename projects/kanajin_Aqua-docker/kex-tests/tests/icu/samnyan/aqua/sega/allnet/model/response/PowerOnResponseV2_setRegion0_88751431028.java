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

public class PowerOnResponseV2_setRegion0_88751431028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24839;

    public PowerOnResponseV2_setRegion0_88751431028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24839 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term24839, term24839.getClass(), "stat", 479531250);
        setField(term24839, term24839.getClass(), "uri", "dfZepHfGwh");
        setField(term24839, term24839.getClass(), "host", "zjfMxUERFZ");
        setField(term24839, term24839.getClass(), "place_id", "ooVlhmiOff");
        setField(term24839, term24839.getClass(), "name", "dUNzDLXJcj");
        setField(term24839, term24839.getClass(), "nickname", "OrVSjRJVwa");
        setField(term24839, term24839.getClass(), "region0", "cdZEcINJAM");
        setField(term24839, term24839.getClass(), "region_name0", "qumYSwcWHz");
        setField(term24839, term24839.getClass(), "region_name1", "raNzcEorkV");
        setField(term24839, term24839.getClass(), "region_name2", "nEgozCeoUr");
        setField(term24839, term24839.getClass(), "region_name3", "EWGMzlcOnW");
        setField(term24839, term24839.getClass(), "country", "XeSDJYKMBf");
        setIntField(term24839, term24839.getClass(), "year", 1320570890);
        setIntField(term24839, term24839.getClass(), "month", -130649791);
        setIntField(term24839, term24839.getClass(), "day", 534834644);
        setIntField(term24839, term24839.getClass(), "hour", 1959097203);
        setIntField(term24839, term24839.getClass(), "minute", -209654048);
        setIntField(term24839, term24839.getClass(), "second", 477625804);
        setField(term24839, term24839.getClass(), "setting", "tIsFcOGTUX");
        setField(term24839, term24839.getClass(), "timezone", "XUVRcnELFP");
        setField(term24839, term24839.getClass(), "res_class", "xIeSbezmkD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "txUWLZRkSv";
        callMethod(klass, "setRegion0", argTypes, term24839, args);
    }

};


