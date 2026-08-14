package org.openapijsonschematools.codegen.generatorrunner.ignore.rules;

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
import static org.openapijsonschematools.codegen.generatorrunner.ignore.rules.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class EverythingRule_getExcludeOperation_11594900662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12933;

    public EverythingRule_getExcludeOperation_11594900662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12989 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term12988 = ((Class) term12989).getDeclaredField((String) "NEGATE");
        ((Field) term12988).setAccessible(true);
        Object enum25 = ((Field) term12988).get((Object) null);
        Object term12948 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term12948, term12948.getClass(), "token", enum25);
        setField(term12948, term12948.getClass(), "value", "");
        Class<? extends Object> term13444 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term13443 = ((Class) term13444).getDeclaredField((String) "ROOTED_MARKER");
        ((Field) term13443).setAccessible(true);
        Object enum26 = ((Field) term13443).get((Object) null);
        Object term12952 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term12952, term12952.getClass(), "token", enum26);
        setField(term12952, term12952.getClass(), "value", "");
        Class<? extends Object> term13920 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term13919 = ((Class) term13920).getDeclaredField((String) "COMMENT");
        ((Field) term13919).setAccessible(true);
        Object enum27 = ((Field) term13919).get((Object) null);
        Object term12956 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term12956, term12956.getClass(), "token", enum27);
        setField(term12956, term12956.getClass(), "value", "");
        Object term12960 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term12960, term12960.getClass(), "token", enum27);
        setField(term12960, term12960.getClass(), "value", "");
        Class<? extends Object> term14378 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term14377 = ((Class) term14378).getDeclaredField((String) "MATCH_ANY");
        ((Field) term14377).setAccessible(true);
        Object enum28 = ((Field) term14377).get((Object) null);
        Object term12962 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term12962, term12962.getClass(), "token", enum28);
        setField(term12962, term12962.getClass(), "value", "");
        Class<? extends Object> term14842 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term14841 = ((Class) term14842).getDeclaredField((String) "PATH_DELIM");
        ((Field) term14841).setAccessible(true);
        Object enum29 = ((Field) term14841).get((Object) null);
        Object term12966 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term12966, term12966.getClass(), "token", enum29);
        setField(term12966, term12966.getClass(), "value", "");
        Object term12970 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term12970, term12970.getClass(), "token", enum25);
        setField(term12970, term12970.getClass(), "value", "");
        Class<? extends Object> term15309 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term15308 = ((Class) term15309).getDeclaredField((String) "NEGATE");
        ((Field) term15308).setAccessible(true);
        Object enum30 = ((Field) term15308).get((Object) null);
        Object term12972 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term12972, term12972.getClass(), "token", enum30);
        setField(term12972, term12972.getClass(), "value", "");
        ArrayList term12946 = new ArrayList();
        ((ArrayList) term12946).add(term12948);
        ((ArrayList) term12946).add(term12952);
        ((ArrayList) term12946).add(term12956);
        ((ArrayList) term12946).add(term12960);
        ((ArrayList) term12946).add(term12962);
        ((ArrayList) term12946).add(term12966);
        ((ArrayList) term12946).add(term12970);
        ((ArrayList) term12946).add(term12972);
        term12933 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.EverythingRule"));
        setField(term12933, term12933.getClass(), "definition", "onpbIeEKoi");
        setField(term12933, term12933.getClass(), "syntax", term12946);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.EverythingRule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExcludeOperation", argTypes, term12933, args);
    }

};


