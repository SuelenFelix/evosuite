package org.openRealmOfStars.player.tech;

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
import static org.openRealmOfStars.player.tech.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class TechListForLevel_getList_4540447306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199970;

    public TechListForLevel_getList_4540447306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term200007 = Class.forName((String) "org.openRealmOfStars.player.tech.TechType");
        Field term200006 = ((Class) term200007).getDeclaredField((String) "Combat");
        ((Field) term200006).setAccessible(true);
        Object enum605 = ((Field) term200006).get((Object) null);
        Object term199973 = newInstance(Class.forName("org.openRealmOfStars.player.tech.Tech"));
        Object term199983 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object[] term199987 = (Object[]) newArray("org.openRealmOfStars.player.race.SpaceRace", 4);
        setField(term199973, term199973.getClass(), "name", "");
        setField(term199973, term199973.getClass(), "type", enum605);
        setIntField(term199973, term199973.getClass(), "level", -2126539433);
        setField(term199973, term199973.getClass(), "component", "");
        setField(term199973, term199973.getClass(), "improvement", "");
        setField(term199973, term199973.getClass(), "hull", "");
        setBooleanField(term199973, term199973.getClass(), "rareTech", false);
        setIntField(term199973, term199973.getClass(), "nextTechLevel", 196952878);
        setField(term199983, term199983.getClass(), "img", null);
        setField(term199983, term199983.getClass(), "name", null);
        setIntField(term199983, term199983.getClass(), "index", -1825624890);
        setField(term199973, term199973.getClass(), "icon", term199983);
        setBooleanField(term199973, term199973.getClass(), "tradeable", false);
        setBooleanField(term199973, term199973.getClass(), "excludeList", true);
        setField(term199973, term199973.getClass(), "spaceRaces", term199987);
        Class<? extends Object> term200237 = Class.forName((String) "org.openRealmOfStars.player.tech.TechType");
        Field term200236 = ((Class) term200237).getDeclaredField((String) "Electrics");
        ((Field) term200236).setAccessible(true);
        Object enum606 = ((Field) term200236).get((Object) null);
        Object term199988 = newInstance(Class.forName("org.openRealmOfStars.player.tech.Tech"));
        Object term199998 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object[] term200002 = (Object[]) newArray("org.openRealmOfStars.player.race.SpaceRace", 4);
        setField(term199988, term199988.getClass(), "name", "");
        setField(term199988, term199988.getClass(), "type", enum606);
        setIntField(term199988, term199988.getClass(), "level", -1784072578);
        setField(term199988, term199988.getClass(), "component", "");
        setField(term199988, term199988.getClass(), "improvement", "");
        setField(term199988, term199988.getClass(), "hull", "");
        setBooleanField(term199988, term199988.getClass(), "rareTech", true);
        setIntField(term199988, term199988.getClass(), "nextTechLevel", 2011764585);
        setField(term199998, term199998.getClass(), "img", null);
        setField(term199998, term199998.getClass(), "name", null);
        setIntField(term199998, term199998.getClass(), "index", -963198667);
        setField(term199988, term199988.getClass(), "icon", term199998);
        setBooleanField(term199988, term199988.getClass(), "tradeable", true);
        setBooleanField(term199988, term199988.getClass(), "excludeList", false);
        setField(term199988, term199988.getClass(), "spaceRaces", term200002);
        ArrayList term199971 = new ArrayList();
        ((ArrayList) term199971).add(term199973);
        ((ArrayList) term199971).add(term199988);
        term199970 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechListForLevel"));
        setField(term199970, term199970.getClass(), "techList", term199971);
        setIntField(term199970, term199970.getClass(), "level", -1007935918);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.TechListForLevel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getList", argTypes, term199970, args);
    }

};


