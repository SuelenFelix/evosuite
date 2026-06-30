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

public class ModuleMemory_remove_13326286832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52079;

    public ModuleMemory_remove_13326286832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52079 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term52079, term52079.getClass(), "score", 0.10667076642995188);
        setField(term52079, term52079.getClass(), "code", "lgQkrXANyI");
        setField(term52079, term52079.getClass(), "name", "MeTmRZXErV");
        setField(term52079, term52079.getClass(), "year", "jNxbVmoZgq");
        setField(term52079, term52079.getClass(), "semester", "PvmBHIXaMY");
        setField(term52079, term52079.getClass(), "lecturer", "hulYxtowxw");
        setBooleanField(term52079, term52079.getClass(), "isLecturerEditable", false);
        setField(term52079, term52079.getClass(), "campus", "GNEmuHPNcU");
        setField(term52079, term52079.getClass(), "room", "IoSfuKDFRe");
        setField(term52079, term52079.getClass(), "day", "AWYyZiNfsm");
        setField(term52079, term52079.getClass(), "time", "ITRRYiuDwH");
        setField(term52079, term52079.getClass(), "requirement", "llRfwANcVF");
        setIntField(term52079, term52079.getClass(), "creditHours", -1533843432);
        setBooleanField(term52079, term52079.getClass(), "isConfirmed", true);
        setField(term52079, term52079.getClass(), "status", "sUEeHQTWkA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleMemory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("core.module.Course");
        Object[] args = new Object[1];
        args[0] = term52079;
        callMethod(klass, "remove", argTypes, null, args);
    }

};


