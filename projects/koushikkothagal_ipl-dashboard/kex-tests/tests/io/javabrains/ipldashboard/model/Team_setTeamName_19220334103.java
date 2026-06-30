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

public class Team_setTeamName_19220334103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8197;

    public Team_setTeamName_19220334103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8215 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8218 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8215, term8215.getClass(), "id", -2644215923136513282L);
        setField(term8215, term8215.getClass(), "city", "");
        setIntField(term8218, term8218.getClass(), "year", 2027);
        setShortField(term8218, term8218.getClass(), "month", (short) 10);
        setShortField(term8218, term8218.getClass(), "day", (short) 4);
        setField(term8215, term8215.getClass(), "date", term8218);
        setField(term8215, term8215.getClass(), "playerOfMatch", "");
        setField(term8215, term8215.getClass(), "venue", "");
        setField(term8215, term8215.getClass(), "team1", "");
        setField(term8215, term8215.getClass(), "team2", "");
        setField(term8215, term8215.getClass(), "tossWinner", "");
        setField(term8215, term8215.getClass(), "tossDecision", "");
        setField(term8215, term8215.getClass(), "matchWinner", "");
        setField(term8215, term8215.getClass(), "result", "");
        setField(term8215, term8215.getClass(), "resultMargin", "");
        setField(term8215, term8215.getClass(), "umpire1", "");
        setField(term8215, term8215.getClass(), "umpire2", "");
        Object term8233 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8236 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8233, term8233.getClass(), "id", -1468719814009985452L);
        setField(term8233, term8233.getClass(), "city", "");
        setIntField(term8236, term8236.getClass(), "year", 2023);
        setShortField(term8236, term8236.getClass(), "month", (short) 3);
        setShortField(term8236, term8236.getClass(), "day", (short) 7);
        setField(term8233, term8233.getClass(), "date", term8236);
        setField(term8233, term8233.getClass(), "playerOfMatch", "");
        setField(term8233, term8233.getClass(), "venue", "");
        setField(term8233, term8233.getClass(), "team1", "");
        setField(term8233, term8233.getClass(), "team2", "");
        setField(term8233, term8233.getClass(), "tossWinner", "");
        setField(term8233, term8233.getClass(), "tossDecision", "");
        setField(term8233, term8233.getClass(), "matchWinner", "");
        setField(term8233, term8233.getClass(), "result", "");
        setField(term8233, term8233.getClass(), "resultMargin", "");
        setField(term8233, term8233.getClass(), "umpire1", "");
        setField(term8233, term8233.getClass(), "umpire2", "");
        Object term8251 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8254 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8251, term8251.getClass(), "id", -7738503207562305297L);
        setField(term8251, term8251.getClass(), "city", "");
        setIntField(term8254, term8254.getClass(), "year", 2022);
        setShortField(term8254, term8254.getClass(), "month", (short) 10);
        setShortField(term8254, term8254.getClass(), "day", (short) 18);
        setField(term8251, term8251.getClass(), "date", term8254);
        setField(term8251, term8251.getClass(), "playerOfMatch", "");
        setField(term8251, term8251.getClass(), "venue", "");
        setField(term8251, term8251.getClass(), "team1", "");
        setField(term8251, term8251.getClass(), "team2", "");
        setField(term8251, term8251.getClass(), "tossWinner", "");
        setField(term8251, term8251.getClass(), "tossDecision", "");
        setField(term8251, term8251.getClass(), "matchWinner", "");
        setField(term8251, term8251.getClass(), "result", "");
        setField(term8251, term8251.getClass(), "resultMargin", "");
        setField(term8251, term8251.getClass(), "umpire1", "");
        setField(term8251, term8251.getClass(), "umpire2", "");
        Object term8269 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8272 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8269, term8269.getClass(), "id", 3825396310311739952L);
        setField(term8269, term8269.getClass(), "city", "");
        setIntField(term8272, term8272.getClass(), "year", 2015);
        setShortField(term8272, term8272.getClass(), "month", (short) 3);
        setShortField(term8272, term8272.getClass(), "day", (short) 10);
        setField(term8269, term8269.getClass(), "date", term8272);
        setField(term8269, term8269.getClass(), "playerOfMatch", "");
        setField(term8269, term8269.getClass(), "venue", "");
        setField(term8269, term8269.getClass(), "team1", "");
        setField(term8269, term8269.getClass(), "team2", "");
        setField(term8269, term8269.getClass(), "tossWinner", "");
        setField(term8269, term8269.getClass(), "tossDecision", "");
        setField(term8269, term8269.getClass(), "matchWinner", "");
        setField(term8269, term8269.getClass(), "result", "");
        setField(term8269, term8269.getClass(), "resultMargin", "");
        setField(term8269, term8269.getClass(), "umpire1", "");
        setField(term8269, term8269.getClass(), "umpire2", "");
        ArrayList term8213 = new ArrayList();
        ((ArrayList) term8213).add(term8215);
        ((ArrayList) term8213).add(term8233);
        ((ArrayList) term8213).add(term8251);
        ((ArrayList) term8213).add(term8269);
        term8197 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Team"));
        setLongField(term8197, term8197.getClass(), "id", 2936323121573284007L);
        setField(term8197, term8197.getClass(), "teamName", "XebAeSnCKZ");
        setLongField(term8197, term8197.getClass(), "totalMatches", -1154553077993834885L);
        setLongField(term8197, term8197.getClass(), "totalWins", -2850532706972744550L);
        setField(term8197, term8197.getClass(), "matches", term8213);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Team");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vMsWjuPTnO";
        callMethod(klass, "setTeamName", argTypes, term8197, args);
    }

};


