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
import java.lang.Long;
import java.lang.Object;

public class Tag_setTitle_14319384306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16671;

    public Tag_setTitle_14319384306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16708 = new Long(-7456852906235966771L);
        term16671 = newInstance(Class.forName("in.cubestack.apps.blog.post.domain.Tag"));
        Object term16710 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16711 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16715 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16720 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16721 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16725 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term16671, term16671.getClass(), "title", "ZEXFoMSKeG");
        setField(term16671, term16671.getClass(), "slug", "HvxahUfZcJ");
        setField(term16671, term16671.getClass(), "content", "WkLpmqoQxy");
        setField(term16671, term16671.getClass(), "id", term16708);
        setIntField(term16711, term16711.getClass(), "year", 2017);
        setShortField(term16711, term16711.getClass(), "month", (short) 5);
        setShortField(term16711, term16711.getClass(), "day", (short) 2);
        setField(term16710, term16710.getClass(), "date", term16711);
        setByteField(term16715, term16715.getClass(), "hour", (byte) 7);
        setByteField(term16715, term16715.getClass(), "minute", (byte) 24);
        setByteField(term16715, term16715.getClass(), "second", (byte) 51);
        setIntField(term16715, term16715.getClass(), "nano", 706502334);
        setField(term16710, term16710.getClass(), "time", term16715);
        setField(term16671, term16671.getClass(), "createdAt", term16710);
        setIntField(term16721, term16721.getClass(), "year", 2026);
        setShortField(term16721, term16721.getClass(), "month", (short) 11);
        setShortField(term16721, term16721.getClass(), "day", (short) 1);
        setField(term16720, term16720.getClass(), "date", term16721);
        setByteField(term16725, term16725.getClass(), "hour", (byte) 9);
        setByteField(term16725, term16725.getClass(), "minute", (byte) 4);
        setByteField(term16725, term16725.getClass(), "second", (byte) 25);
        setIntField(term16725, term16725.getClass(), "nano", 272299951);
        setField(term16720, term16720.getClass(), "time", term16725);
        setField(term16671, term16671.getClass(), "updatedAt", term16720);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.domain.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XiNoscmYhd";
        callMethod(klass, "setTitle", argTypes, term16671, args);
    }

};


