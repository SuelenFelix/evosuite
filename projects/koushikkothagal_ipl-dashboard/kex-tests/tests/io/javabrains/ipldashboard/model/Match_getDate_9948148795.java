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

public class Match_getDate_9948148795 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1105;

    public Match_getDate_9948148795() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1105 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term1119 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term1105, term1105.getClass(), "id", 7411271909051562686L);
        setField(term1105, term1105.getClass(), "city", "jDtqGUpnZN");
        setIntField(term1119, term1119.getClass(), "year", 2015);
        setShortField(term1119, term1119.getClass(), "month", (short) 9);
        setShortField(term1119, term1119.getClass(), "day", (short) 19);
        setField(term1105, term1105.getClass(), "date", term1119);
        setField(term1105, term1105.getClass(), "playerOfMatch", "nGKItKLYNC");
        setField(term1105, term1105.getClass(), "venue", "UiUYnPrcCi");
        setField(term1105, term1105.getClass(), "team1", "UoYtihxVaS");
        setField(term1105, term1105.getClass(), "team2", "JDswTTCZHV");
        setField(term1105, term1105.getClass(), "tossWinner", "onpbIeEKoi");
        setField(term1105, term1105.getClass(), "tossDecision", "YRHGsAkhxb");
        setField(term1105, term1105.getClass(), "matchWinner", "ffYhPOzlUs");
        setField(term1105, term1105.getClass(), "result", "MLqYREekMl");
        setField(term1105, term1105.getClass(), "resultMargin", "ytSBIKXogI");
        setField(term1105, term1105.getClass(), "umpire1", "nHXjMycHlU");
        setField(term1105, term1105.getClass(), "umpire2", "ieCtQFdkii");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Match");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDate", argTypes, term1105, args);
    }

};


