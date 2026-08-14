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

public class Encounter_setChance_14102854968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5519;
     Object term5555;

    public Encounter_setChance_14102854968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5520 = new Integer(1801052257);
        Integer term5522 = new Integer(-2110556060);
        ArrayList term5524 = new ArrayList();
        Integer term5528 = new Integer(313459791);
        term5519 = newInstance(Class.forName("skaro.pokeapi.resource.Encounter"));
        Object term5530 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5519, term5519.getClass(), "minLevel", term5520);
        setField(term5519, term5519.getClass(), "maxLevel", term5522);
        setField(term5519, term5519.getClass(), "conditionValues", term5524);
        setField(term5519, term5519.getClass(), "chance", term5528);
        setField(term5530, term5530.getClass(), "name", "LaXzFIlWMk");
        setField(term5530, term5530.getClass(), "url", "GuVQjhBxma");
        setField(term5519, term5519.getClass(), "method", term5530);
        term5555 = new Integer(752615112);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.Encounter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term5555;
        callMethod(klass, "setChance", argTypes, term5519, args);
    }

};


