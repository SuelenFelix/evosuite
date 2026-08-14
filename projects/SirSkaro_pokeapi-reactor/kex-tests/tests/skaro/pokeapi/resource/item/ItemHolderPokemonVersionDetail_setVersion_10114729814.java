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
import java.lang.Integer;
import java.lang.Object;

public class ItemHolderPokemonVersionDetail_setVersion_10114729814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7708;
     Object term7736;

    public ItemHolderPokemonVersionDetail_setVersion_10114729814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7709 = new Integer(1365087144);
        term7708 = newInstance(Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemonVersionDetail"));
        Object term7711 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7708, term7708.getClass(), "rarity", term7709);
        setField(term7711, term7711.getClass(), "name", "CaeIUTuUFo");
        setField(term7711, term7711.getClass(), "url", "rzoDGjHkzG");
        setField(term7708, term7708.getClass(), "version", term7711);
        term7736 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7736, term7736.getClass(), "name", "NeTiWVoyjZ");
        setField(term7736, term7736.getClass(), "url", "CGeclMyIOP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemonVersionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term7736;
        callMethod(klass, "setVersion", argTypes, term7708, args);
    }

};


