package ozi.app.printer;

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
import static ozi.app.printer.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PrinterApplication_main_4281073611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28567;

    public PrinterApplication_main_4281073611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28567 = (Object[]) newArray("java.lang.String", 6);
        setElement(term28567, 0, "CgleElJNje");
        setElement(term28567, 1, "ZrchvNGMtd");
        setElement(term28567, 2, "WaEcyVlcIx");
        setElement(term28567, 3, "ONcbPCQnHd");
        setElement(term28567, 4, "AobDaplFLl");
        setElement(term28567, 5, "pDkMNnAGgv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.PrinterApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term28567;
        callMethod(klass, "main", argTypes, null, args);
    }

};


