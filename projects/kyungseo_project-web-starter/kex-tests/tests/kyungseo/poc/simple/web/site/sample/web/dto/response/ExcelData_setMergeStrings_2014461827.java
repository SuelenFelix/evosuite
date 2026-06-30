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

public class ExcelData_setMergeStrings_2014461827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7834;
     Object term7880;

    public ExcelData_setMergeStrings_2014461827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7843 = new ArrayList();
        ArrayList term7847 = new ArrayList();
        Class<? extends Object> term7888 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term7887 = ((Class) term7888).getDeclaredField((String) "DATE");
        ((Field) term7887).setAccessible(true);
        Object enum22 =  ((Field) term7887).get((Object) null);
        Class<? extends Object> term8197 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term8196 = ((Class) term8197).getDeclaredField((String) "INTEGER");
        ((Field) term8196).setAccessible(true);
        Object enum23 =  ((Field) term8196).get((Object) null);
        Class<? extends Object> term8515 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term8514 = ((Class) term8515).getDeclaredField((String) "DATE");
        ((Field) term8514).setAccessible(true);
        Object enum24 =  ((Field) term8514).get((Object) null);
        ArrayList term7851 = new ArrayList();
        ((ArrayList) term7851).add(enum22);
        ((ArrayList) term7851).add(enum23);
        ((ArrayList) term7851).add(enum22);
        ((ArrayList) term7851).add(enum22);
        ((ArrayList) term7851).add(enum24);
        ArrayList term7864 = new ArrayList();
        ((ArrayList) term7864).add("OclPbYPkcH");
        term7834 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData"));
        setField(term7834, term7834.getClass(), "sheetName", "sheet1");
        setField(term7834, term7834.getClass(), "headerList", term7843);
        setField(term7834, term7834.getClass(), "dataList", term7847);
        setField(term7834, term7834.getClass(), "typeList", term7851);
        setField(term7834, term7834.getClass(), "mergeList", term7864);
        setField(term7834, term7834.getClass(), "mergeInfoList", null);
        term7880 = (Object[]) newArray("java.lang.String", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term7880;
        callMethod(klass, "setMergeStrings", argTypes, term7834, args);
    }

};


