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

public class UserPlaylog_setPlayDate_979514260179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term461236;

    public UserPlaylog_setPlayDate_979514260179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term461236 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog"));
        setLongField(term461236, term461236.getClass(), "id", 0L);
        setField(term461236, term461236.getClass(), "user", null);
        setField(term461236, term461236.getClass(), "romVersion", null);
        setIntField(term461236, term461236.getClass(), "orderId", 0);
        setIntField(term461236, term461236.getClass(), "sortNumber", 0);
        setIntField(term461236, term461236.getClass(), "placeId", 0);
        setField(term461236, term461236.getClass(), "playDate", null);
        setField(term461236, term461236.getClass(), "userPlayDate", null);
        setIntField(term461236, term461236.getClass(), "musicId", 0);
        setIntField(term461236, term461236.getClass(), "level", 0);
        setIntField(term461236, term461236.getClass(), "customId", 0);
        setIntField(term461236, term461236.getClass(), "playedUserId1", 0);
        setIntField(term461236, term461236.getClass(), "playedUserId2", 0);
        setIntField(term461236, term461236.getClass(), "playedUserId3", 0);
        setField(term461236, term461236.getClass(), "playedUserName1", null);
        setField(term461236, term461236.getClass(), "playedUserName2", null);
        setField(term461236, term461236.getClass(), "playedUserName3", null);
        setIntField(term461236, term461236.getClass(), "playedMusicLevel1", 0);
        setIntField(term461236, term461236.getClass(), "playedMusicLevel2", 0);
        setIntField(term461236, term461236.getClass(), "playedMusicLevel3", 0);
        setIntField(term461236, term461236.getClass(), "playedCustom1", 0);
        setIntField(term461236, term461236.getClass(), "playedCustom2", 0);
        setIntField(term461236, term461236.getClass(), "playedCustom3", 0);
        setIntField(term461236, term461236.getClass(), "track", 0);
        setIntField(term461236, term461236.getClass(), "score", 0);
        setIntField(term461236, term461236.getClass(), "rank", 0);
        setIntField(term461236, term461236.getClass(), "maxCombo", 0);
        setIntField(term461236, term461236.getClass(), "maxChain", 0);
        setIntField(term461236, term461236.getClass(), "rateTap", 0);
        setIntField(term461236, term461236.getClass(), "rateHold", 0);
        setIntField(term461236, term461236.getClass(), "rateSlide", 0);
        setIntField(term461236, term461236.getClass(), "rateAir", 0);
        setIntField(term461236, term461236.getClass(), "rateFlick", 0);
        setIntField(term461236, term461236.getClass(), "judgeGuilty", 0);
        setIntField(term461236, term461236.getClass(), "judgeAttack", 0);
        setIntField(term461236, term461236.getClass(), "judgeJustice", 0);
        setIntField(term461236, term461236.getClass(), "judgeCritical", 0);
        setIntField(term461236, term461236.getClass(), "judgeHeaven", 0);
        setIntField(term461236, term461236.getClass(), "eventId", 0);
        setIntField(term461236, term461236.getClass(), "playerRating", 0);
        setBooleanField(term461236, term461236.getClass(), "isNewRecord", false);
        setBooleanField(term461236, term461236.getClass(), "isFullCombo", false);
        setIntField(term461236, term461236.getClass(), "fullChainKind", 0);
        setBooleanField(term461236, term461236.getClass(), "isAllJustice", false);
        setBooleanField(term461236, term461236.getClass(), "isContinue", false);
        setBooleanField(term461236, term461236.getClass(), "isFreeToPlay", false);
        setIntField(term461236, term461236.getClass(), "characterId", 0);
        setIntField(term461236, term461236.getClass(), "charaIllustId", 0);
        setIntField(term461236, term461236.getClass(), "skillId", 0);
        setIntField(term461236, term461236.getClass(), "playKind", 0);
        setBooleanField(term461236, term461236.getClass(), "isClear", false);
        setIntField(term461236, term461236.getClass(), "skillLevel", 0);
        setIntField(term461236, term461236.getClass(), "skillEffect", 0);
        setField(term461236, term461236.getClass(), "placeName", null);
        setIntField(term461236, term461236.getClass(), "commonId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlayDate", argTypes, term461236, args);
    }

};


