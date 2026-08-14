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

public class Game_getTime_11956302535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54838;

    public Game_getTime_11956302535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term54842 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term54842, term54842.getClass(), "round", null);
        setField(term54842, term54842.getClass(), "gameId", null);
        setField(term54842, term54842.getClass(), "date", null);
        setField(term54842, term54842.getClass(), "time", null);
        setField(term54842, term54842.getClass(), "termination", null);
        setField(term54842, term54842.getClass(), "whitePlayer", null);
        setField(term54842, term54842.getClass(), "blackPlayer", null);
        setField(term54842, term54842.getClass(), "annotator", null);
        setField(term54842, term54842.getClass(), "plyCount", null);
        setField(term54842, term54842.getClass(), "result", null);
        setField(term54842, term54842.getClass(), "halfMoves", null);
        setField(term54842, term54842.getClass(), "variations", null);
        setField(term54842, term54842.getClass(), "comments", null);
        setField(term54842, term54842.getClass(), "nag", null);
        setField(term54842, term54842.getClass(), "property", null);
        setField(term54842, term54842.getClass(), "fen", null);
        setField(term54842, term54842.getClass(), "board", null);
        setIntField(term54842, term54842.getClass(), "position", 0);
        setIntField(term54842, term54842.getClass(), "initialPosition", 0);
        setField(term54842, term54842.getClass(), "currentMoveList", null);
        setField(term54842, term54842.getClass(), "eco", null);
        setField(term54842, term54842.getClass(), "moveText", null);
        setField(term54842, term54842.getClass(), "opening", null);
        setField(term54842, term54842.getClass(), "variation", null);
        Object term54845 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term54845, term54845.getClass(), "round", null);
        setField(term54845, term54845.getClass(), "gameId", null);
        setField(term54845, term54845.getClass(), "date", null);
        setField(term54845, term54845.getClass(), "time", null);
        setField(term54845, term54845.getClass(), "termination", null);
        setField(term54845, term54845.getClass(), "whitePlayer", null);
        setField(term54845, term54845.getClass(), "blackPlayer", null);
        setField(term54845, term54845.getClass(), "annotator", null);
        setField(term54845, term54845.getClass(), "plyCount", null);
        setField(term54845, term54845.getClass(), "result", null);
        setField(term54845, term54845.getClass(), "halfMoves", null);
        setField(term54845, term54845.getClass(), "variations", null);
        setField(term54845, term54845.getClass(), "comments", null);
        setField(term54845, term54845.getClass(), "nag", null);
        setField(term54845, term54845.getClass(), "property", null);
        setField(term54845, term54845.getClass(), "fen", null);
        setField(term54845, term54845.getClass(), "board", null);
        setIntField(term54845, term54845.getClass(), "position", 0);
        setIntField(term54845, term54845.getClass(), "initialPosition", 0);
        setField(term54845, term54845.getClass(), "currentMoveList", null);
        setField(term54845, term54845.getClass(), "eco", null);
        setField(term54845, term54845.getClass(), "moveText", null);
        setField(term54845, term54845.getClass(), "opening", null);
        setField(term54845, term54845.getClass(), "variation", null);
        Object term54848 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term54848, term54848.getClass(), "round", null);
        setField(term54848, term54848.getClass(), "gameId", null);
        setField(term54848, term54848.getClass(), "date", null);
        setField(term54848, term54848.getClass(), "time", null);
        setField(term54848, term54848.getClass(), "termination", null);
        setField(term54848, term54848.getClass(), "whitePlayer", null);
        setField(term54848, term54848.getClass(), "blackPlayer", null);
        setField(term54848, term54848.getClass(), "annotator", null);
        setField(term54848, term54848.getClass(), "plyCount", null);
        setField(term54848, term54848.getClass(), "result", null);
        setField(term54848, term54848.getClass(), "halfMoves", null);
        setField(term54848, term54848.getClass(), "variations", null);
        setField(term54848, term54848.getClass(), "comments", null);
        setField(term54848, term54848.getClass(), "nag", null);
        setField(term54848, term54848.getClass(), "property", null);
        setField(term54848, term54848.getClass(), "fen", null);
        setField(term54848, term54848.getClass(), "board", null);
        setIntField(term54848, term54848.getClass(), "position", 0);
        setIntField(term54848, term54848.getClass(), "initialPosition", 0);
        setField(term54848, term54848.getClass(), "currentMoveList", null);
        setField(term54848, term54848.getClass(), "eco", null);
        setField(term54848, term54848.getClass(), "moveText", null);
        setField(term54848, term54848.getClass(), "opening", null);
        setField(term54848, term54848.getClass(), "variation", null);
        Object term54851 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term54851, term54851.getClass(), "round", null);
        setField(term54851, term54851.getClass(), "gameId", null);
        setField(term54851, term54851.getClass(), "date", null);
        setField(term54851, term54851.getClass(), "time", null);
        setField(term54851, term54851.getClass(), "termination", null);
        setField(term54851, term54851.getClass(), "whitePlayer", null);
        setField(term54851, term54851.getClass(), "blackPlayer", null);
        setField(term54851, term54851.getClass(), "annotator", null);
        setField(term54851, term54851.getClass(), "plyCount", null);
        setField(term54851, term54851.getClass(), "result", null);
        setField(term54851, term54851.getClass(), "halfMoves", null);
        setField(term54851, term54851.getClass(), "variations", null);
        setField(term54851, term54851.getClass(), "comments", null);
        setField(term54851, term54851.getClass(), "nag", null);
        setField(term54851, term54851.getClass(), "property", null);
        setField(term54851, term54851.getClass(), "fen", null);
        setField(term54851, term54851.getClass(), "board", null);
        setIntField(term54851, term54851.getClass(), "position", 0);
        setIntField(term54851, term54851.getClass(), "initialPosition", 0);
        setField(term54851, term54851.getClass(), "currentMoveList", null);
        setField(term54851, term54851.getClass(), "eco", null);
        setField(term54851, term54851.getClass(), "moveText", null);
        setField(term54851, term54851.getClass(), "opening", null);
        setField(term54851, term54851.getClass(), "variation", null);
        ArrayList term54840 = new ArrayList();
        ((ArrayList) term54840).add(term54842);
        ((ArrayList) term54840).add(term54845);
        ((ArrayList) term54840).add(term54848);
        ((ArrayList) term54840).add(term54851);
        ((ArrayList) term54840).add(term54851);
        HashMap term54857 = new HashMap();
        Class<? extends Object> term54958 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.Termination");
        Field term54957 = ((Class) term54958).getDeclaredField((String) "ABANDONED");
        ((Field) term54957).setAccessible(true);
        Object enum164 = ((Field) term54957).get((Object) null);
        term54838 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        Object term54839 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        Object term54856 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term54839, term54839.getClass(), "game", term54840);
        setField(term54856, term54856.getClass(), "round", term54857);
        setField(term54856, term54856.getClass(), "id", null);
        setField(term54856, term54856.getClass(), "name", null);
        setField(term54856, term54856.getClass(), "eventType", null);
        setField(term54856, term54856.getClass(), "startDate", null);
        setField(term54856, term54856.getClass(), "endDate", null);
        setField(term54856, term54856.getClass(), "site", null);
        setLongField(term54856, term54856.getClass(), "timestamp", 0L);
        setIntField(term54856, term54856.getClass(), "rounds", 0);
        setField(term54856, term54856.getClass(), "timeControl", null);
        setField(term54856, term54856.getClass(), "timeControl2", null);
        setField(term54856, term54856.getClass(), "pgnHolder", null);
        setField(term54839, term54839.getClass(), "event", term54856);
        setIntField(term54839, term54839.getClass(), "number", -1882480155);
        setField(term54838, term54838.getClass(), "round", term54839);
        setField(term54838, term54838.getClass(), "gameId", "AWYyZiNfsm");
        setField(term54838, term54838.getClass(), "date", "ITRRYiuDwH");
        setField(term54838, term54838.getClass(), "time", "llRfwANcVF");
        setField(term54838, term54838.getClass(), "termination", enum164);
        setField(term54838, term54838.getClass(), "whitePlayer", null);
        setField(term54838, term54838.getClass(), "blackPlayer", null);
        setField(term54838, term54838.getClass(), "annotator", null);
        setField(term54838, term54838.getClass(), "plyCount", null);
        setField(term54838, term54838.getClass(), "result", null);
        setField(term54838, term54838.getClass(), "halfMoves", null);
        setField(term54838, term54838.getClass(), "variations", null);
        setField(term54838, term54838.getClass(), "comments", null);
        setField(term54838, term54838.getClass(), "nag", null);
        setField(term54838, term54838.getClass(), "property", null);
        setField(term54838, term54838.getClass(), "fen", null);
        setField(term54838, term54838.getClass(), "board", null);
        setIntField(term54838, term54838.getClass(), "position", 0);
        setIntField(term54838, term54838.getClass(), "initialPosition", 0);
        setField(term54838, term54838.getClass(), "currentMoveList", null);
        setField(term54838, term54838.getClass(), "eco", null);
        setField(term54838, term54838.getClass(), "moveText", null);
        setField(term54838, term54838.getClass(), "opening", null);
        setField(term54838, term54838.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTime", argTypes, term54838, args);
    }

};


