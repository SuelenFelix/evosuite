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

public class Game_setBlackPlayer_129425546012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57956;

    public Game_setBlackPlayer_129425546012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term57960 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term57960, term57960.getClass(), "round", null);
        setField(term57960, term57960.getClass(), "gameId", null);
        setField(term57960, term57960.getClass(), "date", null);
        setField(term57960, term57960.getClass(), "time", null);
        setField(term57960, term57960.getClass(), "termination", null);
        setField(term57960, term57960.getClass(), "whitePlayer", null);
        setField(term57960, term57960.getClass(), "blackPlayer", null);
        setField(term57960, term57960.getClass(), "annotator", null);
        setField(term57960, term57960.getClass(), "plyCount", null);
        setField(term57960, term57960.getClass(), "result", null);
        setField(term57960, term57960.getClass(), "halfMoves", null);
        setField(term57960, term57960.getClass(), "variations", null);
        setField(term57960, term57960.getClass(), "comments", null);
        setField(term57960, term57960.getClass(), "nag", null);
        setField(term57960, term57960.getClass(), "property", null);
        setField(term57960, term57960.getClass(), "fen", null);
        setField(term57960, term57960.getClass(), "board", null);
        setIntField(term57960, term57960.getClass(), "position", 0);
        setIntField(term57960, term57960.getClass(), "initialPosition", 0);
        setField(term57960, term57960.getClass(), "currentMoveList", null);
        setField(term57960, term57960.getClass(), "eco", null);
        setField(term57960, term57960.getClass(), "moveText", null);
        setField(term57960, term57960.getClass(), "opening", null);
        setField(term57960, term57960.getClass(), "variation", null);
        Object term57963 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term57963, term57963.getClass(), "round", null);
        setField(term57963, term57963.getClass(), "gameId", null);
        setField(term57963, term57963.getClass(), "date", null);
        setField(term57963, term57963.getClass(), "time", null);
        setField(term57963, term57963.getClass(), "termination", null);
        setField(term57963, term57963.getClass(), "whitePlayer", null);
        setField(term57963, term57963.getClass(), "blackPlayer", null);
        setField(term57963, term57963.getClass(), "annotator", null);
        setField(term57963, term57963.getClass(), "plyCount", null);
        setField(term57963, term57963.getClass(), "result", null);
        setField(term57963, term57963.getClass(), "halfMoves", null);
        setField(term57963, term57963.getClass(), "variations", null);
        setField(term57963, term57963.getClass(), "comments", null);
        setField(term57963, term57963.getClass(), "nag", null);
        setField(term57963, term57963.getClass(), "property", null);
        setField(term57963, term57963.getClass(), "fen", null);
        setField(term57963, term57963.getClass(), "board", null);
        setIntField(term57963, term57963.getClass(), "position", 0);
        setIntField(term57963, term57963.getClass(), "initialPosition", 0);
        setField(term57963, term57963.getClass(), "currentMoveList", null);
        setField(term57963, term57963.getClass(), "eco", null);
        setField(term57963, term57963.getClass(), "moveText", null);
        setField(term57963, term57963.getClass(), "opening", null);
        setField(term57963, term57963.getClass(), "variation", null);
        Object term57966 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term57966, term57966.getClass(), "round", null);
        setField(term57966, term57966.getClass(), "gameId", null);
        setField(term57966, term57966.getClass(), "date", null);
        setField(term57966, term57966.getClass(), "time", null);
        setField(term57966, term57966.getClass(), "termination", null);
        setField(term57966, term57966.getClass(), "whitePlayer", null);
        setField(term57966, term57966.getClass(), "blackPlayer", null);
        setField(term57966, term57966.getClass(), "annotator", null);
        setField(term57966, term57966.getClass(), "plyCount", null);
        setField(term57966, term57966.getClass(), "result", null);
        setField(term57966, term57966.getClass(), "halfMoves", null);
        setField(term57966, term57966.getClass(), "variations", null);
        setField(term57966, term57966.getClass(), "comments", null);
        setField(term57966, term57966.getClass(), "nag", null);
        setField(term57966, term57966.getClass(), "property", null);
        setField(term57966, term57966.getClass(), "fen", null);
        setField(term57966, term57966.getClass(), "board", null);
        setIntField(term57966, term57966.getClass(), "position", 0);
        setIntField(term57966, term57966.getClass(), "initialPosition", 0);
        setField(term57966, term57966.getClass(), "currentMoveList", null);
        setField(term57966, term57966.getClass(), "eco", null);
        setField(term57966, term57966.getClass(), "moveText", null);
        setField(term57966, term57966.getClass(), "opening", null);
        setField(term57966, term57966.getClass(), "variation", null);
        ArrayList term57958 = new ArrayList();
        ((ArrayList) term57958).add(term57960);
        ((ArrayList) term57958).add(term57963);
        ((ArrayList) term57958).add(term57966);
        HashMap term57972 = new HashMap();
        Class<? extends Object> term58073 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.Termination");
        Field term58072 = ((Class) term58073).getDeclaredField((String) "ABANDONED");
        ((Field) term58072).setAccessible(true);
        Object enum172 = ((Field) term58072).get((Object) null);
        term57956 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        Object term57957 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        Object term57971 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term57957, term57957.getClass(), "game", term57958);
        setField(term57971, term57971.getClass(), "round", term57972);
        setField(term57971, term57971.getClass(), "id", null);
        setField(term57971, term57971.getClass(), "name", null);
        setField(term57971, term57971.getClass(), "eventType", null);
        setField(term57971, term57971.getClass(), "startDate", null);
        setField(term57971, term57971.getClass(), "endDate", null);
        setField(term57971, term57971.getClass(), "site", null);
        setLongField(term57971, term57971.getClass(), "timestamp", 0L);
        setIntField(term57971, term57971.getClass(), "rounds", 0);
        setField(term57971, term57971.getClass(), "timeControl", null);
        setField(term57971, term57971.getClass(), "timeControl2", null);
        setField(term57971, term57971.getClass(), "pgnHolder", null);
        setField(term57957, term57957.getClass(), "event", term57971);
        setIntField(term57957, term57957.getClass(), "number", 477625804);
        setField(term57956, term57956.getClass(), "round", term57957);
        setField(term57956, term57956.getClass(), "gameId", "BXTjEyEZxD");
        setField(term57956, term57956.getClass(), "date", "oKhVzOKUFW");
        setField(term57956, term57956.getClass(), "time", "mNHyqmOAFy");
        setField(term57956, term57956.getClass(), "termination", enum172);
        setField(term57956, term57956.getClass(), "whitePlayer", null);
        setField(term57956, term57956.getClass(), "blackPlayer", null);
        setField(term57956, term57956.getClass(), "annotator", null);
        setField(term57956, term57956.getClass(), "plyCount", null);
        setField(term57956, term57956.getClass(), "result", null);
        setField(term57956, term57956.getClass(), "halfMoves", null);
        setField(term57956, term57956.getClass(), "variations", null);
        setField(term57956, term57956.getClass(), "comments", null);
        setField(term57956, term57956.getClass(), "nag", null);
        setField(term57956, term57956.getClass(), "property", null);
        setField(term57956, term57956.getClass(), "fen", null);
        setField(term57956, term57956.getClass(), "board", null);
        setIntField(term57956, term57956.getClass(), "position", 0);
        setIntField(term57956, term57956.getClass(), "initialPosition", 0);
        setField(term57956, term57956.getClass(), "currentMoveList", null);
        setField(term57956, term57956.getClass(), "eco", null);
        setField(term57956, term57956.getClass(), "moveText", null);
        setField(term57956, term57956.getClass(), "opening", null);
        setField(term57956, term57956.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.game.Player");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBlackPlayer", argTypes, term57956, args);
    }

};


