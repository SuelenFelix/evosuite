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
     Object term147373;

    public ModuleMemory_add_19381108881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147373 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term147373, term147373.getClass(), "score", 0.7332741045694002);
        setField(term147373, term147373.getClass(), "code", "DddqUYfomL");
        setField(term147373, term147373.getClass(), "name", "YQwoogpPyi");
        setField(term147373, term147373.getClass(), "year", "rnPhHoorxj");
        setField(term147373, term147373.getClass(), "semester", "GuwJLKquuI");
        setField(term147373, term147373.getClass(), "lecturer", "vYMCjgnztg");
        setBooleanField(term147373, term147373.getClass(), "isLecturerEditable", true);
        setField(term147373, term147373.getClass(), "campus", "YupgKTSEiI");
        setField(term147373, term147373.getClass(), "room", "HuOUlaFmvJ");
        setField(term147373, term147373.getClass(), "day", "dWVwcwFGNo");
        setField(term147373, term147373.getClass(), "time", "PNdLRrSAIY");
        setField(term147373, term147373.getClass(), "requirement", "nJnRIRiLZK");
        setIntField(term147373, term147373.getClass(), "creditHours", -1823255084);
        setBooleanField(term147373, term147373.getClass(), "isConfirmed", false);
        setField(term147373, term147373.getClass(), "status", "eWnrMSbYbT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleMemory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("core.module.Course");
        Object[] args = new Object[1];
        args[0] = term147373;
        callMethod(klass, "add", argTypes, null, args);
    }

};


