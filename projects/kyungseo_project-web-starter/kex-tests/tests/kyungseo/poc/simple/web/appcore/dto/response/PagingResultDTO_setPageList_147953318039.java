package kyungseo.poc.simple.web.appcore.dto.response;

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
import static kyungseo.poc.simple.web.appcore.dto.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PagingResultDTO_setPageList_147953318039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5400;

    public PagingResultDTO_setPageList_147953318039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5400 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.PagingResultDTO"));
        setField(term5400, term5400.getClass(), "DTOs", null);
        setIntField(term5400, term5400.getClass(), "totalPage", 0);
        setIntField(term5400, term5400.getClass(), "pageNum", 0);
        setIntField(term5400, term5400.getClass(), "pageSize", 0);
        setIntField(term5400, term5400.getClass(), "start", 0);
        setIntField(term5400, term5400.getClass(), "end", 0);
        setBooleanField(term5400, term5400.getClass(), "prev", false);
        setBooleanField(term5400, term5400.getClass(), "next", false);
        setField(term5400, term5400.getClass(), "pageList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.PagingResultDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPageList", argTypes, term5400, args);
    }

};


