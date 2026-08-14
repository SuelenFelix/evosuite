package skaro.pokeapi.resource.growthrate;

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
import static skaro.pokeapi.resource.growthrate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class GrowthRate_getFormula_17840425455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term382;

    public GrowthRate_getFormula_17840425455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term383 = new Integer(679763016);
        Object term411 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term413 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term411, term411.getClass(), "description", "");
        setField(term413, term413.getClass(), "name", null);
        setField(term413, term413.getClass(), "url", null);
        setField(term411, term411.getClass(), "language", term413);
        Object term414 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term416 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term414, term414.getClass(), "description", "");
        setField(term416, term416.getClass(), "name", null);
        setField(term416, term416.getClass(), "url", null);
        setField(term414, term414.getClass(), "language", term416);
        Object term417 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term419 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term417, term417.getClass(), "description", "");
        setField(term419, term419.getClass(), "name", null);
        setField(term419, term419.getClass(), "url", null);
        setField(term417, term417.getClass(), "language", term419);
        Object term420 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term422 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term420, term420.getClass(), "description", "");
        setField(term422, term422.getClass(), "name", null);
        setField(term422, term422.getClass(), "url", null);
        setField(term420, term420.getClass(), "language", term422);
        Object term423 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term425 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term423, term423.getClass(), "description", "");
        setField(term425, term425.getClass(), "name", null);
        setField(term425, term425.getClass(), "url", null);
        setField(term423, term423.getClass(), "language", term425);
        ArrayList term409 = new ArrayList();
        ((ArrayList) term409).add(term411);
        ((ArrayList) term409).add(term414);
        ((ArrayList) term409).add(term417);
        ((ArrayList) term409).add(term420);
        ((ArrayList) term409).add(term423);
        Integer term431 = new Integer(1962444399);
        Integer term433 = new Integer(767834723);
        Object term430 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term430, term430.getClass(), "level", term431);
        setField(term430, term430.getClass(), "experience", term433);
        Integer term436 = new Integer(-602026508);
        Integer term438 = new Integer(-157887805);
        Object term435 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term435, term435.getClass(), "level", term436);
        setField(term435, term435.getClass(), "experience", term438);
        ArrayList term428 = new ArrayList();
        ((ArrayList) term428).add(term430);
        ((ArrayList) term428).add(term435);
        ArrayList term442 = new ArrayList();
        term382 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRate"));
        setField(term382, term382.getClass(), "id", term383);
        setField(term382, term382.getClass(), "name", "GzFkzHGYFt");
        setField(term382, term382.getClass(), "formula", "tShwQLRGNe");
        setField(term382, term382.getClass(), "descriptions", term409);
        setField(term382, term382.getClass(), "levels", term428);
        setField(term382, term382.getClass(), "pokemonSpecies", term442);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.growthrate.GrowthRate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFormula", argTypes, term382, args);
    }

};


