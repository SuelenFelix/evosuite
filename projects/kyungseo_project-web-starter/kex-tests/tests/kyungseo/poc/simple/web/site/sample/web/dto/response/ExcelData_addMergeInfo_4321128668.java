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
import java.lang.Integer;

public class ExcelData_addMergeInfo_4321128668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8833;
     Object term8918;
     Object term8920;
     Object term8922;
     Object term8924;

    public ExcelData_addMergeInfo_4321128668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8842 = new ArrayList();
        ArrayList term8846 = new ArrayList();
        Class<? extends Object> term8933 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term8932 = ((Class) term8933).getDeclaredField((String) "INTEGER");
        ((Field) term8932).setAccessible(true);
        Object enum25 =  ((Field) term8932).get((Object) null);
        Class<? extends Object> term9251 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term9250 = ((Class) term9251).getDeclaredField((String) "STRING");
        ((Field) term9250).setAccessible(true);
        Object enum26 =  ((Field) term9250).get((Object) null);
        Class<? extends Object> term9566 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term9565 = ((Class) term9566).getDeclaredField((String) "DOUBLE");
        ((Field) term9565).setAccessible(true);
        Object enum27 =  ((Field) term9565).get((Object) null);
        Class<? extends Object> term9881 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term9880 = ((Class) term9881).getDeclaredField((String) "HEADER");
        ((Field) term9880).setAccessible(true);
        Object enum28 =  ((Field) term9880).get((Object) null);
        ArrayList term8850 = new ArrayList();
        ((ArrayList) term8850).add(enum25);
        ((ArrayList) term8850).add(enum26);
        ((ArrayList) term8850).add(enum27);
        ((ArrayList) term8850).add(enum25);
        ((ArrayList) term8850).add(enum28);
        ArrayList term8866 = new ArrayList();
        ((ArrayList) term8866).add("IoAlmYsBwc");
        ((ArrayList) term8866).add("TEParAifyi");
        ((ArrayList) term8866).add("OWDIEULEFu");
        ((ArrayList) term8866).add("dWRymuLBtr");
        term8833 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData"));
        setField(term8833, term8833.getClass(), "sheetName", "sheet1");
        setField(term8833, term8833.getClass(), "headerList", term8842);
        setField(term8833, term8833.getClass(), "dataList", term8846);
        setField(term8833, term8833.getClass(), "typeList", term8850);
        setField(term8833, term8833.getClass(), "mergeList", term8866);
        setField(term8833, term8833.getClass(), "mergeInfoList", null);
        term8918 = new Integer(568599855);
        term8920 = new Integer(1162663216);
        term8922 = new Integer(1484323161);
        term8924 = new Integer(391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term8918;
        args[1] = term8920;
        args[2] = term8922;
        args[3] = term8924;
        callMethod(klass, "addMergeInfo", argTypes, term8833, args);
    }

};


