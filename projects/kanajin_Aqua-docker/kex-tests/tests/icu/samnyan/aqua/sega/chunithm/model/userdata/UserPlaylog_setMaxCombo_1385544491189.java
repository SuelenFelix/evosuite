package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserPlaylog_setMaxCombo_1385544491189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276831;
     Object term276877;

    public UserPlaylog_setMaxCombo_1385544491189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276831 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term276831, term276831.getClass(), "id", 0L);
        setField(term276831, term276831.getClass(), "user", null);
        setIntField(term276831, term276831.getClass(), "orderId", 0);
        setIntField(term276831, term276831.getClass(), "sortNumber", 0);
        setIntField(term276831, term276831.getClass(), "placeId", 0);
        setField(term276831, term276831.getClass(), "playDate", null);
        setField(term276831, term276831.getClass(), "userPlayDate", null);
        setIntField(term276831, term276831.getClass(), "musicId", 0);
        setIntField(term276831, term276831.getClass(), "level", 0);
        setIntField(term276831, term276831.getClass(), "customId", 0);
        setIntField(term276831, term276831.getClass(), "playedUserId1", 0);
        setIntField(term276831, term276831.getClass(), "playedUserId2", 0);
        setIntField(term276831, term276831.getClass(), "playedUserId3", 0);
        setField(term276831, term276831.getClass(), "playedUserName1", null);
        setField(term276831, term276831.getClass(), "playedUserName2", null);
        setField(term276831, term276831.getClass(), "playedUserName3", null);
        setIntField(term276831, term276831.getClass(), "playedMusicLevel1", 0);
        setIntField(term276831, term276831.getClass(), "playedMusicLevel2", 0);
        setIntField(term276831, term276831.getClass(), "playedMusicLevel3", 0);
        setIntField(term276831, term276831.getClass(), "playedCustom1", 0);
        setIntField(term276831, term276831.getClass(), "playedCustom2", 0);
        setIntField(term276831, term276831.getClass(), "playedCustom3", 0);
        setIntField(term276831, term276831.getClass(), "track", 0);
        setIntField(term276831, term276831.getClass(), "score", 0);
        setIntField(term276831, term276831.getClass(), "rank", 0);
        setIntField(term276831, term276831.getClass(), "maxCombo", 0);
        setIntField(term276831, term276831.getClass(), "maxChain", 0);
        setIntField(term276831, term276831.getClass(), "rateTap", 0);
        setIntField(term276831, term276831.getClass(), "rateHold", 0);
        setIntField(term276831, term276831.getClass(), "rateSlide", 0);
        setIntField(term276831, term276831.getClass(), "rateAir", 0);
        setIntField(term276831, term276831.getClass(), "rateFlick", 0);
        setIntField(term276831, term276831.getClass(), "judgeGuilty", 0);
        setIntField(term276831, term276831.getClass(), "judgeAttack", 0);
        setIntField(term276831, term276831.getClass(), "judgeJustice", 0);
        setIntField(term276831, term276831.getClass(), "judgeCritical", 0);
        setIntField(term276831, term276831.getClass(), "eventId", 0);
        setIntField(term276831, term276831.getClass(), "playerRating", 0);
        setBooleanField(term276831, term276831.getClass(), "isNewRecord", false);
        setBooleanField(term276831, term276831.getClass(), "isFullCombo", false);
        setIntField(term276831, term276831.getClass(), "fullChainKind", 0);
        setBooleanField(term276831, term276831.getClass(), "isAllJustice", false);
        setBooleanField(term276831, term276831.getClass(), "isContinue", false);
        setBooleanField(term276831, term276831.getClass(), "isFreeToPlay", false);
        setIntField(term276831, term276831.getClass(), "characterId", 0);
        setIntField(term276831, term276831.getClass(), "skillId", 0);
        setIntField(term276831, term276831.getClass(), "playKind", 0);
        setBooleanField(term276831, term276831.getClass(), "isClear", false);
        setIntField(term276831, term276831.getClass(), "skillLevel", 0);
        setIntField(term276831, term276831.getClass(), "skillEffect", 0);
        setField(term276831, term276831.getClass(), "placeName", null);
        setBooleanField(term276831, term276831.getClass(), "isMaimai", false);
        term276877 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term276877;
        callMethod(klass, "setMaxCombo", argTypes, term276831, args);
    }

};


