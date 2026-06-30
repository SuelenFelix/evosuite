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

public class ExcelData_getTypeList_208188174913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11649;

    public ExcelData_getTypeList_208188174913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term11658 = new ArrayList();
        ArrayList term11662 = new ArrayList();
        ArrayList term11666 = new ArrayList();
        ArrayList term11670 = new ArrayList();
        ((ArrayList) term11670).add("dEnhdmILtU");
        ((ArrayList) term11670).add("hoicvmsovO");
        term11649 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData"));
        setField(term11649, term11649.getClass(), "sheetName", "sheet1");
        setField(term11649, term11649.getClass(), "headerList", term11658);
        setField(term11649, term11649.getClass(), "dataList", term11662);
        setField(term11649, term11649.getClass(), "typeList", term11666);
        setField(term11649, term11649.getClass(), "mergeList", term11670);
        setField(term11649, term11649.getClass(), "mergeInfoList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTypeList", argTypes, term11649, args);
    }

};


