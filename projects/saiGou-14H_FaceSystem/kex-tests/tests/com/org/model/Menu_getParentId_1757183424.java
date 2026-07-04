package com.org.model;

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
import static com.org.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class Menu_getParentId_1757183424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44766;

    public Menu_getParentId_1757183424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term44767 = new Integer(-91024448);
        Integer term44793 = new Integer(-744517334);
        ArrayList term44819 = new ArrayList();
        term44766 = newInstance(Class.forName("com.org.model.Menu"));
        Object term44823 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term44766, term44766.getClass(), "id", term44767);
        setField(term44766, term44766.getClass(), "name", "YZlmTsvPxB");
        setField(term44766, term44766.getClass(), "path", "yErTcfFPDh");
        setField(term44766, term44766.getClass(), "parentId", term44793);
        setField(term44766, term44766.getClass(), "icon", "pcSSrLKTkD");
        setField(term44766, term44766.getClass(), "introduce", "vxlSdnCUmM");
        setField(term44766, term44766.getClass(), "children", term44819);
        setField(term44823, term44823.getClass(), "title", "PiuHpoWAqL");
        setField(term44823, term44823.getClass(), "icon", "BgopFWdbic");
        setField(term44766, term44766.getClass(), "meta", term44823);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Menu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParentId", argTypes, term44766, args);
    }

};


