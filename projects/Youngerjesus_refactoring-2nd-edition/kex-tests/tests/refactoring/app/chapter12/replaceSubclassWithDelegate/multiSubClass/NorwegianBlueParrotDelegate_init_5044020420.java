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

public class NorwegianBlueParrotDelegate_init_5044020420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1197;

    public NorwegianBlueParrotDelegate_init_5044020420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1197 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.multiSubClass.Data"));
        setBooleanField(term1197, term1197.getClass(), "isNailed", false);
        setIntField(term1197, term1197.getClass(), "voltage", 1048535127);
        setIntField(term1197, term1197.getClass(), "numberOfCounts", -655067527);
        setField(term1197, term1197.getClass(), "type", "UiUYnPrcCi");
        setField(term1197, term1197.getClass(), "name", "UoYtihxVaS");
        setField(term1197, term1197.getClass(), "plumage", "JDswTTCZHV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.multiSubClass.NorwegianBlueParrotDelegate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.multiSubClass.Data");
        Object[] args = new Object[1];
        args[0] = term1197;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


