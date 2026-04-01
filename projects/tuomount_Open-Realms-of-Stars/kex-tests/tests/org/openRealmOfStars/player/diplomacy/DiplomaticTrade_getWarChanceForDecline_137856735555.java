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
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;

public class DiplomaticTrade_getWarChanceForDecline_137856735555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum866;
     Object enum867;
     Object term302782;
     Object term302784;

    public DiplomaticTrade_getWarChanceForDecline_137856735555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term302787 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Field term302786 = ((Class) term302787).getDeclaredField((String) "TRADE");
        ((Field) term302786).setAccessible(true);
        enum866 = ((Field) term302786).get((Object) null);
        Class<? extends Object> term303094 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term303093 = ((Class) term303094).getDeclaredField((String) "MILITARISTIC");
        ((Field) term303093).setAccessible(true);
        enum867 = ((Field) term303093).get((Object) null);
        term302782 = new Integer(1920948808);
        term302784 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.diplomacy.Attitude");
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = enum866;
        args[1] = enum867;
        args[2] = term302782;
        args[3] = term302784;
        callMethod(klass, "getWarChanceForDecline", argTypes, null, args);
    }

};


