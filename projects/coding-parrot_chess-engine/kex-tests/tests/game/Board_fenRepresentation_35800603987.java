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

public class Board_fenRepresentation_35800603987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23753;

    public Board_fenRepresentation_35800603987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23753 = newInstance(Class.forName("game.Board"));
        setField(term23753, term23753.getClass(), "pieces", null);
        setField(term23753, term23753.getClass(), "playerPieces", null);
        setField(term23753, term23753.getClass(), "moves", null);
        setField(term23753, term23753.getClass(), "guards", null);
        setField(term23753, term23753.getClass(), "moveList", null);
        setField(term23753, term23753.getClass(), "positions", null);
        setIntField(term23753, term23753.getClass(), "positionIndex", 0);
        setField(term23753, term23753.getClass(), "canCastle", null);
        setLongField(term23753, term23753.getClass(), "zobristHash", 0L);
        setField(term23753, term23753.getClass(), "playerToMove", null);
        setBooleanField(term23753, term23753.getClass(), "isThreeFoldRepetition", false);
        setIntField(term23753, term23753.getClass(), "halfMoves", 0);
        setBooleanField(term23753, term23753.getClass(), "fiftyMoveDraw", false);
        setBooleanField(term23753, term23753.getClass(), "inCheck", false);
        setField(term23753, term23753.getClass(), "previousMove", null);
        setField(term23753, term23753.getClass(), "kings", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "fenRepresentation", argTypes, term23753, args);
    }

};


