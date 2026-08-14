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

public class Board_makeMove_139383475568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23618;

    public Board_makeMove_139383475568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23618 = newInstance(Class.forName("game.Board"));
        setField(term23618, term23618.getClass(), "pieces", null);
        setField(term23618, term23618.getClass(), "playerPieces", null);
        setField(term23618, term23618.getClass(), "moves", null);
        setField(term23618, term23618.getClass(), "guards", null);
        setField(term23618, term23618.getClass(), "moveList", null);
        setField(term23618, term23618.getClass(), "positions", null);
        setIntField(term23618, term23618.getClass(), "positionIndex", 0);
        setField(term23618, term23618.getClass(), "canCastle", null);
        setLongField(term23618, term23618.getClass(), "zobristHash", 0L);
        setField(term23618, term23618.getClass(), "playerToMove", null);
        setBooleanField(term23618, term23618.getClass(), "isThreeFoldRepetition", false);
        setIntField(term23618, term23618.getClass(), "halfMoves", 0);
        setBooleanField(term23618, term23618.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term23618, term23618.getClass(), "inCheck", false);
        setField(term23618, term23618.getClass(), "previousMove", null);
        setField(term23618, term23618.getClass(), "kings", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("game.Move");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "makeMove", argTypes, term23618, args);
    }

};


