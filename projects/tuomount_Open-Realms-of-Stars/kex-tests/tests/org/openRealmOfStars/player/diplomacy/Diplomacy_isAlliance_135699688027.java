package org.openRealmOfStars.player.diplomacy;

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
import static org.openRealmOfStars.player.diplomacy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class Diplomacy_isAlliance_135699688027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70847;
     Object term70898;

    public Diplomacy_isAlliance_135699688027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term70851 = new ArrayList();
        ((ArrayList) term70851).add((Object)null);
        ((ArrayList) term70851).add((Object)null);
        ArrayList term70858 = new ArrayList();
        ((ArrayList) term70858).add((Object)null);
        ((ArrayList) term70858).add((Object)null);
        ((ArrayList) term70858).add((Object)null);
        ArrayList term70865 = new ArrayList();
        ((ArrayList) term70865).add((Object)null);
        ((ArrayList) term70865).add((Object)null);
        ((ArrayList) term70865).add((Object)null);
        ((ArrayList) term70865).add((Object)null);
        ((ArrayList) term70865).add((Object)null);
        ((ArrayList) term70865).add((Object)null);
        ArrayList term70872 = new ArrayList();
        ((ArrayList) term70872).add((Object)null);
        ((ArrayList) term70872).add((Object)null);
        ((ArrayList) term70872).add((Object)null);
        ((ArrayList) term70872).add((Object)null);
        ArrayList term70879 = new ArrayList();
        ((ArrayList) term70879).add((Object)null);
        ((ArrayList) term70879).add((Object)null);
        ((ArrayList) term70879).add((Object)null);
        ((ArrayList) term70879).add((Object)null);
        ((ArrayList) term70879).add((Object)null);
        ArrayList term70886 = new ArrayList();
        ((ArrayList) term70886).add((Object)null);
        ((ArrayList) term70886).add((Object)null);
        ((ArrayList) term70886).add((Object)null);
        ((ArrayList) term70886).add((Object)null);
        ArrayList term70893 = new ArrayList();
        ((ArrayList) term70893).add((Object)null);
        ((ArrayList) term70893).add((Object)null);
        ((ArrayList) term70893).add((Object)null);
        ((ArrayList) term70893).add((Object)null);
        term70847 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy"));
        Object[] term70848 = (Object[]) newArray("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList", 7);
        Object term70849 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70856 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70863 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70870 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70877 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70884 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70891 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term70849, term70849.getClass(), "playerIndex", 1780958641);
        setField(term70849, term70849.getClass(), "list", term70851);
        setIntField(term70849, term70849.getClass(), "numberOfMeetings", -1056402285);
        setElement(term70848, 0, term70849);
        setIntField(term70856, term70856.getClass(), "playerIndex", 1881803912);
        setField(term70856, term70856.getClass(), "list", term70858);
        setIntField(term70856, term70856.getClass(), "numberOfMeetings", 1176415280);
        setElement(term70848, 1, term70856);
        setIntField(term70863, term70863.getClass(), "playerIndex", -1272714687);
        setField(term70863, term70863.getClass(), "list", term70865);
        setIntField(term70863, term70863.getClass(), "numberOfMeetings", 601642248);
        setElement(term70848, 2, term70863);
        setIntField(term70870, term70870.getClass(), "playerIndex", -1186936928);
        setField(term70870, term70870.getClass(), "list", term70872);
        setIntField(term70870, term70870.getClass(), "numberOfMeetings", -315380004);
        setElement(term70848, 3, term70870);
        setIntField(term70877, term70877.getClass(), "playerIndex", -1945754843);
        setField(term70877, term70877.getClass(), "list", term70879);
        setIntField(term70877, term70877.getClass(), "numberOfMeetings", -1512221115);
        setElement(term70848, 4, term70877);
        setIntField(term70884, term70884.getClass(), "playerIndex", -515486706);
        setField(term70884, term70884.getClass(), "list", term70886);
        setIntField(term70884, term70884.getClass(), "numberOfMeetings", -612862488);
        setElement(term70848, 5, term70884);
        setIntField(term70891, term70891.getClass(), "playerIndex", 52739905);
        setField(term70891, term70891.getClass(), "list", term70893);
        setIntField(term70891, term70891.getClass(), "numberOfMeetings", -2105349391);
        setElement(term70848, 6, term70891);
        setField(term70847, term70847.getClass(), "diplomacyList", term70848);
        term70898 = new Integer(-1176968921);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term70898;
        callMethod(klass, "isAlliance", argTypes, term70847, args);
    }

};


