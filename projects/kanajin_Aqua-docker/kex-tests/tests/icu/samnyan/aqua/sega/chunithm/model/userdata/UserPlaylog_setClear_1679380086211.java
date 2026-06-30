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
import java.lang.Boolean;

public class UserPlaylog_setClear_1679380086211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277887;
     Object term277933;

    public UserPlaylog_setClear_1679380086211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277887 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term277887, term277887.getClass(), "id", 0L);
        setField(term277887, term277887.getClass(), "user", null);
        setIntField(term277887, term277887.getClass(), "orderId", 0);
        setIntField(term277887, term277887.getClass(), "sortNumber", 0);
        setIntField(term277887, term277887.getClass(), "placeId", 0);
        setField(term277887, term277887.getClass(), "playDate", null);
        setField(term277887, term277887.getClass(), "userPlayDate", null);
        setIntField(term277887, term277887.getClass(), "musicId", 0);
        setIntField(term277887, term277887.getClass(), "level", 0);
        setIntField(term277887, term277887.getClass(), "customId", 0);
        setIntField(term277887, term277887.getClass(), "playedUserId1", 0);
        setIntField(term277887, term277887.getClass(), "playedUserId2", 0);
        setIntField(term277887, term277887.getClass(), "playedUserId3", 0);
        setField(term277887, term277887.getClass(), "playedUserName1", null);
        setField(term277887, term277887.getClass(), "playedUserName2", null);
        setField(term277887, term277887.getClass(), "playedUserName3", null);
        setIntField(term277887, term277887.getClass(), "playedMusicLevel1", 0);
        setIntField(term277887, term277887.getClass(), "playedMusicLevel2", 0);
        setIntField(term277887, term277887.getClass(), "playedMusicLevel3", 0);
        setIntField(term277887, term277887.getClass(), "playedCustom1", 0);
        setIntField(term277887, term277887.getClass(), "playedCustom2", 0);
        setIntField(term277887, term277887.getClass(), "playedCustom3", 0);
        setIntField(term277887, term277887.getClass(), "track", 0);
        setIntField(term277887, term277887.getClass(), "score", 0);
        setIntField(term277887, term277887.getClass(), "rank", 0);
        setIntField(term277887, term277887.getClass(), "maxCombo", 0);
        setIntField(term277887, term277887.getClass(), "maxChain", 0);
        setIntField(term277887, term277887.getClass(), "rateTap", 0);
        setIntField(term277887, term277887.getClass(), "rateHold", 0);
        setIntField(term277887, term277887.getClass(), "rateSlide", 0);
        setIntField(term277887, term277887.getClass(), "rateAir", 0);
        setIntField(term277887, term277887.getClass(), "rateFlick", 0);
        setIntField(term277887, term277887.getClass(), "judgeGuilty", 0);
        setIntField(term277887, term277887.getClass(), "judgeAttack", 0);
        setIntField(term277887, term277887.getClass(), "judgeJustice", 0);
        setIntField(term277887, term277887.getClass(), "judgeCritical", 0);
        setIntField(term277887, term277887.getClass(), "eventId", 0);
        setIntField(term277887, term277887.getClass(), "playerRating", 0);
        setBooleanField(term277887, term277887.getClass(), "isNewRecord", false);
        setBooleanField(term277887, term277887.getClass(), "isFullCombo", false);
        setIntField(term277887, term277887.getClass(), "fullChainKind", 0);
        setBooleanField(term277887, term277887.getClass(), "isAllJustice", false);
        setBooleanField(term277887, term277887.getClass(), "isContinue", false);
        setBooleanField(term277887, term277887.getClass(), "isFreeToPlay", false);
        setIntField(term277887, term277887.getClass(), "characterId", 0);
        setIntField(term277887, term277887.getClass(), "skillId", 0);
        setIntField(term277887, term277887.getClass(), "playKind", 0);
        setBooleanField(term277887, term277887.getClass(), "isClear", false);
        setIntField(term277887, term277887.getClass(), "skillLevel", 0);
        setIntField(term277887, term277887.getClass(), "skillEffect", 0);
        setField(term277887, term277887.getClass(), "placeName", null);
        setBooleanField(term277887, term277887.getClass(), "isMaimai", false);
        term277933 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term277933;
        callMethod(klass, "setClear", argTypes, term277887, args);
    }

};


