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

public class CustomerOrderGroup_equals_2349916087 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37135;
     Object term37295;

    public CustomerOrderGroup_equals_2349916087() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term37136 = new Long(337617062500822936L);
        HashMap term37139 = new HashMap();
        Set<Object> term37296 =  ((Map) term37139).keySet();
        HashSet term37138 = new HashSet((Collection<? extends Object>) term37296);
        Long term37164 = new Long(-1863876892925084453L);
        Class<? extends Object> term37318 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term37317 = ((Class) term37318).getDeclaredField((String) "Division");
        ((Field) term37317).setAccessible(true);
        Object enum105 = ((Field) term37317).get((Object) null);
        Long term37192 = new Long(4560845347692916950L);
        HashMap term37195 = new HashMap();
        Set<Object> term37523 =  ((Map) term37195).keySet();
        HashSet term37194 = new HashSet((Collection<? extends Object>) term37523);
        Long term37214 = new Long(8225112290225174957L);
        Class<? extends Object> term37545 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term37544 = ((Class) term37545).getDeclaredField((String) "Company");
        ((Field) term37544).setAccessible(true);
        Object enum106 = ((Field) term37544).get((Object) null);
        Long term37232 = new Long(-4902671035184844892L);
        HashMap term37235 = new HashMap();
        Set<Object> term37747 =  ((Map) term37235).keySet();
        HashSet term37234 = new HashSet((Collection<? extends Object>) term37747);
        Long term37254 = new Long(-3269743329730619135L);
        HashSet term37256 = new HashSet();
        Long term37259 = new Long(852818663192057236L);
        Long term37262 = new Long(-4175022778768613863L);
        HashSet term37264 = new HashSet();
        HashMap term37266 = new HashMap();
        Set<Object> term37758 =  ((Map) term37266).keySet();
        HashSet term37265 = new HashSet((Collection<? extends Object>) term37758);
        HashMap term37272 = new HashMap();
        Set<Object> term37759 =  ((Map) term37272).keySet();
        HashSet term37271 = new HashSet((Collection<? extends Object>) term37759);
        HashMap term37279 = new HashMap();
        Set<Object> term37760 =  ((Map) term37279).keySet();
        HashSet term37278 = new HashSet((Collection<? extends Object>) term37760);
        term37135 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term37163 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term37190 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term37191 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term37213 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term37231 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term37252 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term37253 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term37258 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term37261 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        setField(term37135, term37135.getClass(), "id", term37136);
        setField(term37135, term37135.getClass(), "orders", term37138);
        setField(term37135, term37135.getClass(), "description", "LPlTDoLrUy");
        setField(term37163, term37163.getClass(), "id", term37164);
        setField(term37163, term37163.getClass(), "name", "XETimBHIKG");
        setField(term37163, term37163.getClass(), "type", enum105);
        setField(term37190, term37190.getClass(), "id", null);
        setField(term37190, term37190.getClass(), "orders", null);
        setField(term37190, term37190.getClass(), "description", null);
        setField(term37190, term37190.getClass(), "customer", null);
        setField(term37190, term37190.getClass(), "parent", null);
        setField(term37190, term37190.getClass(), "childs", null);
        setField(term37163, term37163.getClass(), "customerOrderGroup", term37190);
        setField(term37135, term37135.getClass(), "customer", term37163);
        setField(term37191, term37191.getClass(), "id", term37192);
        setField(term37191, term37191.getClass(), "orders", term37194);
        setField(term37191, term37191.getClass(), "description", "ZmfocrvaII");
        setField(term37213, term37213.getClass(), "id", term37214);
        setField(term37213, term37213.getClass(), "name", "LTbQXrGKuA");
        setField(term37213, term37213.getClass(), "type", enum106);
        setField(term37213, term37213.getClass(), "customerOrderGroup", term37135);
        setField(term37191, term37191.getClass(), "customer", term37213);
        setField(term37231, term37231.getClass(), "id", term37232);
        setField(term37231, term37231.getClass(), "orders", term37234);
        setField(term37231, term37231.getClass(), "description", "bjigisSVNp");
        setField(term37252, term37252.getClass(), "id", null);
        setField(term37252, term37252.getClass(), "name", null);
        setField(term37252, term37252.getClass(), "type", null);
        setField(term37252, term37252.getClass(), "customerOrderGroup", null);
        setField(term37231, term37231.getClass(), "customer", term37252);
        setField(term37253, term37253.getClass(), "id", term37254);
        setField(term37253, term37253.getClass(), "orders", term37256);
        setField(term37253, term37253.getClass(), "description", "");
        setField(term37258, term37258.getClass(), "id", term37259);
        setField(term37258, term37258.getClass(), "name", null);
        setField(term37258, term37258.getClass(), "type", null);
        setField(term37258, term37258.getClass(), "customerOrderGroup", term37190);
        setField(term37253, term37253.getClass(), "customer", term37258);
        setField(term37261, term37261.getClass(), "id", term37262);
        setField(term37261, term37261.getClass(), "orders", null);
        setField(term37261, term37261.getClass(), "description", null);
        setField(term37261, term37261.getClass(), "customer", null);
        setField(term37261, term37261.getClass(), "parent", null);
        setField(term37261, term37261.getClass(), "childs", null);
        setField(term37253, term37253.getClass(), "parent", term37261);
        setField(term37253, term37253.getClass(), "childs", term37264);
        setField(term37231, term37231.getClass(), "parent", term37253);
        setField(term37231, term37231.getClass(), "childs", term37265);
        setField(term37191, term37191.getClass(), "parent", term37231);
        setField(term37191, term37191.getClass(), "childs", term37271);
        setField(term37135, term37135.getClass(), "parent", term37191);
        setField(term37135, term37135.getClass(), "childs", term37278);
        term37295 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.CustomerOrderGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term37295;
        callMethod(klass, "equals", argTypes, term37135, args);
    }

};


