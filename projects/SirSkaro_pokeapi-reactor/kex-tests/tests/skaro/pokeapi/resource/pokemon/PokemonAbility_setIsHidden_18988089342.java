package skaro.pokeapi.resource.pokemon;

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
import static skaro.pokeapi.resource.pokemon.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;

public class PokemonAbility_setIsHidden_18988089342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20435;
     Object term20465;

    public PokemonAbility_setIsHidden_18988089342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term20436 = new Boolean(false);
        Integer term20438 = new Integer(37757400);
        term20435 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonAbility"));
        Object term20440 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term20435, term20435.getClass(), "isHidden", term20436);
        setField(term20435, term20435.getClass(), "slot", term20438);
        setField(term20440, term20440.getClass(), "name", "NsphHxYiuC");
        setField(term20440, term20440.getClass(), "url", "XYJztkznbY");
        setField(term20435, term20435.getClass(), "ability", term20440);
        term20465 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonAbility");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term20465;
        callMethod(klass, "setIsHidden", argTypes, term20435, args);
    }

};


