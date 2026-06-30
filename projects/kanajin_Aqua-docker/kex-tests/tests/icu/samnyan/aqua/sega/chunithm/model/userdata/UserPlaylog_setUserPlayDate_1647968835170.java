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

public class UserPlaylog_setUserPlayDate_1647968835170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275927;

    public UserPlaylog_setUserPlayDate_1647968835170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term275927 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term275927, term275927.getClass(), "id", 0L);
        setField(term275927, term275927.getClass(), "user", null);
        setIntField(term275927, term275927.getClass(), "orderId", 0);
        setIntField(term275927, term275927.getClass(), "sortNumber", 0);
        setIntField(term275927, term275927.getClass(), "placeId", 0);
        setField(term275927, term275927.getClass(), "playDate", null);
        setField(term275927, term275927.getClass(), "userPlayDate", null);
        setIntField(term275927, term275927.getClass(), "musicId", 0);
        setIntField(term275927, term275927.getClass(), "level", 0);
        setIntField(term275927, term275927.getClass(), "customId", 0);
        setIntField(term275927, term275927.getClass(), "playedUserId1", 0);
        setIntField(term275927, term275927.getClass(), "playedUserId2", 0);
        setIntField(term275927, term275927.getClass(), "playedUserId3", 0);
        setField(term275927, term275927.getClass(), "playedUserName1", null);
        setField(term275927, term275927.getClass(), "playedUserName2", null);
        setField(term275927, term275927.getClass(), "playedUserName3", null);
        setIntField(term275927, term275927.getClass(), "playedMusicLevel1", 0);
        setIntField(term275927, term275927.getClass(), "playedMusicLevel2", 0);
        setIntField(term275927, term275927.getClass(), "playedMusicLevel3", 0);
        setIntField(term275927, term275927.getClass(), "playedCustom1", 0);
        setIntField(term275927, term275927.getClass(), "playedCustom2", 0);
        setIntField(term275927, term275927.getClass(), "playedCustom3", 0);
        setIntField(term275927, term275927.getClass(), "track", 0);
        setIntField(term275927, term275927.getClass(), "score", 0);
        setIntField(term275927, term275927.getClass(), "rank", 0);
        setIntField(term275927, term275927.getClass(), "maxCombo", 0);
        setIntField(term275927, term275927.getClass(), "maxChain", 0);
        setIntField(term275927, term275927.getClass(), "rateTap", 0);
        setIntField(term275927, term275927.getClass(), "rateHold", 0);
        setIntField(term275927, term275927.getClass(), "rateSlide", 0);
        setIntField(term275927, term275927.getClass(), "rateAir", 0);
        setIntField(term275927, term275927.getClass(), "rateFlick", 0);
        setIntField(term275927, term275927.getClass(), "judgeGuilty", 0);
        setIntField(term275927, term275927.getClass(), "judgeAttack", 0);
        setIntField(term275927, term275927.getClass(), "judgeJustice", 0);
        setIntField(term275927, term275927.getClass(), "judgeCritical", 0);
        setIntField(term275927, term275927.getClass(), "eventId", 0);
        setIntField(term275927, term275927.getClass(), "playerRating", 0);
        setBooleanField(term275927, term275927.getClass(), "isNewRecord", false);
        setBooleanField(term275927, term275927.getClass(), "isFullCombo", false);
        setIntField(term275927, term275927.getClass(), "fullChainKind", 0);
        setBooleanField(term275927, term275927.getClass(), "isAllJustice", false);
        setBooleanField(term275927, term275927.getClass(), "isContinue", false);
        setBooleanField(term275927, term275927.getClass(), "isFreeToPlay", false);
        setIntField(term275927, term275927.getClass(), "characterId", 0);
        setIntField(term275927, term275927.getClass(), "skillId", 0);
        setIntField(term275927, term275927.getClass(), "playKind", 0);
        setBooleanField(term275927, term275927.getClass(), "isClear", false);
        setIntField(term275927, term275927.getClass(), "skillLevel", 0);
        setIntField(term275927, term275927.getClass(), "skillEffect", 0);
        setField(term275927, term275927.getClass(), "placeName", null);
        setBooleanField(term275927, term275927.getClass(), "isMaimai", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserPlayDate", argTypes, term275927, args);
    }

};


