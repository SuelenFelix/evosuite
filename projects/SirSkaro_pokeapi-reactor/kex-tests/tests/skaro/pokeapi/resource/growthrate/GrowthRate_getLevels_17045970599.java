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

public class GrowthRate_getLevels_17045970599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term804;

    public GrowthRate_getLevels_17045970599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term805 = new Integer(1063420942);
        Object term833 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term835 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term833, term833.getClass(), "description", "");
        setField(term835, term835.getClass(), "name", null);
        setField(term835, term835.getClass(), "url", null);
        setField(term833, term833.getClass(), "language", term835);
        ArrayList term831 = new ArrayList();
        ((ArrayList) term831).add(term833);
        Integer term841 = new Integer(1375330971);
        Integer term843 = new Integer(-478195677);
        Object term840 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term840, term840.getClass(), "level", term841);
        setField(term840, term840.getClass(), "experience", term843);
        Integer term846 = new Integer(972867650);
        Integer term848 = new Integer(1655935355);
        Object term845 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term845, term845.getClass(), "level", term846);
        setField(term845, term845.getClass(), "experience", term848);
        ArrayList term838 = new ArrayList();
        ((ArrayList) term838).add(term840);
        ((ArrayList) term838).add(term845);
        ArrayList term852 = new ArrayList();
        term804 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRate"));
        setField(term804, term804.getClass(), "id", term805);
        setField(term804, term804.getClass(), "name", "qxSDVejjiY");
        setField(term804, term804.getClass(), "formula", "xBsXSDjXYK");
        setField(term804, term804.getClass(), "descriptions", term831);
        setField(term804, term804.getClass(), "levels", term838);
        setField(term804, term804.getClass(), "pokemonSpecies", term852);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.growthrate.GrowthRate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevels", argTypes, term804, args);
    }

};


