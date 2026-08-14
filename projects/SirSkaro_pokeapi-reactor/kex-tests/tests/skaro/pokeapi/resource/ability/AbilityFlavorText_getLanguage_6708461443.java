package skaro.pokeapi.resource.ability;

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
import static skaro.pokeapi.resource.ability.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AbilityFlavorText_getLanguage_6708461443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3950;

    public AbilityFlavorText_getLanguage_6708461443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3950 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityFlavorText"));
        Object term3963 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3988 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3950, term3950.getClass(), "flavorText", "TbiwoiebNe");
        setField(term3963, term3963.getClass(), "name", "laTITSWZuc");
        setField(term3963, term3963.getClass(), "url", "fkzRpxlAqS");
        setField(term3950, term3950.getClass(), "language", term3963);
        setField(term3988, term3988.getClass(), "name", "VYvbTGKslj");
        setField(term3988, term3988.getClass(), "url", "owLqDDnwZA");
        setField(term3950, term3950.getClass(), "versionGroup", term3988);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.ability.AbilityFlavorText");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLanguage", argTypes, term3950, args);
    }

};


