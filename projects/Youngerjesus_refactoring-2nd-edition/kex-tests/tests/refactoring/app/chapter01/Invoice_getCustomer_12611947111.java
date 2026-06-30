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
import java.util.ArrayList;
import java.lang.Object;

public class Invoice_getCustomer_12611947111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1253;

    public Invoice_getCustomer_12611947111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1268 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1268, term1268.getClass(), "playId", "");
        setIntField(term1268, term1268.getClass(), "audience", -522618178);
        Object term1271 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1271, term1271.getClass(), "playId", "");
        setIntField(term1271, term1271.getClass(), "audience", 1134449235);
        Object term1274 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1274, term1274.getClass(), "playId", "");
        setIntField(term1274, term1274.getClass(), "audience", -883034806);
        Object term1277 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1277, term1277.getClass(), "playId", "");
        setIntField(term1277, term1277.getClass(), "audience", 1585847225);
        ArrayList term1266 = new ArrayList();
        ((ArrayList) term1266).add(term1268);
        ((ArrayList) term1266).add(term1271);
        ((ArrayList) term1266).add(term1274);
        ((ArrayList) term1266).add(term1277);
        term1253 = newInstance(Class.forName("refactoring.app.chapter01.Invoice"));
        setField(term1253, term1253.getClass(), "customer", "IoAlmYsBwc");
        setField(term1253, term1253.getClass(), "performances", term1266);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter01.Invoice");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCustomer", argTypes, term1253, args);
    }

};


