package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserPlaylog_setPlayedUserName3_1443007364189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term461728;

    public UserPlaylog_setPlayedUserName3_1443007364189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term461728 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog"));
        setLongField(term461728, term461728.getClass(), "id", 0L);
        setField(term461728, term461728.getClass(), "user", null);
        setField(term461728, term461728.getClass(), "romVersion", null);
        setIntField(term461728, term461728.getClass(), "orderId", 0);
        setIntField(term461728, term461728.getClass(), "sortNumber", 0);
        setIntField(term461728, term461728.getClass(), "placeId", 0);
        setField(term461728, term461728.getClass(), "playDate", null);
        setField(term461728, term461728.getClass(), "userPlayDate", null);
        setIntField(term461728, term461728.getClass(), "musicId", 0);
        setIntField(term461728, term461728.getClass(), "level", 0);
        setIntField(term461728, term461728.getClass(), "customId", 0);
        setIntField(term461728, term461728.getClass(), "playedUserId1", 0);
        setIntField(term461728, term461728.getClass(), "playedUserId2", 0);
        setIntField(term461728, term461728.getClass(), "playedUserId3", 0);
        setField(term461728, term461728.getClass(), "playedUserName1", null);
        setField(term461728, term461728.getClass(), "playedUserName2", null);
        setField(term461728, term461728.getClass(), "playedUserName3", null);
        setIntField(term461728, term461728.getClass(), "playedMusicLevel1", 0);
        setIntField(term461728, term461728.getClass(), "playedMusicLevel2", 0);
        setIntField(term461728, term461728.getClass(), "playedMusicLevel3", 0);
        setIntField(term461728, term461728.getClass(), "playedCustom1", 0);
        setIntField(term461728, term461728.getClass(), "playedCustom2", 0);
        setIntField(term461728, term461728.getClass(), "playedCustom3", 0);
        setIntField(term461728, term461728.getClass(), "track", 0);
        setIntField(term461728, term461728.getClass(), "score", 0);
        setIntField(term461728, term461728.getClass(), "rank", 0);
        setIntField(term461728, term461728.getClass(), "maxCombo", 0);
        setIntField(term461728, term461728.getClass(), "maxChain", 0);
        setIntField(term461728, term461728.getClass(), "rateTap", 0);
        setIntField(term461728, term461728.getClass(), "rateHold", 0);
        setIntField(term461728, term461728.getClass(), "rateSlide", 0);
        setIntField(term461728, term461728.getClass(), "rateAir", 0);
        setIntField(term461728, term461728.getClass(), "rateFlick", 0);
        setIntField(term461728, term461728.getClass(), "judgeGuilty", 0);
        setIntField(term461728, term461728.getClass(), "judgeAttack", 0);
        setIntField(term461728, term461728.getClass(), "judgeJustice", 0);
        setIntField(term461728, term461728.getClass(), "judgeCritical", 0);
        setIntField(term461728, term461728.getClass(), "judgeHeaven", 0);
        setIntField(term461728, term461728.getClass(), "eventId", 0);
        setIntField(term461728, term461728.getClass(), "playerRating", 0);
        setBooleanField(term461728, term461728.getClass(), "isNewRecord", false);
        setBooleanField(term461728, term461728.getClass(), "isFullCombo", false);
        setIntField(term461728, term461728.getClass(), "fullChainKind", 0);
        setBooleanField(term461728, term461728.getClass(), "isAllJustice", false);
        setBooleanField(term461728, term461728.getClass(), "isContinue", false);
        setBooleanField(term461728, term461728.getClass(), "isFreeToPlay", false);
        setIntField(term461728, term461728.getClass(), "characterId", 0);
        setIntField(term461728, term461728.getClass(), "charaIllustId", 0);
        setIntField(term461728, term461728.getClass(), "skillId", 0);
        setIntField(term461728, term461728.getClass(), "playKind", 0);
        setBooleanField(term461728, term461728.getClass(), "isClear", false);
        setIntField(term461728, term461728.getClass(), "skillLevel", 0);
        setIntField(term461728, term461728.getClass(), "skillEffect", 0);
        setField(term461728, term461728.getClass(), "placeName", null);
        setIntField(term461728, term461728.getClass(), "commonId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlayedUserName3", argTypes, term461728, args);
    }

};


