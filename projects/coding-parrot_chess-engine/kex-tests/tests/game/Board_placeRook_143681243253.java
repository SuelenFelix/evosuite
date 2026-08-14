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

public class Board_placeRook_143681243253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23489;
     Object term23496;
     Object term23498;

    public Board_placeRook_143681243253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23489 = newInstance(Class.forName("game.Board"));
        setField(term23489, term23489.getClass(), "pieces", null);
        setField(term23489, term23489.getClass(), "playerPieces", null);
        setField(term23489, term23489.getClass(), "moves", null);
        setField(term23489, term23489.getClass(), "guards", null);
        setField(term23489, term23489.getClass(), "moveList", null);
        setField(term23489, term23489.getClass(), "positions", null);
        setIntField(term23489, term23489.getClass(), "positionIndex", 0);
        setField(term23489, term23489.getClass(), "canCastle", null);
        setLongField(term23489, term23489.getClass(), "zobristHash", 0L);
        setField(term23489, term23489.getClass(), "playerToMove", null);
        setBooleanField(term23489, term23489.getClass(), "isThreeFoldRepetition", false);
        setIntField(term23489, term23489.getClass(), "halfMoves", 0);
        setBooleanField(term23489, term23489.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term23489, term23489.getClass(), "inCheck", false);
        setField(term23489, term23489.getClass(), "previousMove", null);
        setField(term23489, term23489.getClass(), "kings", null);
        term23496 = new Integer(0);
        term23498 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("commons.Color");
        Object[] args = new Object[3];
        args[0] = term23496;
        args[1] = term23498;
        args[2] = null;
        callMethod(klass, "placeRook", argTypes, term23489, args);
    }

};


