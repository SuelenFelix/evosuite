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

public class Board_getMovesWithinPin_19333733460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23558;

    public Board_getMovesWithinPin_19333733460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23558 = newInstance(Class.forName("game.Board"));
        setField(term23558, term23558.getClass(), "pieces", null);
        setField(term23558, term23558.getClass(), "playerPieces", null);
        setField(term23558, term23558.getClass(), "moves", null);
        setField(term23558, term23558.getClass(), "guards", null);
        setField(term23558, term23558.getClass(), "moveList", null);
        setField(term23558, term23558.getClass(), "positions", null);
        setIntField(term23558, term23558.getClass(), "positionIndex", 0);
        setField(term23558, term23558.getClass(), "canCastle", null);
        setLongField(term23558, term23558.getClass(), "zobristHash", 0L);
        setField(term23558, term23558.getClass(), "playerToMove", null);
        setBooleanField(term23558, term23558.getClass(), "isThreeFoldRepetition", false);
        setIntField(term23558, term23558.getClass(), "halfMoves", 0);
        setBooleanField(term23558, term23558.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term23558, term23558.getClass(), "inCheck", false);
        setField(term23558, term23558.getClass(), "previousMove", null);
        setField(term23558, term23558.getClass(), "kings", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map$Entry");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getMovesWithinPin", argTypes, term23558, args);
    }

};


