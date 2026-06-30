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
import java.util.HashMap;

public class Statement_statement_11528085601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2629;
     Object term2630;
     Object term2662;

    public Statement_statement_11528085601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2629 = newInstance(Class.forName("refactoring.app.chapter01.Statement"));
        Object term2645 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term2645, term2645.getClass(), "playId", "");
        setIntField(term2645, term2645.getClass(), "audience", 1596070772);
        Object term2648 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term2648, term2648.getClass(), "playId", "");
        setIntField(term2648, term2648.getClass(), "audience", 97029295);
        Object term2651 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term2651, term2651.getClass(), "playId", "");
        setIntField(term2651, term2651.getClass(), "audience", -1371869594);
        Object term2654 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term2654, term2654.getClass(), "playId", "");
        setIntField(term2654, term2654.getClass(), "audience", -2095575670);
        Object term2657 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term2657, term2657.getClass(), "playId", "");
        setIntField(term2657, term2657.getClass(), "audience", 1225272962);
        ArrayList term2643 = new ArrayList();
        ((ArrayList) term2643).add(term2645);
        ((ArrayList) term2643).add(term2648);
        ((ArrayList) term2643).add(term2651);
        ((ArrayList) term2643).add(term2654);
        ((ArrayList) term2643).add(term2657);
        term2630 = newInstance(Class.forName("refactoring.app.chapter01.Invoice"));
        setField(term2630, term2630.getClass(), "customer", "xBsXSDjXYK");
        setField(term2630, term2630.getClass(), "performances", term2643);
        HashMap term2663 = new HashMap();
        term2662 = newInstance(Class.forName("refactoring.app.chapter01.Plays"));
        setField(term2662, term2662.getClass(), "playMap", term2663);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter01.Statement");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("refactoring.app.chapter01.Invoice");
        argTypes[1] = Class.forName("refactoring.app.chapter01.Plays");
        Object[] args = new Object[2];
        args[0] = term2630;
        args[1] = term2662;
        callMethod(klass, "statement", argTypes, term2629, args);
    }

};


