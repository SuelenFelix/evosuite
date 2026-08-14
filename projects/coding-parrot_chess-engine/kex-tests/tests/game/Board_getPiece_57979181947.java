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
import java.lang.Integer;

public class Board_getPiece_57979181947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23439;
     Object term23446;
     Object term23448;

    public Board_getPiece_57979181947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23439 = newInstance(Class.forName("game.Board"));
        setField(term23439, term23439.getClass(), "pieces", null);
        setField(term23439, term23439.getClass(), "playerPieces", null);
        setField(term23439, term23439.getClass(), "moves", null);
        setField(term23439, term23439.getClass(), "guards", null);
        setField(term23439, term23439.getClass(), "moveList", null);
        setField(term23439, term23439.getClass(), "positions", null);
        setIntField(term23439, term23439.getClass(), "positionIndex", 0);
        setField(term23439, term23439.getClass(), "canCastle", null);
        setLongField(term23439, term23439.getClass(), "zobristHash", 0L);
        setField(term23439, term23439.getClass(), "playerToMove", null);
        setBooleanField(term23439, term23439.getClass(), "isThreeFoldRepetition", false);
        setIntField(term23439, term23439.getClass(), "halfMoves", 0);
        setBooleanField(term23439, term23439.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term23439, term23439.getClass(), "inCheck", false);
        setField(term23439, term23439.getClass(), "previousMove", null);
        setField(term23439, term23439.getClass(), "kings", null);
        term23446 = new Integer(0);
        term23448 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term23446;
        args[1] = term23448;
        callMethod(klass, "getPiece", argTypes, term23439, args);
    }

};


