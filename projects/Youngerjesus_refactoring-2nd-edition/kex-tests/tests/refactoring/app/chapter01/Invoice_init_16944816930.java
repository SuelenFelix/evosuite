package refactoring.app.chapter01;

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
import static refactoring.app.chapter01.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class Invoice_init_16944816930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1188;

    public Invoice_init_16944816930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1191 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1191, term1191.getClass(), "playId", "xOEqzGAmDU");
        setIntField(term1191, term1191.getClass(), "audience", -616727354);
        Object term1206 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1206, term1206.getClass(), "playId", "");
        setIntField(term1206, term1206.getClass(), "audience", -1955890973);
        Object term1210 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1210, term1210.getClass(), "playId", null);
        setIntField(term1210, term1210.getClass(), "audience", -2038273078);
        term1188 = new LinkedList();
        ((LinkedList) term1188).add(term1191);
        ((LinkedList) term1188).add(term1206);
        ((LinkedList) term1188).add(term1210);
        ((LinkedList) term1188).add((Object)null);
        ((LinkedList) term1188).add((Object)null);
        ((LinkedList) term1188).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter01.Invoice");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = "RkybSrpybU";
        args[1] = term1188;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


