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

public class Match_getTossDecision_114236676317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4459;

    public Match_getTossDecision_114236676317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4459 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term4473 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term4459, term4459.getClass(), "id", 5127676408959197577L);
        setField(term4459, term4459.getClass(), "city", "XJJNClzHRf");
        setIntField(term4473, term4473.getClass(), "year", 2015);
        setShortField(term4473, term4473.getClass(), "month", (short) 7);
        setShortField(term4473, term4473.getClass(), "day", (short) 24);
        setField(term4459, term4459.getClass(), "date", term4473);
        setField(term4459, term4459.getClass(), "playerOfMatch", "HDaezxQfQR");
        setField(term4459, term4459.getClass(), "venue", "iikZEapDlu");
        setField(term4459, term4459.getClass(), "team1", "nhoHrZfnIN");
        setField(term4459, term4459.getClass(), "team2", "ZkMALXpEAZ");
        setField(term4459, term4459.getClass(), "tossWinner", "tXfQjSqDzN");
        setField(term4459, term4459.getClass(), "tossDecision", "BjugTaMcxJ");
        setField(term4459, term4459.getClass(), "matchWinner", "vGiuZVPJNH");
        setField(term4459, term4459.getClass(), "result", "tlzpzIjMib");
        setField(term4459, term4459.getClass(), "resultMargin", "AZdLeSugwv");
        setField(term4459, term4459.getClass(), "umpire1", "RMsXuyzKJV");
        setField(term4459, term4459.getClass(), "umpire2", "FwPbDZcHmB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Match");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTossDecision", argTypes, term4459, args);
    }

};


