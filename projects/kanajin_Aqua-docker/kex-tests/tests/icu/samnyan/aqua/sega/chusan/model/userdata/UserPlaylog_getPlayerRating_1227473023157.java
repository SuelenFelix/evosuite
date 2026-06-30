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

public class UserPlaylog_getPlayerRating_1227473023157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term460172;

    public UserPlaylog_getPlayerRating_1227473023157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term460172 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog"));
        setLongField(term460172, term460172.getClass(), "id", 0L);
        setField(term460172, term460172.getClass(), "user", null);
        setField(term460172, term460172.getClass(), "romVersion", null);
        setIntField(term460172, term460172.getClass(), "orderId", 0);
        setIntField(term460172, term460172.getClass(), "sortNumber", 0);
        setIntField(term460172, term460172.getClass(), "placeId", 0);
        setField(term460172, term460172.getClass(), "playDate", null);
        setField(term460172, term460172.getClass(), "userPlayDate", null);
        setIntField(term460172, term460172.getClass(), "musicId", 0);
        setIntField(term460172, term460172.getClass(), "level", 0);
        setIntField(term460172, term460172.getClass(), "customId", 0);
        setIntField(term460172, term460172.getClass(), "playedUserId1", 0);
        setIntField(term460172, term460172.getClass(), "playedUserId2", 0);
        setIntField(term460172, term460172.getClass(), "playedUserId3", 0);
        setField(term460172, term460172.getClass(), "playedUserName1", null);
        setField(term460172, term460172.getClass(), "playedUserName2", null);
        setField(term460172, term460172.getClass(), "playedUserName3", null);
        setIntField(term460172, term460172.getClass(), "playedMusicLevel1", 0);
        setIntField(term460172, term460172.getClass(), "playedMusicLevel2", 0);
        setIntField(term460172, term460172.getClass(), "playedMusicLevel3", 0);
        setIntField(term460172, term460172.getClass(), "playedCustom1", 0);
        setIntField(term460172, term460172.getClass(), "playedCustom2", 0);
        setIntField(term460172, term460172.getClass(), "playedCustom3", 0);
        setIntField(term460172, term460172.getClass(), "track", 0);
        setIntField(term460172, term460172.getClass(), "score", 0);
        setIntField(term460172, term460172.getClass(), "rank", 0);
        setIntField(term460172, term460172.getClass(), "maxCombo", 0);
        setIntField(term460172, term460172.getClass(), "maxChain", 0);
        setIntField(term460172, term460172.getClass(), "rateTap", 0);
        setIntField(term460172, term460172.getClass(), "rateHold", 0);
        setIntField(term460172, term460172.getClass(), "rateSlide", 0);
        setIntField(term460172, term460172.getClass(), "rateAir", 0);
        setIntField(term460172, term460172.getClass(), "rateFlick", 0);
        setIntField(term460172, term460172.getClass(), "judgeGuilty", 0);
        setIntField(term460172, term460172.getClass(), "judgeAttack", 0);
        setIntField(term460172, term460172.getClass(), "judgeJustice", 0);
        setIntField(term460172, term460172.getClass(), "judgeCritical", 0);
        setIntField(term460172, term460172.getClass(), "judgeHeaven", 0);
        setIntField(term460172, term460172.getClass(), "eventId", 0);
        setIntField(term460172, term460172.getClass(), "playerRating", 0);
        setBooleanField(term460172, term460172.getClass(), "isNewRecord", false);
        setBooleanField(term460172, term460172.getClass(), "isFullCombo", false);
        setIntField(term460172, term460172.getClass(), "fullChainKind", 0);
        setBooleanField(term460172, term460172.getClass(), "isAllJustice", false);
        setBooleanField(term460172, term460172.getClass(), "isContinue", false);
        setBooleanField(term460172, term460172.getClass(), "isFreeToPlay", false);
        setIntField(term460172, term460172.getClass(), "characterId", 0);
        setIntField(term460172, term460172.getClass(), "charaIllustId", 0);
        setIntField(term460172, term460172.getClass(), "skillId", 0);
        setIntField(term460172, term460172.getClass(), "playKind", 0);
        setBooleanField(term460172, term460172.getClass(), "isClear", false);
        setIntField(term460172, term460172.getClass(), "skillLevel", 0);
        setIntField(term460172, term460172.getClass(), "skillEffect", 0);
        setField(term460172, term460172.getClass(), "placeName", null);
        setIntField(term460172, term460172.getClass(), "commonId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerRating", argTypes, term460172, args);
    }

};


