package io.javabrains.ipldashboard.data;

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
import static io.javabrains.ipldashboard.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MatchInput_setTossdecision_172789449320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7324;

    public MatchInput_setTossdecision_172789449320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7324 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term7324, term7324.getClass(), "id", "TXyHhqeCjR");
        setField(term7324, term7324.getClass(), "city", "lZIgPZPgTu");
        setField(term7324, term7324.getClass(), "date", "iuCxnHGMoW");
        setField(term7324, term7324.getClass(), "player_of_match", "GPSEWEDSTo");
        setField(term7324, term7324.getClass(), "venue", "RCOqfVsRHt");
        setField(term7324, term7324.getClass(), "neutral_venue", "TSyCeEZPaT");
        setField(term7324, term7324.getClass(), "team1", "JeZFtaqkzW");
        setField(term7324, term7324.getClass(), "team2", "vOVuNSCCLe");
        setField(term7324, term7324.getClass(), "toss_winner", "fzeqPnzpnt");
        setField(term7324, term7324.getClass(), "toss_decision", "RxbhrFBjkO");
        setField(term7324, term7324.getClass(), "winner", "aanyiAOJCl");
        setField(term7324, term7324.getClass(), "result", "VDokbsCuqq");
        setField(term7324, term7324.getClass(), "result_margin", "xClUIcPECX");
        setField(term7324, term7324.getClass(), "eliminator", "avhRaGZaBF");
        setField(term7324, term7324.getClass(), "method", "JkgoRtImdE");
        setField(term7324, term7324.getClass(), "umpire1", "qFGKIJjlmV");
        setField(term7324, term7324.getClass(), "umpire2", "IHqvyhMtuM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dAldIGYAXV";
        callMethod(klass, "setToss_decision", argTypes, term7324, args);
    }

};


