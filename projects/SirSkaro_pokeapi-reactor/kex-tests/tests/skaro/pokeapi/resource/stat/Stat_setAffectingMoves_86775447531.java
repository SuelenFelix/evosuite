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

public class Stat_setAffectingMoves_86775447531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3219;

    public Stat_setAffectingMoves_86775447531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3219 = newInstance(Class.forName("skaro.pokeapi.resource.stat.Stat"));
        setField(term3219, term3219.getClass(), "id", null);
        setField(term3219, term3219.getClass(), "name", null);
        setField(term3219, term3219.getClass(), "gameIndex", null);
        setField(term3219, term3219.getClass(), "isBattleOnly", null);
        setField(term3219, term3219.getClass(), "affectingMoves", null);
        setField(term3219, term3219.getClass(), "affectingNatures", null);
        setField(term3219, term3219.getClass(), "characteristics", null);
        setField(term3219, term3219.getClass(), "moveDamageClass", null);
        setField(term3219, term3219.getClass(), "names", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.stat.Stat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.stat.MoveStatAffectSets");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAffectingMoves", argTypes, term3219, args);
    }

};


