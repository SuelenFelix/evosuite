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

public class EvolutionDetail_setTimeOfDay_18607148169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17958;

    public EvolutionDetail_setTimeOfDay_18607148169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17958 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        setField(term17958, term17958.getClass(), "item", null);
        setField(term17958, term17958.getClass(), "trigger", null);
        setField(term17958, term17958.getClass(), "gender", null);
        setField(term17958, term17958.getClass(), "heldItem", null);
        setField(term17958, term17958.getClass(), "knownMove", null);
        setField(term17958, term17958.getClass(), "knownMoveType", null);
        setField(term17958, term17958.getClass(), "location", null);
        setField(term17958, term17958.getClass(), "minLevel", null);
        setField(term17958, term17958.getClass(), "minHappiness", null);
        setField(term17958, term17958.getClass(), "minBeauty", null);
        setField(term17958, term17958.getClass(), "minAffection", null);
        setField(term17958, term17958.getClass(), "needsOverworldRain", null);
        setField(term17958, term17958.getClass(), "partySpecies", null);
        setField(term17958, term17958.getClass(), "partyType", null);
        setField(term17958, term17958.getClass(), "relativePhysicalStats", null);
        setField(term17958, term17958.getClass(), "timeOfDay", null);
        setField(term17958, term17958.getClass(), "tradeSpecies", null);
        setField(term17958, term17958.getClass(), "turnUpsideDown", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTimeOfDay", argTypes, term17958, args);
    }

};


