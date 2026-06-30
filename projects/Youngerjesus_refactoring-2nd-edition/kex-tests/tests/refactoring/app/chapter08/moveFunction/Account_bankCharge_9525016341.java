package refactoring.app.chapter08.moveFunction;

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
import static refactoring.app.chapter08.moveFunction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Account_bankCharge_9525016341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Account_bankCharge_9525016341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("refactoring.app.chapter08.moveFunction.Account"));
        Object term3 = newInstance(Class.forName("refactoring.app.chapter08.moveFunction.AccountType"));
        setIntField(term1, term1.getClass(), "daysOverdrawn", 568599855);
        setBooleanField(term3, term3.getClass(), "isPremium", false);
        setField(term1, term1.getClass(), "type", term3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter08.moveFunction.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "bankCharge", argTypes, term1, args);
    }

};


