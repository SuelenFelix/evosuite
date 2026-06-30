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

public class UserPlaylog_setPlayedCustom2_719053715194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term461976;
     Object term462024;

    public UserPlaylog_setPlayedCustom2_719053715194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term461976 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog"));
        setLongField(term461976, term461976.getClass(), "id", 0L);
        setField(term461976, term461976.getClass(), "user", null);
        setField(term461976, term461976.getClass(), "romVersion", null);
        setIntField(term461976, term461976.getClass(), "orderId", 0);
        setIntField(term461976, term461976.getClass(), "sortNumber", 0);
        setIntField(term461976, term461976.getClass(), "placeId", 0);
        setField(term461976, term461976.getClass(), "playDate", null);
        setField(term461976, term461976.getClass(), "userPlayDate", null);
        setIntField(term461976, term461976.getClass(), "musicId", 0);
        setIntField(term461976, term461976.getClass(), "level", 0);
        setIntField(term461976, term461976.getClass(), "customId", 0);
        setIntField(term461976, term461976.getClass(), "playedUserId1", 0);
        setIntField(term461976, term461976.getClass(), "playedUserId2", 0);
        setIntField(term461976, term461976.getClass(), "playedUserId3", 0);
        setField(term461976, term461976.getClass(), "playedUserName1", null);
        setField(term461976, term461976.getClass(), "playedUserName2", null);
        setField(term461976, term461976.getClass(), "playedUserName3", null);
        setIntField(term461976, term461976.getClass(), "playedMusicLevel1", 0);
        setIntField(term461976, term461976.getClass(), "playedMusicLevel2", 0);
        setIntField(term461976, term461976.getClass(), "playedMusicLevel3", 0);
        setIntField(term461976, term461976.getClass(), "playedCustom1", 0);
        setIntField(term461976, term461976.getClass(), "playedCustom2", 0);
        setIntField(term461976, term461976.getClass(), "playedCustom3", 0);
        setIntField(term461976, term461976.getClass(), "track", 0);
        setIntField(term461976, term461976.getClass(), "score", 0);
        setIntField(term461976, term461976.getClass(), "rank", 0);
        setIntField(term461976, term461976.getClass(), "maxCombo", 0);
        setIntField(term461976, term461976.getClass(), "maxChain", 0);
        setIntField(term461976, term461976.getClass(), "rateTap", 0);
        setIntField(term461976, term461976.getClass(), "rateHold", 0);
        setIntField(term461976, term461976.getClass(), "rateSlide", 0);
        setIntField(term461976, term461976.getClass(), "rateAir", 0);
        setIntField(term461976, term461976.getClass(), "rateFlick", 0);
        setIntField(term461976, term461976.getClass(), "judgeGuilty", 0);
        setIntField(term461976, term461976.getClass(), "judgeAttack", 0);
        setIntField(term461976, term461976.getClass(), "judgeJustice", 0);
        setIntField(term461976, term461976.getClass(), "judgeCritical", 0);
        setIntField(term461976, term461976.getClass(), "judgeHeaven", 0);
        setIntField(term461976, term461976.getClass(), "eventId", 0);
        setIntField(term461976, term461976.getClass(), "playerRating", 0);
        setBooleanField(term461976, term461976.getClass(), "isNewRecord", false);
        setBooleanField(term461976, term461976.getClass(), "isFullCombo", false);
        setIntField(term461976, term461976.getClass(), "fullChainKind", 0);
        setBooleanField(term461976, term461976.getClass(), "isAllJustice", false);
        setBooleanField(term461976, term461976.getClass(), "isContinue", false);
        setBooleanField(term461976, term461976.getClass(), "isFreeToPlay", false);
        setIntField(term461976, term461976.getClass(), "characterId", 0);
        setIntField(term461976, term461976.getClass(), "charaIllustId", 0);
        setIntField(term461976, term461976.getClass(), "skillId", 0);
        setIntField(term461976, term461976.getClass(), "playKind", 0);
        setBooleanField(term461976, term461976.getClass(), "isClear", false);
        setIntField(term461976, term461976.getClass(), "skillLevel", 0);
        setIntField(term461976, term461976.getClass(), "skillEffect", 0);
        setField(term461976, term461976.getClass(), "placeName", null);
        setIntField(term461976, term461976.getClass(), "commonId", 0);
        term462024 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term462024;
        callMethod(klass, "setPlayedCustom2", argTypes, term461976, args);
    }

};


