package skaro.pokeapi.resource.version;

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
import static skaro.pokeapi.resource.version.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class Version_setVersionGroup_18803492948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term666;
     Object term737;

    public Version_setVersionGroup_18803492948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term667 = new Integer(1227103734);
        Object term683 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term685 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term683, term683.getClass(), "name", "");
        setField(term685, term685.getClass(), "name", null);
        setField(term685, term685.getClass(), "url", null);
        setField(term683, term683.getClass(), "language", term685);
        Object term686 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term688 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term686, term686.getClass(), "name", "");
        setField(term688, term688.getClass(), "name", null);
        setField(term688, term688.getClass(), "url", null);
        setField(term686, term686.getClass(), "language", term688);
        Object term689 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term691 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term689, term689.getClass(), "name", "");
        setField(term691, term691.getClass(), "name", null);
        setField(term691, term691.getClass(), "url", null);
        setField(term689, term689.getClass(), "language", term691);
        Object term692 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term694 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term692, term692.getClass(), "name", "");
        setField(term694, term694.getClass(), "name", null);
        setField(term694, term694.getClass(), "url", null);
        setField(term692, term692.getClass(), "language", term694);
        Object term695 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term697 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term695, term695.getClass(), "name", "");
        setField(term697, term697.getClass(), "name", null);
        setField(term697, term697.getClass(), "url", null);
        setField(term695, term695.getClass(), "language", term697);
        Object term698 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term700 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term698, term698.getClass(), "name", "");
        setField(term700, term700.getClass(), "name", null);
        setField(term700, term700.getClass(), "url", null);
        setField(term698, term698.getClass(), "language", term700);
        Object term701 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term703 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term701, term701.getClass(), "name", "");
        setField(term703, term703.getClass(), "name", null);
        setField(term703, term703.getClass(), "url", null);
        setField(term701, term701.getClass(), "language", term703);
        Object term704 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term706 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term704, term704.getClass(), "name", "");
        setField(term706, term706.getClass(), "name", null);
        setField(term706, term706.getClass(), "url", null);
        setField(term704, term704.getClass(), "language", term706);
        Object term707 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term709 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term707, term707.getClass(), "name", "");
        setField(term709, term709.getClass(), "name", null);
        setField(term709, term709.getClass(), "url", null);
        setField(term707, term707.getClass(), "language", term709);
        ArrayList term681 = new ArrayList();
        ((ArrayList) term681).add(term683);
        ((ArrayList) term681).add(term686);
        ((ArrayList) term681).add(term689);
        ((ArrayList) term681).add(term692);
        ((ArrayList) term681).add(term695);
        ((ArrayList) term681).add(term698);
        ((ArrayList) term681).add(term701);
        ((ArrayList) term681).add(term704);
        ((ArrayList) term681).add(term707);
        term666 = newInstance(Class.forName("skaro.pokeapi.resource.version.Version"));
        Object term712 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term666, term666.getClass(), "id", term667);
        setField(term666, term666.getClass(), "name", "xBsXSDjXYK");
        setField(term666, term666.getClass(), "names", term681);
        setField(term712, term712.getClass(), "name", "gCWtLVKVVe");
        setField(term712, term712.getClass(), "url", "fWKJoSoCwE");
        setField(term666, term666.getClass(), "versionGroup", term712);
        term737 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term737, term737.getClass(), "name", "PznxWXsZME");
        setField(term737, term737.getClass(), "url", "ZzIujlwVsw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.version.Version");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term737;
        callMethod(klass, "setVersionGroup", argTypes, term666, args);
    }

};


