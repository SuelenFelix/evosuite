package cn.edu.sustech.cs307.dto.prerequisite;

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
import static cn.edu.sustech.cs307.dto.prerequisite.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class OrPrerequisite_when_1210555507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27;

    public OrPrerequisite_when_1210555507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.prerequisite.OrPrerequisite"));
        setField(term27, term27.getClass(), "terms", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.dto.prerequisite.OrPrerequisite");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("cn.edu.sustech.cs307.dto.prerequisite.Prerequisite$Cases");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "when", argTypes, term27, args);
    }

};


