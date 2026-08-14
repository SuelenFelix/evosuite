package skaro.pokeapi.resource.encountermethod;

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
import static skaro.pokeapi.resource.encountermethod.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class EncounterMethod_setName_21287827664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132;

    public EncounterMethod_setName_21287827664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term133 = new Integer(-2038273078);
        Integer term147 = new Integer(1227103734);
        Object term151 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term153 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term151, term151.getClass(), "name", "");
        setField(term153, term153.getClass(), "name", null);
        setField(term153, term153.getClass(), "url", null);
        setField(term151, term151.getClass(), "language", term153);
        Object term154 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term156 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term154, term154.getClass(), "name", "");
        setField(term156, term156.getClass(), "name", null);
        setField(term156, term156.getClass(), "url", null);
        setField(term154, term154.getClass(), "language", term156);
        Object term157 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term159 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term157, term157.getClass(), "name", "");
        setField(term159, term159.getClass(), "name", null);
        setField(term159, term159.getClass(), "url", null);
        setField(term157, term157.getClass(), "language", term159);
        Object term160 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term162 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term160, term160.getClass(), "name", "");
        setField(term162, term162.getClass(), "name", null);
        setField(term162, term162.getClass(), "url", null);
        setField(term160, term160.getClass(), "language", term162);
        ArrayList term149 = new ArrayList();
        ((ArrayList) term149).add(term151);
        ((ArrayList) term149).add(term154);
        ((ArrayList) term149).add(term157);
        ((ArrayList) term149).add(term160);
        term132 = newInstance(Class.forName("skaro.pokeapi.resource.encountermethod.EncounterMethod"));
        setField(term132, term132.getClass(), "id", term133);
        setField(term132, term132.getClass(), "name", "aKnKipADSo");
        setField(term132, term132.getClass(), "order", term147);
        setField(term132, term132.getClass(), "names", term149);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.encountermethod.EncounterMethod");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UoYtihxVaS";
        callMethod(klass, "setName", argTypes, term132, args);
    }

};


