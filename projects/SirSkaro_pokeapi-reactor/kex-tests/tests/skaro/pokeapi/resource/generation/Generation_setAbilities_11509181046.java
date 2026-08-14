package skaro.pokeapi.resource.generation;

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
import static skaro.pokeapi.resource.generation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class Generation_setAbilities_11509181046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term342;
     Object term399;

    public Generation_setAbilities_11509181046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term343 = new Integer(-1955890973);
        ArrayList term357 = new ArrayList();
        Object term363 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term365 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term363, term363.getClass(), "name", "");
        setField(term365, term365.getClass(), "name", null);
        setField(term365, term365.getClass(), "url", null);
        setField(term363, term363.getClass(), "language", term365);
        Object term366 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term368 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term366, term366.getClass(), "name", "");
        setField(term368, term368.getClass(), "name", null);
        setField(term368, term368.getClass(), "url", null);
        setField(term366, term366.getClass(), "language", term368);
        Object term369 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term371 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term369, term369.getClass(), "name", "");
        setField(term371, term371.getClass(), "name", null);
        setField(term371, term371.getClass(), "url", null);
        setField(term369, term369.getClass(), "language", term371);
        Object term372 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term374 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term372, term372.getClass(), "name", "");
        setField(term374, term374.getClass(), "name", null);
        setField(term374, term374.getClass(), "url", null);
        setField(term372, term372.getClass(), "language", term374);
        Object term375 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term377 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term375, term375.getClass(), "name", "");
        setField(term377, term377.getClass(), "name", null);
        setField(term377, term377.getClass(), "url", null);
        setField(term375, term375.getClass(), "language", term377);
        Object term378 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term380 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term378, term378.getClass(), "name", "");
        setField(term380, term380.getClass(), "name", null);
        setField(term380, term380.getClass(), "url", null);
        setField(term378, term378.getClass(), "language", term380);
        ArrayList term361 = new ArrayList();
        ((ArrayList) term361).add(term363);
        ((ArrayList) term361).add(term366);
        ((ArrayList) term361).add(term369);
        ((ArrayList) term361).add(term372);
        ((ArrayList) term361).add(term375);
        ((ArrayList) term361).add(term378);
        ArrayList term383 = new ArrayList();
        ArrayList term387 = new ArrayList();
        ArrayList term391 = new ArrayList();
        ArrayList term395 = new ArrayList();
        term342 = newInstance(Class.forName("skaro.pokeapi.resource.generation.Generation"));
        setField(term342, term342.getClass(), "id", term343);
        setField(term342, term342.getClass(), "name", "OWKQODBLzb");
        setField(term342, term342.getClass(), "abilities", term357);
        setField(term342, term342.getClass(), "names", term361);
        setField(term342, term342.getClass(), "moves", term383);
        setField(term342, term342.getClass(), "pokemonSpecies", term387);
        setField(term342, term342.getClass(), "types", term391);
        setField(term342, term342.getClass(), "versionGroups", term395);
        Object term402 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term402, term402.getClass(), "name", "BKLfkLiZTH");
        setField(term402, term402.getClass(), "url", "SPpkrGcPRr");
        term399 = new LinkedList();
        ((LinkedList) term399).add(term402);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.generation.Generation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term399;
        callMethod(klass, "setAbilities", argTypes, term342, args);
    }

};


