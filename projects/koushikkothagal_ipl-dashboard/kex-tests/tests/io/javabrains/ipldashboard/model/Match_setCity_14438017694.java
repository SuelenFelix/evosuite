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

public class Match_setCity_14438017694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term813;

    public Match_setCity_14438017694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term813 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term827 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term813, term813.getClass(), "id", 5270370404989704783L);
        setField(term813, term813.getClass(), "city", "xrwlQZdwCp");
        setIntField(term827, term827.getClass(), "year", 2020);
        setShortField(term827, term827.getClass(), "month", (short) 11);
        setShortField(term827, term827.getClass(), "day", (short) 22);
        setField(term813, term813.getClass(), "date", term827);
        setField(term813, term813.getClass(), "playerOfMatch", "IDCWpPLRkE");
        setField(term813, term813.getClass(), "venue", "nyiiPDVjAc");
        setField(term813, term813.getClass(), "team1", "aKnKipADSo");
        setField(term813, term813.getClass(), "team2", "wSQxaModmm");
        setField(term813, term813.getClass(), "tossWinner", "UlajhuVLaP");
        setField(term813, term813.getClass(), "tossDecision", "gGSMzuGICf");
        setField(term813, term813.getClass(), "matchWinner", "hxCBltsObl");
        setField(term813, term813.getClass(), "result", "BndsHwAFMv");
        setField(term813, term813.getClass(), "resultMargin", "GzFkzHGYFt");
        setField(term813, term813.getClass(), "umpire1", "tShwQLRGNe");
        setField(term813, term813.getClass(), "umpire2", "LvtrsXUliU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Match");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xLbjWUgOIL";
        callMethod(klass, "setCity", argTypes, term813, args);
    }

};


