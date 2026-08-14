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

public class Location_getAreas_159663980015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125386;

    public Location_getAreas_159663980015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term125387 = new Integer(1966933092);
        Object term125428 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term125430 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term125428, term125428.getClass(), "name", "");
        setField(term125430, term125430.getClass(), "name", null);
        setField(term125430, term125430.getClass(), "url", null);
        setField(term125428, term125428.getClass(), "language", term125430);
        Object term125431 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term125433 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term125431, term125431.getClass(), "name", "");
        setField(term125433, term125433.getClass(), "name", null);
        setField(term125433, term125433.getClass(), "url", null);
        setField(term125431, term125431.getClass(), "language", term125433);
        Object term125434 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term125436 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term125434, term125434.getClass(), "name", "");
        setField(term125436, term125436.getClass(), "name", null);
        setField(term125436, term125436.getClass(), "url", null);
        setField(term125434, term125434.getClass(), "language", term125436);
        ArrayList term125426 = new ArrayList();
        ((ArrayList) term125426).add(term125428);
        ((ArrayList) term125426).add(term125431);
        ((ArrayList) term125426).add(term125434);
        Integer term125442 = new Integer(1108791337);
        Object term125441 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term125444 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term125441, term125441.getClass(), "gameIndex", term125442);
        setField(term125444, term125444.getClass(), "name", null);
        setField(term125444, term125444.getClass(), "url", null);
        setField(term125441, term125441.getClass(), "generation", term125444);
        Integer term125446 = new Integer(-414682663);
        Object term125445 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term125448 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term125445, term125445.getClass(), "gameIndex", term125446);
        setField(term125448, term125448.getClass(), "name", null);
        setField(term125448, term125448.getClass(), "url", null);
        setField(term125445, term125445.getClass(), "generation", term125448);
        Integer term125450 = new Integer(259051944);
        Object term125449 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term125452 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term125449, term125449.getClass(), "gameIndex", term125450);
        setField(term125452, term125452.getClass(), "name", null);
        setField(term125452, term125452.getClass(), "url", null);
        setField(term125449, term125449.getClass(), "generation", term125452);
        Integer term125454 = new Integer(-958789263);
        Object term125453 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term125456 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term125453, term125453.getClass(), "gameIndex", term125454);
        setField(term125456, term125456.getClass(), "name", null);
        setField(term125456, term125456.getClass(), "url", null);
        setField(term125453, term125453.getClass(), "generation", term125456);
        Integer term125458 = new Integer(120623003);
        Object term125457 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term125460 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term125457, term125457.getClass(), "gameIndex", term125458);
        setField(term125460, term125460.getClass(), "name", null);
        setField(term125460, term125460.getClass(), "url", null);
        setField(term125457, term125457.getClass(), "generation", term125460);
        Integer term125462 = new Integer(-1236935869);
        Object term125461 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term125464 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term125461, term125461.getClass(), "gameIndex", term125462);
        setField(term125464, term125464.getClass(), "name", null);
        setField(term125464, term125464.getClass(), "url", null);
        setField(term125461, term125461.getClass(), "generation", term125464);
        ArrayList term125439 = new ArrayList();
        ((ArrayList) term125439).add(term125441);
        ((ArrayList) term125439).add(term125445);
        ((ArrayList) term125439).add(term125449);
        ((ArrayList) term125439).add(term125453);
        ((ArrayList) term125439).add(term125457);
        ((ArrayList) term125439).add(term125461);
        ArrayList term125467 = new ArrayList();
        term125386 = newInstance(Class.forName("skaro.pokeapi.resource.location.Location"));
        Object term125401 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term125386, term125386.getClass(), "id", term125387);
        setField(term125386, term125386.getClass(), "name", "uAZaHLyPyC");
        setField(term125401, term125401.getClass(), "name", "MQnYdXEvgP");
        setField(term125401, term125401.getClass(), "url", "GyjASJrZrH");
        setField(term125386, term125386.getClass(), "region", term125401);
        setField(term125386, term125386.getClass(), "names", term125426);
        setField(term125386, term125386.getClass(), "gameIndices", term125439);
        setField(term125386, term125386.getClass(), "areas", term125467);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.location.Location");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAreas", argTypes, term125386, args);
    }

};


