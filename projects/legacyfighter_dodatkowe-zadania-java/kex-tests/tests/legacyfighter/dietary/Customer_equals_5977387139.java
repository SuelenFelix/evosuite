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
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Customer_equals_5977387139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43777;
     Object term43857;

    public Customer_equals_5977387139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term43778 = new Long(5254427735699890849L);
        Class<? extends Object> term43869 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term43868 = ((Class) term43869).getDeclaredField((String) "Person");
        ((Field) term43868).setAccessible(true);
        Object enum128 = ((Field) term43868).get((Object) null);
        Long term43803 = new Long(-2981899957757551501L);
        HashMap term43806 = new HashMap();
        Set<Object> term44068 =  ((Map) term43806).keySet();
        HashSet term43805 = new HashSet((Collection<? extends Object>) term44068);
        Long term43825 = new Long(9159382852866553531L);
        Long term43840 = new Long(-1353104097704898755L);
        HashSet term43842 = new HashSet();
        Long term43845 = new Long(-8176783923061900011L);
        Long term43848 = new Long(2856654200900890130L);
        HashSet term43850 = new HashSet();
        HashMap term43852 = new HashMap();
        Set<Object> term44089 =  ((Map) term43852).keySet();
        HashSet term43851 = new HashSet((Collection<? extends Object>) term44089);
        term43777 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term43802 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term43824 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term43839 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term43844 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term43847 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        setField(term43777, term43777.getClass(), "id", term43778);
        setField(term43777, term43777.getClass(), "name", "sgVVVUpnau");
        setField(term43777, term43777.getClass(), "type", enum128);
        setField(term43802, term43802.getClass(), "id", term43803);
        setField(term43802, term43802.getClass(), "orders", term43805);
        setField(term43802, term43802.getClass(), "description", "WXUKmhwFsK");
        setField(term43824, term43824.getClass(), "id", term43825);
        setField(term43824, term43824.getClass(), "name", "OcfokBTzZZ");
        setField(term43824, term43824.getClass(), "type", enum128);
        setField(term43839, term43839.getClass(), "id", term43840);
        setField(term43839, term43839.getClass(), "orders", term43842);
        setField(term43839, term43839.getClass(), "description", "");
        setField(term43844, term43844.getClass(), "id", term43845);
        setField(term43844, term43844.getClass(), "name", null);
        setField(term43844, term43844.getClass(), "type", null);
        setField(term43844, term43844.getClass(), "customerOrderGroup", null);
        setField(term43839, term43839.getClass(), "customer", term43844);
        setField(term43847, term43847.getClass(), "id", term43848);
        setField(term43847, term43847.getClass(), "orders", null);
        setField(term43847, term43847.getClass(), "description", null);
        setField(term43847, term43847.getClass(), "customer", null);
        setField(term43847, term43847.getClass(), "parent", null);
        setField(term43847, term43847.getClass(), "childs", null);
        setField(term43839, term43839.getClass(), "parent", term43847);
        setField(term43839, term43839.getClass(), "childs", term43850);
        setField(term43824, term43824.getClass(), "customerOrderGroup", term43839);
        setField(term43802, term43802.getClass(), "customer", term43824);
        setField(term43802, term43802.getClass(), "parent", term43847);
        setField(term43802, term43802.getClass(), "childs", term43851);
        setField(term43777, term43777.getClass(), "customerOrderGroup", term43802);
        term43857 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.Customer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term43857;
        callMethod(klass, "equals", argTypes, term43777, args);
    }

};


