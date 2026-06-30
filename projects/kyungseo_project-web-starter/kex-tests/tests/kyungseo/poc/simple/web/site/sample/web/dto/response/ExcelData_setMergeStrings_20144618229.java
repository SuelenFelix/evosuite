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

public class ExcelData_setMergeStrings_20144618229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22181;

    public ExcelData_setMergeStrings_20144618229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22181 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData"));
        setField(term22181, term22181.getClass(), "sheetName", null);
        setField(term22181, term22181.getClass(), "headerList", null);
        setField(term22181, term22181.getClass(), "dataList", null);
        setField(term22181, term22181.getClass(), "typeList", null);
        setField(term22181, term22181.getClass(), "mergeList", null);
        setField(term22181, term22181.getClass(), "mergeInfoList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMergeStrings", argTypes, term22181, args);
    }

};


