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

public class PagingResultDTO_setDTOs_139181757931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5322;

    public PagingResultDTO_setDTOs_139181757931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5322 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.PagingResultDTO"));
        setField(term5322, term5322.getClass(), "DTOs", null);
        setIntField(term5322, term5322.getClass(), "totalPage", 0);
        setIntField(term5322, term5322.getClass(), "pageNum", 0);
        setIntField(term5322, term5322.getClass(), "pageSize", 0);
        setIntField(term5322, term5322.getClass(), "start", 0);
        setIntField(term5322, term5322.getClass(), "end", 0);
        setBooleanField(term5322, term5322.getClass(), "prev", false);
        setBooleanField(term5322, term5322.getClass(), "next", false);
        setField(term5322, term5322.getClass(), "pageList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.PagingResultDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDTOs", argTypes, term5322, args);
    }

};


