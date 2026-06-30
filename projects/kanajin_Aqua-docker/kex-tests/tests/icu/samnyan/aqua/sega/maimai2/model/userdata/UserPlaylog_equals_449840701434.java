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

public class UserPlaylog_equals_449840701434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term497515;

    public UserPlaylog_equals_449840701434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term497515 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term497515, term497515.getClass(), "id", 0L);
        setField(term497515, term497515.getClass(), "user", null);
        setIntField(term497515, term497515.getClass(), "orderId", 0);
        setLongField(term497515, term497515.getClass(), "playlogId", 0L);
        setIntField(term497515, term497515.getClass(), "version", 0);
        setIntField(term497515, term497515.getClass(), "placeId", 0);
        setField(term497515, term497515.getClass(), "placeName", null);
        setLongField(term497515, term497515.getClass(), "loginDate", 0L);
        setField(term497515, term497515.getClass(), "playDate", null);
        setField(term497515, term497515.getClass(), "userPlayDate", null);
        setIntField(term497515, term497515.getClass(), "type", 0);
        setIntField(term497515, term497515.getClass(), "musicId", 0);
        setIntField(term497515, term497515.getClass(), "level", 0);
        setIntField(term497515, term497515.getClass(), "trackNo", 0);
        setIntField(term497515, term497515.getClass(), "vsMode", 0);
        setField(term497515, term497515.getClass(), "vsUserName", null);
        setIntField(term497515, term497515.getClass(), "vsStatus", 0);
        setIntField(term497515, term497515.getClass(), "vsUserRating", 0);
        setIntField(term497515, term497515.getClass(), "vsUserAchievement", 0);
        setIntField(term497515, term497515.getClass(), "vsUserGradeRank", 0);
        setIntField(term497515, term497515.getClass(), "vsRank", 0);
        setIntField(term497515, term497515.getClass(), "playerNum", 0);
        setLongField(term497515, term497515.getClass(), "playedUserId1", 0L);
        setField(term497515, term497515.getClass(), "playedUserName1", null);
        setIntField(term497515, term497515.getClass(), "playedMusicLevel1", 0);
        setLongField(term497515, term497515.getClass(), "playedUserId2", 0L);
        setField(term497515, term497515.getClass(), "playedUserName2", null);
        setIntField(term497515, term497515.getClass(), "playedMusicLevel2", 0);
        setLongField(term497515, term497515.getClass(), "playedUserId3", 0L);
        setField(term497515, term497515.getClass(), "playedUserName3", null);
        setIntField(term497515, term497515.getClass(), "playedMusicLevel3", 0);
        setIntField(term497515, term497515.getClass(), "characterId1", 0);
        setIntField(term497515, term497515.getClass(), "characterLevel1", 0);
        setIntField(term497515, term497515.getClass(), "characterAwakening1", 0);
        setIntField(term497515, term497515.getClass(), "characterId2", 0);
        setIntField(term497515, term497515.getClass(), "characterLevel2", 0);
        setIntField(term497515, term497515.getClass(), "characterAwakening2", 0);
        setIntField(term497515, term497515.getClass(), "characterId3", 0);
        setIntField(term497515, term497515.getClass(), "characterLevel3", 0);
        setIntField(term497515, term497515.getClass(), "characterAwakening3", 0);
        setIntField(term497515, term497515.getClass(), "characterId4", 0);
        setIntField(term497515, term497515.getClass(), "characterLevel4", 0);
        setIntField(term497515, term497515.getClass(), "characterAwakening4", 0);
        setIntField(term497515, term497515.getClass(), "characterId5", 0);
        setIntField(term497515, term497515.getClass(), "characterLevel5", 0);
        setIntField(term497515, term497515.getClass(), "characterAwakening5", 0);
        setIntField(term497515, term497515.getClass(), "achievement", 0);
        setIntField(term497515, term497515.getClass(), "deluxscore", 0);
        setIntField(term497515, term497515.getClass(), "scoreRank", 0);
        setIntField(term497515, term497515.getClass(), "maxCombo", 0);
        setIntField(term497515, term497515.getClass(), "totalCombo", 0);
        setIntField(term497515, term497515.getClass(), "maxSync", 0);
        setIntField(term497515, term497515.getClass(), "totalSync", 0);
        setIntField(term497515, term497515.getClass(), "tapCriticalPerfect", 0);
        setIntField(term497515, term497515.getClass(), "tapPerfect", 0);
        setIntField(term497515, term497515.getClass(), "tapGreat", 0);
        setIntField(term497515, term497515.getClass(), "tapGood", 0);
        setIntField(term497515, term497515.getClass(), "tapMiss", 0);
        setIntField(term497515, term497515.getClass(), "holdCriticalPerfect", 0);
        setIntField(term497515, term497515.getClass(), "holdPerfect", 0);
        setIntField(term497515, term497515.getClass(), "holdGreat", 0);
        setIntField(term497515, term497515.getClass(), "holdGood", 0);
        setIntField(term497515, term497515.getClass(), "holdMiss", 0);
        setIntField(term497515, term497515.getClass(), "slideCriticalPerfect", 0);
        setIntField(term497515, term497515.getClass(), "slidePerfect", 0);
        setIntField(term497515, term497515.getClass(), "slideGreat", 0);
        setIntField(term497515, term497515.getClass(), "slideGood", 0);
        setIntField(term497515, term497515.getClass(), "slideMiss", 0);
        setIntField(term497515, term497515.getClass(), "touchCriticalPerfect", 0);
        setIntField(term497515, term497515.getClass(), "touchPerfect", 0);
        setIntField(term497515, term497515.getClass(), "touchGreat", 0);
        setIntField(term497515, term497515.getClass(), "touchGood", 0);
        setIntField(term497515, term497515.getClass(), "touchMiss", 0);
        setIntField(term497515, term497515.getClass(), "breakCriticalPerfect", 0);
        setIntField(term497515, term497515.getClass(), "breakPerfect", 0);
        setIntField(term497515, term497515.getClass(), "breakGreat", 0);
        setIntField(term497515, term497515.getClass(), "breakGood", 0);
        setIntField(term497515, term497515.getClass(), "breakMiss", 0);
        setBooleanField(term497515, term497515.getClass(), "isTap", false);
        setBooleanField(term497515, term497515.getClass(), "isHold", false);
        setBooleanField(term497515, term497515.getClass(), "isSlide", false);
        setBooleanField(term497515, term497515.getClass(), "isTouch", false);
        setBooleanField(term497515, term497515.getClass(), "isBreak", false);
        setBooleanField(term497515, term497515.getClass(), "isCriticalDisp", false);
        setBooleanField(term497515, term497515.getClass(), "isFastLateDisp", false);
        setIntField(term497515, term497515.getClass(), "fastCount", 0);
        setIntField(term497515, term497515.getClass(), "lateCount", 0);
        setBooleanField(term497515, term497515.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term497515, term497515.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term497515, term497515.getClass(), "comboStatus", 0);
        setIntField(term497515, term497515.getClass(), "syncStatus", 0);
        setBooleanField(term497515, term497515.getClass(), "isClear", false);
        setIntField(term497515, term497515.getClass(), "beforeRating", 0);
        setIntField(term497515, term497515.getClass(), "afterRating", 0);
        setIntField(term497515, term497515.getClass(), "beforeGrade", 0);
        setIntField(term497515, term497515.getClass(), "afterGrade", 0);
        setIntField(term497515, term497515.getClass(), "afterGradeRank", 0);
        setIntField(term497515, term497515.getClass(), "beforeDeluxRating", 0);
        setIntField(term497515, term497515.getClass(), "afterDeluxRating", 0);
        setBooleanField(term497515, term497515.getClass(), "isPlayTutorial", false);
        setBooleanField(term497515, term497515.getClass(), "isEventMode", false);
        setBooleanField(term497515, term497515.getClass(), "isFreedomMode", false);
        setIntField(term497515, term497515.getClass(), "playMode", 0);
        setBooleanField(term497515, term497515.getClass(), "isNewFree", false);
        setIntField(term497515, term497515.getClass(), "trialPlayAchievement", 0);
        setIntField(term497515, term497515.getClass(), "extNum1", 0);
        setIntField(term497515, term497515.getClass(), "extNum2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term497515, args);
    }

};


