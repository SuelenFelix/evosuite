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

public class PowerOnResponseV2_getPlaceid_7047742754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17143;

    public PowerOnResponseV2_getPlaceid_7047742754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17143 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term17143, term17143.getClass(), "stat", 287287233);
        setField(term17143, term17143.getClass(), "uri", "pMfTuAFXxg");
        setField(term17143, term17143.getClass(), "host", "XCZmhkblRc");
        setField(term17143, term17143.getClass(), "place_id", "gFUWMydGCU");
        setField(term17143, term17143.getClass(), "name", "LLegSTfqJt");
        setField(term17143, term17143.getClass(), "nickname", "XQfmqLbqHS");
        setField(term17143, term17143.getClass(), "region0", "jLVLqQSjqg");
        setField(term17143, term17143.getClass(), "region_name0", "JKGueoHesL");
        setField(term17143, term17143.getClass(), "region_name1", "CRAUqtVBkU");
        setField(term17143, term17143.getClass(), "region_name2", "DddqUYfomL");
        setField(term17143, term17143.getClass(), "region_name3", "YQwoogpPyi");
        setField(term17143, term17143.getClass(), "country", "rnPhHoorxj");
        setIntField(term17143, term17143.getClass(), "year", 962840079);
        setIntField(term17143, term17143.getClass(), "month", 1540719661);
        setIntField(term17143, term17143.getClass(), "day", 1265463001);
        setIntField(term17143, term17143.getClass(), "hour", 335112684);
        setIntField(term17143, term17143.getClass(), "minute", 1551099402);
        setIntField(term17143, term17143.getClass(), "second", -2027534003);
        setField(term17143, term17143.getClass(), "setting", "GuwJLKquuI");
        setField(term17143, term17143.getClass(), "timezone", "vYMCjgnztg");
        setField(term17143, term17143.getClass(), "res_class", "YupgKTSEiI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlace_id", argTypes, term17143, args);
    }

};


