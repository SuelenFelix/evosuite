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
import java.lang.Integer;

public class UserPlaylog_setHoldGood_1591949353388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term492823;
     Object term492923;

    public UserPlaylog_setHoldGood_1591949353388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term492823 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term492823, term492823.getClass(), "id", 0L);
        setField(term492823, term492823.getClass(), "user", null);
        setIntField(term492823, term492823.getClass(), "orderId", 0);
        setLongField(term492823, term492823.getClass(), "playlogId", 0L);
        setIntField(term492823, term492823.getClass(), "version", 0);
        setIntField(term492823, term492823.getClass(), "placeId", 0);
        setField(term492823, term492823.getClass(), "placeName", null);
        setLongField(term492823, term492823.getClass(), "loginDate", 0L);
        setField(term492823, term492823.getClass(), "playDate", null);
        setField(term492823, term492823.getClass(), "userPlayDate", null);
        setIntField(term492823, term492823.getClass(), "type", 0);
        setIntField(term492823, term492823.getClass(), "musicId", 0);
        setIntField(term492823, term492823.getClass(), "level", 0);
        setIntField(term492823, term492823.getClass(), "trackNo", 0);
        setIntField(term492823, term492823.getClass(), "vsMode", 0);
        setField(term492823, term492823.getClass(), "vsUserName", null);
        setIntField(term492823, term492823.getClass(), "vsStatus", 0);
        setIntField(term492823, term492823.getClass(), "vsUserRating", 0);
        setIntField(term492823, term492823.getClass(), "vsUserAchievement", 0);
        setIntField(term492823, term492823.getClass(), "vsUserGradeRank", 0);
        setIntField(term492823, term492823.getClass(), "vsRank", 0);
        setIntField(term492823, term492823.getClass(), "playerNum", 0);
        setLongField(term492823, term492823.getClass(), "playedUserId1", 0L);
        setField(term492823, term492823.getClass(), "playedUserName1", null);
        setIntField(term492823, term492823.getClass(), "playedMusicLevel1", 0);
        setLongField(term492823, term492823.getClass(), "playedUserId2", 0L);
        setField(term492823, term492823.getClass(), "playedUserName2", null);
        setIntField(term492823, term492823.getClass(), "playedMusicLevel2", 0);
        setLongField(term492823, term492823.getClass(), "playedUserId3", 0L);
        setField(term492823, term492823.getClass(), "playedUserName3", null);
        setIntField(term492823, term492823.getClass(), "playedMusicLevel3", 0);
        setIntField(term492823, term492823.getClass(), "characterId1", 0);
        setIntField(term492823, term492823.getClass(), "characterLevel1", 0);
        setIntField(term492823, term492823.getClass(), "characterAwakening1", 0);
        setIntField(term492823, term492823.getClass(), "characterId2", 0);
        setIntField(term492823, term492823.getClass(), "characterLevel2", 0);
        setIntField(term492823, term492823.getClass(), "characterAwakening2", 0);
        setIntField(term492823, term492823.getClass(), "characterId3", 0);
        setIntField(term492823, term492823.getClass(), "characterLevel3", 0);
        setIntField(term492823, term492823.getClass(), "characterAwakening3", 0);
        setIntField(term492823, term492823.getClass(), "characterId4", 0);
        setIntField(term492823, term492823.getClass(), "characterLevel4", 0);
        setIntField(term492823, term492823.getClass(), "characterAwakening4", 0);
        setIntField(term492823, term492823.getClass(), "characterId5", 0);
        setIntField(term492823, term492823.getClass(), "characterLevel5", 0);
        setIntField(term492823, term492823.getClass(), "characterAwakening5", 0);
        setIntField(term492823, term492823.getClass(), "achievement", 0);
        setIntField(term492823, term492823.getClass(), "deluxscore", 0);
        setIntField(term492823, term492823.getClass(), "scoreRank", 0);
        setIntField(term492823, term492823.getClass(), "maxCombo", 0);
        setIntField(term492823, term492823.getClass(), "totalCombo", 0);
        setIntField(term492823, term492823.getClass(), "maxSync", 0);
        setIntField(term492823, term492823.getClass(), "totalSync", 0);
        setIntField(term492823, term492823.getClass(), "tapCriticalPerfect", 0);
        setIntField(term492823, term492823.getClass(), "tapPerfect", 0);
        setIntField(term492823, term492823.getClass(), "tapGreat", 0);
        setIntField(term492823, term492823.getClass(), "tapGood", 0);
        setIntField(term492823, term492823.getClass(), "tapMiss", 0);
        setIntField(term492823, term492823.getClass(), "holdCriticalPerfect", 0);
        setIntField(term492823, term492823.getClass(), "holdPerfect", 0);
        setIntField(term492823, term492823.getClass(), "holdGreat", 0);
        setIntField(term492823, term492823.getClass(), "holdGood", 0);
        setIntField(term492823, term492823.getClass(), "holdMiss", 0);
        setIntField(term492823, term492823.getClass(), "slideCriticalPerfect", 0);
        setIntField(term492823, term492823.getClass(), "slidePerfect", 0);
        setIntField(term492823, term492823.getClass(), "slideGreat", 0);
        setIntField(term492823, term492823.getClass(), "slideGood", 0);
        setIntField(term492823, term492823.getClass(), "slideMiss", 0);
        setIntField(term492823, term492823.getClass(), "touchCriticalPerfect", 0);
        setIntField(term492823, term492823.getClass(), "touchPerfect", 0);
        setIntField(term492823, term492823.getClass(), "touchGreat", 0);
        setIntField(term492823, term492823.getClass(), "touchGood", 0);
        setIntField(term492823, term492823.getClass(), "touchMiss", 0);
        setIntField(term492823, term492823.getClass(), "breakCriticalPerfect", 0);
        setIntField(term492823, term492823.getClass(), "breakPerfect", 0);
        setIntField(term492823, term492823.getClass(), "breakGreat", 0);
        setIntField(term492823, term492823.getClass(), "breakGood", 0);
        setIntField(term492823, term492823.getClass(), "breakMiss", 0);
        setBooleanField(term492823, term492823.getClass(), "isTap", false);
        setBooleanField(term492823, term492823.getClass(), "isHold", false);
        setBooleanField(term492823, term492823.getClass(), "isSlide", false);
        setBooleanField(term492823, term492823.getClass(), "isTouch", false);
        setBooleanField(term492823, term492823.getClass(), "isBreak", false);
        setBooleanField(term492823, term492823.getClass(), "isCriticalDisp", false);
        setBooleanField(term492823, term492823.getClass(), "isFastLateDisp", false);
        setIntField(term492823, term492823.getClass(), "fastCount", 0);
        setIntField(term492823, term492823.getClass(), "lateCount", 0);
        setBooleanField(term492823, term492823.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term492823, term492823.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term492823, term492823.getClass(), "comboStatus", 0);
        setIntField(term492823, term492823.getClass(), "syncStatus", 0);
        setBooleanField(term492823, term492823.getClass(), "isClear", false);
        setIntField(term492823, term492823.getClass(), "beforeRating", 0);
        setIntField(term492823, term492823.getClass(), "afterRating", 0);
        setIntField(term492823, term492823.getClass(), "beforeGrade", 0);
        setIntField(term492823, term492823.getClass(), "afterGrade", 0);
        setIntField(term492823, term492823.getClass(), "afterGradeRank", 0);
        setIntField(term492823, term492823.getClass(), "beforeDeluxRating", 0);
        setIntField(term492823, term492823.getClass(), "afterDeluxRating", 0);
        setBooleanField(term492823, term492823.getClass(), "isPlayTutorial", false);
        setBooleanField(term492823, term492823.getClass(), "isEventMode", false);
        setBooleanField(term492823, term492823.getClass(), "isFreedomMode", false);
        setIntField(term492823, term492823.getClass(), "playMode", 0);
        setBooleanField(term492823, term492823.getClass(), "isNewFree", false);
        setIntField(term492823, term492823.getClass(), "trialPlayAchievement", 0);
        setIntField(term492823, term492823.getClass(), "extNum1", 0);
        setIntField(term492823, term492823.getClass(), "extNum2", 0);
        term492923 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term492923;
        callMethod(klass, "setHoldGood", argTypes, term492823, args);
    }

};


