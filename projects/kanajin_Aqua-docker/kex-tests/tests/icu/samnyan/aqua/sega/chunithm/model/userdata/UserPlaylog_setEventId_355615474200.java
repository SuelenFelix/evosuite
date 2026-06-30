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
import java.lang.Integer;

public class UserPlaylog_setEventId_355615474200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277359;
     Object term277405;

    public UserPlaylog_setEventId_355615474200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277359 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term277359, term277359.getClass(), "id", 0L);
        setField(term277359, term277359.getClass(), "user", null);
        setIntField(term277359, term277359.getClass(), "orderId", 0);
        setIntField(term277359, term277359.getClass(), "sortNumber", 0);
        setIntField(term277359, term277359.getClass(), "placeId", 0);
        setField(term277359, term277359.getClass(), "playDate", null);
        setField(term277359, term277359.getClass(), "userPlayDate", null);
        setIntField(term277359, term277359.getClass(), "musicId", 0);
        setIntField(term277359, term277359.getClass(), "level", 0);
        setIntField(term277359, term277359.getClass(), "customId", 0);
        setIntField(term277359, term277359.getClass(), "playedUserId1", 0);
        setIntField(term277359, term277359.getClass(), "playedUserId2", 0);
        setIntField(term277359, term277359.getClass(), "playedUserId3", 0);
        setField(term277359, term277359.getClass(), "playedUserName1", null);
        setField(term277359, term277359.getClass(), "playedUserName2", null);
        setField(term277359, term277359.getClass(), "playedUserName3", null);
        setIntField(term277359, term277359.getClass(), "playedMusicLevel1", 0);
        setIntField(term277359, term277359.getClass(), "playedMusicLevel2", 0);
        setIntField(term277359, term277359.getClass(), "playedMusicLevel3", 0);
        setIntField(term277359, term277359.getClass(), "playedCustom1", 0);
        setIntField(term277359, term277359.getClass(), "playedCustom2", 0);
        setIntField(term277359, term277359.getClass(), "playedCustom3", 0);
        setIntField(term277359, term277359.getClass(), "track", 0);
        setIntField(term277359, term277359.getClass(), "score", 0);
        setIntField(term277359, term277359.getClass(), "rank", 0);
        setIntField(term277359, term277359.getClass(), "maxCombo", 0);
        setIntField(term277359, term277359.getClass(), "maxChain", 0);
        setIntField(term277359, term277359.getClass(), "rateTap", 0);
        setIntField(term277359, term277359.getClass(), "rateHold", 0);
        setIntField(term277359, term277359.getClass(), "rateSlide", 0);
        setIntField(term277359, term277359.getClass(), "rateAir", 0);
        setIntField(term277359, term277359.getClass(), "rateFlick", 0);
        setIntField(term277359, term277359.getClass(), "judgeGuilty", 0);
        setIntField(term277359, term277359.getClass(), "judgeAttack", 0);
        setIntField(term277359, term277359.getClass(), "judgeJustice", 0);
        setIntField(term277359, term277359.getClass(), "judgeCritical", 0);
        setIntField(term277359, term277359.getClass(), "eventId", 0);
        setIntField(term277359, term277359.getClass(), "playerRating", 0);
        setBooleanField(term277359, term277359.getClass(), "isNewRecord", false);
        setBooleanField(term277359, term277359.getClass(), "isFullCombo", false);
        setIntField(term277359, term277359.getClass(), "fullChainKind", 0);
        setBooleanField(term277359, term277359.getClass(), "isAllJustice", false);
        setBooleanField(term277359, term277359.getClass(), "isContinue", false);
        setBooleanField(term277359, term277359.getClass(), "isFreeToPlay", false);
        setIntField(term277359, term277359.getClass(), "characterId", 0);
        setIntField(term277359, term277359.getClass(), "skillId", 0);
        setIntField(term277359, term277359.getClass(), "playKind", 0);
        setBooleanField(term277359, term277359.getClass(), "isClear", false);
        setIntField(term277359, term277359.getClass(), "skillLevel", 0);
        setIntField(term277359, term277359.getClass(), "skillEffect", 0);
        setField(term277359, term277359.getClass(), "placeName", null);
        setBooleanField(term277359, term277359.getClass(), "isMaimai", false);
        term277405 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term277405;
        callMethod(klass, "setEventId", argTypes, term277359, args);
    }

};


