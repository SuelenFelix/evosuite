package refactoring.app.chapter07.hideDelegate;

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
import static refactoring.app.chapter07.hideDelegate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class Department_setChargeCode_19962341662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241;
     Object term262;

    public Department_setChargeCode_19962341662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term241 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Department"));
        Object term243 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Person"));
        Object term256 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Department"));
        Object term258 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Person"));
        Object term260 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Department"));
        setIntField(term241, term241.getClass(), "chargeCode", 1135664017);
        setField(term243, term243.getClass(), "name", "flxyYxBRtu");
        setIntField(term256, term256.getClass(), "chargeCode", 590364439);
        setField(term258, term258.getClass(), "name", "");
        setIntField(term260, term260.getClass(), "chargeCode", 865208305);
        setField(term260, term260.getClass(), "manager", null);
        setField(term258, term258.getClass(), "department", term260);
        setField(term256, term256.getClass(), "manager", term258);
        setField(term243, term243.getClass(), "department", term256);
        setField(term241, term241.getClass(), "manager", term243);
        term262 = new Integer(-203030934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter07.hideDelegate.Department");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term262;
        callMethod(klass, "setChargeCode", argTypes, term241, args);
    }

};


