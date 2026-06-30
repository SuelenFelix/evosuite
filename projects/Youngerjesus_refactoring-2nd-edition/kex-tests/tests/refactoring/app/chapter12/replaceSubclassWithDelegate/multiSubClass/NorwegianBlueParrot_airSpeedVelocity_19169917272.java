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

public class NorwegianBlueParrot_airSpeedVelocity_19169917272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term910;

    public NorwegianBlueParrot_airSpeedVelocity_19169917272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term910 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.multiSubClass.NorwegianBlueParrot"));
        Object term937 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.multiSubClass.SpeciesDelegate"));
        setIntField(term910, term910.getClass(), "voltage", 1585847225);
        setBooleanField(term910, term910.getClass(), "isNailed", true);
        setField(term910, term910.getClass(), "name", "aKnKipADSo");
        setField(term910, term910.getClass(), "plumage", "wSQxaModmm");
        setField(term937, term937.getClass(), "plumage", "UlajhuVLaP");
        setField(term910, term910.getClass(), "speciesDelegate", term937);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.multiSubClass.NorwegianBlueParrot");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "airSpeedVelocity", argTypes, term910, args);
    }

};


