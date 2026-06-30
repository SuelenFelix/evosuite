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
import java.lang.Integer;

public class UserPlaylog_setLevel_792964125182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term461382;
     Object term461430;

    public UserPlaylog_setLevel_792964125182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term461382 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog"));
        setLongField(term461382, term461382.getClass(), "id", 0L);
        setField(term461382, term461382.getClass(), "user", null);
        setField(term461382, term461382.getClass(), "romVersion", null);
        setIntField(term461382, term461382.getClass(), "orderId", 0);
        setIntField(term461382, term461382.getClass(), "sortNumber", 0);
        setIntField(term461382, term461382.getClass(), "placeId", 0);
        setField(term461382, term461382.getClass(), "playDate", null);
        setField(term461382, term461382.getClass(), "userPlayDate", null);
        setIntField(term461382, term461382.getClass(), "musicId", 0);
        setIntField(term461382, term461382.getClass(), "level", 0);
        setIntField(term461382, term461382.getClass(), "customId", 0);
        setIntField(term461382, term461382.getClass(), "playedUserId1", 0);
        setIntField(term461382, term461382.getClass(), "playedUserId2", 0);
        setIntField(term461382, term461382.getClass(), "playedUserId3", 0);
        setField(term461382, term461382.getClass(), "playedUserName1", null);
        setField(term461382, term461382.getClass(), "playedUserName2", null);
        setField(term461382, term461382.getClass(), "playedUserName3", null);
        setIntField(term461382, term461382.getClass(), "playedMusicLevel1", 0);
        setIntField(term461382, term461382.getClass(), "playedMusicLevel2", 0);
        setIntField(term461382, term461382.getClass(), "playedMusicLevel3", 0);
        setIntField(term461382, term461382.getClass(), "playedCustom1", 0);
        setIntField(term461382, term461382.getClass(), "playedCustom2", 0);
        setIntField(term461382, term461382.getClass(), "playedCustom3", 0);
        setIntField(term461382, term461382.getClass(), "track", 0);
        setIntField(term461382, term461382.getClass(), "score", 0);
        setIntField(term461382, term461382.getClass(), "rank", 0);
        setIntField(term461382, term461382.getClass(), "maxCombo", 0);
        setIntField(term461382, term461382.getClass(), "maxChain", 0);
        setIntField(term461382, term461382.getClass(), "rateTap", 0);
        setIntField(term461382, term461382.getClass(), "rateHold", 0);
        setIntField(term461382, term461382.getClass(), "rateSlide", 0);
        setIntField(term461382, term461382.getClass(), "rateAir", 0);
        setIntField(term461382, term461382.getClass(), "rateFlick", 0);
        setIntField(term461382, term461382.getClass(), "judgeGuilty", 0);
        setIntField(term461382, term461382.getClass(), "judgeAttack", 0);
        setIntField(term461382, term461382.getClass(), "judgeJustice", 0);
        setIntField(term461382, term461382.getClass(), "judgeCritical", 0);
        setIntField(term461382, term461382.getClass(), "judgeHeaven", 0);
        setIntField(term461382, term461382.getClass(), "eventId", 0);
        setIntField(term461382, term461382.getClass(), "playerRating", 0);
        setBooleanField(term461382, term461382.getClass(), "isNewRecord", false);
        setBooleanField(term461382, term461382.getClass(), "isFullCombo", false);
        setIntField(term461382, term461382.getClass(), "fullChainKind", 0);
        setBooleanField(term461382, term461382.getClass(), "isAllJustice", false);
        setBooleanField(term461382, term461382.getClass(), "isContinue", false);
        setBooleanField(term461382, term461382.getClass(), "isFreeToPlay", false);
        setIntField(term461382, term461382.getClass(), "characterId", 0);
        setIntField(term461382, term461382.getClass(), "charaIllustId", 0);
        setIntField(term461382, term461382.getClass(), "skillId", 0);
        setIntField(term461382, term461382.getClass(), "playKind", 0);
        setBooleanField(term461382, term461382.getClass(), "isClear", false);
        setIntField(term461382, term461382.getClass(), "skillLevel", 0);
        setIntField(term461382, term461382.getClass(), "skillEffect", 0);
        setField(term461382, term461382.getClass(), "placeName", null);
        setIntField(term461382, term461382.getClass(), "commonId", 0);
        term461430 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term461430;
        callMethod(klass, "setLevel", argTypes, term461382, args);
    }

};


