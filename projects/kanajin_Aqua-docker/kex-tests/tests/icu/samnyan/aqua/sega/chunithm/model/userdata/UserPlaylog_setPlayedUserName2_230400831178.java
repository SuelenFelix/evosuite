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

public class UserPlaylog_setPlayedUserName2_230400831178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276307;

    public UserPlaylog_setPlayedUserName2_230400831178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276307 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term276307, term276307.getClass(), "id", 0L);
        setField(term276307, term276307.getClass(), "user", null);
        setIntField(term276307, term276307.getClass(), "orderId", 0);
        setIntField(term276307, term276307.getClass(), "sortNumber", 0);
        setIntField(term276307, term276307.getClass(), "placeId", 0);
        setField(term276307, term276307.getClass(), "playDate", null);
        setField(term276307, term276307.getClass(), "userPlayDate", null);
        setIntField(term276307, term276307.getClass(), "musicId", 0);
        setIntField(term276307, term276307.getClass(), "level", 0);
        setIntField(term276307, term276307.getClass(), "customId", 0);
        setIntField(term276307, term276307.getClass(), "playedUserId1", 0);
        setIntField(term276307, term276307.getClass(), "playedUserId2", 0);
        setIntField(term276307, term276307.getClass(), "playedUserId3", 0);
        setField(term276307, term276307.getClass(), "playedUserName1", null);
        setField(term276307, term276307.getClass(), "playedUserName2", null);
        setField(term276307, term276307.getClass(), "playedUserName3", null);
        setIntField(term276307, term276307.getClass(), "playedMusicLevel1", 0);
        setIntField(term276307, term276307.getClass(), "playedMusicLevel2", 0);
        setIntField(term276307, term276307.getClass(), "playedMusicLevel3", 0);
        setIntField(term276307, term276307.getClass(), "playedCustom1", 0);
        setIntField(term276307, term276307.getClass(), "playedCustom2", 0);
        setIntField(term276307, term276307.getClass(), "playedCustom3", 0);
        setIntField(term276307, term276307.getClass(), "track", 0);
        setIntField(term276307, term276307.getClass(), "score", 0);
        setIntField(term276307, term276307.getClass(), "rank", 0);
        setIntField(term276307, term276307.getClass(), "maxCombo", 0);
        setIntField(term276307, term276307.getClass(), "maxChain", 0);
        setIntField(term276307, term276307.getClass(), "rateTap", 0);
        setIntField(term276307, term276307.getClass(), "rateHold", 0);
        setIntField(term276307, term276307.getClass(), "rateSlide", 0);
        setIntField(term276307, term276307.getClass(), "rateAir", 0);
        setIntField(term276307, term276307.getClass(), "rateFlick", 0);
        setIntField(term276307, term276307.getClass(), "judgeGuilty", 0);
        setIntField(term276307, term276307.getClass(), "judgeAttack", 0);
        setIntField(term276307, term276307.getClass(), "judgeJustice", 0);
        setIntField(term276307, term276307.getClass(), "judgeCritical", 0);
        setIntField(term276307, term276307.getClass(), "eventId", 0);
        setIntField(term276307, term276307.getClass(), "playerRating", 0);
        setBooleanField(term276307, term276307.getClass(), "isNewRecord", false);
        setBooleanField(term276307, term276307.getClass(), "isFullCombo", false);
        setIntField(term276307, term276307.getClass(), "fullChainKind", 0);
        setBooleanField(term276307, term276307.getClass(), "isAllJustice", false);
        setBooleanField(term276307, term276307.getClass(), "isContinue", false);
        setBooleanField(term276307, term276307.getClass(), "isFreeToPlay", false);
        setIntField(term276307, term276307.getClass(), "characterId", 0);
        setIntField(term276307, term276307.getClass(), "skillId", 0);
        setIntField(term276307, term276307.getClass(), "playKind", 0);
        setBooleanField(term276307, term276307.getClass(), "isClear", false);
        setIntField(term276307, term276307.getClass(), "skillLevel", 0);
        setIntField(term276307, term276307.getClass(), "skillEffect", 0);
        setField(term276307, term276307.getClass(), "placeName", null);
        setBooleanField(term276307, term276307.getClass(), "isMaimai", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlayedUserName2", argTypes, term276307, args);
    }

};


