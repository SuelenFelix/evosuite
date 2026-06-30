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

public class UserPlaylog_getMaxChain_2069914526145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term459596;

    public UserPlaylog_getMaxChain_2069914526145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term459596 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog"));
        setLongField(term459596, term459596.getClass(), "id", 0L);
        setField(term459596, term459596.getClass(), "user", null);
        setField(term459596, term459596.getClass(), "romVersion", null);
        setIntField(term459596, term459596.getClass(), "orderId", 0);
        setIntField(term459596, term459596.getClass(), "sortNumber", 0);
        setIntField(term459596, term459596.getClass(), "placeId", 0);
        setField(term459596, term459596.getClass(), "playDate", null);
        setField(term459596, term459596.getClass(), "userPlayDate", null);
        setIntField(term459596, term459596.getClass(), "musicId", 0);
        setIntField(term459596, term459596.getClass(), "level", 0);
        setIntField(term459596, term459596.getClass(), "customId", 0);
        setIntField(term459596, term459596.getClass(), "playedUserId1", 0);
        setIntField(term459596, term459596.getClass(), "playedUserId2", 0);
        setIntField(term459596, term459596.getClass(), "playedUserId3", 0);
        setField(term459596, term459596.getClass(), "playedUserName1", null);
        setField(term459596, term459596.getClass(), "playedUserName2", null);
        setField(term459596, term459596.getClass(), "playedUserName3", null);
        setIntField(term459596, term459596.getClass(), "playedMusicLevel1", 0);
        setIntField(term459596, term459596.getClass(), "playedMusicLevel2", 0);
        setIntField(term459596, term459596.getClass(), "playedMusicLevel3", 0);
        setIntField(term459596, term459596.getClass(), "playedCustom1", 0);
        setIntField(term459596, term459596.getClass(), "playedCustom2", 0);
        setIntField(term459596, term459596.getClass(), "playedCustom3", 0);
        setIntField(term459596, term459596.getClass(), "track", 0);
        setIntField(term459596, term459596.getClass(), "score", 0);
        setIntField(term459596, term459596.getClass(), "rank", 0);
        setIntField(term459596, term459596.getClass(), "maxCombo", 0);
        setIntField(term459596, term459596.getClass(), "maxChain", 0);
        setIntField(term459596, term459596.getClass(), "rateTap", 0);
        setIntField(term459596, term459596.getClass(), "rateHold", 0);
        setIntField(term459596, term459596.getClass(), "rateSlide", 0);
        setIntField(term459596, term459596.getClass(), "rateAir", 0);
        setIntField(term459596, term459596.getClass(), "rateFlick", 0);
        setIntField(term459596, term459596.getClass(), "judgeGuilty", 0);
        setIntField(term459596, term459596.getClass(), "judgeAttack", 0);
        setIntField(term459596, term459596.getClass(), "judgeJustice", 0);
        setIntField(term459596, term459596.getClass(), "judgeCritical", 0);
        setIntField(term459596, term459596.getClass(), "judgeHeaven", 0);
        setIntField(term459596, term459596.getClass(), "eventId", 0);
        setIntField(term459596, term459596.getClass(), "playerRating", 0);
        setBooleanField(term459596, term459596.getClass(), "isNewRecord", false);
        setBooleanField(term459596, term459596.getClass(), "isFullCombo", false);
        setIntField(term459596, term459596.getClass(), "fullChainKind", 0);
        setBooleanField(term459596, term459596.getClass(), "isAllJustice", false);
        setBooleanField(term459596, term459596.getClass(), "isContinue", false);
        setBooleanField(term459596, term459596.getClass(), "isFreeToPlay", false);
        setIntField(term459596, term459596.getClass(), "characterId", 0);
        setIntField(term459596, term459596.getClass(), "charaIllustId", 0);
        setIntField(term459596, term459596.getClass(), "skillId", 0);
        setIntField(term459596, term459596.getClass(), "playKind", 0);
        setBooleanField(term459596, term459596.getClass(), "isClear", false);
        setIntField(term459596, term459596.getClass(), "skillLevel", 0);
        setIntField(term459596, term459596.getClass(), "skillEffect", 0);
        setField(term459596, term459596.getClass(), "placeName", null);
        setIntField(term459596, term459596.getClass(), "commonId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxChain", argTypes, term459596, args);
    }

};


