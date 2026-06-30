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

public class AfterAddParameter_addReservation_4455051821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38;
     Object term43;

    public AfterAddParameter_addReservation_4455051821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term39 = new ArrayDeque();
        term38 = newInstance(Class.forName("refactoring.app.chapter06.changeFunctionDeclaration.AfterAddParameter"));
        setField(term38, term38.getClass(), "reservations", term39);
        term43 = newInstance(Class.forName("refactoring.app.chapter06.changeFunctionDeclaration.Customer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter06.changeFunctionDeclaration.AfterAddParameter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter06.changeFunctionDeclaration.Customer");
        Object[] args = new Object[1];
        args[0] = term43;
        callMethod(klass, "addReservation", argTypes, term38, args);
    }

};


