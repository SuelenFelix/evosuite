package core.module;

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
import static core.module.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MiscHandler_MiscModuleEditor_init_16241741390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120561;

    public MiscHandler_MiscModuleEditor_init_16241741390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120561 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term120561, term120561.getClass(), "score", 0.07802449704920456);
        setField(term120561, term120561.getClass(), "code", "ujxmmZZcbT");
        setField(term120561, term120561.getClass(), "name", "BOvgwHfoHQ");
        setField(term120561, term120561.getClass(), "year", "hPpFNeDBIb");
        setField(term120561, term120561.getClass(), "semester", "DNOtiLPAIY");
        setField(term120561, term120561.getClass(), "lecturer", "FnEkAHBfyV");
        setBooleanField(term120561, term120561.getClass(), "isLecturerEditable", true);
        setField(term120561, term120561.getClass(), "campus", "VfmNFpEuax");
        setField(term120561, term120561.getClass(), "room", "ANHjlWPmZG");
        setField(term120561, term120561.getClass(), "day", "SibzENsyyy");
        setField(term120561, term120561.getClass(), "time", "mrqGHotaef");
        setField(term120561, term120561.getClass(), "requirement", "UbZGBpQZQW");
        setIntField(term120561, term120561.getClass(), "creditHours", -1231122778);
        setBooleanField(term120561, term120561.getClass(), "isConfirmed", true);
        setField(term120561, term120561.getClass(), "status", "SvGTualQPa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.MiscHandler$MiscModuleEditor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("core.module.Course");
        Object[] args = new Object[1];
        args[0] = term120561;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


