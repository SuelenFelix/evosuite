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

public class EventSelf_isExam_76696388324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79872;

    public EventSelf_isExam_76696388324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79872 = newInstance(Class.forName("core.task.self.EventSelf"));
        setField(term79872, term79872.getClass(), "title", null);
        setField(term79872, term79872.getClass(), "dateDue", null);
        setField(term79872, term79872.getClass(), "timer", null);
        setBooleanField(term79872, term79872.getClass(), "isPending", false);
        setBooleanField(term79872, term79872.getClass(), "eveIsAlerted", false);
        setBooleanField(term79872, term79872.getClass(), "timeupIsAlerted", false);
        setField(term79872, term79872.getClass(), "stateIndicator", null);
        setField(term79872, term79872.getClass(), "canceller", null);
        setField(term79872, term79872.getClass(), "eventLayer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.EventSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isExam", argTypes, term79872, args);
    }

};


