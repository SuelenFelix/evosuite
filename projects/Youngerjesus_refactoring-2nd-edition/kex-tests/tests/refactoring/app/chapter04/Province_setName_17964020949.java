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
import java.util.ArrayList;
import java.lang.Object;

public class Province_setName_17964020949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term625;

    public Province_setName_17964020949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term640 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term644 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term640, term640.getClass(), "name", "");
        setIntField(term640, term640.getClass(), "cost", 897010381);
        setIntField(term640, term640.getClass(), "production", -15712667);
        setField(term644, term644.getClass(), "name", null);
        setField(term644, term644.getClass(), "producers", null);
        setIntField(term644, term644.getClass(), "totalProduction", -695279311);
        setIntField(term644, term644.getClass(), "demand", 114279242);
        setIntField(term644, term644.getClass(), "price", 990883365);
        setField(term640, term640.getClass(), "province", term644);
        Object term648 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term652 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term648, term648.getClass(), "name", "");
        setIntField(term648, term648.getClass(), "cost", -2138825831);
        setIntField(term648, term648.getClass(), "production", 1454781562);
        setField(term652, term652.getClass(), "name", null);
        setField(term652, term652.getClass(), "producers", null);
        setIntField(term652, term652.getClass(), "totalProduction", 0);
        setIntField(term652, term652.getClass(), "demand", 0);
        setIntField(term652, term652.getClass(), "price", 0);
        setField(term648, term648.getClass(), "province", term652);
        Object term656 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term660 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term656, term656.getClass(), "name", "");
        setIntField(term656, term656.getClass(), "cost", 1126618861);
        setIntField(term656, term656.getClass(), "production", 947449400);
        setField(term660, term660.getClass(), "name", null);
        setField(term660, term660.getClass(), "producers", null);
        setIntField(term660, term660.getClass(), "totalProduction", 0);
        setIntField(term660, term660.getClass(), "demand", 0);
        setIntField(term660, term660.getClass(), "price", 0);
        setField(term656, term656.getClass(), "province", term660);
        Object term664 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term668 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term664, term664.getClass(), "name", "");
        setIntField(term664, term664.getClass(), "cost", 21031843);
        setIntField(term664, term664.getClass(), "production", -380787857);
        setField(term668, term668.getClass(), "name", null);
        setField(term668, term668.getClass(), "producers", null);
        setIntField(term668, term668.getClass(), "totalProduction", -763799087);
        setIntField(term668, term668.getClass(), "demand", 1207142014);
        setIntField(term668, term668.getClass(), "price", -876426634);
        setField(term664, term664.getClass(), "province", term668);
        Object term672 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term676 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term672, term672.getClass(), "name", "");
        setIntField(term672, term672.getClass(), "cost", 319853052);
        setIntField(term672, term672.getClass(), "production", -1097563716);
        setField(term676, term676.getClass(), "name", null);
        setField(term676, term676.getClass(), "producers", null);
        setIntField(term676, term676.getClass(), "totalProduction", 0);
        setIntField(term676, term676.getClass(), "demand", 0);
        setIntField(term676, term676.getClass(), "price", 0);
        setField(term672, term672.getClass(), "province", term676);
        ArrayList term638 = new ArrayList();
        ((ArrayList) term638).add(term640);
        ((ArrayList) term638).add(term648);
        ((ArrayList) term638).add(term656);
        ((ArrayList) term638).add(term656);
        ((ArrayList) term638).add(term664);
        ((ArrayList) term638).add(term672);
        term625 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term625, term625.getClass(), "name", "ZkMALXpEAZ");
        setField(term625, term625.getClass(), "producers", term638);
        setIntField(term625, term625.getClass(), "totalProduction", 633598642);
        setIntField(term625, term625.getClass(), "demand", 1862841859);
        setIntField(term625, term625.getClass(), "price", -1114668574);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter04.Province");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GrqozDKFOk";
        callMethod(klass, "setName", argTypes, term625, args);
    }

};


