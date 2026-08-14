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

public class Stat_getCharacteristics_75957327434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132282;

    public Stat_getCharacteristics_75957327434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132282 = newInstance(Class.forName("skaro.pokeapi.resource.stat.Stat"));
        setField(term132282, term132282.getClass(), "id", null);
        setField(term132282, term132282.getClass(), "name", null);
        setField(term132282, term132282.getClass(), "gameIndex", null);
        setField(term132282, term132282.getClass(), "isBattleOnly", null);
        setField(term132282, term132282.getClass(), "affectingMoves", null);
        setField(term132282, term132282.getClass(), "affectingNatures", null);
        setField(term132282, term132282.getClass(), "characteristics", null);
        setField(term132282, term132282.getClass(), "moveDamageClass", null);
        setField(term132282, term132282.getClass(), "names", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.stat.Stat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharacteristics", argTypes, term132282, args);
    }

};


