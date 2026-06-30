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

public class PagingResultDTO_getPageSize_196613741125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5274;

    public PagingResultDTO_getPageSize_196613741125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5274 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.PagingResultDTO"));
        setField(term5274, term5274.getClass(), "DTOs", null);
        setIntField(term5274, term5274.getClass(), "totalPage", 0);
        setIntField(term5274, term5274.getClass(), "pageNum", 0);
        setIntField(term5274, term5274.getClass(), "pageSize", 0);
        setIntField(term5274, term5274.getClass(), "start", 0);
        setIntField(term5274, term5274.getClass(), "end", 0);
        setBooleanField(term5274, term5274.getClass(), "prev", false);
        setBooleanField(term5274, term5274.getClass(), "next", false);
        setField(term5274, term5274.getClass(), "pageList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.PagingResultDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPageSize", argTypes, term5274, args);
    }

};


