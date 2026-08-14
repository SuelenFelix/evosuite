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
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class Event_getRound_121304370721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22731;

    public Event_getRound_121304370721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term22732 = new HashMap();
        Class<? extends Object> term22918 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.EventType");
        Field term22917 = ((Class) term22918).getDeclaredField((String) "ANALYSES");
        ((Field) term22917).setAccessible(true);
        Object enum61 = ((Field) term22917).get((Object) null);
        ArrayList term22812 = new ArrayList();
        Class<? extends Object> term23209 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term23208 = ((Class) term23209).getDeclaredField((String) "MOVES_PER_TIME");
        ((Field) term23208).setAccessible(true);
        Object enum62 = ((Field) term23208).get((Object) null);
        ArrayList term22840 = new ArrayList();
        Class<? extends Object> term23518 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term23517 = ((Class) term23518).getDeclaredField((String) "TIME_BONUS");
        ((Field) term23517).setAccessible(true);
        Object enum63 = ((Field) term23517).get((Object) null);
        HashMap term22864 = new HashMap();
        HashMap term22869 = new HashMap();
        ArrayList term22874 = new ArrayList();
        ArrayList term22878 = new ArrayList();
        Integer term22894 = new Integer(-655067527);
        term22731 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        Object term22811 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term22839 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term22863 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term22731, term22731.getClass(), "round", term22732);
        setField(term22731, term22731.getClass(), "id", "lHfTrWKMPk");
        setField(term22731, term22731.getClass(), "name", "JDaAnsVTGV");
        setField(term22731, term22731.getClass(), "eventType", enum61);
        setField(term22731, term22731.getClass(), "startDate", "mLUZFTfjle");
        setField(term22731, term22731.getClass(), "endDate", "xIeFjkHkOe");
        setField(term22731, term22731.getClass(), "site", "SdCKLMIYnX");
        setLongField(term22731, term22731.getClass(), "timestamp", -4598158870068953328L);
        setIntField(term22731, term22731.getClass(), "rounds", -1210583429);
        setField(term22811, term22811.getClass(), "movePerTime", term22812);
        setField(term22811, term22811.getClass(), "timeControlType", enum62);
        setIntField(term22811, term22811.getClass(), "halfMoves", -663691365);
        setLongField(term22811, term22811.getClass(), "milliseconds", 138235087558060686L);
        setLongField(term22811, term22811.getClass(), "increment", 5381386339318883012L);
        setIntField(term22811, term22811.getClass(), "depth", 339854490);
        setLongField(term22811, term22811.getClass(), "nodes", -1333707622307134180L);
        setField(term22731, term22731.getClass(), "timeControl", term22811);
        setField(term22839, term22839.getClass(), "movePerTime", term22840);
        setField(term22839, term22839.getClass(), "timeControlType", enum63);
        setIntField(term22839, term22839.getClass(), "halfMoves", -615654495);
        setLongField(term22839, term22839.getClass(), "milliseconds", -4360569253593381888L);
        setLongField(term22839, term22839.getClass(), "increment", 1457594663983990440L);
        setIntField(term22839, term22839.getClass(), "depth", -1476117762);
        setLongField(term22839, term22839.getClass(), "nodes", 3452833434644634217L);
        setField(term22731, term22731.getClass(), "timeControl2", term22839);
        setField(term22863, term22863.getClass(), "event", term22864);
        setField(term22863, term22863.getClass(), "player", term22869);
        setField(term22863, term22863.getClass(), "games", term22874);
        setField(term22863, term22863.getClass(), "listener", term22878);
        setField(term22863, term22863.getClass(), "fileName", "OJJtVNPyKZ");
        setField(term22863, term22863.getClass(), "size", term22894);
        setBooleanField(term22863, term22863.getClass(), "lazyLoad", true);
        setField(term22731, term22731.getClass(), "pgnHolder", term22863);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Event");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRound", argTypes, term22731, args);
    }

};


