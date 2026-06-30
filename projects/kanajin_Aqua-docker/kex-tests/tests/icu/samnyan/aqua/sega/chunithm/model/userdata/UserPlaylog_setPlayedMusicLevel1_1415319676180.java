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

public class UserPlaylog_setPlayedMusicLevel1_1415319676180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276399;
     Object term276445;

    public UserPlaylog_setPlayedMusicLevel1_1415319676180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276399 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term276399, term276399.getClass(), "id", 0L);
        setField(term276399, term276399.getClass(), "user", null);
        setIntField(term276399, term276399.getClass(), "orderId", 0);
        setIntField(term276399, term276399.getClass(), "sortNumber", 0);
        setIntField(term276399, term276399.getClass(), "placeId", 0);
        setField(term276399, term276399.getClass(), "playDate", null);
        setField(term276399, term276399.getClass(), "userPlayDate", null);
        setIntField(term276399, term276399.getClass(), "musicId", 0);
        setIntField(term276399, term276399.getClass(), "level", 0);
        setIntField(term276399, term276399.getClass(), "customId", 0);
        setIntField(term276399, term276399.getClass(), "playedUserId1", 0);
        setIntField(term276399, term276399.getClass(), "playedUserId2", 0);
        setIntField(term276399, term276399.getClass(), "playedUserId3", 0);
        setField(term276399, term276399.getClass(), "playedUserName1", null);
        setField(term276399, term276399.getClass(), "playedUserName2", null);
        setField(term276399, term276399.getClass(), "playedUserName3", null);
        setIntField(term276399, term276399.getClass(), "playedMusicLevel1", 0);
        setIntField(term276399, term276399.getClass(), "playedMusicLevel2", 0);
        setIntField(term276399, term276399.getClass(), "playedMusicLevel3", 0);
        setIntField(term276399, term276399.getClass(), "playedCustom1", 0);
        setIntField(term276399, term276399.getClass(), "playedCustom2", 0);
        setIntField(term276399, term276399.getClass(), "playedCustom3", 0);
        setIntField(term276399, term276399.getClass(), "track", 0);
        setIntField(term276399, term276399.getClass(), "score", 0);
        setIntField(term276399, term276399.getClass(), "rank", 0);
        setIntField(term276399, term276399.getClass(), "maxCombo", 0);
        setIntField(term276399, term276399.getClass(), "maxChain", 0);
        setIntField(term276399, term276399.getClass(), "rateTap", 0);
        setIntField(term276399, term276399.getClass(), "rateHold", 0);
        setIntField(term276399, term276399.getClass(), "rateSlide", 0);
        setIntField(term276399, term276399.getClass(), "rateAir", 0);
        setIntField(term276399, term276399.getClass(), "rateFlick", 0);
        setIntField(term276399, term276399.getClass(), "judgeGuilty", 0);
        setIntField(term276399, term276399.getClass(), "judgeAttack", 0);
        setIntField(term276399, term276399.getClass(), "judgeJustice", 0);
        setIntField(term276399, term276399.getClass(), "judgeCritical", 0);
        setIntField(term276399, term276399.getClass(), "eventId", 0);
        setIntField(term276399, term276399.getClass(), "playerRating", 0);
        setBooleanField(term276399, term276399.getClass(), "isNewRecord", false);
        setBooleanField(term276399, term276399.getClass(), "isFullCombo", false);
        setIntField(term276399, term276399.getClass(), "fullChainKind", 0);
        setBooleanField(term276399, term276399.getClass(), "isAllJustice", false);
        setBooleanField(term276399, term276399.getClass(), "isContinue", false);
        setBooleanField(term276399, term276399.getClass(), "isFreeToPlay", false);
        setIntField(term276399, term276399.getClass(), "characterId", 0);
        setIntField(term276399, term276399.getClass(), "skillId", 0);
        setIntField(term276399, term276399.getClass(), "playKind", 0);
        setBooleanField(term276399, term276399.getClass(), "isClear", false);
        setIntField(term276399, term276399.getClass(), "skillLevel", 0);
        setIntField(term276399, term276399.getClass(), "skillEffect", 0);
        setField(term276399, term276399.getClass(), "placeName", null);
        setBooleanField(term276399, term276399.getClass(), "isMaimai", false);
        term276445 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term276445;
        callMethod(klass, "setPlayedMusicLevel1", argTypes, term276399, args);
    }

};


