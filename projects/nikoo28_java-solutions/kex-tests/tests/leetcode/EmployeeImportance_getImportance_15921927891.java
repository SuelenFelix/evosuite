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
     Object term4435;
     Object term4436;
     Object term4492;

    public EmployeeImportance_getImportance_15921927891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4435 = newInstance(Class.forName("leetcode.EmployeeImportance"));
        Integer term4444 = new Integer(590364439);
        Integer term4446 = new Integer(865208305);
        Integer term4448 = new Integer(-1275173084);
        Integer term4450 = new Integer(-244121226);
        Integer term4452 = new Integer(-203030934);
        Integer term4454 = new Integer(-1179120542);
        ArrayList term4442 = new ArrayList();
        ((ArrayList) term4442).add(term4444);
        ((ArrayList) term4442).add(term4446);
        ((ArrayList) term4442).add(term4448);
        ((ArrayList) term4442).add(term4450);
        ((ArrayList) term4442).add(term4452);
        ((ArrayList) term4442).add(term4454);
        Object term4439 = newInstance(Class.forName("leetcode.Employee"));
        setIntField(term4439, term4439.getClass(), "id", 188512644);
        setIntField(term4439, term4439.getClass(), "importance", 1851127634);
        setField(term4439, term4439.getClass(), "subordinates", term4442);
        ArrayList term4462 = new ArrayList();
        ((ArrayList) term4462).add((Object)null);
        ((ArrayList) term4462).add((Object)null);
        ((ArrayList) term4462).add((Object)null);
        ((ArrayList) term4462).add((Object)null);
        ((ArrayList) term4462).add((Object)null);
        ((ArrayList) term4462).add((Object)null);
        Object term4459 = newInstance(Class.forName("leetcode.Employee"));
        setIntField(term4459, term4459.getClass(), "id", 783730213);
        setIntField(term4459, term4459.getClass(), "importance", 1815951606);
        setField(term4459, term4459.getClass(), "subordinates", term4462);
        Object term4466 = newInstance(Class.forName("leetcode.Employee"));
        setIntField(term4466, term4466.getClass(), "id", 1105016932);
        setIntField(term4466, term4466.getClass(), "importance", -365784998);
        setField(term4466, term4466.getClass(), "subordinates", null);
        term4436 = new LinkedList();
        ((LinkedList) term4436).add(term4439);
        ((LinkedList) term4436).add(term4459);
        ((LinkedList) term4436).add(term4466);
        ((LinkedList) term4436).add((Object)null);
        ((LinkedList) term4436).add((Object)null);
        ((LinkedList) term4436).add((Object)null);
        ((LinkedList) term4436).add((Object)null);
        term4492 = new Integer(-1651110911);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.EmployeeImportance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4436;
        args[1] = term4492;
        callMethod(klass, "getImportance", argTypes, term4435, args);
    }

};


