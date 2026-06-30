package core.task.self;

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
import static core.task.self.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class EventSelf_initializeTimer_4155799718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79846;
     Object term79850;

    public EventSelf_initializeTimer_4155799718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79846 = newInstance(Class.forName("core.task.self.EventSelf"));
        setField(term79846, term79846.getClass(), "title", null);
        setField(term79846, term79846.getClass(), "dateDue", null);
        setField(term79846, term79846.getClass(), "timer", null);
        setBooleanField(term79846, term79846.getClass(), "isPending", false);
        setBooleanField(term79846, term79846.getClass(), "eveIsAlerted", false);
        setBooleanField(term79846, term79846.getClass(), "timeupIsAlerted", false);
        setField(term79846, term79846.getClass(), "stateIndicator", null);
        setField(term79846, term79846.getClass(), "canceller", null);
        setField(term79846, term79846.getClass(), "eventLayer", null);
        term79850 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.EventSelf");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term79850;
        callMethod(klass, "initializeTimer", argTypes, term79846, args);
    }

};


