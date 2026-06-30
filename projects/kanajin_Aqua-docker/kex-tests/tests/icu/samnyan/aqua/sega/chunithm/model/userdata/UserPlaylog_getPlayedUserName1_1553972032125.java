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

public class UserPlaylog_getPlayedUserName1_1553972032125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273849;

    public UserPlaylog_getPlayedUserName1_1553972032125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273849 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term273849, term273849.getClass(), "id", 0L);
        setField(term273849, term273849.getClass(), "user", null);
        setIntField(term273849, term273849.getClass(), "orderId", 0);
        setIntField(term273849, term273849.getClass(), "sortNumber", 0);
        setIntField(term273849, term273849.getClass(), "placeId", 0);
        setField(term273849, term273849.getClass(), "playDate", null);
        setField(term273849, term273849.getClass(), "userPlayDate", null);
        setIntField(term273849, term273849.getClass(), "musicId", 0);
        setIntField(term273849, term273849.getClass(), "level", 0);
        setIntField(term273849, term273849.getClass(), "customId", 0);
        setIntField(term273849, term273849.getClass(), "playedUserId1", 0);
        setIntField(term273849, term273849.getClass(), "playedUserId2", 0);
        setIntField(term273849, term273849.getClass(), "playedUserId3", 0);
        setField(term273849, term273849.getClass(), "playedUserName1", null);
        setField(term273849, term273849.getClass(), "playedUserName2", null);
        setField(term273849, term273849.getClass(), "playedUserName3", null);
        setIntField(term273849, term273849.getClass(), "playedMusicLevel1", 0);
        setIntField(term273849, term273849.getClass(), "playedMusicLevel2", 0);
        setIntField(term273849, term273849.getClass(), "playedMusicLevel3", 0);
        setIntField(term273849, term273849.getClass(), "playedCustom1", 0);
        setIntField(term273849, term273849.getClass(), "playedCustom2", 0);
        setIntField(term273849, term273849.getClass(), "playedCustom3", 0);
        setIntField(term273849, term273849.getClass(), "track", 0);
        setIntField(term273849, term273849.getClass(), "score", 0);
        setIntField(term273849, term273849.getClass(), "rank", 0);
        setIntField(term273849, term273849.getClass(), "maxCombo", 0);
        setIntField(term273849, term273849.getClass(), "maxChain", 0);
        setIntField(term273849, term273849.getClass(), "rateTap", 0);
        setIntField(term273849, term273849.getClass(), "rateHold", 0);
        setIntField(term273849, term273849.getClass(), "rateSlide", 0);
        setIntField(term273849, term273849.getClass(), "rateAir", 0);
        setIntField(term273849, term273849.getClass(), "rateFlick", 0);
        setIntField(term273849, term273849.getClass(), "judgeGuilty", 0);
        setIntField(term273849, term273849.getClass(), "judgeAttack", 0);
        setIntField(term273849, term273849.getClass(), "judgeJustice", 0);
        setIntField(term273849, term273849.getClass(), "judgeCritical", 0);
        setIntField(term273849, term273849.getClass(), "eventId", 0);
        setIntField(term273849, term273849.getClass(), "playerRating", 0);
        setBooleanField(term273849, term273849.getClass(), "isNewRecord", false);
        setBooleanField(term273849, term273849.getClass(), "isFullCombo", false);
        setIntField(term273849, term273849.getClass(), "fullChainKind", 0);
        setBooleanField(term273849, term273849.getClass(), "isAllJustice", false);
        setBooleanField(term273849, term273849.getClass(), "isContinue", false);
        setBooleanField(term273849, term273849.getClass(), "isFreeToPlay", false);
        setIntField(term273849, term273849.getClass(), "characterId", 0);
        setIntField(term273849, term273849.getClass(), "skillId", 0);
        setIntField(term273849, term273849.getClass(), "playKind", 0);
        setBooleanField(term273849, term273849.getClass(), "isClear", false);
        setIntField(term273849, term273849.getClass(), "skillLevel", 0);
        setIntField(term273849, term273849.getClass(), "skillEffect", 0);
        setField(term273849, term273849.getClass(), "placeName", null);
        setBooleanField(term273849, term273849.getClass(), "isMaimai", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedUserName1", argTypes, term273849, args);
    }

};


