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

public class Department_getStaff_19157304251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148;

    public Department_getStaff_19157304251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term154 = new Long(7411271909051562686L);
        Object term153 = newInstance(Class.forName("refactoring.app.chapter12.extractSuperclass.Employee"));
        setField(term153, term153.getClass(), "id", term154);
        setIntField(term153, term153.getClass(), "monthlyCost", -2038273078);
        setField(term153, term153.getClass(), "name", null);
        Long term158 = new Long(4872422362414183754L);
        Object term157 = newInstance(Class.forName("refactoring.app.chapter12.extractSuperclass.Employee"));
        setField(term157, term157.getClass(), "id", term158);
        setIntField(term157, term157.getClass(), "monthlyCost", 1227103734);
        setField(term157, term157.getClass(), "name", null);
        Long term162 = new Long(6811161968424632369L);
        Object term161 = newInstance(Class.forName("refactoring.app.chapter12.extractSuperclass.Employee"));
        setField(term161, term161.getClass(), "id", term162);
        setIntField(term161, term161.getClass(), "monthlyCost", -1339778481);
        setField(term161, term161.getClass(), "name", null);
        Long term166 = new Long(-7237588299778557629L);
        Object term165 = newInstance(Class.forName("refactoring.app.chapter12.extractSuperclass.Employee"));
        setField(term165, term165.getClass(), "id", term166);
        setIntField(term165, term165.getClass(), "monthlyCost", 1725571209);
        setField(term165, term165.getClass(), "name", null);
        ArrayList term151 = new ArrayList();
        ((ArrayList) term151).add(term153);
        ((ArrayList) term151).add(term157);
        ((ArrayList) term151).add(term161);
        ((ArrayList) term151).add(term165);
        term148 = newInstance(Class.forName("refactoring.app.chapter12.extractSuperclass.Department"));
        Object term149 = newInstance(Class.forName("refactoring.app.chapter12.extractSuperclass.Staff"));
        setIntField(term149, term149.getClass(), "length", -1955890973);
        setField(term149, term149.getClass(), "employees", term151);
        setField(term148, term148.getClass(), "staff", term149);
        setField(term148, term148.getClass(), "name", "oVcInYnLWB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.extractSuperclass.Department");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStaff", argTypes, term148, args);
    }

};


