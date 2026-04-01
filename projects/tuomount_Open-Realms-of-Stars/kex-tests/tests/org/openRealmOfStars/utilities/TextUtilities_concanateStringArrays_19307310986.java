package org.openRealmOfStars.utilities;

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
import static org.openRealmOfStars.utilities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TextUtilities_concanateStringArrays_19307310986 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7946;
     Object term8055;

    public TextUtilities_concanateStringArrays_19307310986() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7946 = (Object[]) newArray("java.lang.String", 9);
        setElement(term7946, 0, "hxCBltsObl");
        setElement(term7946, 1, "BndsHwAFMv");
        setElement(term7946, 2, "GzFkzHGYFt");
        setElement(term7946, 3, "tShwQLRGNe");
        setElement(term7946, 4, "LvtrsXUliU");
        setElement(term7946, 5, "xLbjWUgOIL");
        setElement(term7946, 6, "jDtqGUpnZN");
        setElement(term7946, 7, "nGKItKLYNC");
        setElement(term7946, 8, "UiUYnPrcCi");
        term8055 = (Object[]) newArray("java.lang.String", 7);
        setElement(term8055, 0, "UoYtihxVaS");
        setElement(term8055, 1, "JDswTTCZHV");
        setElement(term8055, 2, "onpbIeEKoi");
        setElement(term8055, 3, "YRHGsAkhxb");
        setElement(term8055, 4, "ffYhPOzlUs");
        setElement(term8055, 5, "MLqYREekMl");
        setElement(term8055, 6, "ytSBIKXogI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.TextUtilities");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term7946;
        args[1] = term8055;
        callMethod(klass, "concanateStringArrays", argTypes, null, args);
    }

};


