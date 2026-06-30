package com.salomondev.interceptor.interceptor.dto;

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
import static com.salomondev.interceptor.interceptor.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Long;

public class LoggerDto_LoggerDtoBuilder_path_2154542713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2252;

    public LoggerDto_LoggerDtoBuilder_path_2154542713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2289 = new HashMap();
        Integer term2300 = new Integer(-244121226);
        Long term2302 = new Long(2120084523938730454L);
        term2252 = newInstance(Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto$LoggerDtoBuilder"));
        Object term2299 = newInstance(Class.forName("java.lang.Object"));
        setField(term2252, term2252.getClass(), "method", "HHmNoYxIGj");
        setField(term2252, term2252.getClass(), "ip", "PtirvZmsGt");
        setField(term2252, term2252.getClass(), "path", "HWkpTmtlrc");
        setField(term2252, term2252.getClass(), "parametersIn", term2289);
        setField(term2252, term2252.getClass(), "parametersOut", term2299);
        setField(term2252, term2252.getClass(), "codeResponse", term2300);
        setField(term2252, term2252.getClass(), "timeConsumeService", term2302);
        setField(term2252, term2252.getClass(), "timeResponseService", "VeDtgDzGAN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto$LoggerDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aWYOWZFyaX";
        callMethod(klass, "path", argTypes, term2252, args);
    }

};


