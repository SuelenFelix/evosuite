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

public class Game_setAnnotator_83795141414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58757;

    public Game_setAnnotator_83795141414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term58761 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term58761, term58761.getClass(), "round", null);
        setField(term58761, term58761.getClass(), "gameId", null);
        setField(term58761, term58761.getClass(), "date", null);
        setField(term58761, term58761.getClass(), "time", null);
        setField(term58761, term58761.getClass(), "termination", null);
        setField(term58761, term58761.getClass(), "whitePlayer", null);
        setField(term58761, term58761.getClass(), "blackPlayer", null);
        setField(term58761, term58761.getClass(), "annotator", null);
        setField(term58761, term58761.getClass(), "plyCount", null);
        setField(term58761, term58761.getClass(), "result", null);
        setField(term58761, term58761.getClass(), "halfMoves", null);
        setField(term58761, term58761.getClass(), "variations", null);
        setField(term58761, term58761.getClass(), "comments", null);
        setField(term58761, term58761.getClass(), "nag", null);
        setField(term58761, term58761.getClass(), "property", null);
        setField(term58761, term58761.getClass(), "fen", null);
        setField(term58761, term58761.getClass(), "board", null);
        setIntField(term58761, term58761.getClass(), "position", 0);
        setIntField(term58761, term58761.getClass(), "initialPosition", 0);
        setField(term58761, term58761.getClass(), "currentMoveList", null);
        setField(term58761, term58761.getClass(), "eco", null);
        setField(term58761, term58761.getClass(), "moveText", null);
        setField(term58761, term58761.getClass(), "opening", null);
        setField(term58761, term58761.getClass(), "variation", null);
        Object term58764 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term58764, term58764.getClass(), "round", null);
        setField(term58764, term58764.getClass(), "gameId", null);
        setField(term58764, term58764.getClass(), "date", null);
        setField(term58764, term58764.getClass(), "time", null);
        setField(term58764, term58764.getClass(), "termination", null);
        setField(term58764, term58764.getClass(), "whitePlayer", null);
        setField(term58764, term58764.getClass(), "blackPlayer", null);
        setField(term58764, term58764.getClass(), "annotator", null);
        setField(term58764, term58764.getClass(), "plyCount", null);
        setField(term58764, term58764.getClass(), "result", null);
        setField(term58764, term58764.getClass(), "halfMoves", null);
        setField(term58764, term58764.getClass(), "variations", null);
        setField(term58764, term58764.getClass(), "comments", null);
        setField(term58764, term58764.getClass(), "nag", null);
        setField(term58764, term58764.getClass(), "property", null);
        setField(term58764, term58764.getClass(), "fen", null);
        setField(term58764, term58764.getClass(), "board", null);
        setIntField(term58764, term58764.getClass(), "position", 0);
        setIntField(term58764, term58764.getClass(), "initialPosition", 0);
        setField(term58764, term58764.getClass(), "currentMoveList", null);
        setField(term58764, term58764.getClass(), "eco", null);
        setField(term58764, term58764.getClass(), "moveText", null);
        setField(term58764, term58764.getClass(), "opening", null);
        setField(term58764, term58764.getClass(), "variation", null);
        Object term58767 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term58767, term58767.getClass(), "round", null);
        setField(term58767, term58767.getClass(), "gameId", null);
        setField(term58767, term58767.getClass(), "date", null);
        setField(term58767, term58767.getClass(), "time", null);
        setField(term58767, term58767.getClass(), "termination", null);
        setField(term58767, term58767.getClass(), "whitePlayer", null);
        setField(term58767, term58767.getClass(), "blackPlayer", null);
        setField(term58767, term58767.getClass(), "annotator", null);
        setField(term58767, term58767.getClass(), "plyCount", null);
        setField(term58767, term58767.getClass(), "result", null);
        setField(term58767, term58767.getClass(), "halfMoves", null);
        setField(term58767, term58767.getClass(), "variations", null);
        setField(term58767, term58767.getClass(), "comments", null);
        setField(term58767, term58767.getClass(), "nag", null);
        setField(term58767, term58767.getClass(), "property", null);
        setField(term58767, term58767.getClass(), "fen", null);
        setField(term58767, term58767.getClass(), "board", null);
        setIntField(term58767, term58767.getClass(), "position", 0);
        setIntField(term58767, term58767.getClass(), "initialPosition", 0);
        setField(term58767, term58767.getClass(), "currentMoveList", null);
        setField(term58767, term58767.getClass(), "eco", null);
        setField(term58767, term58767.getClass(), "moveText", null);
        setField(term58767, term58767.getClass(), "opening", null);
        setField(term58767, term58767.getClass(), "variation", null);
        Object term58770 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term58770, term58770.getClass(), "round", null);
        setField(term58770, term58770.getClass(), "gameId", null);
        setField(term58770, term58770.getClass(), "date", null);
        setField(term58770, term58770.getClass(), "time", null);
        setField(term58770, term58770.getClass(), "termination", null);
        setField(term58770, term58770.getClass(), "whitePlayer", null);
        setField(term58770, term58770.getClass(), "blackPlayer", null);
        setField(term58770, term58770.getClass(), "annotator", null);
        setField(term58770, term58770.getClass(), "plyCount", null);
        setField(term58770, term58770.getClass(), "result", null);
        setField(term58770, term58770.getClass(), "halfMoves", null);
        setField(term58770, term58770.getClass(), "variations", null);
        setField(term58770, term58770.getClass(), "comments", null);
        setField(term58770, term58770.getClass(), "nag", null);
        setField(term58770, term58770.getClass(), "property", null);
        setField(term58770, term58770.getClass(), "fen", null);
        setField(term58770, term58770.getClass(), "board", null);
        setIntField(term58770, term58770.getClass(), "position", 0);
        setIntField(term58770, term58770.getClass(), "initialPosition", 0);
        setField(term58770, term58770.getClass(), "currentMoveList", null);
        setField(term58770, term58770.getClass(), "eco", null);
        setField(term58770, term58770.getClass(), "moveText", null);
        setField(term58770, term58770.getClass(), "opening", null);
        setField(term58770, term58770.getClass(), "variation", null);
        ArrayList term58759 = new ArrayList();
        ((ArrayList) term58759).add(term58761);
        ((ArrayList) term58759).add(term58761);
        ((ArrayList) term58759).add(term58764);
        ((ArrayList) term58759).add(term58767);
        ((ArrayList) term58759).add(term58767);
        ((ArrayList) term58759).add(term58770);
        HashMap term58776 = new HashMap();
        Class<? extends Object> term58889 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.Termination");
        Field term58888 = ((Class) term58889).getDeclaredField((String) "EMERGENCY");
        ((Field) term58888).setAccessible(true);
        Object enum174 = ((Field) term58888).get((Object) null);
        term58757 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        Object term58758 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        Object term58775 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term58758, term58758.getClass(), "game", term58759);
        setField(term58775, term58775.getClass(), "round", term58776);
        setField(term58775, term58775.getClass(), "id", null);
        setField(term58775, term58775.getClass(), "name", null);
        setField(term58775, term58775.getClass(), "eventType", null);
        setField(term58775, term58775.getClass(), "startDate", null);
        setField(term58775, term58775.getClass(), "endDate", null);
        setField(term58775, term58775.getClass(), "site", null);
        setLongField(term58775, term58775.getClass(), "timestamp", 0L);
        setIntField(term58775, term58775.getClass(), "rounds", 0);
        setField(term58775, term58775.getClass(), "timeControl", null);
        setField(term58775, term58775.getClass(), "timeControl2", null);
        setField(term58775, term58775.getClass(), "pgnHolder", null);
        setField(term58758, term58758.getClass(), "event", term58775);
        setIntField(term58758, term58758.getClass(), "number", -1183353915);
        setField(term58757, term58757.getClass(), "round", term58758);
        setField(term58757, term58757.getClass(), "gameId", "uzmqjnOUXu");
        setField(term58757, term58757.getClass(), "date", "xeyjTOCOJb");
        setField(term58757, term58757.getClass(), "time", "DGRqjjdhzy");
        setField(term58757, term58757.getClass(), "termination", enum174);
        setField(term58757, term58757.getClass(), "whitePlayer", null);
        setField(term58757, term58757.getClass(), "blackPlayer", null);
        setField(term58757, term58757.getClass(), "annotator", null);
        setField(term58757, term58757.getClass(), "plyCount", null);
        setField(term58757, term58757.getClass(), "result", null);
        setField(term58757, term58757.getClass(), "halfMoves", null);
        setField(term58757, term58757.getClass(), "variations", null);
        setField(term58757, term58757.getClass(), "comments", null);
        setField(term58757, term58757.getClass(), "nag", null);
        setField(term58757, term58757.getClass(), "property", null);
        setField(term58757, term58757.getClass(), "fen", null);
        setField(term58757, term58757.getClass(), "board", null);
        setIntField(term58757, term58757.getClass(), "position", 0);
        setIntField(term58757, term58757.getClass(), "initialPosition", 0);
        setField(term58757, term58757.getClass(), "currentMoveList", null);
        setField(term58757, term58757.getClass(), "eco", null);
        setField(term58757, term58757.getClass(), "moveText", null);
        setField(term58757, term58757.getClass(), "opening", null);
        setField(term58757, term58757.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lQFkjJUPAR";
        callMethod(klass, "setAnnotator", argTypes, term58757, args);
    }

};


