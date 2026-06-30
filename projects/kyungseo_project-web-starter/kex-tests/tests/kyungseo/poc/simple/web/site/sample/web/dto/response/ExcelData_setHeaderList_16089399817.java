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

public class ExcelData_setHeaderList_16089399817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16750;
     Object term16868;

    public ExcelData_setHeaderList_16089399817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term16759 = new ArrayList();
        ArrayList term16763 = new ArrayList();
        Class<? extends Object> term16878 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term16877 = ((Class) term16878).getDeclaredField((String) "DATE");
        ((Field) term16877).setAccessible(true);
        Object enum45 =  ((Field) term16877).get((Object) null);
        Class<? extends Object> term17187 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term17186 = ((Class) term17187).getDeclaredField((String) "STRING");
        ((Field) term17186).setAccessible(true);
        Object enum46 =  ((Field) term17186).get((Object) null);
        Class<? extends Object> term17502 = Class.forName((String) "kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType");
        Field term17501 = ((Class) term17502).getDeclaredField((String) "HEADER");
        ((Field) term17501).setAccessible(true);
        Object enum47 =  ((Field) term17501).get((Object) null);
        ArrayList term16767 = new ArrayList();
        ((ArrayList) term16767).add(enum45);
        ((ArrayList) term16767).add(enum46);
        ((ArrayList) term16767).add(enum45);
        ((ArrayList) term16767).add(enum47);
        ((ArrayList) term16767).add(enum47);
        ((ArrayList) term16767).add(enum47);
        ((ArrayList) term16767).add(enum47);
        ArrayList term16780 = new ArrayList();
        ((ArrayList) term16780).add("LvJFtLBaxj");
        ((ArrayList) term16780).add("PHvxnGHptP");
        ((ArrayList) term16780).add("TimdotUuNC");
        ((ArrayList) term16780).add("PkWMRdJcBb");
        ((ArrayList) term16780).add("jSpAteRute");
        ((ArrayList) term16780).add("swZVeJAxjt");
        ((ArrayList) term16780).add("xOcJIiQQDu");
        term16750 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData"));
        setField(term16750, term16750.getClass(), "sheetName", "sheet1");
        setField(term16750, term16750.getClass(), "headerList", term16759);
        setField(term16750, term16750.getClass(), "dataList", term16763);
        setField(term16750, term16750.getClass(), "typeList", term16767);
        setField(term16750, term16750.getClass(), "mergeList", term16780);
        setField(term16750, term16750.getClass(), "mergeInfoList", null);
        term16868 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term16868;
        callMethod(klass, "setHeaderList", argTypes, term16750, args);
    }

};


