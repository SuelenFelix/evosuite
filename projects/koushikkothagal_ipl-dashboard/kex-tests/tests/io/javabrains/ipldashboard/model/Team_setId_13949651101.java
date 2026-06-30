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
import java.lang.Long;

public class Team_setId_13949651101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8009;
     Object term8101;

    public Team_setId_13949651101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8027 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8030 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8027, term8027.getClass(), "id", 4178434741742309755L);
        setField(term8027, term8027.getClass(), "city", "");
        setIntField(term8030, term8030.getClass(), "year", 2029);
        setShortField(term8030, term8030.getClass(), "month", (short) 6);
        setShortField(term8030, term8030.getClass(), "day", (short) 22);
        setField(term8027, term8027.getClass(), "date", term8030);
        setField(term8027, term8027.getClass(), "playerOfMatch", "");
        setField(term8027, term8027.getClass(), "venue", "");
        setField(term8027, term8027.getClass(), "team1", "");
        setField(term8027, term8027.getClass(), "team2", "");
        setField(term8027, term8027.getClass(), "tossWinner", "");
        setField(term8027, term8027.getClass(), "tossDecision", "");
        setField(term8027, term8027.getClass(), "matchWinner", "");
        setField(term8027, term8027.getClass(), "result", "");
        setField(term8027, term8027.getClass(), "resultMargin", "");
        setField(term8027, term8027.getClass(), "umpire1", "");
        setField(term8027, term8027.getClass(), "umpire2", "");
        Object term8045 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8048 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8045, term8045.getClass(), "id", -2068172595987555756L);
        setField(term8045, term8045.getClass(), "city", "");
        setIntField(term8048, term8048.getClass(), "year", 2011);
        setShortField(term8048, term8048.getClass(), "month", (short) 5);
        setShortField(term8048, term8048.getClass(), "day", (short) 4);
        setField(term8045, term8045.getClass(), "date", term8048);
        setField(term8045, term8045.getClass(), "playerOfMatch", "");
        setField(term8045, term8045.getClass(), "venue", "");
        setField(term8045, term8045.getClass(), "team1", "");
        setField(term8045, term8045.getClass(), "team2", "");
        setField(term8045, term8045.getClass(), "tossWinner", "");
        setField(term8045, term8045.getClass(), "tossDecision", "");
        setField(term8045, term8045.getClass(), "matchWinner", "");
        setField(term8045, term8045.getClass(), "result", "");
        setField(term8045, term8045.getClass(), "resultMargin", "");
        setField(term8045, term8045.getClass(), "umpire1", "");
        setField(term8045, term8045.getClass(), "umpire2", "");
        Object term8063 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8066 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8063, term8063.getClass(), "id", -6292278961887936280L);
        setField(term8063, term8063.getClass(), "city", "");
        setIntField(term8066, term8066.getClass(), "year", 2017);
        setShortField(term8066, term8066.getClass(), "month", (short) 3);
        setShortField(term8066, term8066.getClass(), "day", (short) 5);
        setField(term8063, term8063.getClass(), "date", term8066);
        setField(term8063, term8063.getClass(), "playerOfMatch", "");
        setField(term8063, term8063.getClass(), "venue", "");
        setField(term8063, term8063.getClass(), "team1", "");
        setField(term8063, term8063.getClass(), "team2", "");
        setField(term8063, term8063.getClass(), "tossWinner", "");
        setField(term8063, term8063.getClass(), "tossDecision", "");
        setField(term8063, term8063.getClass(), "matchWinner", "");
        setField(term8063, term8063.getClass(), "result", "");
        setField(term8063, term8063.getClass(), "resultMargin", "");
        setField(term8063, term8063.getClass(), "umpire1", "");
        setField(term8063, term8063.getClass(), "umpire2", "");
        Object term8081 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8084 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8081, term8081.getClass(), "id", -6645965768855543712L);
        setField(term8081, term8081.getClass(), "city", "");
        setIntField(term8084, term8084.getClass(), "year", 2011);
        setShortField(term8084, term8084.getClass(), "month", (short) 7);
        setShortField(term8084, term8084.getClass(), "day", (short) 24);
        setField(term8081, term8081.getClass(), "date", term8084);
        setField(term8081, term8081.getClass(), "playerOfMatch", "");
        setField(term8081, term8081.getClass(), "venue", "");
        setField(term8081, term8081.getClass(), "team1", "");
        setField(term8081, term8081.getClass(), "team2", "");
        setField(term8081, term8081.getClass(), "tossWinner", "");
        setField(term8081, term8081.getClass(), "tossDecision", "");
        setField(term8081, term8081.getClass(), "matchWinner", "");
        setField(term8081, term8081.getClass(), "result", "");
        setField(term8081, term8081.getClass(), "resultMargin", "");
        setField(term8081, term8081.getClass(), "umpire1", "");
        setField(term8081, term8081.getClass(), "umpire2", "");
        ArrayList term8025 = new ArrayList();
        ((ArrayList) term8025).add(term8027);
        ((ArrayList) term8025).add(term8045);
        ((ArrayList) term8025).add(term8063);
        ((ArrayList) term8025).add(term8081);
        term8009 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Team"));
        setLongField(term8009, term8009.getClass(), "id", 1439298019805881866L);
        setField(term8009, term8009.getClass(), "teamName", "GsWxOwXvSu");
        setLongField(term8009, term8009.getClass(), "totalMatches", -8708192233349544946L);
        setLongField(term8009, term8009.getClass(), "totalWins", 5907001541142728739L);
        setField(term8009, term8009.getClass(), "matches", term8025);
        term8101 = new Long(4784595517102746672L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Team");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term8101;
        callMethod(klass, "setId", argTypes, term8009, args);
    }

};


