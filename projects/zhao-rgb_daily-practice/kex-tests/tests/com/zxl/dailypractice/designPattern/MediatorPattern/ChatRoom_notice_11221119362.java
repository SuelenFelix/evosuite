package com.zxl.dailypractice.designPattern.MediatorPattern;

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
import static com.zxl.dailypractice.designPattern.MediatorPattern.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class ChatRoom_notice_11221119362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6;

    public ChatRoom_notice_11221119362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7 = new ArrayList();
        term6 = newInstance(Class.forName("com.zxl.dailypractice.designPattern.MediatorPattern.ChatRoom"));
        setField(term6, term6.getClass(), "users", term7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.designPattern.MediatorPattern.ChatRoom");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.zxl.dailypractice.designPattern.MediatorPattern.User");
        Object[] args = new Object[2];
        args[0] = "PAEBtnZtTD";
        args[1] = null;
        callMethod(klass, "notice", argTypes, term6, args);
    }

};


