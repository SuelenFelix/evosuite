package skaro.pokeapi.resource.region;

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
import static skaro.pokeapi.resource.region.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class Region_getNames_5373241387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term604;

    public Region_getNames_5373241387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term605 = new Integer(-2038273078);
        ArrayList term607 = new ArrayList();
        Object term625 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term627 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term625, term625.getClass(), "name", "");
        setField(term627, term627.getClass(), "name", null);
        setField(term627, term627.getClass(), "url", null);
        setField(term625, term625.getClass(), "language", term627);
        Object term628 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term630 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term628, term628.getClass(), "name", "");
        setField(term630, term630.getClass(), "name", null);
        setField(term630, term630.getClass(), "url", null);
        setField(term628, term628.getClass(), "language", term630);
        ArrayList term623 = new ArrayList();
        ((ArrayList) term623).add(term625);
        ((ArrayList) term623).add(term628);
        ArrayList term658 = new ArrayList();
        ArrayList term662 = new ArrayList();
        term604 = newInstance(Class.forName("skaro.pokeapi.resource.region.Region"));
        Object term633 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term604, term604.getClass(), "id", term605);
        setField(term604, term604.getClass(), "locations", term607);
        setField(term604, term604.getClass(), "name", "wGmYcqUkgE");
        setField(term604, term604.getClass(), "names", term623);
        setField(term633, term633.getClass(), "name", "PHvxnGHptP");
        setField(term633, term633.getClass(), "url", "TimdotUuNC");
        setField(term604, term604.getClass(), "mainGeneration", term633);
        setField(term604, term604.getClass(), "pokedexes", term658);
        setField(term604, term604.getClass(), "versionGroups", term662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.region.Region");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNames", argTypes, term604, args);
    }

};


