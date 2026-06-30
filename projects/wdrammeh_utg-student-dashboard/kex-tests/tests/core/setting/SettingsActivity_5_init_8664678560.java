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
import java.lang.Object;

public class SettingsActivity_5_init_8664678560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term717;

    public SettingsActivity_5_init_8664678560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term717 = (Object[]) newArray("java.lang.String", 4);
        setElement(term717, 0, "HyxfbSQYBe");
        setElement(term717, 1, "pCTimMblYc");
        setElement(term717, 2, "hNxWaHcfhY");
        setElement(term717, 3, "RkybSrpybU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.setting.SettingsActivity$5");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term717;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


