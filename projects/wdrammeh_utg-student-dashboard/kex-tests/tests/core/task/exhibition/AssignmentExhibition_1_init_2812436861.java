package core.task.exhibition;

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
import static core.task.exhibition.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AssignmentExhibition_1_init_2812436861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public AssignmentExhibition_1_init_2812436861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.exhibition.AssignmentExhibition$1");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("core.task.exhibition.AssignmentExhibition");
        argTypes[1] = Class.forName("core.task.self.AssignmentSelf");
        argTypes[2] = Class.forName("proto.KTextArea");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


