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

public class ContestProgress_setEdition_89825108321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3205;
     Object term3212;

    public ContestProgress_setEdition_89825108321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3205 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.ContestProgress"));
        setIntField(term3205, term3205.getClass(), "pvId", 0);
        setIntField(term3205, term3205.getClass(), "hardness", 0);
        setIntField(term3205, term3205.getClass(), "edition", 0);
        setIntField(term3205, term3205.getClass(), "stars", 0);
        setIntField(term3205, term3205.getClass(), "scores", 0);
        setIntField(term3205, term3205.getClass(), "version", 0);
        term3212 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.ContestProgress");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3212;
        callMethod(klass, "setEdition", argTypes, term3205, args);
    }

};


