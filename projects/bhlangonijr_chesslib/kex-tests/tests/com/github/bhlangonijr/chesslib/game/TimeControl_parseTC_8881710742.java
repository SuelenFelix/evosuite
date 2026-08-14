package com.github.bhlangonijr.chesslib.game;

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
import static com.github.bhlangonijr.chesslib.game.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class TimeControl_parseTC_8881710742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108216;

    public TimeControl_parseTC_8881710742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term108217 = new ArrayList();
        Class<? extends Object> term108252 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term108251 = ((Class) term108252).getDeclaredField((String) "FIXED_DEPTH");
        ((Field) term108251).setAccessible(true);
        Object enum339 = ((Field) term108251).get((Object) null);
        term108216 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        setField(term108216, term108216.getClass(), "movePerTime", term108217);
        setField(term108216, term108216.getClass(), "timeControlType", enum339);
        setIntField(term108216, term108216.getClass(), "halfMoves", -1955400589);
        setLongField(term108216, term108216.getClass(), "milliseconds", -278716491237139968L);
        setLongField(term108216, term108216.getClass(), "increment", -629491722907628764L);
        setIntField(term108216, term108216.getClass(), "depth", 626179200);
        setLongField(term108216, term108216.getClass(), "nodes", -5552123402871285352L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl");
        Object[] args = new Object[2];
        args[0] = "osgWaTBVoE";
        args[1] = term108216;
        callMethod(klass, "parseTC", argTypes, null, args);
    }

};


