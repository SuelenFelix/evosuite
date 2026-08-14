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

public class AndPrerequisite_hashCode_12012236282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132;

    public AndPrerequisite_hashCode_12012236282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term133 = new ArrayList();
        ((ArrayList) term133).add((Object)null);
        ((ArrayList) term133).add((Object)null);
        ((ArrayList) term133).add((Object)null);
        ((ArrayList) term133).add((Object)null);
        ((ArrayList) term133).add((Object)null);
        ((ArrayList) term133).add((Object)null);
        term132 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.prerequisite.AndPrerequisite"));
        setField(term132, term132.getClass(), "terms", term133);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.dto.prerequisite.AndPrerequisite");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term132, args);
    }

};


