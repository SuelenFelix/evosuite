package com.dmatik.orefalerts.entity;

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
import static com.dmatik.orefalerts.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class HistoryResponse_init_8278533756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7764;

    public HistoryResponse_init_8278533756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7764 = (Object[]) newArray("com.dmatik.orefalerts.entity.HistoryItem", 5);
        Object term7765 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        Object term7803 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        Object term7841 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        Object term7879 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        Object term7917 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        setField(term7765, term7765.getClass(), "alertDate", "aanyiAOJCl");
        setField(term7765, term7765.getClass(), "title", "VDokbsCuqq");
        setField(term7765, term7765.getClass(), "data", "xClUIcPECX");
        setIntField(term7765, term7765.getClass(), "category", -817164822);
        setElement(term7764, 0, term7765);
        setField(term7803, term7803.getClass(), "alertDate", "avhRaGZaBF");
        setField(term7803, term7803.getClass(), "title", "JkgoRtImdE");
        setField(term7803, term7803.getClass(), "data", "qFGKIJjlmV");
        setIntField(term7803, term7803.getClass(), "category", -1016503459);
        setElement(term7764, 1, term7803);
        setField(term7841, term7841.getClass(), "alertDate", "IHqvyhMtuM");
        setField(term7841, term7841.getClass(), "title", "dAldIGYAXV");
        setField(term7841, term7841.getClass(), "data", "mLwibAPEsa");
        setIntField(term7841, term7841.getClass(), "category", -1968847291);
        setElement(term7764, 2, term7841);
        setField(term7879, term7879.getClass(), "alertDate", "zsWKWiTFuo");
        setField(term7879, term7879.getClass(), "title", "UPUbwyHQKN");
        setField(term7879, term7879.getClass(), "data", "lgQkrXANyI");
        setIntField(term7879, term7879.getClass(), "category", 579005622);
        setElement(term7764, 3, term7879);
        setField(term7917, term7917.getClass(), "alertDate", "MeTmRZXErV");
        setField(term7917, term7917.getClass(), "title", "jNxbVmoZgq");
        setField(term7917, term7917.getClass(), "data", "PvmBHIXaMY");
        setIntField(term7917, term7917.getClass(), "category", -14890619);
        setElement(term7764, 4, term7917);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dmatik.orefalerts.entity.HistoryResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term7764;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


