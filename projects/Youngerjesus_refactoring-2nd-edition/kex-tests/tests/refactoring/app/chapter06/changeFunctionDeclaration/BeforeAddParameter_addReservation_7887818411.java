package refactoring.app.chapter06.changeFunctionDeclaration;

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
import static refactoring.app.chapter06.changeFunctionDeclaration.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayDeque;

public class BeforeAddParameter_addReservation_7887818411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;
     Object term12;

    public BeforeAddParameter_addReservation_7887818411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term8 = new ArrayDeque();
        term7 = newInstance(Class.forName("refactoring.app.chapter06.changeFunctionDeclaration.BeforeAddParameter"));
        setField(term7, term7.getClass(), "reservations", term8);
        term12 = newInstance(Class.forName("refactoring.app.chapter06.changeFunctionDeclaration.Customer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter06.changeFunctionDeclaration.BeforeAddParameter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter06.changeFunctionDeclaration.Customer");
        Object[] args = new Object[1];
        args[0] = term12;
        callMethod(klass, "addReservation", argTypes, term7, args);
    }

};


