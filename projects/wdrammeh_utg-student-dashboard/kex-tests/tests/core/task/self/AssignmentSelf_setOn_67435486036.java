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
import java.lang.Boolean;

public class AssignmentSelf_setOn_67435486036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109616;
     Object term109621;

    public AssignmentSelf_setOn_67435486036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109616 = newInstance(Class.forName("core.task.self.AssignmentSelf"));
        setField(term109616, term109616.getClass(), "courseName", null);
        setField(term109616, term109616.getClass(), "question", null);
        setBooleanField(term109616, term109616.getClass(), "isGroup", false);
        setBooleanField(term109616, term109616.getClass(), "isOn", false);
        setField(term109616, term109616.getClass(), "modeOfSubmission", null);
        setField(term109616, term109616.getClass(), "startDate", null);
        setField(term109616, term109616.getClass(), "deadLine", null);
        setField(term109616, term109616.getClass(), "dateSubmitted", null);
        setField(term109616, term109616.getClass(), "timer", null);
        setField(term109616, term109616.getClass(), "members", null);
        setBooleanField(term109616, term109616.getClass(), "eveIsAlerted", false);
        setBooleanField(term109616, term109616.getClass(), "submissionIsAlerted", false);
        setField(term109616, term109616.getClass(), "deadlineIndicator", null);
        setField(term109616, term109616.getClass(), "groupLabel", null);
        setField(term109616, term109616.getClass(), "deadlineEditor", null);
        setField(term109616, term109616.getClass(), "assignmentExhibitor", null);
        setField(term109616, term109616.getClass(), "assignmentPanel", null);
        term109621 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term109621;
        callMethod(klass, "setOn", argTypes, term109616, args);
    }

};


