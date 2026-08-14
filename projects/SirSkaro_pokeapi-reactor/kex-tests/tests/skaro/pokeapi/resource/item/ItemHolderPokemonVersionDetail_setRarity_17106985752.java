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

public class ItemHolderPokemonVersionDetail_setRarity_17106985752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7610;
     Object term7638;

    public ItemHolderPokemonVersionDetail_setRarity_17106985752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7611 = new Integer(1887772522);
        term7610 = newInstance(Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemonVersionDetail"));
        Object term7613 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7610, term7610.getClass(), "rarity", term7611);
        setField(term7613, term7613.getClass(), "name", "PqhYfEyDDA");
        setField(term7613, term7613.getClass(), "url", "fSLHLeuNoa");
        setField(term7610, term7610.getClass(), "version", term7613);
        term7638 = new Integer(354196060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemonVersionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term7638;
        callMethod(klass, "setRarity", argTypes, term7610, args);
    }

};


