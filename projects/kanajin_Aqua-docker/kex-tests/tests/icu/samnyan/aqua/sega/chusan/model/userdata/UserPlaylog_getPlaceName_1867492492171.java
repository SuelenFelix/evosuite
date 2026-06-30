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

public class UserPlaylog_getPlaceName_1867492492171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term460844;

    public UserPlaylog_getPlaceName_1867492492171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term460844 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog"));
        setLongField(term460844, term460844.getClass(), "id", 0L);
        setField(term460844, term460844.getClass(), "user", null);
        setField(term460844, term460844.getClass(), "romVersion", null);
        setIntField(term460844, term460844.getClass(), "orderId", 0);
        setIntField(term460844, term460844.getClass(), "sortNumber", 0);
        setIntField(term460844, term460844.getClass(), "placeId", 0);
        setField(term460844, term460844.getClass(), "playDate", null);
        setField(term460844, term460844.getClass(), "userPlayDate", null);
        setIntField(term460844, term460844.getClass(), "musicId", 0);
        setIntField(term460844, term460844.getClass(), "level", 0);
        setIntField(term460844, term460844.getClass(), "customId", 0);
        setIntField(term460844, term460844.getClass(), "playedUserId1", 0);
        setIntField(term460844, term460844.getClass(), "playedUserId2", 0);
        setIntField(term460844, term460844.getClass(), "playedUserId3", 0);
        setField(term460844, term460844.getClass(), "playedUserName1", null);
        setField(term460844, term460844.getClass(), "playedUserName2", null);
        setField(term460844, term460844.getClass(), "playedUserName3", null);
        setIntField(term460844, term460844.getClass(), "playedMusicLevel1", 0);
        setIntField(term460844, term460844.getClass(), "playedMusicLevel2", 0);
        setIntField(term460844, term460844.getClass(), "playedMusicLevel3", 0);
        setIntField(term460844, term460844.getClass(), "playedCustom1", 0);
        setIntField(term460844, term460844.getClass(), "playedCustom2", 0);
        setIntField(term460844, term460844.getClass(), "playedCustom3", 0);
        setIntField(term460844, term460844.getClass(), "track", 0);
        setIntField(term460844, term460844.getClass(), "score", 0);
        setIntField(term460844, term460844.getClass(), "rank", 0);
        setIntField(term460844, term460844.getClass(), "maxCombo", 0);
        setIntField(term460844, term460844.getClass(), "maxChain", 0);
        setIntField(term460844, term460844.getClass(), "rateTap", 0);
        setIntField(term460844, term460844.getClass(), "rateHold", 0);
        setIntField(term460844, term460844.getClass(), "rateSlide", 0);
        setIntField(term460844, term460844.getClass(), "rateAir", 0);
        setIntField(term460844, term460844.getClass(), "rateFlick", 0);
        setIntField(term460844, term460844.getClass(), "judgeGuilty", 0);
        setIntField(term460844, term460844.getClass(), "judgeAttack", 0);
        setIntField(term460844, term460844.getClass(), "judgeJustice", 0);
        setIntField(term460844, term460844.getClass(), "judgeCritical", 0);
        setIntField(term460844, term460844.getClass(), "judgeHeaven", 0);
        setIntField(term460844, term460844.getClass(), "eventId", 0);
        setIntField(term460844, term460844.getClass(), "playerRating", 0);
        setBooleanField(term460844, term460844.getClass(), "isNewRecord", false);
        setBooleanField(term460844, term460844.getClass(), "isFullCombo", false);
        setIntField(term460844, term460844.getClass(), "fullChainKind", 0);
        setBooleanField(term460844, term460844.getClass(), "isAllJustice", false);
        setBooleanField(term460844, term460844.getClass(), "isContinue", false);
        setBooleanField(term460844, term460844.getClass(), "isFreeToPlay", false);
        setIntField(term460844, term460844.getClass(), "characterId", 0);
        setIntField(term460844, term460844.getClass(), "charaIllustId", 0);
        setIntField(term460844, term460844.getClass(), "skillId", 0);
        setIntField(term460844, term460844.getClass(), "playKind", 0);
        setBooleanField(term460844, term460844.getClass(), "isClear", false);
        setIntField(term460844, term460844.getClass(), "skillLevel", 0);
        setIntField(term460844, term460844.getClass(), "skillEffect", 0);
        setField(term460844, term460844.getClass(), "placeName", null);
        setIntField(term460844, term460844.getClass(), "commonId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlaceName", argTypes, term460844, args);
    }

};


