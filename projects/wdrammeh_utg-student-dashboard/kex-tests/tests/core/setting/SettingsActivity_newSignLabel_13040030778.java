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
     Object term4665;

    public SettingsActivity_newSignLabel_13040030778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4665 = newInstance(Class.forName("java.awt.Color"));
        float[] term4667 = (float[]) newFloatArray(2);
        float[] term4670 = (float[]) newFloatArray(6);
        setIntField(term4665, term4665.getClass(), "value", -2015048153);
        setFloatElement(term4667, 0, 0.76550204F);
        setFloatElement(term4667, 1, 0.26441735F);
        setField(term4665, term4665.getClass(), "frgbvalue", term4667);
        setFloatElement(term4670, 0, 0.13745493F);
        setFloatElement(term4670, 1, 0.20144695F);
        setFloatElement(term4670, 2, 0.7031006F);
        setFloatElement(term4670, 3, 0.9431611F);
        setFloatElement(term4670, 4, 0.95272815F);
        setFloatElement(term4670, 5, 0.7254646F);
        setField(term4665, term4665.getClass(), "fvalue", term4670);
        setFloatField(term4665, term4665.getClass(), "falpha", 0.9828442F);
        setField(term4665, term4665.getClass(), "cs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.setting.SettingsActivity");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.awt.Color");
        Object[] args = new Object[2];
        args[0] = "LvtrsXUliU";
        args[1] = term4665;
        callMethod(klass, "newSignLabel", argTypes, null, args);
    }

};


