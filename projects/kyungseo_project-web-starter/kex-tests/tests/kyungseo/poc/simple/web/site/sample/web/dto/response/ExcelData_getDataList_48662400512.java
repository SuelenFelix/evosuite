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

public class ExcelData_getDataList_48662400512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11420;

    public ExcelData_getDataList_48662400512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term11429 = new ArrayList();
        ArrayList term11433 = new ArrayList();
        ArrayList term11437 = new ArrayList();
        ArrayList term11441 = new ArrayList();
        ((ArrayList) term11441).add("UoYtihxVaS");
        ((ArrayList) term11441).add("JDswTTCZHV");
        ((ArrayList) term11441).add("onpbIeEKoi");
        ((ArrayList) term11441).add("YRHGsAkhxb");
        ((ArrayList) term11441).add("ffYhPOzlUs");
        ((ArrayList) term11441).add("MLqYREekMl");
        ((ArrayList) term11441).add("ytSBIKXogI");
        ((ArrayList) term11441).add("nHXjMycHlU");
        ((ArrayList) term11441).add("ieCtQFdkii");
        term11420 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData"));
        setField(term11420, term11420.getClass(), "sheetName", "sheet1");
        setField(term11420, term11420.getClass(), "headerList", term11429);
        setField(term11420, term11420.getClass(), "dataList", term11433);
        setField(term11420, term11420.getClass(), "typeList", term11437);
        setField(term11420, term11420.getClass(), "mergeList", term11441);
        setField(term11420, term11420.getClass(), "mergeInfoList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataList", argTypes, term11420, args);
    }

};


