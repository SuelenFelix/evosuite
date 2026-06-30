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

public class UserPlaylog_setPlayedUserName3_230399870179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276353;

    public UserPlaylog_setPlayedUserName3_230399870179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276353 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term276353, term276353.getClass(), "id", 0L);
        setField(term276353, term276353.getClass(), "user", null);
        setIntField(term276353, term276353.getClass(), "orderId", 0);
        setIntField(term276353, term276353.getClass(), "sortNumber", 0);
        setIntField(term276353, term276353.getClass(), "placeId", 0);
        setField(term276353, term276353.getClass(), "playDate", null);
        setField(term276353, term276353.getClass(), "userPlayDate", null);
        setIntField(term276353, term276353.getClass(), "musicId", 0);
        setIntField(term276353, term276353.getClass(), "level", 0);
        setIntField(term276353, term276353.getClass(), "customId", 0);
        setIntField(term276353, term276353.getClass(), "playedUserId1", 0);
        setIntField(term276353, term276353.getClass(), "playedUserId2", 0);
        setIntField(term276353, term276353.getClass(), "playedUserId3", 0);
        setField(term276353, term276353.getClass(), "playedUserName1", null);
        setField(term276353, term276353.getClass(), "playedUserName2", null);
        setField(term276353, term276353.getClass(), "playedUserName3", null);
        setIntField(term276353, term276353.getClass(), "playedMusicLevel1", 0);
        setIntField(term276353, term276353.getClass(), "playedMusicLevel2", 0);
        setIntField(term276353, term276353.getClass(), "playedMusicLevel3", 0);
        setIntField(term276353, term276353.getClass(), "playedCustom1", 0);
        setIntField(term276353, term276353.getClass(), "playedCustom2", 0);
        setIntField(term276353, term276353.getClass(), "playedCustom3", 0);
        setIntField(term276353, term276353.getClass(), "track", 0);
        setIntField(term276353, term276353.getClass(), "score", 0);
        setIntField(term276353, term276353.getClass(), "rank", 0);
        setIntField(term276353, term276353.getClass(), "maxCombo", 0);
        setIntField(term276353, term276353.getClass(), "maxChain", 0);
        setIntField(term276353, term276353.getClass(), "rateTap", 0);
        setIntField(term276353, term276353.getClass(), "rateHold", 0);
        setIntField(term276353, term276353.getClass(), "rateSlide", 0);
        setIntField(term276353, term276353.getClass(), "rateAir", 0);
        setIntField(term276353, term276353.getClass(), "rateFlick", 0);
        setIntField(term276353, term276353.getClass(), "judgeGuilty", 0);
        setIntField(term276353, term276353.getClass(), "judgeAttack", 0);
        setIntField(term276353, term276353.getClass(), "judgeJustice", 0);
        setIntField(term276353, term276353.getClass(), "judgeCritical", 0);
        setIntField(term276353, term276353.getClass(), "eventId", 0);
        setIntField(term276353, term276353.getClass(), "playerRating", 0);
        setBooleanField(term276353, term276353.getClass(), "isNewRecord", false);
        setBooleanField(term276353, term276353.getClass(), "isFullCombo", false);
        setIntField(term276353, term276353.getClass(), "fullChainKind", 0);
        setBooleanField(term276353, term276353.getClass(), "isAllJustice", false);
        setBooleanField(term276353, term276353.getClass(), "isContinue", false);
        setBooleanField(term276353, term276353.getClass(), "isFreeToPlay", false);
        setIntField(term276353, term276353.getClass(), "characterId", 0);
        setIntField(term276353, term276353.getClass(), "skillId", 0);
        setIntField(term276353, term276353.getClass(), "playKind", 0);
        setBooleanField(term276353, term276353.getClass(), "isClear", false);
        setIntField(term276353, term276353.getClass(), "skillLevel", 0);
        setIntField(term276353, term276353.getClass(), "skillEffect", 0);
        setField(term276353, term276353.getClass(), "placeName", null);
        setBooleanField(term276353, term276353.getClass(), "isMaimai", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlayedUserName3", argTypes, term276353, args);
    }

};


