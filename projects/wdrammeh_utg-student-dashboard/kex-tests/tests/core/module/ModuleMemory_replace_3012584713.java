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

public class ModuleMemory_replace_3012584713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147867;
     Object term148004;

    public ModuleMemory_replace_3012584713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147867 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term147867, term147867.getClass(), "score", 0.8598297828918529);
        setField(term147867, term147867.getClass(), "code", "mrSAYJlddZ");
        setField(term147867, term147867.getClass(), "name", "KbwxawvYsw");
        setField(term147867, term147867.getClass(), "year", "gvjdfHNzOa");
        setField(term147867, term147867.getClass(), "semester", "HqitWglYWX");
        setField(term147867, term147867.getClass(), "lecturer", "pOuFRlHmbK");
        setBooleanField(term147867, term147867.getClass(), "isLecturerEditable", true);
        setField(term147867, term147867.getClass(), "campus", "WrzdBkinqV");
        setField(term147867, term147867.getClass(), "room", "vydWXHfFTw");
        setField(term147867, term147867.getClass(), "day", "DRhkpDneCC");
        setField(term147867, term147867.getClass(), "time", "vuIJRrypuA");
        setField(term147867, term147867.getClass(), "requirement", "AxfSZmaiyA");
        setIntField(term147867, term147867.getClass(), "creditHours", -2092117838);
        setBooleanField(term147867, term147867.getClass(), "isConfirmed", true);
        setField(term147867, term147867.getClass(), "status", "lBpveIKbea");
        term148004 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term148004, term148004.getClass(), "score", 0.43692187681405226);
        setField(term148004, term148004.getClass(), "code", "uyLBVQYcOV");
        setField(term148004, term148004.getClass(), "name", "PoTZjDuBHa");
        setField(term148004, term148004.getClass(), "year", "MIwvgVrhzP");
        setField(term148004, term148004.getClass(), "semester", "HcUUieXdep");
        setField(term148004, term148004.getClass(), "lecturer", "AbonCTtbef");
        setBooleanField(term148004, term148004.getClass(), "isLecturerEditable", false);
        setField(term148004, term148004.getClass(), "campus", "maXrGOGoKA");
        setField(term148004, term148004.getClass(), "room", "zAkgWQVCpM");
        setField(term148004, term148004.getClass(), "day", "yQUDyOroXU");
        setField(term148004, term148004.getClass(), "time", "xweqkPdyJH");
        setField(term148004, term148004.getClass(), "requirement", "kwteHWzwcc");
        setIntField(term148004, term148004.getClass(), "creditHours", 1524590776);
        setBooleanField(term148004, term148004.getClass(), "isConfirmed", false);
        setField(term148004, term148004.getClass(), "status", "uMsWXqNhln");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleMemory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("core.module.Course");
        argTypes[1] = Class.forName("core.module.Course");
        Object[] args = new Object[2];
        args[0] = term147867;
        args[1] = term148004;
        callMethod(klass, "replace", argTypes, null, args);
    }

};


