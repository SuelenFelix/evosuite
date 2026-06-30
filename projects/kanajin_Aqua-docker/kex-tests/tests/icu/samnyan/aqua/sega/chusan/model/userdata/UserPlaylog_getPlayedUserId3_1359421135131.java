package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserPlaylog_getPlayedUserId3_1359421135131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term458924;

    public UserPlaylog_getPlayedUserId3_1359421135131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term458924 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog"));
        setLongField(term458924, term458924.getClass(), "id", 0L);
        setField(term458924, term458924.getClass(), "user", null);
        setField(term458924, term458924.getClass(), "romVersion", null);
        setIntField(term458924, term458924.getClass(), "orderId", 0);
        setIntField(term458924, term458924.getClass(), "sortNumber", 0);
        setIntField(term458924, term458924.getClass(), "placeId", 0);
        setField(term458924, term458924.getClass(), "playDate", null);
        setField(term458924, term458924.getClass(), "userPlayDate", null);
        setIntField(term458924, term458924.getClass(), "musicId", 0);
        setIntField(term458924, term458924.getClass(), "level", 0);
        setIntField(term458924, term458924.getClass(), "customId", 0);
        setIntField(term458924, term458924.getClass(), "playedUserId1", 0);
        setIntField(term458924, term458924.getClass(), "playedUserId2", 0);
        setIntField(term458924, term458924.getClass(), "playedUserId3", 0);
        setField(term458924, term458924.getClass(), "playedUserName1", null);
        setField(term458924, term458924.getClass(), "playedUserName2", null);
        setField(term458924, term458924.getClass(), "playedUserName3", null);
        setIntField(term458924, term458924.getClass(), "playedMusicLevel1", 0);
        setIntField(term458924, term458924.getClass(), "playedMusicLevel2", 0);
        setIntField(term458924, term458924.getClass(), "playedMusicLevel3", 0);
        setIntField(term458924, term458924.getClass(), "playedCustom1", 0);
        setIntField(term458924, term458924.getClass(), "playedCustom2", 0);
        setIntField(term458924, term458924.getClass(), "playedCustom3", 0);
        setIntField(term458924, term458924.getClass(), "track", 0);
        setIntField(term458924, term458924.getClass(), "score", 0);
        setIntField(term458924, term458924.getClass(), "rank", 0);
        setIntField(term458924, term458924.getClass(), "maxCombo", 0);
        setIntField(term458924, term458924.getClass(), "maxChain", 0);
        setIntField(term458924, term458924.getClass(), "rateTap", 0);
        setIntField(term458924, term458924.getClass(), "rateHold", 0);
        setIntField(term458924, term458924.getClass(), "rateSlide", 0);
        setIntField(term458924, term458924.getClass(), "rateAir", 0);
        setIntField(term458924, term458924.getClass(), "rateFlick", 0);
        setIntField(term458924, term458924.getClass(), "judgeGuilty", 0);
        setIntField(term458924, term458924.getClass(), "judgeAttack", 0);
        setIntField(term458924, term458924.getClass(), "judgeJustice", 0);
        setIntField(term458924, term458924.getClass(), "judgeCritical", 0);
        setIntField(term458924, term458924.getClass(), "judgeHeaven", 0);
        setIntField(term458924, term458924.getClass(), "eventId", 0);
        setIntField(term458924, term458924.getClass(), "playerRating", 0);
        setBooleanField(term458924, term458924.getClass(), "isNewRecord", false);
        setBooleanField(term458924, term458924.getClass(), "isFullCombo", false);
        setIntField(term458924, term458924.getClass(), "fullChainKind", 0);
        setBooleanField(term458924, term458924.getClass(), "isAllJustice", false);
        setBooleanField(term458924, term458924.getClass(), "isContinue", false);
        setBooleanField(term458924, term458924.getClass(), "isFreeToPlay", false);
        setIntField(term458924, term458924.getClass(), "characterId", 0);
        setIntField(term458924, term458924.getClass(), "charaIllustId", 0);
        setIntField(term458924, term458924.getClass(), "skillId", 0);
        setIntField(term458924, term458924.getClass(), "playKind", 0);
        setBooleanField(term458924, term458924.getClass(), "isClear", false);
        setIntField(term458924, term458924.getClass(), "skillLevel", 0);
        setIntField(term458924, term458924.getClass(), "skillEffect", 0);
        setField(term458924, term458924.getClass(), "placeName", null);
        setIntField(term458924, term458924.getClass(), "commonId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedUserId3", argTypes, term458924, args);
    }

};


