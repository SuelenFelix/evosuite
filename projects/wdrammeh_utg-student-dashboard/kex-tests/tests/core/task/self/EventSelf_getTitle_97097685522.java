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

public class EventSelf_getTitle_97097685522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79864;

    public EventSelf_getTitle_97097685522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79864 = newInstance(Class.forName("core.task.self.EventSelf"));
        setField(term79864, term79864.getClass(), "title", null);
        setField(term79864, term79864.getClass(), "dateDue", null);
        setField(term79864, term79864.getClass(), "timer", null);
        setBooleanField(term79864, term79864.getClass(), "isPending", false);
        setBooleanField(term79864, term79864.getClass(), "eveIsAlerted", false);
        setBooleanField(term79864, term79864.getClass(), "timeupIsAlerted", false);
        setField(term79864, term79864.getClass(), "stateIndicator", null);
        setField(term79864, term79864.getClass(), "canceller", null);
        setField(term79864, term79864.getClass(), "eventLayer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.EventSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term79864, args);
    }

};


