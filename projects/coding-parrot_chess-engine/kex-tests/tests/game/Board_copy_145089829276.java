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

public class Board_copy_145089829276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23674;

    public Board_copy_145089829276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23674 = newInstance(Class.forName("game.Board"));
        setField(term23674, term23674.getClass(), "pieces", null);
        setField(term23674, term23674.getClass(), "playerPieces", null);
        setField(term23674, term23674.getClass(), "moves", null);
        setField(term23674, term23674.getClass(), "guards", null);
        setField(term23674, term23674.getClass(), "moveList", null);
        setField(term23674, term23674.getClass(), "positions", null);
        setIntField(term23674, term23674.getClass(), "positionIndex", 0);
        setField(term23674, term23674.getClass(), "canCastle", null);
        setLongField(term23674, term23674.getClass(), "zobristHash", 0L);
        setField(term23674, term23674.getClass(), "playerToMove", null);
        setBooleanField(term23674, term23674.getClass(), "isThreeFoldRepetition", false);
        setIntField(term23674, term23674.getClass(), "halfMoves", 0);
        setBooleanField(term23674, term23674.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term23674, term23674.getClass(), "inCheck", false);
        setField(term23674, term23674.getClass(), "previousMove", null);
        setField(term23674, term23674.getClass(), "kings", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term23674, args);
    }

};


