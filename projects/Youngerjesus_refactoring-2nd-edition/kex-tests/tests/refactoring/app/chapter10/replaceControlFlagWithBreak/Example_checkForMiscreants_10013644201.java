package refactoring.app.chapter10.replaceControlFlagWithBreak;

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
import static refactoring.app.chapter10.replaceControlFlagWithBreak.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class Example_checkForMiscreants_10013644201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public Example_checkForMiscreants_10013644201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("refactoring.app.chapter10.replaceControlFlagWithBreak.Example"));
        Object term5 = newInstance(Class.forName("refactoring.app.chapter10.replaceControlFlagWithBreak.Person"));
        setField(term5, term5.getClass(), "name", "PAEBtnZtTD");
        Object term19 = newInstance(Class.forName("refactoring.app.chapter10.replaceControlFlagWithBreak.Person"));
        setField(term19, term19.getClass(), "name", "");
        Object term22 = newInstance(Class.forName("refactoring.app.chapter10.replaceControlFlagWithBreak.Person"));
        setField(term22, term22.getClass(), "name", null);
        term2 = new LinkedList();
        ((LinkedList) term2).add(term5);
        ((LinkedList) term2).add(term19);
        ((LinkedList) term2).add(term22);
        ((LinkedList) term2).add((Object)null);
        ((LinkedList) term2).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter10.replaceControlFlagWithBreak.Example");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "checkForMiscreants", argTypes, term1, args);
    }

};


