package refactoring.app.chapter12.replaceSubclassWithDelegate.multiSubClass;

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
import static refactoring.app.chapter12.replaceSubclassWithDelegate.multiSubClass.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Bird_getName_2991341682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term468;

    public Bird_getName_2991341682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term468 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.multiSubClass.Bird"));
        Object term493 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.multiSubClass.SpeciesDelegate"));
        setField(term468, term468.getClass(), "name", "hNxWaHcfhY");
        setField(term468, term468.getClass(), "plumage", "RkybSrpybU");
        setField(term493, term493.getClass(), "plumage", "xOEqzGAmDU");
        setField(term468, term468.getClass(), "speciesDelegate", term493);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.multiSubClass.Bird");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term468, args);
    }

};


