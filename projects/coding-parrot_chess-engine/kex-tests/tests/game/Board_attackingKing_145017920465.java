package game;

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
import static game.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Board_attackingKing_145017920465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23597;

    public Board_attackingKing_145017920465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23597 = newInstance(Class.forName("game.Board"));
        setField(term23597, term23597.getClass(), "pieces", null);
        setField(term23597, term23597.getClass(), "playerPieces", null);
        setField(term23597, term23597.getClass(), "moves", null);
        setField(term23597, term23597.getClass(), "guards", null);
        setField(term23597, term23597.getClass(), "moveList", null);
        setField(term23597, term23597.getClass(), "positions", null);
        setIntField(term23597, term23597.getClass(), "positionIndex", 0);
        setField(term23597, term23597.getClass(), "canCastle", null);
        setLongField(term23597, term23597.getClass(), "zobristHash", 0L);
        setField(term23597, term23597.getClass(), "playerToMove", null);
        setBooleanField(term23597, term23597.getClass(), "isThreeFoldRepetition", false);
        setIntField(term23597, term23597.getClass(), "halfMoves", 0);
        setBooleanField(term23597, term23597.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term23597, term23597.getClass(), "inCheck", false);
        setField(term23597, term23597.getClass(), "previousMove", null);
        setField(term23597, term23597.getClass(), "kings", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("commons.Piece");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "attackingKing", argTypes, term23597, args);
    }

};


