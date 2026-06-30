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

public class Match_setUmpire2_62108516228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7539;

    public Match_setUmpire2_62108516228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7539 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term7553 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term7539, term7539.getClass(), "id", 1967728129628047933L);
        setField(term7539, term7539.getClass(), "city", "GPSEWEDSTo");
        setIntField(term7553, term7553.getClass(), "year", 2012);
        setShortField(term7553, term7553.getClass(), "month", (short) 2);
        setShortField(term7553, term7553.getClass(), "day", (short) 19);
        setField(term7539, term7539.getClass(), "date", term7553);
        setField(term7539, term7539.getClass(), "playerOfMatch", "RCOqfVsRHt");
        setField(term7539, term7539.getClass(), "venue", "TSyCeEZPaT");
        setField(term7539, term7539.getClass(), "team1", "JeZFtaqkzW");
        setField(term7539, term7539.getClass(), "team2", "vOVuNSCCLe");
        setField(term7539, term7539.getClass(), "tossWinner", "fzeqPnzpnt");
        setField(term7539, term7539.getClass(), "tossDecision", "RxbhrFBjkO");
        setField(term7539, term7539.getClass(), "matchWinner", "aanyiAOJCl");
        setField(term7539, term7539.getClass(), "result", "VDokbsCuqq");
        setField(term7539, term7539.getClass(), "resultMargin", "xClUIcPECX");
        setField(term7539, term7539.getClass(), "umpire1", "avhRaGZaBF");
        setField(term7539, term7539.getClass(), "umpire2", "JkgoRtImdE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Match");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qFGKIJjlmV";
        callMethod(klass, "setUmpire2", argTypes, term7539, args);
    }

};


