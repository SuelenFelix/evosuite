package skaro.pokeapi.resource.location;

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
import static skaro.pokeapi.resource.location.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedList;

public class Location_setGameIndices_33051705114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125277;
     Object term125353;

    public Location_setGameIndices_33051705114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term125278 = new Integer(1676102379);
        Object term125319 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term125321 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term125319, term125319.getClass(), "name", "");
        setField(term125321, term125321.getClass(), "name", null);
        setField(term125321, term125321.getClass(), "url", null);
        setField(term125319, term125319.getClass(), "language", term125321);
        Object term125322 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term125324 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term125322, term125322.getClass(), "name", "");
        setField(term125324, term125324.getClass(), "name", null);
        setField(term125324, term125324.getClass(), "url", null);
        setField(term125322, term125322.getClass(), "language", term125324);
        Object term125325 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term125327 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term125325, term125325.getClass(), "name", "");
        setField(term125327, term125327.getClass(), "name", null);
        setField(term125327, term125327.getClass(), "url", null);
        setField(term125325, term125325.getClass(), "language", term125327);
        Object term125328 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term125330 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term125328, term125328.getClass(), "name", "");
        setField(term125330, term125330.getClass(), "name", null);
        setField(term125330, term125330.getClass(), "url", null);
        setField(term125328, term125328.getClass(), "language", term125330);
        ArrayList term125317 = new ArrayList();
        ((ArrayList) term125317).add(term125319);
        ((ArrayList) term125317).add(term125322);
        ((ArrayList) term125317).add(term125325);
        ((ArrayList) term125317).add(term125328);
        Integer term125336 = new Integer(1215582502);
        Object term125335 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term125338 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term125335, term125335.getClass(), "gameIndex", term125336);
        setField(term125338, term125338.getClass(), "name", null);
        setField(term125338, term125338.getClass(), "url", null);
        setField(term125335, term125335.getClass(), "generation", term125338);
        Integer term125340 = new Integer(997123385);
        Object term125339 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term125342 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term125339, term125339.getClass(), "gameIndex", term125340);
        setField(term125342, term125342.getClass(), "name", null);
        setField(term125342, term125342.getClass(), "url", null);
        setField(term125339, term125339.getClass(), "generation", term125342);
        Integer term125344 = new Integer(-171991376);
        Object term125343 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term125346 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term125343, term125343.getClass(), "gameIndex", term125344);
        setField(term125346, term125346.getClass(), "name", null);
        setField(term125346, term125346.getClass(), "url", null);
        setField(term125343, term125343.getClass(), "generation", term125346);
        ArrayList term125333 = new ArrayList();
        ((ArrayList) term125333).add(term125335);
        ((ArrayList) term125333).add(term125339);
        ((ArrayList) term125333).add(term125343);
        ArrayList term125349 = new ArrayList();
        term125277 = newInstance(Class.forName("skaro.pokeapi.resource.location.Location"));
        Object term125292 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term125277, term125277.getClass(), "id", term125278);
        setField(term125277, term125277.getClass(), "name", "qAxOoCZVfj");
        setField(term125292, term125292.getClass(), "name", "kyChxApBnI");
        setField(term125292, term125292.getClass(), "url", "fQwTstCxbn");
        setField(term125277, term125277.getClass(), "region", term125292);
        setField(term125277, term125277.getClass(), "names", term125317);
        setField(term125277, term125277.getClass(), "gameIndices", term125333);
        setField(term125277, term125277.getClass(), "areas", term125349);
        term125353 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.location.Location");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term125353;
        callMethod(klass, "setGameIndices", argTypes, term125277, args);
    }

};


