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

public class Board_getStartBoard_5466888951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23471;

    public Board_getStartBoard_5466888951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23471 = newInstance(Class.forName("game.Board"));
        setField(term23471, term23471.getClass(), "pieces", null);
        setField(term23471, term23471.getClass(), "playerPieces", null);
        setField(term23471, term23471.getClass(), "moves", null);
        setField(term23471, term23471.getClass(), "guards", null);
        setField(term23471, term23471.getClass(), "moveList", null);
        setField(term23471, term23471.getClass(), "positions", null);
        setIntField(term23471, term23471.getClass(), "positionIndex", 0);
        setField(term23471, term23471.getClass(), "canCastle", null);
        setLongField(term23471, term23471.getClass(), "zobristHash", 0L);
        setField(term23471, term23471.getClass(), "playerToMove", null);
        setBooleanField(term23471, term23471.getClass(), "isThreeFoldRepetition", false);
        setIntField(term23471, term23471.getClass(), "halfMoves", 0);
        setBooleanField(term23471, term23471.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term23471, term23471.getClass(), "inCheck", false);
        setField(term23471, term23471.getClass(), "previousMove", null);
        setField(term23471, term23471.getClass(), "kings", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartBoard", argTypes, term23471, args);
    }

};


