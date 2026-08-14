package net.jaggerwang.sbip.entity;

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
import static net.jaggerwang.sbip.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class FileBO_Meta_MetaBuilder_build_20223702034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19668;

    public FileBO_Meta_MetaBuilder_build_20223702034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19681 = new Long(6853972830905120647L);
        term19668 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta$MetaBuilder"));
        setField(term19668, term19668.getClass(), "name", "iljANwuEjk");
        setField(term19668, term19668.getClass(), "size", term19681);
        setField(term19668, term19668.getClass(), "type", "kNqaJKIATy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta$MetaBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term19668, args);
    }

};


