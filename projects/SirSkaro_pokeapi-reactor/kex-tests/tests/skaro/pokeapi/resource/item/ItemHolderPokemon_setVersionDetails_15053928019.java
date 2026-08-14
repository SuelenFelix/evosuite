package skaro.pokeapi.resource.item;

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
import static skaro.pokeapi.resource.item.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ItemHolderPokemon_setVersionDetails_15053928019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7561;

    public ItemHolderPokemon_setVersionDetails_15053928019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7561 = newInstance(Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemon"));
        setField(term7561, term7561.getClass(), "pokemon", null);
        setField(term7561, term7561.getClass(), "versionDetails", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemon");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setVersionDetails", argTypes, term7561, args);
    }

};


