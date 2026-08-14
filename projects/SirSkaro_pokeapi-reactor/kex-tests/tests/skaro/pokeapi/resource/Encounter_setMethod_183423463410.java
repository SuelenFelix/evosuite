package skaro.pokeapi.resource;

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
import static skaro.pokeapi.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class Encounter_setMethod_183423463410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5633;
     Object term5669;

    public Encounter_setMethod_183423463410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5634 = new Integer(299791142);
        Integer term5636 = new Integer(1862191391);
        ArrayList term5638 = new ArrayList();
        Integer term5642 = new Integer(1131398807);
        term5633 = newInstance(Class.forName("skaro.pokeapi.resource.Encounter"));
        Object term5644 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5633, term5633.getClass(), "minLevel", term5634);
        setField(term5633, term5633.getClass(), "maxLevel", term5636);
        setField(term5633, term5633.getClass(), "conditionValues", term5638);
        setField(term5633, term5633.getClass(), "chance", term5642);
        setField(term5644, term5644.getClass(), "name", "PVykkUSgBq");
        setField(term5644, term5644.getClass(), "url", "tnKbZaCsuj");
        setField(term5633, term5633.getClass(), "method", term5644);
        term5669 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5669, term5669.getClass(), "name", "eKcEJRxNSu");
        setField(term5669, term5669.getClass(), "url", "NTXQPWFYSA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.Encounter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term5669;
        callMethod(klass, "setMethod", argTypes, term5633, args);
    }

};


