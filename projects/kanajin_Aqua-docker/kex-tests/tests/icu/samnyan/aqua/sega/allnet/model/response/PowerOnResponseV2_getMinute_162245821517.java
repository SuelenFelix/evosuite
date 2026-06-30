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

public class PowerOnResponseV2_getMinute_162245821517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21251;

    public PowerOnResponseV2_getMinute_162245821517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21251 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term21251, term21251.getClass(), "stat", -523949691);
        setField(term21251, term21251.getClass(), "uri", "PFTdEDSbvZ");
        setField(term21251, term21251.getClass(), "host", "TbiwoiebNe");
        setField(term21251, term21251.getClass(), "place_id", "laTITSWZuc");
        setField(term21251, term21251.getClass(), "name", "fkzRpxlAqS");
        setField(term21251, term21251.getClass(), "nickname", "VYvbTGKslj");
        setField(term21251, term21251.getClass(), "region0", "owLqDDnwZA");
        setField(term21251, term21251.getClass(), "region_name0", "eBcTbweeYp");
        setField(term21251, term21251.getClass(), "region_name1", "drcmjfQUDq");
        setField(term21251, term21251.getClass(), "region_name2", "GjdWUoUSyA");
        setField(term21251, term21251.getClass(), "region_name3", "YEkxWsWaUl");
        setField(term21251, term21251.getClass(), "country", "RINhPkhhct");
        setIntField(term21251, term21251.getClass(), "year", 1398204340);
        setIntField(term21251, term21251.getClass(), "month", 229204365);
        setIntField(term21251, term21251.getClass(), "day", -461771056);
        setIntField(term21251, term21251.getClass(), "hour", -243422082);
        setIntField(term21251, term21251.getClass(), "minute", 1384592638);
        setIntField(term21251, term21251.getClass(), "second", -1002370457);
        setField(term21251, term21251.getClass(), "setting", "vjNPcTSqmS");
        setField(term21251, term21251.getClass(), "timezone", "fFhdWuJbdC");
        setField(term21251, term21251.getClass(), "res_class", "JlgLIHPabR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinute", argTypes, term21251, args);
    }

};


