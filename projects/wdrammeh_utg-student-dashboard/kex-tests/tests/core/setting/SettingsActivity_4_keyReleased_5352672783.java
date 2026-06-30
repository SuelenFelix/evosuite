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

public class SettingsActivity_4_keyReleased_5352672783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1005;

    public SettingsActivity_4_keyReleased_5352672783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1005 = newInstance(Class.forName("core.setting.SettingsActivity$4"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.setting.SettingsActivity$4");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.KeyEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "keyReleased", argTypes, term1005, args);
    }

};


