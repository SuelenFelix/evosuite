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

public class UserPlaylog_setPlayKind_605471241210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277839;
     Object term277885;

    public UserPlaylog_setPlayKind_605471241210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277839 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term277839, term277839.getClass(), "id", 0L);
        setField(term277839, term277839.getClass(), "user", null);
        setIntField(term277839, term277839.getClass(), "orderId", 0);
        setIntField(term277839, term277839.getClass(), "sortNumber", 0);
        setIntField(term277839, term277839.getClass(), "placeId", 0);
        setField(term277839, term277839.getClass(), "playDate", null);
        setField(term277839, term277839.getClass(), "userPlayDate", null);
        setIntField(term277839, term277839.getClass(), "musicId", 0);
        setIntField(term277839, term277839.getClass(), "level", 0);
        setIntField(term277839, term277839.getClass(), "customId", 0);
        setIntField(term277839, term277839.getClass(), "playedUserId1", 0);
        setIntField(term277839, term277839.getClass(), "playedUserId2", 0);
        setIntField(term277839, term277839.getClass(), "playedUserId3", 0);
        setField(term277839, term277839.getClass(), "playedUserName1", null);
        setField(term277839, term277839.getClass(), "playedUserName2", null);
        setField(term277839, term277839.getClass(), "playedUserName3", null);
        setIntField(term277839, term277839.getClass(), "playedMusicLevel1", 0);
        setIntField(term277839, term277839.getClass(), "playedMusicLevel2", 0);
        setIntField(term277839, term277839.getClass(), "playedMusicLevel3", 0);
        setIntField(term277839, term277839.getClass(), "playedCustom1", 0);
        setIntField(term277839, term277839.getClass(), "playedCustom2", 0);
        setIntField(term277839, term277839.getClass(), "playedCustom3", 0);
        setIntField(term277839, term277839.getClass(), "track", 0);
        setIntField(term277839, term277839.getClass(), "score", 0);
        setIntField(term277839, term277839.getClass(), "rank", 0);
        setIntField(term277839, term277839.getClass(), "maxCombo", 0);
        setIntField(term277839, term277839.getClass(), "maxChain", 0);
        setIntField(term277839, term277839.getClass(), "rateTap", 0);
        setIntField(term277839, term277839.getClass(), "rateHold", 0);
        setIntField(term277839, term277839.getClass(), "rateSlide", 0);
        setIntField(term277839, term277839.getClass(), "rateAir", 0);
        setIntField(term277839, term277839.getClass(), "rateFlick", 0);
        setIntField(term277839, term277839.getClass(), "judgeGuilty", 0);
        setIntField(term277839, term277839.getClass(), "judgeAttack", 0);
        setIntField(term277839, term277839.getClass(), "judgeJustice", 0);
        setIntField(term277839, term277839.getClass(), "judgeCritical", 0);
        setIntField(term277839, term277839.getClass(), "eventId", 0);
        setIntField(term277839, term277839.getClass(), "playerRating", 0);
        setBooleanField(term277839, term277839.getClass(), "isNewRecord", false);
        setBooleanField(term277839, term277839.getClass(), "isFullCombo", false);
        setIntField(term277839, term277839.getClass(), "fullChainKind", 0);
        setBooleanField(term277839, term277839.getClass(), "isAllJustice", false);
        setBooleanField(term277839, term277839.getClass(), "isContinue", false);
        setBooleanField(term277839, term277839.getClass(), "isFreeToPlay", false);
        setIntField(term277839, term277839.getClass(), "characterId", 0);
        setIntField(term277839, term277839.getClass(), "skillId", 0);
        setIntField(term277839, term277839.getClass(), "playKind", 0);
        setBooleanField(term277839, term277839.getClass(), "isClear", false);
        setIntField(term277839, term277839.getClass(), "skillLevel", 0);
        setIntField(term277839, term277839.getClass(), "skillEffect", 0);
        setField(term277839, term277839.getClass(), "placeName", null);
        setBooleanField(term277839, term277839.getClass(), "isMaimai", false);
        term277885 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term277885;
        callMethod(klass, "setPlayKind", argTypes, term277839, args);
    }

};


