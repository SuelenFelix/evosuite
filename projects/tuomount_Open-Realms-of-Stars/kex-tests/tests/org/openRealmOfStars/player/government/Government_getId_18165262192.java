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

public class Government_getId_18165262192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5962;

    public Government_getId_18165262192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6072 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term6071 = ((Class) term6072).getDeclaredField((String) "ELECTION_TYPE1");
        ((Field) term6071).setAccessible(true);
        Object enum10 = ((Field) term6071).get((Object) null);
        ArrayList term6036 = new ArrayList();
        ((ArrayList) term6036).add((Object)null);
        ((ArrayList) term6036).add((Object)null);
        Object term6031 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term6031, term6031.getClass(), "traitId", "");
        setField(term6031, term6031.getClass(), "traitName", "");
        setField(term6031, term6031.getClass(), "description", "");
        setField(term6031, term6031.getClass(), "group", "");
        setField(term6031, term6031.getClass(), "conflictsWithIds", term6036);
        setByteField(term6031, term6031.getClass(), "traitPoints", (byte) 118);
        ArrayList term6045 = new ArrayList();
        ((ArrayList) term6045).add((Object)null);
        Object term6040 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term6040, term6040.getClass(), "traitId", "");
        setField(term6040, term6040.getClass(), "traitName", "");
        setField(term6040, term6040.getClass(), "description", "");
        setField(term6040, term6040.getClass(), "group", "");
        setField(term6040, term6040.getClass(), "conflictsWithIds", term6045);
        setByteField(term6040, term6040.getClass(), "traitPoints", (byte) 106);
        ArrayList term6029 = new ArrayList();
        ((ArrayList) term6029).add(term6031);
        ((ArrayList) term6029).add(term6040);
        term5962 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term5962, term5962.getClass(), "id", "CKWpJaaaxX");
        setField(term5962, term5962.getClass(), "name", "UBRmXJmfrt");
        setField(term5962, term5962.getClass(), "rulerSelection", enum10);
        setField(term5962, term5962.getClass(), "rulerTitleMale", "WZzvmIHhzZ");
        setField(term5962, term5962.getClass(), "rulerTitleFemale", "doQLHkjpNm");
        setField(term5962, term5962.getClass(), "traits", term6029);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term5962, args);
    }

};


