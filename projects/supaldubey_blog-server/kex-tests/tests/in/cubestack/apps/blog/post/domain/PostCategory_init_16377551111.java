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

public class PostCategory_init_16377551111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public PostCategory_init_16377551111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term50 = new ArrayList();
        Long term54 = new Long(2442117782898005296L);
        term1 = newInstance(Class.forName("in.cubestack.apps.blog.post.domain.Category"));
        Object term56 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57 = newInstance(Class.forName("java.time.LocalDate"));
        Object term61 = newInstance(Class.forName("java.time.LocalTime"));
        Object term66 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67 = newInstance(Class.forName("java.time.LocalDate"));
        Object term71 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1, term1.getClass(), "title", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "metaTitle", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "slug", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "content", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "postCategories", term50);
        setField(term1, term1.getClass(), "id", term54);
        setIntField(term57, term57.getClass(), "year", 2012);
        setShortField(term57, term57.getClass(), "month", (short) 8);
        setShortField(term57, term57.getClass(), "day", (short) 25);
        setField(term56, term56.getClass(), "date", term57);
        setByteField(term61, term61.getClass(), "hour", (byte) 5);
        setByteField(term61, term61.getClass(), "minute", (byte) 20);
        setByteField(term61, term61.getClass(), "second", (byte) 50);
        setIntField(term61, term61.getClass(), "nano", 345595912);
        setField(term56, term56.getClass(), "time", term61);
        setField(term1, term1.getClass(), "createdAt", term56);
        setIntField(term67, term67.getClass(), "year", 2021);
        setShortField(term67, term67.getClass(), "month", (short) 1);
        setShortField(term67, term67.getClass(), "day", (short) 18);
        setField(term66, term66.getClass(), "date", term67);
        setByteField(term71, term71.getClass(), "hour", (byte) 13);
        setByteField(term71, term71.getClass(), "minute", (byte) 38);
        setByteField(term71, term71.getClass(), "second", (byte) 26);
        setIntField(term71, term71.getClass(), "nano", 544608644);
        setField(term66, term66.getClass(), "time", term71);
        setField(term1, term1.getClass(), "updatedAt", term66);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.domain.PostCategory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.post.domain.Category");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


