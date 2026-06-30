package in.cubestack.apps.blog.admin.resource;

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
import static in.cubestack.apps.blog.admin.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Long;
import java.lang.Object;

public class CategoryCandidate_from_14670088052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69;

    public CategoryCandidate_from_14670088052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term118 = new ArrayList();
        Long term122 = new Long(2442117782898005296L);
        term69 = newInstance(Class.forName("in.cubestack.apps.blog.post.domain.Category"));
        Object term124 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term125 = newInstance(Class.forName("java.time.LocalDate"));
        Object term129 = newInstance(Class.forName("java.time.LocalTime"));
        Object term134 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term135 = newInstance(Class.forName("java.time.LocalDate"));
        Object term139 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term69, term69.getClass(), "title", "xxtlPwDYFs");
        setField(term69, term69.getClass(), "metaTitle", "jJCZpVmanW");
        setField(term69, term69.getClass(), "slug", "EGtDIRbSSb");
        setField(term69, term69.getClass(), "content", "SzjVpOQTyS");
        setField(term69, term69.getClass(), "postCategories", term118);
        setField(term69, term69.getClass(), "id", term122);
        setIntField(term125, term125.getClass(), "year", 2012);
        setShortField(term125, term125.getClass(), "month", (short) 8);
        setShortField(term125, term125.getClass(), "day", (short) 25);
        setField(term124, term124.getClass(), "date", term125);
        setByteField(term129, term129.getClass(), "hour", (byte) 5);
        setByteField(term129, term129.getClass(), "minute", (byte) 20);
        setByteField(term129, term129.getClass(), "second", (byte) 50);
        setIntField(term129, term129.getClass(), "nano", 345595912);
        setField(term124, term124.getClass(), "time", term129);
        setField(term69, term69.getClass(), "createdAt", term124);
        setIntField(term135, term135.getClass(), "year", 2021);
        setShortField(term135, term135.getClass(), "month", (short) 1);
        setShortField(term135, term135.getClass(), "day", (short) 18);
        setField(term134, term134.getClass(), "date", term135);
        setByteField(term139, term139.getClass(), "hour", (byte) 13);
        setByteField(term139, term139.getClass(), "minute", (byte) 38);
        setByteField(term139, term139.getClass(), "second", (byte) 26);
        setIntField(term139, term139.getClass(), "nano", 544608644);
        setField(term134, term134.getClass(), "time", term139);
        setField(term69, term69.getClass(), "updatedAt", term134);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.CategoryCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.post.domain.Category");
        Object[] args = new Object[1];
        args[0] = term69;
        callMethod(klass, "from", argTypes, null, args);
    }

};


