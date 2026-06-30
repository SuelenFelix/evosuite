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
     Object term23652;

    public AssignmentSelf_setQuestion_174977389839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23652 = newInstance(Class.forName("core.task.self.AssignmentSelf"));
        setField(term23652, term23652.getClass(), "courseName", null);
        setField(term23652, term23652.getClass(), "question", null);
        setBooleanField(term23652, term23652.getClass(), "isGroup", false);
        setBooleanField(term23652, term23652.getClass(), "isOn", false);
        setField(term23652, term23652.getClass(), "modeOfSubmission", null);
        setField(term23652, term23652.getClass(), "startDate", null);
        setField(term23652, term23652.getClass(), "deadLine", null);
        setField(term23652, term23652.getClass(), "dateSubmitted", null);
        setField(term23652, term23652.getClass(), "timer", null);
        setField(term23652, term23652.getClass(), "members", null);
        setBooleanField(term23652, term23652.getClass(), "eveIsAlerted", false);
        setBooleanField(term23652, term23652.getClass(), "submissionIsAlerted", false);
        setField(term23652, term23652.getClass(), "deadlineIndicator", null);
        setField(term23652, term23652.getClass(), "groupLabel", null);
        setField(term23652, term23652.getClass(), "deadlineEditor", null);
        setField(term23652, term23652.getClass(), "assignmentExhibitor", null);
        setField(term23652, term23652.getClass(), "assignmentPanel", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setQuestion", argTypes, term23652, args);
    }

};


