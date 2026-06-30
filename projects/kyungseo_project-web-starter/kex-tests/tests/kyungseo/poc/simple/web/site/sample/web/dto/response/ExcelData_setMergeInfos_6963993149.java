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

public class ExcelData_setMergeInfos_6963993149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10235;
     Object term10335;

    public ExcelData_setMergeInfos_6963993149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10244 = new ArrayList();
        ArrayList term10248 = new ArrayList();
        Class<? extends Object> term10351 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term10350 = ((Class) term10351).getDeclaredField((String) "DOUBLE");
        ((Field) term10350).setAccessible(true);
        Object enum29 =  ((Field) term10350).get((Object) null);
        ArrayList term10252 = new ArrayList();
        ((ArrayList) term10252).add(enum29);
        ArrayList term10259 = new ArrayList();
        ((ArrayList) term10259).add("AijpHYOFuy");
        ((ArrayList) term10259).add("SbAoxhfrkn");
        ((ArrayList) term10259).add("kuTXqwMtDB");
        ((ArrayList) term10259).add("Ghbwtircqb");
        ((ArrayList) term10259).add("xrwlQZdwCp");
        ((ArrayList) term10259).add("IDCWpPLRkE");
        term10235 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData"));
        setField(term10235, term10235.getClass(), "sheetName", "sheet1");
        setField(term10235, term10235.getClass(), "headerList", term10244);
        setField(term10235, term10235.getClass(), "dataList", term10248);
        setField(term10235, term10235.getClass(), "typeList", term10252);
        setField(term10235, term10235.getClass(), "mergeList", term10259);
        setField(term10235, term10235.getClass(), "mergeInfoList", null);
        term10335 = (Object[]) newArray("[I", 1);
        int[] term10336 = (int[]) newIntArray(7);
        setIntElement(term10336, 0, -1922583790);
        setIntElement(term10336, 1, -616727354);
        setIntElement(term10336, 2, -1955890973);
        setIntElement(term10336, 3, -2038273078);
        setIntElement(term10336, 4, 1227103734);
        setIntElement(term10336, 5, -1339778481);
        setIntElement(term10336, 6, 1725571209);
        setElement(term10335, 0, term10336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term10335;
        callMethod(klass, "setMergeInfos", argTypes, term10235, args);
    }

};


