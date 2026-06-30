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

public class Team_setTotalWins_6619867067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8575;
     Object term8703;

    public Team_setTotalWins_6619867067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8593 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8596 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8593, term8593.getClass(), "id", 5510783420697225605L);
        setField(term8593, term8593.getClass(), "city", "");
        setIntField(term8596, term8596.getClass(), "year", 2027);
        setShortField(term8596, term8596.getClass(), "month", (short) 2);
        setShortField(term8596, term8596.getClass(), "day", (short) 18);
        setField(term8593, term8593.getClass(), "date", term8596);
        setField(term8593, term8593.getClass(), "playerOfMatch", "");
        setField(term8593, term8593.getClass(), "venue", "");
        setField(term8593, term8593.getClass(), "team1", "");
        setField(term8593, term8593.getClass(), "team2", "");
        setField(term8593, term8593.getClass(), "tossWinner", "");
        setField(term8593, term8593.getClass(), "tossDecision", "");
        setField(term8593, term8593.getClass(), "matchWinner", "");
        setField(term8593, term8593.getClass(), "result", "");
        setField(term8593, term8593.getClass(), "resultMargin", "");
        setField(term8593, term8593.getClass(), "umpire1", "");
        setField(term8593, term8593.getClass(), "umpire2", "");
        Object term8611 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8614 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8611, term8611.getClass(), "id", 6005241913654469005L);
        setField(term8611, term8611.getClass(), "city", "");
        setIntField(term8614, term8614.getClass(), "year", 2028);
        setShortField(term8614, term8614.getClass(), "month", (short) 5);
        setShortField(term8614, term8614.getClass(), "day", (short) 29);
        setField(term8611, term8611.getClass(), "date", term8614);
        setField(term8611, term8611.getClass(), "playerOfMatch", "");
        setField(term8611, term8611.getClass(), "venue", "");
        setField(term8611, term8611.getClass(), "team1", "");
        setField(term8611, term8611.getClass(), "team2", "");
        setField(term8611, term8611.getClass(), "tossWinner", "");
        setField(term8611, term8611.getClass(), "tossDecision", "");
        setField(term8611, term8611.getClass(), "matchWinner", "");
        setField(term8611, term8611.getClass(), "result", "");
        setField(term8611, term8611.getClass(), "resultMargin", "");
        setField(term8611, term8611.getClass(), "umpire1", "");
        setField(term8611, term8611.getClass(), "umpire2", "");
        Object term8629 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8632 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8629, term8629.getClass(), "id", -1983291584002806658L);
        setField(term8629, term8629.getClass(), "city", "");
        setIntField(term8632, term8632.getClass(), "year", 2021);
        setShortField(term8632, term8632.getClass(), "month", (short) 8);
        setShortField(term8632, term8632.getClass(), "day", (short) 11);
        setField(term8629, term8629.getClass(), "date", term8632);
        setField(term8629, term8629.getClass(), "playerOfMatch", "");
        setField(term8629, term8629.getClass(), "venue", "");
        setField(term8629, term8629.getClass(), "team1", "");
        setField(term8629, term8629.getClass(), "team2", "");
        setField(term8629, term8629.getClass(), "tossWinner", "");
        setField(term8629, term8629.getClass(), "tossDecision", "");
        setField(term8629, term8629.getClass(), "matchWinner", "");
        setField(term8629, term8629.getClass(), "result", "");
        setField(term8629, term8629.getClass(), "resultMargin", "");
        setField(term8629, term8629.getClass(), "umpire1", "");
        setField(term8629, term8629.getClass(), "umpire2", "");
        Object term8647 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8650 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8647, term8647.getClass(), "id", 5946780097489996391L);
        setField(term8647, term8647.getClass(), "city", "");
        setIntField(term8650, term8650.getClass(), "year", 2014);
        setShortField(term8650, term8650.getClass(), "month", (short) 2);
        setShortField(term8650, term8650.getClass(), "day", (short) 23);
        setField(term8647, term8647.getClass(), "date", term8650);
        setField(term8647, term8647.getClass(), "playerOfMatch", "");
        setField(term8647, term8647.getClass(), "venue", "");
        setField(term8647, term8647.getClass(), "team1", "");
        setField(term8647, term8647.getClass(), "team2", "");
        setField(term8647, term8647.getClass(), "tossWinner", "");
        setField(term8647, term8647.getClass(), "tossDecision", "");
        setField(term8647, term8647.getClass(), "matchWinner", "");
        setField(term8647, term8647.getClass(), "result", "");
        setField(term8647, term8647.getClass(), "resultMargin", "");
        setField(term8647, term8647.getClass(), "umpire1", "");
        setField(term8647, term8647.getClass(), "umpire2", "");
        Object term8665 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8668 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8665, term8665.getClass(), "id", -8652538484981166496L);
        setField(term8665, term8665.getClass(), "city", "");
        setIntField(term8668, term8668.getClass(), "year", 2025);
        setShortField(term8668, term8668.getClass(), "month", (short) 11);
        setShortField(term8668, term8668.getClass(), "day", (short) 3);
        setField(term8665, term8665.getClass(), "date", term8668);
        setField(term8665, term8665.getClass(), "playerOfMatch", "");
        setField(term8665, term8665.getClass(), "venue", "");
        setField(term8665, term8665.getClass(), "team1", "");
        setField(term8665, term8665.getClass(), "team2", "");
        setField(term8665, term8665.getClass(), "tossWinner", "");
        setField(term8665, term8665.getClass(), "tossDecision", "");
        setField(term8665, term8665.getClass(), "matchWinner", "");
        setField(term8665, term8665.getClass(), "result", "");
        setField(term8665, term8665.getClass(), "resultMargin", "");
        setField(term8665, term8665.getClass(), "umpire1", "");
        setField(term8665, term8665.getClass(), "umpire2", "");
        Object term8683 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8686 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8683, term8683.getClass(), "id", 2701184207686293431L);
        setField(term8683, term8683.getClass(), "city", "");
        setIntField(term8686, term8686.getClass(), "year", 2014);
        setShortField(term8686, term8686.getClass(), "month", (short) 3);
        setShortField(term8686, term8686.getClass(), "day", (short) 22);
        setField(term8683, term8683.getClass(), "date", term8686);
        setField(term8683, term8683.getClass(), "playerOfMatch", "");
        setField(term8683, term8683.getClass(), "venue", "");
        setField(term8683, term8683.getClass(), "team1", "");
        setField(term8683, term8683.getClass(), "team2", "");
        setField(term8683, term8683.getClass(), "tossWinner", "");
        setField(term8683, term8683.getClass(), "tossDecision", "");
        setField(term8683, term8683.getClass(), "matchWinner", "");
        setField(term8683, term8683.getClass(), "result", "");
        setField(term8683, term8683.getClass(), "resultMargin", "");
        setField(term8683, term8683.getClass(), "umpire1", "");
        setField(term8683, term8683.getClass(), "umpire2", "");
        ArrayList term8591 = new ArrayList();
        ((ArrayList) term8591).add(term8593);
        ((ArrayList) term8591).add(term8611);
        ((ArrayList) term8591).add(term8629);
        ((ArrayList) term8591).add(term8647);
        ((ArrayList) term8591).add(term8665);
        ((ArrayList) term8591).add(term8683);
        term8575 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Team"));
        setLongField(term8575, term8575.getClass(), "id", 9013624480170062917L);
        setField(term8575, term8575.getClass(), "teamName", "IiNCZfdouL");
        setLongField(term8575, term8575.getClass(), "totalMatches", 7862575738391801707L);
        setLongField(term8575, term8575.getClass(), "totalWins", 50358265865610362L);
        setField(term8575, term8575.getClass(), "matches", term8591);
        term8703 = new Long(4474998035090263139L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Team");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term8703;
        callMethod(klass, "setTotalWins", argTypes, term8575, args);
    }

};


