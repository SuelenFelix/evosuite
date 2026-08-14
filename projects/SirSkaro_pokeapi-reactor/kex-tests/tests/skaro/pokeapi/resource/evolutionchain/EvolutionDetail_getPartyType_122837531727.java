package skaro.pokeapi.resource.evolutionchain;

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
import static skaro.pokeapi.resource.evolutionchain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;

public class EvolutionDetail_getPartyType_122837531727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13371;

    public EvolutionDetail_getPartyType_122837531727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13422 = new Integer(-1660057757);
        Integer term13524 = new Integer(1816273440);
        Integer term13526 = new Integer(-96541009);
        Integer term13528 = new Integer(-43719302);
        Integer term13530 = new Integer(1024134939);
        Boolean term13532 = new Boolean(true);
        Integer term13584 = new Integer(109078154);
        Boolean term13623 = new Boolean(true);
        term13371 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term13372 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term13397 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term13424 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term13449 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term13474 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term13499 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term13534 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term13559 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term13598 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term13372, term13372.getClass(), "name", "itAUCFhZhq");
        setField(term13372, term13372.getClass(), "url", "bIqaKgXgPm");
        setField(term13371, term13371.getClass(), "item", term13372);
        setField(term13397, term13397.getClass(), "name", "uOJFOUcNvv");
        setField(term13397, term13397.getClass(), "url", "tkmmGweDwJ");
        setField(term13371, term13371.getClass(), "trigger", term13397);
        setField(term13371, term13371.getClass(), "gender", term13422);
        setField(term13424, term13424.getClass(), "name", "pMfTuAFXxg");
        setField(term13424, term13424.getClass(), "url", "XCZmhkblRc");
        setField(term13371, term13371.getClass(), "heldItem", term13424);
        setField(term13449, term13449.getClass(), "name", "gFUWMydGCU");
        setField(term13449, term13449.getClass(), "url", "LLegSTfqJt");
        setField(term13371, term13371.getClass(), "knownMove", term13449);
        setField(term13474, term13474.getClass(), "name", "XQfmqLbqHS");
        setField(term13474, term13474.getClass(), "url", "jLVLqQSjqg");
        setField(term13371, term13371.getClass(), "knownMoveType", term13474);
        setField(term13499, term13499.getClass(), "name", "JKGueoHesL");
        setField(term13499, term13499.getClass(), "url", "CRAUqtVBkU");
        setField(term13371, term13371.getClass(), "location", term13499);
        setField(term13371, term13371.getClass(), "minLevel", term13524);
        setField(term13371, term13371.getClass(), "minHappiness", term13526);
        setField(term13371, term13371.getClass(), "minBeauty", term13528);
        setField(term13371, term13371.getClass(), "minAffection", term13530);
        setField(term13371, term13371.getClass(), "needsOverworldRain", term13532);
        setField(term13534, term13534.getClass(), "name", "DddqUYfomL");
        setField(term13534, term13534.getClass(), "url", "YQwoogpPyi");
        setField(term13371, term13371.getClass(), "partySpecies", term13534);
        setField(term13559, term13559.getClass(), "name", "rnPhHoorxj");
        setField(term13559, term13559.getClass(), "url", "GuwJLKquuI");
        setField(term13371, term13371.getClass(), "partyType", term13559);
        setField(term13371, term13371.getClass(), "relativePhysicalStats", term13584);
        setField(term13371, term13371.getClass(), "timeOfDay", "vYMCjgnztg");
        setField(term13598, term13598.getClass(), "name", "YupgKTSEiI");
        setField(term13598, term13598.getClass(), "url", "HuOUlaFmvJ");
        setField(term13371, term13371.getClass(), "tradeSpecies", term13598);
        setField(term13371, term13371.getClass(), "turnUpsideDown", term13623);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPartyType", argTypes, term13371, args);
    }

};


