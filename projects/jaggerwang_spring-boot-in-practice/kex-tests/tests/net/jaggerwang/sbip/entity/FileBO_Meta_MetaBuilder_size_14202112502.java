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

public class FileBO_Meta_MetaBuilder_size_14202112502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19550;
     Object term19577;

    public FileBO_Meta_MetaBuilder_size_14202112502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19563 = new Long(-5534222035915952617L);
        term19550 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta$MetaBuilder"));
        setField(term19550, term19550.getClass(), "name", "kVEZMHmRtR");
        setField(term19550, term19550.getClass(), "size", term19563);
        setField(term19550, term19550.getClass(), "type", "ekxGuOYIwi");
        term19577 = new Long(8073378116544724166L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta$MetaBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term19577;
        callMethod(klass, "size", argTypes, term19550, args);
    }

};


