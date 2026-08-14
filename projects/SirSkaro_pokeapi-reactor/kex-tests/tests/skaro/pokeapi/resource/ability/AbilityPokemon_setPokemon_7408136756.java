package skaro.pokeapi.resource.ability;

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
import static skaro.pokeapi.resource.ability.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;

public class AbilityPokemon_setPokemon_7408136756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255;
     Object term285;

    public AbilityPokemon_setPokemon_7408136756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term256 = new Boolean(true);
        Integer term258 = new Integer(-1955890973);
        term255 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityPokemon"));
        Object term260 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term255, term255.getClass(), "isHidden", term256);
        setField(term255, term255.getClass(), "slot", term258);
        setField(term260, term260.getClass(), "name", "NRdvgJlhkX");
        setField(term260, term260.getClass(), "url", "uuaPigETmJ");
        setField(term255, term255.getClass(), "pokemon", term260);
        term285 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term285, term285.getClass(), "name", "oVcInYnLWB");
        setField(term285, term285.getClass(), "url", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.ability.AbilityPokemon");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term285;
        callMethod(klass, "setPokemon", argTypes, term255, args);
    }

};


