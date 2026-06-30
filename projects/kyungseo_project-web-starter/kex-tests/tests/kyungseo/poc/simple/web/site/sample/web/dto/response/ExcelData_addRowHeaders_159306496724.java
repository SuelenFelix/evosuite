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

public class ExcelData_addRowHeaders_159306496724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22176;

    public ExcelData_addRowHeaders_159306496724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22176 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData"));
        setField(term22176, term22176.getClass(), "sheetName", null);
        setField(term22176, term22176.getClass(), "headerList", null);
        setField(term22176, term22176.getClass(), "dataList", null);
        setField(term22176, term22176.getClass(), "typeList", null);
        setField(term22176, term22176.getClass(), "mergeList", null);
        setField(term22176, term22176.getClass(), "mergeInfoList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addRowHeaders", argTypes, term22176, args);
    }

};


