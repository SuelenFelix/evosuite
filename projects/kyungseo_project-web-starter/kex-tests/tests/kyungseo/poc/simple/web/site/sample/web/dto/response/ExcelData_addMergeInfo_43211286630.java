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
import java.lang.Integer;

public class ExcelData_addMergeInfo_43211286630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22182;
     Object term22183;
     Object term22185;
     Object term22187;
     Object term22189;

    public ExcelData_addMergeInfo_43211286630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22182 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData"));
        setField(term22182, term22182.getClass(), "sheetName", null);
        setField(term22182, term22182.getClass(), "headerList", null);
        setField(term22182, term22182.getClass(), "dataList", null);
        setField(term22182, term22182.getClass(), "typeList", null);
        setField(term22182, term22182.getClass(), "mergeList", null);
        setField(term22182, term22182.getClass(), "mergeInfoList", null);
        term22183 = new Integer(0);
        term22185 = new Integer(0);
        term22187 = new Integer(0);
        term22189 = new Integer(0);
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
        args[0] = term22183;
        args[1] = term22185;
        args[2] = term22187;
        args[3] = term22189;
        callMethod(klass, "addMergeInfo", argTypes, term22182, args);
    }

};


