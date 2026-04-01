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

public class ExcelData_addMergeString_1074991386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6368;

    public ExcelData_addMergeString_1074991386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6377 = new ArrayList();
        ArrayList term6381 = new ArrayList();
        Class<? extends Object> term6496 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term6495 = ((Class) term6496).getDeclaredField((String) "DOUBLE");
        ((Field) term6495).setAccessible(true);
        Object enum18 =  ((Field) term6495).get((Object) null);
        Class<? extends Object> term6811 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term6810 = ((Class) term6811).getDeclaredField((String) "INTEGER");
        ((Field) term6810).setAccessible(true);
        Object enum19 =  ((Field) term6810).get((Object) null);
        Class<? extends Object> term7129 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term7128 = ((Class) term7129).getDeclaredField((String) "HEADER");
        ((Field) term7128).setAccessible(true);
        Object enum20 =  ((Field) term7128).get((Object) null);
        Class<? extends Object> term7444 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term7443 = ((Class) term7444).getDeclaredField((String) "DATEHHMM");
        ((Field) term7443).setAccessible(true);
        Object enum21 =  ((Field) term7443).get((Object) null);
        ArrayList term6385 = new ArrayList();
        ((ArrayList) term6385).add(enum18);
        ((ArrayList) term6385).add(enum18);
        ((ArrayList) term6385).add(enum18);
        ((ArrayList) term6385).add(enum19);
        ((ArrayList) term6385).add(enum20);
        ((ArrayList) term6385).add(enum21);
        ArrayList term6401 = new ArrayList();
        ((ArrayList) term6401).add("hNxWaHcfhY");
        ((ArrayList) term6401).add("RkybSrpybU");
        ((ArrayList) term6401).add("xOEqzGAmDU");
        ((ArrayList) term6401).add("eZFUvlxvGV");
        ((ArrayList) term6401).add("BYqFIqCKAV");
        ((ArrayList) term6401).add("vrQLuWIDJX");
        term6368 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData"));
        setField(term6368, term6368.getClass(), "sheetName", "sheet1");
        setField(term6368, term6368.getClass(), "headerList", term6377);
        setField(term6368, term6368.getClass(), "dataList", term6381);
        setField(term6368, term6368.getClass(), "typeList", term6385);
        setField(term6368, term6368.getClass(), "mergeList", term6401);
        setField(term6368, term6368.getClass(), "mergeInfoList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "flxyYxBRtu";
        callMethod(klass, "addMergeString", argTypes, term6368, args);
    }

};


