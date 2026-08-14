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

public class Nature_setId_21224403812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225;
     Object term356;

    public Nature_setId_21224403812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term226 = new Integer(1162663216);
        Object term342 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term344 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term342, term342.getClass(), "name", "");
        setField(term344, term344.getClass(), "name", null);
        setField(term344, term344.getClass(), "url", null);
        setField(term342, term342.getClass(), "language", term344);
        Object term345 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term347 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term345, term345.getClass(), "name", "");
        setField(term347, term347.getClass(), "name", null);
        setField(term347, term347.getClass(), "url", null);
        setField(term345, term345.getClass(), "language", term347);
        Object term348 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term350 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term348, term348.getClass(), "name", "");
        setField(term350, term350.getClass(), "name", null);
        setField(term350, term350.getClass(), "url", null);
        setField(term348, term348.getClass(), "language", term350);
        Object term351 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term353 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term351, term351.getClass(), "name", "");
        setField(term353, term353.getClass(), "name", null);
        setField(term353, term353.getClass(), "url", null);
        setField(term351, term351.getClass(), "language", term353);
        ArrayList term340 = new ArrayList();
        ((ArrayList) term340).add(term342);
        ((ArrayList) term340).add(term345);
        ((ArrayList) term340).add(term348);
        ((ArrayList) term340).add(term351);
        term225 = newInstance(Class.forName("skaro.pokeapi.resource.nature.Nature"));
        Object term240 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term265 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term290 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term315 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term225, term225.getClass(), "id", term226);
        setField(term225, term225.getClass(), "name", "BYqFIqCKAV");
        setField(term240, term240.getClass(), "name", "vrQLuWIDJX");
        setField(term240, term240.getClass(), "url", "flxyYxBRtu");
        setField(term225, term225.getClass(), "decreasedStat", term240);
        setField(term265, term265.getClass(), "name", "OclPbYPkcH");
        setField(term265, term265.getClass(), "url", "IoAlmYsBwc");
        setField(term225, term225.getClass(), "increasedStat", term265);
        setField(term290, term290.getClass(), "name", "TEParAifyi");
        setField(term290, term290.getClass(), "url", "OWDIEULEFu");
        setField(term225, term225.getClass(), "hatesFlavor", term290);
        setField(term315, term315.getClass(), "name", "dWRymuLBtr");
        setField(term315, term315.getClass(), "url", "AijpHYOFuy");
        setField(term225, term225.getClass(), "likesFlavor", term315);
        setField(term225, term225.getClass(), "names", term340);
        term356 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.nature.Nature");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term356;
        callMethod(klass, "setId", argTypes, term225, args);
    }

};


