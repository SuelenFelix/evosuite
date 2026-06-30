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

public class UserPlaylog_toString_1526662534219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278263;

    public UserPlaylog_toString_1526662534219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term278263 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term278263, term278263.getClass(), "id", 0L);
        setField(term278263, term278263.getClass(), "user", null);
        setIntField(term278263, term278263.getClass(), "orderId", 0);
        setIntField(term278263, term278263.getClass(), "sortNumber", 0);
        setIntField(term278263, term278263.getClass(), "placeId", 0);
        setField(term278263, term278263.getClass(), "playDate", null);
        setField(term278263, term278263.getClass(), "userPlayDate", null);
        setIntField(term278263, term278263.getClass(), "musicId", 0);
        setIntField(term278263, term278263.getClass(), "level", 0);
        setIntField(term278263, term278263.getClass(), "customId", 0);
        setIntField(term278263, term278263.getClass(), "playedUserId1", 0);
        setIntField(term278263, term278263.getClass(), "playedUserId2", 0);
        setIntField(term278263, term278263.getClass(), "playedUserId3", 0);
        setField(term278263, term278263.getClass(), "playedUserName1", null);
        setField(term278263, term278263.getClass(), "playedUserName2", null);
        setField(term278263, term278263.getClass(), "playedUserName3", null);
        setIntField(term278263, term278263.getClass(), "playedMusicLevel1", 0);
        setIntField(term278263, term278263.getClass(), "playedMusicLevel2", 0);
        setIntField(term278263, term278263.getClass(), "playedMusicLevel3", 0);
        setIntField(term278263, term278263.getClass(), "playedCustom1", 0);
        setIntField(term278263, term278263.getClass(), "playedCustom2", 0);
        setIntField(term278263, term278263.getClass(), "playedCustom3", 0);
        setIntField(term278263, term278263.getClass(), "track", 0);
        setIntField(term278263, term278263.getClass(), "score", 0);
        setIntField(term278263, term278263.getClass(), "rank", 0);
        setIntField(term278263, term278263.getClass(), "maxCombo", 0);
        setIntField(term278263, term278263.getClass(), "maxChain", 0);
        setIntField(term278263, term278263.getClass(), "rateTap", 0);
        setIntField(term278263, term278263.getClass(), "rateHold", 0);
        setIntField(term278263, term278263.getClass(), "rateSlide", 0);
        setIntField(term278263, term278263.getClass(), "rateAir", 0);
        setIntField(term278263, term278263.getClass(), "rateFlick", 0);
        setIntField(term278263, term278263.getClass(), "judgeGuilty", 0);
        setIntField(term278263, term278263.getClass(), "judgeAttack", 0);
        setIntField(term278263, term278263.getClass(), "judgeJustice", 0);
        setIntField(term278263, term278263.getClass(), "judgeCritical", 0);
        setIntField(term278263, term278263.getClass(), "eventId", 0);
        setIntField(term278263, term278263.getClass(), "playerRating", 0);
        setBooleanField(term278263, term278263.getClass(), "isNewRecord", false);
        setBooleanField(term278263, term278263.getClass(), "isFullCombo", false);
        setIntField(term278263, term278263.getClass(), "fullChainKind", 0);
        setBooleanField(term278263, term278263.getClass(), "isAllJustice", false);
        setBooleanField(term278263, term278263.getClass(), "isContinue", false);
        setBooleanField(term278263, term278263.getClass(), "isFreeToPlay", false);
        setIntField(term278263, term278263.getClass(), "characterId", 0);
        setIntField(term278263, term278263.getClass(), "skillId", 0);
        setIntField(term278263, term278263.getClass(), "playKind", 0);
        setBooleanField(term278263, term278263.getClass(), "isClear", false);
        setIntField(term278263, term278263.getClass(), "skillLevel", 0);
        setIntField(term278263, term278263.getClass(), "skillEffect", 0);
        setField(term278263, term278263.getClass(), "placeName", null);
        setBooleanField(term278263, term278263.getClass(), "isMaimai", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term278263, args);
    }

};


