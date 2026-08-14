package skaro.pokeapi.resource.move;

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
import static skaro.pokeapi.resource.move.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Move_setName_4343674648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7361;

    public Move_setName_4343674648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7361 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term7361, term7361.getClass(), "id", null);
        setField(term7361, term7361.getClass(), "name", null);
        setField(term7361, term7361.getClass(), "accuracy", null);
        setField(term7361, term7361.getClass(), "effectChance", null);
        setField(term7361, term7361.getClass(), "pp", null);
        setField(term7361, term7361.getClass(), "priority", null);
        setField(term7361, term7361.getClass(), "power", null);
        setField(term7361, term7361.getClass(), "contestCombos", null);
        setField(term7361, term7361.getClass(), "contestType", null);
        setField(term7361, term7361.getClass(), "contestEffect", null);
        setField(term7361, term7361.getClass(), "damageClass", null);
        setField(term7361, term7361.getClass(), "effectEntries", null);
        setField(term7361, term7361.getClass(), "effectChanges", null);
        setField(term7361, term7361.getClass(), "flavorTextEntries", null);
        setField(term7361, term7361.getClass(), "generation", null);
        setField(term7361, term7361.getClass(), "machines", null);
        setField(term7361, term7361.getClass(), "meta", null);
        setField(term7361, term7361.getClass(), "names", null);
        setField(term7361, term7361.getClass(), "pastValues", null);
        setField(term7361, term7361.getClass(), "statChanges", null);
        setField(term7361, term7361.getClass(), "superContestEffect", null);
        setField(term7361, term7361.getClass(), "target", null);
        setField(term7361, term7361.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setName", argTypes, term7361, args);
    }

};


