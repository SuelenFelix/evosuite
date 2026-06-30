package io.javabrains.ipldashboard.model;

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
import static io.javabrains.ipldashboard.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Match_setResult_8846720922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5853;

    public Match_setResult_8846720922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5853 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term5867 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term5853, term5853.getClass(), "id", 8059786003080744426L);
        setField(term5853, term5853.getClass(), "city", "ZKMLioamsY");
        setIntField(term5867, term5867.getClass(), "year", 2018);
        setShortField(term5867, term5867.getClass(), "month", (short) 9);
        setShortField(term5867, term5867.getClass(), "day", (short) 27);
        setField(term5853, term5853.getClass(), "date", term5867);
        setField(term5853, term5853.getClass(), "playerOfMatch", "WVbxuoDBcn");
        setField(term5853, term5853.getClass(), "venue", "pvDEABOxLt");
        setField(term5853, term5853.getClass(), "team1", "beAMpkroCQ");
        setField(term5853, term5853.getClass(), "team2", "uSUvKAyuvd");
        setField(term5853, term5853.getClass(), "tossWinner", "onQLVONGuf");
        setField(term5853, term5853.getClass(), "tossDecision", "SOrEHbcbmn");
        setField(term5853, term5853.getClass(), "matchWinner", "bnsyeQXFdu");
        setField(term5853, term5853.getClass(), "result", "BwtdjiefJn");
        setField(term5853, term5853.getClass(), "resultMargin", "jDmhBrIoDa");
        setField(term5853, term5853.getClass(), "umpire1", "SPtPatHeOm");
        setField(term5853, term5853.getClass(), "umpire2", "ywmcuThdfL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Match");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GBOEuByOfr";
        callMethod(klass, "setResult", argTypes, term5853, args);
    }

};


