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

public class ExcelData_getSheetName_192883161810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10732;

    public ExcelData_getSheetName_192883161810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10741 = new ArrayList();
        ArrayList term10745 = new ArrayList();
        Class<? extends Object> term10851 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term10850 = ((Class) term10851).getDeclaredField((String) "HEADER");
        ((Field) term10850).setAccessible(true);
        Object enum30 =  ((Field) term10850).get((Object) null);
        ArrayList term10749 = new ArrayList();
        ((ArrayList) term10749).add(enum30);
        ((ArrayList) term10749).add(enum30);
        ArrayList term10756 = new ArrayList();
        ((ArrayList) term10756).add("nyiiPDVjAc");
        ((ArrayList) term10756).add("aKnKipADSo");
        ((ArrayList) term10756).add("wSQxaModmm");
        ((ArrayList) term10756).add("UlajhuVLaP");
        ((ArrayList) term10756).add("gGSMzuGICf");
        ((ArrayList) term10756).add("hxCBltsObl");
        ((ArrayList) term10756).add("BndsHwAFMv");
        term10732 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData"));
        setField(term10732, term10732.getClass(), "sheetName", "sheet1");
        setField(term10732, term10732.getClass(), "headerList", term10741);
        setField(term10732, term10732.getClass(), "dataList", term10745);
        setField(term10732, term10732.getClass(), "typeList", term10749);
        setField(term10732, term10732.getClass(), "mergeList", term10756);
        setField(term10732, term10732.getClass(), "mergeInfoList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSheetName", argTypes, term10732, args);
    }

};


