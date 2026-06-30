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

public class Match_setUmpire1_62108612326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6977;

    public Match_setUmpire1_62108612326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6977 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term6991 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term6977, term6977.getClass(), "id", -7672528020740371001L);
        setField(term6977, term6977.getClass(), "city", "WxYUTuqmIq");
        setIntField(term6991, term6991.getClass(), "year", 2021);
        setShortField(term6991, term6991.getClass(), "month", (short) 9);
        setShortField(term6991, term6991.getClass(), "day", (short) 6);
        setField(term6977, term6977.getClass(), "date", term6991);
        setField(term6977, term6977.getClass(), "playerOfMatch", "OeQLvhVERT");
        setField(term6977, term6977.getClass(), "venue", "IlvgFINwIa");
        setField(term6977, term6977.getClass(), "team1", "GEJABPlHSI");
        setField(term6977, term6977.getClass(), "team2", "aQFUvuaYxd");
        setField(term6977, term6977.getClass(), "tossWinner", "zNFLXMifnS");
        setField(term6977, term6977.getClass(), "tossDecision", "HHQcYMSBVc");
        setField(term6977, term6977.getClass(), "matchWinner", "wdoqITnaAP");
        setField(term6977, term6977.getClass(), "result", "rIPMBcrNqB");
        setField(term6977, term6977.getClass(), "resultMargin", "UDaboHZHhz");
        setField(term6977, term6977.getClass(), "umpire1", "nRvKihUSPj");
        setField(term6977, term6977.getClass(), "umpire2", "BbNeQJpYPr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Match");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "riMtzCoxNj";
        callMethod(klass, "setUmpire1", argTypes, term6977, args);
    }

};


