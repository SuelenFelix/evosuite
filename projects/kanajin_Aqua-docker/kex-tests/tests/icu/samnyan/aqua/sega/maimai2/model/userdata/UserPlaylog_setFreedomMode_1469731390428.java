package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class UserPlaylog_setFreedomMode_1469731390428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term496903;
     Object term497003;

    public UserPlaylog_setFreedomMode_1469731390428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term496903 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term496903, term496903.getClass(), "id", 0L);
        setField(term496903, term496903.getClass(), "user", null);
        setIntField(term496903, term496903.getClass(), "orderId", 0);
        setLongField(term496903, term496903.getClass(), "playlogId", 0L);
        setIntField(term496903, term496903.getClass(), "version", 0);
        setIntField(term496903, term496903.getClass(), "placeId", 0);
        setField(term496903, term496903.getClass(), "placeName", null);
        setLongField(term496903, term496903.getClass(), "loginDate", 0L);
        setField(term496903, term496903.getClass(), "playDate", null);
        setField(term496903, term496903.getClass(), "userPlayDate", null);
        setIntField(term496903, term496903.getClass(), "type", 0);
        setIntField(term496903, term496903.getClass(), "musicId", 0);
        setIntField(term496903, term496903.getClass(), "level", 0);
        setIntField(term496903, term496903.getClass(), "trackNo", 0);
        setIntField(term496903, term496903.getClass(), "vsMode", 0);
        setField(term496903, term496903.getClass(), "vsUserName", null);
        setIntField(term496903, term496903.getClass(), "vsStatus", 0);
        setIntField(term496903, term496903.getClass(), "vsUserRating", 0);
        setIntField(term496903, term496903.getClass(), "vsUserAchievement", 0);
        setIntField(term496903, term496903.getClass(), "vsUserGradeRank", 0);
        setIntField(term496903, term496903.getClass(), "vsRank", 0);
        setIntField(term496903, term496903.getClass(), "playerNum", 0);
        setLongField(term496903, term496903.getClass(), "playedUserId1", 0L);
        setField(term496903, term496903.getClass(), "playedUserName1", null);
        setIntField(term496903, term496903.getClass(), "playedMusicLevel1", 0);
        setLongField(term496903, term496903.getClass(), "playedUserId2", 0L);
        setField(term496903, term496903.getClass(), "playedUserName2", null);
        setIntField(term496903, term496903.getClass(), "playedMusicLevel2", 0);
        setLongField(term496903, term496903.getClass(), "playedUserId3", 0L);
        setField(term496903, term496903.getClass(), "playedUserName3", null);
        setIntField(term496903, term496903.getClass(), "playedMusicLevel3", 0);
        setIntField(term496903, term496903.getClass(), "characterId1", 0);
        setIntField(term496903, term496903.getClass(), "characterLevel1", 0);
        setIntField(term496903, term496903.getClass(), "characterAwakening1", 0);
        setIntField(term496903, term496903.getClass(), "characterId2", 0);
        setIntField(term496903, term496903.getClass(), "characterLevel2", 0);
        setIntField(term496903, term496903.getClass(), "characterAwakening2", 0);
        setIntField(term496903, term496903.getClass(), "characterId3", 0);
        setIntField(term496903, term496903.getClass(), "characterLevel3", 0);
        setIntField(term496903, term496903.getClass(), "characterAwakening3", 0);
        setIntField(term496903, term496903.getClass(), "characterId4", 0);
        setIntField(term496903, term496903.getClass(), "characterLevel4", 0);
        setIntField(term496903, term496903.getClass(), "characterAwakening4", 0);
        setIntField(term496903, term496903.getClass(), "characterId5", 0);
        setIntField(term496903, term496903.getClass(), "characterLevel5", 0);
        setIntField(term496903, term496903.getClass(), "characterAwakening5", 0);
        setIntField(term496903, term496903.getClass(), "achievement", 0);
        setIntField(term496903, term496903.getClass(), "deluxscore", 0);
        setIntField(term496903, term496903.getClass(), "scoreRank", 0);
        setIntField(term496903, term496903.getClass(), "maxCombo", 0);
        setIntField(term496903, term496903.getClass(), "totalCombo", 0);
        setIntField(term496903, term496903.getClass(), "maxSync", 0);
        setIntField(term496903, term496903.getClass(), "totalSync", 0);
        setIntField(term496903, term496903.getClass(), "tapCriticalPerfect", 0);
        setIntField(term496903, term496903.getClass(), "tapPerfect", 0);
        setIntField(term496903, term496903.getClass(), "tapGreat", 0);
        setIntField(term496903, term496903.getClass(), "tapGood", 0);
        setIntField(term496903, term496903.getClass(), "tapMiss", 0);
        setIntField(term496903, term496903.getClass(), "holdCriticalPerfect", 0);
        setIntField(term496903, term496903.getClass(), "holdPerfect", 0);
        setIntField(term496903, term496903.getClass(), "holdGreat", 0);
        setIntField(term496903, term496903.getClass(), "holdGood", 0);
        setIntField(term496903, term496903.getClass(), "holdMiss", 0);
        setIntField(term496903, term496903.getClass(), "slideCriticalPerfect", 0);
        setIntField(term496903, term496903.getClass(), "slidePerfect", 0);
        setIntField(term496903, term496903.getClass(), "slideGreat", 0);
        setIntField(term496903, term496903.getClass(), "slideGood", 0);
        setIntField(term496903, term496903.getClass(), "slideMiss", 0);
        setIntField(term496903, term496903.getClass(), "touchCriticalPerfect", 0);
        setIntField(term496903, term496903.getClass(), "touchPerfect", 0);
        setIntField(term496903, term496903.getClass(), "touchGreat", 0);
        setIntField(term496903, term496903.getClass(), "touchGood", 0);
        setIntField(term496903, term496903.getClass(), "touchMiss", 0);
        setIntField(term496903, term496903.getClass(), "breakCriticalPerfect", 0);
        setIntField(term496903, term496903.getClass(), "breakPerfect", 0);
        setIntField(term496903, term496903.getClass(), "breakGreat", 0);
        setIntField(term496903, term496903.getClass(), "breakGood", 0);
        setIntField(term496903, term496903.getClass(), "breakMiss", 0);
        setBooleanField(term496903, term496903.getClass(), "isTap", false);
        setBooleanField(term496903, term496903.getClass(), "isHold", false);
        setBooleanField(term496903, term496903.getClass(), "isSlide", false);
        setBooleanField(term496903, term496903.getClass(), "isTouch", false);
        setBooleanField(term496903, term496903.getClass(), "isBreak", false);
        setBooleanField(term496903, term496903.getClass(), "isCriticalDisp", false);
        setBooleanField(term496903, term496903.getClass(), "isFastLateDisp", false);
        setIntField(term496903, term496903.getClass(), "fastCount", 0);
        setIntField(term496903, term496903.getClass(), "lateCount", 0);
        setBooleanField(term496903, term496903.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term496903, term496903.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term496903, term496903.getClass(), "comboStatus", 0);
        setIntField(term496903, term496903.getClass(), "syncStatus", 0);
        setBooleanField(term496903, term496903.getClass(), "isClear", false);
        setIntField(term496903, term496903.getClass(), "beforeRating", 0);
        setIntField(term496903, term496903.getClass(), "afterRating", 0);
        setIntField(term496903, term496903.getClass(), "beforeGrade", 0);
        setIntField(term496903, term496903.getClass(), "afterGrade", 0);
        setIntField(term496903, term496903.getClass(), "afterGradeRank", 0);
        setIntField(term496903, term496903.getClass(), "beforeDeluxRating", 0);
        setIntField(term496903, term496903.getClass(), "afterDeluxRating", 0);
        setBooleanField(term496903, term496903.getClass(), "isPlayTutorial", false);
        setBooleanField(term496903, term496903.getClass(), "isEventMode", false);
        setBooleanField(term496903, term496903.getClass(), "isFreedomMode", false);
        setIntField(term496903, term496903.getClass(), "playMode", 0);
        setBooleanField(term496903, term496903.getClass(), "isNewFree", false);
        setIntField(term496903, term496903.getClass(), "trialPlayAchievement", 0);
        setIntField(term496903, term496903.getClass(), "extNum1", 0);
        setIntField(term496903, term496903.getClass(), "extNum2", 0);
        term497003 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term497003;
        callMethod(klass, "setFreedomMode", argTypes, term496903, args);
    }

};


