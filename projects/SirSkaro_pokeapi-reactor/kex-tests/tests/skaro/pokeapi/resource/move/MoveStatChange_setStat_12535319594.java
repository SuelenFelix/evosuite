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
import java.lang.Integer;
import java.lang.Object;

public class MoveStatChange_setStat_12535319594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4834;
     Object term4862;

    public MoveStatChange_setStat_12535319594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4835 = new Integer(-1694747156);
        term4834 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveStatChange"));
        Object term4837 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4834, term4834.getClass(), "change", term4835);
        setField(term4837, term4837.getClass(), "name", "llRfwANcVF");
        setField(term4837, term4837.getClass(), "url", "sUEeHQTWkA");
        setField(term4834, term4834.getClass(), "stat", term4837);
        term4862 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4862, term4862.getClass(), "name", "nKZKnxWYCK");
        setField(term4862, term4862.getClass(), "url", "JOqQxuzRuZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveStatChange");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term4862;
        callMethod(klass, "setStat", argTypes, term4834, args);
    }

};


