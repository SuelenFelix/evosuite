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

public class Example_score_16593377923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28;

    public Example_score_16593377923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28 = newInstance(Class.forName("refactoring.app.chapter11.replaceFunctionWithCommand.Example"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter11.replaceFunctionWithCommand.Example");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("refactoring.app.chapter11.replaceFunctionWithCommand.Candidate");
        argTypes[1] = Class.forName("refactoring.app.chapter11.replaceFunctionWithCommand.MedicalExample");
        argTypes[2] = Class.forName("refactoring.app.chapter11.replaceFunctionWithCommand.ScoringGuide");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "score", argTypes, term28, args);
    }

};


