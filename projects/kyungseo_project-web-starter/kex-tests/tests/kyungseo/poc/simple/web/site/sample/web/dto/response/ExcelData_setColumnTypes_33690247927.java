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

public class ExcelData_setColumnTypes_33690247927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22179;

    public ExcelData_setColumnTypes_33690247927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22179 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData"));
        setField(term22179, term22179.getClass(), "sheetName", null);
        setField(term22179, term22179.getClass(), "headerList", null);
        setField(term22179, term22179.getClass(), "dataList", null);
        setField(term22179, term22179.getClass(), "typeList", null);
        setField(term22179, term22179.getClass(), "mergeList", null);
        setField(term22179, term22179.getClass(), "mergeInfoList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("kyungseo.poc.simple.web.appcore.data.enums.ExcelColumnType"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setColumnTypes", argTypes, term22179, args);
    }

};


