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

public class Match_getResult_175744660721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5583;

    public Match_getResult_175744660721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5583 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term5597 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term5583, term5583.getClass(), "id", -2585684163342970173L);
        setField(term5583, term5583.getClass(), "city", "vOuMEpOQAg");
        setIntField(term5597, term5597.getClass(), "year", 2027);
        setShortField(term5597, term5597.getClass(), "month", (short) 3);
        setShortField(term5597, term5597.getClass(), "day", (short) 14);
        setField(term5583, term5583.getClass(), "date", term5597);
        setField(term5583, term5583.getClass(), "playerOfMatch", "SIODFGaQhr");
        setField(term5583, term5583.getClass(), "venue", "qYzsiuXOgS");
        setField(term5583, term5583.getClass(), "team1", "bxrCBbrrct");
        setField(term5583, term5583.getClass(), "team2", "CKWpJaaaxX");
        setField(term5583, term5583.getClass(), "tossWinner", "UBRmXJmfrt");
        setField(term5583, term5583.getClass(), "tossDecision", "WZzvmIHhzZ");
        setField(term5583, term5583.getClass(), "matchWinner", "doQLHkjpNm");
        setField(term5583, term5583.getClass(), "result", "lCyLIcSuom");
        setField(term5583, term5583.getClass(), "resultMargin", "CGOpQSZZwI");
        setField(term5583, term5583.getClass(), "umpire1", "ypEdrstygY");
        setField(term5583, term5583.getClass(), "umpire2", "sNQFlATEeQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Match");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResult", argTypes, term5583, args);
    }

};


