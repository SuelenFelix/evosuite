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

public class TaxRule_getaSquareFactor_21578137111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31333;

    public TaxRule_getaSquareFactor_21578137111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31334 = new Long(4083439166031950748L);
        Long term31356 = new Long(4354307959269121855L);
        Long term31414 = new Long(-4627619845164555164L);
        Object term31413 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term31413, term31413.getClass(), "id", term31414);
        setField(term31413, term31413.getClass(), "taxCode", null);
        setBooleanField(term31413, term31413.getClass(), "isLinear", true);
        setIntField(term31413, term31413.getClass(), "aFactor", -2054014210);
        setIntField(term31413, term31413.getClass(), "bFactor", 1179045520);
        setBooleanField(term31413, term31413.getClass(), "isSquare", false);
        setIntField(term31413, term31413.getClass(), "aSquareFactor", 1056739921);
        setIntField(term31413, term31413.getClass(), "bSquareFactor", 1384627927);
        setIntField(term31413, term31413.getClass(), "cSuqreFactor", -1252280115);
        setField(term31413, term31413.getClass(), "taxConfig", null);
        Long term31424 = new Long(8741861751389973987L);
        Object term31423 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term31423, term31423.getClass(), "id", term31424);
        setField(term31423, term31423.getClass(), "taxCode", null);
        setBooleanField(term31423, term31423.getClass(), "isLinear", false);
        setIntField(term31423, term31423.getClass(), "aFactor", -1649429373);
        setIntField(term31423, term31423.getClass(), "bFactor", -1605518502);
        setBooleanField(term31423, term31423.getClass(), "isSquare", false);
        setIntField(term31423, term31423.getClass(), "aSquareFactor", -499081946);
        setIntField(term31423, term31423.getClass(), "bSquareFactor", 1834067063);
        setIntField(term31423, term31423.getClass(), "cSuqreFactor", -1578513908);
        setField(term31423, term31423.getClass(), "taxConfig", null);
        ArrayList term31411 = new ArrayList();
        ((ArrayList) term31411).add(term31413);
        ((ArrayList) term31411).add(term31423);
        term31333 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term31355 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        Object term31394 = newInstance(Class.forName("java.time.Instant"));
        setField(term31333, term31333.getClass(), "id", term31334);
        setField(term31333, term31333.getClass(), "taxCode", "XMhUDGKSWO");
        setBooleanField(term31333, term31333.getClass(), "isLinear", true);
        setIntField(term31333, term31333.getClass(), "aFactor", -1047476590);
        setIntField(term31333, term31333.getClass(), "bFactor", -804745833);
        setBooleanField(term31333, term31333.getClass(), "isSquare", true);
        setIntField(term31333, term31333.getClass(), "aSquareFactor", 1080834214);
        setIntField(term31333, term31333.getClass(), "bSquareFactor", 323842695);
        setIntField(term31333, term31333.getClass(), "cSuqreFactor", 331897564);
        setField(term31355, term31355.getClass(), "id", term31356);
        setField(term31355, term31355.getClass(), "description", "jLgzxtuvVo");
        setField(term31355, term31355.getClass(), "countryReason", "wmmxjOkPnH");
        setField(term31355, term31355.getClass(), "countryCode", "jgRohUQWxJ");
        setLongField(term31394, term31394.getClass(), "seconds", 1318227522L);
        setIntField(term31394, term31394.getClass(), "nanos", 669000000);
        setField(term31355, term31355.getClass(), "lastModifiedDate", term31394);
        setField(term31355, term31355.getClass(), "modifiedBy", "CJlAiZDIQO");
        setIntField(term31355, term31355.getClass(), "currentRulesCount", -968105925);
        setIntField(term31355, term31355.getClass(), "maxRulesCount", -206020926);
        setField(term31355, term31355.getClass(), "taxRules", term31411);
        setField(term31333, term31333.getClass(), "taxConfig", term31355);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getaSquareFactor", argTypes, term31333, args);
    }

};


