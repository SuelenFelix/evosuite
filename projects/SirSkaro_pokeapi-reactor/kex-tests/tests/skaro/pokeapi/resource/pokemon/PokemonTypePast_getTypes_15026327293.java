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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class PokemonTypePast_getTypes_15026327293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16527;

    public PokemonTypePast_getTypes_15026327293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term16556 = new Integer(-177243872);
        Object term16555 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonType"));
        Object term16558 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term16555, term16555.getClass(), "slot", term16556);
        setField(term16558, term16558.getClass(), "name", null);
        setField(term16558, term16558.getClass(), "url", null);
        setField(term16555, term16555.getClass(), "type", term16558);
        Integer term16560 = new Integer(1485047282);
        Object term16559 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonType"));
        Object term16562 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term16559, term16559.getClass(), "slot", term16560);
        setField(term16562, term16562.getClass(), "name", null);
        setField(term16562, term16562.getClass(), "url", null);
        setField(term16559, term16559.getClass(), "type", term16562);
        Integer term16564 = new Integer(1624190794);
        Object term16563 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonType"));
        Object term16566 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term16563, term16563.getClass(), "slot", term16564);
        setField(term16566, term16566.getClass(), "name", null);
        setField(term16566, term16566.getClass(), "url", null);
        setField(term16563, term16563.getClass(), "type", term16566);
        Integer term16568 = new Integer(-773608881);
        Object term16567 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonType"));
        Object term16570 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term16567, term16567.getClass(), "slot", term16568);
        setField(term16570, term16570.getClass(), "name", null);
        setField(term16570, term16570.getClass(), "url", null);
        setField(term16567, term16567.getClass(), "type", term16570);
        Integer term16572 = new Integer(-1642688455);
        Object term16571 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonType"));
        Object term16574 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term16571, term16571.getClass(), "slot", term16572);
        setField(term16574, term16574.getClass(), "name", null);
        setField(term16574, term16574.getClass(), "url", null);
        setField(term16571, term16571.getClass(), "type", term16574);
        Integer term16576 = new Integer(-1184558215);
        Object term16575 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonType"));
        Object term16578 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term16575, term16575.getClass(), "slot", term16576);
        setField(term16578, term16578.getClass(), "name", null);
        setField(term16578, term16578.getClass(), "url", null);
        setField(term16575, term16575.getClass(), "type", term16578);
        Integer term16580 = new Integer(2123688338);
        Object term16579 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonType"));
        Object term16582 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term16579, term16579.getClass(), "slot", term16580);
        setField(term16582, term16582.getClass(), "name", null);
        setField(term16582, term16582.getClass(), "url", null);
        setField(term16579, term16579.getClass(), "type", term16582);
        ArrayList term16553 = new ArrayList();
        ((ArrayList) term16553).add(term16555);
        ((ArrayList) term16553).add(term16559);
        ((ArrayList) term16553).add(term16563);
        ((ArrayList) term16553).add(term16567);
        ((ArrayList) term16553).add(term16571);
        ((ArrayList) term16553).add(term16575);
        ((ArrayList) term16553).add(term16579);
        term16527 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonTypePast"));
        Object term16528 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term16528, term16528.getClass(), "name", "yJKKddLqMb");
        setField(term16528, term16528.getClass(), "url", "LWEYaXeKBe");
        setField(term16527, term16527.getClass(), "generation", term16528);
        setField(term16527, term16527.getClass(), "types", term16553);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonTypePast");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTypes", argTypes, term16527, args);
    }

};


