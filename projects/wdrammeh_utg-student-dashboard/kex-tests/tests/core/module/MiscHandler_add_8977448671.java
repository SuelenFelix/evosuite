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

public class MiscHandler_add_8977448671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48474;

    public MiscHandler_add_8977448671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48474 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term48474, term48474.getClass(), "score", 0.3800088629986428);
        setField(term48474, term48474.getClass(), "code", "wdoqITnaAP");
        setField(term48474, term48474.getClass(), "name", "rIPMBcrNqB");
        setField(term48474, term48474.getClass(), "year", "UDaboHZHhz");
        setField(term48474, term48474.getClass(), "semester", "nRvKihUSPj");
        setField(term48474, term48474.getClass(), "lecturer", "BbNeQJpYPr");
        setBooleanField(term48474, term48474.getClass(), "isLecturerEditable", false);
        setField(term48474, term48474.getClass(), "campus", "riMtzCoxNj");
        setField(term48474, term48474.getClass(), "room", "YAXkVjQZcV");
        setField(term48474, term48474.getClass(), "day", "pumvwBWvpy");
        setField(term48474, term48474.getClass(), "time", "HwLHeGLyhe");
        setField(term48474, term48474.getClass(), "requirement", "RDnkgWkcbz");
        setIntField(term48474, term48474.getClass(), "creditHours", -1183353915);
        setBooleanField(term48474, term48474.getClass(), "isConfirmed", true);
        setField(term48474, term48474.getClass(), "status", "IBpaxltauX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.MiscHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("core.module.Course");
        Object[] args = new Object[1];
        args[0] = term48474;
        callMethod(klass, "add", argTypes, null, args);
    }

};


