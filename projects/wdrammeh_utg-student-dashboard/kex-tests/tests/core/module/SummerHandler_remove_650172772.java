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

public class SummerHandler_remove_650172772 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30242;

    public SummerHandler_remove_650172772() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30242 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term30242, term30242.getClass(), "score", 0.1374549299694151);
        setField(term30242, term30242.getClass(), "code", "aWYOWZFyaX");
        setField(term30242, term30242.getClass(), "name", "BRIVNtfUWU");
        setField(term30242, term30242.getClass(), "year", "DbiCVtPPCT");
        setField(term30242, term30242.getClass(), "semester", "WzFopsaDuG");
        setField(term30242, term30242.getClass(), "lecturer", "PapWxkhEWe");
        setBooleanField(term30242, term30242.getClass(), "isLecturerEditable", true);
        setField(term30242, term30242.getClass(), "campus", "smnHEqRFRx");
        setField(term30242, term30242.getClass(), "room", "XYtryyobou");
        setField(term30242, term30242.getClass(), "day", "OYbzXylRWW");
        setField(term30242, term30242.getClass(), "time", "DSNsTGYXDF");
        setField(term30242, term30242.getClass(), "requirement", "sQvGcVjdEx");
        setIntField(term30242, term30242.getClass(), "creditHours", 71190297);
        setBooleanField(term30242, term30242.getClass(), "isConfirmed", true);
        setField(term30242, term30242.getClass(), "status", "rLHAoqXgPh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.SummerHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("core.module.Course");
        Object[] args = new Object[1];
        args[0] = term30242;
        callMethod(klass, "remove", argTypes, null, args);
    }

};


