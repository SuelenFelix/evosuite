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

public class PokemonMove_setMove_5902222573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131421;
     Object term131456;

    public PokemonMove_setMove_5902222573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term131452 = new Integer(432386815);
        Object term131449 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonMoveVersion"));
        Object term131450 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term131451 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term131450, term131450.getClass(), "name", null);
        setField(term131450, term131450.getClass(), "url", null);
        setField(term131449, term131449.getClass(), "moveLearnMethod", term131450);
        setField(term131451, term131451.getClass(), "name", null);
        setField(term131451, term131451.getClass(), "url", null);
        setField(term131449, term131449.getClass(), "versionGroup", term131451);
        setField(term131449, term131449.getClass(), "levelLearnedAt", term131452);
        ArrayList term131447 = new ArrayList();
        ((ArrayList) term131447).add(term131449);
        term131421 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonMove"));
        Object term131422 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term131422, term131422.getClass(), "name", "fAQhZnjbtD");
        setField(term131422, term131422.getClass(), "url", "zCnNMofHSj");
        setField(term131421, term131421.getClass(), "move", term131422);
        setField(term131421, term131421.getClass(), "versionGroupDetails", term131447);
        term131456 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term131456, term131456.getClass(), "name", "sUOneoKrgL");
        setField(term131456, term131456.getClass(), "url", "UsTqmFlicD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonMove");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term131456;
        callMethod(klass, "setMove", argTypes, term131421, args);
    }

};


