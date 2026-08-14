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
import java.util.ArrayList;
import java.lang.Object;

public class OrPrerequisite_when_1210555503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20;

    public OrPrerequisite_when_1210555503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term21 = new ArrayList();
        ((ArrayList) term21).add((Object)null);
        ((ArrayList) term21).add((Object)null);
        ((ArrayList) term21).add((Object)null);
        ((ArrayList) term21).add((Object)null);
        term20 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.prerequisite.OrPrerequisite"));
        setField(term20, term20.getClass(), "terms", term21);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.dto.prerequisite.OrPrerequisite");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("cn.edu.sustech.cs307.dto.prerequisite.Prerequisite$Cases");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "when", argTypes, term20, args);
    }

};


