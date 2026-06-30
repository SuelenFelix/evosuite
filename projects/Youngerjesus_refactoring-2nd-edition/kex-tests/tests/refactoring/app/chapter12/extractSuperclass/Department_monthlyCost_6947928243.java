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

public class Department_monthlyCost_6947928243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234;

    public Department_monthlyCost_6947928243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term240 = new Long(-4325723315152823407L);
        Object term239 = newInstance(Class.forName("refactoring.app.chapter12.extractSuperclass.Employee"));
        setField(term239, term239.getClass(), "id", term240);
        setIntField(term239, term239.getClass(), "monthlyCost", -1685132342);
        setField(term239, term239.getClass(), "name", null);
        Long term244 = new Long(2535595959091595249L);
        Object term243 = newInstance(Class.forName("refactoring.app.chapter12.extractSuperclass.Employee"));
        setField(term243, term243.getClass(), "id", term244);
        setIntField(term243, term243.getClass(), "monthlyCost", -1456670397);
        setField(term243, term243.getClass(), "name", null);
        Long term248 = new Long(-5476826692763582090L);
        Object term247 = newInstance(Class.forName("refactoring.app.chapter12.extractSuperclass.Employee"));
        setField(term247, term247.getClass(), "id", term248);
        setIntField(term247, term247.getClass(), "monthlyCost", 1622346318);
        setField(term247, term247.getClass(), "name", null);
        Long term252 = new Long(-872011222785455006L);
        Object term251 = newInstance(Class.forName("refactoring.app.chapter12.extractSuperclass.Employee"));
        setField(term251, term251.getClass(), "id", term252);
        setIntField(term251, term251.getClass(), "monthlyCost", 1048535127);
        setField(term251, term251.getClass(), "name", null);
        ArrayList term237 = new ArrayList();
        ((ArrayList) term237).add(term239);
        ((ArrayList) term237).add(term243);
        ((ArrayList) term237).add(term247);
        ((ArrayList) term237).add(term251);
        term234 = newInstance(Class.forName("refactoring.app.chapter12.extractSuperclass.Department"));
        Object term235 = newInstance(Class.forName("refactoring.app.chapter12.extractSuperclass.Staff"));
        setIntField(term235, term235.getClass(), "length", 597278769);
        setField(term235, term235.getClass(), "employees", term237);
        setField(term234, term234.getClass(), "staff", term235);
        setField(term234, term234.getClass(), "name", "eZFUvlxvGV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.extractSuperclass.Department");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "monthlyCost", argTypes, term234, args);
    }

};


