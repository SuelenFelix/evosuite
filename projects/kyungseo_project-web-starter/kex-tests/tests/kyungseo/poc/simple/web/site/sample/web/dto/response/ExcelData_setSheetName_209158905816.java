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

public class ExcelData_setSheetName_209158905816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14965;

    public ExcelData_setSheetName_209158905816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term14974 = new ArrayList();
        ArrayList term14978 = new ArrayList();
        Class<? extends Object> term15108 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term15107 = ((Class) term15108).getDeclaredField((String) "DATE");
        ((Field) term15107).setAccessible(true);
        Object enum40 =  ((Field) term15107).get((Object) null);
        Class<? extends Object> term15417 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term15416 = ((Class) term15417).getDeclaredField((String) "STRING");
        ((Field) term15416).setAccessible(true);
        Object enum41 =  ((Field) term15416).get((Object) null);
        Class<? extends Object> term15732 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term15731 = ((Class) term15732).getDeclaredField((String) "DOUBLE");
        ((Field) term15731).setAccessible(true);
        Object enum42 =  ((Field) term15731).get((Object) null);
        Class<? extends Object> term16047 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term16046 = ((Class) term16047).getDeclaredField((String) "DOUBLE");
        ((Field) term16046).setAccessible(true);
        Object enum43 =  ((Field) term16046).get((Object) null);
        Class<? extends Object> term16362 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term16361 = ((Class) term16362).getDeclaredField((String) "DATE");
        ((Field) term16361).setAccessible(true);
        Object enum44 =  ((Field) term16361).get((Object) null);
        ArrayList term14982 = new ArrayList();
        ((ArrayList) term14982).add(enum40);
        ((ArrayList) term14982).add(enum41);
        ((ArrayList) term14982).add(enum42);
        ((ArrayList) term14982).add(enum43);
        ((ArrayList) term14982).add(enum41);
        ((ArrayList) term14982).add(enum44);
        ArrayList term15001 = new ArrayList();
        ((ArrayList) term15001).add("vQVyKLdtaz");
        ((ArrayList) term15001).add("OWKQODBLzb");
        ((ArrayList) term15001).add("wGmYcqUkgE");
        ((ArrayList) term15001).add("idgaQsnJpQ");
        ((ArrayList) term15001).add("VgZnGoIFwQ");
        ((ArrayList) term15001).add("jUbSRrkrYZ");
        ((ArrayList) term15001).add("bWWfajKbEX");
        term14965 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData"));
        setField(term14965, term14965.getClass(), "sheetName", "sheet1");
        setField(term14965, term14965.getClass(), "headerList", term14974);
        setField(term14965, term14965.getClass(), "dataList", term14978);
        setField(term14965, term14965.getClass(), "typeList", term14982);
        setField(term14965, term14965.getClass(), "mergeList", term15001);
        setField(term14965, term14965.getClass(), "mergeInfoList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "cAPeiZHKGJ";
        callMethod(klass, "setSheetName", argTypes, term14965, args);
    }

};


