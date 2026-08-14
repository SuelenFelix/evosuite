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

public class GrowthRate_setName_12411829204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268;

    public GrowthRate_setName_12411829204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term269 = new Integer(590364439);
        Object term297 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term299 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term297, term297.getClass(), "description", "");
        setField(term299, term299.getClass(), "name", null);
        setField(term299, term299.getClass(), "url", null);
        setField(term297, term297.getClass(), "language", term299);
        ArrayList term295 = new ArrayList();
        ((ArrayList) term295).add(term297);
        Integer term305 = new Integer(865208305);
        Integer term307 = new Integer(-1275173084);
        Object term304 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term304, term304.getClass(), "level", term305);
        setField(term304, term304.getClass(), "experience", term307);
        Integer term310 = new Integer(-244121226);
        Integer term312 = new Integer(-203030934);
        Object term309 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term309, term309.getClass(), "level", term310);
        setField(term309, term309.getClass(), "experience", term312);
        Integer term315 = new Integer(-1179120542);
        Integer term317 = new Integer(-73683645);
        Object term314 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term314, term314.getClass(), "level", term315);
        setField(term314, term314.getClass(), "experience", term317);
        Integer term320 = new Integer(-226514366);
        Integer term322 = new Integer(1193880199);
        Object term319 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term319, term319.getClass(), "level", term320);
        setField(term319, term319.getClass(), "experience", term322);
        Integer term325 = new Integer(-1087774327);
        Integer term327 = new Integer(-1530420153);
        Object term324 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term324, term324.getClass(), "level", term325);
        setField(term324, term324.getClass(), "experience", term327);
        Integer term330 = new Integer(-469968304);
        Integer term332 = new Integer(-1145578966);
        Object term329 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term329, term329.getClass(), "level", term330);
        setField(term329, term329.getClass(), "experience", term332);
        ArrayList term302 = new ArrayList();
        ((ArrayList) term302).add(term304);
        ((ArrayList) term302).add(term309);
        ((ArrayList) term302).add(term314);
        ((ArrayList) term302).add(term319);
        ((ArrayList) term302).add(term324);
        ((ArrayList) term302).add(term329);
        ArrayList term336 = new ArrayList();
        term268 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRate"));
        setField(term268, term268.getClass(), "id", term269);
        setField(term268, term268.getClass(), "name", "aKnKipADSo");
        setField(term268, term268.getClass(), "formula", "wSQxaModmm");
        setField(term268, term268.getClass(), "descriptions", term295);
        setField(term268, term268.getClass(), "levels", term302);
        setField(term268, term268.getClass(), "pokemonSpecies", term336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.growthrate.GrowthRate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BndsHwAFMv";
        callMethod(klass, "setName", argTypes, term268, args);
    }

};


