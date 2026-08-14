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

public class Board_illegalEnPassant_130703943661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23565;

    public Board_illegalEnPassant_130703943661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23565 = newInstance(Class.forName("game.Board"));
        setField(term23565, term23565.getClass(), "pieces", null);
        setField(term23565, term23565.getClass(), "playerPieces", null);
        setField(term23565, term23565.getClass(), "moves", null);
        setField(term23565, term23565.getClass(), "guards", null);
        setField(term23565, term23565.getClass(), "moveList", null);
        setField(term23565, term23565.getClass(), "positions", null);
        setIntField(term23565, term23565.getClass(), "positionIndex", 0);
        setField(term23565, term23565.getClass(), "canCastle", null);
        setLongField(term23565, term23565.getClass(), "zobristHash", 0L);
        setField(term23565, term23565.getClass(), "playerToMove", null);
        setBooleanField(term23565, term23565.getClass(), "isThreeFoldRepetition", false);
        setIntField(term23565, term23565.getClass(), "halfMoves", 0);
        setBooleanField(term23565, term23565.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term23565, term23565.getClass(), "inCheck", false);
        setField(term23565, term23565.getClass(), "previousMove", null);
        setField(term23565, term23565.getClass(), "kings", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("game.Move");
        argTypes[1] = Class.forName("commons.Piece");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "illegalEnPassant", argTypes, term23565, args);
    }

};


