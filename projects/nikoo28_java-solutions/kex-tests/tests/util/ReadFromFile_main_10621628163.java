package util;

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
import static util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ReadFromFile_main_10621628163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1143;

    public ReadFromFile_main_10621628163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1143 = (Object[]) newArray("java.lang.String", 6);
        setElement(term1143, 0, "oVcInYnLWB");
        setElement(term1143, 1, "aJlieCFVtF");
        setElement(term1143, 2, "ZiaGIbnzTs");
        setElement(term1143, 3, "tbcdzjIfER");
        setElement(term1143, 4, "HyxfbSQYBe");
        setElement(term1143, 5, "pCTimMblYc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.ReadFromFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1143;
        callMethod(klass, "main", argTypes, null, args);
    }

};


