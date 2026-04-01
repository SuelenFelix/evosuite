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

public class ExcelData_setTypeList_103342192519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19667;
     Object term19755;

    public ExcelData_setTypeList_103342192519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term19676 = new ArrayList();
        ArrayList term19680 = new ArrayList();
        Class<? extends Object> term19781 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term19780 = ((Class) term19781).getDeclaredField((String) "HEADER");
        ((Field) term19780).setAccessible(true);
        Object enum53 =  ((Field) term19780).get((Object) null);
        ArrayList term19684 = new ArrayList();
        ((ArrayList) term19684).add(enum53);
        ArrayList term19691 = new ArrayList();
        ((ArrayList) term19691).add("BKLfkLiZTH");
        ((ArrayList) term19691).add("SPpkrGcPRr");
        ((ArrayList) term19691).add("sEccwbJKYE");
        ((ArrayList) term19691).add("AWRooQKkdW");
        ((ArrayList) term19691).add("vjxIhXHxGR");
        term19667 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData"));
        setField(term19667, term19667.getClass(), "sheetName", "sheet1");
        setField(term19667, term19667.getClass(), "headerList", term19676);
        setField(term19667, term19667.getClass(), "dataList", term19680);
        setField(term19667, term19667.getClass(), "typeList", term19684);
        setField(term19667, term19667.getClass(), "mergeList", term19691);
        setField(term19667, term19667.getClass(), "mergeInfoList", null);
        Class<? extends Object> term20146 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term20145 = ((Class) term20146).getDeclaredField((String) "DATE");
        ((Field) term20145).setAccessible(true);
        Object enum54 =  ((Field) term20145).get((Object) null);
        Class<? extends Object> term20455 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term20454 = ((Class) term20455).getDeclaredField((String) "DOUBLE");
        ((Field) term20454).setAccessible(true);
        Object enum55 =  ((Field) term20454).get((Object) null);
        Class<? extends Object> term20770 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term20769 = ((Class) term20770).getDeclaredField((String) "INTEGER");
        ((Field) term20769).setAccessible(true);
        Object enum56 =  ((Field) term20769).get((Object) null);
        term19755 = new LinkedList();
        ((LinkedList) term19755).add(enum54);
        ((LinkedList) term19755).add(enum55);
        ((LinkedList) term19755).add(enum56);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term19755;
        callMethod(klass, "setTypeList", argTypes, term19667, args);
    }

};


