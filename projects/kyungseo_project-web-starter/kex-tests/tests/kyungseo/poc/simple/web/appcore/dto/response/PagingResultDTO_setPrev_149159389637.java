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
import java.lang.Boolean;

public class PagingResultDTO_setPrev_149159389637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5380;
     Object term5388;

    public PagingResultDTO_setPrev_149159389637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5380 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.PagingResultDTO"));
        setField(term5380, term5380.getClass(), "DTOs", null);
        setIntField(term5380, term5380.getClass(), "totalPage", 0);
        setIntField(term5380, term5380.getClass(), "pageNum", 0);
        setIntField(term5380, term5380.getClass(), "pageSize", 0);
        setIntField(term5380, term5380.getClass(), "start", 0);
        setIntField(term5380, term5380.getClass(), "end", 0);
        setBooleanField(term5380, term5380.getClass(), "prev", false);
        setBooleanField(term5380, term5380.getClass(), "next", false);
        setField(term5380, term5380.getClass(), "pageList", null);
        term5388 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.PagingResultDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term5388;
        callMethod(klass, "setPrev", argTypes, term5380, args);
    }

};


