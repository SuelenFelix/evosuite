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

public class ExcelData_getMergeList_94021736914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11724;

    public ExcelData_getMergeList_94021736914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term11733 = new ArrayList();
        ArrayList term11737 = new ArrayList();
        Class<? extends Object> term11849 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term11848 = ((Class) term11849).getDeclaredField((String) "HEADER");
        ((Field) term11848).setAccessible(true);
        Object enum31 =  ((Field) term11848).get((Object) null);
        Class<? extends Object> term12164 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term12163 = ((Class) term12164).getDeclaredField((String) "DOUBLE");
        ((Field) term12163).setAccessible(true);
        Object enum32 =  ((Field) term12163).get((Object) null);
        Class<? extends Object> term12479 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term12478 = ((Class) term12479).getDeclaredField((String) "DOUBLE");
        ((Field) term12478).setAccessible(true);
        Object enum33 =  ((Field) term12478).get((Object) null);
        ArrayList term11741 = new ArrayList();
        ((ArrayList) term11741).add(enum31);
        ((ArrayList) term11741).add(enum32);
        ((ArrayList) term11741).add(enum33);
        ArrayList term11754 = new ArrayList();
        ((ArrayList) term11754).add("eqJfYWRaEL");
        ((ArrayList) term11754).add("fhkbdRViHi");
        ((ArrayList) term11754).add("uWHnvSvaPl");
        ((ArrayList) term11754).add("kBdSllIBVz");
        ((ArrayList) term11754).add("TJmVBGfTML");
        ((ArrayList) term11754).add("tPlsykYBqO");
        ((ArrayList) term11754).add("bLPjGVBhlX");
        term11724 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData"));
        setField(term11724, term11724.getClass(), "sheetName", "sheet1");
        setField(term11724, term11724.getClass(), "headerList", term11733);
        setField(term11724, term11724.getClass(), "dataList", term11737);
        setField(term11724, term11724.getClass(), "typeList", term11741);
        setField(term11724, term11724.getClass(), "mergeList", term11754);
        setField(term11724, term11724.getClass(), "mergeInfoList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMergeList", argTypes, term11724, args);
    }

};


