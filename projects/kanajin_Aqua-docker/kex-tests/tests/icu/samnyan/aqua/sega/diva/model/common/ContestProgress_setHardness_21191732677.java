package icu.samnyan.aqua.sega.diva.model.common;

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
import static icu.samnyan.aqua.sega.diva.model.common.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ContestProgress_setHardness_21191732677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3088;
     Object term3095;

    public ContestProgress_setHardness_21191732677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3088 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.ContestProgress"));
        setIntField(term3088, term3088.getClass(), "pvId", 1324040357);
        setIntField(term3088, term3088.getClass(), "hardness", -1588772968);
        setIntField(term3088, term3088.getClass(), "edition", -93135961);
        setIntField(term3088, term3088.getClass(), "stars", -112921587);
        setIntField(term3088, term3088.getClass(), "scores", 933028652);
        setIntField(term3088, term3088.getClass(), "version", 287287233);
        term3095 = new Integer(962840079);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.ContestProgress");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3095;
        callMethod(klass, "setHardness", argTypes, term3088, args);
    }

};


