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

public class UserPlaylog_getSkillEffect_1169956661161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275505;

    public UserPlaylog_getSkillEffect_1169956661161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term275505 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term275505, term275505.getClass(), "id", 0L);
        setField(term275505, term275505.getClass(), "user", null);
        setIntField(term275505, term275505.getClass(), "orderId", 0);
        setIntField(term275505, term275505.getClass(), "sortNumber", 0);
        setIntField(term275505, term275505.getClass(), "placeId", 0);
        setField(term275505, term275505.getClass(), "playDate", null);
        setField(term275505, term275505.getClass(), "userPlayDate", null);
        setIntField(term275505, term275505.getClass(), "musicId", 0);
        setIntField(term275505, term275505.getClass(), "level", 0);
        setIntField(term275505, term275505.getClass(), "customId", 0);
        setIntField(term275505, term275505.getClass(), "playedUserId1", 0);
        setIntField(term275505, term275505.getClass(), "playedUserId2", 0);
        setIntField(term275505, term275505.getClass(), "playedUserId3", 0);
        setField(term275505, term275505.getClass(), "playedUserName1", null);
        setField(term275505, term275505.getClass(), "playedUserName2", null);
        setField(term275505, term275505.getClass(), "playedUserName3", null);
        setIntField(term275505, term275505.getClass(), "playedMusicLevel1", 0);
        setIntField(term275505, term275505.getClass(), "playedMusicLevel2", 0);
        setIntField(term275505, term275505.getClass(), "playedMusicLevel3", 0);
        setIntField(term275505, term275505.getClass(), "playedCustom1", 0);
        setIntField(term275505, term275505.getClass(), "playedCustom2", 0);
        setIntField(term275505, term275505.getClass(), "playedCustom3", 0);
        setIntField(term275505, term275505.getClass(), "track", 0);
        setIntField(term275505, term275505.getClass(), "score", 0);
        setIntField(term275505, term275505.getClass(), "rank", 0);
        setIntField(term275505, term275505.getClass(), "maxCombo", 0);
        setIntField(term275505, term275505.getClass(), "maxChain", 0);
        setIntField(term275505, term275505.getClass(), "rateTap", 0);
        setIntField(term275505, term275505.getClass(), "rateHold", 0);
        setIntField(term275505, term275505.getClass(), "rateSlide", 0);
        setIntField(term275505, term275505.getClass(), "rateAir", 0);
        setIntField(term275505, term275505.getClass(), "rateFlick", 0);
        setIntField(term275505, term275505.getClass(), "judgeGuilty", 0);
        setIntField(term275505, term275505.getClass(), "judgeAttack", 0);
        setIntField(term275505, term275505.getClass(), "judgeJustice", 0);
        setIntField(term275505, term275505.getClass(), "judgeCritical", 0);
        setIntField(term275505, term275505.getClass(), "eventId", 0);
        setIntField(term275505, term275505.getClass(), "playerRating", 0);
        setBooleanField(term275505, term275505.getClass(), "isNewRecord", false);
        setBooleanField(term275505, term275505.getClass(), "isFullCombo", false);
        setIntField(term275505, term275505.getClass(), "fullChainKind", 0);
        setBooleanField(term275505, term275505.getClass(), "isAllJustice", false);
        setBooleanField(term275505, term275505.getClass(), "isContinue", false);
        setBooleanField(term275505, term275505.getClass(), "isFreeToPlay", false);
        setIntField(term275505, term275505.getClass(), "characterId", 0);
        setIntField(term275505, term275505.getClass(), "skillId", 0);
        setIntField(term275505, term275505.getClass(), "playKind", 0);
        setBooleanField(term275505, term275505.getClass(), "isClear", false);
        setIntField(term275505, term275505.getClass(), "skillLevel", 0);
        setIntField(term275505, term275505.getClass(), "skillEffect", 0);
        setField(term275505, term275505.getClass(), "placeName", null);
        setBooleanField(term275505, term275505.getClass(), "isMaimai", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkillEffect", argTypes, term275505, args);
    }

};


