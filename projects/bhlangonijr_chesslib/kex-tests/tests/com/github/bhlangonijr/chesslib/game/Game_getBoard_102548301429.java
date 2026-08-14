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

public class Game_getBoard_102548301429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74979;

    public Game_getBoard_102548301429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term74983 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term74983, term74983.getClass(), "round", null);
        setField(term74983, term74983.getClass(), "gameId", null);
        setField(term74983, term74983.getClass(), "date", null);
        setField(term74983, term74983.getClass(), "time", null);
        setField(term74983, term74983.getClass(), "termination", null);
        setField(term74983, term74983.getClass(), "whitePlayer", null);
        setField(term74983, term74983.getClass(), "blackPlayer", null);
        setField(term74983, term74983.getClass(), "annotator", null);
        setField(term74983, term74983.getClass(), "plyCount", null);
        setField(term74983, term74983.getClass(), "result", null);
        setField(term74983, term74983.getClass(), "halfMoves", null);
        setField(term74983, term74983.getClass(), "variations", null);
        setField(term74983, term74983.getClass(), "comments", null);
        setField(term74983, term74983.getClass(), "nag", null);
        setField(term74983, term74983.getClass(), "property", null);
        setField(term74983, term74983.getClass(), "fen", null);
        setField(term74983, term74983.getClass(), "board", null);
        setIntField(term74983, term74983.getClass(), "position", 0);
        setIntField(term74983, term74983.getClass(), "initialPosition", 0);
        setField(term74983, term74983.getClass(), "currentMoveList", null);
        setField(term74983, term74983.getClass(), "eco", null);
        setField(term74983, term74983.getClass(), "moveText", null);
        setField(term74983, term74983.getClass(), "opening", null);
        setField(term74983, term74983.getClass(), "variation", null);
        Object term74986 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term74986, term74986.getClass(), "round", null);
        setField(term74986, term74986.getClass(), "gameId", null);
        setField(term74986, term74986.getClass(), "date", null);
        setField(term74986, term74986.getClass(), "time", null);
        setField(term74986, term74986.getClass(), "termination", null);
        setField(term74986, term74986.getClass(), "whitePlayer", null);
        setField(term74986, term74986.getClass(), "blackPlayer", null);
        setField(term74986, term74986.getClass(), "annotator", null);
        setField(term74986, term74986.getClass(), "plyCount", null);
        setField(term74986, term74986.getClass(), "result", null);
        setField(term74986, term74986.getClass(), "halfMoves", null);
        setField(term74986, term74986.getClass(), "variations", null);
        setField(term74986, term74986.getClass(), "comments", null);
        setField(term74986, term74986.getClass(), "nag", null);
        setField(term74986, term74986.getClass(), "property", null);
        setField(term74986, term74986.getClass(), "fen", null);
        setField(term74986, term74986.getClass(), "board", null);
        setIntField(term74986, term74986.getClass(), "position", 0);
        setIntField(term74986, term74986.getClass(), "initialPosition", 0);
        setField(term74986, term74986.getClass(), "currentMoveList", null);
        setField(term74986, term74986.getClass(), "eco", null);
        setField(term74986, term74986.getClass(), "moveText", null);
        setField(term74986, term74986.getClass(), "opening", null);
        setField(term74986, term74986.getClass(), "variation", null);
        Object term74989 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term74989, term74989.getClass(), "round", null);
        setField(term74989, term74989.getClass(), "gameId", null);
        setField(term74989, term74989.getClass(), "date", null);
        setField(term74989, term74989.getClass(), "time", null);
        setField(term74989, term74989.getClass(), "termination", null);
        setField(term74989, term74989.getClass(), "whitePlayer", null);
        setField(term74989, term74989.getClass(), "blackPlayer", null);
        setField(term74989, term74989.getClass(), "annotator", null);
        setField(term74989, term74989.getClass(), "plyCount", null);
        setField(term74989, term74989.getClass(), "result", null);
        setField(term74989, term74989.getClass(), "halfMoves", null);
        setField(term74989, term74989.getClass(), "variations", null);
        setField(term74989, term74989.getClass(), "comments", null);
        setField(term74989, term74989.getClass(), "nag", null);
        setField(term74989, term74989.getClass(), "property", null);
        setField(term74989, term74989.getClass(), "fen", null);
        setField(term74989, term74989.getClass(), "board", null);
        setIntField(term74989, term74989.getClass(), "position", 0);
        setIntField(term74989, term74989.getClass(), "initialPosition", 0);
        setField(term74989, term74989.getClass(), "currentMoveList", null);
        setField(term74989, term74989.getClass(), "eco", null);
        setField(term74989, term74989.getClass(), "moveText", null);
        setField(term74989, term74989.getClass(), "opening", null);
        setField(term74989, term74989.getClass(), "variation", null);
        Object term74992 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term74992, term74992.getClass(), "round", null);
        setField(term74992, term74992.getClass(), "gameId", null);
        setField(term74992, term74992.getClass(), "date", null);
        setField(term74992, term74992.getClass(), "time", null);
        setField(term74992, term74992.getClass(), "termination", null);
        setField(term74992, term74992.getClass(), "whitePlayer", null);
        setField(term74992, term74992.getClass(), "blackPlayer", null);
        setField(term74992, term74992.getClass(), "annotator", null);
        setField(term74992, term74992.getClass(), "plyCount", null);
        setField(term74992, term74992.getClass(), "result", null);
        setField(term74992, term74992.getClass(), "halfMoves", null);
        setField(term74992, term74992.getClass(), "variations", null);
        setField(term74992, term74992.getClass(), "comments", null);
        setField(term74992, term74992.getClass(), "nag", null);
        setField(term74992, term74992.getClass(), "property", null);
        setField(term74992, term74992.getClass(), "fen", null);
        setField(term74992, term74992.getClass(), "board", null);
        setIntField(term74992, term74992.getClass(), "position", 0);
        setIntField(term74992, term74992.getClass(), "initialPosition", 0);
        setField(term74992, term74992.getClass(), "currentMoveList", null);
        setField(term74992, term74992.getClass(), "eco", null);
        setField(term74992, term74992.getClass(), "moveText", null);
        setField(term74992, term74992.getClass(), "opening", null);
        setField(term74992, term74992.getClass(), "variation", null);
        ArrayList term74981 = new ArrayList();
        ((ArrayList) term74981).add(term74983);
        ((ArrayList) term74981).add(term74986);
        ((ArrayList) term74981).add(term74979);
        ((ArrayList) term74981).add(term74989);
        ((ArrayList) term74981).add(term74992);
        ((ArrayList) term74981).add(term74983);
        HashMap term74998 = new HashMap();
        Class<? extends Object> term75099 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.Termination");
        Field term75098 = ((Class) term75099).getDeclaredField((String) "ABANDONED");
        ((Field) term75098).setAccessible(true);
        Object enum229 = ((Field) term75098).get((Object) null);
        term74979 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        Object term74980 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        Object term74997 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term74980, term74980.getClass(), "game", term74981);
        setField(term74997, term74997.getClass(), "round", term74998);
        setField(term74997, term74997.getClass(), "id", null);
        setField(term74997, term74997.getClass(), "name", null);
        setField(term74997, term74997.getClass(), "eventType", null);
        setField(term74997, term74997.getClass(), "startDate", null);
        setField(term74997, term74997.getClass(), "endDate", null);
        setField(term74997, term74997.getClass(), "site", null);
        setLongField(term74997, term74997.getClass(), "timestamp", 0L);
        setIntField(term74997, term74997.getClass(), "rounds", 0);
        setField(term74997, term74997.getClass(), "timeControl", null);
        setField(term74997, term74997.getClass(), "timeControl2", null);
        setField(term74997, term74997.getClass(), "pgnHolder", null);
        setField(term74980, term74980.getClass(), "event", term74997);
        setIntField(term74980, term74980.getClass(), "number", 1023209512);
        setField(term74979, term74979.getClass(), "round", term74980);
        setField(term74979, term74979.getClass(), "gameId", "VZwkkQktrm");
        setField(term74979, term74979.getClass(), "date", "wIuJvIvEMb");
        setField(term74979, term74979.getClass(), "time", "EyojsbSjWT");
        setField(term74979, term74979.getClass(), "termination", enum229);
        setField(term74979, term74979.getClass(), "whitePlayer", null);
        setField(term74979, term74979.getClass(), "blackPlayer", null);
        setField(term74979, term74979.getClass(), "annotator", null);
        setField(term74979, term74979.getClass(), "plyCount", null);
        setField(term74979, term74979.getClass(), "result", null);
        setField(term74979, term74979.getClass(), "halfMoves", null);
        setField(term74979, term74979.getClass(), "variations", null);
        setField(term74979, term74979.getClass(), "comments", null);
        setField(term74979, term74979.getClass(), "nag", null);
        setField(term74979, term74979.getClass(), "property", null);
        setField(term74979, term74979.getClass(), "fen", null);
        setField(term74979, term74979.getClass(), "board", null);
        setIntField(term74979, term74979.getClass(), "position", 0);
        setIntField(term74979, term74979.getClass(), "initialPosition", 0);
        setField(term74979, term74979.getClass(), "currentMoveList", null);
        setField(term74979, term74979.getClass(), "eco", null);
        setField(term74979, term74979.getClass(), "moveText", null);
        setField(term74979, term74979.getClass(), "opening", null);
        setField(term74979, term74979.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBoard", argTypes, term74979, args);
    }

};


