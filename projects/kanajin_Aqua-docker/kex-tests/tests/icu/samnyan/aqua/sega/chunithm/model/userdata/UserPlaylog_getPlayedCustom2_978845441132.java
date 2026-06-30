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

public class UserPlaylog_getPlayedCustom2_978845441132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274171;

    public UserPlaylog_getPlayedCustom2_978845441132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term274171 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term274171, term274171.getClass(), "id", 0L);
        setField(term274171, term274171.getClass(), "user", null);
        setIntField(term274171, term274171.getClass(), "orderId", 0);
        setIntField(term274171, term274171.getClass(), "sortNumber", 0);
        setIntField(term274171, term274171.getClass(), "placeId", 0);
        setField(term274171, term274171.getClass(), "playDate", null);
        setField(term274171, term274171.getClass(), "userPlayDate", null);
        setIntField(term274171, term274171.getClass(), "musicId", 0);
        setIntField(term274171, term274171.getClass(), "level", 0);
        setIntField(term274171, term274171.getClass(), "customId", 0);
        setIntField(term274171, term274171.getClass(), "playedUserId1", 0);
        setIntField(term274171, term274171.getClass(), "playedUserId2", 0);
        setIntField(term274171, term274171.getClass(), "playedUserId3", 0);
        setField(term274171, term274171.getClass(), "playedUserName1", null);
        setField(term274171, term274171.getClass(), "playedUserName2", null);
        setField(term274171, term274171.getClass(), "playedUserName3", null);
        setIntField(term274171, term274171.getClass(), "playedMusicLevel1", 0);
        setIntField(term274171, term274171.getClass(), "playedMusicLevel2", 0);
        setIntField(term274171, term274171.getClass(), "playedMusicLevel3", 0);
        setIntField(term274171, term274171.getClass(), "playedCustom1", 0);
        setIntField(term274171, term274171.getClass(), "playedCustom2", 0);
        setIntField(term274171, term274171.getClass(), "playedCustom3", 0);
        setIntField(term274171, term274171.getClass(), "track", 0);
        setIntField(term274171, term274171.getClass(), "score", 0);
        setIntField(term274171, term274171.getClass(), "rank", 0);
        setIntField(term274171, term274171.getClass(), "maxCombo", 0);
        setIntField(term274171, term274171.getClass(), "maxChain", 0);
        setIntField(term274171, term274171.getClass(), "rateTap", 0);
        setIntField(term274171, term274171.getClass(), "rateHold", 0);
        setIntField(term274171, term274171.getClass(), "rateSlide", 0);
        setIntField(term274171, term274171.getClass(), "rateAir", 0);
        setIntField(term274171, term274171.getClass(), "rateFlick", 0);
        setIntField(term274171, term274171.getClass(), "judgeGuilty", 0);
        setIntField(term274171, term274171.getClass(), "judgeAttack", 0);
        setIntField(term274171, term274171.getClass(), "judgeJustice", 0);
        setIntField(term274171, term274171.getClass(), "judgeCritical", 0);
        setIntField(term274171, term274171.getClass(), "eventId", 0);
        setIntField(term274171, term274171.getClass(), "playerRating", 0);
        setBooleanField(term274171, term274171.getClass(), "isNewRecord", false);
        setBooleanField(term274171, term274171.getClass(), "isFullCombo", false);
        setIntField(term274171, term274171.getClass(), "fullChainKind", 0);
        setBooleanField(term274171, term274171.getClass(), "isAllJustice", false);
        setBooleanField(term274171, term274171.getClass(), "isContinue", false);
        setBooleanField(term274171, term274171.getClass(), "isFreeToPlay", false);
        setIntField(term274171, term274171.getClass(), "characterId", 0);
        setIntField(term274171, term274171.getClass(), "skillId", 0);
        setIntField(term274171, term274171.getClass(), "playKind", 0);
        setBooleanField(term274171, term274171.getClass(), "isClear", false);
        setIntField(term274171, term274171.getClass(), "skillLevel", 0);
        setIntField(term274171, term274171.getClass(), "skillEffect", 0);
        setField(term274171, term274171.getClass(), "placeName", null);
        setBooleanField(term274171, term274171.getClass(), "isMaimai", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedCustom2", argTypes, term274171, args);
    }

};


