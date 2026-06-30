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

public class UserPlaylog_setMaimai_765492129215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278077;
     Object term278123;

    public UserPlaylog_setMaimai_765492129215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term278077 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term278077, term278077.getClass(), "id", 0L);
        setField(term278077, term278077.getClass(), "user", null);
        setIntField(term278077, term278077.getClass(), "orderId", 0);
        setIntField(term278077, term278077.getClass(), "sortNumber", 0);
        setIntField(term278077, term278077.getClass(), "placeId", 0);
        setField(term278077, term278077.getClass(), "playDate", null);
        setField(term278077, term278077.getClass(), "userPlayDate", null);
        setIntField(term278077, term278077.getClass(), "musicId", 0);
        setIntField(term278077, term278077.getClass(), "level", 0);
        setIntField(term278077, term278077.getClass(), "customId", 0);
        setIntField(term278077, term278077.getClass(), "playedUserId1", 0);
        setIntField(term278077, term278077.getClass(), "playedUserId2", 0);
        setIntField(term278077, term278077.getClass(), "playedUserId3", 0);
        setField(term278077, term278077.getClass(), "playedUserName1", null);
        setField(term278077, term278077.getClass(), "playedUserName2", null);
        setField(term278077, term278077.getClass(), "playedUserName3", null);
        setIntField(term278077, term278077.getClass(), "playedMusicLevel1", 0);
        setIntField(term278077, term278077.getClass(), "playedMusicLevel2", 0);
        setIntField(term278077, term278077.getClass(), "playedMusicLevel3", 0);
        setIntField(term278077, term278077.getClass(), "playedCustom1", 0);
        setIntField(term278077, term278077.getClass(), "playedCustom2", 0);
        setIntField(term278077, term278077.getClass(), "playedCustom3", 0);
        setIntField(term278077, term278077.getClass(), "track", 0);
        setIntField(term278077, term278077.getClass(), "score", 0);
        setIntField(term278077, term278077.getClass(), "rank", 0);
        setIntField(term278077, term278077.getClass(), "maxCombo", 0);
        setIntField(term278077, term278077.getClass(), "maxChain", 0);
        setIntField(term278077, term278077.getClass(), "rateTap", 0);
        setIntField(term278077, term278077.getClass(), "rateHold", 0);
        setIntField(term278077, term278077.getClass(), "rateSlide", 0);
        setIntField(term278077, term278077.getClass(), "rateAir", 0);
        setIntField(term278077, term278077.getClass(), "rateFlick", 0);
        setIntField(term278077, term278077.getClass(), "judgeGuilty", 0);
        setIntField(term278077, term278077.getClass(), "judgeAttack", 0);
        setIntField(term278077, term278077.getClass(), "judgeJustice", 0);
        setIntField(term278077, term278077.getClass(), "judgeCritical", 0);
        setIntField(term278077, term278077.getClass(), "eventId", 0);
        setIntField(term278077, term278077.getClass(), "playerRating", 0);
        setBooleanField(term278077, term278077.getClass(), "isNewRecord", false);
        setBooleanField(term278077, term278077.getClass(), "isFullCombo", false);
        setIntField(term278077, term278077.getClass(), "fullChainKind", 0);
        setBooleanField(term278077, term278077.getClass(), "isAllJustice", false);
        setBooleanField(term278077, term278077.getClass(), "isContinue", false);
        setBooleanField(term278077, term278077.getClass(), "isFreeToPlay", false);
        setIntField(term278077, term278077.getClass(), "characterId", 0);
        setIntField(term278077, term278077.getClass(), "skillId", 0);
        setIntField(term278077, term278077.getClass(), "playKind", 0);
        setBooleanField(term278077, term278077.getClass(), "isClear", false);
        setIntField(term278077, term278077.getClass(), "skillLevel", 0);
        setIntField(term278077, term278077.getClass(), "skillEffect", 0);
        setField(term278077, term278077.getClass(), "placeName", null);
        setBooleanField(term278077, term278077.getClass(), "isMaimai", false);
        term278123 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term278123;
        callMethod(klass, "setMaimai", argTypes, term278077, args);
    }

};


