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

public class UserPlaylog_getPlayDate_1385997778117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273481;

    public UserPlaylog_getPlayDate_1385997778117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273481 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term273481, term273481.getClass(), "id", 0L);
        setField(term273481, term273481.getClass(), "user", null);
        setIntField(term273481, term273481.getClass(), "orderId", 0);
        setIntField(term273481, term273481.getClass(), "sortNumber", 0);
        setIntField(term273481, term273481.getClass(), "placeId", 0);
        setField(term273481, term273481.getClass(), "playDate", null);
        setField(term273481, term273481.getClass(), "userPlayDate", null);
        setIntField(term273481, term273481.getClass(), "musicId", 0);
        setIntField(term273481, term273481.getClass(), "level", 0);
        setIntField(term273481, term273481.getClass(), "customId", 0);
        setIntField(term273481, term273481.getClass(), "playedUserId1", 0);
        setIntField(term273481, term273481.getClass(), "playedUserId2", 0);
        setIntField(term273481, term273481.getClass(), "playedUserId3", 0);
        setField(term273481, term273481.getClass(), "playedUserName1", null);
        setField(term273481, term273481.getClass(), "playedUserName2", null);
        setField(term273481, term273481.getClass(), "playedUserName3", null);
        setIntField(term273481, term273481.getClass(), "playedMusicLevel1", 0);
        setIntField(term273481, term273481.getClass(), "playedMusicLevel2", 0);
        setIntField(term273481, term273481.getClass(), "playedMusicLevel3", 0);
        setIntField(term273481, term273481.getClass(), "playedCustom1", 0);
        setIntField(term273481, term273481.getClass(), "playedCustom2", 0);
        setIntField(term273481, term273481.getClass(), "playedCustom3", 0);
        setIntField(term273481, term273481.getClass(), "track", 0);
        setIntField(term273481, term273481.getClass(), "score", 0);
        setIntField(term273481, term273481.getClass(), "rank", 0);
        setIntField(term273481, term273481.getClass(), "maxCombo", 0);
        setIntField(term273481, term273481.getClass(), "maxChain", 0);
        setIntField(term273481, term273481.getClass(), "rateTap", 0);
        setIntField(term273481, term273481.getClass(), "rateHold", 0);
        setIntField(term273481, term273481.getClass(), "rateSlide", 0);
        setIntField(term273481, term273481.getClass(), "rateAir", 0);
        setIntField(term273481, term273481.getClass(), "rateFlick", 0);
        setIntField(term273481, term273481.getClass(), "judgeGuilty", 0);
        setIntField(term273481, term273481.getClass(), "judgeAttack", 0);
        setIntField(term273481, term273481.getClass(), "judgeJustice", 0);
        setIntField(term273481, term273481.getClass(), "judgeCritical", 0);
        setIntField(term273481, term273481.getClass(), "eventId", 0);
        setIntField(term273481, term273481.getClass(), "playerRating", 0);
        setBooleanField(term273481, term273481.getClass(), "isNewRecord", false);
        setBooleanField(term273481, term273481.getClass(), "isFullCombo", false);
        setIntField(term273481, term273481.getClass(), "fullChainKind", 0);
        setBooleanField(term273481, term273481.getClass(), "isAllJustice", false);
        setBooleanField(term273481, term273481.getClass(), "isContinue", false);
        setBooleanField(term273481, term273481.getClass(), "isFreeToPlay", false);
        setIntField(term273481, term273481.getClass(), "characterId", 0);
        setIntField(term273481, term273481.getClass(), "skillId", 0);
        setIntField(term273481, term273481.getClass(), "playKind", 0);
        setBooleanField(term273481, term273481.getClass(), "isClear", false);
        setIntField(term273481, term273481.getClass(), "skillLevel", 0);
        setIntField(term273481, term273481.getClass(), "skillEffect", 0);
        setField(term273481, term273481.getClass(), "placeName", null);
        setBooleanField(term273481, term273481.getClass(), "isMaimai", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayDate", argTypes, term273481, args);
    }

};


