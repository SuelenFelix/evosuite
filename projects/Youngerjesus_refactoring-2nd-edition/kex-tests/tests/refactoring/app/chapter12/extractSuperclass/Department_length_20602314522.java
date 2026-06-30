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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Long;

public class Department_length_20602314522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193;

    public Department_length_20602314522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term199 = new Long(6967924379644551255L);
        Object term198 = newInstance(Class.forName("refactoring.app.chapter12.extractSuperclass.Employee"));
        setField(term198, term198.getClass(), "id", term199);
        setIntField(term198, term198.getClass(), "monthlyCost", 1134449235);
        setField(term198, term198.getClass(), "name", null);
        Long term203 = new Long(-2813493605142626659L);
        Object term202 = newInstance(Class.forName("refactoring.app.chapter12.extractSuperclass.Employee"));
        setField(term202, term202.getClass(), "id", term203);
        setIntField(term202, term202.getClass(), "monthlyCost", -883034806);
        setField(term202, term202.getClass(), "name", null);
        Long term207 = new Long(-8885298608300233488L);
        Object term206 = newInstance(Class.forName("refactoring.app.chapter12.extractSuperclass.Employee"));
        setField(term206, term206.getClass(), "id", term207);
        setIntField(term206, term206.getClass(), "monthlyCost", 1585847225);
        setField(term206, term206.getClass(), "name", null);
        ArrayList term196 = new ArrayList();
        ((ArrayList) term196).add(term198);
        ((ArrayList) term196).add(term202);
        ((ArrayList) term196).add(term206);
        term193 = newInstance(Class.forName("refactoring.app.chapter12.extractSuperclass.Department"));
        Object term194 = newInstance(Class.forName("refactoring.app.chapter12.extractSuperclass.Staff"));
        setIntField(term194, term194.getClass(), "length", -522618178);
        setField(term194, term194.getClass(), "employees", term196);
        setField(term193, term193.getClass(), "staff", term194);
        setField(term193, term193.getClass(), "name", "HyxfbSQYBe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.extractSuperclass.Department");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "length", argTypes, term193, args);
    }

};


