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

public class Match_getTossWinner_124734309015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3897;

    public Match_getTossWinner_124734309015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3897 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term3911 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term3897, term3897.getClass(), "id", -872011222785455006L);
        setField(term3897, term3897.getClass(), "city", "vwbEQQNQrx");
        setIntField(term3911, term3911.getClass(), "year", 2029);
        setShortField(term3911, term3911.getClass(), "month", (short) 1);
        setShortField(term3911, term3911.getClass(), "day", (short) 20);
        setField(term3897, term3897.getClass(), "date", term3911);
        setField(term3897, term3897.getClass(), "playerOfMatch", "xtftXXMbem");
        setField(term3897, term3897.getClass(), "venue", "cudZvLMQon");
        setField(term3897, term3897.getClass(), "team1", "lihXWlGDxk");
        setField(term3897, term3897.getClass(), "team2", "JmcmxoGhIK");
        setField(term3897, term3897.getClass(), "tossWinner", "jXzmYyrnnT");
        setField(term3897, term3897.getClass(), "tossDecision", "igCAtimmYB");
        setField(term3897, term3897.getClass(), "matchWinner", "DyiXbeYIaN");
        setField(term3897, term3897.getClass(), "result", "VGizxZnyHX");
        setField(term3897, term3897.getClass(), "resultMargin", "kVEZMHmRtR");
        setField(term3897, term3897.getClass(), "umpire1", "ekxGuOYIwi");
        setField(term3897, term3897.getClass(), "umpire2", "RbVQXSpxXy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Match");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTossWinner", argTypes, term3897, args);
    }

};


