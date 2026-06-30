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

public class UserPlaylog_getPlayedUserName3_119437124134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term459068;

    public UserPlaylog_getPlayedUserName3_119437124134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term459068 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog"));
        setLongField(term459068, term459068.getClass(), "id", 0L);
        setField(term459068, term459068.getClass(), "user", null);
        setField(term459068, term459068.getClass(), "romVersion", null);
        setIntField(term459068, term459068.getClass(), "orderId", 0);
        setIntField(term459068, term459068.getClass(), "sortNumber", 0);
        setIntField(term459068, term459068.getClass(), "placeId", 0);
        setField(term459068, term459068.getClass(), "playDate", null);
        setField(term459068, term459068.getClass(), "userPlayDate", null);
        setIntField(term459068, term459068.getClass(), "musicId", 0);
        setIntField(term459068, term459068.getClass(), "level", 0);
        setIntField(term459068, term459068.getClass(), "customId", 0);
        setIntField(term459068, term459068.getClass(), "playedUserId1", 0);
        setIntField(term459068, term459068.getClass(), "playedUserId2", 0);
        setIntField(term459068, term459068.getClass(), "playedUserId3", 0);
        setField(term459068, term459068.getClass(), "playedUserName1", null);
        setField(term459068, term459068.getClass(), "playedUserName2", null);
        setField(term459068, term459068.getClass(), "playedUserName3", null);
        setIntField(term459068, term459068.getClass(), "playedMusicLevel1", 0);
        setIntField(term459068, term459068.getClass(), "playedMusicLevel2", 0);
        setIntField(term459068, term459068.getClass(), "playedMusicLevel3", 0);
        setIntField(term459068, term459068.getClass(), "playedCustom1", 0);
        setIntField(term459068, term459068.getClass(), "playedCustom2", 0);
        setIntField(term459068, term459068.getClass(), "playedCustom3", 0);
        setIntField(term459068, term459068.getClass(), "track", 0);
        setIntField(term459068, term459068.getClass(), "score", 0);
        setIntField(term459068, term459068.getClass(), "rank", 0);
        setIntField(term459068, term459068.getClass(), "maxCombo", 0);
        setIntField(term459068, term459068.getClass(), "maxChain", 0);
        setIntField(term459068, term459068.getClass(), "rateTap", 0);
        setIntField(term459068, term459068.getClass(), "rateHold", 0);
        setIntField(term459068, term459068.getClass(), "rateSlide", 0);
        setIntField(term459068, term459068.getClass(), "rateAir", 0);
        setIntField(term459068, term459068.getClass(), "rateFlick", 0);
        setIntField(term459068, term459068.getClass(), "judgeGuilty", 0);
        setIntField(term459068, term459068.getClass(), "judgeAttack", 0);
        setIntField(term459068, term459068.getClass(), "judgeJustice", 0);
        setIntField(term459068, term459068.getClass(), "judgeCritical", 0);
        setIntField(term459068, term459068.getClass(), "judgeHeaven", 0);
        setIntField(term459068, term459068.getClass(), "eventId", 0);
        setIntField(term459068, term459068.getClass(), "playerRating", 0);
        setBooleanField(term459068, term459068.getClass(), "isNewRecord", false);
        setBooleanField(term459068, term459068.getClass(), "isFullCombo", false);
        setIntField(term459068, term459068.getClass(), "fullChainKind", 0);
        setBooleanField(term459068, term459068.getClass(), "isAllJustice", false);
        setBooleanField(term459068, term459068.getClass(), "isContinue", false);
        setBooleanField(term459068, term459068.getClass(), "isFreeToPlay", false);
        setIntField(term459068, term459068.getClass(), "characterId", 0);
        setIntField(term459068, term459068.getClass(), "charaIllustId", 0);
        setIntField(term459068, term459068.getClass(), "skillId", 0);
        setIntField(term459068, term459068.getClass(), "playKind", 0);
        setBooleanField(term459068, term459068.getClass(), "isClear", false);
        setIntField(term459068, term459068.getClass(), "skillLevel", 0);
        setIntField(term459068, term459068.getClass(), "skillEffect", 0);
        setField(term459068, term459068.getClass(), "placeName", null);
        setIntField(term459068, term459068.getClass(), "commonId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedUserName3", argTypes, term459068, args);
    }

};


