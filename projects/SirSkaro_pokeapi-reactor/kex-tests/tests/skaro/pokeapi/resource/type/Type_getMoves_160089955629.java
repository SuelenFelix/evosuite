package skaro.pokeapi.resource.type;

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
import static skaro.pokeapi.resource.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Type_getMoves_160089955629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60610;

    public Type_getMoves_160089955629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60610 = newInstance(Class.forName("skaro.pokeapi.resource.type.Type"));
        setField(term60610, term60610.getClass(), "id", null);
        setField(term60610, term60610.getClass(), "name", null);
        setField(term60610, term60610.getClass(), "damageRelations", null);
        setField(term60610, term60610.getClass(), "pastDamageRelations", null);
        setField(term60610, term60610.getClass(), "gameIndices", null);
        setField(term60610, term60610.getClass(), "generation", null);
        setField(term60610, term60610.getClass(), "moveDamageClass", null);
        setField(term60610, term60610.getClass(), "names", null);
        setField(term60610, term60610.getClass(), "pokemon", null);
        setField(term60610, term60610.getClass(), "moves", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.Type");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMoves", argTypes, term60610, args);
    }

};


