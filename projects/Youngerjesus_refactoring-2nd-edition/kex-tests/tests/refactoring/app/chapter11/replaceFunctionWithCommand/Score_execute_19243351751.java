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
import java.lang.Object;

public class Score_execute_19243351751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55;

    public Score_execute_19243351751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55 = newInstance(Class.forName("refactoring.app.chapter11.replaceFunctionWithCommand.Score"));
        Object term56 = newInstance(Class.forName("refactoring.app.chapter11.replaceFunctionWithCommand.Candidate"));
        Object term69 = newInstance(Class.forName("refactoring.app.chapter11.replaceFunctionWithCommand.MedicalExample"));
        Object term71 = newInstance(Class.forName("refactoring.app.chapter11.replaceFunctionWithCommand.ScoringGuide"));
        setField(term56, term56.getClass(), "originalState", "MuLcgQHgqz");
        setField(term55, term55.getClass(), "candidate", term56);
        setBooleanField(term69, term69.getClass(), "isSmoker", false);
        setField(term55, term55.getClass(), "medicalExample", term69);
        setField(term55, term55.getClass(), "scoringGuide", term71);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter11.replaceFunctionWithCommand.Score");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "execute", argTypes, term55, args);
    }

};


