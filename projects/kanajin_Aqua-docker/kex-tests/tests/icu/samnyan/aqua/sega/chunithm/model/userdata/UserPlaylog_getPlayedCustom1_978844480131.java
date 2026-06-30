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

public class UserPlaylog_getPlayedCustom1_978844480131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274125;

    public UserPlaylog_getPlayedCustom1_978844480131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term274125 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term274125, term274125.getClass(), "id", 0L);
        setField(term274125, term274125.getClass(), "user", null);
        setIntField(term274125, term274125.getClass(), "orderId", 0);
        setIntField(term274125, term274125.getClass(), "sortNumber", 0);
        setIntField(term274125, term274125.getClass(), "placeId", 0);
        setField(term274125, term274125.getClass(), "playDate", null);
        setField(term274125, term274125.getClass(), "userPlayDate", null);
        setIntField(term274125, term274125.getClass(), "musicId", 0);
        setIntField(term274125, term274125.getClass(), "level", 0);
        setIntField(term274125, term274125.getClass(), "customId", 0);
        setIntField(term274125, term274125.getClass(), "playedUserId1", 0);
        setIntField(term274125, term274125.getClass(), "playedUserId2", 0);
        setIntField(term274125, term274125.getClass(), "playedUserId3", 0);
        setField(term274125, term274125.getClass(), "playedUserName1", null);
        setField(term274125, term274125.getClass(), "playedUserName2", null);
        setField(term274125, term274125.getClass(), "playedUserName3", null);
        setIntField(term274125, term274125.getClass(), "playedMusicLevel1", 0);
        setIntField(term274125, term274125.getClass(), "playedMusicLevel2", 0);
        setIntField(term274125, term274125.getClass(), "playedMusicLevel3", 0);
        setIntField(term274125, term274125.getClass(), "playedCustom1", 0);
        setIntField(term274125, term274125.getClass(), "playedCustom2", 0);
        setIntField(term274125, term274125.getClass(), "playedCustom3", 0);
        setIntField(term274125, term274125.getClass(), "track", 0);
        setIntField(term274125, term274125.getClass(), "score", 0);
        setIntField(term274125, term274125.getClass(), "rank", 0);
        setIntField(term274125, term274125.getClass(), "maxCombo", 0);
        setIntField(term274125, term274125.getClass(), "maxChain", 0);
        setIntField(term274125, term274125.getClass(), "rateTap", 0);
        setIntField(term274125, term274125.getClass(), "rateHold", 0);
        setIntField(term274125, term274125.getClass(), "rateSlide", 0);
        setIntField(term274125, term274125.getClass(), "rateAir", 0);
        setIntField(term274125, term274125.getClass(), "rateFlick", 0);
        setIntField(term274125, term274125.getClass(), "judgeGuilty", 0);
        setIntField(term274125, term274125.getClass(), "judgeAttack", 0);
        setIntField(term274125, term274125.getClass(), "judgeJustice", 0);
        setIntField(term274125, term274125.getClass(), "judgeCritical", 0);
        setIntField(term274125, term274125.getClass(), "eventId", 0);
        setIntField(term274125, term274125.getClass(), "playerRating", 0);
        setBooleanField(term274125, term274125.getClass(), "isNewRecord", false);
        setBooleanField(term274125, term274125.getClass(), "isFullCombo", false);
        setIntField(term274125, term274125.getClass(), "fullChainKind", 0);
        setBooleanField(term274125, term274125.getClass(), "isAllJustice", false);
        setBooleanField(term274125, term274125.getClass(), "isContinue", false);
        setBooleanField(term274125, term274125.getClass(), "isFreeToPlay", false);
        setIntField(term274125, term274125.getClass(), "characterId", 0);
        setIntField(term274125, term274125.getClass(), "skillId", 0);
        setIntField(term274125, term274125.getClass(), "playKind", 0);
        setBooleanField(term274125, term274125.getClass(), "isClear", false);
        setIntField(term274125, term274125.getClass(), "skillLevel", 0);
        setIntField(term274125, term274125.getClass(), "skillEffect", 0);
        setField(term274125, term274125.getClass(), "placeName", null);
        setBooleanField(term274125, term274125.getClass(), "isMaimai", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedCustom1", argTypes, term274125, args);
    }

};


