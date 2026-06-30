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

public class UserPlaylog_getPlayDate_1235562284124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term458588;

    public UserPlaylog_getPlayDate_1235562284124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term458588 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog"));
        setLongField(term458588, term458588.getClass(), "id", 0L);
        setField(term458588, term458588.getClass(), "user", null);
        setField(term458588, term458588.getClass(), "romVersion", null);
        setIntField(term458588, term458588.getClass(), "orderId", 0);
        setIntField(term458588, term458588.getClass(), "sortNumber", 0);
        setIntField(term458588, term458588.getClass(), "placeId", 0);
        setField(term458588, term458588.getClass(), "playDate", null);
        setField(term458588, term458588.getClass(), "userPlayDate", null);
        setIntField(term458588, term458588.getClass(), "musicId", 0);
        setIntField(term458588, term458588.getClass(), "level", 0);
        setIntField(term458588, term458588.getClass(), "customId", 0);
        setIntField(term458588, term458588.getClass(), "playedUserId1", 0);
        setIntField(term458588, term458588.getClass(), "playedUserId2", 0);
        setIntField(term458588, term458588.getClass(), "playedUserId3", 0);
        setField(term458588, term458588.getClass(), "playedUserName1", null);
        setField(term458588, term458588.getClass(), "playedUserName2", null);
        setField(term458588, term458588.getClass(), "playedUserName3", null);
        setIntField(term458588, term458588.getClass(), "playedMusicLevel1", 0);
        setIntField(term458588, term458588.getClass(), "playedMusicLevel2", 0);
        setIntField(term458588, term458588.getClass(), "playedMusicLevel3", 0);
        setIntField(term458588, term458588.getClass(), "playedCustom1", 0);
        setIntField(term458588, term458588.getClass(), "playedCustom2", 0);
        setIntField(term458588, term458588.getClass(), "playedCustom3", 0);
        setIntField(term458588, term458588.getClass(), "track", 0);
        setIntField(term458588, term458588.getClass(), "score", 0);
        setIntField(term458588, term458588.getClass(), "rank", 0);
        setIntField(term458588, term458588.getClass(), "maxCombo", 0);
        setIntField(term458588, term458588.getClass(), "maxChain", 0);
        setIntField(term458588, term458588.getClass(), "rateTap", 0);
        setIntField(term458588, term458588.getClass(), "rateHold", 0);
        setIntField(term458588, term458588.getClass(), "rateSlide", 0);
        setIntField(term458588, term458588.getClass(), "rateAir", 0);
        setIntField(term458588, term458588.getClass(), "rateFlick", 0);
        setIntField(term458588, term458588.getClass(), "judgeGuilty", 0);
        setIntField(term458588, term458588.getClass(), "judgeAttack", 0);
        setIntField(term458588, term458588.getClass(), "judgeJustice", 0);
        setIntField(term458588, term458588.getClass(), "judgeCritical", 0);
        setIntField(term458588, term458588.getClass(), "judgeHeaven", 0);
        setIntField(term458588, term458588.getClass(), "eventId", 0);
        setIntField(term458588, term458588.getClass(), "playerRating", 0);
        setBooleanField(term458588, term458588.getClass(), "isNewRecord", false);
        setBooleanField(term458588, term458588.getClass(), "isFullCombo", false);
        setIntField(term458588, term458588.getClass(), "fullChainKind", 0);
        setBooleanField(term458588, term458588.getClass(), "isAllJustice", false);
        setBooleanField(term458588, term458588.getClass(), "isContinue", false);
        setBooleanField(term458588, term458588.getClass(), "isFreeToPlay", false);
        setIntField(term458588, term458588.getClass(), "characterId", 0);
        setIntField(term458588, term458588.getClass(), "charaIllustId", 0);
        setIntField(term458588, term458588.getClass(), "skillId", 0);
        setIntField(term458588, term458588.getClass(), "playKind", 0);
        setBooleanField(term458588, term458588.getClass(), "isClear", false);
        setIntField(term458588, term458588.getClass(), "skillLevel", 0);
        setIntField(term458588, term458588.getClass(), "skillEffect", 0);
        setField(term458588, term458588.getClass(), "placeName", null);
        setIntField(term458588, term458588.getClass(), "commonId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayDate", argTypes, term458588, args);
    }

};


