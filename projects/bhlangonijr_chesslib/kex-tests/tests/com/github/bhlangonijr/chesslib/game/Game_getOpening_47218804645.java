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

public class Game_getOpening_47218804645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90983;

    public Game_getOpening_47218804645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term90987 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term90987, term90987.getClass(), "round", null);
        setField(term90987, term90987.getClass(), "gameId", null);
        setField(term90987, term90987.getClass(), "date", null);
        setField(term90987, term90987.getClass(), "time", null);
        setField(term90987, term90987.getClass(), "termination", null);
        setField(term90987, term90987.getClass(), "whitePlayer", null);
        setField(term90987, term90987.getClass(), "blackPlayer", null);
        setField(term90987, term90987.getClass(), "annotator", null);
        setField(term90987, term90987.getClass(), "plyCount", null);
        setField(term90987, term90987.getClass(), "result", null);
        setField(term90987, term90987.getClass(), "halfMoves", null);
        setField(term90987, term90987.getClass(), "variations", null);
        setField(term90987, term90987.getClass(), "comments", null);
        setField(term90987, term90987.getClass(), "nag", null);
        setField(term90987, term90987.getClass(), "property", null);
        setField(term90987, term90987.getClass(), "fen", null);
        setField(term90987, term90987.getClass(), "board", null);
        setIntField(term90987, term90987.getClass(), "position", 0);
        setIntField(term90987, term90987.getClass(), "initialPosition", 0);
        setField(term90987, term90987.getClass(), "currentMoveList", null);
        setField(term90987, term90987.getClass(), "eco", null);
        setField(term90987, term90987.getClass(), "moveText", null);
        setField(term90987, term90987.getClass(), "opening", null);
        setField(term90987, term90987.getClass(), "variation", null);
        Object term90990 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term90990, term90990.getClass(), "round", null);
        setField(term90990, term90990.getClass(), "gameId", null);
        setField(term90990, term90990.getClass(), "date", null);
        setField(term90990, term90990.getClass(), "time", null);
        setField(term90990, term90990.getClass(), "termination", null);
        setField(term90990, term90990.getClass(), "whitePlayer", null);
        setField(term90990, term90990.getClass(), "blackPlayer", null);
        setField(term90990, term90990.getClass(), "annotator", null);
        setField(term90990, term90990.getClass(), "plyCount", null);
        setField(term90990, term90990.getClass(), "result", null);
        setField(term90990, term90990.getClass(), "halfMoves", null);
        setField(term90990, term90990.getClass(), "variations", null);
        setField(term90990, term90990.getClass(), "comments", null);
        setField(term90990, term90990.getClass(), "nag", null);
        setField(term90990, term90990.getClass(), "property", null);
        setField(term90990, term90990.getClass(), "fen", null);
        setField(term90990, term90990.getClass(), "board", null);
        setIntField(term90990, term90990.getClass(), "position", 0);
        setIntField(term90990, term90990.getClass(), "initialPosition", 0);
        setField(term90990, term90990.getClass(), "currentMoveList", null);
        setField(term90990, term90990.getClass(), "eco", null);
        setField(term90990, term90990.getClass(), "moveText", null);
        setField(term90990, term90990.getClass(), "opening", null);
        setField(term90990, term90990.getClass(), "variation", null);
        Object term90993 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term90993, term90993.getClass(), "round", null);
        setField(term90993, term90993.getClass(), "gameId", null);
        setField(term90993, term90993.getClass(), "date", null);
        setField(term90993, term90993.getClass(), "time", null);
        setField(term90993, term90993.getClass(), "termination", null);
        setField(term90993, term90993.getClass(), "whitePlayer", null);
        setField(term90993, term90993.getClass(), "blackPlayer", null);
        setField(term90993, term90993.getClass(), "annotator", null);
        setField(term90993, term90993.getClass(), "plyCount", null);
        setField(term90993, term90993.getClass(), "result", null);
        setField(term90993, term90993.getClass(), "halfMoves", null);
        setField(term90993, term90993.getClass(), "variations", null);
        setField(term90993, term90993.getClass(), "comments", null);
        setField(term90993, term90993.getClass(), "nag", null);
        setField(term90993, term90993.getClass(), "property", null);
        setField(term90993, term90993.getClass(), "fen", null);
        setField(term90993, term90993.getClass(), "board", null);
        setIntField(term90993, term90993.getClass(), "position", 0);
        setIntField(term90993, term90993.getClass(), "initialPosition", 0);
        setField(term90993, term90993.getClass(), "currentMoveList", null);
        setField(term90993, term90993.getClass(), "eco", null);
        setField(term90993, term90993.getClass(), "moveText", null);
        setField(term90993, term90993.getClass(), "opening", null);
        setField(term90993, term90993.getClass(), "variation", null);
        ArrayList term90985 = new ArrayList();
        ((ArrayList) term90985).add(term90987);
        ((ArrayList) term90985).add(term90990);
        ((ArrayList) term90985).add(term90990);
        ((ArrayList) term90985).add(term90987);
        ((ArrayList) term90985).add(term90993);
        ((ArrayList) term90985).add(term90993);
        HashMap term90999 = new HashMap();
        Class<? extends Object> term91100 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.Termination");
        Field term91099 = ((Class) term91100).getDeclaredField((String) "ABANDONED");
        ((Field) term91099).setAccessible(true);
        Object enum283 = ((Field) term91099).get((Object) null);
        term90983 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        Object term90984 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        Object term90998 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term90984, term90984.getClass(), "game", term90985);
        setField(term90998, term90998.getClass(), "round", term90999);
        setField(term90998, term90998.getClass(), "id", null);
        setField(term90998, term90998.getClass(), "name", null);
        setField(term90998, term90998.getClass(), "eventType", null);
        setField(term90998, term90998.getClass(), "startDate", null);
        setField(term90998, term90998.getClass(), "endDate", null);
        setField(term90998, term90998.getClass(), "site", null);
        setLongField(term90998, term90998.getClass(), "timestamp", 0L);
        setIntField(term90998, term90998.getClass(), "rounds", 0);
        setField(term90998, term90998.getClass(), "timeControl", null);
        setField(term90998, term90998.getClass(), "timeControl2", null);
        setField(term90998, term90998.getClass(), "pgnHolder", null);
        setField(term90984, term90984.getClass(), "event", term90998);
        setIntField(term90984, term90984.getClass(), "number", -1945635750);
        setField(term90983, term90983.getClass(), "round", term90984);
        setField(term90983, term90983.getClass(), "gameId", "NrXtkbXwDc");
        setField(term90983, term90983.getClass(), "date", "EUapSrAmOe");
        setField(term90983, term90983.getClass(), "time", "dUHylIprea");
        setField(term90983, term90983.getClass(), "termination", enum283);
        setField(term90983, term90983.getClass(), "whitePlayer", null);
        setField(term90983, term90983.getClass(), "blackPlayer", null);
        setField(term90983, term90983.getClass(), "annotator", null);
        setField(term90983, term90983.getClass(), "plyCount", null);
        setField(term90983, term90983.getClass(), "result", null);
        setField(term90983, term90983.getClass(), "halfMoves", null);
        setField(term90983, term90983.getClass(), "variations", null);
        setField(term90983, term90983.getClass(), "comments", null);
        setField(term90983, term90983.getClass(), "nag", null);
        setField(term90983, term90983.getClass(), "property", null);
        setField(term90983, term90983.getClass(), "fen", null);
        setField(term90983, term90983.getClass(), "board", null);
        setIntField(term90983, term90983.getClass(), "position", 0);
        setIntField(term90983, term90983.getClass(), "initialPosition", 0);
        setField(term90983, term90983.getClass(), "currentMoveList", null);
        setField(term90983, term90983.getClass(), "eco", null);
        setField(term90983, term90983.getClass(), "moveText", null);
        setField(term90983, term90983.getClass(), "opening", null);
        setField(term90983, term90983.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOpening", argTypes, term90983, args);
    }

};


