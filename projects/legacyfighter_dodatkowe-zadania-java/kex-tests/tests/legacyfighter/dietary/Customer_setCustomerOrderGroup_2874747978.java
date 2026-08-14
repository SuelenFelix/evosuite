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

public class Customer_setCustomerOrderGroup_2874747978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42676;
     Object term42785;

    public Customer_setCustomerOrderGroup_2874747978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term42677 = new Long(-2312307545038820068L);
        Class<? extends Object> term42906 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term42905 = ((Class) term42906).getDeclaredField((String) "Admin");
        ((Field) term42905).setAccessible(true);
        Object enum124 = ((Field) term42905).get((Object) null);
        Long term42701 = new Long(-5076378196239032509L);
        HashMap term42704 = new HashMap();
        Set<Object> term43102 =  ((Map) term42704).keySet();
        HashSet term42703 = new HashSet((Collection<? extends Object>) term43102);
        Long term42723 = new Long(-5297448090819479208L);
        Class<? extends Object> term43124 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term43123 = ((Class) term43124).getDeclaredField((String) "Person");
        ((Field) term43123).setAccessible(true);
        Object enum125 = ((Field) term43123).get((Object) null);
        Long term42742 = new Long(-5840925148221311102L);
        HashMap term42745 = new HashMap();
        Set<Object> term43323 =  ((Map) term42745).keySet();
        HashSet term42744 = new HashSet((Collection<? extends Object>) term43323);
        Long term42763 = new Long(-4208738507614245483L);
        Class<? extends Object> term43335 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term43334 = ((Class) term43335).getDeclaredField((String) "Admin");
        ((Field) term43334).setAccessible(true);
        Object enum126 = ((Field) term43334).get((Object) null);
        Long term42769 = new Long(-7979131537588306481L);
        HashMap term42773 = new HashMap();
        Set<Object> term43531 =  ((Map) term42773).keySet();
        HashSet term42772 = new HashSet((Collection<? extends Object>) term43531);
        HashMap term42779 = new HashMap();
        Set<Object> term43532 =  ((Map) term42779).keySet();
        HashSet term42778 = new HashSet((Collection<? extends Object>) term43532);
        term42676 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term42700 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term42722 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term42740 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term42741 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term42762 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term42768 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term42771 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        setField(term42676, term42676.getClass(), "id", term42677);
        setField(term42676, term42676.getClass(), "name", "rIKLUjcdnZ");
        setField(term42676, term42676.getClass(), "type", enum124);
        setField(term42700, term42700.getClass(), "id", term42701);
        setField(term42700, term42700.getClass(), "orders", term42703);
        setField(term42700, term42700.getClass(), "description", "ivvEvcUacU");
        setField(term42722, term42722.getClass(), "id", term42723);
        setField(term42722, term42722.getClass(), "name", "gbSukHPGfP");
        setField(term42722, term42722.getClass(), "type", enum125);
        setField(term42740, term42740.getClass(), "id", null);
        setField(term42740, term42740.getClass(), "orders", null);
        setField(term42740, term42740.getClass(), "description", null);
        setField(term42740, term42740.getClass(), "customer", null);
        setField(term42740, term42740.getClass(), "parent", null);
        setField(term42740, term42740.getClass(), "childs", null);
        setField(term42722, term42722.getClass(), "customerOrderGroup", term42740);
        setField(term42700, term42700.getClass(), "customer", term42722);
        setField(term42741, term42741.getClass(), "id", term42742);
        setField(term42741, term42741.getClass(), "orders", term42744);
        setField(term42741, term42741.getClass(), "description", "MQaKKukkYD");
        setField(term42762, term42762.getClass(), "id", term42763);
        setField(term42762, term42762.getClass(), "name", "");
        setField(term42762, term42762.getClass(), "type", enum126);
        setField(term42768, term42768.getClass(), "id", term42769);
        setField(term42768, term42768.getClass(), "orders", null);
        setField(term42768, term42768.getClass(), "description", null);
        setField(term42768, term42768.getClass(), "customer", null);
        setField(term42768, term42768.getClass(), "parent", null);
        setField(term42768, term42768.getClass(), "childs", null);
        setField(term42762, term42762.getClass(), "customerOrderGroup", term42768);
        setField(term42741, term42741.getClass(), "customer", term42762);
        setField(term42771, term42771.getClass(), "id", null);
        setField(term42771, term42771.getClass(), "orders", null);
        setField(term42771, term42771.getClass(), "description", null);
        setField(term42771, term42771.getClass(), "customer", null);
        setField(term42771, term42771.getClass(), "parent", null);
        setField(term42771, term42771.getClass(), "childs", null);
        setField(term42741, term42741.getClass(), "parent", term42771);
        setField(term42741, term42741.getClass(), "childs", term42772);
        setField(term42700, term42700.getClass(), "parent", term42741);
        setField(term42700, term42700.getClass(), "childs", term42778);
        setField(term42676, term42676.getClass(), "customerOrderGroup", term42700);
        Long term42786 = new Long(-2018377284090852639L);
        HashMap term42789 = new HashMap();
        Set<Object> term43533 =  ((Map) term42789).keySet();
        HashSet term42788 = new HashSet((Collection<? extends Object>) term43533);
        Long term42814 = new Long(-6960323426014178409L);
        Class<? extends Object> term43555 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term43554 = ((Class) term43555).getDeclaredField((String) "Person");
        ((Field) term43554).setAccessible(true);
        Object enum127 = ((Field) term43554).get((Object) null);
        Long term42840 = new Long(-9020854345282284171L);
        HashMap term42843 = new HashMap();
        Set<Object> term43754 =  ((Map) term42843).keySet();
        HashSet term42842 = new HashSet((Collection<? extends Object>) term43754);
        Long term42862 = new Long(-6799265768469176623L);
        HashMap term42878 = new HashMap();
        Set<Object> term43775 =  ((Map) term42878).keySet();
        HashSet term42877 = new HashSet((Collection<? extends Object>) term43775);
        HashMap term42885 = new HashMap();
        Set<Object> term43776 =  ((Map) term42885).keySet();
        HashSet term42884 = new HashSet((Collection<? extends Object>) term43776);
        term42785 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term42813 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term42838 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term42839 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term42861 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term42876 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        setField(term42785, term42785.getClass(), "id", term42786);
        setField(term42785, term42785.getClass(), "orders", term42788);
        setField(term42785, term42785.getClass(), "description", "VbIydgisyZ");
        setField(term42813, term42813.getClass(), "id", term42814);
        setField(term42813, term42813.getClass(), "name", "vigaMWRpCA");
        setField(term42813, term42813.getClass(), "type", enum127);
        setField(term42838, term42838.getClass(), "id", null);
        setField(term42838, term42838.getClass(), "orders", null);
        setField(term42838, term42838.getClass(), "description", null);
        setField(term42838, term42838.getClass(), "customer", null);
        setField(term42838, term42838.getClass(), "parent", null);
        setField(term42838, term42838.getClass(), "childs", null);
        setField(term42813, term42813.getClass(), "customerOrderGroup", term42838);
        setField(term42785, term42785.getClass(), "customer", term42813);
        setField(term42839, term42839.getClass(), "id", term42840);
        setField(term42839, term42839.getClass(), "orders", term42842);
        setField(term42839, term42839.getClass(), "description", "NiKeRXajei");
        setField(term42861, term42861.getClass(), "id", term42862);
        setField(term42861, term42861.getClass(), "name", "fDNtdfDzQh");
        setField(term42861, term42861.getClass(), "type", enum124);
        setField(term42861, term42861.getClass(), "customerOrderGroup", term42839);
        setField(term42839, term42839.getClass(), "customer", term42861);
        setField(term42876, term42876.getClass(), "id", null);
        setField(term42876, term42876.getClass(), "orders", null);
        setField(term42876, term42876.getClass(), "description", null);
        setField(term42876, term42876.getClass(), "customer", null);
        setField(term42876, term42876.getClass(), "parent", null);
        setField(term42876, term42876.getClass(), "childs", null);
        setField(term42839, term42839.getClass(), "parent", term42876);
        setField(term42839, term42839.getClass(), "childs", term42877);
        setField(term42785, term42785.getClass(), "parent", term42839);
        setField(term42785, term42785.getClass(), "childs", term42884);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.Customer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("legacyfighter.dietary.CustomerOrderGroup");
        Object[] args = new Object[1];
        args[0] = term42785;
        callMethod(klass, "setCustomerOrderGroup", argTypes, term42676, args);
    }

};


