package skaro.pokeapi.resource.nature;

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
import static skaro.pokeapi.resource.nature.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class Nature_getHatesFlavor_10913910810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18356;

    public Nature_getHatesFlavor_10913910810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term18357 = new Integer(1415142780);
        Object term18473 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term18475 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term18473, term18473.getClass(), "name", "");
        setField(term18475, term18475.getClass(), "name", null);
        setField(term18475, term18475.getClass(), "url", null);
        setField(term18473, term18473.getClass(), "language", term18475);
        Object term18476 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term18478 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term18476, term18476.getClass(), "name", "");
        setField(term18478, term18478.getClass(), "name", null);
        setField(term18478, term18478.getClass(), "url", null);
        setField(term18476, term18476.getClass(), "language", term18478);
        ArrayList term18471 = new ArrayList();
        ((ArrayList) term18471).add(term18473);
        ((ArrayList) term18471).add(term18476);
        term18356 = newInstance(Class.forName("skaro.pokeapi.resource.nature.Nature"));
        Object term18371 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term18396 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term18421 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term18446 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term18356, term18356.getClass(), "id", term18357);
        setField(term18356, term18356.getClass(), "name", "HxIZqtNMYu");
        setField(term18371, term18371.getClass(), "name", "NVlTBmmeHa");
        setField(term18371, term18371.getClass(), "url", "QZomwNJvGF");
        setField(term18356, term18356.getClass(), "decreasedStat", term18371);
        setField(term18396, term18396.getClass(), "name", "qfHzTgyYaj");
        setField(term18396, term18396.getClass(), "url", "BzOSSnQpxM");
        setField(term18356, term18356.getClass(), "increasedStat", term18396);
        setField(term18421, term18421.getClass(), "name", "LoFkuWLahf");
        setField(term18421, term18421.getClass(), "url", "GwcCGdSyQT");
        setField(term18356, term18356.getClass(), "hatesFlavor", term18421);
        setField(term18446, term18446.getClass(), "name", "pQLjQOCQOz");
        setField(term18446, term18446.getClass(), "url", "RaVKdrEtNk");
        setField(term18356, term18356.getClass(), "likesFlavor", term18446);
        setField(term18356, term18356.getClass(), "names", term18471);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.nature.Nature");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHatesFlavor", argTypes, term18356, args);
    }

};


