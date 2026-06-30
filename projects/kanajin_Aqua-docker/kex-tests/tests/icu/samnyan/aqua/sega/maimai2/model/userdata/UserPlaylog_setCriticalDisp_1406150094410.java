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

public class UserPlaylog_setCriticalDisp_1406150094410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term495067;
     Object term495167;

    public UserPlaylog_setCriticalDisp_1406150094410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term495067 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term495067, term495067.getClass(), "id", 0L);
        setField(term495067, term495067.getClass(), "user", null);
        setIntField(term495067, term495067.getClass(), "orderId", 0);
        setLongField(term495067, term495067.getClass(), "playlogId", 0L);
        setIntField(term495067, term495067.getClass(), "version", 0);
        setIntField(term495067, term495067.getClass(), "placeId", 0);
        setField(term495067, term495067.getClass(), "placeName", null);
        setLongField(term495067, term495067.getClass(), "loginDate", 0L);
        setField(term495067, term495067.getClass(), "playDate", null);
        setField(term495067, term495067.getClass(), "userPlayDate", null);
        setIntField(term495067, term495067.getClass(), "type", 0);
        setIntField(term495067, term495067.getClass(), "musicId", 0);
        setIntField(term495067, term495067.getClass(), "level", 0);
        setIntField(term495067, term495067.getClass(), "trackNo", 0);
        setIntField(term495067, term495067.getClass(), "vsMode", 0);
        setField(term495067, term495067.getClass(), "vsUserName", null);
        setIntField(term495067, term495067.getClass(), "vsStatus", 0);
        setIntField(term495067, term495067.getClass(), "vsUserRating", 0);
        setIntField(term495067, term495067.getClass(), "vsUserAchievement", 0);
        setIntField(term495067, term495067.getClass(), "vsUserGradeRank", 0);
        setIntField(term495067, term495067.getClass(), "vsRank", 0);
        setIntField(term495067, term495067.getClass(), "playerNum", 0);
        setLongField(term495067, term495067.getClass(), "playedUserId1", 0L);
        setField(term495067, term495067.getClass(), "playedUserName1", null);
        setIntField(term495067, term495067.getClass(), "playedMusicLevel1", 0);
        setLongField(term495067, term495067.getClass(), "playedUserId2", 0L);
        setField(term495067, term495067.getClass(), "playedUserName2", null);
        setIntField(term495067, term495067.getClass(), "playedMusicLevel2", 0);
        setLongField(term495067, term495067.getClass(), "playedUserId3", 0L);
        setField(term495067, term495067.getClass(), "playedUserName3", null);
        setIntField(term495067, term495067.getClass(), "playedMusicLevel3", 0);
        setIntField(term495067, term495067.getClass(), "characterId1", 0);
        setIntField(term495067, term495067.getClass(), "characterLevel1", 0);
        setIntField(term495067, term495067.getClass(), "characterAwakening1", 0);
        setIntField(term495067, term495067.getClass(), "characterId2", 0);
        setIntField(term495067, term495067.getClass(), "characterLevel2", 0);
        setIntField(term495067, term495067.getClass(), "characterAwakening2", 0);
        setIntField(term495067, term495067.getClass(), "characterId3", 0);
        setIntField(term495067, term495067.getClass(), "characterLevel3", 0);
        setIntField(term495067, term495067.getClass(), "characterAwakening3", 0);
        setIntField(term495067, term495067.getClass(), "characterId4", 0);
        setIntField(term495067, term495067.getClass(), "characterLevel4", 0);
        setIntField(term495067, term495067.getClass(), "characterAwakening4", 0);
        setIntField(term495067, term495067.getClass(), "characterId5", 0);
        setIntField(term495067, term495067.getClass(), "characterLevel5", 0);
        setIntField(term495067, term495067.getClass(), "characterAwakening5", 0);
        setIntField(term495067, term495067.getClass(), "achievement", 0);
        setIntField(term495067, term495067.getClass(), "deluxscore", 0);
        setIntField(term495067, term495067.getClass(), "scoreRank", 0);
        setIntField(term495067, term495067.getClass(), "maxCombo", 0);
        setIntField(term495067, term495067.getClass(), "totalCombo", 0);
        setIntField(term495067, term495067.getClass(), "maxSync", 0);
        setIntField(term495067, term495067.getClass(), "totalSync", 0);
        setIntField(term495067, term495067.getClass(), "tapCriticalPerfect", 0);
        setIntField(term495067, term495067.getClass(), "tapPerfect", 0);
        setIntField(term495067, term495067.getClass(), "tapGreat", 0);
        setIntField(term495067, term495067.getClass(), "tapGood", 0);
        setIntField(term495067, term495067.getClass(), "tapMiss", 0);
        setIntField(term495067, term495067.getClass(), "holdCriticalPerfect", 0);
        setIntField(term495067, term495067.getClass(), "holdPerfect", 0);
        setIntField(term495067, term495067.getClass(), "holdGreat", 0);
        setIntField(term495067, term495067.getClass(), "holdGood", 0);
        setIntField(term495067, term495067.getClass(), "holdMiss", 0);
        setIntField(term495067, term495067.getClass(), "slideCriticalPerfect", 0);
        setIntField(term495067, term495067.getClass(), "slidePerfect", 0);
        setIntField(term495067, term495067.getClass(), "slideGreat", 0);
        setIntField(term495067, term495067.getClass(), "slideGood", 0);
        setIntField(term495067, term495067.getClass(), "slideMiss", 0);
        setIntField(term495067, term495067.getClass(), "touchCriticalPerfect", 0);
        setIntField(term495067, term495067.getClass(), "touchPerfect", 0);
        setIntField(term495067, term495067.getClass(), "touchGreat", 0);
        setIntField(term495067, term495067.getClass(), "touchGood", 0);
        setIntField(term495067, term495067.getClass(), "touchMiss", 0);
        setIntField(term495067, term495067.getClass(), "breakCriticalPerfect", 0);
        setIntField(term495067, term495067.getClass(), "breakPerfect", 0);
        setIntField(term495067, term495067.getClass(), "breakGreat", 0);
        setIntField(term495067, term495067.getClass(), "breakGood", 0);
        setIntField(term495067, term495067.getClass(), "breakMiss", 0);
        setBooleanField(term495067, term495067.getClass(), "isTap", false);
        setBooleanField(term495067, term495067.getClass(), "isHold", false);
        setBooleanField(term495067, term495067.getClass(), "isSlide", false);
        setBooleanField(term495067, term495067.getClass(), "isTouch", false);
        setBooleanField(term495067, term495067.getClass(), "isBreak", false);
        setBooleanField(term495067, term495067.getClass(), "isCriticalDisp", false);
        setBooleanField(term495067, term495067.getClass(), "isFastLateDisp", false);
        setIntField(term495067, term495067.getClass(), "fastCount", 0);
        setIntField(term495067, term495067.getClass(), "lateCount", 0);
        setBooleanField(term495067, term495067.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term495067, term495067.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term495067, term495067.getClass(), "comboStatus", 0);
        setIntField(term495067, term495067.getClass(), "syncStatus", 0);
        setBooleanField(term495067, term495067.getClass(), "isClear", false);
        setIntField(term495067, term495067.getClass(), "beforeRating", 0);
        setIntField(term495067, term495067.getClass(), "afterRating", 0);
        setIntField(term495067, term495067.getClass(), "beforeGrade", 0);
        setIntField(term495067, term495067.getClass(), "afterGrade", 0);
        setIntField(term495067, term495067.getClass(), "afterGradeRank", 0);
        setIntField(term495067, term495067.getClass(), "beforeDeluxRating", 0);
        setIntField(term495067, term495067.getClass(), "afterDeluxRating", 0);
        setBooleanField(term495067, term495067.getClass(), "isPlayTutorial", false);
        setBooleanField(term495067, term495067.getClass(), "isEventMode", false);
        setBooleanField(term495067, term495067.getClass(), "isFreedomMode", false);
        setIntField(term495067, term495067.getClass(), "playMode", 0);
        setBooleanField(term495067, term495067.getClass(), "isNewFree", false);
        setIntField(term495067, term495067.getClass(), "trialPlayAchievement", 0);
        setIntField(term495067, term495067.getClass(), "extNum1", 0);
        setIntField(term495067, term495067.getClass(), "extNum2", 0);
        term495167 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term495167;
        callMethod(klass, "setCriticalDisp", argTypes, term495067, args);
    }

};


