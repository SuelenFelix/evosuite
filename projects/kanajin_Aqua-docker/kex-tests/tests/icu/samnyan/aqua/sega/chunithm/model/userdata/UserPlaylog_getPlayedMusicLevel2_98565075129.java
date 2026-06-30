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

public class UserPlaylog_getPlayedMusicLevel2_98565075129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274033;

    public UserPlaylog_getPlayedMusicLevel2_98565075129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term274033 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term274033, term274033.getClass(), "id", 0L);
        setField(term274033, term274033.getClass(), "user", null);
        setIntField(term274033, term274033.getClass(), "orderId", 0);
        setIntField(term274033, term274033.getClass(), "sortNumber", 0);
        setIntField(term274033, term274033.getClass(), "placeId", 0);
        setField(term274033, term274033.getClass(), "playDate", null);
        setField(term274033, term274033.getClass(), "userPlayDate", null);
        setIntField(term274033, term274033.getClass(), "musicId", 0);
        setIntField(term274033, term274033.getClass(), "level", 0);
        setIntField(term274033, term274033.getClass(), "customId", 0);
        setIntField(term274033, term274033.getClass(), "playedUserId1", 0);
        setIntField(term274033, term274033.getClass(), "playedUserId2", 0);
        setIntField(term274033, term274033.getClass(), "playedUserId3", 0);
        setField(term274033, term274033.getClass(), "playedUserName1", null);
        setField(term274033, term274033.getClass(), "playedUserName2", null);
        setField(term274033, term274033.getClass(), "playedUserName3", null);
        setIntField(term274033, term274033.getClass(), "playedMusicLevel1", 0);
        setIntField(term274033, term274033.getClass(), "playedMusicLevel2", 0);
        setIntField(term274033, term274033.getClass(), "playedMusicLevel3", 0);
        setIntField(term274033, term274033.getClass(), "playedCustom1", 0);
        setIntField(term274033, term274033.getClass(), "playedCustom2", 0);
        setIntField(term274033, term274033.getClass(), "playedCustom3", 0);
        setIntField(term274033, term274033.getClass(), "track", 0);
        setIntField(term274033, term274033.getClass(), "score", 0);
        setIntField(term274033, term274033.getClass(), "rank", 0);
        setIntField(term274033, term274033.getClass(), "maxCombo", 0);
        setIntField(term274033, term274033.getClass(), "maxChain", 0);
        setIntField(term274033, term274033.getClass(), "rateTap", 0);
        setIntField(term274033, term274033.getClass(), "rateHold", 0);
        setIntField(term274033, term274033.getClass(), "rateSlide", 0);
        setIntField(term274033, term274033.getClass(), "rateAir", 0);
        setIntField(term274033, term274033.getClass(), "rateFlick", 0);
        setIntField(term274033, term274033.getClass(), "judgeGuilty", 0);
        setIntField(term274033, term274033.getClass(), "judgeAttack", 0);
        setIntField(term274033, term274033.getClass(), "judgeJustice", 0);
        setIntField(term274033, term274033.getClass(), "judgeCritical", 0);
        setIntField(term274033, term274033.getClass(), "eventId", 0);
        setIntField(term274033, term274033.getClass(), "playerRating", 0);
        setBooleanField(term274033, term274033.getClass(), "isNewRecord", false);
        setBooleanField(term274033, term274033.getClass(), "isFullCombo", false);
        setIntField(term274033, term274033.getClass(), "fullChainKind", 0);
        setBooleanField(term274033, term274033.getClass(), "isAllJustice", false);
        setBooleanField(term274033, term274033.getClass(), "isContinue", false);
        setBooleanField(term274033, term274033.getClass(), "isFreeToPlay", false);
        setIntField(term274033, term274033.getClass(), "characterId", 0);
        setIntField(term274033, term274033.getClass(), "skillId", 0);
        setIntField(term274033, term274033.getClass(), "playKind", 0);
        setBooleanField(term274033, term274033.getClass(), "isClear", false);
        setIntField(term274033, term274033.getClass(), "skillLevel", 0);
        setIntField(term274033, term274033.getClass(), "skillEffect", 0);
        setField(term274033, term274033.getClass(), "placeName", null);
        setBooleanField(term274033, term274033.getClass(), "isMaimai", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedMusicLevel2", argTypes, term274033, args);
    }

};


