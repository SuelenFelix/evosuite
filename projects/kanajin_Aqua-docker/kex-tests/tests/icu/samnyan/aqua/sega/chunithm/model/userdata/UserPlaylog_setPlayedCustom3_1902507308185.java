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

public class UserPlaylog_setPlayedCustom3_1902507308185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276639;
     Object term276685;

    public UserPlaylog_setPlayedCustom3_1902507308185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276639 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term276639, term276639.getClass(), "id", 0L);
        setField(term276639, term276639.getClass(), "user", null);
        setIntField(term276639, term276639.getClass(), "orderId", 0);
        setIntField(term276639, term276639.getClass(), "sortNumber", 0);
        setIntField(term276639, term276639.getClass(), "placeId", 0);
        setField(term276639, term276639.getClass(), "playDate", null);
        setField(term276639, term276639.getClass(), "userPlayDate", null);
        setIntField(term276639, term276639.getClass(), "musicId", 0);
        setIntField(term276639, term276639.getClass(), "level", 0);
        setIntField(term276639, term276639.getClass(), "customId", 0);
        setIntField(term276639, term276639.getClass(), "playedUserId1", 0);
        setIntField(term276639, term276639.getClass(), "playedUserId2", 0);
        setIntField(term276639, term276639.getClass(), "playedUserId3", 0);
        setField(term276639, term276639.getClass(), "playedUserName1", null);
        setField(term276639, term276639.getClass(), "playedUserName2", null);
        setField(term276639, term276639.getClass(), "playedUserName3", null);
        setIntField(term276639, term276639.getClass(), "playedMusicLevel1", 0);
        setIntField(term276639, term276639.getClass(), "playedMusicLevel2", 0);
        setIntField(term276639, term276639.getClass(), "playedMusicLevel3", 0);
        setIntField(term276639, term276639.getClass(), "playedCustom1", 0);
        setIntField(term276639, term276639.getClass(), "playedCustom2", 0);
        setIntField(term276639, term276639.getClass(), "playedCustom3", 0);
        setIntField(term276639, term276639.getClass(), "track", 0);
        setIntField(term276639, term276639.getClass(), "score", 0);
        setIntField(term276639, term276639.getClass(), "rank", 0);
        setIntField(term276639, term276639.getClass(), "maxCombo", 0);
        setIntField(term276639, term276639.getClass(), "maxChain", 0);
        setIntField(term276639, term276639.getClass(), "rateTap", 0);
        setIntField(term276639, term276639.getClass(), "rateHold", 0);
        setIntField(term276639, term276639.getClass(), "rateSlide", 0);
        setIntField(term276639, term276639.getClass(), "rateAir", 0);
        setIntField(term276639, term276639.getClass(), "rateFlick", 0);
        setIntField(term276639, term276639.getClass(), "judgeGuilty", 0);
        setIntField(term276639, term276639.getClass(), "judgeAttack", 0);
        setIntField(term276639, term276639.getClass(), "judgeJustice", 0);
        setIntField(term276639, term276639.getClass(), "judgeCritical", 0);
        setIntField(term276639, term276639.getClass(), "eventId", 0);
        setIntField(term276639, term276639.getClass(), "playerRating", 0);
        setBooleanField(term276639, term276639.getClass(), "isNewRecord", false);
        setBooleanField(term276639, term276639.getClass(), "isFullCombo", false);
        setIntField(term276639, term276639.getClass(), "fullChainKind", 0);
        setBooleanField(term276639, term276639.getClass(), "isAllJustice", false);
        setBooleanField(term276639, term276639.getClass(), "isContinue", false);
        setBooleanField(term276639, term276639.getClass(), "isFreeToPlay", false);
        setIntField(term276639, term276639.getClass(), "characterId", 0);
        setIntField(term276639, term276639.getClass(), "skillId", 0);
        setIntField(term276639, term276639.getClass(), "playKind", 0);
        setBooleanField(term276639, term276639.getClass(), "isClear", false);
        setIntField(term276639, term276639.getClass(), "skillLevel", 0);
        setIntField(term276639, term276639.getClass(), "skillEffect", 0);
        setField(term276639, term276639.getClass(), "placeName", null);
        setBooleanField(term276639, term276639.getClass(), "isMaimai", false);
        term276685 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term276685;
        callMethod(klass, "setPlayedCustom3", argTypes, term276639, args);
    }

};


