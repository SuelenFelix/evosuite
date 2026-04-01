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

public class Government_getTradeBonus_48840846411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10212;

    public Government_getTradeBonus_48840846411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10331 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term10330 = ((Class) term10331).getDeclaredField((String) "HEIR_TO_THRONE");
        ((Field) term10330).setAccessible(true);
        Object enum19 = ((Field) term10330).get((Object) null);
        ArrayList term10286 = new ArrayList();
        ((ArrayList) term10286).add((Object)null);
        ((ArrayList) term10286).add((Object)null);
        ((ArrayList) term10286).add((Object)null);
        ((ArrayList) term10286).add((Object)null);
        ((ArrayList) term10286).add((Object)null);
        ((ArrayList) term10286).add((Object)null);
        ((ArrayList) term10286).add((Object)null);
        ((ArrayList) term10286).add((Object)null);
        Object term10281 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term10281, term10281.getClass(), "traitId", "");
        setField(term10281, term10281.getClass(), "traitName", "");
        setField(term10281, term10281.getClass(), "description", "");
        setField(term10281, term10281.getClass(), "group", "");
        setField(term10281, term10281.getClass(), "conflictsWithIds", term10286);
        setByteField(term10281, term10281.getClass(), "traitPoints", (byte) -81);
        ArrayList term10295 = new ArrayList();
        ((ArrayList) term10295).add((Object)null);
        ((ArrayList) term10295).add((Object)null);
        ((ArrayList) term10295).add((Object)null);
        ((ArrayList) term10295).add((Object)null);
        ((ArrayList) term10295).add((Object)null);
        ((ArrayList) term10295).add((Object)null);
        ((ArrayList) term10295).add((Object)null);
        ((ArrayList) term10295).add((Object)null);
        Object term10290 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term10290, term10290.getClass(), "traitId", "");
        setField(term10290, term10290.getClass(), "traitName", "");
        setField(term10290, term10290.getClass(), "description", "");
        setField(term10290, term10290.getClass(), "group", "");
        setField(term10290, term10290.getClass(), "conflictsWithIds", term10295);
        setByteField(term10290, term10290.getClass(), "traitPoints", (byte) 102);
        ArrayList term10304 = new ArrayList();
        ((ArrayList) term10304).add((Object)null);
        Object term10299 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term10299, term10299.getClass(), "traitId", "");
        setField(term10299, term10299.getClass(), "traitName", "");
        setField(term10299, term10299.getClass(), "description", "");
        setField(term10299, term10299.getClass(), "group", "");
        setField(term10299, term10299.getClass(), "conflictsWithIds", term10304);
        setByteField(term10299, term10299.getClass(), "traitPoints", (byte) -118);
        ArrayList term10279 = new ArrayList();
        ((ArrayList) term10279).add(term10281);
        ((ArrayList) term10279).add(term10290);
        ((ArrayList) term10279).add(term10299);
        term10212 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term10212, term10212.getClass(), "id", "NWldOLAbqk");
        setField(term10212, term10212.getClass(), "name", "qnYaYSpDwO");
        setField(term10212, term10212.getClass(), "rulerSelection", enum19);
        setField(term10212, term10212.getClass(), "rulerTitleMale", "dgbFDCdHtj");
        setField(term10212, term10212.getClass(), "rulerTitleFemale", "EKpdCBubDE");
        setField(term10212, term10212.getClass(), "traits", term10279);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTradeBonus", argTypes, term10212, args);
    }

};


