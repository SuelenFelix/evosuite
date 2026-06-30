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

public class Match_getUmpire1_19039490125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6707;

    public Match_getUmpire1_19039490125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6707 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term6721 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term6707, term6707.getClass(), "id", 7009926388951271268L);
        setField(term6707, term6707.getClass(), "city", "yUGCjlqgJE");
        setIntField(term6721, term6721.getClass(), "year", 2017);
        setShortField(term6721, term6721.getClass(), "month", (short) 8);
        setShortField(term6721, term6721.getClass(), "day", (short) 7);
        setField(term6707, term6707.getClass(), "date", term6721);
        setField(term6707, term6707.getClass(), "playerOfMatch", "PXdVZyoJyC");
        setField(term6707, term6707.getClass(), "venue", "vLerpqavFM");
        setField(term6707, term6707.getClass(), "team1", "qnvxzwuGKX");
        setField(term6707, term6707.getClass(), "team2", "EdPAvpluZg");
        setField(term6707, term6707.getClass(), "tossWinner", "DzHVBMqWtE");
        setField(term6707, term6707.getClass(), "tossDecision", "THZSpzBRYP");
        setField(term6707, term6707.getClass(), "matchWinner", "ZfBIVGBQOE");
        setField(term6707, term6707.getClass(), "result", "QSrDQfEsTR");
        setField(term6707, term6707.getClass(), "resultMargin", "PsqusYmejD");
        setField(term6707, term6707.getClass(), "umpire1", "NTWMiBEaDF");
        setField(term6707, term6707.getClass(), "umpire2", "SPBstwKFVr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Match");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUmpire1", argTypes, term6707, args);
    }

};


