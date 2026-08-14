package skaro.pokeapi.resource.machine;

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
import static skaro.pokeapi.resource.machine.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Machine_getMove_4741479465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term600;

    public Machine_getMove_4741479465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term601 = new Integer(-616727354);
        term600 = newInstance(Class.forName("skaro.pokeapi.resource.machine.Machine"));
        Object term603 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term628 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term653 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term600, term600.getClass(), "id", term601);
        setField(term603, term603.getClass(), "name", "IoAlmYsBwc");
        setField(term603, term603.getClass(), "url", "TEParAifyi");
        setField(term600, term600.getClass(), "item", term603);
        setField(term628, term628.getClass(), "name", "OWDIEULEFu");
        setField(term628, term628.getClass(), "url", "dWRymuLBtr");
        setField(term600, term600.getClass(), "move", term628);
        setField(term653, term653.getClass(), "name", "AijpHYOFuy");
        setField(term653, term653.getClass(), "url", "SbAoxhfrkn");
        setField(term600, term600.getClass(), "versionGroup", term653);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.machine.Machine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMove", argTypes, term600, args);
    }

};


