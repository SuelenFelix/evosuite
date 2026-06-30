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

public class PagingResultDTO_getPageList_163577049430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5314;

    public PagingResultDTO_getPageList_163577049430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5314 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.PagingResultDTO"));
        setField(term5314, term5314.getClass(), "DTOs", null);
        setIntField(term5314, term5314.getClass(), "totalPage", 0);
        setIntField(term5314, term5314.getClass(), "pageNum", 0);
        setIntField(term5314, term5314.getClass(), "pageSize", 0);
        setIntField(term5314, term5314.getClass(), "start", 0);
        setIntField(term5314, term5314.getClass(), "end", 0);
        setBooleanField(term5314, term5314.getClass(), "prev", false);
        setBooleanField(term5314, term5314.getClass(), "next", false);
        setField(term5314, term5314.getClass(), "pageList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.PagingResultDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPageList", argTypes, term5314, args);
    }

};


