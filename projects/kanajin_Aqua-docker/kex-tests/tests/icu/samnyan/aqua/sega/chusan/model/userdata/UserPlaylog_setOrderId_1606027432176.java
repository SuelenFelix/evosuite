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

public class UserPlaylog_setOrderId_1606027432176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term461086;
     Object term461134;

    public UserPlaylog_setOrderId_1606027432176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term461086 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog"));
        setLongField(term461086, term461086.getClass(), "id", 0L);
        setField(term461086, term461086.getClass(), "user", null);
        setField(term461086, term461086.getClass(), "romVersion", null);
        setIntField(term461086, term461086.getClass(), "orderId", 0);
        setIntField(term461086, term461086.getClass(), "sortNumber", 0);
        setIntField(term461086, term461086.getClass(), "placeId", 0);
        setField(term461086, term461086.getClass(), "playDate", null);
        setField(term461086, term461086.getClass(), "userPlayDate", null);
        setIntField(term461086, term461086.getClass(), "musicId", 0);
        setIntField(term461086, term461086.getClass(), "level", 0);
        setIntField(term461086, term461086.getClass(), "customId", 0);
        setIntField(term461086, term461086.getClass(), "playedUserId1", 0);
        setIntField(term461086, term461086.getClass(), "playedUserId2", 0);
        setIntField(term461086, term461086.getClass(), "playedUserId3", 0);
        setField(term461086, term461086.getClass(), "playedUserName1", null);
        setField(term461086, term461086.getClass(), "playedUserName2", null);
        setField(term461086, term461086.getClass(), "playedUserName3", null);
        setIntField(term461086, term461086.getClass(), "playedMusicLevel1", 0);
        setIntField(term461086, term461086.getClass(), "playedMusicLevel2", 0);
        setIntField(term461086, term461086.getClass(), "playedMusicLevel3", 0);
        setIntField(term461086, term461086.getClass(), "playedCustom1", 0);
        setIntField(term461086, term461086.getClass(), "playedCustom2", 0);
        setIntField(term461086, term461086.getClass(), "playedCustom3", 0);
        setIntField(term461086, term461086.getClass(), "track", 0);
        setIntField(term461086, term461086.getClass(), "score", 0);
        setIntField(term461086, term461086.getClass(), "rank", 0);
        setIntField(term461086, term461086.getClass(), "maxCombo", 0);
        setIntField(term461086, term461086.getClass(), "maxChain", 0);
        setIntField(term461086, term461086.getClass(), "rateTap", 0);
        setIntField(term461086, term461086.getClass(), "rateHold", 0);
        setIntField(term461086, term461086.getClass(), "rateSlide", 0);
        setIntField(term461086, term461086.getClass(), "rateAir", 0);
        setIntField(term461086, term461086.getClass(), "rateFlick", 0);
        setIntField(term461086, term461086.getClass(), "judgeGuilty", 0);
        setIntField(term461086, term461086.getClass(), "judgeAttack", 0);
        setIntField(term461086, term461086.getClass(), "judgeJustice", 0);
        setIntField(term461086, term461086.getClass(), "judgeCritical", 0);
        setIntField(term461086, term461086.getClass(), "judgeHeaven", 0);
        setIntField(term461086, term461086.getClass(), "eventId", 0);
        setIntField(term461086, term461086.getClass(), "playerRating", 0);
        setBooleanField(term461086, term461086.getClass(), "isNewRecord", false);
        setBooleanField(term461086, term461086.getClass(), "isFullCombo", false);
        setIntField(term461086, term461086.getClass(), "fullChainKind", 0);
        setBooleanField(term461086, term461086.getClass(), "isAllJustice", false);
        setBooleanField(term461086, term461086.getClass(), "isContinue", false);
        setBooleanField(term461086, term461086.getClass(), "isFreeToPlay", false);
        setIntField(term461086, term461086.getClass(), "characterId", 0);
        setIntField(term461086, term461086.getClass(), "charaIllustId", 0);
        setIntField(term461086, term461086.getClass(), "skillId", 0);
        setIntField(term461086, term461086.getClass(), "playKind", 0);
        setBooleanField(term461086, term461086.getClass(), "isClear", false);
        setIntField(term461086, term461086.getClass(), "skillLevel", 0);
        setIntField(term461086, term461086.getClass(), "skillEffect", 0);
        setField(term461086, term461086.getClass(), "placeName", null);
        setIntField(term461086, term461086.getClass(), "commonId", 0);
        term461134 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term461134;
        callMethod(klass, "setOrderId", argTypes, term461086, args);
    }

};


