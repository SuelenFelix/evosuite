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
import java.lang.Long;

public class UserPlaylog_setLoginDate_1653422624334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term487327;
     Object term487427;

    public UserPlaylog_setLoginDate_1653422624334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term487327 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term487327, term487327.getClass(), "id", 0L);
        setField(term487327, term487327.getClass(), "user", null);
        setIntField(term487327, term487327.getClass(), "orderId", 0);
        setLongField(term487327, term487327.getClass(), "playlogId", 0L);
        setIntField(term487327, term487327.getClass(), "version", 0);
        setIntField(term487327, term487327.getClass(), "placeId", 0);
        setField(term487327, term487327.getClass(), "placeName", null);
        setLongField(term487327, term487327.getClass(), "loginDate", 0L);
        setField(term487327, term487327.getClass(), "playDate", null);
        setField(term487327, term487327.getClass(), "userPlayDate", null);
        setIntField(term487327, term487327.getClass(), "type", 0);
        setIntField(term487327, term487327.getClass(), "musicId", 0);
        setIntField(term487327, term487327.getClass(), "level", 0);
        setIntField(term487327, term487327.getClass(), "trackNo", 0);
        setIntField(term487327, term487327.getClass(), "vsMode", 0);
        setField(term487327, term487327.getClass(), "vsUserName", null);
        setIntField(term487327, term487327.getClass(), "vsStatus", 0);
        setIntField(term487327, term487327.getClass(), "vsUserRating", 0);
        setIntField(term487327, term487327.getClass(), "vsUserAchievement", 0);
        setIntField(term487327, term487327.getClass(), "vsUserGradeRank", 0);
        setIntField(term487327, term487327.getClass(), "vsRank", 0);
        setIntField(term487327, term487327.getClass(), "playerNum", 0);
        setLongField(term487327, term487327.getClass(), "playedUserId1", 0L);
        setField(term487327, term487327.getClass(), "playedUserName1", null);
        setIntField(term487327, term487327.getClass(), "playedMusicLevel1", 0);
        setLongField(term487327, term487327.getClass(), "playedUserId2", 0L);
        setField(term487327, term487327.getClass(), "playedUserName2", null);
        setIntField(term487327, term487327.getClass(), "playedMusicLevel2", 0);
        setLongField(term487327, term487327.getClass(), "playedUserId3", 0L);
        setField(term487327, term487327.getClass(), "playedUserName3", null);
        setIntField(term487327, term487327.getClass(), "playedMusicLevel3", 0);
        setIntField(term487327, term487327.getClass(), "characterId1", 0);
        setIntField(term487327, term487327.getClass(), "characterLevel1", 0);
        setIntField(term487327, term487327.getClass(), "characterAwakening1", 0);
        setIntField(term487327, term487327.getClass(), "characterId2", 0);
        setIntField(term487327, term487327.getClass(), "characterLevel2", 0);
        setIntField(term487327, term487327.getClass(), "characterAwakening2", 0);
        setIntField(term487327, term487327.getClass(), "characterId3", 0);
        setIntField(term487327, term487327.getClass(), "characterLevel3", 0);
        setIntField(term487327, term487327.getClass(), "characterAwakening3", 0);
        setIntField(term487327, term487327.getClass(), "characterId4", 0);
        setIntField(term487327, term487327.getClass(), "characterLevel4", 0);
        setIntField(term487327, term487327.getClass(), "characterAwakening4", 0);
        setIntField(term487327, term487327.getClass(), "characterId5", 0);
        setIntField(term487327, term487327.getClass(), "characterLevel5", 0);
        setIntField(term487327, term487327.getClass(), "characterAwakening5", 0);
        setIntField(term487327, term487327.getClass(), "achievement", 0);
        setIntField(term487327, term487327.getClass(), "deluxscore", 0);
        setIntField(term487327, term487327.getClass(), "scoreRank", 0);
        setIntField(term487327, term487327.getClass(), "maxCombo", 0);
        setIntField(term487327, term487327.getClass(), "totalCombo", 0);
        setIntField(term487327, term487327.getClass(), "maxSync", 0);
        setIntField(term487327, term487327.getClass(), "totalSync", 0);
        setIntField(term487327, term487327.getClass(), "tapCriticalPerfect", 0);
        setIntField(term487327, term487327.getClass(), "tapPerfect", 0);
        setIntField(term487327, term487327.getClass(), "tapGreat", 0);
        setIntField(term487327, term487327.getClass(), "tapGood", 0);
        setIntField(term487327, term487327.getClass(), "tapMiss", 0);
        setIntField(term487327, term487327.getClass(), "holdCriticalPerfect", 0);
        setIntField(term487327, term487327.getClass(), "holdPerfect", 0);
        setIntField(term487327, term487327.getClass(), "holdGreat", 0);
        setIntField(term487327, term487327.getClass(), "holdGood", 0);
        setIntField(term487327, term487327.getClass(), "holdMiss", 0);
        setIntField(term487327, term487327.getClass(), "slideCriticalPerfect", 0);
        setIntField(term487327, term487327.getClass(), "slidePerfect", 0);
        setIntField(term487327, term487327.getClass(), "slideGreat", 0);
        setIntField(term487327, term487327.getClass(), "slideGood", 0);
        setIntField(term487327, term487327.getClass(), "slideMiss", 0);
        setIntField(term487327, term487327.getClass(), "touchCriticalPerfect", 0);
        setIntField(term487327, term487327.getClass(), "touchPerfect", 0);
        setIntField(term487327, term487327.getClass(), "touchGreat", 0);
        setIntField(term487327, term487327.getClass(), "touchGood", 0);
        setIntField(term487327, term487327.getClass(), "touchMiss", 0);
        setIntField(term487327, term487327.getClass(), "breakCriticalPerfect", 0);
        setIntField(term487327, term487327.getClass(), "breakPerfect", 0);
        setIntField(term487327, term487327.getClass(), "breakGreat", 0);
        setIntField(term487327, term487327.getClass(), "breakGood", 0);
        setIntField(term487327, term487327.getClass(), "breakMiss", 0);
        setBooleanField(term487327, term487327.getClass(), "isTap", false);
        setBooleanField(term487327, term487327.getClass(), "isHold", false);
        setBooleanField(term487327, term487327.getClass(), "isSlide", false);
        setBooleanField(term487327, term487327.getClass(), "isTouch", false);
        setBooleanField(term487327, term487327.getClass(), "isBreak", false);
        setBooleanField(term487327, term487327.getClass(), "isCriticalDisp", false);
        setBooleanField(term487327, term487327.getClass(), "isFastLateDisp", false);
        setIntField(term487327, term487327.getClass(), "fastCount", 0);
        setIntField(term487327, term487327.getClass(), "lateCount", 0);
        setBooleanField(term487327, term487327.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term487327, term487327.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term487327, term487327.getClass(), "comboStatus", 0);
        setIntField(term487327, term487327.getClass(), "syncStatus", 0);
        setBooleanField(term487327, term487327.getClass(), "isClear", false);
        setIntField(term487327, term487327.getClass(), "beforeRating", 0);
        setIntField(term487327, term487327.getClass(), "afterRating", 0);
        setIntField(term487327, term487327.getClass(), "beforeGrade", 0);
        setIntField(term487327, term487327.getClass(), "afterGrade", 0);
        setIntField(term487327, term487327.getClass(), "afterGradeRank", 0);
        setIntField(term487327, term487327.getClass(), "beforeDeluxRating", 0);
        setIntField(term487327, term487327.getClass(), "afterDeluxRating", 0);
        setBooleanField(term487327, term487327.getClass(), "isPlayTutorial", false);
        setBooleanField(term487327, term487327.getClass(), "isEventMode", false);
        setBooleanField(term487327, term487327.getClass(), "isFreedomMode", false);
        setIntField(term487327, term487327.getClass(), "playMode", 0);
        setBooleanField(term487327, term487327.getClass(), "isNewFree", false);
        setIntField(term487327, term487327.getClass(), "trialPlayAchievement", 0);
        setIntField(term487327, term487327.getClass(), "extNum1", 0);
        setIntField(term487327, term487327.getClass(), "extNum2", 0);
        term487427 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term487427;
        callMethod(klass, "setLoginDate", argTypes, term487327, args);
    }

};


