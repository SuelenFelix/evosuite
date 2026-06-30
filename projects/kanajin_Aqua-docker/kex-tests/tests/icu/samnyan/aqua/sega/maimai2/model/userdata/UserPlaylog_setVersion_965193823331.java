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

public class UserPlaylog_setVersion_965193823331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term487023;
     Object term487123;

    public UserPlaylog_setVersion_965193823331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term487023 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term487023, term487023.getClass(), "id", 0L);
        setField(term487023, term487023.getClass(), "user", null);
        setIntField(term487023, term487023.getClass(), "orderId", 0);
        setLongField(term487023, term487023.getClass(), "playlogId", 0L);
        setIntField(term487023, term487023.getClass(), "version", 0);
        setIntField(term487023, term487023.getClass(), "placeId", 0);
        setField(term487023, term487023.getClass(), "placeName", null);
        setLongField(term487023, term487023.getClass(), "loginDate", 0L);
        setField(term487023, term487023.getClass(), "playDate", null);
        setField(term487023, term487023.getClass(), "userPlayDate", null);
        setIntField(term487023, term487023.getClass(), "type", 0);
        setIntField(term487023, term487023.getClass(), "musicId", 0);
        setIntField(term487023, term487023.getClass(), "level", 0);
        setIntField(term487023, term487023.getClass(), "trackNo", 0);
        setIntField(term487023, term487023.getClass(), "vsMode", 0);
        setField(term487023, term487023.getClass(), "vsUserName", null);
        setIntField(term487023, term487023.getClass(), "vsStatus", 0);
        setIntField(term487023, term487023.getClass(), "vsUserRating", 0);
        setIntField(term487023, term487023.getClass(), "vsUserAchievement", 0);
        setIntField(term487023, term487023.getClass(), "vsUserGradeRank", 0);
        setIntField(term487023, term487023.getClass(), "vsRank", 0);
        setIntField(term487023, term487023.getClass(), "playerNum", 0);
        setLongField(term487023, term487023.getClass(), "playedUserId1", 0L);
        setField(term487023, term487023.getClass(), "playedUserName1", null);
        setIntField(term487023, term487023.getClass(), "playedMusicLevel1", 0);
        setLongField(term487023, term487023.getClass(), "playedUserId2", 0L);
        setField(term487023, term487023.getClass(), "playedUserName2", null);
        setIntField(term487023, term487023.getClass(), "playedMusicLevel2", 0);
        setLongField(term487023, term487023.getClass(), "playedUserId3", 0L);
        setField(term487023, term487023.getClass(), "playedUserName3", null);
        setIntField(term487023, term487023.getClass(), "playedMusicLevel3", 0);
        setIntField(term487023, term487023.getClass(), "characterId1", 0);
        setIntField(term487023, term487023.getClass(), "characterLevel1", 0);
        setIntField(term487023, term487023.getClass(), "characterAwakening1", 0);
        setIntField(term487023, term487023.getClass(), "characterId2", 0);
        setIntField(term487023, term487023.getClass(), "characterLevel2", 0);
        setIntField(term487023, term487023.getClass(), "characterAwakening2", 0);
        setIntField(term487023, term487023.getClass(), "characterId3", 0);
        setIntField(term487023, term487023.getClass(), "characterLevel3", 0);
        setIntField(term487023, term487023.getClass(), "characterAwakening3", 0);
        setIntField(term487023, term487023.getClass(), "characterId4", 0);
        setIntField(term487023, term487023.getClass(), "characterLevel4", 0);
        setIntField(term487023, term487023.getClass(), "characterAwakening4", 0);
        setIntField(term487023, term487023.getClass(), "characterId5", 0);
        setIntField(term487023, term487023.getClass(), "characterLevel5", 0);
        setIntField(term487023, term487023.getClass(), "characterAwakening5", 0);
        setIntField(term487023, term487023.getClass(), "achievement", 0);
        setIntField(term487023, term487023.getClass(), "deluxscore", 0);
        setIntField(term487023, term487023.getClass(), "scoreRank", 0);
        setIntField(term487023, term487023.getClass(), "maxCombo", 0);
        setIntField(term487023, term487023.getClass(), "totalCombo", 0);
        setIntField(term487023, term487023.getClass(), "maxSync", 0);
        setIntField(term487023, term487023.getClass(), "totalSync", 0);
        setIntField(term487023, term487023.getClass(), "tapCriticalPerfect", 0);
        setIntField(term487023, term487023.getClass(), "tapPerfect", 0);
        setIntField(term487023, term487023.getClass(), "tapGreat", 0);
        setIntField(term487023, term487023.getClass(), "tapGood", 0);
        setIntField(term487023, term487023.getClass(), "tapMiss", 0);
        setIntField(term487023, term487023.getClass(), "holdCriticalPerfect", 0);
        setIntField(term487023, term487023.getClass(), "holdPerfect", 0);
        setIntField(term487023, term487023.getClass(), "holdGreat", 0);
        setIntField(term487023, term487023.getClass(), "holdGood", 0);
        setIntField(term487023, term487023.getClass(), "holdMiss", 0);
        setIntField(term487023, term487023.getClass(), "slideCriticalPerfect", 0);
        setIntField(term487023, term487023.getClass(), "slidePerfect", 0);
        setIntField(term487023, term487023.getClass(), "slideGreat", 0);
        setIntField(term487023, term487023.getClass(), "slideGood", 0);
        setIntField(term487023, term487023.getClass(), "slideMiss", 0);
        setIntField(term487023, term487023.getClass(), "touchCriticalPerfect", 0);
        setIntField(term487023, term487023.getClass(), "touchPerfect", 0);
        setIntField(term487023, term487023.getClass(), "touchGreat", 0);
        setIntField(term487023, term487023.getClass(), "touchGood", 0);
        setIntField(term487023, term487023.getClass(), "touchMiss", 0);
        setIntField(term487023, term487023.getClass(), "breakCriticalPerfect", 0);
        setIntField(term487023, term487023.getClass(), "breakPerfect", 0);
        setIntField(term487023, term487023.getClass(), "breakGreat", 0);
        setIntField(term487023, term487023.getClass(), "breakGood", 0);
        setIntField(term487023, term487023.getClass(), "breakMiss", 0);
        setBooleanField(term487023, term487023.getClass(), "isTap", false);
        setBooleanField(term487023, term487023.getClass(), "isHold", false);
        setBooleanField(term487023, term487023.getClass(), "isSlide", false);
        setBooleanField(term487023, term487023.getClass(), "isTouch", false);
        setBooleanField(term487023, term487023.getClass(), "isBreak", false);
        setBooleanField(term487023, term487023.getClass(), "isCriticalDisp", false);
        setBooleanField(term487023, term487023.getClass(), "isFastLateDisp", false);
        setIntField(term487023, term487023.getClass(), "fastCount", 0);
        setIntField(term487023, term487023.getClass(), "lateCount", 0);
        setBooleanField(term487023, term487023.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term487023, term487023.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term487023, term487023.getClass(), "comboStatus", 0);
        setIntField(term487023, term487023.getClass(), "syncStatus", 0);
        setBooleanField(term487023, term487023.getClass(), "isClear", false);
        setIntField(term487023, term487023.getClass(), "beforeRating", 0);
        setIntField(term487023, term487023.getClass(), "afterRating", 0);
        setIntField(term487023, term487023.getClass(), "beforeGrade", 0);
        setIntField(term487023, term487023.getClass(), "afterGrade", 0);
        setIntField(term487023, term487023.getClass(), "afterGradeRank", 0);
        setIntField(term487023, term487023.getClass(), "beforeDeluxRating", 0);
        setIntField(term487023, term487023.getClass(), "afterDeluxRating", 0);
        setBooleanField(term487023, term487023.getClass(), "isPlayTutorial", false);
        setBooleanField(term487023, term487023.getClass(), "isEventMode", false);
        setBooleanField(term487023, term487023.getClass(), "isFreedomMode", false);
        setIntField(term487023, term487023.getClass(), "playMode", 0);
        setBooleanField(term487023, term487023.getClass(), "isNewFree", false);
        setIntField(term487023, term487023.getClass(), "trialPlayAchievement", 0);
        setIntField(term487023, term487023.getClass(), "extNum1", 0);
        setIntField(term487023, term487023.getClass(), "extNum2", 0);
        term487123 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term487123;
        callMethod(klass, "setVersion", argTypes, term487023, args);
    }

};


