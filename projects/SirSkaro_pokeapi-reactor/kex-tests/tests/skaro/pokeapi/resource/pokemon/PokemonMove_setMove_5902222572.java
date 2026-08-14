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

public class PokemonMove_setMove_5902222572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20795;
     Object term20835;

    public PokemonMove_setMove_5902222572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term20826 = new Integer(885769749);
        Object term20823 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonMoveVersion"));
        Object term20824 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term20825 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term20824, term20824.getClass(), "name", null);
        setField(term20824, term20824.getClass(), "url", null);
        setField(term20823, term20823.getClass(), "moveLearnMethod", term20824);
        setField(term20825, term20825.getClass(), "name", null);
        setField(term20825, term20825.getClass(), "url", null);
        setField(term20823, term20823.getClass(), "versionGroup", term20825);
        setField(term20823, term20823.getClass(), "levelLearnedAt", term20826);
        Integer term20831 = new Integer(-1021168716);
        Object term20828 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonMoveVersion"));
        Object term20829 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term20830 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term20829, term20829.getClass(), "name", null);
        setField(term20829, term20829.getClass(), "url", null);
        setField(term20828, term20828.getClass(), "moveLearnMethod", term20829);
        setField(term20830, term20830.getClass(), "name", null);
        setField(term20830, term20830.getClass(), "url", null);
        setField(term20828, term20828.getClass(), "versionGroup", term20830);
        setField(term20828, term20828.getClass(), "levelLearnedAt", term20831);
        ArrayList term20821 = new ArrayList();
        ((ArrayList) term20821).add(term20823);
        ((ArrayList) term20821).add(term20828);
        term20795 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonMove"));
        Object term20796 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term20796, term20796.getClass(), "name", "mJJxTuZuKO");
        setField(term20796, term20796.getClass(), "url", "anSZCikKpS");
        setField(term20795, term20795.getClass(), "move", term20796);
        setField(term20795, term20795.getClass(), "versionGroupDetails", term20821);
        term20835 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term20835, term20835.getClass(), "name", "LNHkTUfuHX");
        setField(term20835, term20835.getClass(), "url", "SVWcOAHiTp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonMove");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term20835;
        callMethod(klass, "setMove", argTypes, term20795, args);
    }

};


