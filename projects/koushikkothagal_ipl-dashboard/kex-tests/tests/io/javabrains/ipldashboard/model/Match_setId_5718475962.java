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
import java.lang.Long;

public class Match_setId_5718475962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271;
     Object term421;

    public Match_setId_5718475962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term271 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term285 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term271, term271.getClass(), "id", 6375119433582206027L);
        setField(term271, term271.getClass(), "city", "MxlszYVzRf");
        setIntField(term285, term285.getClass(), "year", 2016);
        setShortField(term285, term285.getClass(), "month", (short) 11);
        setShortField(term285, term285.getClass(), "day", (short) 29);
        setField(term271, term271.getClass(), "date", term285);
        setField(term271, term271.getClass(), "playerOfMatch", "LQFpaHEwXR");
        setField(term271, term271.getClass(), "venue", "oVcInYnLWB");
        setField(term271, term271.getClass(), "team1", "aJlieCFVtF");
        setField(term271, term271.getClass(), "team2", "ZiaGIbnzTs");
        setField(term271, term271.getClass(), "tossWinner", "tbcdzjIfER");
        setField(term271, term271.getClass(), "tossDecision", "HyxfbSQYBe");
        setField(term271, term271.getClass(), "matchWinner", "pCTimMblYc");
        setField(term271, term271.getClass(), "result", "hNxWaHcfhY");
        setField(term271, term271.getClass(), "resultMargin", "RkybSrpybU");
        setField(term271, term271.getClass(), "umpire1", "xOEqzGAmDU");
        setField(term271, term271.getClass(), "umpire2", "eZFUvlxvGV");
        term421 = new Long(-8257434502486459194L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Match");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term421;
        callMethod(klass, "setId", argTypes, term271, args);
    }

};


