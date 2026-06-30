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

public class ExcelData_getHeaderList_115539093611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11235;

    public ExcelData_getHeaderList_115539093611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term11244 = new ArrayList();
        ArrayList term11248 = new ArrayList();
        ArrayList term11252 = new ArrayList();
        ArrayList term11256 = new ArrayList();
        ((ArrayList) term11256).add("GzFkzHGYFt");
        ((ArrayList) term11256).add("tShwQLRGNe");
        ((ArrayList) term11256).add("LvtrsXUliU");
        ((ArrayList) term11256).add("xLbjWUgOIL");
        ((ArrayList) term11256).add("jDtqGUpnZN");
        ((ArrayList) term11256).add("nGKItKLYNC");
        ((ArrayList) term11256).add("UiUYnPrcCi");
        term11235 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData"));
        setField(term11235, term11235.getClass(), "sheetName", "sheet1");
        setField(term11235, term11235.getClass(), "headerList", term11244);
        setField(term11235, term11235.getClass(), "dataList", term11248);
        setField(term11235, term11235.getClass(), "typeList", term11252);
        setField(term11235, term11235.getClass(), "mergeList", term11256);
        setField(term11235, term11235.getClass(), "mergeInfoList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.web.dto.response.ExcelData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHeaderList", argTypes, term11235, args);
    }

};


