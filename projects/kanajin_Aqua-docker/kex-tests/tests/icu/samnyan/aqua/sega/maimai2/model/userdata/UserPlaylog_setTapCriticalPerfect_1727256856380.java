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

public class UserPlaylog_setTapCriticalPerfect_1727256856380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term492007;
     Object term492107;

    public UserPlaylog_setTapCriticalPerfect_1727256856380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term492007 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term492007, term492007.getClass(), "id", 0L);
        setField(term492007, term492007.getClass(), "user", null);
        setIntField(term492007, term492007.getClass(), "orderId", 0);
        setLongField(term492007, term492007.getClass(), "playlogId", 0L);
        setIntField(term492007, term492007.getClass(), "version", 0);
        setIntField(term492007, term492007.getClass(), "placeId", 0);
        setField(term492007, term492007.getClass(), "placeName", null);
        setLongField(term492007, term492007.getClass(), "loginDate", 0L);
        setField(term492007, term492007.getClass(), "playDate", null);
        setField(term492007, term492007.getClass(), "userPlayDate", null);
        setIntField(term492007, term492007.getClass(), "type", 0);
        setIntField(term492007, term492007.getClass(), "musicId", 0);
        setIntField(term492007, term492007.getClass(), "level", 0);
        setIntField(term492007, term492007.getClass(), "trackNo", 0);
        setIntField(term492007, term492007.getClass(), "vsMode", 0);
        setField(term492007, term492007.getClass(), "vsUserName", null);
        setIntField(term492007, term492007.getClass(), "vsStatus", 0);
        setIntField(term492007, term492007.getClass(), "vsUserRating", 0);
        setIntField(term492007, term492007.getClass(), "vsUserAchievement", 0);
        setIntField(term492007, term492007.getClass(), "vsUserGradeRank", 0);
        setIntField(term492007, term492007.getClass(), "vsRank", 0);
        setIntField(term492007, term492007.getClass(), "playerNum", 0);
        setLongField(term492007, term492007.getClass(), "playedUserId1", 0L);
        setField(term492007, term492007.getClass(), "playedUserName1", null);
        setIntField(term492007, term492007.getClass(), "playedMusicLevel1", 0);
        setLongField(term492007, term492007.getClass(), "playedUserId2", 0L);
        setField(term492007, term492007.getClass(), "playedUserName2", null);
        setIntField(term492007, term492007.getClass(), "playedMusicLevel2", 0);
        setLongField(term492007, term492007.getClass(), "playedUserId3", 0L);
        setField(term492007, term492007.getClass(), "playedUserName3", null);
        setIntField(term492007, term492007.getClass(), "playedMusicLevel3", 0);
        setIntField(term492007, term492007.getClass(), "characterId1", 0);
        setIntField(term492007, term492007.getClass(), "characterLevel1", 0);
        setIntField(term492007, term492007.getClass(), "characterAwakening1", 0);
        setIntField(term492007, term492007.getClass(), "characterId2", 0);
        setIntField(term492007, term492007.getClass(), "characterLevel2", 0);
        setIntField(term492007, term492007.getClass(), "characterAwakening2", 0);
        setIntField(term492007, term492007.getClass(), "characterId3", 0);
        setIntField(term492007, term492007.getClass(), "characterLevel3", 0);
        setIntField(term492007, term492007.getClass(), "characterAwakening3", 0);
        setIntField(term492007, term492007.getClass(), "characterId4", 0);
        setIntField(term492007, term492007.getClass(), "characterLevel4", 0);
        setIntField(term492007, term492007.getClass(), "characterAwakening4", 0);
        setIntField(term492007, term492007.getClass(), "characterId5", 0);
        setIntField(term492007, term492007.getClass(), "characterLevel5", 0);
        setIntField(term492007, term492007.getClass(), "characterAwakening5", 0);
        setIntField(term492007, term492007.getClass(), "achievement", 0);
        setIntField(term492007, term492007.getClass(), "deluxscore", 0);
        setIntField(term492007, term492007.getClass(), "scoreRank", 0);
        setIntField(term492007, term492007.getClass(), "maxCombo", 0);
        setIntField(term492007, term492007.getClass(), "totalCombo", 0);
        setIntField(term492007, term492007.getClass(), "maxSync", 0);
        setIntField(term492007, term492007.getClass(), "totalSync", 0);
        setIntField(term492007, term492007.getClass(), "tapCriticalPerfect", 0);
        setIntField(term492007, term492007.getClass(), "tapPerfect", 0);
        setIntField(term492007, term492007.getClass(), "tapGreat", 0);
        setIntField(term492007, term492007.getClass(), "tapGood", 0);
        setIntField(term492007, term492007.getClass(), "tapMiss", 0);
        setIntField(term492007, term492007.getClass(), "holdCriticalPerfect", 0);
        setIntField(term492007, term492007.getClass(), "holdPerfect", 0);
        setIntField(term492007, term492007.getClass(), "holdGreat", 0);
        setIntField(term492007, term492007.getClass(), "holdGood", 0);
        setIntField(term492007, term492007.getClass(), "holdMiss", 0);
        setIntField(term492007, term492007.getClass(), "slideCriticalPerfect", 0);
        setIntField(term492007, term492007.getClass(), "slidePerfect", 0);
        setIntField(term492007, term492007.getClass(), "slideGreat", 0);
        setIntField(term492007, term492007.getClass(), "slideGood", 0);
        setIntField(term492007, term492007.getClass(), "slideMiss", 0);
        setIntField(term492007, term492007.getClass(), "touchCriticalPerfect", 0);
        setIntField(term492007, term492007.getClass(), "touchPerfect", 0);
        setIntField(term492007, term492007.getClass(), "touchGreat", 0);
        setIntField(term492007, term492007.getClass(), "touchGood", 0);
        setIntField(term492007, term492007.getClass(), "touchMiss", 0);
        setIntField(term492007, term492007.getClass(), "breakCriticalPerfect", 0);
        setIntField(term492007, term492007.getClass(), "breakPerfect", 0);
        setIntField(term492007, term492007.getClass(), "breakGreat", 0);
        setIntField(term492007, term492007.getClass(), "breakGood", 0);
        setIntField(term492007, term492007.getClass(), "breakMiss", 0);
        setBooleanField(term492007, term492007.getClass(), "isTap", false);
        setBooleanField(term492007, term492007.getClass(), "isHold", false);
        setBooleanField(term492007, term492007.getClass(), "isSlide", false);
        setBooleanField(term492007, term492007.getClass(), "isTouch", false);
        setBooleanField(term492007, term492007.getClass(), "isBreak", false);
        setBooleanField(term492007, term492007.getClass(), "isCriticalDisp", false);
        setBooleanField(term492007, term492007.getClass(), "isFastLateDisp", false);
        setIntField(term492007, term492007.getClass(), "fastCount", 0);
        setIntField(term492007, term492007.getClass(), "lateCount", 0);
        setBooleanField(term492007, term492007.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term492007, term492007.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term492007, term492007.getClass(), "comboStatus", 0);
        setIntField(term492007, term492007.getClass(), "syncStatus", 0);
        setBooleanField(term492007, term492007.getClass(), "isClear", false);
        setIntField(term492007, term492007.getClass(), "beforeRating", 0);
        setIntField(term492007, term492007.getClass(), "afterRating", 0);
        setIntField(term492007, term492007.getClass(), "beforeGrade", 0);
        setIntField(term492007, term492007.getClass(), "afterGrade", 0);
        setIntField(term492007, term492007.getClass(), "afterGradeRank", 0);
        setIntField(term492007, term492007.getClass(), "beforeDeluxRating", 0);
        setIntField(term492007, term492007.getClass(), "afterDeluxRating", 0);
        setBooleanField(term492007, term492007.getClass(), "isPlayTutorial", false);
        setBooleanField(term492007, term492007.getClass(), "isEventMode", false);
        setBooleanField(term492007, term492007.getClass(), "isFreedomMode", false);
        setIntField(term492007, term492007.getClass(), "playMode", 0);
        setBooleanField(term492007, term492007.getClass(), "isNewFree", false);
        setIntField(term492007, term492007.getClass(), "trialPlayAchievement", 0);
        setIntField(term492007, term492007.getClass(), "extNum1", 0);
        setIntField(term492007, term492007.getClass(), "extNum2", 0);
        term492107 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term492107;
        callMethod(klass, "setTapCriticalPerfect", argTypes, term492007, args);
    }

};


