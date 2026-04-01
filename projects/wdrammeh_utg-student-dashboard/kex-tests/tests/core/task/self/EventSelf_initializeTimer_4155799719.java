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

public class EventSelf_initializeTimer_4155799719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term374357;
     Object term374361;

    public EventSelf_initializeTimer_4155799719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term374357 = newInstance(Class.forName("core.task.self.EventSelf"));
        setField(term374357, term374357.getClass(), "title", null);
        setField(term374357, term374357.getClass(), "dateDue", null);
        setField(term374357, term374357.getClass(), "timer", null);
        setBooleanField(term374357, term374357.getClass(), "isPending", false);
        setBooleanField(term374357, term374357.getClass(), "eveIsAlerted", false);
        setBooleanField(term374357, term374357.getClass(), "timeupIsAlerted", false);
        setField(term374357, term374357.getClass(), "stateIndicator", null);
        setField(term374357, term374357.getClass(), "canceller", null);
        setField(term374357, term374357.getClass(), "eventLayer", null);
        term374361 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.EventSelf");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term374361;
        callMethod(klass, "initializeTimer", argTypes, term374357, args);
    }

};


