package core.task.handler;

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
import static core.task.handler.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TodoHandler_removalWaiter_9267069886 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170195;

    public TodoHandler_removalWaiter_9267069886() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170195 = newInstance(Class.forName("core.task.handler.TodoHandler"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.handler.TodoHandler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("core.task.self.TodoSelf");
        argTypes[1] = Class.forName("proto.KDialog");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "removalWaiter", argTypes, term170195, args);
    }

};


