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

public class UserPlaylog_setPlayedUserId2_727050306352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term489155;
     Object term489255;

    public UserPlaylog_setPlayedUserId2_727050306352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term489155 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term489155, term489155.getClass(), "id", 0L);
        setField(term489155, term489155.getClass(), "user", null);
        setIntField(term489155, term489155.getClass(), "orderId", 0);
        setLongField(term489155, term489155.getClass(), "playlogId", 0L);
        setIntField(term489155, term489155.getClass(), "version", 0);
        setIntField(term489155, term489155.getClass(), "placeId", 0);
        setField(term489155, term489155.getClass(), "placeName", null);
        setLongField(term489155, term489155.getClass(), "loginDate", 0L);
        setField(term489155, term489155.getClass(), "playDate", null);
        setField(term489155, term489155.getClass(), "userPlayDate", null);
        setIntField(term489155, term489155.getClass(), "type", 0);
        setIntField(term489155, term489155.getClass(), "musicId", 0);
        setIntField(term489155, term489155.getClass(), "level", 0);
        setIntField(term489155, term489155.getClass(), "trackNo", 0);
        setIntField(term489155, term489155.getClass(), "vsMode", 0);
        setField(term489155, term489155.getClass(), "vsUserName", null);
        setIntField(term489155, term489155.getClass(), "vsStatus", 0);
        setIntField(term489155, term489155.getClass(), "vsUserRating", 0);
        setIntField(term489155, term489155.getClass(), "vsUserAchievement", 0);
        setIntField(term489155, term489155.getClass(), "vsUserGradeRank", 0);
        setIntField(term489155, term489155.getClass(), "vsRank", 0);
        setIntField(term489155, term489155.getClass(), "playerNum", 0);
        setLongField(term489155, term489155.getClass(), "playedUserId1", 0L);
        setField(term489155, term489155.getClass(), "playedUserName1", null);
        setIntField(term489155, term489155.getClass(), "playedMusicLevel1", 0);
        setLongField(term489155, term489155.getClass(), "playedUserId2", 0L);
        setField(term489155, term489155.getClass(), "playedUserName2", null);
        setIntField(term489155, term489155.getClass(), "playedMusicLevel2", 0);
        setLongField(term489155, term489155.getClass(), "playedUserId3", 0L);
        setField(term489155, term489155.getClass(), "playedUserName3", null);
        setIntField(term489155, term489155.getClass(), "playedMusicLevel3", 0);
        setIntField(term489155, term489155.getClass(), "characterId1", 0);
        setIntField(term489155, term489155.getClass(), "characterLevel1", 0);
        setIntField(term489155, term489155.getClass(), "characterAwakening1", 0);
        setIntField(term489155, term489155.getClass(), "characterId2", 0);
        setIntField(term489155, term489155.getClass(), "characterLevel2", 0);
        setIntField(term489155, term489155.getClass(), "characterAwakening2", 0);
        setIntField(term489155, term489155.getClass(), "characterId3", 0);
        setIntField(term489155, term489155.getClass(), "characterLevel3", 0);
        setIntField(term489155, term489155.getClass(), "characterAwakening3", 0);
        setIntField(term489155, term489155.getClass(), "characterId4", 0);
        setIntField(term489155, term489155.getClass(), "characterLevel4", 0);
        setIntField(term489155, term489155.getClass(), "characterAwakening4", 0);
        setIntField(term489155, term489155.getClass(), "characterId5", 0);
        setIntField(term489155, term489155.getClass(), "characterLevel5", 0);
        setIntField(term489155, term489155.getClass(), "characterAwakening5", 0);
        setIntField(term489155, term489155.getClass(), "achievement", 0);
        setIntField(term489155, term489155.getClass(), "deluxscore", 0);
        setIntField(term489155, term489155.getClass(), "scoreRank", 0);
        setIntField(term489155, term489155.getClass(), "maxCombo", 0);
        setIntField(term489155, term489155.getClass(), "totalCombo", 0);
        setIntField(term489155, term489155.getClass(), "maxSync", 0);
        setIntField(term489155, term489155.getClass(), "totalSync", 0);
        setIntField(term489155, term489155.getClass(), "tapCriticalPerfect", 0);
        setIntField(term489155, term489155.getClass(), "tapPerfect", 0);
        setIntField(term489155, term489155.getClass(), "tapGreat", 0);
        setIntField(term489155, term489155.getClass(), "tapGood", 0);
        setIntField(term489155, term489155.getClass(), "tapMiss", 0);
        setIntField(term489155, term489155.getClass(), "holdCriticalPerfect", 0);
        setIntField(term489155, term489155.getClass(), "holdPerfect", 0);
        setIntField(term489155, term489155.getClass(), "holdGreat", 0);
        setIntField(term489155, term489155.getClass(), "holdGood", 0);
        setIntField(term489155, term489155.getClass(), "holdMiss", 0);
        setIntField(term489155, term489155.getClass(), "slideCriticalPerfect", 0);
        setIntField(term489155, term489155.getClass(), "slidePerfect", 0);
        setIntField(term489155, term489155.getClass(), "slideGreat", 0);
        setIntField(term489155, term489155.getClass(), "slideGood", 0);
        setIntField(term489155, term489155.getClass(), "slideMiss", 0);
        setIntField(term489155, term489155.getClass(), "touchCriticalPerfect", 0);
        setIntField(term489155, term489155.getClass(), "touchPerfect", 0);
        setIntField(term489155, term489155.getClass(), "touchGreat", 0);
        setIntField(term489155, term489155.getClass(), "touchGood", 0);
        setIntField(term489155, term489155.getClass(), "touchMiss", 0);
        setIntField(term489155, term489155.getClass(), "breakCriticalPerfect", 0);
        setIntField(term489155, term489155.getClass(), "breakPerfect", 0);
        setIntField(term489155, term489155.getClass(), "breakGreat", 0);
        setIntField(term489155, term489155.getClass(), "breakGood", 0);
        setIntField(term489155, term489155.getClass(), "breakMiss", 0);
        setBooleanField(term489155, term489155.getClass(), "isTap", false);
        setBooleanField(term489155, term489155.getClass(), "isHold", false);
        setBooleanField(term489155, term489155.getClass(), "isSlide", false);
        setBooleanField(term489155, term489155.getClass(), "isTouch", false);
        setBooleanField(term489155, term489155.getClass(), "isBreak", false);
        setBooleanField(term489155, term489155.getClass(), "isCriticalDisp", false);
        setBooleanField(term489155, term489155.getClass(), "isFastLateDisp", false);
        setIntField(term489155, term489155.getClass(), "fastCount", 0);
        setIntField(term489155, term489155.getClass(), "lateCount", 0);
        setBooleanField(term489155, term489155.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term489155, term489155.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term489155, term489155.getClass(), "comboStatus", 0);
        setIntField(term489155, term489155.getClass(), "syncStatus", 0);
        setBooleanField(term489155, term489155.getClass(), "isClear", false);
        setIntField(term489155, term489155.getClass(), "beforeRating", 0);
        setIntField(term489155, term489155.getClass(), "afterRating", 0);
        setIntField(term489155, term489155.getClass(), "beforeGrade", 0);
        setIntField(term489155, term489155.getClass(), "afterGrade", 0);
        setIntField(term489155, term489155.getClass(), "afterGradeRank", 0);
        setIntField(term489155, term489155.getClass(), "beforeDeluxRating", 0);
        setIntField(term489155, term489155.getClass(), "afterDeluxRating", 0);
        setBooleanField(term489155, term489155.getClass(), "isPlayTutorial", false);
        setBooleanField(term489155, term489155.getClass(), "isEventMode", false);
        setBooleanField(term489155, term489155.getClass(), "isFreedomMode", false);
        setIntField(term489155, term489155.getClass(), "playMode", 0);
        setBooleanField(term489155, term489155.getClass(), "isNewFree", false);
        setIntField(term489155, term489155.getClass(), "trialPlayAchievement", 0);
        setIntField(term489155, term489155.getClass(), "extNum1", 0);
        setIntField(term489155, term489155.getClass(), "extNum2", 0);
        term489255 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term489255;
        callMethod(klass, "setPlayedUserId2", argTypes, term489155, args);
    }

};


