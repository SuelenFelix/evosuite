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
import java.lang.Boolean;

public class AfterAddParameter_priorityAddReservation_7411640082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44;
     Object term49;
     Object term50;

    public AfterAddParameter_priorityAddReservation_7411640082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term45 = new ArrayDeque();
        term44 = newInstance(Class.forName("refactoring.app.chapter06.changeFunctionDeclaration.AfterAddParameter"));
        setField(term44, term44.getClass(), "reservations", term45);
        term49 = newInstance(Class.forName("refactoring.app.chapter06.changeFunctionDeclaration.Customer"));
        term50 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter06.changeFunctionDeclaration.AfterAddParameter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("refactoring.app.chapter06.changeFunctionDeclaration.Customer");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term49;
        args[1] = term50;
        callMethod(klass, "priorityAddReservation", argTypes, term44, args);
    }

};


