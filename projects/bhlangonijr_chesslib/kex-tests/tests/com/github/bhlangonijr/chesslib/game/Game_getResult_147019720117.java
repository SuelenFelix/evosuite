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

public class Game_getResult_147019720117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60042;

    public Game_getResult_147019720117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term60046 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term60046, term60046.getClass(), "round", null);
        setField(term60046, term60046.getClass(), "gameId", null);
        setField(term60046, term60046.getClass(), "date", null);
        setField(term60046, term60046.getClass(), "time", null);
        setField(term60046, term60046.getClass(), "termination", null);
        setField(term60046, term60046.getClass(), "whitePlayer", null);
        setField(term60046, term60046.getClass(), "blackPlayer", null);
        setField(term60046, term60046.getClass(), "annotator", null);
        setField(term60046, term60046.getClass(), "plyCount", null);
        setField(term60046, term60046.getClass(), "result", null);
        setField(term60046, term60046.getClass(), "halfMoves", null);
        setField(term60046, term60046.getClass(), "variations", null);
        setField(term60046, term60046.getClass(), "comments", null);
        setField(term60046, term60046.getClass(), "nag", null);
        setField(term60046, term60046.getClass(), "property", null);
        setField(term60046, term60046.getClass(), "fen", null);
        setField(term60046, term60046.getClass(), "board", null);
        setIntField(term60046, term60046.getClass(), "position", 0);
        setIntField(term60046, term60046.getClass(), "initialPosition", 0);
        setField(term60046, term60046.getClass(), "currentMoveList", null);
        setField(term60046, term60046.getClass(), "eco", null);
        setField(term60046, term60046.getClass(), "moveText", null);
        setField(term60046, term60046.getClass(), "opening", null);
        setField(term60046, term60046.getClass(), "variation", null);
        Object term60049 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term60049, term60049.getClass(), "round", null);
        setField(term60049, term60049.getClass(), "gameId", null);
        setField(term60049, term60049.getClass(), "date", null);
        setField(term60049, term60049.getClass(), "time", null);
        setField(term60049, term60049.getClass(), "termination", null);
        setField(term60049, term60049.getClass(), "whitePlayer", null);
        setField(term60049, term60049.getClass(), "blackPlayer", null);
        setField(term60049, term60049.getClass(), "annotator", null);
        setField(term60049, term60049.getClass(), "plyCount", null);
        setField(term60049, term60049.getClass(), "result", null);
        setField(term60049, term60049.getClass(), "halfMoves", null);
        setField(term60049, term60049.getClass(), "variations", null);
        setField(term60049, term60049.getClass(), "comments", null);
        setField(term60049, term60049.getClass(), "nag", null);
        setField(term60049, term60049.getClass(), "property", null);
        setField(term60049, term60049.getClass(), "fen", null);
        setField(term60049, term60049.getClass(), "board", null);
        setIntField(term60049, term60049.getClass(), "position", 0);
        setIntField(term60049, term60049.getClass(), "initialPosition", 0);
        setField(term60049, term60049.getClass(), "currentMoveList", null);
        setField(term60049, term60049.getClass(), "eco", null);
        setField(term60049, term60049.getClass(), "moveText", null);
        setField(term60049, term60049.getClass(), "opening", null);
        setField(term60049, term60049.getClass(), "variation", null);
        ArrayList term60044 = new ArrayList();
        ((ArrayList) term60044).add(term60046);
        ((ArrayList) term60044).add(term60046);
        ((ArrayList) term60044).add(term60049);
        HashMap term60055 = new HashMap();
        Class<? extends Object> term60156 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.Termination");
        Field term60155 = ((Class) term60156).getDeclaredField((String) "ABANDONED");
        ((Field) term60155).setAccessible(true);
        Object enum177 = ((Field) term60155).get((Object) null);
        term60042 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        Object term60043 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        Object term60054 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term60043, term60043.getClass(), "game", term60044);
        setField(term60054, term60054.getClass(), "round", term60055);
        setField(term60054, term60054.getClass(), "id", null);
        setField(term60054, term60054.getClass(), "name", null);
        setField(term60054, term60054.getClass(), "eventType", null);
        setField(term60054, term60054.getClass(), "startDate", null);
        setField(term60054, term60054.getClass(), "endDate", null);
        setField(term60054, term60054.getClass(), "site", null);
        setLongField(term60054, term60054.getClass(), "timestamp", 0L);
        setIntField(term60054, term60054.getClass(), "rounds", 0);
        setField(term60054, term60054.getClass(), "timeControl", null);
        setField(term60054, term60054.getClass(), "timeControl2", null);
        setField(term60054, term60054.getClass(), "pgnHolder", null);
        setField(term60043, term60043.getClass(), "event", term60054);
        setIntField(term60043, term60043.getClass(), "number", -919416536);
        setField(term60042, term60042.getClass(), "round", term60043);
        setField(term60042, term60042.getClass(), "gameId", "HqoTWlkbwF");
        setField(term60042, term60042.getClass(), "date", "CwNELDTAPP");
        setField(term60042, term60042.getClass(), "time", "GSzQdbHLHw");
        setField(term60042, term60042.getClass(), "termination", enum177);
        setField(term60042, term60042.getClass(), "whitePlayer", null);
        setField(term60042, term60042.getClass(), "blackPlayer", null);
        setField(term60042, term60042.getClass(), "annotator", null);
        setField(term60042, term60042.getClass(), "plyCount", null);
        setField(term60042, term60042.getClass(), "result", null);
        setField(term60042, term60042.getClass(), "halfMoves", null);
        setField(term60042, term60042.getClass(), "variations", null);
        setField(term60042, term60042.getClass(), "comments", null);
        setField(term60042, term60042.getClass(), "nag", null);
        setField(term60042, term60042.getClass(), "property", null);
        setField(term60042, term60042.getClass(), "fen", null);
        setField(term60042, term60042.getClass(), "board", null);
        setIntField(term60042, term60042.getClass(), "position", 0);
        setIntField(term60042, term60042.getClass(), "initialPosition", 0);
        setField(term60042, term60042.getClass(), "currentMoveList", null);
        setField(term60042, term60042.getClass(), "eco", null);
        setField(term60042, term60042.getClass(), "moveText", null);
        setField(term60042, term60042.getClass(), "opening", null);
        setField(term60042, term60042.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResult", argTypes, term60042, args);
    }

};


