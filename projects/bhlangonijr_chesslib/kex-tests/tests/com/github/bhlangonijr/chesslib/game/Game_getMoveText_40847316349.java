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

public class Game_getMoveText_40847316349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92602;

    public Game_getMoveText_40847316349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term92606 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term92606, term92606.getClass(), "round", null);
        setField(term92606, term92606.getClass(), "gameId", null);
        setField(term92606, term92606.getClass(), "date", null);
        setField(term92606, term92606.getClass(), "time", null);
        setField(term92606, term92606.getClass(), "termination", null);
        setField(term92606, term92606.getClass(), "whitePlayer", null);
        setField(term92606, term92606.getClass(), "blackPlayer", null);
        setField(term92606, term92606.getClass(), "annotator", null);
        setField(term92606, term92606.getClass(), "plyCount", null);
        setField(term92606, term92606.getClass(), "result", null);
        setField(term92606, term92606.getClass(), "halfMoves", null);
        setField(term92606, term92606.getClass(), "variations", null);
        setField(term92606, term92606.getClass(), "comments", null);
        setField(term92606, term92606.getClass(), "nag", null);
        setField(term92606, term92606.getClass(), "property", null);
        setField(term92606, term92606.getClass(), "fen", null);
        setField(term92606, term92606.getClass(), "board", null);
        setIntField(term92606, term92606.getClass(), "position", 0);
        setIntField(term92606, term92606.getClass(), "initialPosition", 0);
        setField(term92606, term92606.getClass(), "currentMoveList", null);
        setField(term92606, term92606.getClass(), "eco", null);
        setField(term92606, term92606.getClass(), "moveText", null);
        setField(term92606, term92606.getClass(), "opening", null);
        setField(term92606, term92606.getClass(), "variation", null);
        Object term92609 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term92609, term92609.getClass(), "round", null);
        setField(term92609, term92609.getClass(), "gameId", null);
        setField(term92609, term92609.getClass(), "date", null);
        setField(term92609, term92609.getClass(), "time", null);
        setField(term92609, term92609.getClass(), "termination", null);
        setField(term92609, term92609.getClass(), "whitePlayer", null);
        setField(term92609, term92609.getClass(), "blackPlayer", null);
        setField(term92609, term92609.getClass(), "annotator", null);
        setField(term92609, term92609.getClass(), "plyCount", null);
        setField(term92609, term92609.getClass(), "result", null);
        setField(term92609, term92609.getClass(), "halfMoves", null);
        setField(term92609, term92609.getClass(), "variations", null);
        setField(term92609, term92609.getClass(), "comments", null);
        setField(term92609, term92609.getClass(), "nag", null);
        setField(term92609, term92609.getClass(), "property", null);
        setField(term92609, term92609.getClass(), "fen", null);
        setField(term92609, term92609.getClass(), "board", null);
        setIntField(term92609, term92609.getClass(), "position", 0);
        setIntField(term92609, term92609.getClass(), "initialPosition", 0);
        setField(term92609, term92609.getClass(), "currentMoveList", null);
        setField(term92609, term92609.getClass(), "eco", null);
        setField(term92609, term92609.getClass(), "moveText", null);
        setField(term92609, term92609.getClass(), "opening", null);
        setField(term92609, term92609.getClass(), "variation", null);
        ArrayList term92604 = new ArrayList();
        ((ArrayList) term92604).add(term92606);
        ((ArrayList) term92604).add(term92609);
        HashMap term92615 = new HashMap();
        Class<? extends Object> term92722 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.Termination");
        Field term92721 = ((Class) term92722).getDeclaredField((String) "TIME_FORFEIT");
        ((Field) term92721).setAccessible(true);
        Object enum287 = ((Field) term92721).get((Object) null);
        term92602 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        Object term92603 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        Object term92614 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term92603, term92603.getClass(), "game", term92604);
        setField(term92614, term92614.getClass(), "round", term92615);
        setField(term92614, term92614.getClass(), "id", null);
        setField(term92614, term92614.getClass(), "name", null);
        setField(term92614, term92614.getClass(), "eventType", null);
        setField(term92614, term92614.getClass(), "startDate", null);
        setField(term92614, term92614.getClass(), "endDate", null);
        setField(term92614, term92614.getClass(), "site", null);
        setLongField(term92614, term92614.getClass(), "timestamp", 0L);
        setIntField(term92614, term92614.getClass(), "rounds", 0);
        setField(term92614, term92614.getClass(), "timeControl", null);
        setField(term92614, term92614.getClass(), "timeControl2", null);
        setField(term92614, term92614.getClass(), "pgnHolder", null);
        setField(term92603, term92603.getClass(), "event", term92614);
        setIntField(term92603, term92603.getClass(), "number", 1048451946);
        setField(term92602, term92602.getClass(), "round", term92603);
        setField(term92602, term92602.getClass(), "gameId", "jpgWRbSvyQ");
        setField(term92602, term92602.getClass(), "date", "tFMlYmPEBX");
        setField(term92602, term92602.getClass(), "time", "ljkZxGNgjZ");
        setField(term92602, term92602.getClass(), "termination", enum287);
        setField(term92602, term92602.getClass(), "whitePlayer", null);
        setField(term92602, term92602.getClass(), "blackPlayer", null);
        setField(term92602, term92602.getClass(), "annotator", null);
        setField(term92602, term92602.getClass(), "plyCount", null);
        setField(term92602, term92602.getClass(), "result", null);
        setField(term92602, term92602.getClass(), "halfMoves", null);
        setField(term92602, term92602.getClass(), "variations", null);
        setField(term92602, term92602.getClass(), "comments", null);
        setField(term92602, term92602.getClass(), "nag", null);
        setField(term92602, term92602.getClass(), "property", null);
        setField(term92602, term92602.getClass(), "fen", null);
        setField(term92602, term92602.getClass(), "board", null);
        setIntField(term92602, term92602.getClass(), "position", 0);
        setIntField(term92602, term92602.getClass(), "initialPosition", 0);
        setField(term92602, term92602.getClass(), "currentMoveList", null);
        setField(term92602, term92602.getClass(), "eco", null);
        setField(term92602, term92602.getClass(), "moveText", null);
        setField(term92602, term92602.getClass(), "opening", null);
        setField(term92602, term92602.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMoveText", argTypes, term92602, args);
    }

};


