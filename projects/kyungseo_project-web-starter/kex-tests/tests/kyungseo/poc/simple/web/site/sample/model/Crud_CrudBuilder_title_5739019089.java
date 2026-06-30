package kyungseo.poc.simple.web.site.sample.model;

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
import static kyungseo.poc.simple.web.site.sample.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Crud_CrudBuilder_title_5739019089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1111;

    public Crud_CrudBuilder_title_5739019089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1111 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.model.Crud$CrudBuilder"));
        setLongField(term1111, term1111.getClass(), "id", 0L);
        setField(term1111, term1111.getClass(), "title", null);
        setField(term1111, term1111.getClass(), "body", null);
        setField(term1111, term1111.getClass(), "tagUris", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.model.Crud$CrudBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "title", argTypes, term1111, args);
    }

};


