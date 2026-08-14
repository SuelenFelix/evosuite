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

public class OrPrerequisite_equals_8828599791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9;
     Object term14;

    public OrPrerequisite_equals_8828599791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10 = new ArrayList();
        ((ArrayList) term10).add((Object)null);
        ((ArrayList) term10).add((Object)null);
        ((ArrayList) term10).add((Object)null);
        ((ArrayList) term10).add((Object)null);
        ((ArrayList) term10).add((Object)null);
        ((ArrayList) term10).add((Object)null);
        ((ArrayList) term10).add((Object)null);
        ((ArrayList) term10).add((Object)null);
        ((ArrayList) term10).add((Object)null);
        term9 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.prerequisite.OrPrerequisite"));
        setField(term9, term9.getClass(), "terms", term10);
        term14 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.dto.prerequisite.OrPrerequisite");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term14;
        callMethod(klass, "equals", argTypes, term9, args);
    }

};


