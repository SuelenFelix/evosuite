package refactoring.app.chapter12.replaceSuperclassWithDelegate;

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
import static refactoring.app.chapter12.replaceSuperclassWithDelegate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;

public class CatalogItem_getId_4019609971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90;

    public CatalogItem_getId_4019609971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term91 = new Long(6375119433582206027L);
        ArrayList term105 = new ArrayList();
        ((ArrayList) term105).add("MjGYSRKTNF");
        ((ArrayList) term105).add("hRNSzYYIrc");
        ((ArrayList) term105).add("RMFIsYGgne");
        ((ArrayList) term105).add("NRdvgJlhkX");
        ((ArrayList) term105).add("uuaPigETmJ");
        ((ArrayList) term105).add("MxlszYVzRf");
        ((ArrayList) term105).add("LQFpaHEwXR");
        ((ArrayList) term105).add("oVcInYnLWB");
        ((ArrayList) term105).add("aJlieCFVtF");
        term90 = newInstance(Class.forName("refactoring.app.chapter12.replaceSuperclassWithDelegate.CatalogItem"));
        setField(term90, term90.getClass(), "id", term91);
        setField(term90, term90.getClass(), "title", "SzjVpOQTyS");
        setField(term90, term90.getClass(), "tags", term105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.replaceSuperclassWithDelegate.CatalogItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term90, args);
    }

};


