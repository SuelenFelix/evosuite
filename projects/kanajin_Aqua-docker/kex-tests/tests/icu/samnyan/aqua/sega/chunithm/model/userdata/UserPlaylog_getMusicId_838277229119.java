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

public class UserPlaylog_getMusicId_838277229119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273573;

    public UserPlaylog_getMusicId_838277229119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273573 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term273573, term273573.getClass(), "id", 0L);
        setField(term273573, term273573.getClass(), "user", null);
        setIntField(term273573, term273573.getClass(), "orderId", 0);
        setIntField(term273573, term273573.getClass(), "sortNumber", 0);
        setIntField(term273573, term273573.getClass(), "placeId", 0);
        setField(term273573, term273573.getClass(), "playDate", null);
        setField(term273573, term273573.getClass(), "userPlayDate", null);
        setIntField(term273573, term273573.getClass(), "musicId", 0);
        setIntField(term273573, term273573.getClass(), "level", 0);
        setIntField(term273573, term273573.getClass(), "customId", 0);
        setIntField(term273573, term273573.getClass(), "playedUserId1", 0);
        setIntField(term273573, term273573.getClass(), "playedUserId2", 0);
        setIntField(term273573, term273573.getClass(), "playedUserId3", 0);
        setField(term273573, term273573.getClass(), "playedUserName1", null);
        setField(term273573, term273573.getClass(), "playedUserName2", null);
        setField(term273573, term273573.getClass(), "playedUserName3", null);
        setIntField(term273573, term273573.getClass(), "playedMusicLevel1", 0);
        setIntField(term273573, term273573.getClass(), "playedMusicLevel2", 0);
        setIntField(term273573, term273573.getClass(), "playedMusicLevel3", 0);
        setIntField(term273573, term273573.getClass(), "playedCustom1", 0);
        setIntField(term273573, term273573.getClass(), "playedCustom2", 0);
        setIntField(term273573, term273573.getClass(), "playedCustom3", 0);
        setIntField(term273573, term273573.getClass(), "track", 0);
        setIntField(term273573, term273573.getClass(), "score", 0);
        setIntField(term273573, term273573.getClass(), "rank", 0);
        setIntField(term273573, term273573.getClass(), "maxCombo", 0);
        setIntField(term273573, term273573.getClass(), "maxChain", 0);
        setIntField(term273573, term273573.getClass(), "rateTap", 0);
        setIntField(term273573, term273573.getClass(), "rateHold", 0);
        setIntField(term273573, term273573.getClass(), "rateSlide", 0);
        setIntField(term273573, term273573.getClass(), "rateAir", 0);
        setIntField(term273573, term273573.getClass(), "rateFlick", 0);
        setIntField(term273573, term273573.getClass(), "judgeGuilty", 0);
        setIntField(term273573, term273573.getClass(), "judgeAttack", 0);
        setIntField(term273573, term273573.getClass(), "judgeJustice", 0);
        setIntField(term273573, term273573.getClass(), "judgeCritical", 0);
        setIntField(term273573, term273573.getClass(), "eventId", 0);
        setIntField(term273573, term273573.getClass(), "playerRating", 0);
        setBooleanField(term273573, term273573.getClass(), "isNewRecord", false);
        setBooleanField(term273573, term273573.getClass(), "isFullCombo", false);
        setIntField(term273573, term273573.getClass(), "fullChainKind", 0);
        setBooleanField(term273573, term273573.getClass(), "isAllJustice", false);
        setBooleanField(term273573, term273573.getClass(), "isContinue", false);
        setBooleanField(term273573, term273573.getClass(), "isFreeToPlay", false);
        setIntField(term273573, term273573.getClass(), "characterId", 0);
        setIntField(term273573, term273573.getClass(), "skillId", 0);
        setIntField(term273573, term273573.getClass(), "playKind", 0);
        setBooleanField(term273573, term273573.getClass(), "isClear", false);
        setIntField(term273573, term273573.getClass(), "skillLevel", 0);
        setIntField(term273573, term273573.getClass(), "skillEffect", 0);
        setField(term273573, term273573.getClass(), "placeName", null);
        setBooleanField(term273573, term273573.getClass(), "isMaimai", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMusicId", argTypes, term273573, args);
    }

};


