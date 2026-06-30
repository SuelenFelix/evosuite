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

public class UserPlaylog_setPlayedUserId3_727051267355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term489459;
     Object term489559;

    public UserPlaylog_setPlayedUserId3_727051267355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term489459 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term489459, term489459.getClass(), "id", 0L);
        setField(term489459, term489459.getClass(), "user", null);
        setIntField(term489459, term489459.getClass(), "orderId", 0);
        setLongField(term489459, term489459.getClass(), "playlogId", 0L);
        setIntField(term489459, term489459.getClass(), "version", 0);
        setIntField(term489459, term489459.getClass(), "placeId", 0);
        setField(term489459, term489459.getClass(), "placeName", null);
        setLongField(term489459, term489459.getClass(), "loginDate", 0L);
        setField(term489459, term489459.getClass(), "playDate", null);
        setField(term489459, term489459.getClass(), "userPlayDate", null);
        setIntField(term489459, term489459.getClass(), "type", 0);
        setIntField(term489459, term489459.getClass(), "musicId", 0);
        setIntField(term489459, term489459.getClass(), "level", 0);
        setIntField(term489459, term489459.getClass(), "trackNo", 0);
        setIntField(term489459, term489459.getClass(), "vsMode", 0);
        setField(term489459, term489459.getClass(), "vsUserName", null);
        setIntField(term489459, term489459.getClass(), "vsStatus", 0);
        setIntField(term489459, term489459.getClass(), "vsUserRating", 0);
        setIntField(term489459, term489459.getClass(), "vsUserAchievement", 0);
        setIntField(term489459, term489459.getClass(), "vsUserGradeRank", 0);
        setIntField(term489459, term489459.getClass(), "vsRank", 0);
        setIntField(term489459, term489459.getClass(), "playerNum", 0);
        setLongField(term489459, term489459.getClass(), "playedUserId1", 0L);
        setField(term489459, term489459.getClass(), "playedUserName1", null);
        setIntField(term489459, term489459.getClass(), "playedMusicLevel1", 0);
        setLongField(term489459, term489459.getClass(), "playedUserId2", 0L);
        setField(term489459, term489459.getClass(), "playedUserName2", null);
        setIntField(term489459, term489459.getClass(), "playedMusicLevel2", 0);
        setLongField(term489459, term489459.getClass(), "playedUserId3", 0L);
        setField(term489459, term489459.getClass(), "playedUserName3", null);
        setIntField(term489459, term489459.getClass(), "playedMusicLevel3", 0);
        setIntField(term489459, term489459.getClass(), "characterId1", 0);
        setIntField(term489459, term489459.getClass(), "characterLevel1", 0);
        setIntField(term489459, term489459.getClass(), "characterAwakening1", 0);
        setIntField(term489459, term489459.getClass(), "characterId2", 0);
        setIntField(term489459, term489459.getClass(), "characterLevel2", 0);
        setIntField(term489459, term489459.getClass(), "characterAwakening2", 0);
        setIntField(term489459, term489459.getClass(), "characterId3", 0);
        setIntField(term489459, term489459.getClass(), "characterLevel3", 0);
        setIntField(term489459, term489459.getClass(), "characterAwakening3", 0);
        setIntField(term489459, term489459.getClass(), "characterId4", 0);
        setIntField(term489459, term489459.getClass(), "characterLevel4", 0);
        setIntField(term489459, term489459.getClass(), "characterAwakening4", 0);
        setIntField(term489459, term489459.getClass(), "characterId5", 0);
        setIntField(term489459, term489459.getClass(), "characterLevel5", 0);
        setIntField(term489459, term489459.getClass(), "characterAwakening5", 0);
        setIntField(term489459, term489459.getClass(), "achievement", 0);
        setIntField(term489459, term489459.getClass(), "deluxscore", 0);
        setIntField(term489459, term489459.getClass(), "scoreRank", 0);
        setIntField(term489459, term489459.getClass(), "maxCombo", 0);
        setIntField(term489459, term489459.getClass(), "totalCombo", 0);
        setIntField(term489459, term489459.getClass(), "maxSync", 0);
        setIntField(term489459, term489459.getClass(), "totalSync", 0);
        setIntField(term489459, term489459.getClass(), "tapCriticalPerfect", 0);
        setIntField(term489459, term489459.getClass(), "tapPerfect", 0);
        setIntField(term489459, term489459.getClass(), "tapGreat", 0);
        setIntField(term489459, term489459.getClass(), "tapGood", 0);
        setIntField(term489459, term489459.getClass(), "tapMiss", 0);
        setIntField(term489459, term489459.getClass(), "holdCriticalPerfect", 0);
        setIntField(term489459, term489459.getClass(), "holdPerfect", 0);
        setIntField(term489459, term489459.getClass(), "holdGreat", 0);
        setIntField(term489459, term489459.getClass(), "holdGood", 0);
        setIntField(term489459, term489459.getClass(), "holdMiss", 0);
        setIntField(term489459, term489459.getClass(), "slideCriticalPerfect", 0);
        setIntField(term489459, term489459.getClass(), "slidePerfect", 0);
        setIntField(term489459, term489459.getClass(), "slideGreat", 0);
        setIntField(term489459, term489459.getClass(), "slideGood", 0);
        setIntField(term489459, term489459.getClass(), "slideMiss", 0);
        setIntField(term489459, term489459.getClass(), "touchCriticalPerfect", 0);
        setIntField(term489459, term489459.getClass(), "touchPerfect", 0);
        setIntField(term489459, term489459.getClass(), "touchGreat", 0);
        setIntField(term489459, term489459.getClass(), "touchGood", 0);
        setIntField(term489459, term489459.getClass(), "touchMiss", 0);
        setIntField(term489459, term489459.getClass(), "breakCriticalPerfect", 0);
        setIntField(term489459, term489459.getClass(), "breakPerfect", 0);
        setIntField(term489459, term489459.getClass(), "breakGreat", 0);
        setIntField(term489459, term489459.getClass(), "breakGood", 0);
        setIntField(term489459, term489459.getClass(), "breakMiss", 0);
        setBooleanField(term489459, term489459.getClass(), "isTap", false);
        setBooleanField(term489459, term489459.getClass(), "isHold", false);
        setBooleanField(term489459, term489459.getClass(), "isSlide", false);
        setBooleanField(term489459, term489459.getClass(), "isTouch", false);
        setBooleanField(term489459, term489459.getClass(), "isBreak", false);
        setBooleanField(term489459, term489459.getClass(), "isCriticalDisp", false);
        setBooleanField(term489459, term489459.getClass(), "isFastLateDisp", false);
        setIntField(term489459, term489459.getClass(), "fastCount", 0);
        setIntField(term489459, term489459.getClass(), "lateCount", 0);
        setBooleanField(term489459, term489459.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term489459, term489459.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term489459, term489459.getClass(), "comboStatus", 0);
        setIntField(term489459, term489459.getClass(), "syncStatus", 0);
        setBooleanField(term489459, term489459.getClass(), "isClear", false);
        setIntField(term489459, term489459.getClass(), "beforeRating", 0);
        setIntField(term489459, term489459.getClass(), "afterRating", 0);
        setIntField(term489459, term489459.getClass(), "beforeGrade", 0);
        setIntField(term489459, term489459.getClass(), "afterGrade", 0);
        setIntField(term489459, term489459.getClass(), "afterGradeRank", 0);
        setIntField(term489459, term489459.getClass(), "beforeDeluxRating", 0);
        setIntField(term489459, term489459.getClass(), "afterDeluxRating", 0);
        setBooleanField(term489459, term489459.getClass(), "isPlayTutorial", false);
        setBooleanField(term489459, term489459.getClass(), "isEventMode", false);
        setBooleanField(term489459, term489459.getClass(), "isFreedomMode", false);
        setIntField(term489459, term489459.getClass(), "playMode", 0);
        setBooleanField(term489459, term489459.getClass(), "isNewFree", false);
        setIntField(term489459, term489459.getClass(), "trialPlayAchievement", 0);
        setIntField(term489459, term489459.getClass(), "extNum1", 0);
        setIntField(term489459, term489459.getClass(), "extNum2", 0);
        term489559 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term489559;
        callMethod(klass, "setPlayedUserId3", argTypes, term489459, args);
    }

};


