package org.openRealmOfStars.player.government;

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
import static org.openRealmOfStars.player.government.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Government_setRulerTitleFemale_99092867237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22331;

    public Government_setRulerTitleFemale_99092867237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22435 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term22434 = ((Class) term22435).getDeclaredField((String) "CEO_AS_A_RULER");
        ((Field) term22434).setAccessible(true);
        Object enum45 = ((Field) term22434).get((Object) null);
        ArrayList term22398 = new ArrayList();
        term22331 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term22331, term22331.getClass(), "id", "IXZCeVwvBM");
        setField(term22331, term22331.getClass(), "name", "ElTdyUVQYi");
        setField(term22331, term22331.getClass(), "rulerSelection", enum45);
        setField(term22331, term22331.getClass(), "rulerTitleMale", "KkgJnxXxVl");
        setField(term22331, term22331.getClass(), "rulerTitleFemale", "TGnzPlGFMb");
        setField(term22331, term22331.getClass(), "traits", term22398);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yEvLMSpdHy";
        callMethod(klass, "setRulerTitleFemale", argTypes, term22331, args);
    }

};


