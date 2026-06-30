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

public class SpeciesDelegate_airSpeedVelocity_12521769085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259;

    public SpeciesDelegate_airSpeedVelocity_12521769085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term259 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.multiSubClass.SpeciesDelegate"));
        setField(term259, term259.getClass(), "plumage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.multiSubClass.SpeciesDelegate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "airSpeedVelocity", argTypes, term259, args);
    }

};


