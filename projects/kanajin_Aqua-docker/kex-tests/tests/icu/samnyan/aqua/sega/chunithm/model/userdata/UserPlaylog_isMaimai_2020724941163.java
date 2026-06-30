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

public class UserPlaylog_isMaimai_2020724941163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275597;

    public UserPlaylog_isMaimai_2020724941163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term275597 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term275597, term275597.getClass(), "id", 0L);
        setField(term275597, term275597.getClass(), "user", null);
        setIntField(term275597, term275597.getClass(), "orderId", 0);
        setIntField(term275597, term275597.getClass(), "sortNumber", 0);
        setIntField(term275597, term275597.getClass(), "placeId", 0);
        setField(term275597, term275597.getClass(), "playDate", null);
        setField(term275597, term275597.getClass(), "userPlayDate", null);
        setIntField(term275597, term275597.getClass(), "musicId", 0);
        setIntField(term275597, term275597.getClass(), "level", 0);
        setIntField(term275597, term275597.getClass(), "customId", 0);
        setIntField(term275597, term275597.getClass(), "playedUserId1", 0);
        setIntField(term275597, term275597.getClass(), "playedUserId2", 0);
        setIntField(term275597, term275597.getClass(), "playedUserId3", 0);
        setField(term275597, term275597.getClass(), "playedUserName1", null);
        setField(term275597, term275597.getClass(), "playedUserName2", null);
        setField(term275597, term275597.getClass(), "playedUserName3", null);
        setIntField(term275597, term275597.getClass(), "playedMusicLevel1", 0);
        setIntField(term275597, term275597.getClass(), "playedMusicLevel2", 0);
        setIntField(term275597, term275597.getClass(), "playedMusicLevel3", 0);
        setIntField(term275597, term275597.getClass(), "playedCustom1", 0);
        setIntField(term275597, term275597.getClass(), "playedCustom2", 0);
        setIntField(term275597, term275597.getClass(), "playedCustom3", 0);
        setIntField(term275597, term275597.getClass(), "track", 0);
        setIntField(term275597, term275597.getClass(), "score", 0);
        setIntField(term275597, term275597.getClass(), "rank", 0);
        setIntField(term275597, term275597.getClass(), "maxCombo", 0);
        setIntField(term275597, term275597.getClass(), "maxChain", 0);
        setIntField(term275597, term275597.getClass(), "rateTap", 0);
        setIntField(term275597, term275597.getClass(), "rateHold", 0);
        setIntField(term275597, term275597.getClass(), "rateSlide", 0);
        setIntField(term275597, term275597.getClass(), "rateAir", 0);
        setIntField(term275597, term275597.getClass(), "rateFlick", 0);
        setIntField(term275597, term275597.getClass(), "judgeGuilty", 0);
        setIntField(term275597, term275597.getClass(), "judgeAttack", 0);
        setIntField(term275597, term275597.getClass(), "judgeJustice", 0);
        setIntField(term275597, term275597.getClass(), "judgeCritical", 0);
        setIntField(term275597, term275597.getClass(), "eventId", 0);
        setIntField(term275597, term275597.getClass(), "playerRating", 0);
        setBooleanField(term275597, term275597.getClass(), "isNewRecord", false);
        setBooleanField(term275597, term275597.getClass(), "isFullCombo", false);
        setIntField(term275597, term275597.getClass(), "fullChainKind", 0);
        setBooleanField(term275597, term275597.getClass(), "isAllJustice", false);
        setBooleanField(term275597, term275597.getClass(), "isContinue", false);
        setBooleanField(term275597, term275597.getClass(), "isFreeToPlay", false);
        setIntField(term275597, term275597.getClass(), "characterId", 0);
        setIntField(term275597, term275597.getClass(), "skillId", 0);
        setIntField(term275597, term275597.getClass(), "playKind", 0);
        setBooleanField(term275597, term275597.getClass(), "isClear", false);
        setIntField(term275597, term275597.getClass(), "skillLevel", 0);
        setIntField(term275597, term275597.getClass(), "skillEffect", 0);
        setField(term275597, term275597.getClass(), "placeName", null);
        setBooleanField(term275597, term275597.getClass(), "isMaimai", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isMaimai", argTypes, term275597, args);
    }

};


