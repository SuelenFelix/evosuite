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

public class PowerOnResponseV2_getMonth_7908138314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20303;

    public PowerOnResponseV2_getMonth_7908138314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20303 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term20303, term20303.getClass(), "stat", -1222006000);
        setField(term20303, term20303.getClass(), "uri", "dfzWTjcjnI");
        setField(term20303, term20303.getClass(), "host", "bsnZXGEvFv");
        setField(term20303, term20303.getClass(), "place_id", "osFrHWYeRy");
        setField(term20303, term20303.getClass(), "name", "scpIQUfPKw");
        setField(term20303, term20303.getClass(), "nickname", "QKYBpCjuYt");
        setField(term20303, term20303.getClass(), "region0", "vjiRfoGdkl");
        setField(term20303, term20303.getClass(), "region_name0", "TwaxeSHvnR");
        setField(term20303, term20303.getClass(), "region_name1", "paPzDETzIq");
        setField(term20303, term20303.getClass(), "region_name2", "fufeuGfwpN");
        setField(term20303, term20303.getClass(), "region_name3", "XJbkXbljvz");
        setField(term20303, term20303.getClass(), "country", "fuvdkDwBeH");
        setIntField(term20303, term20303.getClass(), "year", 2095798786);
        setIntField(term20303, term20303.getClass(), "month", -1565502840);
        setIntField(term20303, term20303.getClass(), "day", 344323424);
        setIntField(term20303, term20303.getClass(), "hour", 9726679);
        setIntField(term20303, term20303.getClass(), "minute", -25637976);
        setIntField(term20303, term20303.getClass(), "second", 1555897383);
        setField(term20303, term20303.getClass(), "setting", "NTefzwLPhx");
        setField(term20303, term20303.getClass(), "timezone", "dirFuhqyNu");
        setField(term20303, term20303.getClass(), "res_class", "YVLRenzuoR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMonth", argTypes, term20303, args);
    }

};


