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

public class ExcelData_addRowHeaders_15930649672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term105;

    public ExcelData_addRowHeaders_15930649672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term32 = new ArrayList();
        ArrayList term36 = new ArrayList();
        Class<? extends Object> term198 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term197 = ((Class) term198).getDeclaredField((String) "DOUBLE");
        ((Field) term197).setAccessible(true);
        Object enum0 =  ((Field) term197).get((Object) null);
        Class<? extends Object> term513 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term512 = ((Class) term513).getDeclaredField((String) "DATE");
        ((Field) term512).setAccessible(true);
        Object enum1 =  ((Field) term512).get((Object) null);
        Class<? extends Object> term822 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term821 = ((Class) term822).getDeclaredField((String) "INTEGER");
        ((Field) term821).setAccessible(true);
        Object enum2 =  ((Field) term821).get((Object) null);
        ArrayList term40 = new ArrayList();
        ((ArrayList) term40).add(enum0);
        ((ArrayList) term40).add(enum1);
        ((ArrayList) term40).add(enum2);
        ArrayList term53 = new ArrayList();
        ((ArrayList) term53).add("sjlJAEtRrb");
        ((ArrayList) term53).add("MuLcgQHgqz");
        ((ArrayList) term53).add("xxtlPwDYFs");
        ((ArrayList) term53).add("jJCZpVmanW");
        term23 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData"));
        setField(term23, term23.getClass(), "sheetName", "sheet1");
        setField(term23, term23.getClass(), "headerList", term32);
        setField(term23, term23.getClass(), "dataList", term36);
        setField(term23, term23.getClass(), "typeList", term40);
        setField(term23, term23.getClass(), "mergeList", term53);
        setField(term23, term23.getClass(), "mergeInfoList", null);
        term105 = (Object[]) newArray("java.lang.String", 1);
        setElement(term105, 0, "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term105;
        callMethod(klass, "addRowHeaders", argTypes, term23, args);
    }

};


