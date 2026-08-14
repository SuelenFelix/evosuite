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

public class PokemonHeldItem_setItem_4543845722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term669;
     Object term715;

    public PokemonHeldItem_setItem_4543845722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term699 = new Integer(-1007160944);
        Object term697 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonHeldItemVersion"));
        Object term698 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term698, term698.getClass(), "name", null);
        setField(term698, term698.getClass(), "url", null);
        setField(term697, term697.getClass(), "version", term698);
        setField(term697, term697.getClass(), "rarity", term699);
        Integer term703 = new Integer(1135664017);
        Object term701 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonHeldItemVersion"));
        Object term702 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term702, term702.getClass(), "name", null);
        setField(term702, term702.getClass(), "url", null);
        setField(term701, term701.getClass(), "version", term702);
        setField(term701, term701.getClass(), "rarity", term703);
        Integer term707 = new Integer(590364439);
        Object term705 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonHeldItemVersion"));
        Object term706 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term706, term706.getClass(), "name", null);
        setField(term706, term706.getClass(), "url", null);
        setField(term705, term705.getClass(), "version", term706);
        setField(term705, term705.getClass(), "rarity", term707);
        Integer term711 = new Integer(865208305);
        Object term709 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonHeldItemVersion"));
        Object term710 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term710, term710.getClass(), "name", null);
        setField(term710, term710.getClass(), "url", null);
        setField(term709, term709.getClass(), "version", term710);
        setField(term709, term709.getClass(), "rarity", term711);
        ArrayList term695 = new ArrayList();
        ((ArrayList) term695).add(term697);
        ((ArrayList) term695).add(term701);
        ((ArrayList) term695).add(term705);
        ((ArrayList) term695).add(term709);
        term669 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonHeldItem"));
        Object term670 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term670, term670.getClass(), "name", "wSQxaModmm");
        setField(term670, term670.getClass(), "url", "UlajhuVLaP");
        setField(term669, term669.getClass(), "item", term670);
        setField(term669, term669.getClass(), "versionDetails", term695);
        term715 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term715, term715.getClass(), "name", "UoYtihxVaS");
        setField(term715, term715.getClass(), "url", "JDswTTCZHV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonHeldItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term715;
        callMethod(klass, "setItem", argTypes, term669, args);
    }

};


