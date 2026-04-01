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

public class Diplomacy_getDiplomacyList_5730410506 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69944;
     Object term69988;

    public Diplomacy_getDiplomacyList_5730410506() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term69948 = new ArrayList();
        ((ArrayList) term69948).add((Object)null);
        ((ArrayList) term69948).add((Object)null);
        ((ArrayList) term69948).add((Object)null);
        ((ArrayList) term69948).add((Object)null);
        ArrayList term69955 = new ArrayList();
        ArrayList term69962 = new ArrayList();
        ((ArrayList) term69962).add((Object)null);
        ((ArrayList) term69962).add((Object)null);
        ((ArrayList) term69962).add((Object)null);
        ArrayList term69969 = new ArrayList();
        ((ArrayList) term69969).add((Object)null);
        ((ArrayList) term69969).add((Object)null);
        ((ArrayList) term69969).add((Object)null);
        ((ArrayList) term69969).add((Object)null);
        ArrayList term69976 = new ArrayList();
        ((ArrayList) term69976).add((Object)null);
        ((ArrayList) term69976).add((Object)null);
        ((ArrayList) term69976).add((Object)null);
        ((ArrayList) term69976).add((Object)null);
        ((ArrayList) term69976).add((Object)null);
        ((ArrayList) term69976).add((Object)null);
        ((ArrayList) term69976).add((Object)null);
        ((ArrayList) term69976).add((Object)null);
        ((ArrayList) term69976).add((Object)null);
        ArrayList term69983 = new ArrayList();
        ((ArrayList) term69983).add((Object)null);
        ((ArrayList) term69983).add((Object)null);
        ((ArrayList) term69983).add((Object)null);
        ((ArrayList) term69983).add((Object)null);
        term69944 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy"));
        Object[] term69945 = (Object[]) newArray("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList", 6);
        Object term69946 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term69953 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term69960 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term69967 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term69974 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term69981 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term69946, term69946.getClass(), "playerIndex", -269528550);
        setField(term69946, term69946.getClass(), "list", term69948);
        setIntField(term69946, term69946.getClass(), "numberOfMeetings", -308526089);
        setElement(term69945, 0, term69946);
        setIntField(term69953, term69953.getClass(), "playerIndex", -359675864);
        setField(term69953, term69953.getClass(), "list", term69955);
        setIntField(term69953, term69953.getClass(), "numberOfMeetings", -1671982964);
        setElement(term69945, 1, term69953);
        setIntField(term69960, term69960.getClass(), "playerIndex", 776218451);
        setField(term69960, term69960.getClass(), "list", term69962);
        setIntField(term69960, term69960.getClass(), "numberOfMeetings", -1911828505);
        setElement(term69945, 2, term69960);
        setIntField(term69967, term69967.getClass(), "playerIndex", 241725499);
        setField(term69967, term69967.getClass(), "list", term69969);
        setIntField(term69967, term69967.getClass(), "numberOfMeetings", -1470115841);
        setElement(term69945, 3, term69967);
        setIntField(term69974, term69974.getClass(), "playerIndex", 480909331);
        setField(term69974, term69974.getClass(), "list", term69976);
        setIntField(term69974, term69974.getClass(), "numberOfMeetings", -2024983877);
        setElement(term69945, 4, term69974);
        setIntField(term69981, term69981.getClass(), "playerIndex", 1757149811);
        setField(term69981, term69981.getClass(), "list", term69983);
        setIntField(term69981, term69981.getClass(), "numberOfMeetings", 1505375686);
        setElement(term69945, 5, term69981);
        setField(term69944, term69944.getClass(), "diplomacyList", term69945);
        term69988 = new Integer(-132005524);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term69988;
        callMethod(klass, "getDiplomacyList", argTypes, term69944, args);
    }

};


