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

public class Move_setPriority_90577131624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10583;

    public Move_setPriority_90577131624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10583 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term10583, term10583.getClass(), "id", null);
        setField(term10583, term10583.getClass(), "name", null);
        setField(term10583, term10583.getClass(), "accuracy", null);
        setField(term10583, term10583.getClass(), "effectChance", null);
        setField(term10583, term10583.getClass(), "pp", null);
        setField(term10583, term10583.getClass(), "priority", null);
        setField(term10583, term10583.getClass(), "power", null);
        setField(term10583, term10583.getClass(), "contestCombos", null);
        setField(term10583, term10583.getClass(), "contestType", null);
        setField(term10583, term10583.getClass(), "contestEffect", null);
        setField(term10583, term10583.getClass(), "damageClass", null);
        setField(term10583, term10583.getClass(), "effectEntries", null);
        setField(term10583, term10583.getClass(), "effectChanges", null);
        setField(term10583, term10583.getClass(), "flavorTextEntries", null);
        setField(term10583, term10583.getClass(), "generation", null);
        setField(term10583, term10583.getClass(), "machines", null);
        setField(term10583, term10583.getClass(), "meta", null);
        setField(term10583, term10583.getClass(), "names", null);
        setField(term10583, term10583.getClass(), "pastValues", null);
        setField(term10583, term10583.getClass(), "statChanges", null);
        setField(term10583, term10583.getClass(), "superContestEffect", null);
        setField(term10583, term10583.getClass(), "target", null);
        setField(term10583, term10583.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPriority", argTypes, term10583, args);
    }

};


