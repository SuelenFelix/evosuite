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

public class UserPlaylog_setType_474884409337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term487629;
     Object term487729;

    public UserPlaylog_setType_474884409337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term487629 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term487629, term487629.getClass(), "id", 0L);
        setField(term487629, term487629.getClass(), "user", null);
        setIntField(term487629, term487629.getClass(), "orderId", 0);
        setLongField(term487629, term487629.getClass(), "playlogId", 0L);
        setIntField(term487629, term487629.getClass(), "version", 0);
        setIntField(term487629, term487629.getClass(), "placeId", 0);
        setField(term487629, term487629.getClass(), "placeName", null);
        setLongField(term487629, term487629.getClass(), "loginDate", 0L);
        setField(term487629, term487629.getClass(), "playDate", null);
        setField(term487629, term487629.getClass(), "userPlayDate", null);
        setIntField(term487629, term487629.getClass(), "type", 0);
        setIntField(term487629, term487629.getClass(), "musicId", 0);
        setIntField(term487629, term487629.getClass(), "level", 0);
        setIntField(term487629, term487629.getClass(), "trackNo", 0);
        setIntField(term487629, term487629.getClass(), "vsMode", 0);
        setField(term487629, term487629.getClass(), "vsUserName", null);
        setIntField(term487629, term487629.getClass(), "vsStatus", 0);
        setIntField(term487629, term487629.getClass(), "vsUserRating", 0);
        setIntField(term487629, term487629.getClass(), "vsUserAchievement", 0);
        setIntField(term487629, term487629.getClass(), "vsUserGradeRank", 0);
        setIntField(term487629, term487629.getClass(), "vsRank", 0);
        setIntField(term487629, term487629.getClass(), "playerNum", 0);
        setLongField(term487629, term487629.getClass(), "playedUserId1", 0L);
        setField(term487629, term487629.getClass(), "playedUserName1", null);
        setIntField(term487629, term487629.getClass(), "playedMusicLevel1", 0);
        setLongField(term487629, term487629.getClass(), "playedUserId2", 0L);
        setField(term487629, term487629.getClass(), "playedUserName2", null);
        setIntField(term487629, term487629.getClass(), "playedMusicLevel2", 0);
        setLongField(term487629, term487629.getClass(), "playedUserId3", 0L);
        setField(term487629, term487629.getClass(), "playedUserName3", null);
        setIntField(term487629, term487629.getClass(), "playedMusicLevel3", 0);
        setIntField(term487629, term487629.getClass(), "characterId1", 0);
        setIntField(term487629, term487629.getClass(), "characterLevel1", 0);
        setIntField(term487629, term487629.getClass(), "characterAwakening1", 0);
        setIntField(term487629, term487629.getClass(), "characterId2", 0);
        setIntField(term487629, term487629.getClass(), "characterLevel2", 0);
        setIntField(term487629, term487629.getClass(), "characterAwakening2", 0);
        setIntField(term487629, term487629.getClass(), "characterId3", 0);
        setIntField(term487629, term487629.getClass(), "characterLevel3", 0);
        setIntField(term487629, term487629.getClass(), "characterAwakening3", 0);
        setIntField(term487629, term487629.getClass(), "characterId4", 0);
        setIntField(term487629, term487629.getClass(), "characterLevel4", 0);
        setIntField(term487629, term487629.getClass(), "characterAwakening4", 0);
        setIntField(term487629, term487629.getClass(), "characterId5", 0);
        setIntField(term487629, term487629.getClass(), "characterLevel5", 0);
        setIntField(term487629, term487629.getClass(), "characterAwakening5", 0);
        setIntField(term487629, term487629.getClass(), "achievement", 0);
        setIntField(term487629, term487629.getClass(), "deluxscore", 0);
        setIntField(term487629, term487629.getClass(), "scoreRank", 0);
        setIntField(term487629, term487629.getClass(), "maxCombo", 0);
        setIntField(term487629, term487629.getClass(), "totalCombo", 0);
        setIntField(term487629, term487629.getClass(), "maxSync", 0);
        setIntField(term487629, term487629.getClass(), "totalSync", 0);
        setIntField(term487629, term487629.getClass(), "tapCriticalPerfect", 0);
        setIntField(term487629, term487629.getClass(), "tapPerfect", 0);
        setIntField(term487629, term487629.getClass(), "tapGreat", 0);
        setIntField(term487629, term487629.getClass(), "tapGood", 0);
        setIntField(term487629, term487629.getClass(), "tapMiss", 0);
        setIntField(term487629, term487629.getClass(), "holdCriticalPerfect", 0);
        setIntField(term487629, term487629.getClass(), "holdPerfect", 0);
        setIntField(term487629, term487629.getClass(), "holdGreat", 0);
        setIntField(term487629, term487629.getClass(), "holdGood", 0);
        setIntField(term487629, term487629.getClass(), "holdMiss", 0);
        setIntField(term487629, term487629.getClass(), "slideCriticalPerfect", 0);
        setIntField(term487629, term487629.getClass(), "slidePerfect", 0);
        setIntField(term487629, term487629.getClass(), "slideGreat", 0);
        setIntField(term487629, term487629.getClass(), "slideGood", 0);
        setIntField(term487629, term487629.getClass(), "slideMiss", 0);
        setIntField(term487629, term487629.getClass(), "touchCriticalPerfect", 0);
        setIntField(term487629, term487629.getClass(), "touchPerfect", 0);
        setIntField(term487629, term487629.getClass(), "touchGreat", 0);
        setIntField(term487629, term487629.getClass(), "touchGood", 0);
        setIntField(term487629, term487629.getClass(), "touchMiss", 0);
        setIntField(term487629, term487629.getClass(), "breakCriticalPerfect", 0);
        setIntField(term487629, term487629.getClass(), "breakPerfect", 0);
        setIntField(term487629, term487629.getClass(), "breakGreat", 0);
        setIntField(term487629, term487629.getClass(), "breakGood", 0);
        setIntField(term487629, term487629.getClass(), "breakMiss", 0);
        setBooleanField(term487629, term487629.getClass(), "isTap", false);
        setBooleanField(term487629, term487629.getClass(), "isHold", false);
        setBooleanField(term487629, term487629.getClass(), "isSlide", false);
        setBooleanField(term487629, term487629.getClass(), "isTouch", false);
        setBooleanField(term487629, term487629.getClass(), "isBreak", false);
        setBooleanField(term487629, term487629.getClass(), "isCriticalDisp", false);
        setBooleanField(term487629, term487629.getClass(), "isFastLateDisp", false);
        setIntField(term487629, term487629.getClass(), "fastCount", 0);
        setIntField(term487629, term487629.getClass(), "lateCount", 0);
        setBooleanField(term487629, term487629.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term487629, term487629.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term487629, term487629.getClass(), "comboStatus", 0);
        setIntField(term487629, term487629.getClass(), "syncStatus", 0);
        setBooleanField(term487629, term487629.getClass(), "isClear", false);
        setIntField(term487629, term487629.getClass(), "beforeRating", 0);
        setIntField(term487629, term487629.getClass(), "afterRating", 0);
        setIntField(term487629, term487629.getClass(), "beforeGrade", 0);
        setIntField(term487629, term487629.getClass(), "afterGrade", 0);
        setIntField(term487629, term487629.getClass(), "afterGradeRank", 0);
        setIntField(term487629, term487629.getClass(), "beforeDeluxRating", 0);
        setIntField(term487629, term487629.getClass(), "afterDeluxRating", 0);
        setBooleanField(term487629, term487629.getClass(), "isPlayTutorial", false);
        setBooleanField(term487629, term487629.getClass(), "isEventMode", false);
        setBooleanField(term487629, term487629.getClass(), "isFreedomMode", false);
        setIntField(term487629, term487629.getClass(), "playMode", 0);
        setBooleanField(term487629, term487629.getClass(), "isNewFree", false);
        setIntField(term487629, term487629.getClass(), "trialPlayAchievement", 0);
        setIntField(term487629, term487629.getClass(), "extNum1", 0);
        setIntField(term487629, term487629.getClass(), "extNum2", 0);
        term487729 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term487729;
        callMethod(klass, "setType", argTypes, term487629, args);
    }

};


