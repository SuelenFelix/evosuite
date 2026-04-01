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

public class Government_setRulerTitleMale_58552124936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21845;

    public Government_setRulerTitleMale_58552124936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22006 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term22005 = ((Class) term22006).getDeclaredField((String) "AI_RULER");
        ((Field) term22005).setAccessible(true);
        Object enum44 = ((Field) term22005).get((Object) null);
        ArrayList term21913 = new ArrayList();
        ((ArrayList) term21913).add((Object)null);
        ((ArrayList) term21913).add((Object)null);
        ((ArrayList) term21913).add((Object)null);
        ((ArrayList) term21913).add((Object)null);
        Object term21908 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term21908, term21908.getClass(), "traitId", "");
        setField(term21908, term21908.getClass(), "traitName", "");
        setField(term21908, term21908.getClass(), "description", "");
        setField(term21908, term21908.getClass(), "group", "");
        setField(term21908, term21908.getClass(), "conflictsWithIds", term21913);
        setByteField(term21908, term21908.getClass(), "traitPoints", (byte) -35);
        ArrayList term21922 = new ArrayList();
        ((ArrayList) term21922).add((Object)null);
        ((ArrayList) term21922).add((Object)null);
        ((ArrayList) term21922).add((Object)null);
        ((ArrayList) term21922).add((Object)null);
        ((ArrayList) term21922).add((Object)null);
        ((ArrayList) term21922).add((Object)null);
        ((ArrayList) term21922).add((Object)null);
        ((ArrayList) term21922).add((Object)null);
        Object term21917 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term21917, term21917.getClass(), "traitId", "");
        setField(term21917, term21917.getClass(), "traitName", "");
        setField(term21917, term21917.getClass(), "description", "");
        setField(term21917, term21917.getClass(), "group", "");
        setField(term21917, term21917.getClass(), "conflictsWithIds", term21922);
        setByteField(term21917, term21917.getClass(), "traitPoints", (byte) 3);
        ArrayList term21931 = new ArrayList();
        ((ArrayList) term21931).add((Object)null);
        ((ArrayList) term21931).add((Object)null);
        ((ArrayList) term21931).add((Object)null);
        ((ArrayList) term21931).add((Object)null);
        ((ArrayList) term21931).add((Object)null);
        ((ArrayList) term21931).add((Object)null);
        ((ArrayList) term21931).add((Object)null);
        ((ArrayList) term21931).add((Object)null);
        ((ArrayList) term21931).add((Object)null);
        Object term21926 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term21926, term21926.getClass(), "traitId", "");
        setField(term21926, term21926.getClass(), "traitName", "");
        setField(term21926, term21926.getClass(), "description", "");
        setField(term21926, term21926.getClass(), "group", "");
        setField(term21926, term21926.getClass(), "conflictsWithIds", term21931);
        setByteField(term21926, term21926.getClass(), "traitPoints", (byte) -10);
        ArrayList term21940 = new ArrayList();
        ((ArrayList) term21940).add((Object)null);
        Object term21935 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term21935, term21935.getClass(), "traitId", "");
        setField(term21935, term21935.getClass(), "traitName", "");
        setField(term21935, term21935.getClass(), "description", "");
        setField(term21935, term21935.getClass(), "group", "");
        setField(term21935, term21935.getClass(), "conflictsWithIds", term21940);
        setByteField(term21935, term21935.getClass(), "traitPoints", (byte) -106);
        ArrayList term21949 = new ArrayList();
        ((ArrayList) term21949).add((Object)null);
        Object term21944 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term21944, term21944.getClass(), "traitId", "");
        setField(term21944, term21944.getClass(), "traitName", "");
        setField(term21944, term21944.getClass(), "description", "");
        setField(term21944, term21944.getClass(), "group", "");
        setField(term21944, term21944.getClass(), "conflictsWithIds", term21949);
        setByteField(term21944, term21944.getClass(), "traitPoints", (byte) -124);
        ArrayList term21958 = new ArrayList();
        ((ArrayList) term21958).add((Object)null);
        ((ArrayList) term21958).add((Object)null);
        ((ArrayList) term21958).add((Object)null);
        ((ArrayList) term21958).add((Object)null);
        ((ArrayList) term21958).add((Object)null);
        ((ArrayList) term21958).add((Object)null);
        ((ArrayList) term21958).add((Object)null);
        ((ArrayList) term21958).add((Object)null);
        ((ArrayList) term21958).add((Object)null);
        Object term21953 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term21953, term21953.getClass(), "traitId", "");
        setField(term21953, term21953.getClass(), "traitName", "");
        setField(term21953, term21953.getClass(), "description", "");
        setField(term21953, term21953.getClass(), "group", "");
        setField(term21953, term21953.getClass(), "conflictsWithIds", term21958);
        setByteField(term21953, term21953.getClass(), "traitPoints", (byte) -71);
        ArrayList term21967 = new ArrayList();
        ((ArrayList) term21967).add((Object)null);
        ((ArrayList) term21967).add((Object)null);
        ((ArrayList) term21967).add((Object)null);
        ((ArrayList) term21967).add((Object)null);
        ((ArrayList) term21967).add((Object)null);
        Object term21962 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term21962, term21962.getClass(), "traitId", "");
        setField(term21962, term21962.getClass(), "traitName", "");
        setField(term21962, term21962.getClass(), "description", "");
        setField(term21962, term21962.getClass(), "group", "");
        setField(term21962, term21962.getClass(), "conflictsWithIds", term21967);
        setByteField(term21962, term21962.getClass(), "traitPoints", (byte) 113);
        ArrayList term21906 = new ArrayList();
        ((ArrayList) term21906).add(term21908);
        ((ArrayList) term21906).add(term21917);
        ((ArrayList) term21906).add(term21926);
        ((ArrayList) term21906).add(term21935);
        ((ArrayList) term21906).add(term21944);
        ((ArrayList) term21906).add(term21953);
        ((ArrayList) term21906).add(term21962);
        term21845 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term21845, term21845.getClass(), "id", "bZrrPiMnsr");
        setField(term21845, term21845.getClass(), "name", "IeromvfDmz");
        setField(term21845, term21845.getClass(), "rulerSelection", enum44);
        setField(term21845, term21845.getClass(), "rulerTitleMale", "xJLHPTRSqe");
        setField(term21845, term21845.getClass(), "rulerTitleFemale", "OIFZYdbUZz");
        setField(term21845, term21845.getClass(), "traits", term21906);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UsCZaSgXzI";
        callMethod(klass, "setRulerTitleMale", argTypes, term21845, args);
    }

};


