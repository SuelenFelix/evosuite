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

public class Board_placePawn_150675881752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23478;
     Object term23485;
     Object term23487;

    public Board_placePawn_150675881752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23478 = newInstance(Class.forName("game.Board"));
        setField(term23478, term23478.getClass(), "pieces", null);
        setField(term23478, term23478.getClass(), "playerPieces", null);
        setField(term23478, term23478.getClass(), "moves", null);
        setField(term23478, term23478.getClass(), "guards", null);
        setField(term23478, term23478.getClass(), "moveList", null);
        setField(term23478, term23478.getClass(), "positions", null);
        setIntField(term23478, term23478.getClass(), "positionIndex", 0);
        setField(term23478, term23478.getClass(), "canCastle", null);
        setLongField(term23478, term23478.getClass(), "zobristHash", 0L);
        setField(term23478, term23478.getClass(), "playerToMove", null);
        setBooleanField(term23478, term23478.getClass(), "isThreeFoldRepetition", false);
        setIntField(term23478, term23478.getClass(), "halfMoves", 0);
        setBooleanField(term23478, term23478.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term23478, term23478.getClass(), "inCheck", false);
        setField(term23478, term23478.getClass(), "previousMove", null);
        setField(term23478, term23478.getClass(), "kings", null);
        term23485 = new Integer(0);
        term23487 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("commons.Color");
        Object[] args = new Object[3];
        args[0] = term23485;
        args[1] = term23487;
        args[2] = null;
        callMethod(klass, "placePawn", argTypes, term23478, args);
    }

};


