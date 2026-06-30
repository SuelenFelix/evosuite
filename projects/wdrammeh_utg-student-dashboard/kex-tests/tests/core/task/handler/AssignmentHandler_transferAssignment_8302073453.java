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
import java.lang.Boolean;

public class AssignmentHandler_transferAssignment_8302073453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29598;
     Object term29599;

    public AssignmentHandler_transferAssignment_8302073453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29598 = newInstance(Class.forName("core.task.handler.AssignmentHandler"));
        term29599 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.handler.AssignmentHandler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("core.task.self.AssignmentSelf");
        argTypes[1] = Class.forName("core.task.exhibition.AssignmentExhibition");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term29599;
        callMethod(klass, "transferAssignment", argTypes, term29598, args);
    }

};


