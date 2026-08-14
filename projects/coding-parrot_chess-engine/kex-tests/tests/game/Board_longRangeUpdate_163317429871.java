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

public class Board_longRangeUpdate_163317429871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23639;

    public Board_longRangeUpdate_163317429871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23639 = newInstance(Class.forName("game.Board"));
        setField(term23639, term23639.getClass(), "pieces", null);
        setField(term23639, term23639.getClass(), "playerPieces", null);
        setField(term23639, term23639.getClass(), "moves", null);
        setField(term23639, term23639.getClass(), "guards", null);
        setField(term23639, term23639.getClass(), "moveList", null);
        setField(term23639, term23639.getClass(), "positions", null);
        setIntField(term23639, term23639.getClass(), "positionIndex", 0);
        setField(term23639, term23639.getClass(), "canCastle", null);
        setLongField(term23639, term23639.getClass(), "zobristHash", 0L);
        setField(term23639, term23639.getClass(), "playerToMove", null);
        setBooleanField(term23639, term23639.getClass(), "isThreeFoldRepetition", false);
        setIntField(term23639, term23639.getClass(), "halfMoves", 0);
        setBooleanField(term23639, term23639.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term23639, term23639.getClass(), "inCheck", false);
        setField(term23639, term23639.getClass(), "previousMove", null);
        setField(term23639, term23639.getClass(), "kings", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("game.Cell");
        argTypes[1] = Class.forName("java.util.function.Consumer");
        argTypes[2] = Class.forName("java.util.function.BiConsumer");
        argTypes[3] = Class.forName("java.util.function.BiConsumer");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "longRangeUpdate", argTypes, term23639, args);
    }

};


