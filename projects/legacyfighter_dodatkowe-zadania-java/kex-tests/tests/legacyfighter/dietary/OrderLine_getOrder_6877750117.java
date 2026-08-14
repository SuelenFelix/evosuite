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
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class OrderLine_getOrder_6877750117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27220;

    public OrderLine_getOrder_6877750117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27221 = new Long(3757985447600693853L);
        Long term27240 = new Long(7118424169978013558L);
        Class<? extends Object> term27354 = Class.forName((String) "legacyfighter.dietary.Order$OrderState");
        Field term27353 = ((Class) term27354).getDeclaredField((String) "Initial");
        ((Field) term27353).setAccessible(true);
        Object enum84 = ((Field) term27353).get((Object) null);
        Class<? extends Object> term27572 = Class.forName((String) "legacyfighter.dietary.Order$OrderType");
        Field term27571 = ((Class) term27572).getDeclaredField((String) "Wire");
        ((Field) term27571).setAccessible(true);
        Object enum85 = ((Field) term27571).get((Object) null);
        Long term27262 = new Long(1145539328952774873L);
        HashMap term27265 = new HashMap();
        Set<Object> term27775 =  ((Map) term27265).keySet();
        HashSet term27264 = new HashSet((Collection<? extends Object>) term27775);
        Long term27283 = new Long(-4593197356529163455L);
        Class<? extends Object> term27787 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term27786 = ((Class) term27787).getDeclaredField((String) "Company");
        ((Field) term27786).setAccessible(true);
        Object enum86 = ((Field) term27786).get((Object) null);
        Long term27289 = new Long(-8449554760304422682L);
        HashMap term27292 = new HashMap();
        Set<Object> term27989 =  ((Map) term27292).keySet();
        HashSet term27291 = new HashSet((Collection<? extends Object>) term27989);
        Object term27299 = newInstance(Class.forName("legacyfighter.dietary.OrderLine"));
        setField(term27299, term27299.getClass(), "id", null);
        setField(term27299, term27299.getClass(), "price", null);
        setField(term27299, term27299.getClass(), "order", null);
        setField(term27299, term27299.getClass(), "product", null);
        setIntField(term27299, term27299.getClass(), "quantity", 0);
        Object term27301 = newInstance(Class.forName("legacyfighter.dietary.OrderLine"));
        setField(term27301, term27301.getClass(), "id", null);
        setField(term27301, term27301.getClass(), "price", null);
        setField(term27301, term27301.getClass(), "order", null);
        setField(term27301, term27301.getClass(), "product", null);
        setIntField(term27301, term27301.getClass(), "quantity", 0);
        Object term27303 = newInstance(Class.forName("legacyfighter.dietary.OrderLine"));
        setField(term27303, term27303.getClass(), "id", null);
        setField(term27303, term27303.getClass(), "price", null);
        setField(term27303, term27303.getClass(), "order", null);
        setField(term27303, term27303.getClass(), "product", null);
        setIntField(term27303, term27303.getClass(), "quantity", 0);
        ArrayList term27297 = new ArrayList();
        ((ArrayList) term27297).add(term27220);
        ((ArrayList) term27297).add(term27299);
        ((ArrayList) term27297).add(term27301);
        ((ArrayList) term27297).add(term27303);
        ArrayList term27307 = new ArrayList();
        Long term27315 = new Long(4087729695916598698L);
        term27220 = newInstance(Class.forName("legacyfighter.dietary.OrderLine"));
        Object term27223 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term27224 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term27226 = (int[]) newIntArray(5);
        Object term27239 = newInstance(Class.forName("legacyfighter.dietary.Order"));
        Object term27261 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term27282 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term27288 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term27311 = newInstance(Class.forName("java.time.Instant"));
        Object term27314 = newInstance(Class.forName("legacyfighter.dietary.Product"));
        Object term27317 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term27318 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term27320 = (int[]) newIntArray(6);
        setField(term27220, term27220.getClass(), "id", term27221);
        setIntField(term27224, term27224.getClass(), "signum", 1);
        setIntElement(term27226, 0, 1664595803);
        setIntElement(term27226, 1, 403872211);
        setIntElement(term27226, 2, -2034612604);
        setIntElement(term27226, 3, 767965502);
        setIntElement(term27226, 4, -762463599);
        setField(term27224, term27224.getClass(), "mag", term27226);
        setIntField(term27224, term27224.getClass(), "bitCountPlusOne", 0);
        setIntField(term27224, term27224.getClass(), "bitLengthPlusOne", 0);
        setIntField(term27224, term27224.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term27224, term27224.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term27223, term27223.getClass(), "intVal", term27224);
        setIntField(term27223, term27223.getClass(), "scale", 49);
        setIntField(term27223, term27223.getClass(), "precision", 0);
        setField(term27223, term27223.getClass(), "stringCache", null);
        setLongField(term27223, term27223.getClass(), "intCompact", -9223372036854775808L);
        setField(term27220, term27220.getClass(), "price", term27223);
        setField(term27239, term27239.getClass(), "id", term27240);
        setField(term27239, term27239.getClass(), "orderState", enum84);
        setField(term27239, term27239.getClass(), "orderType", enum85);
        setField(term27261, term27261.getClass(), "id", term27262);
        setField(term27261, term27261.getClass(), "orders", term27264);
        setField(term27261, term27261.getClass(), "description", "cNoFvpHBHw");
        setField(term27282, term27282.getClass(), "id", term27283);
        setField(term27282, term27282.getClass(), "name", "");
        setField(term27282, term27282.getClass(), "type", enum86);
        setField(term27288, term27288.getClass(), "id", term27289);
        setField(term27288, term27288.getClass(), "orders", null);
        setField(term27288, term27288.getClass(), "description", null);
        setField(term27288, term27288.getClass(), "customer", null);
        setField(term27288, term27288.getClass(), "parent", null);
        setField(term27288, term27288.getClass(), "childs", null);
        setField(term27282, term27282.getClass(), "customerOrderGroup", term27288);
        setField(term27261, term27261.getClass(), "customer", term27282);
        setField(term27261, term27261.getClass(), "parent", term27261);
        setField(term27261, term27261.getClass(), "childs", term27291);
        setField(term27239, term27239.getClass(), "customerOrderGroup", term27261);
        setField(term27239, term27239.getClass(), "items", term27297);
        setField(term27239, term27239.getClass(), "taxRules", term27307);
        setLongField(term27311, term27311.getClass(), "seconds", 1653781715L);
        setIntField(term27311, term27311.getClass(), "nanos", 654000000);
        setField(term27239, term27239.getClass(), "confirmationTimestamp", term27311);
        setField(term27220, term27220.getClass(), "order", term27239);
        setField(term27314, term27314.getClass(), "id", term27315);
        setIntField(term27318, term27318.getClass(), "signum", 1);
        setIntElement(term27320, 0, 40950);
        setIntElement(term27320, 1, 432804475);
        setIntElement(term27320, 2, 829548913);
        setIntElement(term27320, 3, -909343786);
        setIntElement(term27320, 4, 146380284);
        setIntElement(term27320, 5, -462703463);
        setField(term27318, term27318.getClass(), "mag", term27320);
        setIntField(term27318, term27318.getClass(), "bitCountPlusOne", 0);
        setIntField(term27318, term27318.getClass(), "bitLengthPlusOne", 0);
        setIntField(term27318, term27318.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term27318, term27318.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term27317, term27317.getClass(), "intVal", term27318);
        setIntField(term27317, term27317.getClass(), "scale", 53);
        setIntField(term27317, term27317.getClass(), "precision", 0);
        setField(term27317, term27317.getClass(), "stringCache", null);
        setLongField(term27317, term27317.getClass(), "intCompact", -9223372036854775808L);
        setField(term27314, term27314.getClass(), "price", term27317);
        setField(term27314, term27314.getClass(), "product", "zRnpRGaHlI");
        setIntField(term27314, term27314.getClass(), "counter", -638126185);
        setField(term27220, term27220.getClass(), "product", term27314);
        setIntField(term27220, term27220.getClass(), "quantity", 28070985);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.OrderLine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrder", argTypes, term27220, args);
    }

};


