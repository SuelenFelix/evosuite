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

public class UserPlaylog_getRank_460746677136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274355;

    public UserPlaylog_getRank_460746677136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term274355 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term274355, term274355.getClass(), "id", 0L);
        setField(term274355, term274355.getClass(), "user", null);
        setIntField(term274355, term274355.getClass(), "orderId", 0);
        setIntField(term274355, term274355.getClass(), "sortNumber", 0);
        setIntField(term274355, term274355.getClass(), "placeId", 0);
        setField(term274355, term274355.getClass(), "playDate", null);
        setField(term274355, term274355.getClass(), "userPlayDate", null);
        setIntField(term274355, term274355.getClass(), "musicId", 0);
        setIntField(term274355, term274355.getClass(), "level", 0);
        setIntField(term274355, term274355.getClass(), "customId", 0);
        setIntField(term274355, term274355.getClass(), "playedUserId1", 0);
        setIntField(term274355, term274355.getClass(), "playedUserId2", 0);
        setIntField(term274355, term274355.getClass(), "playedUserId3", 0);
        setField(term274355, term274355.getClass(), "playedUserName1", null);
        setField(term274355, term274355.getClass(), "playedUserName2", null);
        setField(term274355, term274355.getClass(), "playedUserName3", null);
        setIntField(term274355, term274355.getClass(), "playedMusicLevel1", 0);
        setIntField(term274355, term274355.getClass(), "playedMusicLevel2", 0);
        setIntField(term274355, term274355.getClass(), "playedMusicLevel3", 0);
        setIntField(term274355, term274355.getClass(), "playedCustom1", 0);
        setIntField(term274355, term274355.getClass(), "playedCustom2", 0);
        setIntField(term274355, term274355.getClass(), "playedCustom3", 0);
        setIntField(term274355, term274355.getClass(), "track", 0);
        setIntField(term274355, term274355.getClass(), "score", 0);
        setIntField(term274355, term274355.getClass(), "rank", 0);
        setIntField(term274355, term274355.getClass(), "maxCombo", 0);
        setIntField(term274355, term274355.getClass(), "maxChain", 0);
        setIntField(term274355, term274355.getClass(), "rateTap", 0);
        setIntField(term274355, term274355.getClass(), "rateHold", 0);
        setIntField(term274355, term274355.getClass(), "rateSlide", 0);
        setIntField(term274355, term274355.getClass(), "rateAir", 0);
        setIntField(term274355, term274355.getClass(), "rateFlick", 0);
        setIntField(term274355, term274355.getClass(), "judgeGuilty", 0);
        setIntField(term274355, term274355.getClass(), "judgeAttack", 0);
        setIntField(term274355, term274355.getClass(), "judgeJustice", 0);
        setIntField(term274355, term274355.getClass(), "judgeCritical", 0);
        setIntField(term274355, term274355.getClass(), "eventId", 0);
        setIntField(term274355, term274355.getClass(), "playerRating", 0);
        setBooleanField(term274355, term274355.getClass(), "isNewRecord", false);
        setBooleanField(term274355, term274355.getClass(), "isFullCombo", false);
        setIntField(term274355, term274355.getClass(), "fullChainKind", 0);
        setBooleanField(term274355, term274355.getClass(), "isAllJustice", false);
        setBooleanField(term274355, term274355.getClass(), "isContinue", false);
        setBooleanField(term274355, term274355.getClass(), "isFreeToPlay", false);
        setIntField(term274355, term274355.getClass(), "characterId", 0);
        setIntField(term274355, term274355.getClass(), "skillId", 0);
        setIntField(term274355, term274355.getClass(), "playKind", 0);
        setBooleanField(term274355, term274355.getClass(), "isClear", false);
        setIntField(term274355, term274355.getClass(), "skillLevel", 0);
        setIntField(term274355, term274355.getClass(), "skillEffect", 0);
        setField(term274355, term274355.getClass(), "placeName", null);
        setBooleanField(term274355, term274355.getClass(), "isMaimai", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRank", argTypes, term274355, args);
    }

};


