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

public class UserPlaylog_getPlaceName_194085258162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275551;

    public UserPlaylog_getPlaceName_194085258162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term275551 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term275551, term275551.getClass(), "id", 0L);
        setField(term275551, term275551.getClass(), "user", null);
        setIntField(term275551, term275551.getClass(), "orderId", 0);
        setIntField(term275551, term275551.getClass(), "sortNumber", 0);
        setIntField(term275551, term275551.getClass(), "placeId", 0);
        setField(term275551, term275551.getClass(), "playDate", null);
        setField(term275551, term275551.getClass(), "userPlayDate", null);
        setIntField(term275551, term275551.getClass(), "musicId", 0);
        setIntField(term275551, term275551.getClass(), "level", 0);
        setIntField(term275551, term275551.getClass(), "customId", 0);
        setIntField(term275551, term275551.getClass(), "playedUserId1", 0);
        setIntField(term275551, term275551.getClass(), "playedUserId2", 0);
        setIntField(term275551, term275551.getClass(), "playedUserId3", 0);
        setField(term275551, term275551.getClass(), "playedUserName1", null);
        setField(term275551, term275551.getClass(), "playedUserName2", null);
        setField(term275551, term275551.getClass(), "playedUserName3", null);
        setIntField(term275551, term275551.getClass(), "playedMusicLevel1", 0);
        setIntField(term275551, term275551.getClass(), "playedMusicLevel2", 0);
        setIntField(term275551, term275551.getClass(), "playedMusicLevel3", 0);
        setIntField(term275551, term275551.getClass(), "playedCustom1", 0);
        setIntField(term275551, term275551.getClass(), "playedCustom2", 0);
        setIntField(term275551, term275551.getClass(), "playedCustom3", 0);
        setIntField(term275551, term275551.getClass(), "track", 0);
        setIntField(term275551, term275551.getClass(), "score", 0);
        setIntField(term275551, term275551.getClass(), "rank", 0);
        setIntField(term275551, term275551.getClass(), "maxCombo", 0);
        setIntField(term275551, term275551.getClass(), "maxChain", 0);
        setIntField(term275551, term275551.getClass(), "rateTap", 0);
        setIntField(term275551, term275551.getClass(), "rateHold", 0);
        setIntField(term275551, term275551.getClass(), "rateSlide", 0);
        setIntField(term275551, term275551.getClass(), "rateAir", 0);
        setIntField(term275551, term275551.getClass(), "rateFlick", 0);
        setIntField(term275551, term275551.getClass(), "judgeGuilty", 0);
        setIntField(term275551, term275551.getClass(), "judgeAttack", 0);
        setIntField(term275551, term275551.getClass(), "judgeJustice", 0);
        setIntField(term275551, term275551.getClass(), "judgeCritical", 0);
        setIntField(term275551, term275551.getClass(), "eventId", 0);
        setIntField(term275551, term275551.getClass(), "playerRating", 0);
        setBooleanField(term275551, term275551.getClass(), "isNewRecord", false);
        setBooleanField(term275551, term275551.getClass(), "isFullCombo", false);
        setIntField(term275551, term275551.getClass(), "fullChainKind", 0);
        setBooleanField(term275551, term275551.getClass(), "isAllJustice", false);
        setBooleanField(term275551, term275551.getClass(), "isContinue", false);
        setBooleanField(term275551, term275551.getClass(), "isFreeToPlay", false);
        setIntField(term275551, term275551.getClass(), "characterId", 0);
        setIntField(term275551, term275551.getClass(), "skillId", 0);
        setIntField(term275551, term275551.getClass(), "playKind", 0);
        setBooleanField(term275551, term275551.getClass(), "isClear", false);
        setIntField(term275551, term275551.getClass(), "skillLevel", 0);
        setIntField(term275551, term275551.getClass(), "skillEffect", 0);
        setField(term275551, term275551.getClass(), "placeName", null);
        setBooleanField(term275551, term275551.getClass(), "isMaimai", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlaceName", argTypes, term275551, args);
    }

};


