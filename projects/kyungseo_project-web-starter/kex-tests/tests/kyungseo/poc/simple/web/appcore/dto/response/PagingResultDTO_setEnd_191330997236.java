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

public class PagingResultDTO_setEnd_191330997236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5370;
     Object term5378;

    public PagingResultDTO_setEnd_191330997236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5370 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.PagingResultDTO"));
        setField(term5370, term5370.getClass(), "DTOs", null);
        setIntField(term5370, term5370.getClass(), "totalPage", 0);
        setIntField(term5370, term5370.getClass(), "pageNum", 0);
        setIntField(term5370, term5370.getClass(), "pageSize", 0);
        setIntField(term5370, term5370.getClass(), "start", 0);
        setIntField(term5370, term5370.getClass(), "end", 0);
        setBooleanField(term5370, term5370.getClass(), "prev", false);
        setBooleanField(term5370, term5370.getClass(), "next", false);
        setField(term5370, term5370.getClass(), "pageList", null);
        term5378 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.PagingResultDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5378;
        callMethod(klass, "setEnd", argTypes, term5370, args);
    }

};


