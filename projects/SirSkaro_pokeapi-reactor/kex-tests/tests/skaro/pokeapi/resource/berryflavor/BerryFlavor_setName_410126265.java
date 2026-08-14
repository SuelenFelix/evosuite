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

public class BerryFlavor_setName_410126265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140323;

    public BerryFlavor_setName_410126265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term140324 = new Integer(1900897223);
        ArrayList term140338 = new ArrayList();
        ArrayList term140367 = new ArrayList();
        term140323 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor"));
        Object term140342 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140323, term140323.getClass(), "id", term140324);
        setField(term140323, term140323.getClass(), "name", "UwoHSJltal");
        setField(term140323, term140323.getClass(), "barries", term140338);
        setField(term140342, term140342.getClass(), "name", "CPYuOERqUI");
        setField(term140342, term140342.getClass(), "url", "KHRVUsdcjQ");
        setField(term140323, term140323.getClass(), "contestType", term140342);
        setField(term140323, term140323.getClass(), "names", term140367);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LsDqMlQmaV";
        callMethod(klass, "setName", argTypes, term140323, args);
    }

};


