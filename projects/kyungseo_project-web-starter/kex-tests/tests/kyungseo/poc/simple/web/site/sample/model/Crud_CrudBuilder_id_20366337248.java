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
import java.lang.Long;

public class Crud_CrudBuilder_id_20366337248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1107;
     Object term1109;

    public Crud_CrudBuilder_id_20366337248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1107 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.model.Crud$CrudBuilder"));
        setLongField(term1107, term1107.getClass(), "id", 0L);
        setField(term1107, term1107.getClass(), "title", null);
        setField(term1107, term1107.getClass(), "body", null);
        setField(term1107, term1107.getClass(), "tagUris", null);
        term1109 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.model.Crud$CrudBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1109;
        callMethod(klass, "id", argTypes, term1107, args);
    }

};


