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

public class Match_getResultMargin_164184620923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6145;

    public Match_getResultMargin_164184620923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6145 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term6159 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term6145, term6145.getClass(), "id", -4365849114644724155L);
        setField(term6145, term6145.getClass(), "city", "NHbOFFjyVK");
        setIntField(term6159, term6159.getClass(), "year", 2025);
        setShortField(term6159, term6159.getClass(), "month", (short) 4);
        setShortField(term6159, term6159.getClass(), "day", (short) 8);
        setField(term6145, term6145.getClass(), "date", term6159);
        setField(term6145, term6145.getClass(), "playerOfMatch", "zaloBqlrSo");
        setField(term6145, term6145.getClass(), "venue", "vvoLrMGCoN");
        setField(term6145, term6145.getClass(), "team1", "pXdglvyrQe");
        setField(term6145, term6145.getClass(), "team2", "OcfNzHYdki");
        setField(term6145, term6145.getClass(), "tossWinner", "uPuCVuZYOI");
        setField(term6145, term6145.getClass(), "tossDecision", "TweMFhxNdj");
        setField(term6145, term6145.getClass(), "matchWinner", "NBrvVzvQHe");
        setField(term6145, term6145.getClass(), "result", "FjOiNAfBOc");
        setField(term6145, term6145.getClass(), "resultMargin", "iCCsaLHohG");
        setField(term6145, term6145.getClass(), "umpire1", "NJhGgctbdj");
        setField(term6145, term6145.getClass(), "umpire2", "MYWYUeLGOp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Match");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResultMargin", argTypes, term6145, args);
    }

};


