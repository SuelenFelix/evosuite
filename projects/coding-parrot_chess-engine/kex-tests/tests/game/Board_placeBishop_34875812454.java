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

public class Board_placeBishop_34875812454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23500;
     Object term23507;
     Object term23509;

    public Board_placeBishop_34875812454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23500 = newInstance(Class.forName("game.Board"));
        setField(term23500, term23500.getClass(), "pieces", null);
        setField(term23500, term23500.getClass(), "playerPieces", null);
        setField(term23500, term23500.getClass(), "moves", null);
        setField(term23500, term23500.getClass(), "guards", null);
        setField(term23500, term23500.getClass(), "moveList", null);
        setField(term23500, term23500.getClass(), "positions", null);
        setIntField(term23500, term23500.getClass(), "positionIndex", 0);
        setField(term23500, term23500.getClass(), "canCastle", null);
        setLongField(term23500, term23500.getClass(), "zobristHash", 0L);
        setField(term23500, term23500.getClass(), "playerToMove", null);
        setBooleanField(term23500, term23500.getClass(), "isThreeFoldRepetition", false);
        setIntField(term23500, term23500.getClass(), "halfMoves", 0);
        setBooleanField(term23500, term23500.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term23500, term23500.getClass(), "inCheck", false);
        setField(term23500, term23500.getClass(), "previousMove", null);
        setField(term23500, term23500.getClass(), "kings", null);
        term23507 = new Integer(0);
        term23509 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("commons.Color");
        Object[] args = new Object[3];
        args[0] = term23507;
        args[1] = term23509;
        args[2] = null;
        callMethod(klass, "placeBishop", argTypes, term23500, args);
    }

};


