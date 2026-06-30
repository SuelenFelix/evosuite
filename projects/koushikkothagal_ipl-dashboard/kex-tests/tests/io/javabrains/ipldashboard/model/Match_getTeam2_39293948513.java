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

public class Match_getTeam2_39293948513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3335;

    public Match_getTeam2_39293948513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3335 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term3349 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term3335, term3335.getClass(), "id", 2535595959091595249L);
        setField(term3335, term3335.getClass(), "city", "WHcwFgsGFC");
        setIntField(term3349, term3349.getClass(), "year", 2012);
        setShortField(term3349, term3349.getClass(), "month", (short) 10);
        setShortField(term3349, term3349.getClass(), "day", (short) 1);
        setField(term3335, term3335.getClass(), "date", term3349);
        setField(term3335, term3335.getClass(), "playerOfMatch", "HzqpegHiRq");
        setField(term3335, term3335.getClass(), "venue", "jwsfVjMoJT");
        setField(term3335, term3335.getClass(), "team1", "ZfdXfCCFDf");
        setField(term3335, term3335.getClass(), "team2", "MwwjNtdOFT");
        setField(term3335, term3335.getClass(), "tossWinner", "VYkqXKVlAJ");
        setField(term3335, term3335.getClass(), "tossDecision", "XkIoWJRNwN");
        setField(term3335, term3335.getClass(), "matchWinner", "aNWLJdrZMq");
        setField(term3335, term3335.getClass(), "result", "HHmNoYxIGj");
        setField(term3335, term3335.getClass(), "resultMargin", "PtirvZmsGt");
        setField(term3335, term3335.getClass(), "umpire1", "HWkpTmtlrc");
        setField(term3335, term3335.getClass(), "umpire2", "hMmaoREuCK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Match");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTeam2", argTypes, term3335, args);
    }

};


