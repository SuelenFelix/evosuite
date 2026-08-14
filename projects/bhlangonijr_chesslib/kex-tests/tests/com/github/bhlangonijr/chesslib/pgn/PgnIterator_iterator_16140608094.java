package com.github.bhlangonijr.chesslib.pgn;

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
import static com.github.bhlangonijr.chesslib.pgn.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.String;

public class PgnIterator_iterator_16140608094 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term752;

    public PgnIterator_iterator_16140608094() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term755 = new ArrayList();
        ((ArrayList) term755).add((Object)null);
        ((ArrayList) term755).add((Object)null);
        HashMap term760 = new HashMap();
        Class<? extends Object> term861 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.Termination");
        Field term860 = ((Class) term861).getDeclaredField((String) "ABANDONED");
        ((Field) term860).setAccessible(true);
        Object enum1 = ((Field) term860).get((Object) null);
        term752 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnIterator"));
        Object term753 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        Object term754 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        Object term759 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term752, term752.getClass(), "pgnLines", null);
        setField(term754, term754.getClass(), "game", term755);
        setField(term759, term759.getClass(), "round", term760);
        setField(term759, term759.getClass(), "id", null);
        setField(term759, term759.getClass(), "name", null);
        setField(term759, term759.getClass(), "eventType", null);
        setField(term759, term759.getClass(), "startDate", null);
        setField(term759, term759.getClass(), "endDate", null);
        setField(term759, term759.getClass(), "site", null);
        setLongField(term759, term759.getClass(), "timestamp", 0L);
        setIntField(term759, term759.getClass(), "rounds", 0);
        setField(term759, term759.getClass(), "timeControl", null);
        setField(term759, term759.getClass(), "timeControl2", null);
        setField(term759, term759.getClass(), "pgnHolder", null);
        setField(term754, term754.getClass(), "event", term759);
        setIntField(term754, term754.getClass(), "number", -522618178);
        setField(term753, term753.getClass(), "round", term754);
        setField(term753, term753.getClass(), "gameId", "OclPbYPkcH");
        setField(term753, term753.getClass(), "date", "IoAlmYsBwc");
        setField(term753, term753.getClass(), "time", "TEParAifyi");
        setField(term753, term753.getClass(), "termination", enum1);
        setField(term753, term753.getClass(), "whitePlayer", null);
        setField(term753, term753.getClass(), "blackPlayer", null);
        setField(term753, term753.getClass(), "annotator", null);
        setField(term753, term753.getClass(), "plyCount", null);
        setField(term753, term753.getClass(), "result", null);
        setField(term753, term753.getClass(), "halfMoves", null);
        setField(term753, term753.getClass(), "variations", null);
        setField(term753, term753.getClass(), "comments", null);
        setField(term753, term753.getClass(), "nag", null);
        setField(term753, term753.getClass(), "property", null);
        setField(term753, term753.getClass(), "fen", null);
        setField(term753, term753.getClass(), "board", null);
        setIntField(term753, term753.getClass(), "position", 0);
        setIntField(term753, term753.getClass(), "initialPosition", 0);
        setField(term753, term753.getClass(), "currentMoveList", null);
        setField(term753, term753.getClass(), "eco", null);
        setField(term753, term753.getClass(), "moveText", null);
        setField(term753, term753.getClass(), "opening", null);
        setField(term753, term753.getClass(), "variation", null);
        setField(term752, term752.getClass(), "game", term753);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "iterator", argTypes, term752, args);
    }

};


