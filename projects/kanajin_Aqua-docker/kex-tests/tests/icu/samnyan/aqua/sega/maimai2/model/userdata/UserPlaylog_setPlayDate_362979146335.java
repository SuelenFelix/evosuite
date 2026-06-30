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

public class UserPlaylog_setPlayDate_362979146335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term487429;

    public UserPlaylog_setPlayDate_362979146335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term487429 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term487429, term487429.getClass(), "id", 0L);
        setField(term487429, term487429.getClass(), "user", null);
        setIntField(term487429, term487429.getClass(), "orderId", 0);
        setLongField(term487429, term487429.getClass(), "playlogId", 0L);
        setIntField(term487429, term487429.getClass(), "version", 0);
        setIntField(term487429, term487429.getClass(), "placeId", 0);
        setField(term487429, term487429.getClass(), "placeName", null);
        setLongField(term487429, term487429.getClass(), "loginDate", 0L);
        setField(term487429, term487429.getClass(), "playDate", null);
        setField(term487429, term487429.getClass(), "userPlayDate", null);
        setIntField(term487429, term487429.getClass(), "type", 0);
        setIntField(term487429, term487429.getClass(), "musicId", 0);
        setIntField(term487429, term487429.getClass(), "level", 0);
        setIntField(term487429, term487429.getClass(), "trackNo", 0);
        setIntField(term487429, term487429.getClass(), "vsMode", 0);
        setField(term487429, term487429.getClass(), "vsUserName", null);
        setIntField(term487429, term487429.getClass(), "vsStatus", 0);
        setIntField(term487429, term487429.getClass(), "vsUserRating", 0);
        setIntField(term487429, term487429.getClass(), "vsUserAchievement", 0);
        setIntField(term487429, term487429.getClass(), "vsUserGradeRank", 0);
        setIntField(term487429, term487429.getClass(), "vsRank", 0);
        setIntField(term487429, term487429.getClass(), "playerNum", 0);
        setLongField(term487429, term487429.getClass(), "playedUserId1", 0L);
        setField(term487429, term487429.getClass(), "playedUserName1", null);
        setIntField(term487429, term487429.getClass(), "playedMusicLevel1", 0);
        setLongField(term487429, term487429.getClass(), "playedUserId2", 0L);
        setField(term487429, term487429.getClass(), "playedUserName2", null);
        setIntField(term487429, term487429.getClass(), "playedMusicLevel2", 0);
        setLongField(term487429, term487429.getClass(), "playedUserId3", 0L);
        setField(term487429, term487429.getClass(), "playedUserName3", null);
        setIntField(term487429, term487429.getClass(), "playedMusicLevel3", 0);
        setIntField(term487429, term487429.getClass(), "characterId1", 0);
        setIntField(term487429, term487429.getClass(), "characterLevel1", 0);
        setIntField(term487429, term487429.getClass(), "characterAwakening1", 0);
        setIntField(term487429, term487429.getClass(), "characterId2", 0);
        setIntField(term487429, term487429.getClass(), "characterLevel2", 0);
        setIntField(term487429, term487429.getClass(), "characterAwakening2", 0);
        setIntField(term487429, term487429.getClass(), "characterId3", 0);
        setIntField(term487429, term487429.getClass(), "characterLevel3", 0);
        setIntField(term487429, term487429.getClass(), "characterAwakening3", 0);
        setIntField(term487429, term487429.getClass(), "characterId4", 0);
        setIntField(term487429, term487429.getClass(), "characterLevel4", 0);
        setIntField(term487429, term487429.getClass(), "characterAwakening4", 0);
        setIntField(term487429, term487429.getClass(), "characterId5", 0);
        setIntField(term487429, term487429.getClass(), "characterLevel5", 0);
        setIntField(term487429, term487429.getClass(), "characterAwakening5", 0);
        setIntField(term487429, term487429.getClass(), "achievement", 0);
        setIntField(term487429, term487429.getClass(), "deluxscore", 0);
        setIntField(term487429, term487429.getClass(), "scoreRank", 0);
        setIntField(term487429, term487429.getClass(), "maxCombo", 0);
        setIntField(term487429, term487429.getClass(), "totalCombo", 0);
        setIntField(term487429, term487429.getClass(), "maxSync", 0);
        setIntField(term487429, term487429.getClass(), "totalSync", 0);
        setIntField(term487429, term487429.getClass(), "tapCriticalPerfect", 0);
        setIntField(term487429, term487429.getClass(), "tapPerfect", 0);
        setIntField(term487429, term487429.getClass(), "tapGreat", 0);
        setIntField(term487429, term487429.getClass(), "tapGood", 0);
        setIntField(term487429, term487429.getClass(), "tapMiss", 0);
        setIntField(term487429, term487429.getClass(), "holdCriticalPerfect", 0);
        setIntField(term487429, term487429.getClass(), "holdPerfect", 0);
        setIntField(term487429, term487429.getClass(), "holdGreat", 0);
        setIntField(term487429, term487429.getClass(), "holdGood", 0);
        setIntField(term487429, term487429.getClass(), "holdMiss", 0);
        setIntField(term487429, term487429.getClass(), "slideCriticalPerfect", 0);
        setIntField(term487429, term487429.getClass(), "slidePerfect", 0);
        setIntField(term487429, term487429.getClass(), "slideGreat", 0);
        setIntField(term487429, term487429.getClass(), "slideGood", 0);
        setIntField(term487429, term487429.getClass(), "slideMiss", 0);
        setIntField(term487429, term487429.getClass(), "touchCriticalPerfect", 0);
        setIntField(term487429, term487429.getClass(), "touchPerfect", 0);
        setIntField(term487429, term487429.getClass(), "touchGreat", 0);
        setIntField(term487429, term487429.getClass(), "touchGood", 0);
        setIntField(term487429, term487429.getClass(), "touchMiss", 0);
        setIntField(term487429, term487429.getClass(), "breakCriticalPerfect", 0);
        setIntField(term487429, term487429.getClass(), "breakPerfect", 0);
        setIntField(term487429, term487429.getClass(), "breakGreat", 0);
        setIntField(term487429, term487429.getClass(), "breakGood", 0);
        setIntField(term487429, term487429.getClass(), "breakMiss", 0);
        setBooleanField(term487429, term487429.getClass(), "isTap", false);
        setBooleanField(term487429, term487429.getClass(), "isHold", false);
        setBooleanField(term487429, term487429.getClass(), "isSlide", false);
        setBooleanField(term487429, term487429.getClass(), "isTouch", false);
        setBooleanField(term487429, term487429.getClass(), "isBreak", false);
        setBooleanField(term487429, term487429.getClass(), "isCriticalDisp", false);
        setBooleanField(term487429, term487429.getClass(), "isFastLateDisp", false);
        setIntField(term487429, term487429.getClass(), "fastCount", 0);
        setIntField(term487429, term487429.getClass(), "lateCount", 0);
        setBooleanField(term487429, term487429.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term487429, term487429.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term487429, term487429.getClass(), "comboStatus", 0);
        setIntField(term487429, term487429.getClass(), "syncStatus", 0);
        setBooleanField(term487429, term487429.getClass(), "isClear", false);
        setIntField(term487429, term487429.getClass(), "beforeRating", 0);
        setIntField(term487429, term487429.getClass(), "afterRating", 0);
        setIntField(term487429, term487429.getClass(), "beforeGrade", 0);
        setIntField(term487429, term487429.getClass(), "afterGrade", 0);
        setIntField(term487429, term487429.getClass(), "afterGradeRank", 0);
        setIntField(term487429, term487429.getClass(), "beforeDeluxRating", 0);
        setIntField(term487429, term487429.getClass(), "afterDeluxRating", 0);
        setBooleanField(term487429, term487429.getClass(), "isPlayTutorial", false);
        setBooleanField(term487429, term487429.getClass(), "isEventMode", false);
        setBooleanField(term487429, term487429.getClass(), "isFreedomMode", false);
        setIntField(term487429, term487429.getClass(), "playMode", 0);
        setBooleanField(term487429, term487429.getClass(), "isNewFree", false);
        setIntField(term487429, term487429.getClass(), "trialPlayAchievement", 0);
        setIntField(term487429, term487429.getClass(), "extNum1", 0);
        setIntField(term487429, term487429.getClass(), "extNum2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlayDate", argTypes, term487429, args);
    }

};


