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

public class Match_setMatchWinner_148916116420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5291;

    public Match_setMatchWinner_148916116420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5291 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term5305 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term5291, term5291.getClass(), "id", 8428634514691209827L);
        setField(term5291, term5291.getClass(), "city", "XfRABIFVEp");
        setIntField(term5305, term5305.getClass(), "year", 2019);
        setShortField(term5305, term5305.getClass(), "month", (short) 2);
        setShortField(term5305, term5305.getClass(), "day", (short) 20);
        setField(term5291, term5291.getClass(), "date", term5305);
        setField(term5291, term5291.getClass(), "playerOfMatch", "MHGKyEnwKc");
        setField(term5291, term5291.getClass(), "venue", "ShIELyuULw");
        setField(term5291, term5291.getClass(), "team1", "IpQuOGMgmj");
        setField(term5291, term5291.getClass(), "team2", "pJbnHTYrxn");
        setField(term5291, term5291.getClass(), "tossWinner", "iIRsCSYqXH");
        setField(term5291, term5291.getClass(), "tossDecision", "nghfqDXyCG");
        setField(term5291, term5291.getClass(), "matchWinner", "WBAOTqErtm");
        setField(term5291, term5291.getClass(), "result", "PqtVXXZMqK");
        setField(term5291, term5291.getClass(), "resultMargin", "rYbtIDVdnd");
        setField(term5291, term5291.getClass(), "umpire1", "UKAReurpHG");
        setField(term5291, term5291.getClass(), "umpire2", "WVRMUmrljA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Match");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NTlKJDDWlk";
        callMethod(klass, "setMatchWinner", argTypes, term5291, args);
    }

};


