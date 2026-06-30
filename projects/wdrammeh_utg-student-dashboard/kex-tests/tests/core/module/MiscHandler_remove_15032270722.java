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

public class MiscHandler_remove_15032270722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48721;

    public MiscHandler_remove_15032270722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48721 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term48721, term48721.getClass(), "score", 0.5840714198152577);
        setField(term48721, term48721.getClass(), "code", "hePqROaplw");
        setField(term48721, term48721.getClass(), "name", "PJcSNDruWd");
        setField(term48721, term48721.getClass(), "year", "VVNNlAePXF");
        setField(term48721, term48721.getClass(), "semester", "jnwVnmKAFv");
        setField(term48721, term48721.getClass(), "lecturer", "TXyHhqeCjR");
        setBooleanField(term48721, term48721.getClass(), "isLecturerEditable", true);
        setField(term48721, term48721.getClass(), "campus", "lZIgPZPgTu");
        setField(term48721, term48721.getClass(), "room", "iuCxnHGMoW");
        setField(term48721, term48721.getClass(), "day", "GPSEWEDSTo");
        setField(term48721, term48721.getClass(), "time", "RCOqfVsRHt");
        setField(term48721, term48721.getClass(), "requirement", "TSyCeEZPaT");
        setIntField(term48721, term48721.getClass(), "creditHours", -420030135);
        setBooleanField(term48721, term48721.getClass(), "isConfirmed", false);
        setField(term48721, term48721.getClass(), "status", "JeZFtaqkzW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.MiscHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("core.module.Course");
        Object[] args = new Object[1];
        args[0] = term48721;
        callMethod(klass, "remove", argTypes, null, args);
    }

};


