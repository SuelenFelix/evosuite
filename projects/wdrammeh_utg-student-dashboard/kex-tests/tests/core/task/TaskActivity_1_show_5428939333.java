package core.task;

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
import static core.task.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TaskActivity_1_show_5428939333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92732;

    public TaskActivity_1_show_5428939333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92732 = newInstance(Class.forName("core.task.TaskActivity$1"));
        setField(term92732, term92732.getClass(), "val$returnButton", null);
        setField(term92732, term92732.getClass(), "this$0", null);
        setField(term92732, term92732.getClass(), "vector", null);
        setIntField(term92732, term92732.getClass(), "currentCard", 0);
        setIntField(term92732, term92732.getClass(), "hgap", 0);
        setIntField(term92732, term92732.getClass(), "vgap", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.TaskActivity$1");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.awt.Container");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "show", argTypes, term92732, args);
    }

};


