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
import java.util.ArrayList;

public class Order_getCustomerOrderGroup_124483140710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9294;

    public Order_getCustomerOrderGroup_124483140710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9295 = new Long(-354905832180781372L);
        Class<? extends Object> term9431 = Class.forName((String) "legacyfighter.dietary.Order$OrderState");
        Field term9430 = ((Class) term9431).getDeclaredField((String) "Initial");
        ((Field) term9430).setAccessible(true);
        Object enum28 = ((Field) term9430).get((Object) null);
        Class<? extends Object> term9649 = Class.forName((String) "legacyfighter.dietary.Order$OrderType");
        Field term9648 = ((Class) term9649).getDeclaredField((String) "Wire");
        ((Field) term9648).setAccessible(true);
        Object enum29 = ((Field) term9648).get((Object) null);
        Long term9317 = new Long(-5967061076297699457L);
        HashMap term9320 = new HashMap();
        Set<Object> term9852 =  ((Map) term9320).keySet();
        HashSet term9319 = new HashSet((Collection<? extends Object>) term9852);
        Long term9339 = new Long(797798302378380033L);
        Class<? extends Object> term9874 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term9873 = ((Class) term9874).getDeclaredField((String) "Division");
        ((Field) term9873).setAccessible(true);
        Object enum30 = ((Field) term9873).get((Object) null);
        HashMap term9357 = new HashMap();
        Set<Object> term10079 =  ((Map) term9357).keySet();
        HashSet term9356 = new HashSet((Collection<? extends Object>) term10079);
        ArrayList term9363 = new ArrayList();
        Long term9370 = new Long(-4136906775323730350L);
        Object term9369 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term9380 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term9369, term9369.getClass(), "id", term9370);
        setField(term9369, term9369.getClass(), "taxCode", "");
        setBooleanField(term9369, term9369.getClass(), "isLinear", true);
        setIntField(term9369, term9369.getClass(), "aFactor", 633765954);
        setIntField(term9369, term9369.getClass(), "bFactor", 269110087);
        setBooleanField(term9369, term9369.getClass(), "isSquare", true);
        setIntField(term9369, term9369.getClass(), "aSquareFactor", 1545119095);
        setIntField(term9369, term9369.getClass(), "bSquareFactor", 1671229683);
        setIntField(term9369, term9369.getClass(), "cSuqreFactor", 34167717);
        setField(term9380, term9380.getClass(), "id", null);
        setField(term9380, term9380.getClass(), "description", null);
        setField(term9380, term9380.getClass(), "countryReason", null);
        setField(term9380, term9380.getClass(), "countryCode", null);
        setField(term9380, term9380.getClass(), "lastModifiedDate", null);
        setField(term9380, term9380.getClass(), "modifiedBy", null);
        setIntField(term9380, term9380.getClass(), "currentRulesCount", 0);
        setIntField(term9380, term9380.getClass(), "maxRulesCount", 0);
        setField(term9380, term9380.getClass(), "taxRules", null);
        setField(term9369, term9369.getClass(), "taxConfig", term9380);
        Long term9384 = new Long(-1978508496784157882L);
        Object term9383 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term9394 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term9383, term9383.getClass(), "id", term9384);
        setField(term9383, term9383.getClass(), "taxCode", "");
        setBooleanField(term9383, term9383.getClass(), "isLinear", false);
        setIntField(term9383, term9383.getClass(), "aFactor", -96541009);
        setIntField(term9383, term9383.getClass(), "bFactor", -43719302);
        setBooleanField(term9383, term9383.getClass(), "isSquare", false);
        setIntField(term9383, term9383.getClass(), "aSquareFactor", 1024134939);
        setIntField(term9383, term9383.getClass(), "bSquareFactor", 109078154);
        setIntField(term9383, term9383.getClass(), "cSuqreFactor", -314165467);
        setField(term9394, term9394.getClass(), "id", null);
        setField(term9394, term9394.getClass(), "description", null);
        setField(term9394, term9394.getClass(), "countryReason", null);
        setField(term9394, term9394.getClass(), "countryCode", null);
        setField(term9394, term9394.getClass(), "lastModifiedDate", null);
        setField(term9394, term9394.getClass(), "modifiedBy", null);
        setIntField(term9394, term9394.getClass(), "currentRulesCount", 0);
        setIntField(term9394, term9394.getClass(), "maxRulesCount", 0);
        setField(term9394, term9394.getClass(), "taxRules", null);
        setField(term9383, term9383.getClass(), "taxConfig", term9394);
        Long term9398 = new Long(8640463098965331396L);
        Object term9397 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term9408 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term9397, term9397.getClass(), "id", term9398);
        setField(term9397, term9397.getClass(), "taxCode", "");
        setBooleanField(term9397, term9397.getClass(), "isLinear", true);
        setIntField(term9397, term9397.getClass(), "aFactor", 27043781);
        setIntField(term9397, term9397.getClass(), "bFactor", -1367122405);
        setBooleanField(term9397, term9397.getClass(), "isSquare", false);
        setIntField(term9397, term9397.getClass(), "aSquareFactor", -1703625118);
        setIntField(term9397, term9397.getClass(), "bSquareFactor", 1104108112);
        setIntField(term9397, term9397.getClass(), "cSuqreFactor", 1648665618);
        setField(term9408, term9408.getClass(), "id", null);
        setField(term9408, term9408.getClass(), "description", null);
        setField(term9408, term9408.getClass(), "countryReason", null);
        setField(term9408, term9408.getClass(), "countryCode", null);
        setField(term9408, term9408.getClass(), "lastModifiedDate", null);
        setField(term9408, term9408.getClass(), "modifiedBy", null);
        setIntField(term9408, term9408.getClass(), "currentRulesCount", 0);
        setIntField(term9408, term9408.getClass(), "maxRulesCount", 0);
        setField(term9408, term9408.getClass(), "taxRules", null);
        setField(term9397, term9397.getClass(), "taxConfig", term9408);
        Long term9412 = new Long(1964822153944985001L);
        Object term9411 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term9422 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term9411, term9411.getClass(), "id", term9412);
        setField(term9411, term9411.getClass(), "taxCode", "");
        setBooleanField(term9411, term9411.getClass(), "isLinear", true);
        setIntField(term9411, term9411.getClass(), "aFactor", 455632030);
        setIntField(term9411, term9411.getClass(), "bFactor", -1632929393);
        setBooleanField(term9411, term9411.getClass(), "isSquare", true);
        setIntField(term9411, term9411.getClass(), "aSquareFactor", -431440129);
        setIntField(term9411, term9411.getClass(), "bSquareFactor", -763576148);
        setIntField(term9411, term9411.getClass(), "cSuqreFactor", 1568948514);
        setField(term9422, term9422.getClass(), "id", null);
        setField(term9422, term9422.getClass(), "description", null);
        setField(term9422, term9422.getClass(), "countryReason", null);
        setField(term9422, term9422.getClass(), "countryCode", null);
        setField(term9422, term9422.getClass(), "lastModifiedDate", null);
        setField(term9422, term9422.getClass(), "modifiedBy", null);
        setIntField(term9422, term9422.getClass(), "currentRulesCount", 0);
        setIntField(term9422, term9422.getClass(), "maxRulesCount", 0);
        setField(term9422, term9422.getClass(), "taxRules", null);
        setField(term9411, term9411.getClass(), "taxConfig", term9422);
        ArrayList term9367 = new ArrayList();
        ((ArrayList) term9367).add(term9369);
        ((ArrayList) term9367).add(term9383);
        ((ArrayList) term9367).add(term9397);
        ((ArrayList) term9367).add(term9411);
        term9294 = newInstance(Class.forName("legacyfighter.dietary.Order"));
        Object term9316 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term9338 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term9427 = newInstance(Class.forName("java.time.Instant"));
        setField(term9294, term9294.getClass(), "id", term9295);
        setField(term9294, term9294.getClass(), "orderState", enum28);
        setField(term9294, term9294.getClass(), "orderType", enum29);
        setField(term9316, term9316.getClass(), "id", term9317);
        setField(term9316, term9316.getClass(), "orders", term9319);
        setField(term9316, term9316.getClass(), "description", "lBOokzEPfe");
        setField(term9338, term9338.getClass(), "id", term9339);
        setField(term9338, term9338.getClass(), "name", "dtGZCsKXbW");
        setField(term9338, term9338.getClass(), "type", enum30);
        setField(term9338, term9338.getClass(), "customerOrderGroup", term9316);
        setField(term9316, term9316.getClass(), "customer", term9338);
        setField(term9316, term9316.getClass(), "parent", term9316);
        setField(term9316, term9316.getClass(), "childs", term9356);
        setField(term9294, term9294.getClass(), "customerOrderGroup", term9316);
        setField(term9294, term9294.getClass(), "items", term9363);
        setField(term9294, term9294.getClass(), "taxRules", term9367);
        setLongField(term9427, term9427.getClass(), "seconds", 1650014053L);
        setIntField(term9427, term9427.getClass(), "nanos", 723000000);
        setField(term9294, term9294.getClass(), "confirmationTimestamp", term9427);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.Order");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCustomerOrderGroup", argTypes, term9294, args);
    }

};


