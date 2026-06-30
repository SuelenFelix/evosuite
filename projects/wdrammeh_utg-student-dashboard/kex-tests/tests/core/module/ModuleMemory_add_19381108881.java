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

public class ModuleMemory_add_19381108881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51832;

    public ModuleMemory_add_19381108881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51832 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term51832, term51832.getClass(), "score", 0.7559240768573477);
        setField(term51832, term51832.getClass(), "code", "aanyiAOJCl");
        setField(term51832, term51832.getClass(), "name", "VDokbsCuqq");
        setField(term51832, term51832.getClass(), "year", "xClUIcPECX");
        setField(term51832, term51832.getClass(), "semester", "avhRaGZaBF");
        setField(term51832, term51832.getClass(), "lecturer", "JkgoRtImdE");
        setBooleanField(term51832, term51832.getClass(), "isLecturerEditable", false);
        setField(term51832, term51832.getClass(), "campus", "qFGKIJjlmV");
        setField(term51832, term51832.getClass(), "room", "IHqvyhMtuM");
        setField(term51832, term51832.getClass(), "day", "dAldIGYAXV");
        setField(term51832, term51832.getClass(), "time", "mLwibAPEsa");
        setField(term51832, term51832.getClass(), "requirement", "zsWKWiTFuo");
        setIntField(term51832, term51832.getClass(), "creditHours", -43417861);
        setBooleanField(term51832, term51832.getClass(), "isConfirmed", true);
        setField(term51832, term51832.getClass(), "status", "UPUbwyHQKN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleMemory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("core.module.Course");
        Object[] args = new Object[1];
        args[0] = term51832;
        callMethod(klass, "add", argTypes, null, args);
    }

};


