package net.byteseek.swing.treetable;

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
import static net.byteseek.swing.treetable.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TableUtils_AWTMouseListenerReplacer_1_init_14716719360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99626;

    public TableUtils_AWTMouseListenerReplacer_1_init_14716719360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99626 = newInstance(Class.forName("net.byteseek.swing.treetable.TableUtils$AWTMouseListenerReplacer"));
        setField(term99626, term99626.getClass(), "component", null);
        setIntField(term99626, term99626.getClass(), "eventReplacementId", 188512644);
        setField(term99626, term99626.getClass(), "replacementListener", null);
        setField(term99626, term99626.getClass(), "removeListener", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TableUtils$AWTMouseListenerReplacer$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.byteseek.swing.treetable.TableUtils$AWTMouseListenerReplacer");
        Object[] args = new Object[1];
        args[0] = term99626;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


