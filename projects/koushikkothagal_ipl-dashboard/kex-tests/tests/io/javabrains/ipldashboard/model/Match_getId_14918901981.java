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

public class Match_getId_14918901981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Match_getId_14918901981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term15 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term1, term1.getClass(), "id", 2442117782898005296L);
        setField(term1, term1.getClass(), "city", "PAEBtnZtTD");
        setIntField(term15, term15.getClass(), "year", 2012);
        setShortField(term15, term15.getClass(), "month", (short) 8);
        setShortField(term15, term15.getClass(), "day", (short) 25);
        setField(term1, term1.getClass(), "date", term15);
        setField(term1, term1.getClass(), "playerOfMatch", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "venue", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "team1", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "team2", "jJCZpVmanW");
        setField(term1, term1.getClass(), "tossWinner", "EGtDIRbSSb");
        setField(term1, term1.getClass(), "tossDecision", "SzjVpOQTyS");
        setField(term1, term1.getClass(), "matchWinner", "MjGYSRKTNF");
        setField(term1, term1.getClass(), "result", "hRNSzYYIrc");
        setField(term1, term1.getClass(), "resultMargin", "RMFIsYGgne");
        setField(term1, term1.getClass(), "umpire1", "NRdvgJlhkX");
        setField(term1, term1.getClass(), "umpire2", "uuaPigETmJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Match");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};


