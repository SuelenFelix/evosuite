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

public class TechListForLevel_isTech_11219543973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196648;

    public TechListForLevel_isTech_11219543973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term196738 = Class.forName((String) "org.openRealmOfStars.player.tech.TechType");
        Field term196737 = ((Class) term196738).getDeclaredField((String) "Defense");
        ((Field) term196737).setAccessible(true);
        Object enum593 = ((Field) term196737).get((Object) null);
        Object term196651 = newInstance(Class.forName("org.openRealmOfStars.player.tech.Tech"));
        Object term196661 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object[] term196665 = (Object[]) newArray("org.openRealmOfStars.player.race.SpaceRace", 7);
        setField(term196651, term196651.getClass(), "name", "");
        setField(term196651, term196651.getClass(), "type", enum593);
        setIntField(term196651, term196651.getClass(), "level", -608830309);
        setField(term196651, term196651.getClass(), "component", "");
        setField(term196651, term196651.getClass(), "improvement", "");
        setField(term196651, term196651.getClass(), "hull", "");
        setBooleanField(term196651, term196651.getClass(), "rareTech", true);
        setIntField(term196651, term196651.getClass(), "nextTechLevel", -537786484);
        setField(term196661, term196661.getClass(), "img", null);
        setField(term196661, term196661.getClass(), "name", null);
        setIntField(term196661, term196661.getClass(), "index", -1092883950);
        setField(term196651, term196651.getClass(), "icon", term196661);
        setBooleanField(term196651, term196651.getClass(), "tradeable", false);
        setBooleanField(term196651, term196651.getClass(), "excludeList", false);
        setField(term196651, term196651.getClass(), "spaceRaces", term196665);
        Class<? extends Object> term196971 = Class.forName((String) "org.openRealmOfStars.player.tech.TechType");
        Field term196970 = ((Class) term196971).getDeclaredField((String) "Defense");
        ((Field) term196970).setAccessible(true);
        Object enum594 = ((Field) term196970).get((Object) null);
        Object term196666 = newInstance(Class.forName("org.openRealmOfStars.player.tech.Tech"));
        Object term196676 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object[] term196680 = (Object[]) newArray("org.openRealmOfStars.player.race.SpaceRace", 5);
        setField(term196666, term196666.getClass(), "name", "");
        setField(term196666, term196666.getClass(), "type", enum594);
        setIntField(term196666, term196666.getClass(), "level", 434914590);
        setField(term196666, term196666.getClass(), "component", "");
        setField(term196666, term196666.getClass(), "improvement", "");
        setField(term196666, term196666.getClass(), "hull", "");
        setBooleanField(term196666, term196666.getClass(), "rareTech", false);
        setIntField(term196666, term196666.getClass(), "nextTechLevel", 1983756621);
        setField(term196676, term196676.getClass(), "img", null);
        setField(term196676, term196676.getClass(), "name", null);
        setIntField(term196676, term196676.getClass(), "index", -1641244494);
        setField(term196666, term196666.getClass(), "icon", term196676);
        setBooleanField(term196666, term196666.getClass(), "tradeable", true);
        setBooleanField(term196666, term196666.getClass(), "excludeList", false);
        setField(term196666, term196666.getClass(), "spaceRaces", term196680);
        Class<? extends Object> term197204 = Class.forName((String) "org.openRealmOfStars.player.tech.TechType");
        Field term197203 = ((Class) term197204).getDeclaredField((String) "Hulls");
        ((Field) term197203).setAccessible(true);
        Object enum595 = ((Field) term197203).get((Object) null);
        Object term196681 = newInstance(Class.forName("org.openRealmOfStars.player.tech.Tech"));
        Object term196691 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object[] term196695 = (Object[]) newArray("org.openRealmOfStars.player.race.SpaceRace", 7);
        setField(term196681, term196681.getClass(), "name", "");
        setField(term196681, term196681.getClass(), "type", enum595);
        setIntField(term196681, term196681.getClass(), "level", 1124282188);
        setField(term196681, term196681.getClass(), "component", "");
        setField(term196681, term196681.getClass(), "improvement", "");
        setField(term196681, term196681.getClass(), "hull", "");
        setBooleanField(term196681, term196681.getClass(), "rareTech", false);
        setIntField(term196681, term196681.getClass(), "nextTechLevel", -489441521);
        setField(term196691, term196691.getClass(), "img", null);
        setField(term196691, term196691.getClass(), "name", null);
        setIntField(term196691, term196691.getClass(), "index", 225873732);
        setField(term196681, term196681.getClass(), "icon", term196691);
        setBooleanField(term196681, term196681.getClass(), "tradeable", true);
        setBooleanField(term196681, term196681.getClass(), "excludeList", false);
        setField(term196681, term196681.getClass(), "spaceRaces", term196695);
        Object term196696 = newInstance(Class.forName("org.openRealmOfStars.player.tech.Tech"));
        Object term196704 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object[] term196708 = (Object[]) newArray("org.openRealmOfStars.player.race.SpaceRace", 1);
        setField(term196696, term196696.getClass(), "name", "");
        setField(term196696, term196696.getClass(), "type", enum593);
        setIntField(term196696, term196696.getClass(), "level", 529879356);
        setField(term196696, term196696.getClass(), "component", "");
        setField(term196696, term196696.getClass(), "improvement", "");
        setField(term196696, term196696.getClass(), "hull", "");
        setBooleanField(term196696, term196696.getClass(), "rareTech", true);
        setIntField(term196696, term196696.getClass(), "nextTechLevel", 18072182);
        setField(term196704, term196704.getClass(), "img", null);
        setField(term196704, term196704.getClass(), "name", null);
        setIntField(term196704, term196704.getClass(), "index", 1544768934);
        setField(term196696, term196696.getClass(), "icon", term196704);
        setBooleanField(term196696, term196696.getClass(), "tradeable", true);
        setBooleanField(term196696, term196696.getClass(), "excludeList", false);
        setField(term196696, term196696.getClass(), "spaceRaces", term196708);
        Object term196709 = newInstance(Class.forName("org.openRealmOfStars.player.tech.Tech"));
        Object term196717 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object[] term196721 = (Object[]) newArray("org.openRealmOfStars.player.race.SpaceRace", 4);
        setField(term196709, term196709.getClass(), "name", "");
        setField(term196709, term196709.getClass(), "type", enum595);
        setIntField(term196709, term196709.getClass(), "level", -383508597);
        setField(term196709, term196709.getClass(), "component", "");
        setField(term196709, term196709.getClass(), "improvement", "");
        setField(term196709, term196709.getClass(), "hull", "");
        setBooleanField(term196709, term196709.getClass(), "rareTech", false);
        setIntField(term196709, term196709.getClass(), "nextTechLevel", -819372164);
        setField(term196717, term196717.getClass(), "img", null);
        setField(term196717, term196717.getClass(), "name", null);
        setIntField(term196717, term196717.getClass(), "index", 958132675);
        setField(term196709, term196709.getClass(), "icon", term196717);
        setBooleanField(term196709, term196709.getClass(), "tradeable", true);
        setBooleanField(term196709, term196709.getClass(), "excludeList", true);
        setField(term196709, term196709.getClass(), "spaceRaces", term196721);
        ArrayList term196649 = new ArrayList();
        ((ArrayList) term196649).add(term196651);
        ((ArrayList) term196649).add(term196666);
        ((ArrayList) term196649).add(term196681);
        ((ArrayList) term196649).add(term196696);
        ((ArrayList) term196649).add(term196709);
        term196648 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechListForLevel"));
        setField(term196648, term196648.getClass(), "techList", term196649);
        setIntField(term196648, term196648.getClass(), "level", -689879283);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.TechListForLevel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TokIIKaqkw";
        callMethod(klass, "isTech", argTypes, term196648, args);
    }

};


