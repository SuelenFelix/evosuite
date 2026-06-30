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

public class NorwegianBlueParrot_init_16528884470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term770;

    public NorwegianBlueParrot_init_16528884470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term770 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.multiSubClass.Data"));
        setBooleanField(term770, term770.getClass(), "isNailed", true);
        setIntField(term770, term770.getClass(), "voltage", -522618178);
        setIntField(term770, term770.getClass(), "numberOfCounts", 1134449235);
        setField(term770, term770.getClass(), "type", "SbAoxhfrkn");
        setField(term770, term770.getClass(), "name", "kuTXqwMtDB");
        setField(term770, term770.getClass(), "plumage", "Ghbwtircqb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.multiSubClass.NorwegianBlueParrot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.multiSubClass.Data");
        Object[] args = new Object[1];
        args[0] = term770;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


