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

public class Game_setWhitePlayer_195876127410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57143;

    public Game_setWhitePlayer_195876127410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term57147 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term57147, term57147.getClass(), "round", null);
        setField(term57147, term57147.getClass(), "gameId", null);
        setField(term57147, term57147.getClass(), "date", null);
        setField(term57147, term57147.getClass(), "time", null);
        setField(term57147, term57147.getClass(), "termination", null);
        setField(term57147, term57147.getClass(), "whitePlayer", null);
        setField(term57147, term57147.getClass(), "blackPlayer", null);
        setField(term57147, term57147.getClass(), "annotator", null);
        setField(term57147, term57147.getClass(), "plyCount", null);
        setField(term57147, term57147.getClass(), "result", null);
        setField(term57147, term57147.getClass(), "halfMoves", null);
        setField(term57147, term57147.getClass(), "variations", null);
        setField(term57147, term57147.getClass(), "comments", null);
        setField(term57147, term57147.getClass(), "nag", null);
        setField(term57147, term57147.getClass(), "property", null);
        setField(term57147, term57147.getClass(), "fen", null);
        setField(term57147, term57147.getClass(), "board", null);
        setIntField(term57147, term57147.getClass(), "position", 0);
        setIntField(term57147, term57147.getClass(), "initialPosition", 0);
        setField(term57147, term57147.getClass(), "currentMoveList", null);
        setField(term57147, term57147.getClass(), "eco", null);
        setField(term57147, term57147.getClass(), "moveText", null);
        setField(term57147, term57147.getClass(), "opening", null);
        setField(term57147, term57147.getClass(), "variation", null);
        ArrayList term57145 = new ArrayList();
        ((ArrayList) term57145).add(term57147);
        ((ArrayList) term57145).add(term57147);
        HashMap term57153 = new HashMap();
        Class<? extends Object> term57260 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.Termination");
        Field term57259 = ((Class) term57260).getDeclaredField((String) "TIME_FORFEIT");
        ((Field) term57259).setAccessible(true);
        Object enum170 = ((Field) term57259).get((Object) null);
        term57143 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        Object term57144 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        Object term57152 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term57144, term57144.getClass(), "game", term57145);
        setField(term57152, term57152.getClass(), "round", term57153);
        setField(term57152, term57152.getClass(), "id", null);
        setField(term57152, term57152.getClass(), "name", null);
        setField(term57152, term57152.getClass(), "eventType", null);
        setField(term57152, term57152.getClass(), "startDate", null);
        setField(term57152, term57152.getClass(), "endDate", null);
        setField(term57152, term57152.getClass(), "site", null);
        setLongField(term57152, term57152.getClass(), "timestamp", 0L);
        setIntField(term57152, term57152.getClass(), "rounds", 0);
        setField(term57152, term57152.getClass(), "timeControl", null);
        setField(term57152, term57152.getClass(), "timeControl2", null);
        setField(term57152, term57152.getClass(), "pgnHolder", null);
        setField(term57144, term57144.getClass(), "event", term57152);
        setIntField(term57144, term57144.getClass(), "number", -542712742);
        setField(term57143, term57143.getClass(), "round", term57144);
        setField(term57143, term57143.getClass(), "gameId", "VSaNnhMpRc");
        setField(term57143, term57143.getClass(), "date", "QNjNTLlUaV");
        setField(term57143, term57143.getClass(), "time", "hIYsRyOZxk");
        setField(term57143, term57143.getClass(), "termination", enum170);
        setField(term57143, term57143.getClass(), "whitePlayer", null);
        setField(term57143, term57143.getClass(), "blackPlayer", null);
        setField(term57143, term57143.getClass(), "annotator", null);
        setField(term57143, term57143.getClass(), "plyCount", null);
        setField(term57143, term57143.getClass(), "result", null);
        setField(term57143, term57143.getClass(), "halfMoves", null);
        setField(term57143, term57143.getClass(), "variations", null);
        setField(term57143, term57143.getClass(), "comments", null);
        setField(term57143, term57143.getClass(), "nag", null);
        setField(term57143, term57143.getClass(), "property", null);
        setField(term57143, term57143.getClass(), "fen", null);
        setField(term57143, term57143.getClass(), "board", null);
        setIntField(term57143, term57143.getClass(), "position", 0);
        setIntField(term57143, term57143.getClass(), "initialPosition", 0);
        setField(term57143, term57143.getClass(), "currentMoveList", null);
        setField(term57143, term57143.getClass(), "eco", null);
        setField(term57143, term57143.getClass(), "moveText", null);
        setField(term57143, term57143.getClass(), "opening", null);
        setField(term57143, term57143.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.game.Player");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setWhitePlayer", argTypes, term57143, args);
    }

};


