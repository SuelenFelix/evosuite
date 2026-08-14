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
import java.util.ArrayList;

public class TaxConfig_equals_132265752617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21732;
     Object term21854;

    public TaxConfig_equals_132265752617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21733 = new Long(8578289401978257809L);
        Long term21791 = new Long(-1719189544794576143L);
        Long term21802 = new Long(60910260492008727L);
        Object term21790 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term21801 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term21790, term21790.getClass(), "id", term21791);
        setField(term21790, term21790.getClass(), "taxCode", "");
        setBooleanField(term21790, term21790.getClass(), "isLinear", true);
        setIntField(term21790, term21790.getClass(), "aFactor", -1726073541);
        setIntField(term21790, term21790.getClass(), "bFactor", 406945977);
        setBooleanField(term21790, term21790.getClass(), "isSquare", true);
        setIntField(term21790, term21790.getClass(), "aSquareFactor", 493657684);
        setIntField(term21790, term21790.getClass(), "bSquareFactor", 1882655922);
        setIntField(term21790, term21790.getClass(), "cSuqreFactor", 1314996390);
        setField(term21801, term21801.getClass(), "id", term21802);
        setField(term21801, term21801.getClass(), "description", null);
        setField(term21801, term21801.getClass(), "countryReason", null);
        setField(term21801, term21801.getClass(), "countryCode", null);
        setField(term21801, term21801.getClass(), "lastModifiedDate", null);
        setField(term21801, term21801.getClass(), "modifiedBy", null);
        setIntField(term21801, term21801.getClass(), "currentRulesCount", 1367703658);
        setIntField(term21801, term21801.getClass(), "maxRulesCount", 1120153100);
        setField(term21801, term21801.getClass(), "taxRules", null);
        setField(term21790, term21790.getClass(), "taxConfig", term21801);
        Long term21807 = new Long(2001497540145118L);
        Long term21818 = new Long(-9048797705753068816L);
        Object term21806 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term21817 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term21806, term21806.getClass(), "id", term21807);
        setField(term21806, term21806.getClass(), "taxCode", "");
        setBooleanField(term21806, term21806.getClass(), "isLinear", false);
        setIntField(term21806, term21806.getClass(), "aFactor", 610850630);
        setIntField(term21806, term21806.getClass(), "bFactor", 170509161);
        setBooleanField(term21806, term21806.getClass(), "isSquare", true);
        setIntField(term21806, term21806.getClass(), "aSquareFactor", 491497994);
        setIntField(term21806, term21806.getClass(), "bSquareFactor", 1997288643);
        setIntField(term21806, term21806.getClass(), "cSuqreFactor", -378961519);
        setField(term21817, term21817.getClass(), "id", term21818);
        setField(term21817, term21817.getClass(), "description", null);
        setField(term21817, term21817.getClass(), "countryReason", null);
        setField(term21817, term21817.getClass(), "countryCode", null);
        setField(term21817, term21817.getClass(), "lastModifiedDate", null);
        setField(term21817, term21817.getClass(), "modifiedBy", null);
        setIntField(term21817, term21817.getClass(), "currentRulesCount", -400280008);
        setIntField(term21817, term21817.getClass(), "maxRulesCount", -1191957775);
        setField(term21817, term21817.getClass(), "taxRules", null);
        setField(term21806, term21806.getClass(), "taxConfig", term21817);
        Long term21823 = new Long(-3708632729138387526L);
        Long term21834 = new Long(2359134970522271046L);
        Object term21822 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term21833 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term21822, term21822.getClass(), "id", term21823);
        setField(term21822, term21822.getClass(), "taxCode", "");
        setBooleanField(term21822, term21822.getClass(), "isLinear", false);
        setIntField(term21822, term21822.getClass(), "aFactor", -169463842);
        setIntField(term21822, term21822.getClass(), "bFactor", -2106837394);
        setBooleanField(term21822, term21822.getClass(), "isSquare", true);
        setIntField(term21822, term21822.getClass(), "aSquareFactor", -533202192);
        setIntField(term21822, term21822.getClass(), "bSquareFactor", -1349617857);
        setIntField(term21822, term21822.getClass(), "cSuqreFactor", 1346331516);
        setField(term21833, term21833.getClass(), "id", term21834);
        setField(term21833, term21833.getClass(), "description", null);
        setField(term21833, term21833.getClass(), "countryReason", null);
        setField(term21833, term21833.getClass(), "countryCode", null);
        setField(term21833, term21833.getClass(), "lastModifiedDate", null);
        setField(term21833, term21833.getClass(), "modifiedBy", null);
        setIntField(term21833, term21833.getClass(), "currentRulesCount", 1018925421);
        setIntField(term21833, term21833.getClass(), "maxRulesCount", -1658031378);
        setField(term21833, term21833.getClass(), "taxRules", null);
        setField(term21822, term21822.getClass(), "taxConfig", term21833);
        Long term21839 = new Long(-8947510185810654315L);
        Object term21838 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term21849 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term21838, term21838.getClass(), "id", term21839);
        setField(term21838, term21838.getClass(), "taxCode", "");
        setBooleanField(term21838, term21838.getClass(), "isLinear", false);
        setIntField(term21838, term21838.getClass(), "aFactor", 957091706);
        setIntField(term21838, term21838.getClass(), "bFactor", -2011802805);
        setBooleanField(term21838, term21838.getClass(), "isSquare", false);
        setIntField(term21838, term21838.getClass(), "aSquareFactor", -1683802689);
        setIntField(term21838, term21838.getClass(), "bSquareFactor", -1949346221);
        setIntField(term21838, term21838.getClass(), "cSuqreFactor", 831638391);
        setField(term21849, term21849.getClass(), "id", null);
        setField(term21849, term21849.getClass(), "description", null);
        setField(term21849, term21849.getClass(), "countryReason", null);
        setField(term21849, term21849.getClass(), "countryCode", null);
        setField(term21849, term21849.getClass(), "lastModifiedDate", null);
        setField(term21849, term21849.getClass(), "modifiedBy", null);
        setIntField(term21849, term21849.getClass(), "currentRulesCount", 0);
        setIntField(term21849, term21849.getClass(), "maxRulesCount", 0);
        setField(term21849, term21849.getClass(), "taxRules", null);
        setField(term21838, term21838.getClass(), "taxConfig", term21849);
        ArrayList term21788 = new ArrayList();
        ((ArrayList) term21788).add(term21790);
        ((ArrayList) term21788).add(term21806);
        ((ArrayList) term21788).add(term21822);
        ((ArrayList) term21788).add(term21838);
        term21732 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        Object term21771 = newInstance(Class.forName("java.time.Instant"));
        setField(term21732, term21732.getClass(), "id", term21733);
        setField(term21732, term21732.getClass(), "description", "dUNzDLXJcj");
        setField(term21732, term21732.getClass(), "countryReason", "OrVSjRJVwa");
        setField(term21732, term21732.getClass(), "countryCode", "cdZEcINJAM");
        setLongField(term21771, term21771.getClass(), "seconds", 1826251741L);
        setIntField(term21771, term21771.getClass(), "nanos", 593000000);
        setField(term21732, term21732.getClass(), "lastModifiedDate", term21771);
        setField(term21732, term21732.getClass(), "modifiedBy", "qumYSwcWHz");
        setIntField(term21732, term21732.getClass(), "currentRulesCount", -251696516);
        setIntField(term21732, term21732.getClass(), "maxRulesCount", 1075321384);
        setField(term21732, term21732.getClass(), "taxRules", term21788);
        term21854 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term21854;
        callMethod(klass, "equals", argTypes, term21732, args);
    }

};


