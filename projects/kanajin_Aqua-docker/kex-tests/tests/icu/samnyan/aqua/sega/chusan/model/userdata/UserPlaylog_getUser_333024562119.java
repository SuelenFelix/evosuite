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

public class UserPlaylog_getUser_333024562119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term458348;

    public UserPlaylog_getUser_333024562119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term458348 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog"));
        setLongField(term458348, term458348.getClass(), "id", 0L);
        setField(term458348, term458348.getClass(), "user", null);
        setField(term458348, term458348.getClass(), "romVersion", null);
        setIntField(term458348, term458348.getClass(), "orderId", 0);
        setIntField(term458348, term458348.getClass(), "sortNumber", 0);
        setIntField(term458348, term458348.getClass(), "placeId", 0);
        setField(term458348, term458348.getClass(), "playDate", null);
        setField(term458348, term458348.getClass(), "userPlayDate", null);
        setIntField(term458348, term458348.getClass(), "musicId", 0);
        setIntField(term458348, term458348.getClass(), "level", 0);
        setIntField(term458348, term458348.getClass(), "customId", 0);
        setIntField(term458348, term458348.getClass(), "playedUserId1", 0);
        setIntField(term458348, term458348.getClass(), "playedUserId2", 0);
        setIntField(term458348, term458348.getClass(), "playedUserId3", 0);
        setField(term458348, term458348.getClass(), "playedUserName1", null);
        setField(term458348, term458348.getClass(), "playedUserName2", null);
        setField(term458348, term458348.getClass(), "playedUserName3", null);
        setIntField(term458348, term458348.getClass(), "playedMusicLevel1", 0);
        setIntField(term458348, term458348.getClass(), "playedMusicLevel2", 0);
        setIntField(term458348, term458348.getClass(), "playedMusicLevel3", 0);
        setIntField(term458348, term458348.getClass(), "playedCustom1", 0);
        setIntField(term458348, term458348.getClass(), "playedCustom2", 0);
        setIntField(term458348, term458348.getClass(), "playedCustom3", 0);
        setIntField(term458348, term458348.getClass(), "track", 0);
        setIntField(term458348, term458348.getClass(), "score", 0);
        setIntField(term458348, term458348.getClass(), "rank", 0);
        setIntField(term458348, term458348.getClass(), "maxCombo", 0);
        setIntField(term458348, term458348.getClass(), "maxChain", 0);
        setIntField(term458348, term458348.getClass(), "rateTap", 0);
        setIntField(term458348, term458348.getClass(), "rateHold", 0);
        setIntField(term458348, term458348.getClass(), "rateSlide", 0);
        setIntField(term458348, term458348.getClass(), "rateAir", 0);
        setIntField(term458348, term458348.getClass(), "rateFlick", 0);
        setIntField(term458348, term458348.getClass(), "judgeGuilty", 0);
        setIntField(term458348, term458348.getClass(), "judgeAttack", 0);
        setIntField(term458348, term458348.getClass(), "judgeJustice", 0);
        setIntField(term458348, term458348.getClass(), "judgeCritical", 0);
        setIntField(term458348, term458348.getClass(), "judgeHeaven", 0);
        setIntField(term458348, term458348.getClass(), "eventId", 0);
        setIntField(term458348, term458348.getClass(), "playerRating", 0);
        setBooleanField(term458348, term458348.getClass(), "isNewRecord", false);
        setBooleanField(term458348, term458348.getClass(), "isFullCombo", false);
        setIntField(term458348, term458348.getClass(), "fullChainKind", 0);
        setBooleanField(term458348, term458348.getClass(), "isAllJustice", false);
        setBooleanField(term458348, term458348.getClass(), "isContinue", false);
        setBooleanField(term458348, term458348.getClass(), "isFreeToPlay", false);
        setIntField(term458348, term458348.getClass(), "characterId", 0);
        setIntField(term458348, term458348.getClass(), "charaIllustId", 0);
        setIntField(term458348, term458348.getClass(), "skillId", 0);
        setIntField(term458348, term458348.getClass(), "playKind", 0);
        setBooleanField(term458348, term458348.getClass(), "isClear", false);
        setIntField(term458348, term458348.getClass(), "skillLevel", 0);
        setIntField(term458348, term458348.getClass(), "skillEffect", 0);
        setField(term458348, term458348.getClass(), "placeName", null);
        setIntField(term458348, term458348.getClass(), "commonId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term458348, args);
    }

};


