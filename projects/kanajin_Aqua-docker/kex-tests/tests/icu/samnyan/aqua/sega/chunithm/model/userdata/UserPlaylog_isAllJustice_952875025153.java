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

public class UserPlaylog_isAllJustice_952875025153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275137;

    public UserPlaylog_isAllJustice_952875025153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term275137 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term275137, term275137.getClass(), "id", 0L);
        setField(term275137, term275137.getClass(), "user", null);
        setIntField(term275137, term275137.getClass(), "orderId", 0);
        setIntField(term275137, term275137.getClass(), "sortNumber", 0);
        setIntField(term275137, term275137.getClass(), "placeId", 0);
        setField(term275137, term275137.getClass(), "playDate", null);
        setField(term275137, term275137.getClass(), "userPlayDate", null);
        setIntField(term275137, term275137.getClass(), "musicId", 0);
        setIntField(term275137, term275137.getClass(), "level", 0);
        setIntField(term275137, term275137.getClass(), "customId", 0);
        setIntField(term275137, term275137.getClass(), "playedUserId1", 0);
        setIntField(term275137, term275137.getClass(), "playedUserId2", 0);
        setIntField(term275137, term275137.getClass(), "playedUserId3", 0);
        setField(term275137, term275137.getClass(), "playedUserName1", null);
        setField(term275137, term275137.getClass(), "playedUserName2", null);
        setField(term275137, term275137.getClass(), "playedUserName3", null);
        setIntField(term275137, term275137.getClass(), "playedMusicLevel1", 0);
        setIntField(term275137, term275137.getClass(), "playedMusicLevel2", 0);
        setIntField(term275137, term275137.getClass(), "playedMusicLevel3", 0);
        setIntField(term275137, term275137.getClass(), "playedCustom1", 0);
        setIntField(term275137, term275137.getClass(), "playedCustom2", 0);
        setIntField(term275137, term275137.getClass(), "playedCustom3", 0);
        setIntField(term275137, term275137.getClass(), "track", 0);
        setIntField(term275137, term275137.getClass(), "score", 0);
        setIntField(term275137, term275137.getClass(), "rank", 0);
        setIntField(term275137, term275137.getClass(), "maxCombo", 0);
        setIntField(term275137, term275137.getClass(), "maxChain", 0);
        setIntField(term275137, term275137.getClass(), "rateTap", 0);
        setIntField(term275137, term275137.getClass(), "rateHold", 0);
        setIntField(term275137, term275137.getClass(), "rateSlide", 0);
        setIntField(term275137, term275137.getClass(), "rateAir", 0);
        setIntField(term275137, term275137.getClass(), "rateFlick", 0);
        setIntField(term275137, term275137.getClass(), "judgeGuilty", 0);
        setIntField(term275137, term275137.getClass(), "judgeAttack", 0);
        setIntField(term275137, term275137.getClass(), "judgeJustice", 0);
        setIntField(term275137, term275137.getClass(), "judgeCritical", 0);
        setIntField(term275137, term275137.getClass(), "eventId", 0);
        setIntField(term275137, term275137.getClass(), "playerRating", 0);
        setBooleanField(term275137, term275137.getClass(), "isNewRecord", false);
        setBooleanField(term275137, term275137.getClass(), "isFullCombo", false);
        setIntField(term275137, term275137.getClass(), "fullChainKind", 0);
        setBooleanField(term275137, term275137.getClass(), "isAllJustice", false);
        setBooleanField(term275137, term275137.getClass(), "isContinue", false);
        setBooleanField(term275137, term275137.getClass(), "isFreeToPlay", false);
        setIntField(term275137, term275137.getClass(), "characterId", 0);
        setIntField(term275137, term275137.getClass(), "skillId", 0);
        setIntField(term275137, term275137.getClass(), "playKind", 0);
        setBooleanField(term275137, term275137.getClass(), "isClear", false);
        setIntField(term275137, term275137.getClass(), "skillLevel", 0);
        setIntField(term275137, term275137.getClass(), "skillEffect", 0);
        setField(term275137, term275137.getClass(), "placeName", null);
        setBooleanField(term275137, term275137.getClass(), "isMaimai", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAllJustice", argTypes, term275137, args);
    }

};


