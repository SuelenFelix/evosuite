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

public class PokemonAbility_setAbility_5851898956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20639;
     Object term20669;

    public PokemonAbility_setAbility_5851898956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term20640 = new Boolean(false);
        Integer term20642 = new Integer(-683868408);
        term20639 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonAbility"));
        Object term20644 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term20639, term20639.getClass(), "isHidden", term20640);
        setField(term20639, term20639.getClass(), "slot", term20642);
        setField(term20644, term20644.getClass(), "name", "rawiXxuyRn");
        setField(term20644, term20644.getClass(), "url", "ZyAecZGope");
        setField(term20639, term20639.getClass(), "ability", term20644);
        term20669 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term20669, term20669.getClass(), "name", "tydPpKxAbv");
        setField(term20669, term20669.getClass(), "url", "CJxQpJUfLJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonAbility");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term20669;
        callMethod(klass, "setAbility", argTypes, term20639, args);
    }

};


