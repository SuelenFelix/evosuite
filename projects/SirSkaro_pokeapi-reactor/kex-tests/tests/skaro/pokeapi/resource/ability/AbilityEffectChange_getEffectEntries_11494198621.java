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
import java.util.ArrayList;
import java.lang.Object;

public class AbilityEffectChange_getEffectEntries_11494198621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4498;

    public AbilityEffectChange_getEffectEntries_11494198621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4501 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term4503 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4501, term4501.getClass(), "effect", "");
        setField(term4503, term4503.getClass(), "name", null);
        setField(term4503, term4503.getClass(), "url", null);
        setField(term4501, term4501.getClass(), "language", term4503);
        Object term4504 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term4506 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4504, term4504.getClass(), "effect", "");
        setField(term4506, term4506.getClass(), "name", null);
        setField(term4506, term4506.getClass(), "url", null);
        setField(term4504, term4504.getClass(), "language", term4506);
        Object term4507 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term4509 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4507, term4507.getClass(), "effect", "");
        setField(term4509, term4509.getClass(), "name", null);
        setField(term4509, term4509.getClass(), "url", null);
        setField(term4507, term4507.getClass(), "language", term4509);
        Object term4510 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term4512 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4510, term4510.getClass(), "effect", "");
        setField(term4512, term4512.getClass(), "name", null);
        setField(term4512, term4512.getClass(), "url", null);
        setField(term4510, term4510.getClass(), "language", term4512);
        Object term4513 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term4515 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4513, term4513.getClass(), "effect", "");
        setField(term4515, term4515.getClass(), "name", null);
        setField(term4515, term4515.getClass(), "url", null);
        setField(term4513, term4513.getClass(), "language", term4515);
        Object term4516 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term4518 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4516, term4516.getClass(), "effect", "");
        setField(term4518, term4518.getClass(), "name", null);
        setField(term4518, term4518.getClass(), "url", null);
        setField(term4516, term4516.getClass(), "language", term4518);
        Object term4519 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term4521 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4519, term4519.getClass(), "effect", "");
        setField(term4521, term4521.getClass(), "name", null);
        setField(term4521, term4521.getClass(), "url", null);
        setField(term4519, term4519.getClass(), "language", term4521);
        ArrayList term4499 = new ArrayList();
        ((ArrayList) term4499).add(term4501);
        ((ArrayList) term4499).add(term4504);
        ((ArrayList) term4499).add(term4507);
        ((ArrayList) term4499).add(term4510);
        ((ArrayList) term4499).add(term4513);
        ((ArrayList) term4499).add(term4516);
        ((ArrayList) term4499).add(term4519);
        term4498 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityEffectChange"));
        Object term4524 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4498, term4498.getClass(), "effectEntries", term4499);
        setField(term4524, term4524.getClass(), "name", "FxSvJCIpul");
        setField(term4524, term4524.getClass(), "url", "HCjKwpexJj");
        setField(term4498, term4498.getClass(), "versionGroup", term4524);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.ability.AbilityEffectChange");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEffectEntries", argTypes, term4498, args);
    }

};


