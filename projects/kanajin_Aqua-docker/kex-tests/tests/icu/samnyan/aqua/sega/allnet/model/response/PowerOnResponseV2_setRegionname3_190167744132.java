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

public class PowerOnResponseV2_setRegionname3_190167744132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26191;

    public PowerOnResponseV2_setRegionname3_190167744132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26191 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term26191, term26191.getClass(), "stat", 515182546);
        setField(term26191, term26191.getClass(), "uri", "NITCrIISoC");
        setField(term26191, term26191.getClass(), "host", "nSzzeexTDI");
        setField(term26191, term26191.getClass(), "place_id", "WBrpvMhmsz");
        setField(term26191, term26191.getClass(), "name", "ZzqRHVEXcM");
        setField(term26191, term26191.getClass(), "nickname", "YYwIEARNxi");
        setField(term26191, term26191.getClass(), "region0", "rblXBUdTFc");
        setField(term26191, term26191.getClass(), "region_name0", "rbsXSOJFKW");
        setField(term26191, term26191.getClass(), "region_name1", "sAgGDoUNlf");
        setField(term26191, term26191.getClass(), "region_name2", "TSTZcXdFFi");
        setField(term26191, term26191.getClass(), "region_name3", "RyaaOzWfYO");
        setField(term26191, term26191.getClass(), "country", "HAkxFBZZzz");
        setIntField(term26191, term26191.getClass(), "year", -936895502);
        setIntField(term26191, term26191.getClass(), "month", -129547140);
        setIntField(term26191, term26191.getClass(), "day", 199287428);
        setIntField(term26191, term26191.getClass(), "hour", -1195339592);
        setIntField(term26191, term26191.getClass(), "minute", -376422566);
        setIntField(term26191, term26191.getClass(), "second", 306847454);
        setField(term26191, term26191.getClass(), "setting", "yejonZnVuy");
        setField(term26191, term26191.getClass(), "timezone", "ouesGIsvuG");
        setField(term26191, term26191.getClass(), "res_class", "pHBHlmLIZQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZWRAbOuktl";
        callMethod(klass, "setRegion_name3", argTypes, term26191, args);
    }

};


