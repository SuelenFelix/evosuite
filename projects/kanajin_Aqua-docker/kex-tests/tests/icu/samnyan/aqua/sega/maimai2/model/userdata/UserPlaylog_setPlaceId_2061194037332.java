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

public class UserPlaylog_setPlaceId_2061194037332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term487125;
     Object term487225;

    public UserPlaylog_setPlaceId_2061194037332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term487125 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term487125, term487125.getClass(), "id", 0L);
        setField(term487125, term487125.getClass(), "user", null);
        setIntField(term487125, term487125.getClass(), "orderId", 0);
        setLongField(term487125, term487125.getClass(), "playlogId", 0L);
        setIntField(term487125, term487125.getClass(), "version", 0);
        setIntField(term487125, term487125.getClass(), "placeId", 0);
        setField(term487125, term487125.getClass(), "placeName", null);
        setLongField(term487125, term487125.getClass(), "loginDate", 0L);
        setField(term487125, term487125.getClass(), "playDate", null);
        setField(term487125, term487125.getClass(), "userPlayDate", null);
        setIntField(term487125, term487125.getClass(), "type", 0);
        setIntField(term487125, term487125.getClass(), "musicId", 0);
        setIntField(term487125, term487125.getClass(), "level", 0);
        setIntField(term487125, term487125.getClass(), "trackNo", 0);
        setIntField(term487125, term487125.getClass(), "vsMode", 0);
        setField(term487125, term487125.getClass(), "vsUserName", null);
        setIntField(term487125, term487125.getClass(), "vsStatus", 0);
        setIntField(term487125, term487125.getClass(), "vsUserRating", 0);
        setIntField(term487125, term487125.getClass(), "vsUserAchievement", 0);
        setIntField(term487125, term487125.getClass(), "vsUserGradeRank", 0);
        setIntField(term487125, term487125.getClass(), "vsRank", 0);
        setIntField(term487125, term487125.getClass(), "playerNum", 0);
        setLongField(term487125, term487125.getClass(), "playedUserId1", 0L);
        setField(term487125, term487125.getClass(), "playedUserName1", null);
        setIntField(term487125, term487125.getClass(), "playedMusicLevel1", 0);
        setLongField(term487125, term487125.getClass(), "playedUserId2", 0L);
        setField(term487125, term487125.getClass(), "playedUserName2", null);
        setIntField(term487125, term487125.getClass(), "playedMusicLevel2", 0);
        setLongField(term487125, term487125.getClass(), "playedUserId3", 0L);
        setField(term487125, term487125.getClass(), "playedUserName3", null);
        setIntField(term487125, term487125.getClass(), "playedMusicLevel3", 0);
        setIntField(term487125, term487125.getClass(), "characterId1", 0);
        setIntField(term487125, term487125.getClass(), "characterLevel1", 0);
        setIntField(term487125, term487125.getClass(), "characterAwakening1", 0);
        setIntField(term487125, term487125.getClass(), "characterId2", 0);
        setIntField(term487125, term487125.getClass(), "characterLevel2", 0);
        setIntField(term487125, term487125.getClass(), "characterAwakening2", 0);
        setIntField(term487125, term487125.getClass(), "characterId3", 0);
        setIntField(term487125, term487125.getClass(), "characterLevel3", 0);
        setIntField(term487125, term487125.getClass(), "characterAwakening3", 0);
        setIntField(term487125, term487125.getClass(), "characterId4", 0);
        setIntField(term487125, term487125.getClass(), "characterLevel4", 0);
        setIntField(term487125, term487125.getClass(), "characterAwakening4", 0);
        setIntField(term487125, term487125.getClass(), "characterId5", 0);
        setIntField(term487125, term487125.getClass(), "characterLevel5", 0);
        setIntField(term487125, term487125.getClass(), "characterAwakening5", 0);
        setIntField(term487125, term487125.getClass(), "achievement", 0);
        setIntField(term487125, term487125.getClass(), "deluxscore", 0);
        setIntField(term487125, term487125.getClass(), "scoreRank", 0);
        setIntField(term487125, term487125.getClass(), "maxCombo", 0);
        setIntField(term487125, term487125.getClass(), "totalCombo", 0);
        setIntField(term487125, term487125.getClass(), "maxSync", 0);
        setIntField(term487125, term487125.getClass(), "totalSync", 0);
        setIntField(term487125, term487125.getClass(), "tapCriticalPerfect", 0);
        setIntField(term487125, term487125.getClass(), "tapPerfect", 0);
        setIntField(term487125, term487125.getClass(), "tapGreat", 0);
        setIntField(term487125, term487125.getClass(), "tapGood", 0);
        setIntField(term487125, term487125.getClass(), "tapMiss", 0);
        setIntField(term487125, term487125.getClass(), "holdCriticalPerfect", 0);
        setIntField(term487125, term487125.getClass(), "holdPerfect", 0);
        setIntField(term487125, term487125.getClass(), "holdGreat", 0);
        setIntField(term487125, term487125.getClass(), "holdGood", 0);
        setIntField(term487125, term487125.getClass(), "holdMiss", 0);
        setIntField(term487125, term487125.getClass(), "slideCriticalPerfect", 0);
        setIntField(term487125, term487125.getClass(), "slidePerfect", 0);
        setIntField(term487125, term487125.getClass(), "slideGreat", 0);
        setIntField(term487125, term487125.getClass(), "slideGood", 0);
        setIntField(term487125, term487125.getClass(), "slideMiss", 0);
        setIntField(term487125, term487125.getClass(), "touchCriticalPerfect", 0);
        setIntField(term487125, term487125.getClass(), "touchPerfect", 0);
        setIntField(term487125, term487125.getClass(), "touchGreat", 0);
        setIntField(term487125, term487125.getClass(), "touchGood", 0);
        setIntField(term487125, term487125.getClass(), "touchMiss", 0);
        setIntField(term487125, term487125.getClass(), "breakCriticalPerfect", 0);
        setIntField(term487125, term487125.getClass(), "breakPerfect", 0);
        setIntField(term487125, term487125.getClass(), "breakGreat", 0);
        setIntField(term487125, term487125.getClass(), "breakGood", 0);
        setIntField(term487125, term487125.getClass(), "breakMiss", 0);
        setBooleanField(term487125, term487125.getClass(), "isTap", false);
        setBooleanField(term487125, term487125.getClass(), "isHold", false);
        setBooleanField(term487125, term487125.getClass(), "isSlide", false);
        setBooleanField(term487125, term487125.getClass(), "isTouch", false);
        setBooleanField(term487125, term487125.getClass(), "isBreak", false);
        setBooleanField(term487125, term487125.getClass(), "isCriticalDisp", false);
        setBooleanField(term487125, term487125.getClass(), "isFastLateDisp", false);
        setIntField(term487125, term487125.getClass(), "fastCount", 0);
        setIntField(term487125, term487125.getClass(), "lateCount", 0);
        setBooleanField(term487125, term487125.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term487125, term487125.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term487125, term487125.getClass(), "comboStatus", 0);
        setIntField(term487125, term487125.getClass(), "syncStatus", 0);
        setBooleanField(term487125, term487125.getClass(), "isClear", false);
        setIntField(term487125, term487125.getClass(), "beforeRating", 0);
        setIntField(term487125, term487125.getClass(), "afterRating", 0);
        setIntField(term487125, term487125.getClass(), "beforeGrade", 0);
        setIntField(term487125, term487125.getClass(), "afterGrade", 0);
        setIntField(term487125, term487125.getClass(), "afterGradeRank", 0);
        setIntField(term487125, term487125.getClass(), "beforeDeluxRating", 0);
        setIntField(term487125, term487125.getClass(), "afterDeluxRating", 0);
        setBooleanField(term487125, term487125.getClass(), "isPlayTutorial", false);
        setBooleanField(term487125, term487125.getClass(), "isEventMode", false);
        setBooleanField(term487125, term487125.getClass(), "isFreedomMode", false);
        setIntField(term487125, term487125.getClass(), "playMode", 0);
        setBooleanField(term487125, term487125.getClass(), "isNewFree", false);
        setIntField(term487125, term487125.getClass(), "trialPlayAchievement", 0);
        setIntField(term487125, term487125.getClass(), "extNum1", 0);
        setIntField(term487125, term487125.getClass(), "extNum2", 0);
        term487225 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term487225;
        callMethod(klass, "setPlaceId", argTypes, term487125, args);
    }

};


