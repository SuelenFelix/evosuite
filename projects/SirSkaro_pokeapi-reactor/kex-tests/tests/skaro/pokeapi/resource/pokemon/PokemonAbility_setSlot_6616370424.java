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

public class PokemonAbility_setSlot_6616370424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20537;
     Object term20567;

    public PokemonAbility_setSlot_6616370424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term20538 = new Boolean(true);
        Integer term20540 = new Integer(1545314376);
        term20537 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonAbility"));
        Object term20542 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term20537, term20537.getClass(), "isHidden", term20538);
        setField(term20537, term20537.getClass(), "slot", term20540);
        setField(term20542, term20542.getClass(), "name", "yyWOYvIBsp");
        setField(term20542, term20542.getClass(), "url", "mmpgARMYFV");
        setField(term20537, term20537.getClass(), "ability", term20542);
        term20567 = new Integer(437959151);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonAbility");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term20567;
        callMethod(klass, "setSlot", argTypes, term20537, args);
    }

};


