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

public class EvolutionDetail_getHeldItem_122268546344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17933;

    public EvolutionDetail_getHeldItem_122268546344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17933 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        setField(term17933, term17933.getClass(), "item", null);
        setField(term17933, term17933.getClass(), "trigger", null);
        setField(term17933, term17933.getClass(), "gender", null);
        setField(term17933, term17933.getClass(), "heldItem", null);
        setField(term17933, term17933.getClass(), "knownMove", null);
        setField(term17933, term17933.getClass(), "knownMoveType", null);
        setField(term17933, term17933.getClass(), "location", null);
        setField(term17933, term17933.getClass(), "minLevel", null);
        setField(term17933, term17933.getClass(), "minHappiness", null);
        setField(term17933, term17933.getClass(), "minBeauty", null);
        setField(term17933, term17933.getClass(), "minAffection", null);
        setField(term17933, term17933.getClass(), "needsOverworldRain", null);
        setField(term17933, term17933.getClass(), "partySpecies", null);
        setField(term17933, term17933.getClass(), "partyType", null);
        setField(term17933, term17933.getClass(), "relativePhysicalStats", null);
        setField(term17933, term17933.getClass(), "timeOfDay", null);
        setField(term17933, term17933.getClass(), "tradeSpecies", null);
        setField(term17933, term17933.getClass(), "turnUpsideDown", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHeldItem", argTypes, term17933, args);
    }

};


