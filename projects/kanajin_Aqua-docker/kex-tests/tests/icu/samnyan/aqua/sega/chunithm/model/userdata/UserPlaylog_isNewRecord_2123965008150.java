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

public class UserPlaylog_isNewRecord_2123965008150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274999;

    public UserPlaylog_isNewRecord_2123965008150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term274999 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term274999, term274999.getClass(), "id", 0L);
        setField(term274999, term274999.getClass(), "user", null);
        setIntField(term274999, term274999.getClass(), "orderId", 0);
        setIntField(term274999, term274999.getClass(), "sortNumber", 0);
        setIntField(term274999, term274999.getClass(), "placeId", 0);
        setField(term274999, term274999.getClass(), "playDate", null);
        setField(term274999, term274999.getClass(), "userPlayDate", null);
        setIntField(term274999, term274999.getClass(), "musicId", 0);
        setIntField(term274999, term274999.getClass(), "level", 0);
        setIntField(term274999, term274999.getClass(), "customId", 0);
        setIntField(term274999, term274999.getClass(), "playedUserId1", 0);
        setIntField(term274999, term274999.getClass(), "playedUserId2", 0);
        setIntField(term274999, term274999.getClass(), "playedUserId3", 0);
        setField(term274999, term274999.getClass(), "playedUserName1", null);
        setField(term274999, term274999.getClass(), "playedUserName2", null);
        setField(term274999, term274999.getClass(), "playedUserName3", null);
        setIntField(term274999, term274999.getClass(), "playedMusicLevel1", 0);
        setIntField(term274999, term274999.getClass(), "playedMusicLevel2", 0);
        setIntField(term274999, term274999.getClass(), "playedMusicLevel3", 0);
        setIntField(term274999, term274999.getClass(), "playedCustom1", 0);
        setIntField(term274999, term274999.getClass(), "playedCustom2", 0);
        setIntField(term274999, term274999.getClass(), "playedCustom3", 0);
        setIntField(term274999, term274999.getClass(), "track", 0);
        setIntField(term274999, term274999.getClass(), "score", 0);
        setIntField(term274999, term274999.getClass(), "rank", 0);
        setIntField(term274999, term274999.getClass(), "maxCombo", 0);
        setIntField(term274999, term274999.getClass(), "maxChain", 0);
        setIntField(term274999, term274999.getClass(), "rateTap", 0);
        setIntField(term274999, term274999.getClass(), "rateHold", 0);
        setIntField(term274999, term274999.getClass(), "rateSlide", 0);
        setIntField(term274999, term274999.getClass(), "rateAir", 0);
        setIntField(term274999, term274999.getClass(), "rateFlick", 0);
        setIntField(term274999, term274999.getClass(), "judgeGuilty", 0);
        setIntField(term274999, term274999.getClass(), "judgeAttack", 0);
        setIntField(term274999, term274999.getClass(), "judgeJustice", 0);
        setIntField(term274999, term274999.getClass(), "judgeCritical", 0);
        setIntField(term274999, term274999.getClass(), "eventId", 0);
        setIntField(term274999, term274999.getClass(), "playerRating", 0);
        setBooleanField(term274999, term274999.getClass(), "isNewRecord", false);
        setBooleanField(term274999, term274999.getClass(), "isFullCombo", false);
        setIntField(term274999, term274999.getClass(), "fullChainKind", 0);
        setBooleanField(term274999, term274999.getClass(), "isAllJustice", false);
        setBooleanField(term274999, term274999.getClass(), "isContinue", false);
        setBooleanField(term274999, term274999.getClass(), "isFreeToPlay", false);
        setIntField(term274999, term274999.getClass(), "characterId", 0);
        setIntField(term274999, term274999.getClass(), "skillId", 0);
        setIntField(term274999, term274999.getClass(), "playKind", 0);
        setBooleanField(term274999, term274999.getClass(), "isClear", false);
        setIntField(term274999, term274999.getClass(), "skillLevel", 0);
        setIntField(term274999, term274999.getClass(), "skillEffect", 0);
        setField(term274999, term274999.getClass(), "placeName", null);
        setBooleanField(term274999, term274999.getClass(), "isMaimai", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isNewRecord", argTypes, term274999, args);
    }

};


