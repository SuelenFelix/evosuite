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

public class Diplomacy_getCasusBelliReason_185536115124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70709;
     Object term70760;

    public Diplomacy_getCasusBelliReason_185536115124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term70713 = new ArrayList();
        ((ArrayList) term70713).add((Object)null);
        ArrayList term70720 = new ArrayList();
        ((ArrayList) term70720).add((Object)null);
        ((ArrayList) term70720).add((Object)null);
        ((ArrayList) term70720).add((Object)null);
        ((ArrayList) term70720).add((Object)null);
        ((ArrayList) term70720).add((Object)null);
        ArrayList term70727 = new ArrayList();
        ((ArrayList) term70727).add((Object)null);
        ((ArrayList) term70727).add((Object)null);
        ((ArrayList) term70727).add((Object)null);
        ((ArrayList) term70727).add((Object)null);
        ((ArrayList) term70727).add((Object)null);
        ((ArrayList) term70727).add((Object)null);
        ((ArrayList) term70727).add((Object)null);
        ((ArrayList) term70727).add((Object)null);
        ArrayList term70734 = new ArrayList();
        ((ArrayList) term70734).add((Object)null);
        ((ArrayList) term70734).add((Object)null);
        ((ArrayList) term70734).add((Object)null);
        ((ArrayList) term70734).add((Object)null);
        ((ArrayList) term70734).add((Object)null);
        ((ArrayList) term70734).add((Object)null);
        ((ArrayList) term70734).add((Object)null);
        ArrayList term70741 = new ArrayList();
        ((ArrayList) term70741).add((Object)null);
        ((ArrayList) term70741).add((Object)null);
        ((ArrayList) term70741).add((Object)null);
        ((ArrayList) term70741).add((Object)null);
        ((ArrayList) term70741).add((Object)null);
        ((ArrayList) term70741).add((Object)null);
        ((ArrayList) term70741).add((Object)null);
        ((ArrayList) term70741).add((Object)null);
        ArrayList term70748 = new ArrayList();
        ((ArrayList) term70748).add((Object)null);
        ((ArrayList) term70748).add((Object)null);
        ArrayList term70755 = new ArrayList();
        ((ArrayList) term70755).add((Object)null);
        ((ArrayList) term70755).add((Object)null);
        ((ArrayList) term70755).add((Object)null);
        ((ArrayList) term70755).add((Object)null);
        ((ArrayList) term70755).add((Object)null);
        ((ArrayList) term70755).add((Object)null);
        ((ArrayList) term70755).add((Object)null);
        ((ArrayList) term70755).add((Object)null);
        term70709 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy"));
        Object[] term70710 = (Object[]) newArray("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList", 7);
        Object term70711 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70718 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70725 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70732 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70739 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70746 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70753 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term70711, term70711.getClass(), "playerIndex", 609697271);
        setField(term70711, term70711.getClass(), "list", term70713);
        setIntField(term70711, term70711.getClass(), "numberOfMeetings", 2007404429);
        setElement(term70710, 0, term70711);
        setIntField(term70718, term70718.getClass(), "playerIndex", 472580433);
        setField(term70718, term70718.getClass(), "list", term70720);
        setIntField(term70718, term70718.getClass(), "numberOfMeetings", -2111772603);
        setElement(term70710, 1, term70718);
        setIntField(term70725, term70725.getClass(), "playerIndex", 637942911);
        setField(term70725, term70725.getClass(), "list", term70727);
        setIntField(term70725, term70725.getClass(), "numberOfMeetings", -1613074612);
        setElement(term70710, 2, term70725);
        setIntField(term70732, term70732.getClass(), "playerIndex", 1054908502);
        setField(term70732, term70732.getClass(), "list", term70734);
        setIntField(term70732, term70732.getClass(), "numberOfMeetings", -1226802566);
        setElement(term70710, 3, term70732);
        setIntField(term70739, term70739.getClass(), "playerIndex", 1162813858);
        setField(term70739, term70739.getClass(), "list", term70741);
        setIntField(term70739, term70739.getClass(), "numberOfMeetings", 494596414);
        setElement(term70710, 4, term70739);
        setIntField(term70746, term70746.getClass(), "playerIndex", 1226377461);
        setField(term70746, term70746.getClass(), "list", term70748);
        setIntField(term70746, term70746.getClass(), "numberOfMeetings", -1540486514);
        setElement(term70710, 5, term70746);
        setIntField(term70753, term70753.getClass(), "playerIndex", 1471031478);
        setField(term70753, term70753.getClass(), "list", term70755);
        setIntField(term70753, term70753.getClass(), "numberOfMeetings", -334716487);
        setElement(term70710, 6, term70753);
        setField(term70709, term70709.getClass(), "diplomacyList", term70710);
        term70760 = new Integer(-1739012814);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term70760;
        callMethod(klass, "getCasusBelliReason", argTypes, term70709, args);
    }

};


