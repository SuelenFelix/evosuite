package core.setting;

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
import static core.setting.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SettingsActivity_newSignLabel_13040030778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236378;

    public SettingsActivity_newSignLabel_13040030778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term236378 = newInstance(Class.forName("java.awt.Color"));
        float[] term236380 = (float[]) newFloatArray(9);
        float[] term236390 = (float[]) newFloatArray(2);
        setIntField(term236378, term236378.getClass(), "value", 994300935);
        setFloatElement(term236380, 0, 0.4063537F);
        setFloatElement(term236380, 1, 0.46776146F);
        setFloatElement(term236380, 2, 0.47720432F);
        setFloatElement(term236380, 3, 0.2877797F);
        setFloatElement(term236380, 4, 0.24465042F);
        setFloatElement(term236380, 5, 0.110482514F);
        setFloatElement(term236380, 6, 0.61427236F);
        setFloatElement(term236380, 7, 0.94188213F);
        setFloatElement(term236380, 8, 0.43556267F);
        setField(term236378, term236378.getClass(), "frgbvalue", term236380);
        setFloatElement(term236390, 0, 0.8789557F);
        setFloatElement(term236390, 1, 0.8414608F);
        setField(term236378, term236378.getClass(), "fvalue", term236390);
        setFloatField(term236378, term236378.getClass(), "falpha", 0.78664905F);
        setField(term236378, term236378.getClass(), "cs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.setting.SettingsActivity");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.awt.Color");
        Object[] args = new Object[2];
        args[0] = "zRnpRGaHlI";
        args[1] = term236378;
        callMethod(klass, "newSignLabel", argTypes, null, args);
    }

};


