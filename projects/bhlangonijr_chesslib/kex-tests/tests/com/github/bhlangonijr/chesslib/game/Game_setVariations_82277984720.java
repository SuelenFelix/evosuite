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
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.String;
import java.util.LinkedHashMap;

public class Game_setVariations_82277984720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71738;
     Object term71827;

    public Game_setVariations_82277984720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term71742 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term71742, term71742.getClass(), "round", null);
        setField(term71742, term71742.getClass(), "gameId", null);
        setField(term71742, term71742.getClass(), "date", null);
        setField(term71742, term71742.getClass(), "time", null);
        setField(term71742, term71742.getClass(), "termination", null);
        setField(term71742, term71742.getClass(), "whitePlayer", null);
        setField(term71742, term71742.getClass(), "blackPlayer", null);
        setField(term71742, term71742.getClass(), "annotator", null);
        setField(term71742, term71742.getClass(), "plyCount", null);
        setField(term71742, term71742.getClass(), "result", null);
        setField(term71742, term71742.getClass(), "halfMoves", null);
        setField(term71742, term71742.getClass(), "variations", null);
        setField(term71742, term71742.getClass(), "comments", null);
        setField(term71742, term71742.getClass(), "nag", null);
        setField(term71742, term71742.getClass(), "property", null);
        setField(term71742, term71742.getClass(), "fen", null);
        setField(term71742, term71742.getClass(), "board", null);
        setIntField(term71742, term71742.getClass(), "position", 0);
        setIntField(term71742, term71742.getClass(), "initialPosition", 0);
        setField(term71742, term71742.getClass(), "currentMoveList", null);
        setField(term71742, term71742.getClass(), "eco", null);
        setField(term71742, term71742.getClass(), "moveText", null);
        setField(term71742, term71742.getClass(), "opening", null);
        setField(term71742, term71742.getClass(), "variation", null);
        Object term71745 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term71745, term71745.getClass(), "round", null);
        setField(term71745, term71745.getClass(), "gameId", null);
        setField(term71745, term71745.getClass(), "date", null);
        setField(term71745, term71745.getClass(), "time", null);
        setField(term71745, term71745.getClass(), "termination", null);
        setField(term71745, term71745.getClass(), "whitePlayer", null);
        setField(term71745, term71745.getClass(), "blackPlayer", null);
        setField(term71745, term71745.getClass(), "annotator", null);
        setField(term71745, term71745.getClass(), "plyCount", null);
        setField(term71745, term71745.getClass(), "result", null);
        setField(term71745, term71745.getClass(), "halfMoves", null);
        setField(term71745, term71745.getClass(), "variations", null);
        setField(term71745, term71745.getClass(), "comments", null);
        setField(term71745, term71745.getClass(), "nag", null);
        setField(term71745, term71745.getClass(), "property", null);
        setField(term71745, term71745.getClass(), "fen", null);
        setField(term71745, term71745.getClass(), "board", null);
        setIntField(term71745, term71745.getClass(), "position", 0);
        setIntField(term71745, term71745.getClass(), "initialPosition", 0);
        setField(term71745, term71745.getClass(), "currentMoveList", null);
        setField(term71745, term71745.getClass(), "eco", null);
        setField(term71745, term71745.getClass(), "moveText", null);
        setField(term71745, term71745.getClass(), "opening", null);
        setField(term71745, term71745.getClass(), "variation", null);
        ArrayList term71740 = new ArrayList();
        ((ArrayList) term71740).add(term71742);
        ((ArrayList) term71740).add(term71745);
        HashMap term71751 = new HashMap();
        Class<? extends Object> term71911 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.Termination");
        Field term71910 = ((Class) term71911).getDeclaredField((String) "UNTERMINATED");
        ((Field) term71910).setAccessible(true);
        Object enum221 = ((Field) term71910).get((Object) null);
        term71738 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        Object term71739 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        Object term71750 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term71739, term71739.getClass(), "game", term71740);
        setField(term71750, term71750.getClass(), "round", term71751);
        setField(term71750, term71750.getClass(), "id", null);
        setField(term71750, term71750.getClass(), "name", null);
        setField(term71750, term71750.getClass(), "eventType", null);
        setField(term71750, term71750.getClass(), "startDate", null);
        setField(term71750, term71750.getClass(), "endDate", null);
        setField(term71750, term71750.getClass(), "site", null);
        setLongField(term71750, term71750.getClass(), "timestamp", 0L);
        setIntField(term71750, term71750.getClass(), "rounds", 0);
        setField(term71750, term71750.getClass(), "timeControl", null);
        setField(term71750, term71750.getClass(), "timeControl2", null);
        setField(term71750, term71750.getClass(), "pgnHolder", null);
        setField(term71739, term71739.getClass(), "event", term71750);
        setIntField(term71739, term71739.getClass(), "number", 2007134147);
        setField(term71738, term71738.getClass(), "round", term71739);
        setField(term71738, term71738.getClass(), "gameId", "ZwKmasCVIy");
        setField(term71738, term71738.getClass(), "date", "pxokrVaeMd");
        setField(term71738, term71738.getClass(), "time", "ujxmmZZcbT");
        setField(term71738, term71738.getClass(), "termination", enum221);
        setField(term71738, term71738.getClass(), "whitePlayer", null);
        setField(term71738, term71738.getClass(), "blackPlayer", null);
        setField(term71738, term71738.getClass(), "annotator", null);
        setField(term71738, term71738.getClass(), "plyCount", null);
        setField(term71738, term71738.getClass(), "result", null);
        setField(term71738, term71738.getClass(), "halfMoves", null);
        setField(term71738, term71738.getClass(), "variations", null);
        setField(term71738, term71738.getClass(), "comments", null);
        setField(term71738, term71738.getClass(), "nag", null);
        setField(term71738, term71738.getClass(), "property", null);
        setField(term71738, term71738.getClass(), "fen", null);
        setField(term71738, term71738.getClass(), "board", null);
        setIntField(term71738, term71738.getClass(), "position", 0);
        setIntField(term71738, term71738.getClass(), "initialPosition", 0);
        setField(term71738, term71738.getClass(), "currentMoveList", null);
        setField(term71738, term71738.getClass(), "eco", null);
        setField(term71738, term71738.getClass(), "moveText", null);
        setField(term71738, term71738.getClass(), "opening", null);
        setField(term71738, term71738.getClass(), "variation", null);
        term71827 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term71827;
        callMethod(klass, "setVariations", argTypes, term71738, args);
    }

};


