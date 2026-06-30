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

public class EventSelf_getCanceller_68566761726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79880;

    public EventSelf_getCanceller_68566761726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79880 = newInstance(Class.forName("core.task.self.EventSelf"));
        setField(term79880, term79880.getClass(), "title", null);
        setField(term79880, term79880.getClass(), "dateDue", null);
        setField(term79880, term79880.getClass(), "timer", null);
        setBooleanField(term79880, term79880.getClass(), "isPending", false);
        setBooleanField(term79880, term79880.getClass(), "eveIsAlerted", false);
        setBooleanField(term79880, term79880.getClass(), "timeupIsAlerted", false);
        setField(term79880, term79880.getClass(), "stateIndicator", null);
        setField(term79880, term79880.getClass(), "canceller", null);
        setField(term79880, term79880.getClass(), "eventLayer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.EventSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCanceller", argTypes, term79880, args);
    }

};


