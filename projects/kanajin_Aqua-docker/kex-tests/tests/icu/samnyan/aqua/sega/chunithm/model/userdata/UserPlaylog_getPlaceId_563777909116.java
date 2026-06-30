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

public class UserPlaylog_getPlaceId_563777909116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273435;

    public UserPlaylog_getPlaceId_563777909116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273435 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term273435, term273435.getClass(), "id", 0L);
        setField(term273435, term273435.getClass(), "user", null);
        setIntField(term273435, term273435.getClass(), "orderId", 0);
        setIntField(term273435, term273435.getClass(), "sortNumber", 0);
        setIntField(term273435, term273435.getClass(), "placeId", 0);
        setField(term273435, term273435.getClass(), "playDate", null);
        setField(term273435, term273435.getClass(), "userPlayDate", null);
        setIntField(term273435, term273435.getClass(), "musicId", 0);
        setIntField(term273435, term273435.getClass(), "level", 0);
        setIntField(term273435, term273435.getClass(), "customId", 0);
        setIntField(term273435, term273435.getClass(), "playedUserId1", 0);
        setIntField(term273435, term273435.getClass(), "playedUserId2", 0);
        setIntField(term273435, term273435.getClass(), "playedUserId3", 0);
        setField(term273435, term273435.getClass(), "playedUserName1", null);
        setField(term273435, term273435.getClass(), "playedUserName2", null);
        setField(term273435, term273435.getClass(), "playedUserName3", null);
        setIntField(term273435, term273435.getClass(), "playedMusicLevel1", 0);
        setIntField(term273435, term273435.getClass(), "playedMusicLevel2", 0);
        setIntField(term273435, term273435.getClass(), "playedMusicLevel3", 0);
        setIntField(term273435, term273435.getClass(), "playedCustom1", 0);
        setIntField(term273435, term273435.getClass(), "playedCustom2", 0);
        setIntField(term273435, term273435.getClass(), "playedCustom3", 0);
        setIntField(term273435, term273435.getClass(), "track", 0);
        setIntField(term273435, term273435.getClass(), "score", 0);
        setIntField(term273435, term273435.getClass(), "rank", 0);
        setIntField(term273435, term273435.getClass(), "maxCombo", 0);
        setIntField(term273435, term273435.getClass(), "maxChain", 0);
        setIntField(term273435, term273435.getClass(), "rateTap", 0);
        setIntField(term273435, term273435.getClass(), "rateHold", 0);
        setIntField(term273435, term273435.getClass(), "rateSlide", 0);
        setIntField(term273435, term273435.getClass(), "rateAir", 0);
        setIntField(term273435, term273435.getClass(), "rateFlick", 0);
        setIntField(term273435, term273435.getClass(), "judgeGuilty", 0);
        setIntField(term273435, term273435.getClass(), "judgeAttack", 0);
        setIntField(term273435, term273435.getClass(), "judgeJustice", 0);
        setIntField(term273435, term273435.getClass(), "judgeCritical", 0);
        setIntField(term273435, term273435.getClass(), "eventId", 0);
        setIntField(term273435, term273435.getClass(), "playerRating", 0);
        setBooleanField(term273435, term273435.getClass(), "isNewRecord", false);
        setBooleanField(term273435, term273435.getClass(), "isFullCombo", false);
        setIntField(term273435, term273435.getClass(), "fullChainKind", 0);
        setBooleanField(term273435, term273435.getClass(), "isAllJustice", false);
        setBooleanField(term273435, term273435.getClass(), "isContinue", false);
        setBooleanField(term273435, term273435.getClass(), "isFreeToPlay", false);
        setIntField(term273435, term273435.getClass(), "characterId", 0);
        setIntField(term273435, term273435.getClass(), "skillId", 0);
        setIntField(term273435, term273435.getClass(), "playKind", 0);
        setBooleanField(term273435, term273435.getClass(), "isClear", false);
        setIntField(term273435, term273435.getClass(), "skillLevel", 0);
        setIntField(term273435, term273435.getClass(), "skillEffect", 0);
        setField(term273435, term273435.getClass(), "placeName", null);
        setBooleanField(term273435, term273435.getClass(), "isMaimai", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlaceId", argTypes, term273435, args);
    }

};


