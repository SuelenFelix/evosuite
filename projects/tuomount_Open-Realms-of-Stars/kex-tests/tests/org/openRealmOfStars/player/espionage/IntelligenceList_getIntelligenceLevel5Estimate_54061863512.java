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

public class IntelligenceList_getIntelligenceLevel5Estimate_54061863512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10558;

    public IntelligenceList_getIntelligenceLevel5Estimate_54061863512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10591 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term10590 = ((Class) term10591).getDeclaredField((String) "NEGOTIATOR");
        ((Field) term10590).setAccessible(true);
        Object enum31 = ((Field) term10590).get((Object) null);
        Object term10566 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term10566, term10566.getClass(), "type", enum31);
        setIntField(term10566, term10566.getClass(), "value", 1532716628);
        setField(term10566, term10566.getClass(), "description", "");
        Class<? extends Object> term10923 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term10922 = ((Class) term10923).getDeclaredField((String) "CHATTERBOX");
        ((Field) term10922).setAccessible(true);
        Object enum32 = ((Field) term10922).get((Object) null);
        Object term10571 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term10571, term10571.getClass(), "type", enum32);
        setIntField(term10571, term10571.getClass(), "value", -1801760683);
        setField(term10571, term10571.getClass(), "description", "");
        Object term10576 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term10576, term10576.getClass(), "type", enum31);
        setIntField(term10576, term10576.getClass(), "value", 1141317871);
        setField(term10576, term10576.getClass(), "description", "");
        Object term10579 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term10579, term10579.getClass(), "type", enum32);
        setIntField(term10579, term10579.getClass(), "value", 890669485);
        setField(term10579, term10579.getClass(), "description", "");
        Object term10582 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term10582, term10582.getClass(), "type", enum32);
        setIntField(term10582, term10582.getClass(), "value", 691577392);
        setField(term10582, term10582.getClass(), "description", "");
        Object term10585 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term10585, term10585.getClass(), "type", enum32);
        setIntField(term10585, term10585.getClass(), "value", -893623680);
        setField(term10585, term10585.getClass(), "description", "");
        ArrayList term10564 = new ArrayList();
        ((ArrayList) term10564).add(term10566);
        ((ArrayList) term10564).add(term10571);
        ((ArrayList) term10564).add(term10576);
        ((ArrayList) term10564).add(term10579);
        ((ArrayList) term10564).add(term10582);
        ((ArrayList) term10564).add(term10585);
        term10558 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        setIntField(term10558, term10558.getClass(), "playerIndex", -663691365);
        setIntField(term10558, term10558.getClass(), "intelligenceLevel1Estimate", 339854490);
        setIntField(term10558, term10558.getClass(), "intelligenceLevel3Estimate", -615654495);
        setIntField(term10558, term10558.getClass(), "intelligenceLevel5Estimate", -1476117762);
        setIntField(term10558, term10558.getClass(), "intelligenceLevel7Estimate", -341962980);
        setField(term10558, term10558.getClass(), "list", term10564);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIntelligenceLevel5Estimate", argTypes, term10558, args);
    }

};


