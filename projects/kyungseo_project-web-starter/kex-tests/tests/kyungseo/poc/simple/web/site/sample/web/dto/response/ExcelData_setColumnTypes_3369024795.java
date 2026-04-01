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

public class ExcelData_setColumnTypes_3369024795 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4353;
     Object term4432;

    public ExcelData_setColumnTypes_3369024795() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4362 = new ArrayList();
        ArrayList term4366 = new ArrayList();
        Class<? extends Object> term4440 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term4439 = ((Class) term4440).getDeclaredField((String) "INTEGER");
        ((Field) term4439).setAccessible(true);
        Object enum12 =  ((Field) term4439).get((Object) null);
        Class<? extends Object> term4758 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term4757 = ((Class) term4758).getDeclaredField((String) "INTEGER");
        ((Field) term4757).setAccessible(true);
        Object enum13 =  ((Field) term4757).get((Object) null);
        Class<? extends Object> term5076 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term5075 = ((Class) term5076).getDeclaredField((String) "INTEGER");
        ((Field) term5075).setAccessible(true);
        Object enum14 =  ((Field) term5075).get((Object) null);
        Class<? extends Object> term5394 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term5393 = ((Class) term5394).getDeclaredField((String) "DOUBLE");
        ((Field) term5393).setAccessible(true);
        Object enum15 =  ((Field) term5393).get((Object) null);
        Class<? extends Object> term5709 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term5708 = ((Class) term5709).getDeclaredField((String) "DATE");
        ((Field) term5708).setAccessible(true);
        Object enum16 =  ((Field) term5708).get((Object) null);
        Class<? extends Object> term6018 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term6017 = ((Class) term6018).getDeclaredField((String) "DATETIME");
        ((Field) term6017).setAccessible(true);
        Object enum17 =  ((Field) term6017).get((Object) null);
        ArrayList term4370 = new ArrayList();
        ((ArrayList) term4370).add(enum12);
        ((ArrayList) term4370).add(enum13);
        ((ArrayList) term4370).add(enum14);
        ((ArrayList) term4370).add(enum15);
        ((ArrayList) term4370).add(enum16);
        ((ArrayList) term4370).add(enum14);
        ((ArrayList) term4370).add(enum15);
        ((ArrayList) term4370).add(enum17);
        ((ArrayList) term4370).add(enum12);
        ArrayList term4392 = new ArrayList();
        ((ArrayList) term4392).add("tbcdzjIfER");
        ((ArrayList) term4392).add("HyxfbSQYBe");
        ((ArrayList) term4392).add("pCTimMblYc");
        term4353 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData"));
        setField(term4353, term4353.getClass(), "sheetName", "sheet1");
        setField(term4353, term4353.getClass(), "headerList", term4362);
        setField(term4353, term4353.getClass(), "dataList", term4366);
        setField(term4353, term4353.getClass(), "typeList", term4370);
        setField(term4353, term4353.getClass(), "mergeList", term4392);
        setField(term4353, term4353.getClass(), "mergeInfoList", null);
        term4432 = (Object[]) newArray("kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType", 5);
        setElement(term4432, 0, enum16);
        setElement(term4432, 1, enum13);
        setElement(term4432, 2, enum15);
        setElement(term4432, 3, enum13);
        setElement(term4432, 4, enum13);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term4432;
        callMethod(klass, "setColumnTypes", argTypes, term4353, args);
    }

};


