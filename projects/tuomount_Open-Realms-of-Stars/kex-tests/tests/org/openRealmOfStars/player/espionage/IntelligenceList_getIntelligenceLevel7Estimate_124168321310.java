package org.openRealmOfStars.player.espionage;

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
import static org.openRealmOfStars.player.espionage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class IntelligenceList_getIntelligenceLevel7Estimate_124168321310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7855;

    public IntelligenceList_getIntelligenceLevel7Estimate_124168321310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7892 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term7891 = ((Class) term7892).getDeclaredField((String) "NEGOTIATOR");
        ((Field) term7891).setAccessible(true);
        Object enum23 = ((Field) term7891).get((Object) null);
        Object term7863 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term7863, term7863.getClass(), "type", enum23);
        setIntField(term7863, term7863.getClass(), "value", 1090617576);
        setField(term7863, term7863.getClass(), "description", "");
        Class<? extends Object> term8224 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term8223 = ((Class) term8224).getDeclaredField((String) "TRADE");
        ((Field) term8223).setAccessible(true);
        Object enum24 = ((Field) term8223).get((Object) null);
        Object term7868 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term7868, term7868.getClass(), "type", enum24);
        setIntField(term7868, term7868.getClass(), "value", -1547384488);
        setField(term7868, term7868.getClass(), "description", "");
        Class<? extends Object> term8541 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term8540 = ((Class) term8541).getDeclaredField((String) "NEGOTIATOR");
        ((Field) term8540).setAccessible(true);
        Object enum25 = ((Field) term8540).get((Object) null);
        Object term7873 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term7873, term7873.getClass(), "type", enum25);
        setIntField(term7873, term7873.getClass(), "value", 1442160736);
        setField(term7873, term7873.getClass(), "description", "");
        Class<? extends Object> term8873 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term8872 = ((Class) term8873).getDeclaredField((String) "SPY_FLEET");
        ((Field) term8872).setAccessible(true);
        Object enum26 = ((Field) term8872).get((Object) null);
        Object term7878 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term7878, term7878.getClass(), "type", enum26);
        setIntField(term7878, term7878.getClass(), "value", 1114000454);
        setField(term7878, term7878.getClass(), "description", "");
        Object term7883 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term7883, term7883.getClass(), "type", enum23);
        setIntField(term7883, term7883.getClass(), "value", -556405712);
        setField(term7883, term7883.getClass(), "description", "");
        Object term7886 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term7886, term7886.getClass(), "type", enum26);
        setIntField(term7886, term7886.getClass(), "value", -1772434990);
        setField(term7886, term7886.getClass(), "description", "");
        ArrayList term7861 = new ArrayList();
        ((ArrayList) term7861).add(term7863);
        ((ArrayList) term7861).add(term7868);
        ((ArrayList) term7861).add(term7873);
        ((ArrayList) term7861).add(term7878);
        ((ArrayList) term7861).add(term7883);
        ((ArrayList) term7861).add(term7886);
        term7855 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        setIntField(term7855, term7855.getClass(), "playerIndex", 972867650);
        setIntField(term7855, term7855.getClass(), "intelligenceLevel1Estimate", 1655935355);
        setIntField(term7855, term7855.getClass(), "intelligenceLevel3Estimate", -481533957);
        setIntField(term7855, term7855.getClass(), "intelligenceLevel5Estimate", 1240914516);
        setIntField(term7855, term7855.getClass(), "intelligenceLevel7Estimate", -1465035361);
        setField(term7855, term7855.getClass(), "list", term7861);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIntelligenceLevel7Estimate", argTypes, term7855, args);
    }

};


