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

public class UserPlaylog_getPlayedUserName1_119435202132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term458972;

    public UserPlaylog_getPlayedUserName1_119435202132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term458972 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog"));
        setLongField(term458972, term458972.getClass(), "id", 0L);
        setField(term458972, term458972.getClass(), "user", null);
        setField(term458972, term458972.getClass(), "romVersion", null);
        setIntField(term458972, term458972.getClass(), "orderId", 0);
        setIntField(term458972, term458972.getClass(), "sortNumber", 0);
        setIntField(term458972, term458972.getClass(), "placeId", 0);
        setField(term458972, term458972.getClass(), "playDate", null);
        setField(term458972, term458972.getClass(), "userPlayDate", null);
        setIntField(term458972, term458972.getClass(), "musicId", 0);
        setIntField(term458972, term458972.getClass(), "level", 0);
        setIntField(term458972, term458972.getClass(), "customId", 0);
        setIntField(term458972, term458972.getClass(), "playedUserId1", 0);
        setIntField(term458972, term458972.getClass(), "playedUserId2", 0);
        setIntField(term458972, term458972.getClass(), "playedUserId3", 0);
        setField(term458972, term458972.getClass(), "playedUserName1", null);
        setField(term458972, term458972.getClass(), "playedUserName2", null);
        setField(term458972, term458972.getClass(), "playedUserName3", null);
        setIntField(term458972, term458972.getClass(), "playedMusicLevel1", 0);
        setIntField(term458972, term458972.getClass(), "playedMusicLevel2", 0);
        setIntField(term458972, term458972.getClass(), "playedMusicLevel3", 0);
        setIntField(term458972, term458972.getClass(), "playedCustom1", 0);
        setIntField(term458972, term458972.getClass(), "playedCustom2", 0);
        setIntField(term458972, term458972.getClass(), "playedCustom3", 0);
        setIntField(term458972, term458972.getClass(), "track", 0);
        setIntField(term458972, term458972.getClass(), "score", 0);
        setIntField(term458972, term458972.getClass(), "rank", 0);
        setIntField(term458972, term458972.getClass(), "maxCombo", 0);
        setIntField(term458972, term458972.getClass(), "maxChain", 0);
        setIntField(term458972, term458972.getClass(), "rateTap", 0);
        setIntField(term458972, term458972.getClass(), "rateHold", 0);
        setIntField(term458972, term458972.getClass(), "rateSlide", 0);
        setIntField(term458972, term458972.getClass(), "rateAir", 0);
        setIntField(term458972, term458972.getClass(), "rateFlick", 0);
        setIntField(term458972, term458972.getClass(), "judgeGuilty", 0);
        setIntField(term458972, term458972.getClass(), "judgeAttack", 0);
        setIntField(term458972, term458972.getClass(), "judgeJustice", 0);
        setIntField(term458972, term458972.getClass(), "judgeCritical", 0);
        setIntField(term458972, term458972.getClass(), "judgeHeaven", 0);
        setIntField(term458972, term458972.getClass(), "eventId", 0);
        setIntField(term458972, term458972.getClass(), "playerRating", 0);
        setBooleanField(term458972, term458972.getClass(), "isNewRecord", false);
        setBooleanField(term458972, term458972.getClass(), "isFullCombo", false);
        setIntField(term458972, term458972.getClass(), "fullChainKind", 0);
        setBooleanField(term458972, term458972.getClass(), "isAllJustice", false);
        setBooleanField(term458972, term458972.getClass(), "isContinue", false);
        setBooleanField(term458972, term458972.getClass(), "isFreeToPlay", false);
        setIntField(term458972, term458972.getClass(), "characterId", 0);
        setIntField(term458972, term458972.getClass(), "charaIllustId", 0);
        setIntField(term458972, term458972.getClass(), "skillId", 0);
        setIntField(term458972, term458972.getClass(), "playKind", 0);
        setBooleanField(term458972, term458972.getClass(), "isClear", false);
        setIntField(term458972, term458972.getClass(), "skillLevel", 0);
        setIntField(term458972, term458972.getClass(), "skillEffect", 0);
        setField(term458972, term458972.getClass(), "placeName", null);
        setIntField(term458972, term458972.getClass(), "commonId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedUserName1", argTypes, term458972, args);
    }

};


