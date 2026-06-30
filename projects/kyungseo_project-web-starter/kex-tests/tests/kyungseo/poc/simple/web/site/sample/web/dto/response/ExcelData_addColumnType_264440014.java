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

public class ExcelData_addColumnType_264440014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2701;
     Object enum7;

    public ExcelData_addColumnType_264440014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2710 = new ArrayList();
        ArrayList term2714 = new ArrayList();
        Class<? extends Object> term2760 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term2759 = ((Class) term2760).getDeclaredField((String) "STRING");
        ((Field) term2759).setAccessible(true);
        enum7 =  ((Field) term2759).get((Object) null);
        Class<? extends Object> term3075 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term3074 = ((Class) term3075).getDeclaredField((String) "STRING");
        ((Field) term3074).setAccessible(true);
        Object enum8 =  ((Field) term3074).get((Object) null);
        Class<? extends Object> term3390 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term3389 = ((Class) term3390).getDeclaredField((String) "DATETIME");
        ((Field) term3389).setAccessible(true);
        Object enum9 =  ((Field) term3389).get((Object) null);
        Class<? extends Object> term3711 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term3710 = ((Class) term3711).getDeclaredField((String) "DOUBLE");
        ((Field) term3710).setAccessible(true);
        Object enum10 =  ((Field) term3710).get((Object) null);
        Class<? extends Object> term4026 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term4025 = ((Class) term4026).getDeclaredField((String) "INTEGER");
        ((Field) term4025).setAccessible(true);
        Object enum11 =  ((Field) term4025).get((Object) null);
        ArrayList term2718 = new ArrayList();
        ((ArrayList) term2718).add(enum7);
        ((ArrayList) term2718).add(enum8);
        ((ArrayList) term2718).add(enum9);
        ((ArrayList) term2718).add(enum7);
        ((ArrayList) term2718).add(enum10);
        ((ArrayList) term2718).add(enum9);
        ((ArrayList) term2718).add(enum11);
        ArrayList term2737 = new ArrayList();
        ((ArrayList) term2737).add("ZiaGIbnzTs");
        term2701 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData"));
        setField(term2701, term2701.getClass(), "sheetName", "sheet1");
        setField(term2701, term2701.getClass(), "headerList", term2710);
        setField(term2701, term2701.getClass(), "dataList", term2714);
        setField(term2701, term2701.getClass(), "typeList", term2718);
        setField(term2701, term2701.getClass(), "mergeList", term2737);
        setField(term2701, term2701.getClass(), "mergeInfoList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Object[] args = new Object[1];
        args[0] = enum7;
        callMethod(klass, "addColumnType", argTypes, term2701, args);
    }

};


