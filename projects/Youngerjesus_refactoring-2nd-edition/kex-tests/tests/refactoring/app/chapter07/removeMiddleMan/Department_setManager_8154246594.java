package refactoring.app.chapter07.removeMiddleMan;

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
import static refactoring.app.chapter07.removeMiddleMan.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Department_setManager_8154246594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96;
     Object term117;

    public Department_setManager_8154246594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Department"));
        Object term98 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Person"));
        Object term111 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Department"));
        Object term113 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Person"));
        Object term115 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Department"));
        setIntField(term96, term96.getClass(), "chargeCode", -1685132342);
        setField(term98, term98.getClass(), "name", "aJlieCFVtF");
        setIntField(term111, term111.getClass(), "chargeCode", -1456670397);
        setField(term113, term113.getClass(), "name", "");
        setIntField(term115, term115.getClass(), "chargeCode", 1622346318);
        setField(term115, term115.getClass(), "manager", null);
        setField(term113, term113.getClass(), "department", term115);
        setField(term111, term111.getClass(), "manager", term113);
        setField(term98, term98.getClass(), "department", term111);
        setField(term96, term96.getClass(), "manager", term98);
        term117 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Person"));
        Object term130 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Department"));
        Object term132 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Person"));
        Object term145 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Department"));
        Object term147 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Person"));
        setField(term117, term117.getClass(), "name", "hNxWaHcfhY");
        setIntField(term130, term130.getClass(), "chargeCode", -6029667);
        setField(term132, term132.getClass(), "name", "RkybSrpybU");
        setIntField(term145, term145.getClass(), "chargeCode", -2068769794);
        setField(term147, term147.getClass(), "name", null);
        setField(term147, term147.getClass(), "department", null);
        setField(term145, term145.getClass(), "manager", term147);
        setField(term132, term132.getClass(), "department", term145);
        setField(term130, term130.getClass(), "manager", term132);
        setField(term117, term117.getClass(), "department", term130);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter07.removeMiddleMan.Department");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter07.removeMiddleMan.Person");
        Object[] args = new Object[1];
        args[0] = term117;
        callMethod(klass, "setManager", argTypes, term96, args);
    }

};


