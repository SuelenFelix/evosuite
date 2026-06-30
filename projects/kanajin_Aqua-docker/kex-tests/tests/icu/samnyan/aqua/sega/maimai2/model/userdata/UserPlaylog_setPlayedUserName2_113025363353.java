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

public class UserPlaylog_setPlayedUserName2_113025363353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term489257;

    public UserPlaylog_setPlayedUserName2_113025363353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term489257 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term489257, term489257.getClass(), "id", 0L);
        setField(term489257, term489257.getClass(), "user", null);
        setIntField(term489257, term489257.getClass(), "orderId", 0);
        setLongField(term489257, term489257.getClass(), "playlogId", 0L);
        setIntField(term489257, term489257.getClass(), "version", 0);
        setIntField(term489257, term489257.getClass(), "placeId", 0);
        setField(term489257, term489257.getClass(), "placeName", null);
        setLongField(term489257, term489257.getClass(), "loginDate", 0L);
        setField(term489257, term489257.getClass(), "playDate", null);
        setField(term489257, term489257.getClass(), "userPlayDate", null);
        setIntField(term489257, term489257.getClass(), "type", 0);
        setIntField(term489257, term489257.getClass(), "musicId", 0);
        setIntField(term489257, term489257.getClass(), "level", 0);
        setIntField(term489257, term489257.getClass(), "trackNo", 0);
        setIntField(term489257, term489257.getClass(), "vsMode", 0);
        setField(term489257, term489257.getClass(), "vsUserName", null);
        setIntField(term489257, term489257.getClass(), "vsStatus", 0);
        setIntField(term489257, term489257.getClass(), "vsUserRating", 0);
        setIntField(term489257, term489257.getClass(), "vsUserAchievement", 0);
        setIntField(term489257, term489257.getClass(), "vsUserGradeRank", 0);
        setIntField(term489257, term489257.getClass(), "vsRank", 0);
        setIntField(term489257, term489257.getClass(), "playerNum", 0);
        setLongField(term489257, term489257.getClass(), "playedUserId1", 0L);
        setField(term489257, term489257.getClass(), "playedUserName1", null);
        setIntField(term489257, term489257.getClass(), "playedMusicLevel1", 0);
        setLongField(term489257, term489257.getClass(), "playedUserId2", 0L);
        setField(term489257, term489257.getClass(), "playedUserName2", null);
        setIntField(term489257, term489257.getClass(), "playedMusicLevel2", 0);
        setLongField(term489257, term489257.getClass(), "playedUserId3", 0L);
        setField(term489257, term489257.getClass(), "playedUserName3", null);
        setIntField(term489257, term489257.getClass(), "playedMusicLevel3", 0);
        setIntField(term489257, term489257.getClass(), "characterId1", 0);
        setIntField(term489257, term489257.getClass(), "characterLevel1", 0);
        setIntField(term489257, term489257.getClass(), "characterAwakening1", 0);
        setIntField(term489257, term489257.getClass(), "characterId2", 0);
        setIntField(term489257, term489257.getClass(), "characterLevel2", 0);
        setIntField(term489257, term489257.getClass(), "characterAwakening2", 0);
        setIntField(term489257, term489257.getClass(), "characterId3", 0);
        setIntField(term489257, term489257.getClass(), "characterLevel3", 0);
        setIntField(term489257, term489257.getClass(), "characterAwakening3", 0);
        setIntField(term489257, term489257.getClass(), "characterId4", 0);
        setIntField(term489257, term489257.getClass(), "characterLevel4", 0);
        setIntField(term489257, term489257.getClass(), "characterAwakening4", 0);
        setIntField(term489257, term489257.getClass(), "characterId5", 0);
        setIntField(term489257, term489257.getClass(), "characterLevel5", 0);
        setIntField(term489257, term489257.getClass(), "characterAwakening5", 0);
        setIntField(term489257, term489257.getClass(), "achievement", 0);
        setIntField(term489257, term489257.getClass(), "deluxscore", 0);
        setIntField(term489257, term489257.getClass(), "scoreRank", 0);
        setIntField(term489257, term489257.getClass(), "maxCombo", 0);
        setIntField(term489257, term489257.getClass(), "totalCombo", 0);
        setIntField(term489257, term489257.getClass(), "maxSync", 0);
        setIntField(term489257, term489257.getClass(), "totalSync", 0);
        setIntField(term489257, term489257.getClass(), "tapCriticalPerfect", 0);
        setIntField(term489257, term489257.getClass(), "tapPerfect", 0);
        setIntField(term489257, term489257.getClass(), "tapGreat", 0);
        setIntField(term489257, term489257.getClass(), "tapGood", 0);
        setIntField(term489257, term489257.getClass(), "tapMiss", 0);
        setIntField(term489257, term489257.getClass(), "holdCriticalPerfect", 0);
        setIntField(term489257, term489257.getClass(), "holdPerfect", 0);
        setIntField(term489257, term489257.getClass(), "holdGreat", 0);
        setIntField(term489257, term489257.getClass(), "holdGood", 0);
        setIntField(term489257, term489257.getClass(), "holdMiss", 0);
        setIntField(term489257, term489257.getClass(), "slideCriticalPerfect", 0);
        setIntField(term489257, term489257.getClass(), "slidePerfect", 0);
        setIntField(term489257, term489257.getClass(), "slideGreat", 0);
        setIntField(term489257, term489257.getClass(), "slideGood", 0);
        setIntField(term489257, term489257.getClass(), "slideMiss", 0);
        setIntField(term489257, term489257.getClass(), "touchCriticalPerfect", 0);
        setIntField(term489257, term489257.getClass(), "touchPerfect", 0);
        setIntField(term489257, term489257.getClass(), "touchGreat", 0);
        setIntField(term489257, term489257.getClass(), "touchGood", 0);
        setIntField(term489257, term489257.getClass(), "touchMiss", 0);
        setIntField(term489257, term489257.getClass(), "breakCriticalPerfect", 0);
        setIntField(term489257, term489257.getClass(), "breakPerfect", 0);
        setIntField(term489257, term489257.getClass(), "breakGreat", 0);
        setIntField(term489257, term489257.getClass(), "breakGood", 0);
        setIntField(term489257, term489257.getClass(), "breakMiss", 0);
        setBooleanField(term489257, term489257.getClass(), "isTap", false);
        setBooleanField(term489257, term489257.getClass(), "isHold", false);
        setBooleanField(term489257, term489257.getClass(), "isSlide", false);
        setBooleanField(term489257, term489257.getClass(), "isTouch", false);
        setBooleanField(term489257, term489257.getClass(), "isBreak", false);
        setBooleanField(term489257, term489257.getClass(), "isCriticalDisp", false);
        setBooleanField(term489257, term489257.getClass(), "isFastLateDisp", false);
        setIntField(term489257, term489257.getClass(), "fastCount", 0);
        setIntField(term489257, term489257.getClass(), "lateCount", 0);
        setBooleanField(term489257, term489257.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term489257, term489257.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term489257, term489257.getClass(), "comboStatus", 0);
        setIntField(term489257, term489257.getClass(), "syncStatus", 0);
        setBooleanField(term489257, term489257.getClass(), "isClear", false);
        setIntField(term489257, term489257.getClass(), "beforeRating", 0);
        setIntField(term489257, term489257.getClass(), "afterRating", 0);
        setIntField(term489257, term489257.getClass(), "beforeGrade", 0);
        setIntField(term489257, term489257.getClass(), "afterGrade", 0);
        setIntField(term489257, term489257.getClass(), "afterGradeRank", 0);
        setIntField(term489257, term489257.getClass(), "beforeDeluxRating", 0);
        setIntField(term489257, term489257.getClass(), "afterDeluxRating", 0);
        setBooleanField(term489257, term489257.getClass(), "isPlayTutorial", false);
        setBooleanField(term489257, term489257.getClass(), "isEventMode", false);
        setBooleanField(term489257, term489257.getClass(), "isFreedomMode", false);
        setIntField(term489257, term489257.getClass(), "playMode", 0);
        setBooleanField(term489257, term489257.getClass(), "isNewFree", false);
        setIntField(term489257, term489257.getClass(), "trialPlayAchievement", 0);
        setIntField(term489257, term489257.getClass(), "extNum1", 0);
        setIntField(term489257, term489257.getClass(), "extNum2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlayedUserName2", argTypes, term489257, args);
    }

};


