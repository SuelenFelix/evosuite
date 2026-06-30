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
import java.lang.Long;

public class UserPlaylog_setId_1851759138173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term460940;
     Object term460988;

    public UserPlaylog_setId_1851759138173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term460940 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog"));
        setLongField(term460940, term460940.getClass(), "id", 0L);
        setField(term460940, term460940.getClass(), "user", null);
        setField(term460940, term460940.getClass(), "romVersion", null);
        setIntField(term460940, term460940.getClass(), "orderId", 0);
        setIntField(term460940, term460940.getClass(), "sortNumber", 0);
        setIntField(term460940, term460940.getClass(), "placeId", 0);
        setField(term460940, term460940.getClass(), "playDate", null);
        setField(term460940, term460940.getClass(), "userPlayDate", null);
        setIntField(term460940, term460940.getClass(), "musicId", 0);
        setIntField(term460940, term460940.getClass(), "level", 0);
        setIntField(term460940, term460940.getClass(), "customId", 0);
        setIntField(term460940, term460940.getClass(), "playedUserId1", 0);
        setIntField(term460940, term460940.getClass(), "playedUserId2", 0);
        setIntField(term460940, term460940.getClass(), "playedUserId3", 0);
        setField(term460940, term460940.getClass(), "playedUserName1", null);
        setField(term460940, term460940.getClass(), "playedUserName2", null);
        setField(term460940, term460940.getClass(), "playedUserName3", null);
        setIntField(term460940, term460940.getClass(), "playedMusicLevel1", 0);
        setIntField(term460940, term460940.getClass(), "playedMusicLevel2", 0);
        setIntField(term460940, term460940.getClass(), "playedMusicLevel3", 0);
        setIntField(term460940, term460940.getClass(), "playedCustom1", 0);
        setIntField(term460940, term460940.getClass(), "playedCustom2", 0);
        setIntField(term460940, term460940.getClass(), "playedCustom3", 0);
        setIntField(term460940, term460940.getClass(), "track", 0);
        setIntField(term460940, term460940.getClass(), "score", 0);
        setIntField(term460940, term460940.getClass(), "rank", 0);
        setIntField(term460940, term460940.getClass(), "maxCombo", 0);
        setIntField(term460940, term460940.getClass(), "maxChain", 0);
        setIntField(term460940, term460940.getClass(), "rateTap", 0);
        setIntField(term460940, term460940.getClass(), "rateHold", 0);
        setIntField(term460940, term460940.getClass(), "rateSlide", 0);
        setIntField(term460940, term460940.getClass(), "rateAir", 0);
        setIntField(term460940, term460940.getClass(), "rateFlick", 0);
        setIntField(term460940, term460940.getClass(), "judgeGuilty", 0);
        setIntField(term460940, term460940.getClass(), "judgeAttack", 0);
        setIntField(term460940, term460940.getClass(), "judgeJustice", 0);
        setIntField(term460940, term460940.getClass(), "judgeCritical", 0);
        setIntField(term460940, term460940.getClass(), "judgeHeaven", 0);
        setIntField(term460940, term460940.getClass(), "eventId", 0);
        setIntField(term460940, term460940.getClass(), "playerRating", 0);
        setBooleanField(term460940, term460940.getClass(), "isNewRecord", false);
        setBooleanField(term460940, term460940.getClass(), "isFullCombo", false);
        setIntField(term460940, term460940.getClass(), "fullChainKind", 0);
        setBooleanField(term460940, term460940.getClass(), "isAllJustice", false);
        setBooleanField(term460940, term460940.getClass(), "isContinue", false);
        setBooleanField(term460940, term460940.getClass(), "isFreeToPlay", false);
        setIntField(term460940, term460940.getClass(), "characterId", 0);
        setIntField(term460940, term460940.getClass(), "charaIllustId", 0);
        setIntField(term460940, term460940.getClass(), "skillId", 0);
        setIntField(term460940, term460940.getClass(), "playKind", 0);
        setBooleanField(term460940, term460940.getClass(), "isClear", false);
        setIntField(term460940, term460940.getClass(), "skillLevel", 0);
        setIntField(term460940, term460940.getClass(), "skillEffect", 0);
        setField(term460940, term460940.getClass(), "placeName", null);
        setIntField(term460940, term460940.getClass(), "commonId", 0);
        term460988 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term460988;
        callMethod(klass, "setId", argTypes, term460940, args);
    }

};


