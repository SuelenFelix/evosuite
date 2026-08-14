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

public class AbilityEffectChange_getVersionGroup_1426853193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4661;

    public AbilityEffectChange_getVersionGroup_1426853193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4664 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term4666 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4664, term4664.getClass(), "effect", "");
        setField(term4666, term4666.getClass(), "name", null);
        setField(term4666, term4666.getClass(), "url", null);
        setField(term4664, term4664.getClass(), "language", term4666);
        Object term4667 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term4669 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4667, term4667.getClass(), "effect", "");
        setField(term4669, term4669.getClass(), "name", null);
        setField(term4669, term4669.getClass(), "url", null);
        setField(term4667, term4667.getClass(), "language", term4669);
        Object term4670 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term4672 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4670, term4670.getClass(), "effect", "");
        setField(term4672, term4672.getClass(), "name", null);
        setField(term4672, term4672.getClass(), "url", null);
        setField(term4670, term4670.getClass(), "language", term4672);
        Object term4673 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term4675 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4673, term4673.getClass(), "effect", "");
        setField(term4675, term4675.getClass(), "name", null);
        setField(term4675, term4675.getClass(), "url", null);
        setField(term4673, term4673.getClass(), "language", term4675);
        Object term4676 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term4678 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4676, term4676.getClass(), "effect", "");
        setField(term4678, term4678.getClass(), "name", null);
        setField(term4678, term4678.getClass(), "url", null);
        setField(term4676, term4676.getClass(), "language", term4678);
        ArrayList term4662 = new ArrayList();
        ((ArrayList) term4662).add(term4664);
        ((ArrayList) term4662).add(term4667);
        ((ArrayList) term4662).add(term4670);
        ((ArrayList) term4662).add(term4673);
        ((ArrayList) term4662).add(term4676);
        term4661 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityEffectChange"));
        Object term4681 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4661, term4661.getClass(), "effectEntries", term4662);
        setField(term4681, term4681.getClass(), "name", "ojLrjltndD");
        setField(term4681, term4681.getClass(), "url", "VJtFSexKat");
        setField(term4661, term4661.getClass(), "versionGroup", term4681);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.ability.AbilityEffectChange");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersionGroup", argTypes, term4661, args);
    }

};


