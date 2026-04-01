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

public class AssignmentSelf_setQuestion_174977389839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109633;

    public AssignmentSelf_setQuestion_174977389839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109633 = newInstance(Class.forName("core.task.self.AssignmentSelf"));
        setField(term109633, term109633.getClass(), "courseName", null);
        setField(term109633, term109633.getClass(), "question", null);
        setBooleanField(term109633, term109633.getClass(), "isGroup", false);
        setBooleanField(term109633, term109633.getClass(), "isOn", false);
        setField(term109633, term109633.getClass(), "modeOfSubmission", null);
        setField(term109633, term109633.getClass(), "startDate", null);
        setField(term109633, term109633.getClass(), "deadLine", null);
        setField(term109633, term109633.getClass(), "dateSubmitted", null);
        setField(term109633, term109633.getClass(), "timer", null);
        setField(term109633, term109633.getClass(), "members", null);
        setBooleanField(term109633, term109633.getClass(), "eveIsAlerted", false);
        setBooleanField(term109633, term109633.getClass(), "submissionIsAlerted", false);
        setField(term109633, term109633.getClass(), "deadlineIndicator", null);
        setField(term109633, term109633.getClass(), "groupLabel", null);
        setField(term109633, term109633.getClass(), "deadlineEditor", null);
        setField(term109633, term109633.getClass(), "assignmentExhibitor", null);
        setField(term109633, term109633.getClass(), "assignmentPanel", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setQuestion", argTypes, term109633, args);
    }

};


