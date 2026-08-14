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

public class GrowthRateExperienceLevel_getLevel_15293159666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1292;

    public GrowthRateExperienceLevel_getLevel_15293159666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1292 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term1292, term1292.getClass(), "level", null);
        setField(term1292, term1292.getClass(), "experience", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term1292, args);
    }

};


