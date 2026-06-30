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

public class Example_score_16593377921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term15;
     Object term17;

    public Example_score_16593377921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("refactoring.app.chapter11.replaceFunctionWithCommand.Example"));
        term2 = newInstance(Class.forName("refactoring.app.chapter11.replaceFunctionWithCommand.Candidate"));
        setField(term2, term2.getClass(), "originalState", "PAEBtnZtTD");
        term15 = newInstance(Class.forName("refactoring.app.chapter11.replaceFunctionWithCommand.MedicalExample"));
        setBooleanField(term15, term15.getClass(), "isSmoker", false);
        term17 = newInstance(Class.forName("refactoring.app.chapter11.replaceFunctionWithCommand.ScoringGuide"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter11.replaceFunctionWithCommand.Example");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("refactoring.app.chapter11.replaceFunctionWithCommand.Candidate");
        argTypes[1] = Class.forName("refactoring.app.chapter11.replaceFunctionWithCommand.MedicalExample");
        argTypes[2] = Class.forName("refactoring.app.chapter11.replaceFunctionWithCommand.ScoringGuide");
        Object[] args = new Object[3];
        args[0] = term2;
        args[1] = term15;
        args[2] = term17;
        callMethod(klass, "score", argTypes, term1, args);
    }

};


