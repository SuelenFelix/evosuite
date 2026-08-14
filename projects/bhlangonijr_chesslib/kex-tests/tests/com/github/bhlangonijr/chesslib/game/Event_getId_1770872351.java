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

public class Event_getId_1770872351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Event_getId_1770872351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2 = new HashMap();
        Class<? extends Object> term320 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.EventType");
        Field term319 = ((Class) term320).getDeclaredField((String) "ROUND_ROBIN");
        ((Field) term319).setAccessible(true);
        Object enum0 = ((Field) term319).get((Object) null);
        ArrayList term85 = new ArrayList();
        Class<? extends Object> term703 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term702 = ((Class) term703).getDeclaredField((String) "TIME_BONUS");
        ((Field) term702).setAccessible(true);
        Object enum1 = ((Field) term702).get((Object) null);
        ArrayList term109 = new ArrayList();
        Class<? extends Object> term1000 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term999 = ((Class) term1000).getDeclaredField((String) "FIXED_DEPTH");
        ((Field) term999).setAccessible(true);
        Object enum2 = ((Field) term999).get((Object) null);
        HashMap term134 = new HashMap();
        HashMap term139 = new HashMap();
        ArrayList term144 = new ArrayList();
        ArrayList term148 = new ArrayList();
        Integer term164 = new Integer(568599855);
        term1 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        Object term84 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term108 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term133 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term1, term1.getClass(), "round", term2);
        setField(term1, term1.getClass(), "id", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "name", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "eventType", enum0);
        setField(term1, term1.getClass(), "startDate", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "endDate", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "site", "jJCZpVmanW");
        setLongField(term1, term1.getClass(), "timestamp", 2442117782898005296L);
        setIntField(term1, term1.getClass(), "rounds", 568599855);
        setField(term84, term84.getClass(), "movePerTime", term85);
        setField(term84, term84.getClass(), "timeControlType", enum1);
        setIntField(term84, term84.getClass(), "halfMoves", 1162663216);
        setLongField(term84, term84.getClass(), "milliseconds", 6375119433582206027L);
        setLongField(term84, term84.getClass(), "increment", -8257434502486459194L);
        setIntField(term84, term84.getClass(), "depth", 1484323161);
        setLongField(term84, term84.getClass(), "nodes", -8400487765614892086L);
        setField(term1, term1.getClass(), "timeControl", term84);
        setField(term108, term108.getClass(), "movePerTime", term109);
        setField(term108, term108.getClass(), "timeControlType", enum2);
        setIntField(term108, term108.getClass(), "halfMoves", 391863371);
        setLongField(term108, term108.getClass(), "milliseconds", 5270370404989704783L);
        setLongField(term108, term108.getClass(), "increment", 7411271909051562686L);
        setIntField(term108, term108.getClass(), "depth", -1922583790);
        setLongField(term108, term108.getClass(), "nodes", 4872422362414183754L);
        setField(term1, term1.getClass(), "timeControl2", term108);
        setField(term133, term133.getClass(), "event", term134);
        setField(term133, term133.getClass(), "player", term139);
        setField(term133, term133.getClass(), "games", term144);
        setField(term133, term133.getClass(), "listener", term148);
        setField(term133, term133.getClass(), "fileName", "EGtDIRbSSb");
        setField(term133, term133.getClass(), "size", term164);
        setBooleanField(term133, term133.getClass(), "lazyLoad", false);
        setField(term1, term1.getClass(), "pgnHolder", term133);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Event");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};


