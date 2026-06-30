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

public class UserPlaylog_setUserPlayDate_591096715336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term487529;

    public UserPlaylog_setUserPlayDate_591096715336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term487529 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term487529, term487529.getClass(), "id", 0L);
        setField(term487529, term487529.getClass(), "user", null);
        setIntField(term487529, term487529.getClass(), "orderId", 0);
        setLongField(term487529, term487529.getClass(), "playlogId", 0L);
        setIntField(term487529, term487529.getClass(), "version", 0);
        setIntField(term487529, term487529.getClass(), "placeId", 0);
        setField(term487529, term487529.getClass(), "placeName", null);
        setLongField(term487529, term487529.getClass(), "loginDate", 0L);
        setField(term487529, term487529.getClass(), "playDate", null);
        setField(term487529, term487529.getClass(), "userPlayDate", null);
        setIntField(term487529, term487529.getClass(), "type", 0);
        setIntField(term487529, term487529.getClass(), "musicId", 0);
        setIntField(term487529, term487529.getClass(), "level", 0);
        setIntField(term487529, term487529.getClass(), "trackNo", 0);
        setIntField(term487529, term487529.getClass(), "vsMode", 0);
        setField(term487529, term487529.getClass(), "vsUserName", null);
        setIntField(term487529, term487529.getClass(), "vsStatus", 0);
        setIntField(term487529, term487529.getClass(), "vsUserRating", 0);
        setIntField(term487529, term487529.getClass(), "vsUserAchievement", 0);
        setIntField(term487529, term487529.getClass(), "vsUserGradeRank", 0);
        setIntField(term487529, term487529.getClass(), "vsRank", 0);
        setIntField(term487529, term487529.getClass(), "playerNum", 0);
        setLongField(term487529, term487529.getClass(), "playedUserId1", 0L);
        setField(term487529, term487529.getClass(), "playedUserName1", null);
        setIntField(term487529, term487529.getClass(), "playedMusicLevel1", 0);
        setLongField(term487529, term487529.getClass(), "playedUserId2", 0L);
        setField(term487529, term487529.getClass(), "playedUserName2", null);
        setIntField(term487529, term487529.getClass(), "playedMusicLevel2", 0);
        setLongField(term487529, term487529.getClass(), "playedUserId3", 0L);
        setField(term487529, term487529.getClass(), "playedUserName3", null);
        setIntField(term487529, term487529.getClass(), "playedMusicLevel3", 0);
        setIntField(term487529, term487529.getClass(), "characterId1", 0);
        setIntField(term487529, term487529.getClass(), "characterLevel1", 0);
        setIntField(term487529, term487529.getClass(), "characterAwakening1", 0);
        setIntField(term487529, term487529.getClass(), "characterId2", 0);
        setIntField(term487529, term487529.getClass(), "characterLevel2", 0);
        setIntField(term487529, term487529.getClass(), "characterAwakening2", 0);
        setIntField(term487529, term487529.getClass(), "characterId3", 0);
        setIntField(term487529, term487529.getClass(), "characterLevel3", 0);
        setIntField(term487529, term487529.getClass(), "characterAwakening3", 0);
        setIntField(term487529, term487529.getClass(), "characterId4", 0);
        setIntField(term487529, term487529.getClass(), "characterLevel4", 0);
        setIntField(term487529, term487529.getClass(), "characterAwakening4", 0);
        setIntField(term487529, term487529.getClass(), "characterId5", 0);
        setIntField(term487529, term487529.getClass(), "characterLevel5", 0);
        setIntField(term487529, term487529.getClass(), "characterAwakening5", 0);
        setIntField(term487529, term487529.getClass(), "achievement", 0);
        setIntField(term487529, term487529.getClass(), "deluxscore", 0);
        setIntField(term487529, term487529.getClass(), "scoreRank", 0);
        setIntField(term487529, term487529.getClass(), "maxCombo", 0);
        setIntField(term487529, term487529.getClass(), "totalCombo", 0);
        setIntField(term487529, term487529.getClass(), "maxSync", 0);
        setIntField(term487529, term487529.getClass(), "totalSync", 0);
        setIntField(term487529, term487529.getClass(), "tapCriticalPerfect", 0);
        setIntField(term487529, term487529.getClass(), "tapPerfect", 0);
        setIntField(term487529, term487529.getClass(), "tapGreat", 0);
        setIntField(term487529, term487529.getClass(), "tapGood", 0);
        setIntField(term487529, term487529.getClass(), "tapMiss", 0);
        setIntField(term487529, term487529.getClass(), "holdCriticalPerfect", 0);
        setIntField(term487529, term487529.getClass(), "holdPerfect", 0);
        setIntField(term487529, term487529.getClass(), "holdGreat", 0);
        setIntField(term487529, term487529.getClass(), "holdGood", 0);
        setIntField(term487529, term487529.getClass(), "holdMiss", 0);
        setIntField(term487529, term487529.getClass(), "slideCriticalPerfect", 0);
        setIntField(term487529, term487529.getClass(), "slidePerfect", 0);
        setIntField(term487529, term487529.getClass(), "slideGreat", 0);
        setIntField(term487529, term487529.getClass(), "slideGood", 0);
        setIntField(term487529, term487529.getClass(), "slideMiss", 0);
        setIntField(term487529, term487529.getClass(), "touchCriticalPerfect", 0);
        setIntField(term487529, term487529.getClass(), "touchPerfect", 0);
        setIntField(term487529, term487529.getClass(), "touchGreat", 0);
        setIntField(term487529, term487529.getClass(), "touchGood", 0);
        setIntField(term487529, term487529.getClass(), "touchMiss", 0);
        setIntField(term487529, term487529.getClass(), "breakCriticalPerfect", 0);
        setIntField(term487529, term487529.getClass(), "breakPerfect", 0);
        setIntField(term487529, term487529.getClass(), "breakGreat", 0);
        setIntField(term487529, term487529.getClass(), "breakGood", 0);
        setIntField(term487529, term487529.getClass(), "breakMiss", 0);
        setBooleanField(term487529, term487529.getClass(), "isTap", false);
        setBooleanField(term487529, term487529.getClass(), "isHold", false);
        setBooleanField(term487529, term487529.getClass(), "isSlide", false);
        setBooleanField(term487529, term487529.getClass(), "isTouch", false);
        setBooleanField(term487529, term487529.getClass(), "isBreak", false);
        setBooleanField(term487529, term487529.getClass(), "isCriticalDisp", false);
        setBooleanField(term487529, term487529.getClass(), "isFastLateDisp", false);
        setIntField(term487529, term487529.getClass(), "fastCount", 0);
        setIntField(term487529, term487529.getClass(), "lateCount", 0);
        setBooleanField(term487529, term487529.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term487529, term487529.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term487529, term487529.getClass(), "comboStatus", 0);
        setIntField(term487529, term487529.getClass(), "syncStatus", 0);
        setBooleanField(term487529, term487529.getClass(), "isClear", false);
        setIntField(term487529, term487529.getClass(), "beforeRating", 0);
        setIntField(term487529, term487529.getClass(), "afterRating", 0);
        setIntField(term487529, term487529.getClass(), "beforeGrade", 0);
        setIntField(term487529, term487529.getClass(), "afterGrade", 0);
        setIntField(term487529, term487529.getClass(), "afterGradeRank", 0);
        setIntField(term487529, term487529.getClass(), "beforeDeluxRating", 0);
        setIntField(term487529, term487529.getClass(), "afterDeluxRating", 0);
        setBooleanField(term487529, term487529.getClass(), "isPlayTutorial", false);
        setBooleanField(term487529, term487529.getClass(), "isEventMode", false);
        setBooleanField(term487529, term487529.getClass(), "isFreedomMode", false);
        setIntField(term487529, term487529.getClass(), "playMode", 0);
        setBooleanField(term487529, term487529.getClass(), "isNewFree", false);
        setIntField(term487529, term487529.getClass(), "trialPlayAchievement", 0);
        setIntField(term487529, term487529.getClass(), "extNum1", 0);
        setIntField(term487529, term487529.getClass(), "extNum2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserPlayDate", argTypes, term487529, args);
    }

};


