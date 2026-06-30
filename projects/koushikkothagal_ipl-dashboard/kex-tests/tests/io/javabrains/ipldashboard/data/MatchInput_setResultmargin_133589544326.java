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

public class MatchInput_setResultmargin_133589544326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9640;

    public MatchInput_setResultmargin_133589544326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9640 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term9640, term9640.getClass(), "id", "SqjyKmayBx");
        setField(term9640, term9640.getClass(), "city", "XjDhvToxJy");
        setField(term9640, term9640.getClass(), "date", "nxSTJflLQy");
        setField(term9640, term9640.getClass(), "player_of_match", "FlHzxEfFzI");
        setField(term9640, term9640.getClass(), "venue", "aSATgQUpoe");
        setField(term9640, term9640.getClass(), "neutral_venue", "VkPSXewZfB");
        setField(term9640, term9640.getClass(), "team1", "ubodzJoMGW");
        setField(term9640, term9640.getClass(), "team2", "weddIktxOA");
        setField(term9640, term9640.getClass(), "toss_winner", "uSlMeISsDD");
        setField(term9640, term9640.getClass(), "toss_decision", "WdCiTDUKqn");
        setField(term9640, term9640.getClass(), "winner", "PSizQDoxxe");
        setField(term9640, term9640.getClass(), "result", "mKaHyMybrK");
        setField(term9640, term9640.getClass(), "result_margin", "AyrEXuGrEj");
        setField(term9640, term9640.getClass(), "eliminator", "yevIIoVYHq");
        setField(term9640, term9640.getClass(), "method", "UuYWMTqWTV");
        setField(term9640, term9640.getClass(), "umpire1", "DSFGlcaXUb");
        setField(term9640, term9640.getClass(), "umpire2", "sHMXNUzNeM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "gPzGDOEPPw";
        callMethod(klass, "setResult_margin", argTypes, term9640, args);
    }

};


