package skaro.pokeapi.resource;

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
import static skaro.pokeapi.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class GenerationGameIndex_getGameIndex_10491316371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132495;

    public GenerationGameIndex_getGameIndex_10491316371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term132496 = new Integer(-1115743900);
        term132495 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term132498 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term132495, term132495.getClass(), "gameIndex", term132496);
        setField(term132498, term132498.getClass(), "name", "EMfvLwpaZq");
        setField(term132498, term132498.getClass(), "url", "TfZONVqEws");
        setField(term132495, term132495.getClass(), "generation", term132498);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.GenerationGameIndex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGameIndex", argTypes, term132495, args);
    }

};


