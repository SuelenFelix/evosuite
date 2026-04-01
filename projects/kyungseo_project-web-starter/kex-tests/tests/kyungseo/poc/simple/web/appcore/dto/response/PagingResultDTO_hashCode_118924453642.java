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

public class PagingResultDTO_hashCode_118924453642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5424;

    public PagingResultDTO_hashCode_118924453642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5424 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.PagingResultDTO"));
        setField(term5424, term5424.getClass(), "DTOs", null);
        setIntField(term5424, term5424.getClass(), "totalPage", 0);
        setIntField(term5424, term5424.getClass(), "pageNum", 0);
        setIntField(term5424, term5424.getClass(), "pageSize", 0);
        setIntField(term5424, term5424.getClass(), "start", 0);
        setIntField(term5424, term5424.getClass(), "end", 0);
        setBooleanField(term5424, term5424.getClass(), "prev", false);
        setBooleanField(term5424, term5424.getClass(), "next", false);
        setField(term5424, term5424.getClass(), "pageList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.PagingResultDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term5424, args);
    }

};


