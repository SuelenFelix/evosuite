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

public class AbilityEffectChange_setVersionGroup_6755460714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4726;
     Object term4762;

    public AbilityEffectChange_setVersionGroup_6755460714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4729 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term4731 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4729, term4729.getClass(), "effect", "");
        setField(term4731, term4731.getClass(), "name", null);
        setField(term4731, term4731.getClass(), "url", null);
        setField(term4729, term4729.getClass(), "language", term4731);
        Object term4732 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term4734 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4732, term4732.getClass(), "effect", "");
        setField(term4734, term4734.getClass(), "name", null);
        setField(term4734, term4734.getClass(), "url", null);
        setField(term4732, term4732.getClass(), "language", term4734);
        ArrayList term4727 = new ArrayList();
        ((ArrayList) term4727).add(term4729);
        ((ArrayList) term4727).add(term4732);
        term4726 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityEffectChange"));
        Object term4737 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4726, term4726.getClass(), "effectEntries", term4727);
        setField(term4737, term4737.getClass(), "name", "acPRDlpsid");
        setField(term4737, term4737.getClass(), "url", "YyojIzvxLZ");
        setField(term4726, term4726.getClass(), "versionGroup", term4737);
        term4762 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4762, term4762.getClass(), "name", "kXnpLIZTAr");
        setField(term4762, term4762.getClass(), "url", "ZiMAmqpbzk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.ability.AbilityEffectChange");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term4762;
        callMethod(klass, "setVersionGroup", argTypes, term4726, args);
    }

};


