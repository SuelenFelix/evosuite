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

public class Generation_getMoves_8714704369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term571;

    public Generation_getMoves_8714704369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term572 = new Integer(-1339778481);
        ArrayList term586 = new ArrayList();
        Object term592 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term594 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term592, term592.getClass(), "name", "");
        setField(term594, term594.getClass(), "name", null);
        setField(term594, term594.getClass(), "url", null);
        setField(term592, term592.getClass(), "language", term594);
        Object term595 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term597 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term595, term595.getClass(), "name", "");
        setField(term597, term597.getClass(), "name", null);
        setField(term597, term597.getClass(), "url", null);
        setField(term595, term595.getClass(), "language", term597);
        Object term598 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term600 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term598, term598.getClass(), "name", "");
        setField(term600, term600.getClass(), "name", null);
        setField(term600, term600.getClass(), "url", null);
        setField(term598, term598.getClass(), "language", term600);
        ArrayList term590 = new ArrayList();
        ((ArrayList) term590).add(term592);
        ((ArrayList) term590).add(term595);
        ((ArrayList) term590).add(term598);
        ArrayList term603 = new ArrayList();
        ArrayList term607 = new ArrayList();
        ArrayList term611 = new ArrayList();
        ArrayList term615 = new ArrayList();
        term571 = newInstance(Class.forName("skaro.pokeapi.resource.generation.Generation"));
        setField(term571, term571.getClass(), "id", term572);
        setField(term571, term571.getClass(), "name", "MvRIxilFMJ");
        setField(term571, term571.getClass(), "abilities", term586);
        setField(term571, term571.getClass(), "names", term590);
        setField(term571, term571.getClass(), "moves", term603);
        setField(term571, term571.getClass(), "pokemonSpecies", term607);
        setField(term571, term571.getClass(), "types", term611);
        setField(term571, term571.getClass(), "versionGroups", term615);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.generation.Generation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMoves", argTypes, term571, args);
    }

};


