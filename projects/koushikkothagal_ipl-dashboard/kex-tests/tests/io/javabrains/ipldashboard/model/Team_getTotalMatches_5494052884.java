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
import java.util.ArrayList;
import java.lang.Object;

public class Team_getTotalMatches_5494052884 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8321;

    public Team_getTotalMatches_5494052884() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8339 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8342 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8339, term8339.getClass(), "id", 7994303628307559416L);
        setField(term8339, term8339.getClass(), "city", "");
        setIntField(term8342, term8342.getClass(), "year", 2021);
        setShortField(term8342, term8342.getClass(), "month", (short) 9);
        setShortField(term8342, term8342.getClass(), "day", (short) 30);
        setField(term8339, term8339.getClass(), "date", term8342);
        setField(term8339, term8339.getClass(), "playerOfMatch", "");
        setField(term8339, term8339.getClass(), "venue", "");
        setField(term8339, term8339.getClass(), "team1", "");
        setField(term8339, term8339.getClass(), "team2", "");
        setField(term8339, term8339.getClass(), "tossWinner", "");
        setField(term8339, term8339.getClass(), "tossDecision", "");
        setField(term8339, term8339.getClass(), "matchWinner", "");
        setField(term8339, term8339.getClass(), "result", "");
        setField(term8339, term8339.getClass(), "resultMargin", "");
        setField(term8339, term8339.getClass(), "umpire1", "");
        setField(term8339, term8339.getClass(), "umpire2", "");
        ArrayList term8337 = new ArrayList();
        ((ArrayList) term8337).add(term8339);
        term8321 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Team"));
        setLongField(term8321, term8321.getClass(), "id", -3838084482494604218L);
        setField(term8321, term8321.getClass(), "teamName", "zHvfKaOstO");
        setLongField(term8321, term8321.getClass(), "totalMatches", 3892018155439224435L);
        setLongField(term8321, term8321.getClass(), "totalWins", 5953383087795962419L);
        setField(term8321, term8321.getClass(), "matches", term8337);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Team");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalMatches", argTypes, term8321, args);
    }

};


