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

public class UserPlaylog_setScore_1061251953197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term462126;
     Object term462174;

    public UserPlaylog_setScore_1061251953197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term462126 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog"));
        setLongField(term462126, term462126.getClass(), "id", 0L);
        setField(term462126, term462126.getClass(), "user", null);
        setField(term462126, term462126.getClass(), "romVersion", null);
        setIntField(term462126, term462126.getClass(), "orderId", 0);
        setIntField(term462126, term462126.getClass(), "sortNumber", 0);
        setIntField(term462126, term462126.getClass(), "placeId", 0);
        setField(term462126, term462126.getClass(), "playDate", null);
        setField(term462126, term462126.getClass(), "userPlayDate", null);
        setIntField(term462126, term462126.getClass(), "musicId", 0);
        setIntField(term462126, term462126.getClass(), "level", 0);
        setIntField(term462126, term462126.getClass(), "customId", 0);
        setIntField(term462126, term462126.getClass(), "playedUserId1", 0);
        setIntField(term462126, term462126.getClass(), "playedUserId2", 0);
        setIntField(term462126, term462126.getClass(), "playedUserId3", 0);
        setField(term462126, term462126.getClass(), "playedUserName1", null);
        setField(term462126, term462126.getClass(), "playedUserName2", null);
        setField(term462126, term462126.getClass(), "playedUserName3", null);
        setIntField(term462126, term462126.getClass(), "playedMusicLevel1", 0);
        setIntField(term462126, term462126.getClass(), "playedMusicLevel2", 0);
        setIntField(term462126, term462126.getClass(), "playedMusicLevel3", 0);
        setIntField(term462126, term462126.getClass(), "playedCustom1", 0);
        setIntField(term462126, term462126.getClass(), "playedCustom2", 0);
        setIntField(term462126, term462126.getClass(), "playedCustom3", 0);
        setIntField(term462126, term462126.getClass(), "track", 0);
        setIntField(term462126, term462126.getClass(), "score", 0);
        setIntField(term462126, term462126.getClass(), "rank", 0);
        setIntField(term462126, term462126.getClass(), "maxCombo", 0);
        setIntField(term462126, term462126.getClass(), "maxChain", 0);
        setIntField(term462126, term462126.getClass(), "rateTap", 0);
        setIntField(term462126, term462126.getClass(), "rateHold", 0);
        setIntField(term462126, term462126.getClass(), "rateSlide", 0);
        setIntField(term462126, term462126.getClass(), "rateAir", 0);
        setIntField(term462126, term462126.getClass(), "rateFlick", 0);
        setIntField(term462126, term462126.getClass(), "judgeGuilty", 0);
        setIntField(term462126, term462126.getClass(), "judgeAttack", 0);
        setIntField(term462126, term462126.getClass(), "judgeJustice", 0);
        setIntField(term462126, term462126.getClass(), "judgeCritical", 0);
        setIntField(term462126, term462126.getClass(), "judgeHeaven", 0);
        setIntField(term462126, term462126.getClass(), "eventId", 0);
        setIntField(term462126, term462126.getClass(), "playerRating", 0);
        setBooleanField(term462126, term462126.getClass(), "isNewRecord", false);
        setBooleanField(term462126, term462126.getClass(), "isFullCombo", false);
        setIntField(term462126, term462126.getClass(), "fullChainKind", 0);
        setBooleanField(term462126, term462126.getClass(), "isAllJustice", false);
        setBooleanField(term462126, term462126.getClass(), "isContinue", false);
        setBooleanField(term462126, term462126.getClass(), "isFreeToPlay", false);
        setIntField(term462126, term462126.getClass(), "characterId", 0);
        setIntField(term462126, term462126.getClass(), "charaIllustId", 0);
        setIntField(term462126, term462126.getClass(), "skillId", 0);
        setIntField(term462126, term462126.getClass(), "playKind", 0);
        setBooleanField(term462126, term462126.getClass(), "isClear", false);
        setIntField(term462126, term462126.getClass(), "skillLevel", 0);
        setIntField(term462126, term462126.getClass(), "skillEffect", 0);
        setField(term462126, term462126.getClass(), "placeName", null);
        setIntField(term462126, term462126.getClass(), "commonId", 0);
        term462174 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term462174;
        callMethod(klass, "setScore", argTypes, term462126, args);
    }

};


