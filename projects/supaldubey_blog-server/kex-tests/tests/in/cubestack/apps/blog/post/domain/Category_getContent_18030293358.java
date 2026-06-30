package in.cubestack.apps.blog.post.domain;

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
import static in.cubestack.apps.blog.post.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Long;
import java.lang.Object;

public class Category_getContent_18030293358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82651;

    public Category_getContent_18030293358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term82700 = new ArrayList();
        Long term82704 = new Long(8229243567352210338L);
        term82651 = newInstance(Class.forName("in.cubestack.apps.blog.post.domain.Category"));
        Object term82706 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82707 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82711 = newInstance(Class.forName("java.time.LocalTime"));
        Object term82716 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82717 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82721 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term82651, term82651.getClass(), "title", "yOYHYOdvNm");
        setField(term82651, term82651.getClass(), "metaTitle", "RsOIgNcrMD");
        setField(term82651, term82651.getClass(), "slug", "JDwFepEsNs");
        setField(term82651, term82651.getClass(), "content", "YFjmdvvUEp");
        setField(term82651, term82651.getClass(), "postCategories", term82700);
        setField(term82651, term82651.getClass(), "id", term82704);
        setIntField(term82707, term82707.getClass(), "year", 2019);
        setShortField(term82707, term82707.getClass(), "month", (short) 1);
        setShortField(term82707, term82707.getClass(), "day", (short) 15);
        setField(term82706, term82706.getClass(), "date", term82707);
        setByteField(term82711, term82711.getClass(), "hour", (byte) 12);
        setByteField(term82711, term82711.getClass(), "minute", (byte) 5);
        setByteField(term82711, term82711.getClass(), "second", (byte) 14);
        setIntField(term82711, term82711.getClass(), "nano", 485893917);
        setField(term82706, term82706.getClass(), "time", term82711);
        setField(term82651, term82651.getClass(), "createdAt", term82706);
        setIntField(term82717, term82717.getClass(), "year", 2019);
        setShortField(term82717, term82717.getClass(), "month", (short) 9);
        setShortField(term82717, term82717.getClass(), "day", (short) 8);
        setField(term82716, term82716.getClass(), "date", term82717);
        setByteField(term82721, term82721.getClass(), "hour", (byte) 22);
        setByteField(term82721, term82721.getClass(), "minute", (byte) 56);
        setByteField(term82721, term82721.getClass(), "second", (byte) 8);
        setIntField(term82721, term82721.getClass(), "nano", 479364056);
        setField(term82716, term82716.getClass(), "time", term82721);
        setField(term82651, term82651.getClass(), "updatedAt", term82716);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.domain.Category");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContent", argTypes, term82651, args);
    }

};


