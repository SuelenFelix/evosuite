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

public class Event_getStartDate_12399831427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6892;

    public Event_getStartDate_12399831427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6893 = new HashMap();
        Class<? extends Object> term7078 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.EventType");
        Field term7077 = ((Class) term7078).getDeclaredField((String) "GAUNTLET");
        ((Field) term7077).setAccessible(true);
        Object enum18 = ((Field) term7077).get((Object) null);
        ArrayList term6973 = new ArrayList();
        Class<? extends Object> term7369 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term7368 = ((Class) term7369).getDeclaredField((String) "TIME_BONUS");
        ((Field) term7368).setAccessible(true);
        Object enum19 = ((Field) term7368).get((Object) null);
        ArrayList term6997 = new ArrayList();
        Class<? extends Object> term7666 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term7665 = ((Class) term7666).getDeclaredField((String) "TIME_PER_MOVE");
        ((Field) term7665).setAccessible(true);
        Object enum20 = ((Field) term7665).get((Object) null);
        HashMap term7024 = new HashMap();
        HashMap term7029 = new HashMap();
        ArrayList term7034 = new ArrayList();
        ArrayList term7038 = new ArrayList();
        Integer term7054 = new Integer(-1955890973);
        term6892 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        Object term6972 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term6996 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term7023 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term6892, term6892.getClass(), "round", term6893);
        setField(term6892, term6892.getClass(), "id", "nyiiPDVjAc");
        setField(term6892, term6892.getClass(), "name", "aKnKipADSo");
        setField(term6892, term6892.getClass(), "eventType", enum18);
        setField(term6892, term6892.getClass(), "startDate", "wSQxaModmm");
        setField(term6892, term6892.getClass(), "endDate", "UlajhuVLaP");
        setField(term6892, term6892.getClass(), "site", "gGSMzuGICf");
        setLongField(term6892, term6892.getClass(), "timestamp", -6292278961887936280L);
        setIntField(term6892, term6892.getClass(), "rounds", -203030934);
        setField(term6972, term6972.getClass(), "movePerTime", term6973);
        setField(term6972, term6972.getClass(), "timeControlType", enum19);
        setIntField(term6972, term6972.getClass(), "halfMoves", -1179120542);
        setLongField(term6972, term6972.getClass(), "milliseconds", -6645965768855543712L);
        setLongField(term6972, term6972.getClass(), "increment", 4784595517102746672L);
        setIntField(term6972, term6972.getClass(), "depth", -73683645);
        setLongField(term6972, term6972.getClass(), "nodes", -7612550318181586304L);
        setField(term6892, term6892.getClass(), "timeControl", term6972);
        setField(term6996, term6996.getClass(), "movePerTime", term6997);
        setField(term6996, term6996.getClass(), "timeControlType", enum20);
        setIntField(term6996, term6996.getClass(), "halfMoves", -226514366);
        setLongField(term6996, term6996.getClass(), "milliseconds", -2170847986967241072L);
        setLongField(term6996, term6996.getClass(), "increment", 4044358158040652353L);
        setIntField(term6996, term6996.getClass(), "depth", 1193880199);
        setLongField(term6996, term6996.getClass(), "nodes", -4443169559037975007L);
        setField(term6892, term6892.getClass(), "timeControl2", term6996);
        setField(term7023, term7023.getClass(), "event", term7024);
        setField(term7023, term7023.getClass(), "player", term7029);
        setField(term7023, term7023.getClass(), "games", term7034);
        setField(term7023, term7023.getClass(), "listener", term7038);
        setField(term7023, term7023.getClass(), "fileName", "hxCBltsObl");
        setField(term7023, term7023.getClass(), "size", term7054);
        setBooleanField(term7023, term7023.getClass(), "lazyLoad", true);
        setField(term6892, term6892.getClass(), "pgnHolder", term7023);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Event");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartDate", argTypes, term6892, args);
    }

};


