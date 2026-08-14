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

public class GrowthRate_getName_13339078083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173;

    public GrowthRate_getName_13339078083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term174 = new Integer(-883034806);
        Object term202 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term204 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term202, term202.getClass(), "description", "");
        setField(term204, term204.getClass(), "name", null);
        setField(term204, term204.getClass(), "url", null);
        setField(term202, term202.getClass(), "language", term204);
        Object term205 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term207 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term205, term205.getClass(), "description", "");
        setField(term207, term207.getClass(), "name", null);
        setField(term207, term207.getClass(), "url", null);
        setField(term205, term205.getClass(), "language", term207);
        ArrayList term200 = new ArrayList();
        ((ArrayList) term200).add(term202);
        ((ArrayList) term200).add(term205);
        Integer term213 = new Integer(1585847225);
        Integer term215 = new Integer(597278769);
        Object term212 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term212, term212.getClass(), "level", term213);
        setField(term212, term212.getClass(), "experience", term215);
        Integer term218 = new Integer(-1685132342);
        Integer term220 = new Integer(-1456670397);
        Object term217 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term217, term217.getClass(), "level", term218);
        setField(term217, term217.getClass(), "experience", term220);
        Integer term223 = new Integer(1622346318);
        Integer term225 = new Integer(1048535127);
        Object term222 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term222, term222.getClass(), "level", term223);
        setField(term222, term222.getClass(), "experience", term225);
        Integer term228 = new Integer(-655067527);
        Integer term230 = new Integer(-6029667);
        Object term227 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term227, term227.getClass(), "level", term228);
        setField(term227, term227.getClass(), "experience", term230);
        Integer term233 = new Integer(-2068769794);
        Integer term235 = new Integer(-117576464);
        Object term232 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term232, term232.getClass(), "level", term233);
        setField(term232, term232.getClass(), "experience", term235);
        Integer term238 = new Integer(-1007160944);
        Integer term240 = new Integer(1135664017);
        Object term237 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term237, term237.getClass(), "level", term238);
        setField(term237, term237.getClass(), "experience", term240);
        ArrayList term210 = new ArrayList();
        ((ArrayList) term210).add(term212);
        ((ArrayList) term210).add(term217);
        ((ArrayList) term210).add(term222);
        ((ArrayList) term210).add(term227);
        ((ArrayList) term210).add(term232);
        ((ArrayList) term210).add(term237);
        ArrayList term244 = new ArrayList();
        term173 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRate"));
        setField(term173, term173.getClass(), "id", term174);
        setField(term173, term173.getClass(), "name", "dWRymuLBtr");
        setField(term173, term173.getClass(), "formula", "AijpHYOFuy");
        setField(term173, term173.getClass(), "descriptions", term200);
        setField(term173, term173.getClass(), "levels", term210);
        setField(term173, term173.getClass(), "pokemonSpecies", term244);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.growthrate.GrowthRate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term173, args);
    }

};


