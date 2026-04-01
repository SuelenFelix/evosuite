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
     Object term147620;

    public ModuleMemory_remove_13326286832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147620 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term147620, term147620.getClass(), "score", 0.4569171842750229);
        setField(term147620, term147620.getClass(), "code", "AjoFvDFyCY");
        setField(term147620, term147620.getClass(), "name", "OFTJwdPiTG");
        setField(term147620, term147620.getClass(), "year", "QiUprSEluR");
        setField(term147620, term147620.getClass(), "semester", "cDOXXottZh");
        setField(term147620, term147620.getClass(), "lecturer", "rfqJDkDppz");
        setBooleanField(term147620, term147620.getClass(), "isLecturerEditable", true);
        setField(term147620, term147620.getClass(), "campus", "MGorMVGauT");
        setField(term147620, term147620.getClass(), "room", "jXKxUGTuEF");
        setField(term147620, term147620.getClass(), "day", "nDCcyhiTnS");
        setField(term147620, term147620.getClass(), "time", "Bcivwcjece");
        setField(term147620, term147620.getClass(), "requirement", "QTefjRuiez");
        setIntField(term147620, term147620.getClass(), "creditHours", 793345010);
        setBooleanField(term147620, term147620.getClass(), "isConfirmed", false);
        setField(term147620, term147620.getClass(), "status", "SQZVNkAVBB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleMemory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("core.module.Course");
        Object[] args = new Object[1];
        args[0] = term147620;
        callMethod(klass, "remove", argTypes, null, args);
    }

};


