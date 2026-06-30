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

public class UserPlaylog_setRateHold_1017621792192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276975;
     Object term277021;

    public UserPlaylog_setRateHold_1017621792192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276975 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term276975, term276975.getClass(), "id", 0L);
        setField(term276975, term276975.getClass(), "user", null);
        setIntField(term276975, term276975.getClass(), "orderId", 0);
        setIntField(term276975, term276975.getClass(), "sortNumber", 0);
        setIntField(term276975, term276975.getClass(), "placeId", 0);
        setField(term276975, term276975.getClass(), "playDate", null);
        setField(term276975, term276975.getClass(), "userPlayDate", null);
        setIntField(term276975, term276975.getClass(), "musicId", 0);
        setIntField(term276975, term276975.getClass(), "level", 0);
        setIntField(term276975, term276975.getClass(), "customId", 0);
        setIntField(term276975, term276975.getClass(), "playedUserId1", 0);
        setIntField(term276975, term276975.getClass(), "playedUserId2", 0);
        setIntField(term276975, term276975.getClass(), "playedUserId3", 0);
        setField(term276975, term276975.getClass(), "playedUserName1", null);
        setField(term276975, term276975.getClass(), "playedUserName2", null);
        setField(term276975, term276975.getClass(), "playedUserName3", null);
        setIntField(term276975, term276975.getClass(), "playedMusicLevel1", 0);
        setIntField(term276975, term276975.getClass(), "playedMusicLevel2", 0);
        setIntField(term276975, term276975.getClass(), "playedMusicLevel3", 0);
        setIntField(term276975, term276975.getClass(), "playedCustom1", 0);
        setIntField(term276975, term276975.getClass(), "playedCustom2", 0);
        setIntField(term276975, term276975.getClass(), "playedCustom3", 0);
        setIntField(term276975, term276975.getClass(), "track", 0);
        setIntField(term276975, term276975.getClass(), "score", 0);
        setIntField(term276975, term276975.getClass(), "rank", 0);
        setIntField(term276975, term276975.getClass(), "maxCombo", 0);
        setIntField(term276975, term276975.getClass(), "maxChain", 0);
        setIntField(term276975, term276975.getClass(), "rateTap", 0);
        setIntField(term276975, term276975.getClass(), "rateHold", 0);
        setIntField(term276975, term276975.getClass(), "rateSlide", 0);
        setIntField(term276975, term276975.getClass(), "rateAir", 0);
        setIntField(term276975, term276975.getClass(), "rateFlick", 0);
        setIntField(term276975, term276975.getClass(), "judgeGuilty", 0);
        setIntField(term276975, term276975.getClass(), "judgeAttack", 0);
        setIntField(term276975, term276975.getClass(), "judgeJustice", 0);
        setIntField(term276975, term276975.getClass(), "judgeCritical", 0);
        setIntField(term276975, term276975.getClass(), "eventId", 0);
        setIntField(term276975, term276975.getClass(), "playerRating", 0);
        setBooleanField(term276975, term276975.getClass(), "isNewRecord", false);
        setBooleanField(term276975, term276975.getClass(), "isFullCombo", false);
        setIntField(term276975, term276975.getClass(), "fullChainKind", 0);
        setBooleanField(term276975, term276975.getClass(), "isAllJustice", false);
        setBooleanField(term276975, term276975.getClass(), "isContinue", false);
        setBooleanField(term276975, term276975.getClass(), "isFreeToPlay", false);
        setIntField(term276975, term276975.getClass(), "characterId", 0);
        setIntField(term276975, term276975.getClass(), "skillId", 0);
        setIntField(term276975, term276975.getClass(), "playKind", 0);
        setBooleanField(term276975, term276975.getClass(), "isClear", false);
        setIntField(term276975, term276975.getClass(), "skillLevel", 0);
        setIntField(term276975, term276975.getClass(), "skillEffect", 0);
        setField(term276975, term276975.getClass(), "placeName", null);
        setBooleanField(term276975, term276975.getClass(), "isMaimai", false);
        term277021 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term277021;
        callMethod(klass, "setRateHold", argTypes, term276975, args);
    }

};


