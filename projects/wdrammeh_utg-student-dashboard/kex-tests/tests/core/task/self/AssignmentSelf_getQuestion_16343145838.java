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

public class AssignmentSelf_getQuestion_16343145838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109628;

    public AssignmentSelf_getQuestion_16343145838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109628 = newInstance(Class.forName("core.task.self.AssignmentSelf"));
        setField(term109628, term109628.getClass(), "courseName", null);
        setField(term109628, term109628.getClass(), "question", null);
        setBooleanField(term109628, term109628.getClass(), "isGroup", false);
        setBooleanField(term109628, term109628.getClass(), "isOn", false);
        setField(term109628, term109628.getClass(), "modeOfSubmission", null);
        setField(term109628, term109628.getClass(), "startDate", null);
        setField(term109628, term109628.getClass(), "deadLine", null);
        setField(term109628, term109628.getClass(), "dateSubmitted", null);
        setField(term109628, term109628.getClass(), "timer", null);
        setField(term109628, term109628.getClass(), "members", null);
        setBooleanField(term109628, term109628.getClass(), "eveIsAlerted", false);
        setBooleanField(term109628, term109628.getClass(), "submissionIsAlerted", false);
        setField(term109628, term109628.getClass(), "deadlineIndicator", null);
        setField(term109628, term109628.getClass(), "groupLabel", null);
        setField(term109628, term109628.getClass(), "deadlineEditor", null);
        setField(term109628, term109628.getClass(), "assignmentExhibitor", null);
        setField(term109628, term109628.getClass(), "assignmentPanel", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQuestion", argTypes, term109628, args);
    }

};


