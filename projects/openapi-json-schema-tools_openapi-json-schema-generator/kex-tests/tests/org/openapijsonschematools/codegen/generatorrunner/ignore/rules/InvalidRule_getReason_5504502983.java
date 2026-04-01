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

public class InvalidRule_getReason_5504502983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19814;

    public InvalidRule_getReason_5504502983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19898 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term19897 = ((Class) term19898).getDeclaredField((String) "NEGATE");
        ((Field) term19897).setAccessible(true);
        Object enum39 = ((Field) term19897).get((Object) null);
        Object term19841 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term19841, term19841.getClass(), "token", enum39);
        setField(term19841, term19841.getClass(), "value", "");
        Class<? extends Object> term20353 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term20352 = ((Class) term20353).getDeclaredField((String) "TEXT");
        ((Field) term20352).setAccessible(true);
        Object enum40 = ((Field) term20352).get((Object) null);
        Object term19845 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term19845, term19845.getClass(), "token", enum40);
        setField(term19845, term19845.getClass(), "value", "");
        Class<? extends Object> term20802 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term20801 = ((Class) term20802).getDeclaredField((String) "DIRECTORY_MARKER");
        ((Field) term20801).setAccessible(true);
        Object enum41 = ((Field) term20801).get((Object) null);
        Object term19849 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term19849, term19849.getClass(), "token", enum41);
        setField(term19849, term19849.getClass(), "value", "");
        Class<? extends Object> term21287 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term21286 = ((Class) term21287).getDeclaredField((String) "MATCH_ANY");
        ((Field) term21286).setAccessible(true);
        Object enum42 = ((Field) term21286).get((Object) null);
        Object term19853 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term19853, term19853.getClass(), "token", enum42);
        setField(term19853, term19853.getClass(), "value", "");
        Object term19857 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term19857, term19857.getClass(), "token", enum40);
        setField(term19857, term19857.getClass(), "value", "");
        Class<? extends Object> term21751 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term21750 = ((Class) term21751).getDeclaredField((String) "ESCAPED_SPACE");
        ((Field) term21750).setAccessible(true);
        Object enum43 = ((Field) term21750).get((Object) null);
        Object term19859 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term19859, term19859.getClass(), "token", enum43);
        setField(term19859, term19859.getClass(), "value", "");
        Class<? extends Object> term22227 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term22226 = ((Class) term22227).getDeclaredField((String) "MATCH_ANY");
        ((Field) term22226).setAccessible(true);
        Object enum44 = ((Field) term22226).get((Object) null);
        Object term19863 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term19863, term19863.getClass(), "token", enum44);
        setField(term19863, term19863.getClass(), "value", "");
        Class<? extends Object> term22691 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term22690 = ((Class) term22691).getDeclaredField((String) "ROOTED_MARKER");
        ((Field) term22690).setAccessible(true);
        Object enum45 = ((Field) term22690).get((Object) null);
        Object term19867 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term19867, term19867.getClass(), "token", enum45);
        setField(term19867, term19867.getClass(), "value", "");
        Class<? extends Object> term23167 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term23166 = ((Class) term23167).getDeclaredField((String) "PATH_DELIM");
        ((Field) term23166).setAccessible(true);
        Object enum46 = ((Field) term23166).get((Object) null);
        Object term19871 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term19871, term19871.getClass(), "token", enum46);
        setField(term19871, term19871.getClass(), "value", "");
        ArrayList term19839 = new ArrayList();
        ((ArrayList) term19839).add(term19841);
        ((ArrayList) term19839).add(term19845);
        ((ArrayList) term19839).add(term19849);
        ((ArrayList) term19839).add(term19853);
        ((ArrayList) term19839).add(term19857);
        ((ArrayList) term19839).add(term19859);
        ((ArrayList) term19839).add(term19863);
        ((ArrayList) term19839).add(term19867);
        ((ArrayList) term19839).add(term19871);
        term19814 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.InvalidRule"));
        setField(term19814, term19814.getClass(), "reason", "VgZnGoIFwQ");
        setField(term19814, term19814.getClass(), "definition", "jUbSRrkrYZ");
        setField(term19814, term19814.getClass(), "syntax", term19839);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.InvalidRule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReason", argTypes, term19814, args);
    }

};


