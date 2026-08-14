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

public class Stat_getNames_151761698220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3049;

    public Stat_getNames_151761698220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3049 = newInstance(Class.forName("skaro.pokeapi.resource.stat.Stat"));
        setField(term3049, term3049.getClass(), "id", null);
        setField(term3049, term3049.getClass(), "name", null);
        setField(term3049, term3049.getClass(), "gameIndex", null);
        setField(term3049, term3049.getClass(), "isBattleOnly", null);
        setField(term3049, term3049.getClass(), "affectingMoves", null);
        setField(term3049, term3049.getClass(), "affectingNatures", null);
        setField(term3049, term3049.getClass(), "characteristics", null);
        setField(term3049, term3049.getClass(), "moveDamageClass", null);
        setField(term3049, term3049.getClass(), "names", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.stat.Stat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNames", argTypes, term3049, args);
    }

};


