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
import java.util.LinkedList;

public class Team_setMatches_183636986812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8943;
     Object term9071;

    public Team_setMatches_183636986812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8961 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8964 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8961, term8961.getClass(), "id", -5786861555969446503L);
        setField(term8961, term8961.getClass(), "city", "");
        setIntField(term8964, term8964.getClass(), "year", 2010);
        setShortField(term8964, term8964.getClass(), "month", (short) 5);
        setShortField(term8964, term8964.getClass(), "day", (short) 2);
        setField(term8961, term8961.getClass(), "date", term8964);
        setField(term8961, term8961.getClass(), "playerOfMatch", "");
        setField(term8961, term8961.getClass(), "venue", "");
        setField(term8961, term8961.getClass(), "team1", "");
        setField(term8961, term8961.getClass(), "team2", "");
        setField(term8961, term8961.getClass(), "tossWinner", "");
        setField(term8961, term8961.getClass(), "tossDecision", "");
        setField(term8961, term8961.getClass(), "matchWinner", "");
        setField(term8961, term8961.getClass(), "result", "");
        setField(term8961, term8961.getClass(), "resultMargin", "");
        setField(term8961, term8961.getClass(), "umpire1", "");
        setField(term8961, term8961.getClass(), "umpire2", "");
        Object term8979 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8982 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8979, term8979.getClass(), "id", 2354625302846375590L);
        setField(term8979, term8979.getClass(), "city", "");
        setIntField(term8982, term8982.getClass(), "year", 2020);
        setShortField(term8982, term8982.getClass(), "month", (short) 8);
        setShortField(term8982, term8982.getClass(), "day", (short) 13);
        setField(term8979, term8979.getClass(), "date", term8982);
        setField(term8979, term8979.getClass(), "playerOfMatch", "");
        setField(term8979, term8979.getClass(), "venue", "");
        setField(term8979, term8979.getClass(), "team1", "");
        setField(term8979, term8979.getClass(), "team2", "");
        setField(term8979, term8979.getClass(), "tossWinner", "");
        setField(term8979, term8979.getClass(), "tossDecision", "");
        setField(term8979, term8979.getClass(), "matchWinner", "");
        setField(term8979, term8979.getClass(), "result", "");
        setField(term8979, term8979.getClass(), "resultMargin", "");
        setField(term8979, term8979.getClass(), "umpire1", "");
        setField(term8979, term8979.getClass(), "umpire2", "");
        Object term8997 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term9000 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8997, term8997.getClass(), "id", 7276637106827860087L);
        setField(term8997, term8997.getClass(), "city", "");
        setIntField(term9000, term9000.getClass(), "year", 2024);
        setShortField(term9000, term9000.getClass(), "month", (short) 4);
        setShortField(term9000, term9000.getClass(), "day", (short) 23);
        setField(term8997, term8997.getClass(), "date", term9000);
        setField(term8997, term8997.getClass(), "playerOfMatch", "");
        setField(term8997, term8997.getClass(), "venue", "");
        setField(term8997, term8997.getClass(), "team1", "");
        setField(term8997, term8997.getClass(), "team2", "");
        setField(term8997, term8997.getClass(), "tossWinner", "");
        setField(term8997, term8997.getClass(), "tossDecision", "");
        setField(term8997, term8997.getClass(), "matchWinner", "");
        setField(term8997, term8997.getClass(), "result", "");
        setField(term8997, term8997.getClass(), "resultMargin", "");
        setField(term8997, term8997.getClass(), "umpire1", "");
        setField(term8997, term8997.getClass(), "umpire2", "");
        Object term9015 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term9018 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term9015, term9015.getClass(), "id", -3936701866695933852L);
        setField(term9015, term9015.getClass(), "city", "");
        setIntField(term9018, term9018.getClass(), "year", 2022);
        setShortField(term9018, term9018.getClass(), "month", (short) 9);
        setShortField(term9018, term9018.getClass(), "day", (short) 17);
        setField(term9015, term9015.getClass(), "date", term9018);
        setField(term9015, term9015.getClass(), "playerOfMatch", "");
        setField(term9015, term9015.getClass(), "venue", "");
        setField(term9015, term9015.getClass(), "team1", "");
        setField(term9015, term9015.getClass(), "team2", "");
        setField(term9015, term9015.getClass(), "tossWinner", "");
        setField(term9015, term9015.getClass(), "tossDecision", "");
        setField(term9015, term9015.getClass(), "matchWinner", "");
        setField(term9015, term9015.getClass(), "result", "");
        setField(term9015, term9015.getClass(), "resultMargin", "");
        setField(term9015, term9015.getClass(), "umpire1", "");
        setField(term9015, term9015.getClass(), "umpire2", "");
        Object term9033 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term9036 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term9033, term9033.getClass(), "id", 1215116475929634177L);
        setField(term9033, term9033.getClass(), "city", "");
        setIntField(term9036, term9036.getClass(), "year", 2010);
        setShortField(term9036, term9036.getClass(), "month", (short) 1);
        setShortField(term9036, term9036.getClass(), "day", (short) 17);
        setField(term9033, term9033.getClass(), "date", term9036);
        setField(term9033, term9033.getClass(), "playerOfMatch", "");
        setField(term9033, term9033.getClass(), "venue", "");
        setField(term9033, term9033.getClass(), "team1", "");
        setField(term9033, term9033.getClass(), "team2", "");
        setField(term9033, term9033.getClass(), "tossWinner", "");
        setField(term9033, term9033.getClass(), "tossDecision", "");
        setField(term9033, term9033.getClass(), "matchWinner", "");
        setField(term9033, term9033.getClass(), "result", "");
        setField(term9033, term9033.getClass(), "resultMargin", "");
        setField(term9033, term9033.getClass(), "umpire1", "");
        setField(term9033, term9033.getClass(), "umpire2", "");
        Object term9051 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term9054 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term9051, term9051.getClass(), "id", 1597484336218508869L);
        setField(term9051, term9051.getClass(), "city", "");
        setIntField(term9054, term9054.getClass(), "year", 2017);
        setShortField(term9054, term9054.getClass(), "month", (short) 3);
        setShortField(term9054, term9054.getClass(), "day", (short) 31);
        setField(term9051, term9051.getClass(), "date", term9054);
        setField(term9051, term9051.getClass(), "playerOfMatch", "");
        setField(term9051, term9051.getClass(), "venue", "");
        setField(term9051, term9051.getClass(), "team1", "");
        setField(term9051, term9051.getClass(), "team2", "");
        setField(term9051, term9051.getClass(), "tossWinner", "");
        setField(term9051, term9051.getClass(), "tossDecision", "");
        setField(term9051, term9051.getClass(), "matchWinner", "");
        setField(term9051, term9051.getClass(), "result", "");
        setField(term9051, term9051.getClass(), "resultMargin", "");
        setField(term9051, term9051.getClass(), "umpire1", "");
        setField(term9051, term9051.getClass(), "umpire2", "");
        ArrayList term8959 = new ArrayList();
        ((ArrayList) term8959).add(term8961);
        ((ArrayList) term8959).add(term8979);
        ((ArrayList) term8959).add(term8997);
        ((ArrayList) term8959).add(term9015);
        ((ArrayList) term8959).add(term9033);
        ((ArrayList) term8959).add(term9051);
        term8943 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Team"));
        setLongField(term8943, term8943.getClass(), "id", -8033714905181142681L);
        setField(term8943, term8943.getClass(), "teamName", "IdGzDFfcZf");
        setLongField(term8943, term8943.getClass(), "totalMatches", -9040825890007374809L);
        setLongField(term8943, term8943.getClass(), "totalWins", 1368340889161782793L);
        setField(term8943, term8943.getClass(), "matches", term8959);
        term9071 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Team");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term9071;
        callMethod(klass, "setMatches", argTypes, term8943, args);
    }

};


