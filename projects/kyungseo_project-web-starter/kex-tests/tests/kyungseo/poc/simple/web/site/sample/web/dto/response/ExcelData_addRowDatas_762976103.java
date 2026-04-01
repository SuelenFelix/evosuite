package kyungseo.poc.simple.web.site.sample.web.dto.response;

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
import static kyungseo.poc.simple.web.site.sample.web.dto.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class ExcelData_addRowDatas_762976103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1189;
     Object term1262;

    public ExcelData_addRowDatas_762976103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1198 = new ArrayList();
        ArrayList term1202 = new ArrayList();
        Class<? extends Object> term1354 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term1353 = ((Class) term1354).getDeclaredField((String) "DATE");
        ((Field) term1353).setAccessible(true);
        Object enum3 =  ((Field) term1353).get((Object) null);
        Class<? extends Object> term1663 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term1662 = ((Class) term1663).getDeclaredField((String) "HEADER");
        ((Field) term1662).setAccessible(true);
        Object enum4 =  ((Field) term1662).get((Object) null);
        Class<? extends Object> term1978 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term1977 = ((Class) term1978).getDeclaredField((String) "DOUBLE");
        ((Field) term1977).setAccessible(true);
        Object enum5 =  ((Field) term1977).get((Object) null);
        Class<? extends Object> term2293 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term2292 = ((Class) term2293).getDeclaredField((String) "DATE");
        ((Field) term2292).setAccessible(true);
        Object enum6 =  ((Field) term2292).get((Object) null);
        ArrayList term1206 = new ArrayList();
        ((ArrayList) term1206).add(enum3);
        ((ArrayList) term1206).add(enum3);
        ((ArrayList) term1206).add(enum4);
        ((ArrayList) term1206).add(enum5);
        ((ArrayList) term1206).add(enum5);
        ((ArrayList) term1206).add(enum3);
        ((ArrayList) term1206).add(enum6);
        ((ArrayList) term1206).add(enum6);
        ((ArrayList) term1206).add(enum4);
        ArrayList term1222 = new ArrayList();
        ((ArrayList) term1222).add("SzjVpOQTyS");
        ((ArrayList) term1222).add("MjGYSRKTNF");
        ((ArrayList) term1222).add("hRNSzYYIrc");
        term1189 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData"));
        setField(term1189, term1189.getClass(), "sheetName", "sheet1");
        setField(term1189, term1189.getClass(), "headerList", term1198);
        setField(term1189, term1189.getClass(), "dataList", term1202);
        setField(term1189, term1189.getClass(), "typeList", term1206);
        setField(term1189, term1189.getClass(), "mergeList", term1222);
        setField(term1189, term1189.getClass(), "mergeInfoList", null);
        term1262 = (Object[]) newArray("java.lang.String", 7);
        setElement(term1262, 0, "RMFIsYGgne");
        setElement(term1262, 1, "NRdvgJlhkX");
        setElement(term1262, 2, "uuaPigETmJ");
        setElement(term1262, 3, "MxlszYVzRf");
        setElement(term1262, 4, "LQFpaHEwXR");
        setElement(term1262, 5, "oVcInYnLWB");
        setElement(term1262, 6, "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1262;
        callMethod(klass, "addRowDatas", argTypes, term1189, args);
    }

};


