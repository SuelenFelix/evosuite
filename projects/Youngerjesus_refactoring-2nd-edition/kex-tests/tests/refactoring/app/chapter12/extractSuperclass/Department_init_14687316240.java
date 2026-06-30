package refactoring.app.chapter12.extractSuperclass;

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
import static refactoring.app.chapter12.extractSuperclass.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Long;

public class Department_init_14687316240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107;

    public Department_init_14687316240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term112 = new Long(2442117782898005296L);
        Object term111 = newInstance(Class.forName("refactoring.app.chapter12.extractSuperclass.Employee"));
        setField(term111, term111.getClass(), "id", term112);
        setIntField(term111, term111.getClass(), "monthlyCost", 1162663216);
        setField(term111, term111.getClass(), "name", "");
        Long term117 = new Long(6375119433582206027L);
        Object term116 = newInstance(Class.forName("refactoring.app.chapter12.extractSuperclass.Employee"));
        setField(term116, term116.getClass(), "id", term117);
        setIntField(term116, term116.getClass(), "monthlyCost", 1484323161);
        setField(term116, term116.getClass(), "name", "");
        Long term122 = new Long(-8257434502486459194L);
        Object term121 = newInstance(Class.forName("refactoring.app.chapter12.extractSuperclass.Employee"));
        setField(term121, term121.getClass(), "id", term122);
        setIntField(term121, term121.getClass(), "monthlyCost", 391863371);
        setField(term121, term121.getClass(), "name", "");
        Long term127 = new Long(-8400487765614892086L);
        Object term126 = newInstance(Class.forName("refactoring.app.chapter12.extractSuperclass.Employee"));
        setField(term126, term126.getClass(), "id", term127);
        setIntField(term126, term126.getClass(), "monthlyCost", -1922583790);
        setField(term126, term126.getClass(), "name", "");
        Long term132 = new Long(5270370404989704783L);
        Object term131 = newInstance(Class.forName("refactoring.app.chapter12.extractSuperclass.Employee"));
        setField(term131, term131.getClass(), "id", term132);
        setIntField(term131, term131.getClass(), "monthlyCost", -616727354);
        setField(term131, term131.getClass(), "name", "");
        ArrayList term109 = new ArrayList();
        ((ArrayList) term109).add(term111);
        ((ArrayList) term109).add(term116);
        ((ArrayList) term109).add(term121);
        ((ArrayList) term109).add(term126);
        ((ArrayList) term109).add(term131);
        term107 = newInstance(Class.forName("refactoring.app.chapter12.extractSuperclass.Staff"));
        setIntField(term107, term107.getClass(), "length", 568599855);
        setField(term107, term107.getClass(), "employees", term109);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.extractSuperclass.Department");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("refactoring.app.chapter12.extractSuperclass.Staff");
        Object[] args = new Object[2];
        args[0] = "jJCZpVmanW";
        args[1] = term107;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


