package refactoring.app.chapter04;

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
import static refactoring.app.chapter04.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class Province_init_6096689931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39;
     Object term104;
     Object term106;

    public Province_init_6096689931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term59 = new ArrayList();
        ((ArrayList) term59).add((Object)null);
        ((ArrayList) term59).add((Object)null);
        ((ArrayList) term59).add((Object)null);
        ((ArrayList) term59).add((Object)null);
        ((ArrayList) term59).add((Object)null);
        ((ArrayList) term59).add((Object)null);
        ((ArrayList) term59).add((Object)null);
        ((ArrayList) term59).add((Object)null);
        ((ArrayList) term59).add((Object)null);
        Object term42 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term57 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term42, term42.getClass(), "name", "MuLcgQHgqz");
        setIntField(term42, term42.getClass(), "cost", 1484323161);
        setIntField(term42, term42.getClass(), "production", 391863371);
        setField(term57, term57.getClass(), "name", "");
        setField(term57, term57.getClass(), "producers", term59);
        setIntField(term57, term57.getClass(), "totalProduction", 679763016);
        setIntField(term57, term57.getClass(), "demand", 1962444399);
        setIntField(term57, term57.getClass(), "price", 767834723);
        setField(term42, term42.getClass(), "province", term57);
        Object term66 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term70 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term66, term66.getClass(), "name", "");
        setIntField(term66, term66.getClass(), "cost", -602026508);
        setIntField(term66, term66.getClass(), "production", -157887805);
        setField(term70, term70.getClass(), "name", null);
        setField(term70, term70.getClass(), "producers", null);
        setIntField(term70, term70.getClass(), "totalProduction", -478195677);
        setIntField(term70, term70.getClass(), "demand", 972867650);
        setIntField(term70, term70.getClass(), "price", 1655935355);
        setField(term66, term66.getClass(), "province", term70);
        Object term75 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term75, term75.getClass(), "name", null);
        setIntField(term75, term75.getClass(), "cost", -481533957);
        setIntField(term75, term75.getClass(), "production", 1240914516);
        setField(term75, term75.getClass(), "province", null);
        term39 = new LinkedList();
        ((LinkedList) term39).add(term42);
        ((LinkedList) term39).add(term66);
        ((LinkedList) term39).add(term75);
        ((LinkedList) term39).add((Object)null);
        ((LinkedList) term39).add((Object)null);
        term104 = new Integer(1041916673);
        term106 = new Integer(-601863069);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter04.Province");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = "sjlJAEtRrb";
        args[1] = term39;
        args[2] = term104;
        args[3] = term106;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


