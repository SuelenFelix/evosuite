package refactoring.app.chapter11.replaceFunctionWithCommand;

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
import static refactoring.app.chapter11.replaceFunctionWithCommand.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Score_execute_19243351753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82;

    public Score_execute_19243351753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82 = newInstance(Class.forName("refactoring.app.chapter11.replaceFunctionWithCommand.Score"));
        setField(term82, term82.getClass(), "candidate", null);
        setField(term82, term82.getClass(), "medicalExample", null);
        setField(term82, term82.getClass(), "scoringGuide", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter11.replaceFunctionWithCommand.Score");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "execute", argTypes, term82, args);
    }

};


