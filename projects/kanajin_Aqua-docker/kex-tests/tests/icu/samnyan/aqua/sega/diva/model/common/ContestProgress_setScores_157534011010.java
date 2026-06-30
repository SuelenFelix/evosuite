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

public class ContestProgress_setScores_157534011010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3115;
     Object term3122;

    public ContestProgress_setScores_157534011010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3115 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.ContestProgress"));
        setIntField(term3115, term3115.getClass(), "pvId", -1547384488);
        setIntField(term3115, term3115.getClass(), "hardness", 1442160736);
        setIntField(term3115, term3115.getClass(), "edition", 1114000454);
        setIntField(term3115, term3115.getClass(), "stars", -556405712);
        setIntField(term3115, term3115.getClass(), "scores", -1772434990);
        setIntField(term3115, term3115.getClass(), "version", -1845499264);
        term3122 = new Integer(-505439934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.ContestProgress");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3122;
        callMethod(klass, "setScores", argTypes, term3115, args);
    }

};


