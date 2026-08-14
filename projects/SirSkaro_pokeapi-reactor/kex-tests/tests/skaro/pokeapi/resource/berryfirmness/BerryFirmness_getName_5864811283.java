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

public class BerryFirmness_getName_5864811283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93;

    public BerryFirmness_getName_5864811283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term94 = new Integer(391863371);
        ArrayList term108 = new ArrayList();
        Object term114 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term116 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term114, term114.getClass(), "name", "");
        setField(term116, term116.getClass(), "name", null);
        setField(term116, term116.getClass(), "url", null);
        setField(term114, term114.getClass(), "language", term116);
        Object term117 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term119 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term117, term117.getClass(), "name", "");
        setField(term119, term119.getClass(), "name", null);
        setField(term119, term119.getClass(), "url", null);
        setField(term117, term117.getClass(), "language", term119);
        Object term120 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term122 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term120, term120.getClass(), "name", "");
        setField(term122, term122.getClass(), "name", null);
        setField(term122, term122.getClass(), "url", null);
        setField(term120, term120.getClass(), "language", term122);
        Object term123 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term125 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term123, term123.getClass(), "name", "");
        setField(term125, term125.getClass(), "name", null);
        setField(term125, term125.getClass(), "url", null);
        setField(term123, term123.getClass(), "language", term125);
        Object term126 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term128 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term126, term126.getClass(), "name", "");
        setField(term128, term128.getClass(), "name", null);
        setField(term128, term128.getClass(), "url", null);
        setField(term126, term126.getClass(), "language", term128);
        Object term129 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term131 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term129, term129.getClass(), "name", "");
        setField(term131, term131.getClass(), "name", null);
        setField(term131, term131.getClass(), "url", null);
        setField(term129, term129.getClass(), "language", term131);
        ArrayList term112 = new ArrayList();
        ((ArrayList) term112).add(term114);
        ((ArrayList) term112).add(term117);
        ((ArrayList) term112).add(term120);
        ((ArrayList) term112).add(term123);
        ((ArrayList) term112).add(term126);
        ((ArrayList) term112).add(term129);
        term93 = newInstance(Class.forName("skaro.pokeapi.resource.berryfirmness.BerryFirmness"));
        setField(term93, term93.getClass(), "id", term94);
        setField(term93, term93.getClass(), "name", "flxyYxBRtu");
        setField(term93, term93.getClass(), "berries", term108);
        setField(term93, term93.getClass(), "names", term112);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berryfirmness.BerryFirmness");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term93, args);
    }

};


