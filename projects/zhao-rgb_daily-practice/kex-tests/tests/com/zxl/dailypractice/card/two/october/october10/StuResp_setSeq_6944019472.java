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

public class StuResp_setSeq_6944019472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term657;
     Object term696;

    public StuResp_setSeq_6944019472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term670 = new Integer(1725571209);
        term657 = newInstance(Class.forName("com.zxl.dailypractice.card.two.october.october10.StuResp"));
        setField(term657, term657.getClass(), "taskid", "IoAlmYsBwc");
        setField(term657, term657.getClass(), "seq", term670);
        setField(term657, term657.getClass(), "originalFileName", "TEParAifyi");
        setField(term657, term657.getClass(), "fileDownloadUrl", "OWDIEULEFu");
        term696 = new Integer(-522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.october.october10.StuResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term696;
        callMethod(klass, "setSeq", argTypes, term657, args);
    }

};


