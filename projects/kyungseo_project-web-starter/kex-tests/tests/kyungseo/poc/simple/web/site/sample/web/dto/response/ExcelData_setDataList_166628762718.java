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
import java.util.LinkedList;

public class ExcelData_setDataList_166628762718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17886;
     Object term18010;

    public ExcelData_setDataList_166628762718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17895 = new ArrayList();
        ArrayList term17899 = new ArrayList();
        Class<? extends Object> term18020 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term18019 = ((Class) term18020).getDeclaredField((String) "STRING");
        ((Field) term18019).setAccessible(true);
        Object enum48 =  ((Field) term18019).get((Object) null);
        Class<? extends Object> term18335 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term18334 = ((Class) term18335).getDeclaredField((String) "INTEGER");
        ((Field) term18334).setAccessible(true);
        Object enum49 =  ((Field) term18334).get((Object) null);
        Class<? extends Object> term18653 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term18652 = ((Class) term18653).getDeclaredField((String) "HEADER");
        ((Field) term18652).setAccessible(true);
        Object enum50 =  ((Field) term18652).get((Object) null);
        Class<? extends Object> term18968 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term18967 = ((Class) term18968).getDeclaredField((String) "STRING");
        ((Field) term18967).setAccessible(true);
        Object enum51 =  ((Field) term18967).get((Object) null);
        Class<? extends Object> term19283 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term19282 = ((Class) term19283).getDeclaredField((String) "STRING");
        ((Field) term19282).setAccessible(true);
        Object enum52 =  ((Field) term19282).get((Object) null);
        ArrayList term17903 = new ArrayList();
        ((ArrayList) term17903).add(enum48);
        ((ArrayList) term17903).add(enum49);
        ((ArrayList) term17903).add(enum50);
        ((ArrayList) term17903).add(enum48);
        ((ArrayList) term17903).add(enum51);
        ((ArrayList) term17903).add(enum48);
        ((ArrayList) term17903).add(enum50);
        ((ArrayList) term17903).add(enum52);
        ((ArrayList) term17903).add(enum51);
        ArrayList term17922 = new ArrayList();
        ((ArrayList) term17922).add("GVizqqzXpy");
        ((ArrayList) term17922).add("JqXGgAhZPl");
        ((ArrayList) term17922).add("jiKYgYHqIS");
        ((ArrayList) term17922).add("DfISiziTgG");
        ((ArrayList) term17922).add("XqgfKFvPSD");
        ((ArrayList) term17922).add("JiVRgTZvKc");
        ((ArrayList) term17922).add("XPKmummaqg");
        term17886 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData"));
        setField(term17886, term17886.getClass(), "sheetName", "sheet1");
        setField(term17886, term17886.getClass(), "headerList", term17895);
        setField(term17886, term17886.getClass(), "dataList", term17899);
        setField(term17886, term17886.getClass(), "typeList", term17903);
        setField(term17886, term17886.getClass(), "mergeList", term17922);
        setField(term17886, term17886.getClass(), "mergeInfoList", null);
        term18010 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term18010;
        callMethod(klass, "setDataList", argTypes, term17886, args);
    }

};


