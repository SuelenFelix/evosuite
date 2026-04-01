package org.openRealmOfStars.player.diplomacy.speeches;

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
import static org.openRealmOfStars.player.diplomacy.speeches.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class SpeechSet_getId_21254290741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7325;

    public SpeechSet_getId_21254290741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7339 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Class<? extends Object> term7704 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Field term7703 = ((Class) term7704).getDeclaredField((String) "DECLINE_ANGER");
        ((Field) term7703).setAccessible(true);
        Object enum18 = ((Field) term7703).get((Object) null);
        Class<? extends Object> term8035 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Field term8034 = ((Class) term8035).getDeclaredField((String) "TRADE_EMBARGO");
        ((Field) term8034).setAccessible(true);
        Object enum19 = ((Field) term8034).get((Object) null);
        Class<? extends Object> term8366 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Field term8365 = ((Class) term8366).getDeclaredField((String) "OFFER_REJECTED");
        ((Field) term8365).setAccessible(true);
        Object enum20 = ((Field) term8365).get((Object) null);
        Class<? extends Object> term8700 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Field term8699 = ((Class) term8700).getDeclaredField((String) "PEACE_OFFER");
        ((Field) term8699).setAccessible(true);
        Object enum21 = ((Field) term8699).get((Object) null);
        Class<? extends Object> term9025 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Field term9024 = ((Class) term9025).getDeclaredField((String) "OFFER_REJECTED");
        ((Field) term9024).setAccessible(true);
        Object enum22 = ((Field) term9024).get((Object) null);
        Class<? extends Object> term9359 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Field term9358 = ((Class) term9359).getDeclaredField((String) "TRADE_EMBARGO_REALM_CHOICE");
        ((Field) term9358).setAccessible(true);
        Object enum23 = ((Field) term9358).get((Object) null);
        Class<? extends Object> term9729 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Field term9728 = ((Class) term9729).getDeclaredField((String) "LIKE_GREET");
        ((Field) term9728).setAccessible(true);
        Object enum24 = ((Field) term9728).get((Object) null);
        Class<? extends Object> term10051 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Field term10050 = ((Class) term10051).getDeclaredField((String) "MAKE_WAR");
        ((Field) term10050).setAccessible(true);
        Object enum25 = ((Field) term10050).get((Object) null);
        Class<? extends Object> term10367 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Field term10366 = ((Class) term10367).getDeclaredField((String) "DECLINE");
        ((Field) term10366).setAccessible(true);
        Object enum26 = ((Field) term10366).get((Object) null);
        Class<? extends Object> term10680 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Field term10679 = ((Class) term10680).getDeclaredField((String) "OFFER_REJECTED");
        ((Field) term10679).setAccessible(true);
        Object enum27 = ((Field) term10679).get((Object) null);
        Class<? extends Object> term11014 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Field term11013 = ((Class) term11014).getDeclaredField((String) "FRIENDS_GREET");
        ((Field) term11013).setAccessible(true);
        Object enum28 = ((Field) term11013).get((Object) null);
        Class<? extends Object> term11345 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Field term11344 = ((Class) term11345).getDeclaredField((String) "ASK_MOVE_FLEET");
        ((Field) term11344).setAccessible(true);
        Object enum29 = ((Field) term11344).get((Object) null);
        Class<? extends Object> term11679 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Field term11678 = ((Class) term11679).getDeclaredField((String) "ASK_PROTECTION");
        ((Field) term11678).setAccessible(true);
        Object enum30 = ((Field) term11678).get((Object) null);
        Class<? extends Object> term12013 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Field term12012 = ((Class) term12013).getDeclaredField((String) "ASK_MOVE_SPY");
        ((Field) term12012).setAccessible(true);
        Object enum31 = ((Field) term12012).get((Object) null);
        Class<? extends Object> term12341 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Field term12340 = ((Class) term12341).getDeclaredField((String) "OFFER_ACCEPTED");
        ((Field) term12340).setAccessible(true);
        Object enum32 = ((Field) term12340).get((Object) null);
        Class<? extends Object> term12675 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Field term12674 = ((Class) term12675).getDeclaredField((String) "AGREE");
        ((Field) term12674).setAccessible(true);
        Object enum33 = ((Field) term12674).get((Object) null);
        Class<? extends Object> term12982 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Field term12981 = ((Class) term12982).getDeclaredField((String) "DISLIKE_GREET");
        ((Field) term12981).setAccessible(true);
        Object enum34 = ((Field) term12981).get((Object) null);
        Class<? extends Object> term13313 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Field term13312 = ((Class) term13313).getDeclaredField((String) "PEACE_OFFER");
        ((Field) term13312).setAccessible(true);
        Object enum35 = ((Field) term13312).get((Object) null);
        Class<? extends Object> term13638 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Field term13637 = ((Class) term13638).getDeclaredField((String) "BORDER_WARS");
        ((Field) term13637).setAccessible(true);
        Object enum36 = ((Field) term13637).get((Object) null);
        Class<? extends Object> term13963 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Field term13962 = ((Class) term13963).getDeclaredField((String) "PEACE_OFFER");
        ((Field) term13962).setAccessible(true);
        Object enum37 = ((Field) term13962).get((Object) null);
        Class<? extends Object> term14288 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Field term14287 = ((Class) term14288).getDeclaredField((String) "OFFER_SPY_TRADE");
        ((Field) term14287).setAccessible(true);
        Object enum38 = ((Field) term14287).get((Object) null);
        Class<? extends Object> term14625 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Field term14624 = ((Class) term14625).getDeclaredField((String) "TRADE");
        ((Field) term14624).setAccessible(true);
        Object enum39 = ((Field) term14624).get((Object) null);
        Class<? extends Object> term14932 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Field term14931 = ((Class) term14932).getDeclaredField((String) "DECLINE_ANGER");
        ((Field) term14931).setAccessible(true);
        Object enum40 = ((Field) term14931).get((Object) null);
        Class<? extends Object> term15263 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Field term15262 = ((Class) term15263).getDeclaredField((String) "NOTHING_TO_TRADE");
        ((Field) term15262).setAccessible(true);
        Object enum41 = ((Field) term15262).get((Object) null);
        Class<? extends Object> term15603 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Field term15602 = ((Class) term15603).getDeclaredField((String) "BORDER_WARS");
        ((Field) term15602).setAccessible(true);
        Object enum42 = ((Field) term15602).get((Object) null);
        Class<? extends Object> term15928 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Field term15927 = ((Class) term15928).getDeclaredField((String) "DEFESIVE_PACT");
        ((Field) term15927).setAccessible(true);
        Object enum43 = ((Field) term15927).get((Object) null);
        Class<? extends Object> term16259 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Field term16258 = ((Class) term16259).getDeclaredField((String) "ASK_MOVE_SPY");
        ((Field) term16258).setAccessible(true);
        Object enum44 = ((Field) term16258).get((Object) null);
        Class<? extends Object> term16587 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Field term16586 = ((Class) term16587).getDeclaredField((String) "ASK_MOVE_FLEET");
        ((Field) term16586).setAccessible(true);
        Object enum45 = ((Field) term16586).get((Object) null);
        Class<? extends Object> term16921 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Field term16920 = ((Class) term16921).getDeclaredField((String) "OFFER_REJECTED");
        ((Field) term16920).setAccessible(true);
        Object enum46 = ((Field) term16920).get((Object) null);
        term7325 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.speeches.SpeechSet"));
        Object term7338 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term7519 = (Object[]) newArray("org.openRealmOfStars.player.diplomacy.speeches.SpeechType", 29);
        Object[] term7520 = (Object[]) newArray("java.lang.Object", 29);
        setField(term7325, term7325.getClass(), "spSetId", "nGKItKLYNC");
        setField(term7338, term7338.getClass(), "keyType", term7339);
        setElement(term7519, 0, enum18);
        setElement(term7519, 1, enum19);
        setElement(term7519, 2, enum20);
        setElement(term7519, 3, enum21);
        setElement(term7519, 4, enum22);
        setElement(term7519, 5, enum23);
        setElement(term7519, 6, enum24);
        setElement(term7519, 7, enum25);
        setElement(term7519, 8, enum26);
        setElement(term7519, 9, enum27);
        setElement(term7519, 10, enum28);
        setElement(term7519, 11, enum29);
        setElement(term7519, 12, enum30);
        setElement(term7519, 13, enum31);
        setElement(term7519, 14, enum32);
        setElement(term7519, 15, enum33);
        setElement(term7519, 16, enum34);
        setElement(term7519, 17, enum35);
        setElement(term7519, 18, enum36);
        setElement(term7519, 19, enum37);
        setElement(term7519, 20, enum38);
        setElement(term7519, 21, enum39);
        setElement(term7519, 22, enum40);
        setElement(term7519, 23, enum41);
        setElement(term7519, 24, enum42);
        setElement(term7519, 25, enum43);
        setElement(term7519, 26, enum44);
        setElement(term7519, 27, enum45);
        setElement(term7519, 28, enum46);
        setField(term7338, term7338.getClass(), "keyUniverse", term7519);
        setField(term7338, term7338.getClass(), "vals", term7520);
        setIntField(term7338, term7338.getClass(), "size", 0);
        setField(term7338, term7338.getClass(), "entrySet", null);
        setField(term7338, term7338.getClass(), "keySet", null);
        setField(term7338, term7338.getClass(), "values", null);
        setField(term7325, term7325.getClass(), "speechData", term7338);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.speeches.SpeechSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term7325, args);
    }

};


