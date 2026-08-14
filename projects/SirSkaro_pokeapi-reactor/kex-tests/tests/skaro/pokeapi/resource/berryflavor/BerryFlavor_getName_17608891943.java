package skaro.pokeapi.resource.berryflavor;

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
import static skaro.pokeapi.resource.berryflavor.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class BerryFlavor_getName_17608891943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term458;

    public BerryFlavor_getName_17608891943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term459 = new Integer(-1685132342);
        Integer term476 = new Integer(-1456670397);
        Object term475 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term478 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term475, term475.getClass(), "potency", term476);
        setField(term478, term478.getClass(), "name", null);
        setField(term478, term478.getClass(), "url", null);
        setField(term475, term475.getClass(), "berry", term478);
        ArrayList term473 = new ArrayList();
        ((ArrayList) term473).add(term475);
        Object term508 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term510 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term508, term508.getClass(), "name", "");
        setField(term510, term510.getClass(), "name", null);
        setField(term510, term510.getClass(), "url", null);
        setField(term508, term508.getClass(), "language", term510);
        Object term511 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term513 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term511, term511.getClass(), "name", "");
        setField(term513, term513.getClass(), "name", null);
        setField(term513, term513.getClass(), "url", null);
        setField(term511, term511.getClass(), "language", term513);
        Object term514 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term516 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term514, term514.getClass(), "name", "");
        setField(term516, term516.getClass(), "name", null);
        setField(term516, term516.getClass(), "url", null);
        setField(term514, term514.getClass(), "language", term516);
        Object term517 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term519 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term517, term517.getClass(), "name", "");
        setField(term519, term519.getClass(), "name", null);
        setField(term519, term519.getClass(), "url", null);
        setField(term517, term517.getClass(), "language", term519);
        Object term520 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term522 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term520, term520.getClass(), "name", "");
        setField(term522, term522.getClass(), "name", null);
        setField(term522, term522.getClass(), "url", null);
        setField(term520, term520.getClass(), "language", term522);
        Object term523 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term525 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term523, term523.getClass(), "name", "");
        setField(term525, term525.getClass(), "name", null);
        setField(term525, term525.getClass(), "url", null);
        setField(term523, term523.getClass(), "language", term525);
        ArrayList term506 = new ArrayList();
        ((ArrayList) term506).add(term508);
        ((ArrayList) term506).add(term511);
        ((ArrayList) term506).add(term514);
        ((ArrayList) term506).add(term517);
        ((ArrayList) term506).add(term520);
        ((ArrayList) term506).add(term523);
        term458 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor"));
        Object term481 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term458, term458.getClass(), "id", term459);
        setField(term458, term458.getClass(), "name", "ytSBIKXogI");
        setField(term458, term458.getClass(), "barries", term473);
        setField(term481, term481.getClass(), "name", "dEnhdmILtU");
        setField(term481, term481.getClass(), "url", "hoicvmsovO");
        setField(term458, term458.getClass(), "contestType", term481);
        setField(term458, term458.getClass(), "names", term506);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term458, args);
    }

};


