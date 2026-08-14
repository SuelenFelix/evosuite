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
import java.util.LinkedList;

public class AbilityEffectChange_setEffectEntries_1761462002 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4569;
     Object term4611;

    public AbilityEffectChange_setEffectEntries_1761462002() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4572 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term4574 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4572, term4572.getClass(), "effect", "");
        setField(term4574, term4574.getClass(), "name", null);
        setField(term4574, term4574.getClass(), "url", null);
        setField(term4572, term4572.getClass(), "language", term4574);
        Object term4575 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term4577 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4575, term4575.getClass(), "effect", "");
        setField(term4577, term4577.getClass(), "name", null);
        setField(term4577, term4577.getClass(), "url", null);
        setField(term4575, term4575.getClass(), "language", term4577);
        Object term4578 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term4580 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4578, term4578.getClass(), "effect", "");
        setField(term4580, term4580.getClass(), "name", null);
        setField(term4580, term4580.getClass(), "url", null);
        setField(term4578, term4578.getClass(), "language", term4580);
        Object term4581 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term4583 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4581, term4581.getClass(), "effect", "");
        setField(term4583, term4583.getClass(), "name", null);
        setField(term4583, term4583.getClass(), "url", null);
        setField(term4581, term4581.getClass(), "language", term4583);
        ArrayList term4570 = new ArrayList();
        ((ArrayList) term4570).add(term4572);
        ((ArrayList) term4570).add(term4575);
        ((ArrayList) term4570).add(term4578);
        ((ArrayList) term4570).add(term4581);
        term4569 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityEffectChange"));
        Object term4586 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4569, term4569.getClass(), "effectEntries", term4570);
        setField(term4586, term4586.getClass(), "name", "QJrTMTdxyh");
        setField(term4586, term4586.getClass(), "url", "rgZSPplPSs");
        setField(term4569, term4569.getClass(), "versionGroup", term4586);
        Object term4614 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term4627 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4614, term4614.getClass(), "effect", "NPUSTXlEKx");
        setField(term4627, term4627.getClass(), "name", "");
        setField(term4627, term4627.getClass(), "url", "");
        setField(term4614, term4614.getClass(), "language", term4627);
        term4611 = new LinkedList();
        ((LinkedList) term4611).add(term4614);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.ability.AbilityEffectChange");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term4611;
        callMethod(klass, "setEffectEntries", argTypes, term4569, args);
    }

};


