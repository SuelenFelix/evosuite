package refactoring.app.chapter12.pullUpConstructorBody;

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
import static refactoring.app.chapter12.pullUpConstructorBody.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class Manager_isPrivileged_18220736321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27;

    public Manager_isPrivileged_18220736321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term30 = new Long(2442117782898005296L);
        term27 = newInstance(Class.forName("refactoring.app.chapter12.pullUpConstructorBody.Manager"));
        Object term28 = newInstance(Class.forName("refactoring.app.chapter12.pullUpConstructorBody.Grade"));
        setIntField(term28, term28.getClass(), "val", 1162663216);
        setField(term27, term27.getClass(), "grade", term28);
        setField(term27, term27.getClass(), "id", term30);
        setIntField(term27, term27.getClass(), "monthlyCost", 1484323161);
        setField(term27, term27.getClass(), "name", "sjlJAEtRrb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.pullUpConstructorBody.Manager");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrivileged", argTypes, term27, args);
    }

};


