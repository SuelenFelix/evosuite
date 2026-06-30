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

public class PagingResultDTO_setTotalPage_203395469232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5330;
     Object term5338;

    public PagingResultDTO_setTotalPage_203395469232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5330 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.PagingResultDTO"));
        setField(term5330, term5330.getClass(), "DTOs", null);
        setIntField(term5330, term5330.getClass(), "totalPage", 0);
        setIntField(term5330, term5330.getClass(), "pageNum", 0);
        setIntField(term5330, term5330.getClass(), "pageSize", 0);
        setIntField(term5330, term5330.getClass(), "start", 0);
        setIntField(term5330, term5330.getClass(), "end", 0);
        setBooleanField(term5330, term5330.getClass(), "prev", false);
        setBooleanField(term5330, term5330.getClass(), "next", false);
        setField(term5330, term5330.getClass(), "pageList", null);
        term5338 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.PagingResultDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5338;
        callMethod(klass, "setTotalPage", argTypes, term5330, args);
    }

};


