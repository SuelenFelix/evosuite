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

public class UserPlaylog_canEqual_236946460217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278171;

    public UserPlaylog_canEqual_236946460217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term278171 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term278171, term278171.getClass(), "id", 0L);
        setField(term278171, term278171.getClass(), "user", null);
        setIntField(term278171, term278171.getClass(), "orderId", 0);
        setIntField(term278171, term278171.getClass(), "sortNumber", 0);
        setIntField(term278171, term278171.getClass(), "placeId", 0);
        setField(term278171, term278171.getClass(), "playDate", null);
        setField(term278171, term278171.getClass(), "userPlayDate", null);
        setIntField(term278171, term278171.getClass(), "musicId", 0);
        setIntField(term278171, term278171.getClass(), "level", 0);
        setIntField(term278171, term278171.getClass(), "customId", 0);
        setIntField(term278171, term278171.getClass(), "playedUserId1", 0);
        setIntField(term278171, term278171.getClass(), "playedUserId2", 0);
        setIntField(term278171, term278171.getClass(), "playedUserId3", 0);
        setField(term278171, term278171.getClass(), "playedUserName1", null);
        setField(term278171, term278171.getClass(), "playedUserName2", null);
        setField(term278171, term278171.getClass(), "playedUserName3", null);
        setIntField(term278171, term278171.getClass(), "playedMusicLevel1", 0);
        setIntField(term278171, term278171.getClass(), "playedMusicLevel2", 0);
        setIntField(term278171, term278171.getClass(), "playedMusicLevel3", 0);
        setIntField(term278171, term278171.getClass(), "playedCustom1", 0);
        setIntField(term278171, term278171.getClass(), "playedCustom2", 0);
        setIntField(term278171, term278171.getClass(), "playedCustom3", 0);
        setIntField(term278171, term278171.getClass(), "track", 0);
        setIntField(term278171, term278171.getClass(), "score", 0);
        setIntField(term278171, term278171.getClass(), "rank", 0);
        setIntField(term278171, term278171.getClass(), "maxCombo", 0);
        setIntField(term278171, term278171.getClass(), "maxChain", 0);
        setIntField(term278171, term278171.getClass(), "rateTap", 0);
        setIntField(term278171, term278171.getClass(), "rateHold", 0);
        setIntField(term278171, term278171.getClass(), "rateSlide", 0);
        setIntField(term278171, term278171.getClass(), "rateAir", 0);
        setIntField(term278171, term278171.getClass(), "rateFlick", 0);
        setIntField(term278171, term278171.getClass(), "judgeGuilty", 0);
        setIntField(term278171, term278171.getClass(), "judgeAttack", 0);
        setIntField(term278171, term278171.getClass(), "judgeJustice", 0);
        setIntField(term278171, term278171.getClass(), "judgeCritical", 0);
        setIntField(term278171, term278171.getClass(), "eventId", 0);
        setIntField(term278171, term278171.getClass(), "playerRating", 0);
        setBooleanField(term278171, term278171.getClass(), "isNewRecord", false);
        setBooleanField(term278171, term278171.getClass(), "isFullCombo", false);
        setIntField(term278171, term278171.getClass(), "fullChainKind", 0);
        setBooleanField(term278171, term278171.getClass(), "isAllJustice", false);
        setBooleanField(term278171, term278171.getClass(), "isContinue", false);
        setBooleanField(term278171, term278171.getClass(), "isFreeToPlay", false);
        setIntField(term278171, term278171.getClass(), "characterId", 0);
        setIntField(term278171, term278171.getClass(), "skillId", 0);
        setIntField(term278171, term278171.getClass(), "playKind", 0);
        setBooleanField(term278171, term278171.getClass(), "isClear", false);
        setIntField(term278171, term278171.getClass(), "skillLevel", 0);
        setIntField(term278171, term278171.getClass(), "skillEffect", 0);
        setField(term278171, term278171.getClass(), "placeName", null);
        setBooleanField(term278171, term278171.getClass(), "isMaimai", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term278171, args);
    }

};


