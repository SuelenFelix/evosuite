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

public class Invoice_getPerformances_7477668552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1292;

    public Invoice_getPerformances_7477668552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1307 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1307, term1307.getClass(), "playId", "");
        setIntField(term1307, term1307.getClass(), "audience", 597278769);
        Object term1310 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1310, term1310.getClass(), "playId", "");
        setIntField(term1310, term1310.getClass(), "audience", -1685132342);
        Object term1313 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1313, term1313.getClass(), "playId", "");
        setIntField(term1313, term1313.getClass(), "audience", -1456670397);
        ArrayList term1305 = new ArrayList();
        ((ArrayList) term1305).add(term1307);
        ((ArrayList) term1305).add(term1310);
        ((ArrayList) term1305).add(term1313);
        term1292 = newInstance(Class.forName("refactoring.app.chapter01.Invoice"));
        setField(term1292, term1292.getClass(), "customer", "SbAoxhfrkn");
        setField(term1292, term1292.getClass(), "performances", term1305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter01.Invoice");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPerformances", argTypes, term1292, args);
    }

};


