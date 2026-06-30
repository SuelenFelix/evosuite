package com.zxl.dailypractice.card.two.october.october10;

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
import static com.zxl.dailypractice.card.two.october.october10.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class StuResp_toString_6283968039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1186;

    public StuResp_toString_6283968039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1199 = new Integer(1622346318);
        term1186 = newInstance(Class.forName("com.zxl.dailypractice.card.two.october.october10.StuResp"));
        setField(term1186, term1186.getClass(), "taskid", "UiUYnPrcCi");
        setField(term1186, term1186.getClass(), "seq", term1199);
        setField(term1186, term1186.getClass(), "originalFileName", "UoYtihxVaS");
        setField(term1186, term1186.getClass(), "fileDownloadUrl", "JDswTTCZHV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.october.october10.StuResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1186, args);
    }

};


