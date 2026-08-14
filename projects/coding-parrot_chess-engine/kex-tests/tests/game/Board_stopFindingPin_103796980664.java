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

public class Board_stopFindingPin_103796980664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23586;
     Object term23593;
     Object term23595;

    public Board_stopFindingPin_103796980664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23586 = newInstance(Class.forName("game.Board"));
        setField(term23586, term23586.getClass(), "pieces", null);
        setField(term23586, term23586.getClass(), "playerPieces", null);
        setField(term23586, term23586.getClass(), "moves", null);
        setField(term23586, term23586.getClass(), "guards", null);
        setField(term23586, term23586.getClass(), "moveList", null);
        setField(term23586, term23586.getClass(), "positions", null);
        setIntField(term23586, term23586.getClass(), "positionIndex", 0);
        setField(term23586, term23586.getClass(), "canCastle", null);
        setLongField(term23586, term23586.getClass(), "zobristHash", 0L);
        setField(term23586, term23586.getClass(), "playerToMove", null);
        setBooleanField(term23586, term23586.getClass(), "isThreeFoldRepetition", false);
        setIntField(term23586, term23586.getClass(), "halfMoves", 0);
        setBooleanField(term23586, term23586.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term23586, term23586.getClass(), "inCheck", false);
        setField(term23586, term23586.getClass(), "previousMove", null);
        setField(term23586, term23586.getClass(), "kings", null);
        term23593 = new Integer(0);
        term23595 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("commons.Color");
        argTypes[3] = Class.forName("game.Board$Reference");
        argTypes[4] = Class.forName("java.util.Map");
        argTypes[5] = Array.newInstance(Class.forName("pieces.PieceType"), 0).getClass();
        Object[] args = new Object[6];
        args[0] = term23593;
        args[1] = term23595;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        callMethod(klass, "stopFindingPin", argTypes, term23586, args);
    }

};


