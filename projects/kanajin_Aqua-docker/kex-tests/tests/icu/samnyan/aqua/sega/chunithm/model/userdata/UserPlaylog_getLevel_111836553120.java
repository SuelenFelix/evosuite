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

public class UserPlaylog_getLevel_111836553120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273619;

    public UserPlaylog_getLevel_111836553120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273619 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term273619, term273619.getClass(), "id", 0L);
        setField(term273619, term273619.getClass(), "user", null);
        setIntField(term273619, term273619.getClass(), "orderId", 0);
        setIntField(term273619, term273619.getClass(), "sortNumber", 0);
        setIntField(term273619, term273619.getClass(), "placeId", 0);
        setField(term273619, term273619.getClass(), "playDate", null);
        setField(term273619, term273619.getClass(), "userPlayDate", null);
        setIntField(term273619, term273619.getClass(), "musicId", 0);
        setIntField(term273619, term273619.getClass(), "level", 0);
        setIntField(term273619, term273619.getClass(), "customId", 0);
        setIntField(term273619, term273619.getClass(), "playedUserId1", 0);
        setIntField(term273619, term273619.getClass(), "playedUserId2", 0);
        setIntField(term273619, term273619.getClass(), "playedUserId3", 0);
        setField(term273619, term273619.getClass(), "playedUserName1", null);
        setField(term273619, term273619.getClass(), "playedUserName2", null);
        setField(term273619, term273619.getClass(), "playedUserName3", null);
        setIntField(term273619, term273619.getClass(), "playedMusicLevel1", 0);
        setIntField(term273619, term273619.getClass(), "playedMusicLevel2", 0);
        setIntField(term273619, term273619.getClass(), "playedMusicLevel3", 0);
        setIntField(term273619, term273619.getClass(), "playedCustom1", 0);
        setIntField(term273619, term273619.getClass(), "playedCustom2", 0);
        setIntField(term273619, term273619.getClass(), "playedCustom3", 0);
        setIntField(term273619, term273619.getClass(), "track", 0);
        setIntField(term273619, term273619.getClass(), "score", 0);
        setIntField(term273619, term273619.getClass(), "rank", 0);
        setIntField(term273619, term273619.getClass(), "maxCombo", 0);
        setIntField(term273619, term273619.getClass(), "maxChain", 0);
        setIntField(term273619, term273619.getClass(), "rateTap", 0);
        setIntField(term273619, term273619.getClass(), "rateHold", 0);
        setIntField(term273619, term273619.getClass(), "rateSlide", 0);
        setIntField(term273619, term273619.getClass(), "rateAir", 0);
        setIntField(term273619, term273619.getClass(), "rateFlick", 0);
        setIntField(term273619, term273619.getClass(), "judgeGuilty", 0);
        setIntField(term273619, term273619.getClass(), "judgeAttack", 0);
        setIntField(term273619, term273619.getClass(), "judgeJustice", 0);
        setIntField(term273619, term273619.getClass(), "judgeCritical", 0);
        setIntField(term273619, term273619.getClass(), "eventId", 0);
        setIntField(term273619, term273619.getClass(), "playerRating", 0);
        setBooleanField(term273619, term273619.getClass(), "isNewRecord", false);
        setBooleanField(term273619, term273619.getClass(), "isFullCombo", false);
        setIntField(term273619, term273619.getClass(), "fullChainKind", 0);
        setBooleanField(term273619, term273619.getClass(), "isAllJustice", false);
        setBooleanField(term273619, term273619.getClass(), "isContinue", false);
        setBooleanField(term273619, term273619.getClass(), "isFreeToPlay", false);
        setIntField(term273619, term273619.getClass(), "characterId", 0);
        setIntField(term273619, term273619.getClass(), "skillId", 0);
        setIntField(term273619, term273619.getClass(), "playKind", 0);
        setBooleanField(term273619, term273619.getClass(), "isClear", false);
        setIntField(term273619, term273619.getClass(), "skillLevel", 0);
        setIntField(term273619, term273619.getClass(), "skillEffect", 0);
        setField(term273619, term273619.getClass(), "placeName", null);
        setBooleanField(term273619, term273619.getClass(), "isMaimai", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term273619, args);
    }

};


