package skaro.pokeapi.resource.berryfirmness;

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
import static skaro.pokeapi.resource.berryfirmness.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class BerryFirmness_setId_19301069652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46;
     Object term81;

    public BerryFirmness_setId_19301069652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term47 = new Integer(1162663216);
        ArrayList term61 = new ArrayList();
        Object term67 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term69 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term67, term67.getClass(), "name", "");
        setField(term69, term69.getClass(), "name", null);
        setField(term69, term69.getClass(), "url", null);
        setField(term67, term67.getClass(), "language", term69);
        Object term70 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term72 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term70, term70.getClass(), "name", "");
        setField(term72, term72.getClass(), "name", null);
        setField(term72, term72.getClass(), "url", null);
        setField(term70, term70.getClass(), "language", term72);
        Object term73 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term75 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term73, term73.getClass(), "name", "");
        setField(term75, term75.getClass(), "name", null);
        setField(term75, term75.getClass(), "url", null);
        setField(term73, term73.getClass(), "language", term75);
        Object term76 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term78 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term76, term76.getClass(), "name", "");
        setField(term78, term78.getClass(), "name", null);
        setField(term78, term78.getClass(), "url", null);
        setField(term76, term76.getClass(), "language", term78);
        ArrayList term65 = new ArrayList();
        ((ArrayList) term65).add(term67);
        ((ArrayList) term65).add(term70);
        ((ArrayList) term65).add(term73);
        ((ArrayList) term65).add(term76);
        term46 = newInstance(Class.forName("skaro.pokeapi.resource.berryfirmness.BerryFirmness"));
        setField(term46, term46.getClass(), "id", term47);
        setField(term46, term46.getClass(), "name", "LQFpaHEwXR");
        setField(term46, term46.getClass(), "berries", term61);
        setField(term46, term46.getClass(), "names", term65);
        term81 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berryfirmness.BerryFirmness");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term81;
        callMethod(klass, "setId", argTypes, term46, args);
    }

};


