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

public class PagingResultDTO_setNext_142289392838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5390;
     Object term5398;

    public PagingResultDTO_setNext_142289392838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5390 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.PagingResultDTO"));
        setField(term5390, term5390.getClass(), "DTOs", null);
        setIntField(term5390, term5390.getClass(), "totalPage", 0);
        setIntField(term5390, term5390.getClass(), "pageNum", 0);
        setIntField(term5390, term5390.getClass(), "pageSize", 0);
        setIntField(term5390, term5390.getClass(), "start", 0);
        setIntField(term5390, term5390.getClass(), "end", 0);
        setBooleanField(term5390, term5390.getClass(), "prev", false);
        setBooleanField(term5390, term5390.getClass(), "next", false);
        setField(term5390, term5390.getClass(), "pageList", null);
        term5398 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.PagingResultDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term5398;
        callMethod(klass, "setNext", argTypes, term5390, args);
    }

};


