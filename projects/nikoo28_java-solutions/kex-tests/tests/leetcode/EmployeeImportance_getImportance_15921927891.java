package leetcode;

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
import static leetcode.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class EmployeeImportance_getImportance_15921927891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4448;
     Object term4449;
     Object term4500;

    public EmployeeImportance_getImportance_15921927891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4448 = newInstance(Class.forName("leetcode.EmployeeImportance"));
        Integer term4457 = new Integer(1622346318);
        Integer term4459 = new Integer(1048535127);
        Integer term4461 = new Integer(-655067527);
        Integer term4463 = new Integer(-6029667);
        Integer term4465 = new Integer(-2068769794);
        Integer term4467 = new Integer(-117576464);
        Integer term4469 = new Integer(-1007160944);
        ArrayList term4455 = new ArrayList();
        ((ArrayList) term4455).add(term4457);
        ((ArrayList) term4455).add(term4459);
        ((ArrayList) term4455).add(term4461);
        ((ArrayList) term4455).add(term4463);
        ((ArrayList) term4455).add(term4465);
        ((ArrayList) term4455).add(term4467);
        ((ArrayList) term4455).add(term4469);
        Object term4452 = newInstance(Class.forName("leetcode.Employee"));
        setIntField(term4452, term4452.getClass(), "id", 353974456);
        setIntField(term4452, term4452.getClass(), "importance", -485108462);
        setField(term4452, term4452.getClass(), "subordinates", term4455);
        ArrayList term4477 = new ArrayList();
        ((ArrayList) term4477).add((Object)null);
        ((ArrayList) term4477).add((Object)null);
        ((ArrayList) term4477).add((Object)null);
        ((ArrayList) term4477).add((Object)null);
        ((ArrayList) term4477).add((Object)null);
        ((ArrayList) term4477).add((Object)null);
        ((ArrayList) term4477).add((Object)null);
        ((ArrayList) term4477).add((Object)null);
        Object term4474 = newInstance(Class.forName("leetcode.Employee"));
        setIntField(term4474, term4474.getClass(), "id", 1418551216);
        setIntField(term4474, term4474.getClass(), "importance", -626779272);
        setField(term4474, term4474.getClass(), "subordinates", term4477);
        Object term4481 = newInstance(Class.forName("leetcode.Employee"));
        setIntField(term4481, term4481.getClass(), "id", -1150062870);
        setIntField(term4481, term4481.getClass(), "importance", -886200503);
        setField(term4481, term4481.getClass(), "subordinates", null);
        term4449 = new LinkedList();
        ((LinkedList) term4449).add(term4452);
        ((LinkedList) term4449).add(term4474);
        ((LinkedList) term4449).add(term4481);
        ((LinkedList) term4449).add((Object)null);
        ((LinkedList) term4449).add((Object)null);
        term4500 = new Integer(1443855558);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.EmployeeImportance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4449;
        args[1] = term4500;
        callMethod(klass, "getImportance", argTypes, term4448, args);
    }

};


