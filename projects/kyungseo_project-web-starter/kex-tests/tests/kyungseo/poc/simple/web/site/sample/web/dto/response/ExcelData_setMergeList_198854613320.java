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

public class ExcelData_setMergeList_198854613320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21087;
     Object term21169;

    public ExcelData_setMergeList_198854613320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term21096 = new ArrayList();
        ArrayList term21100 = new ArrayList();
        Class<? extends Object> term21179 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term21178 = ((Class) term21179).getDeclaredField((String) "DATEHHMM");
        ((Field) term21178).setAccessible(true);
        Object enum57 =  ((Field) term21178).get((Object) null);
        Class<? extends Object> term21500 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term21499 = ((Class) term21500).getDeclaredField((String) "DOUBLE");
        ((Field) term21499).setAccessible(true);
        Object enum58 =  ((Field) term21499).get((Object) null);
        Class<? extends Object> term21815 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term21814 = ((Class) term21815).getDeclaredField((String) "DATEHHMM");
        ((Field) term21814).setAccessible(true);
        Object enum59 =  ((Field) term21814).get((Object) null);
        ArrayList term21104 = new ArrayList();
        ((ArrayList) term21104).add(enum57);
        ((ArrayList) term21104).add(enum58);
        ((ArrayList) term21104).add(enum57);
        ((ArrayList) term21104).add(enum59);
        ArrayList term21117 = new ArrayList();
        ((ArrayList) term21117).add("QXzGXbEXMu");
        ((ArrayList) term21117).add("qxSDVejjiY");
        ((ArrayList) term21117).add("xBsXSDjXYK");
        ((ArrayList) term21117).add("sEnIVFtZuQ");
        term21087 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData"));
        setField(term21087, term21087.getClass(), "sheetName", "sheet1");
        setField(term21087, term21087.getClass(), "headerList", term21096);
        setField(term21087, term21087.getClass(), "dataList", term21100);
        setField(term21087, term21087.getClass(), "typeList", term21104);
        setField(term21087, term21087.getClass(), "mergeList", term21117);
        setField(term21087, term21087.getClass(), "mergeInfoList", null);
        term21169 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term21169;
        callMethod(klass, "setMergeList", argTypes, term21087, args);
    }

};


