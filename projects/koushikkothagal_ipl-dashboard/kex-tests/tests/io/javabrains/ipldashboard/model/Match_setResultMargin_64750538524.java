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

public class Match_setResultMargin_64750538524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6415;

    public Match_setResultMargin_64750538524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6415 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term6429 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term6415, term6415.getClass(), "id", 2486810210675247493L);
        setField(term6415, term6415.getClass(), "city", "tsTGdgQYUL");
        setIntField(term6429, term6429.getClass(), "year", 2012);
        setShortField(term6429, term6429.getClass(), "month", (short) 9);
        setShortField(term6429, term6429.getClass(), "day", (short) 11);
        setField(term6415, term6415.getClass(), "date", term6429);
        setField(term6415, term6415.getClass(), "playerOfMatch", "TtGbVmKcnX");
        setField(term6415, term6415.getClass(), "venue", "GJVkUrCVdD");
        setField(term6415, term6415.getClass(), "team1", "zNdorvdUgu");
        setField(term6415, term6415.getClass(), "team2", "oPxuZbkYio");
        setField(term6415, term6415.getClass(), "tossWinner", "vKitydDVnM");
        setField(term6415, term6415.getClass(), "tossDecision", "urCiQnUFBM");
        setField(term6415, term6415.getClass(), "matchWinner", "EKjQdtKxAM");
        setField(term6415, term6415.getClass(), "result", "TXZAIPQJHt");
        setField(term6415, term6415.getClass(), "resultMargin", "DIbeDHICho");
        setField(term6415, term6415.getClass(), "umpire1", "dJGPlmSRnz");
        setField(term6415, term6415.getClass(), "umpire2", "DPskuFUobI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Match");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wBGfLpNNiZ";
        callMethod(klass, "setResultMargin", argTypes, term6415, args);
    }

};


