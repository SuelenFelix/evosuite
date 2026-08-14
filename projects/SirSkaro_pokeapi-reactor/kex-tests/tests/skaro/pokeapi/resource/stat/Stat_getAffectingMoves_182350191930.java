package skaro.pokeapi.resource.stat;

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
import static skaro.pokeapi.resource.stat.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Stat_getAffectingMoves_182350191930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3218;

    public Stat_getAffectingMoves_182350191930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3218 = newInstance(Class.forName("skaro.pokeapi.resource.stat.Stat"));
        setField(term3218, term3218.getClass(), "id", null);
        setField(term3218, term3218.getClass(), "name", null);
        setField(term3218, term3218.getClass(), "gameIndex", null);
        setField(term3218, term3218.getClass(), "isBattleOnly", null);
        setField(term3218, term3218.getClass(), "affectingMoves", null);
        setField(term3218, term3218.getClass(), "affectingNatures", null);
        setField(term3218, term3218.getClass(), "characteristics", null);
        setField(term3218, term3218.getClass(), "moveDamageClass", null);
        setField(term3218, term3218.getClass(), "names", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.stat.Stat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAffectingMoves", argTypes, term3218, args);
    }

};


