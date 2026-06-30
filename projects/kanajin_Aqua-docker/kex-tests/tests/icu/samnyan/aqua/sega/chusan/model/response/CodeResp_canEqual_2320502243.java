package icu.samnyan.aqua.sega.chusan.model.response;

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
import static icu.samnyan.aqua.sega.chusan.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CodeResp_canEqual_2320502243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12258;
     Object term12260;

    public CodeResp_canEqual_2320502243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12258 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.CodeResp"));
        setIntField(term12258, term12258.getClass(), "returnCode", -1866172730);
        term12260 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.CodeResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term12260;
        callMethod(klass, "canEqual", argTypes, term12258, args);
    }

};


