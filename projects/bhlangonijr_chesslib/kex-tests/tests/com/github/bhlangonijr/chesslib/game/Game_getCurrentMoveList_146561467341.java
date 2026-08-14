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

public class Game_getCurrentMoveList_146561467341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89767;

    public Game_getCurrentMoveList_146561467341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term89771 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term89771, term89771.getClass(), "round", null);
        setField(term89771, term89771.getClass(), "gameId", null);
        setField(term89771, term89771.getClass(), "date", null);
        setField(term89771, term89771.getClass(), "time", null);
        setField(term89771, term89771.getClass(), "termination", null);
        setField(term89771, term89771.getClass(), "whitePlayer", null);
        setField(term89771, term89771.getClass(), "blackPlayer", null);
        setField(term89771, term89771.getClass(), "annotator", null);
        setField(term89771, term89771.getClass(), "plyCount", null);
        setField(term89771, term89771.getClass(), "result", null);
        setField(term89771, term89771.getClass(), "halfMoves", null);
        setField(term89771, term89771.getClass(), "variations", null);
        setField(term89771, term89771.getClass(), "comments", null);
        setField(term89771, term89771.getClass(), "nag", null);
        setField(term89771, term89771.getClass(), "property", null);
        setField(term89771, term89771.getClass(), "fen", null);
        setField(term89771, term89771.getClass(), "board", null);
        setIntField(term89771, term89771.getClass(), "position", 0);
        setIntField(term89771, term89771.getClass(), "initialPosition", 0);
        setField(term89771, term89771.getClass(), "currentMoveList", null);
        setField(term89771, term89771.getClass(), "eco", null);
        setField(term89771, term89771.getClass(), "moveText", null);
        setField(term89771, term89771.getClass(), "opening", null);
        setField(term89771, term89771.getClass(), "variation", null);
        Object term89774 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term89774, term89774.getClass(), "round", null);
        setField(term89774, term89774.getClass(), "gameId", null);
        setField(term89774, term89774.getClass(), "date", null);
        setField(term89774, term89774.getClass(), "time", null);
        setField(term89774, term89774.getClass(), "termination", null);
        setField(term89774, term89774.getClass(), "whitePlayer", null);
        setField(term89774, term89774.getClass(), "blackPlayer", null);
        setField(term89774, term89774.getClass(), "annotator", null);
        setField(term89774, term89774.getClass(), "plyCount", null);
        setField(term89774, term89774.getClass(), "result", null);
        setField(term89774, term89774.getClass(), "halfMoves", null);
        setField(term89774, term89774.getClass(), "variations", null);
        setField(term89774, term89774.getClass(), "comments", null);
        setField(term89774, term89774.getClass(), "nag", null);
        setField(term89774, term89774.getClass(), "property", null);
        setField(term89774, term89774.getClass(), "fen", null);
        setField(term89774, term89774.getClass(), "board", null);
        setIntField(term89774, term89774.getClass(), "position", 0);
        setIntField(term89774, term89774.getClass(), "initialPosition", 0);
        setField(term89774, term89774.getClass(), "currentMoveList", null);
        setField(term89774, term89774.getClass(), "eco", null);
        setField(term89774, term89774.getClass(), "moveText", null);
        setField(term89774, term89774.getClass(), "opening", null);
        setField(term89774, term89774.getClass(), "variation", null);
        ArrayList term89769 = new ArrayList();
        ((ArrayList) term89769).add(term89771);
        ((ArrayList) term89769).add(term89771);
        ((ArrayList) term89769).add(term89771);
        ((ArrayList) term89769).add(term89774);
        HashMap term89780 = new HashMap();
        Class<? extends Object> term89881 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.Termination");
        Field term89880 = ((Class) term89881).getDeclaredField((String) "EMERGENCY");
        ((Field) term89880).setAccessible(true);
        Object enum280 = ((Field) term89880).get((Object) null);
        term89767 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        Object term89768 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        Object term89779 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term89768, term89768.getClass(), "game", term89769);
        setField(term89779, term89779.getClass(), "round", term89780);
        setField(term89779, term89779.getClass(), "id", null);
        setField(term89779, term89779.getClass(), "name", null);
        setField(term89779, term89779.getClass(), "eventType", null);
        setField(term89779, term89779.getClass(), "startDate", null);
        setField(term89779, term89779.getClass(), "endDate", null);
        setField(term89779, term89779.getClass(), "site", null);
        setLongField(term89779, term89779.getClass(), "timestamp", 0L);
        setIntField(term89779, term89779.getClass(), "rounds", 0);
        setField(term89779, term89779.getClass(), "timeControl", null);
        setField(term89779, term89779.getClass(), "timeControl2", null);
        setField(term89779, term89779.getClass(), "pgnHolder", null);
        setField(term89768, term89768.getClass(), "event", term89779);
        setIntField(term89768, term89768.getClass(), "number", -1639041228);
        setField(term89767, term89767.getClass(), "round", term89768);
        setField(term89767, term89767.getClass(), "gameId", "ZWRAbOuktl");
        setField(term89767, term89767.getClass(), "date", "iqFRvFmVID");
        setField(term89767, term89767.getClass(), "time", "pNAEtppZdv");
        setField(term89767, term89767.getClass(), "termination", enum280);
        setField(term89767, term89767.getClass(), "whitePlayer", null);
        setField(term89767, term89767.getClass(), "blackPlayer", null);
        setField(term89767, term89767.getClass(), "annotator", null);
        setField(term89767, term89767.getClass(), "plyCount", null);
        setField(term89767, term89767.getClass(), "result", null);
        setField(term89767, term89767.getClass(), "halfMoves", null);
        setField(term89767, term89767.getClass(), "variations", null);
        setField(term89767, term89767.getClass(), "comments", null);
        setField(term89767, term89767.getClass(), "nag", null);
        setField(term89767, term89767.getClass(), "property", null);
        setField(term89767, term89767.getClass(), "fen", null);
        setField(term89767, term89767.getClass(), "board", null);
        setIntField(term89767, term89767.getClass(), "position", 0);
        setIntField(term89767, term89767.getClass(), "initialPosition", 0);
        setField(term89767, term89767.getClass(), "currentMoveList", null);
        setField(term89767, term89767.getClass(), "eco", null);
        setField(term89767, term89767.getClass(), "moveText", null);
        setField(term89767, term89767.getClass(), "opening", null);
        setField(term89767, term89767.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrentMoveList", argTypes, term89767, args);
    }

};


