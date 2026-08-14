package legacyfighter.dietary;

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
import static legacyfighter.dietary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class CustomerOrderGroup_setChilds_16583149376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36310;
     Object term36463;

    public CustomerOrderGroup_setChilds_16583149376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term36311 = new Long(-447638576776090708L);
        HashMap term36314 = new HashMap();
        Set<Object> term36469 =  ((Map) term36314).keySet();
        HashSet term36313 = new HashSet((Collection<? extends Object>) term36469);
        Long term36341 = new Long(-7175762262426771446L);
        Class<? extends Object> term36491 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term36490 = ((Class) term36491).getDeclaredField((String) "Person");
        ((Field) term36490).setAccessible(true);
        Object enum102 = ((Field) term36490).get((Object) null);
        Long term36366 = new Long(219518058983770018L);
        HashMap term36369 = new HashMap();
        Set<Object> term36690 =  ((Map) term36369).keySet();
        HashSet term36368 = new HashSet((Collection<? extends Object>) term36690);
        Long term36387 = new Long(-3005158994986938727L);
        Class<? extends Object> term36702 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term36701 = ((Class) term36702).getDeclaredField((String) "Division");
        ((Field) term36701).setAccessible(true);
        Object enum103 = ((Field) term36701).get((Object) null);
        HashMap term36394 = new HashMap();
        Set<Object> term36907 =  ((Map) term36394).keySet();
        HashSet term36393 = new HashSet((Collection<? extends Object>) term36907);
        Long term36400 = new Long(1779727837594554817L);
        HashMap term36403 = new HashMap();
        Set<Object> term36908 =  ((Map) term36403).keySet();
        HashSet term36402 = new HashSet((Collection<? extends Object>) term36908);
        Long term36422 = new Long(-474245812336702069L);
        Class<? extends Object> term36930 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term36929 = ((Class) term36930).getDeclaredField((String) "Company");
        ((Field) term36929).setAccessible(true);
        Object enum104 = ((Field) term36929).get((Object) null);
        HashMap term36442 = new HashMap();
        Set<Object> term37132 =  ((Map) term36442).keySet();
        HashSet term36441 = new HashSet((Collection<? extends Object>) term37132);
        HashMap term36449 = new HashMap();
        Set<Object> term37133 =  ((Map) term36449).keySet();
        HashSet term36448 = new HashSet((Collection<? extends Object>) term37133);
        term36310 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term36340 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term36365 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term36386 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term36392 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term36399 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term36421 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term36439 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term36440 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        setField(term36310, term36310.getClass(), "id", term36311);
        setField(term36310, term36310.getClass(), "orders", term36313);
        setField(term36310, term36310.getClass(), "description", "AgQWngzXPH");
        setField(term36340, term36340.getClass(), "id", term36341);
        setField(term36340, term36340.getClass(), "name", "EZJmAIzdHM");
        setField(term36340, term36340.getClass(), "type", enum102);
        setField(term36365, term36365.getClass(), "id", term36366);
        setField(term36365, term36365.getClass(), "orders", term36368);
        setField(term36365, term36365.getClass(), "description", "yZDlWLIKEp");
        setField(term36386, term36386.getClass(), "id", term36387);
        setField(term36386, term36386.getClass(), "name", "");
        setField(term36386, term36386.getClass(), "type", enum103);
        setField(term36392, term36392.getClass(), "id", null);
        setField(term36392, term36392.getClass(), "orders", null);
        setField(term36392, term36392.getClass(), "description", null);
        setField(term36392, term36392.getClass(), "customer", null);
        setField(term36392, term36392.getClass(), "parent", null);
        setField(term36392, term36392.getClass(), "childs", null);
        setField(term36386, term36386.getClass(), "customerOrderGroup", term36392);
        setField(term36365, term36365.getClass(), "customer", term36386);
        setField(term36365, term36365.getClass(), "parent", term36392);
        setField(term36365, term36365.getClass(), "childs", term36393);
        setField(term36340, term36340.getClass(), "customerOrderGroup", term36365);
        setField(term36310, term36310.getClass(), "customer", term36340);
        setField(term36399, term36399.getClass(), "id", term36400);
        setField(term36399, term36399.getClass(), "orders", term36402);
        setField(term36399, term36399.getClass(), "description", "xHLlctEoGh");
        setField(term36421, term36421.getClass(), "id", term36422);
        setField(term36421, term36421.getClass(), "name", "aqgUzcnqpE");
        setField(term36421, term36421.getClass(), "type", enum104);
        setField(term36439, term36439.getClass(), "id", null);
        setField(term36439, term36439.getClass(), "orders", null);
        setField(term36439, term36439.getClass(), "description", null);
        setField(term36439, term36439.getClass(), "customer", null);
        setField(term36439, term36439.getClass(), "parent", null);
        setField(term36439, term36439.getClass(), "childs", null);
        setField(term36421, term36421.getClass(), "customerOrderGroup", term36439);
        setField(term36399, term36399.getClass(), "customer", term36421);
        setField(term36440, term36440.getClass(), "id", null);
        setField(term36440, term36440.getClass(), "orders", null);
        setField(term36440, term36440.getClass(), "description", null);
        setField(term36440, term36440.getClass(), "customer", null);
        setField(term36440, term36440.getClass(), "parent", null);
        setField(term36440, term36440.getClass(), "childs", null);
        setField(term36399, term36399.getClass(), "parent", term36440);
        setField(term36399, term36399.getClass(), "childs", term36441);
        setField(term36310, term36310.getClass(), "parent", term36399);
        setField(term36310, term36310.getClass(), "childs", term36448);
        HashMap term36464 = new HashMap();
        Set<Object> term37134 =  ((Map) term36464).keySet();
        term36463 = new HashSet((Collection<? extends Object>) term37134);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.CustomerOrderGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term36463;
        callMethod(klass, "setChilds", argTypes, term36310, args);
    }

};


