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

public class PokemonMove_getMove_3975472651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20740;

    public PokemonMove_getMove_3975472651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term20771 = new Integer(-381130069);
        Object term20768 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonMoveVersion"));
        Object term20769 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term20770 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term20769, term20769.getClass(), "name", null);
        setField(term20769, term20769.getClass(), "url", null);
        setField(term20768, term20768.getClass(), "moveLearnMethod", term20769);
        setField(term20770, term20770.getClass(), "name", null);
        setField(term20770, term20770.getClass(), "url", null);
        setField(term20768, term20768.getClass(), "versionGroup", term20770);
        setField(term20768, term20768.getClass(), "levelLearnedAt", term20771);
        ArrayList term20766 = new ArrayList();
        ((ArrayList) term20766).add(term20768);
        term20740 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonMove"));
        Object term20741 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term20741, term20741.getClass(), "name", "NUUjAyqOva");
        setField(term20741, term20741.getClass(), "url", "EoAMIIUdDX");
        setField(term20740, term20740.getClass(), "move", term20741);
        setField(term20740, term20740.getClass(), "versionGroupDetails", term20766);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonMove");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMove", argTypes, term20740, args);
    }

};


