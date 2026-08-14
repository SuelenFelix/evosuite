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

public class AbilityFlavorText_setVersionGroup_6016188496 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4334;
     Object term4397;

    public AbilityFlavorText_setVersionGroup_6016188496() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4334 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityFlavorText"));
        Object term4347 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4372 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4334, term4334.getClass(), "flavorText", "OTSPWPJefj");
        setField(term4347, term4347.getClass(), "name", "EOTYMqXRmE");
        setField(term4347, term4347.getClass(), "url", "iTxNduwSjE");
        setField(term4334, term4334.getClass(), "language", term4347);
        setField(term4372, term4372.getClass(), "name", "MQUTfIiFnh");
        setField(term4372, term4372.getClass(), "url", "JeyKRznnft");
        setField(term4334, term4334.getClass(), "versionGroup", term4372);
        term4397 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4397, term4397.getClass(), "name", "gSAtqakaLY");
        setField(term4397, term4397.getClass(), "url", "taPBiMFNEZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.ability.AbilityFlavorText");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term4397;
        callMethod(klass, "setVersionGroup", argTypes, term4334, args);
    }

};


