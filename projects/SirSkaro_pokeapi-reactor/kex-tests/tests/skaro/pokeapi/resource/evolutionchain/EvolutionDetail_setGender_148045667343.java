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

public class EvolutionDetail_setGender_148045667343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17932;

    public EvolutionDetail_setGender_148045667343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17932 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        setField(term17932, term17932.getClass(), "item", null);
        setField(term17932, term17932.getClass(), "trigger", null);
        setField(term17932, term17932.getClass(), "gender", null);
        setField(term17932, term17932.getClass(), "heldItem", null);
        setField(term17932, term17932.getClass(), "knownMove", null);
        setField(term17932, term17932.getClass(), "knownMoveType", null);
        setField(term17932, term17932.getClass(), "location", null);
        setField(term17932, term17932.getClass(), "minLevel", null);
        setField(term17932, term17932.getClass(), "minHappiness", null);
        setField(term17932, term17932.getClass(), "minBeauty", null);
        setField(term17932, term17932.getClass(), "minAffection", null);
        setField(term17932, term17932.getClass(), "needsOverworldRain", null);
        setField(term17932, term17932.getClass(), "partySpecies", null);
        setField(term17932, term17932.getClass(), "partyType", null);
        setField(term17932, term17932.getClass(), "relativePhysicalStats", null);
        setField(term17932, term17932.getClass(), "timeOfDay", null);
        setField(term17932, term17932.getClass(), "tradeSpecies", null);
        setField(term17932, term17932.getClass(), "turnUpsideDown", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGender", argTypes, term17932, args);
    }

};


