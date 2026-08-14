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

public class Board_discoveredCheck_209626963085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23739;

    public Board_discoveredCheck_209626963085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23739 = newInstance(Class.forName("game.Board"));
        setField(term23739, term23739.getClass(), "pieces", null);
        setField(term23739, term23739.getClass(), "playerPieces", null);
        setField(term23739, term23739.getClass(), "moves", null);
        setField(term23739, term23739.getClass(), "guards", null);
        setField(term23739, term23739.getClass(), "moveList", null);
        setField(term23739, term23739.getClass(), "positions", null);
        setIntField(term23739, term23739.getClass(), "positionIndex", 0);
        setField(term23739, term23739.getClass(), "canCastle", null);
        setLongField(term23739, term23739.getClass(), "zobristHash", 0L);
        setField(term23739, term23739.getClass(), "playerToMove", null);
        setBooleanField(term23739, term23739.getClass(), "isThreeFoldRepetition", false);
        setIntField(term23739, term23739.getClass(), "halfMoves", 0);
        setBooleanField(term23739, term23739.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term23739, term23739.getClass(), "inCheck", false);
        setField(term23739, term23739.getClass(), "previousMove", null);
        setField(term23739, term23739.getClass(), "kings", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("commons.Piece");
        argTypes[1] = Class.forName("game.Cell");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "discoveredCheck", argTypes, term23739, args);
    }

};


