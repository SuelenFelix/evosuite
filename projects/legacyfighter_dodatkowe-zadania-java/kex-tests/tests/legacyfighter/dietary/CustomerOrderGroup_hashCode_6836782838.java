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

public class CustomerOrderGroup_hashCode_6836782838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37761;

    public CustomerOrderGroup_hashCode_6836782838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term37762 = new Long(4384548833934581339L);
        HashMap term37765 = new HashMap();
        Set<Object> term37862 =  ((Map) term37765).keySet();
        HashSet term37764 = new HashSet((Collection<? extends Object>) term37862);
        Long term37792 = new Long(-3863836475734251469L);
        Class<? extends Object> term37884 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term37883 = ((Class) term37884).getDeclaredField((String) "Admin");
        ((Field) term37883).setAccessible(true);
        Object enum107 = ((Field) term37883).get((Object) null);
        Long term37816 = new Long(-6427825980816337085L);
        HashMap term37819 = new HashMap();
        Set<Object> term38080 =  ((Map) term37819).keySet();
        HashSet term37818 = new HashSet((Collection<? extends Object>) term38080);
        Long term37837 = new Long(1984951428829541736L);
        Class<? extends Object> term38092 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term38091 = ((Class) term38092).getDeclaredField((String) "Admin");
        ((Field) term38091).setAccessible(true);
        Object enum108 = ((Field) term38091).get((Object) null);
        HashMap term37845 = new HashMap();
        Set<Object> term38288 =  ((Map) term37845).keySet();
        HashSet term37844 = new HashSet((Collection<? extends Object>) term38288);
        HashMap term37852 = new HashMap();
        Set<Object> term38289 =  ((Map) term37852).keySet();
        HashSet term37851 = new HashSet((Collection<? extends Object>) term38289);
        term37761 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term37791 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term37815 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term37836 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term37842 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term37843 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term37850 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        setField(term37761, term37761.getClass(), "id", term37762);
        setField(term37761, term37761.getClass(), "orders", term37764);
        setField(term37761, term37761.getClass(), "description", "FivesaUeHG");
        setField(term37791, term37791.getClass(), "id", term37792);
        setField(term37791, term37791.getClass(), "name", "TnpXhZmCRY");
        setField(term37791, term37791.getClass(), "type", enum107);
        setField(term37815, term37815.getClass(), "id", term37816);
        setField(term37815, term37815.getClass(), "orders", term37818);
        setField(term37815, term37815.getClass(), "description", "vjNETNMDhQ");
        setField(term37836, term37836.getClass(), "id", term37837);
        setField(term37836, term37836.getClass(), "name", "");
        setField(term37836, term37836.getClass(), "type", enum108);
        setField(term37842, term37842.getClass(), "id", null);
        setField(term37842, term37842.getClass(), "orders", null);
        setField(term37842, term37842.getClass(), "description", null);
        setField(term37842, term37842.getClass(), "customer", null);
        setField(term37842, term37842.getClass(), "parent", null);
        setField(term37842, term37842.getClass(), "childs", null);
        setField(term37836, term37836.getClass(), "customerOrderGroup", term37842);
        setField(term37815, term37815.getClass(), "customer", term37836);
        setField(term37843, term37843.getClass(), "id", null);
        setField(term37843, term37843.getClass(), "orders", null);
        setField(term37843, term37843.getClass(), "description", null);
        setField(term37843, term37843.getClass(), "customer", null);
        setField(term37843, term37843.getClass(), "parent", null);
        setField(term37843, term37843.getClass(), "childs", null);
        setField(term37815, term37815.getClass(), "parent", term37843);
        setField(term37815, term37815.getClass(), "childs", term37844);
        setField(term37791, term37791.getClass(), "customerOrderGroup", term37815);
        setField(term37761, term37761.getClass(), "customer", term37791);
        setField(term37850, term37850.getClass(), "id", null);
        setField(term37850, term37850.getClass(), "orders", null);
        setField(term37850, term37850.getClass(), "description", null);
        setField(term37850, term37850.getClass(), "customer", null);
        setField(term37850, term37850.getClass(), "parent", null);
        setField(term37850, term37850.getClass(), "childs", null);
        setField(term37761, term37761.getClass(), "parent", term37850);
        setField(term37761, term37761.getClass(), "childs", term37851);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.CustomerOrderGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term37761, args);
    }

};


