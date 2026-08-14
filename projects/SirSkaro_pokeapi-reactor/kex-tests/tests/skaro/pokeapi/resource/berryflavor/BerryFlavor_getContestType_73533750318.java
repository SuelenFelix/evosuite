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

public class BerryFlavor_getContestType_73533750318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1394;

    public BerryFlavor_getContestType_73533750318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1394 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor"));
        setField(term1394, term1394.getClass(), "id", null);
        setField(term1394, term1394.getClass(), "name", null);
        setField(term1394, term1394.getClass(), "barries", null);
        setField(term1394, term1394.getClass(), "contestType", null);
        setField(term1394, term1394.getClass(), "names", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContestType", argTypes, term1394, args);
    }

};


