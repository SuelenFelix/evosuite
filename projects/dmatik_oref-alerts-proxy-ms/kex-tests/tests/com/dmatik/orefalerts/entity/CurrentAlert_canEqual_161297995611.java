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

public class CurrentAlert_canEqual_161297995611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4761;
     Object term4919;

    public CurrentAlert_canEqual_161297995611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4761 = newInstance(Class.forName("com.dmatik.orefalerts.entity.CurrentAlert"));
        Object[] term4798 = (Object[]) newArray("java.lang.String", 9);
        setField(term4761, term4761.getClass(), "id", "hOncybyCAH");
        setField(term4761, term4761.getClass(), "cat", "QduALnDSVo");
        setField(term4761, term4761.getClass(), "title", "izPpKDErnQ");
        setElement(term4798, 0, "NnpwZBUTvx");
        setElement(term4798, 1, "tlQSNgTkQX");
        setElement(term4798, 2, "PCipZnmBOF");
        setElement(term4798, 3, "zcorEihhLK");
        setElement(term4798, 4, "GrqozDKFOk");
        setElement(term4798, 5, "CFyoseFGLF");
        setElement(term4798, 6, "SFqCrhEWLm");
        setElement(term4798, 7, "GZdcJyZntS");
        setElement(term4798, 8, "OIHoJeysUi");
        setField(term4761, term4761.getClass(), "data", term4798);
        setField(term4761, term4761.getClass(), "desc", "WXMWFDGcLB");
        term4919 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dmatik.orefalerts.entity.CurrentAlert");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4919;
        callMethod(klass, "canEqual", argTypes, term4761, args);
    }

};


