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

public class Match_setTeam2_3072893114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3605;

    public Match_setTeam2_3072893114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3605 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term3619 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term3605, term3605.getClass(), "id", -5476826692763582090L);
        setField(term3605, term3605.getClass(), "city", "VeDtgDzGAN");
        setIntField(term3619, term3619.getClass(), "year", 2024);
        setShortField(term3619, term3619.getClass(), "month", (short) 1);
        setShortField(term3619, term3619.getClass(), "day", (short) 24);
        setField(term3605, term3605.getClass(), "date", term3619);
        setField(term3605, term3605.getClass(), "playerOfMatch", "aWYOWZFyaX");
        setField(term3605, term3605.getClass(), "venue", "BRIVNtfUWU");
        setField(term3605, term3605.getClass(), "team1", "DbiCVtPPCT");
        setField(term3605, term3605.getClass(), "team2", "WzFopsaDuG");
        setField(term3605, term3605.getClass(), "tossWinner", "PapWxkhEWe");
        setField(term3605, term3605.getClass(), "tossDecision", "smnHEqRFRx");
        setField(term3605, term3605.getClass(), "matchWinner", "XYtryyobou");
        setField(term3605, term3605.getClass(), "result", "OYbzXylRWW");
        setField(term3605, term3605.getClass(), "resultMargin", "DSNsTGYXDF");
        setField(term3605, term3605.getClass(), "umpire1", "sQvGcVjdEx");
        setField(term3605, term3605.getClass(), "umpire2", "rLHAoqXgPh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Match");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zUlRdimJtU";
        callMethod(klass, "setTeam2", argTypes, term3605, args);
    }

};


