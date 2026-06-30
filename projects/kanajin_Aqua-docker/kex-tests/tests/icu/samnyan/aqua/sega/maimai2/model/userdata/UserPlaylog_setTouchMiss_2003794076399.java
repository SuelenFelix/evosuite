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

public class UserPlaylog_setTouchMiss_2003794076399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term493945;
     Object term494045;

    public UserPlaylog_setTouchMiss_2003794076399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term493945 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term493945, term493945.getClass(), "id", 0L);
        setField(term493945, term493945.getClass(), "user", null);
        setIntField(term493945, term493945.getClass(), "orderId", 0);
        setLongField(term493945, term493945.getClass(), "playlogId", 0L);
        setIntField(term493945, term493945.getClass(), "version", 0);
        setIntField(term493945, term493945.getClass(), "placeId", 0);
        setField(term493945, term493945.getClass(), "placeName", null);
        setLongField(term493945, term493945.getClass(), "loginDate", 0L);
        setField(term493945, term493945.getClass(), "playDate", null);
        setField(term493945, term493945.getClass(), "userPlayDate", null);
        setIntField(term493945, term493945.getClass(), "type", 0);
        setIntField(term493945, term493945.getClass(), "musicId", 0);
        setIntField(term493945, term493945.getClass(), "level", 0);
        setIntField(term493945, term493945.getClass(), "trackNo", 0);
        setIntField(term493945, term493945.getClass(), "vsMode", 0);
        setField(term493945, term493945.getClass(), "vsUserName", null);
        setIntField(term493945, term493945.getClass(), "vsStatus", 0);
        setIntField(term493945, term493945.getClass(), "vsUserRating", 0);
        setIntField(term493945, term493945.getClass(), "vsUserAchievement", 0);
        setIntField(term493945, term493945.getClass(), "vsUserGradeRank", 0);
        setIntField(term493945, term493945.getClass(), "vsRank", 0);
        setIntField(term493945, term493945.getClass(), "playerNum", 0);
        setLongField(term493945, term493945.getClass(), "playedUserId1", 0L);
        setField(term493945, term493945.getClass(), "playedUserName1", null);
        setIntField(term493945, term493945.getClass(), "playedMusicLevel1", 0);
        setLongField(term493945, term493945.getClass(), "playedUserId2", 0L);
        setField(term493945, term493945.getClass(), "playedUserName2", null);
        setIntField(term493945, term493945.getClass(), "playedMusicLevel2", 0);
        setLongField(term493945, term493945.getClass(), "playedUserId3", 0L);
        setField(term493945, term493945.getClass(), "playedUserName3", null);
        setIntField(term493945, term493945.getClass(), "playedMusicLevel3", 0);
        setIntField(term493945, term493945.getClass(), "characterId1", 0);
        setIntField(term493945, term493945.getClass(), "characterLevel1", 0);
        setIntField(term493945, term493945.getClass(), "characterAwakening1", 0);
        setIntField(term493945, term493945.getClass(), "characterId2", 0);
        setIntField(term493945, term493945.getClass(), "characterLevel2", 0);
        setIntField(term493945, term493945.getClass(), "characterAwakening2", 0);
        setIntField(term493945, term493945.getClass(), "characterId3", 0);
        setIntField(term493945, term493945.getClass(), "characterLevel3", 0);
        setIntField(term493945, term493945.getClass(), "characterAwakening3", 0);
        setIntField(term493945, term493945.getClass(), "characterId4", 0);
        setIntField(term493945, term493945.getClass(), "characterLevel4", 0);
        setIntField(term493945, term493945.getClass(), "characterAwakening4", 0);
        setIntField(term493945, term493945.getClass(), "characterId5", 0);
        setIntField(term493945, term493945.getClass(), "characterLevel5", 0);
        setIntField(term493945, term493945.getClass(), "characterAwakening5", 0);
        setIntField(term493945, term493945.getClass(), "achievement", 0);
        setIntField(term493945, term493945.getClass(), "deluxscore", 0);
        setIntField(term493945, term493945.getClass(), "scoreRank", 0);
        setIntField(term493945, term493945.getClass(), "maxCombo", 0);
        setIntField(term493945, term493945.getClass(), "totalCombo", 0);
        setIntField(term493945, term493945.getClass(), "maxSync", 0);
        setIntField(term493945, term493945.getClass(), "totalSync", 0);
        setIntField(term493945, term493945.getClass(), "tapCriticalPerfect", 0);
        setIntField(term493945, term493945.getClass(), "tapPerfect", 0);
        setIntField(term493945, term493945.getClass(), "tapGreat", 0);
        setIntField(term493945, term493945.getClass(), "tapGood", 0);
        setIntField(term493945, term493945.getClass(), "tapMiss", 0);
        setIntField(term493945, term493945.getClass(), "holdCriticalPerfect", 0);
        setIntField(term493945, term493945.getClass(), "holdPerfect", 0);
        setIntField(term493945, term493945.getClass(), "holdGreat", 0);
        setIntField(term493945, term493945.getClass(), "holdGood", 0);
        setIntField(term493945, term493945.getClass(), "holdMiss", 0);
        setIntField(term493945, term493945.getClass(), "slideCriticalPerfect", 0);
        setIntField(term493945, term493945.getClass(), "slidePerfect", 0);
        setIntField(term493945, term493945.getClass(), "slideGreat", 0);
        setIntField(term493945, term493945.getClass(), "slideGood", 0);
        setIntField(term493945, term493945.getClass(), "slideMiss", 0);
        setIntField(term493945, term493945.getClass(), "touchCriticalPerfect", 0);
        setIntField(term493945, term493945.getClass(), "touchPerfect", 0);
        setIntField(term493945, term493945.getClass(), "touchGreat", 0);
        setIntField(term493945, term493945.getClass(), "touchGood", 0);
        setIntField(term493945, term493945.getClass(), "touchMiss", 0);
        setIntField(term493945, term493945.getClass(), "breakCriticalPerfect", 0);
        setIntField(term493945, term493945.getClass(), "breakPerfect", 0);
        setIntField(term493945, term493945.getClass(), "breakGreat", 0);
        setIntField(term493945, term493945.getClass(), "breakGood", 0);
        setIntField(term493945, term493945.getClass(), "breakMiss", 0);
        setBooleanField(term493945, term493945.getClass(), "isTap", false);
        setBooleanField(term493945, term493945.getClass(), "isHold", false);
        setBooleanField(term493945, term493945.getClass(), "isSlide", false);
        setBooleanField(term493945, term493945.getClass(), "isTouch", false);
        setBooleanField(term493945, term493945.getClass(), "isBreak", false);
        setBooleanField(term493945, term493945.getClass(), "isCriticalDisp", false);
        setBooleanField(term493945, term493945.getClass(), "isFastLateDisp", false);
        setIntField(term493945, term493945.getClass(), "fastCount", 0);
        setIntField(term493945, term493945.getClass(), "lateCount", 0);
        setBooleanField(term493945, term493945.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term493945, term493945.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term493945, term493945.getClass(), "comboStatus", 0);
        setIntField(term493945, term493945.getClass(), "syncStatus", 0);
        setBooleanField(term493945, term493945.getClass(), "isClear", false);
        setIntField(term493945, term493945.getClass(), "beforeRating", 0);
        setIntField(term493945, term493945.getClass(), "afterRating", 0);
        setIntField(term493945, term493945.getClass(), "beforeGrade", 0);
        setIntField(term493945, term493945.getClass(), "afterGrade", 0);
        setIntField(term493945, term493945.getClass(), "afterGradeRank", 0);
        setIntField(term493945, term493945.getClass(), "beforeDeluxRating", 0);
        setIntField(term493945, term493945.getClass(), "afterDeluxRating", 0);
        setBooleanField(term493945, term493945.getClass(), "isPlayTutorial", false);
        setBooleanField(term493945, term493945.getClass(), "isEventMode", false);
        setBooleanField(term493945, term493945.getClass(), "isFreedomMode", false);
        setIntField(term493945, term493945.getClass(), "playMode", 0);
        setBooleanField(term493945, term493945.getClass(), "isNewFree", false);
        setIntField(term493945, term493945.getClass(), "trialPlayAchievement", 0);
        setIntField(term493945, term493945.getClass(), "extNum1", 0);
        setIntField(term493945, term493945.getClass(), "extNum2", 0);
        term494045 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term494045;
        callMethod(klass, "setTouchMiss", argTypes, term493945, args);
    }

};


