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
import java.lang.Integer;

public class PagingResultDTO_setStart_206677278735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5360;
     Object term5368;

    public PagingResultDTO_setStart_206677278735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5360 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.PagingResultDTO"));
        setField(term5360, term5360.getClass(), "DTOs", null);
        setIntField(term5360, term5360.getClass(), "totalPage", 0);
        setIntField(term5360, term5360.getClass(), "pageNum", 0);
        setIntField(term5360, term5360.getClass(), "pageSize", 0);
        setIntField(term5360, term5360.getClass(), "start", 0);
        setIntField(term5360, term5360.getClass(), "end", 0);
        setBooleanField(term5360, term5360.getClass(), "prev", false);
        setBooleanField(term5360, term5360.getClass(), "next", false);
        setField(term5360, term5360.getClass(), "pageList", null);
        term5368 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.PagingResultDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5368;
        callMethod(klass, "setStart", argTypes, term5360, args);
    }

};


