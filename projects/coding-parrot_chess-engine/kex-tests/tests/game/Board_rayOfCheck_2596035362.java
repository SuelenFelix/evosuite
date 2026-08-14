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

public class Board_rayOfCheck_2596035362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23572;

    public Board_rayOfCheck_2596035362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23572 = newInstance(Class.forName("game.Board"));
        setField(term23572, term23572.getClass(), "pieces", null);
        setField(term23572, term23572.getClass(), "playerPieces", null);
        setField(term23572, term23572.getClass(), "moves", null);
        setField(term23572, term23572.getClass(), "guards", null);
        setField(term23572, term23572.getClass(), "moveList", null);
        setField(term23572, term23572.getClass(), "positions", null);
        setIntField(term23572, term23572.getClass(), "positionIndex", 0);
        setField(term23572, term23572.getClass(), "canCastle", null);
        setLongField(term23572, term23572.getClass(), "zobristHash", 0L);
        setField(term23572, term23572.getClass(), "playerToMove", null);
        setBooleanField(term23572, term23572.getClass(), "isThreeFoldRepetition", false);
        setIntField(term23572, term23572.getClass(), "halfMoves", 0);
        setBooleanField(term23572, term23572.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term23572, term23572.getClass(), "inCheck", false);
        setField(term23572, term23572.getClass(), "previousMove", null);
        setField(term23572, term23572.getClass(), "kings", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("commons.Piece");
        argTypes[1] = Class.forName("commons.Piece");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "rayOfCheck", argTypes, term23572, args);
    }

};


