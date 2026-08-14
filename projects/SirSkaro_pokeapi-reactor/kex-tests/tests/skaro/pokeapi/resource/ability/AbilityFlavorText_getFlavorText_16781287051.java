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

public class AbilityFlavorText_getFlavorText_16781287051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3702;

    public AbilityFlavorText_getFlavorText_16781287051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3702 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityFlavorText"));
        Object term3715 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3740 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3702, term3702.getClass(), "flavorText", "vXiaNiquft");
        setField(term3715, term3715.getClass(), "name", "lucCeiVnYe");
        setField(term3715, term3715.getClass(), "url", "iYwkCLMsbJ");
        setField(term3702, term3702.getClass(), "language", term3715);
        setField(term3740, term3740.getClass(), "name", "MXLsVQWrwc");
        setField(term3740, term3740.getClass(), "url", "lRaSlqzqNY");
        setField(term3702, term3702.getClass(), "versionGroup", term3740);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.ability.AbilityFlavorText");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFlavorText", argTypes, term3702, args);
    }

};


