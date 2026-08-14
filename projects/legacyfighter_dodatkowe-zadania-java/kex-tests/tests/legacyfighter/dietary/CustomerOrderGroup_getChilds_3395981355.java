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

public class CustomerOrderGroup_getChilds_3395981355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35740;

    public CustomerOrderGroup_getChilds_3395981355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term35741 = new Long(4680638415078495388L);
        HashMap term35744 = new HashMap();
        Set<Object> term35869 =  ((Map) term35744).keySet();
        HashSet term35743 = new HashSet((Collection<? extends Object>) term35869);
        Long term35773 = new Long(-2035190444044214401L);
        Class<? extends Object> term35891 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term35890 = ((Class) term35891).getDeclaredField((String) "Person");
        ((Field) term35890).setAccessible(true);
        Object enum100 = ((Field) term35890).get((Object) null);
        Long term35799 = new Long(-9079056015194933995L);
        HashMap term35802 = new HashMap();
        Set<Object> term36090 =  ((Map) term35802).keySet();
        HashSet term35801 = new HashSet((Collection<? extends Object>) term36090);
        Long term35821 = new Long(-6455995631591797782L);
        Class<? extends Object> term36112 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term36111 = ((Class) term36112).getDeclaredField((String) "Admin");
        ((Field) term36111).setAccessible(true);
        Object enum101 = ((Field) term36111).get((Object) null);
        Long term35839 = new Long(4554910377138538493L);
        HashSet term35841 = new HashSet();
        Long term35844 = new Long(4733182453235379235L);
        Long term35847 = new Long(5705211845607271062L);
        HashSet term35849 = new HashSet();
        HashMap term35852 = new HashMap();
        Set<Object> term36308 =  ((Map) term35852).keySet();
        HashSet term35851 = new HashSet((Collection<? extends Object>) term36308);
        HashMap term35859 = new HashMap();
        Set<Object> term36309 =  ((Map) term35859).keySet();
        HashSet term35858 = new HashSet((Collection<? extends Object>) term36309);
        term35740 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term35772 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term35797 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term35798 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term35820 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term35838 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term35843 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term35846 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term35850 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        setField(term35740, term35740.getClass(), "id", term35741);
        setField(term35740, term35740.getClass(), "orders", term35743);
        setField(term35740, term35740.getClass(), "description", "xfqaJVcHGx");
        setField(term35772, term35772.getClass(), "id", term35773);
        setField(term35772, term35772.getClass(), "name", "bANxpqKESI");
        setField(term35772, term35772.getClass(), "type", enum100);
        setField(term35797, term35797.getClass(), "id", null);
        setField(term35797, term35797.getClass(), "orders", null);
        setField(term35797, term35797.getClass(), "description", null);
        setField(term35797, term35797.getClass(), "customer", null);
        setField(term35797, term35797.getClass(), "parent", null);
        setField(term35797, term35797.getClass(), "childs", null);
        setField(term35772, term35772.getClass(), "customerOrderGroup", term35797);
        setField(term35740, term35740.getClass(), "customer", term35772);
        setField(term35798, term35798.getClass(), "id", term35799);
        setField(term35798, term35798.getClass(), "orders", term35801);
        setField(term35798, term35798.getClass(), "description", "lOIEIGbwPj");
        setField(term35820, term35820.getClass(), "id", term35821);
        setField(term35820, term35820.getClass(), "name", "TvmWaJWmLY");
        setField(term35820, term35820.getClass(), "type", enum101);
        setField(term35838, term35838.getClass(), "id", term35839);
        setField(term35838, term35838.getClass(), "orders", term35841);
        setField(term35838, term35838.getClass(), "description", "");
        setField(term35843, term35843.getClass(), "id", term35844);
        setField(term35843, term35843.getClass(), "name", null);
        setField(term35843, term35843.getClass(), "type", null);
        setField(term35843, term35843.getClass(), "customerOrderGroup", term35797);
        setField(term35838, term35838.getClass(), "customer", term35843);
        setField(term35846, term35846.getClass(), "id", term35847);
        setField(term35846, term35846.getClass(), "orders", null);
        setField(term35846, term35846.getClass(), "description", null);
        setField(term35846, term35846.getClass(), "customer", null);
        setField(term35846, term35846.getClass(), "parent", null);
        setField(term35846, term35846.getClass(), "childs", null);
        setField(term35838, term35838.getClass(), "parent", term35846);
        setField(term35838, term35838.getClass(), "childs", term35849);
        setField(term35820, term35820.getClass(), "customerOrderGroup", term35838);
        setField(term35798, term35798.getClass(), "customer", term35820);
        setField(term35850, term35850.getClass(), "id", null);
        setField(term35850, term35850.getClass(), "orders", null);
        setField(term35850, term35850.getClass(), "description", null);
        setField(term35850, term35850.getClass(), "customer", null);
        setField(term35850, term35850.getClass(), "parent", null);
        setField(term35850, term35850.getClass(), "childs", null);
        setField(term35798, term35798.getClass(), "parent", term35850);
        setField(term35798, term35798.getClass(), "childs", term35851);
        setField(term35740, term35740.getClass(), "parent", term35798);
        setField(term35740, term35740.getClass(), "childs", term35858);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.CustomerOrderGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChilds", argTypes, term35740, args);
    }

};


