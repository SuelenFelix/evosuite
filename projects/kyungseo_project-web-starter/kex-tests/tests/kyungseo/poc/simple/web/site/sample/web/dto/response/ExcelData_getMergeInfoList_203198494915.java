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

public class ExcelData_getMergeInfoList_203198494915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12863;

    public ExcelData_getMergeInfoList_203198494915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term12872 = new ArrayList();
        ArrayList term12876 = new ArrayList();
        Class<? extends Object> term12997 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term12996 = ((Class) term12997).getDeclaredField((String) "INTEGER");
        ((Field) term12996).setAccessible(true);
        Object enum34 =  ((Field) term12996).get((Object) null);
        Class<? extends Object> term13315 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term13314 = ((Class) term13315).getDeclaredField((String) "DOUBLE");
        ((Field) term13314).setAccessible(true);
        Object enum35 =  ((Field) term13314).get((Object) null);
        Class<? extends Object> term13630 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term13629 = ((Class) term13630).getDeclaredField((String) "HEADER");
        ((Field) term13629).setAccessible(true);
        Object enum36 =  ((Field) term13629).get((Object) null);
        Class<? extends Object> term13945 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term13944 = ((Class) term13945).getDeclaredField((String) "DOUBLE");
        ((Field) term13944).setAccessible(true);
        Object enum37 =  ((Field) term13944).get((Object) null);
        Class<? extends Object> term14260 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term14259 = ((Class) term14260).getDeclaredField((String) "DATEHHMM");
        ((Field) term14259).setAccessible(true);
        Object enum38 =  ((Field) term14259).get((Object) null);
        Class<? extends Object> term14581 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term14580 = ((Class) term14581).getDeclaredField((String) "DOUBLE");
        ((Field) term14580).setAccessible(true);
        Object enum39 =  ((Field) term14580).get((Object) null);
        ArrayList term12880 = new ArrayList();
        ((ArrayList) term12880).add(enum34);
        ((ArrayList) term12880).add(enum35);
        ((ArrayList) term12880).add(enum36);
        ((ArrayList) term12880).add(enum37);
        ((ArrayList) term12880).add(enum38);
        ((ArrayList) term12880).add(enum39);
        ArrayList term12902 = new ArrayList();
        ((ArrayList) term12902).add("whBvTVIIlC");
        ((ArrayList) term12902).add("IgRJUzaCwW");
        ((ArrayList) term12902).add("JUmudUmaaV");
        ((ArrayList) term12902).add("KoyGrUJeJW");
        ((ArrayList) term12902).add("HqBOwkVqjD");
        ((ArrayList) term12902).add("MAcUBcBckh");
        ((ArrayList) term12902).add("oVgzLbrsFr");
        term12863 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData"));
        setField(term12863, term12863.getClass(), "sheetName", "sheet1");
        setField(term12863, term12863.getClass(), "headerList", term12872);
        setField(term12863, term12863.getClass(), "dataList", term12876);
        setField(term12863, term12863.getClass(), "typeList", term12880);
        setField(term12863, term12863.getClass(), "mergeList", term12902);
        setField(term12863, term12863.getClass(), "mergeInfoList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMergeInfoList", argTypes, term12863, args);
    }

};


