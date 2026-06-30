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

public class PowerOnResponseV2_getSetting_137355790219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21883;

    public PowerOnResponseV2_getSetting_137355790219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21883 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term21883, term21883.getClass(), "stat", -1885090354);
        setField(term21883, term21883.getClass(), "uri", "taPBiMFNEZ");
        setField(term21883, term21883.getClass(), "host", "NoAFAfGyYL");
        setField(term21883, term21883.getClass(), "place_id", "MFtfkBMyOD");
        setField(term21883, term21883.getClass(), "name", "rdiIyXfRtL");
        setField(term21883, term21883.getClass(), "nickname", "douzkltmiI");
        setField(term21883, term21883.getClass(), "region0", "MFKjhvLtpe");
        setField(term21883, term21883.getClass(), "region_name0", "xpbLKEsput");
        setField(term21883, term21883.getClass(), "region_name1", "urlyLwPBVn");
        setField(term21883, term21883.getClass(), "region_name2", "SPQVzOlOzZ");
        setField(term21883, term21883.getClass(), "region_name3", "bOUAgAptAI");
        setField(term21883, term21883.getClass(), "country", "KSZfGbvzPE");
        setIntField(term21883, term21883.getClass(), "year", -2066804303);
        setIntField(term21883, term21883.getClass(), "month", -1731761810);
        setIntField(term21883, term21883.getClass(), "day", 197109649);
        setIntField(term21883, term21883.getClass(), "hour", -1239406390);
        setIntField(term21883, term21883.getClass(), "minute", 1557431527);
        setIntField(term21883, term21883.getClass(), "second", -1504890659);
        setField(term21883, term21883.getClass(), "setting", "YfgYGgzYER");
        setField(term21883, term21883.getClass(), "timezone", "IDClvDZuqE");
        setField(term21883, term21883.getClass(), "res_class", "cMvKxpZOvg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSetting", argTypes, term21883, args);
    }

};


