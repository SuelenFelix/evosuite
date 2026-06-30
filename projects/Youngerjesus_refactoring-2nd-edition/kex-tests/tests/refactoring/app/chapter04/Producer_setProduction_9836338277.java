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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class Producer_setProduction_9836338277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1732;
     Object term1785;

    public Producer_setProduction_9836338277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1762 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1762, term1762.getClass(), "name", null);
        setIntField(term1762, term1762.getClass(), "cost", -201010601);
        setIntField(term1762, term1762.getClass(), "production", 2060027076);
        setField(term1762, term1762.getClass(), "province", null);
        Object term1765 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1765, term1765.getClass(), "name", null);
        setIntField(term1765, term1765.getClass(), "cost", 0);
        setIntField(term1765, term1765.getClass(), "production", 0);
        setField(term1765, term1765.getClass(), "province", null);
        Object term1768 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1768, term1768.getClass(), "name", null);
        setIntField(term1768, term1768.getClass(), "cost", 0);
        setIntField(term1768, term1768.getClass(), "production", 0);
        setField(term1768, term1768.getClass(), "province", null);
        Object term1771 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1771, term1771.getClass(), "name", null);
        setIntField(term1771, term1771.getClass(), "cost", -1389314671);
        setIntField(term1771, term1771.getClass(), "production", -499699841);
        setField(term1771, term1771.getClass(), "province", null);
        Object term1774 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1774, term1774.getClass(), "name", null);
        setIntField(term1774, term1774.getClass(), "cost", 2084868811);
        setIntField(term1774, term1774.getClass(), "production", 314478878);
        setField(term1774, term1774.getClass(), "province", null);
        Object term1777 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1777, term1777.getClass(), "name", null);
        setIntField(term1777, term1777.getClass(), "cost", -524352937);
        setIntField(term1777, term1777.getClass(), "production", 1472218987);
        setField(term1777, term1777.getClass(), "province", null);
        ArrayList term1760 = new ArrayList();
        ((ArrayList) term1760).add(term1762);
        ((ArrayList) term1760).add(term1765);
        ((ArrayList) term1760).add(term1768);
        ((ArrayList) term1760).add(term1771);
        ((ArrayList) term1760).add(term1774);
        ((ArrayList) term1760).add(term1777);
        ((ArrayList) term1760).add(term1768);
        term1732 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term1747 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1732, term1732.getClass(), "name", "bKBSncrMEZ");
        setIntField(term1732, term1732.getClass(), "cost", 1343432022);
        setIntField(term1732, term1732.getClass(), "production", -1767079160);
        setField(term1747, term1747.getClass(), "name", "yeSXGqQExb");
        setField(term1747, term1747.getClass(), "producers", term1760);
        setIntField(term1747, term1747.getClass(), "totalProduction", -1665928103);
        setIntField(term1747, term1747.getClass(), "demand", 1574458332);
        setIntField(term1747, term1747.getClass(), "price", -975856245);
        setField(term1732, term1732.getClass(), "province", term1747);
        term1785 = new Integer(-1023366103);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter04.Producer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1785;
        callMethod(klass, "setProduction", argTypes, term1732, args);
    }

};


