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

public class UserPlaylog_setTrialPlayAchievement_735207986431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term497209;
     Object term497309;

    public UserPlaylog_setTrialPlayAchievement_735207986431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term497209 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term497209, term497209.getClass(), "id", 0L);
        setField(term497209, term497209.getClass(), "user", null);
        setIntField(term497209, term497209.getClass(), "orderId", 0);
        setLongField(term497209, term497209.getClass(), "playlogId", 0L);
        setIntField(term497209, term497209.getClass(), "version", 0);
        setIntField(term497209, term497209.getClass(), "placeId", 0);
        setField(term497209, term497209.getClass(), "placeName", null);
        setLongField(term497209, term497209.getClass(), "loginDate", 0L);
        setField(term497209, term497209.getClass(), "playDate", null);
        setField(term497209, term497209.getClass(), "userPlayDate", null);
        setIntField(term497209, term497209.getClass(), "type", 0);
        setIntField(term497209, term497209.getClass(), "musicId", 0);
        setIntField(term497209, term497209.getClass(), "level", 0);
        setIntField(term497209, term497209.getClass(), "trackNo", 0);
        setIntField(term497209, term497209.getClass(), "vsMode", 0);
        setField(term497209, term497209.getClass(), "vsUserName", null);
        setIntField(term497209, term497209.getClass(), "vsStatus", 0);
        setIntField(term497209, term497209.getClass(), "vsUserRating", 0);
        setIntField(term497209, term497209.getClass(), "vsUserAchievement", 0);
        setIntField(term497209, term497209.getClass(), "vsUserGradeRank", 0);
        setIntField(term497209, term497209.getClass(), "vsRank", 0);
        setIntField(term497209, term497209.getClass(), "playerNum", 0);
        setLongField(term497209, term497209.getClass(), "playedUserId1", 0L);
        setField(term497209, term497209.getClass(), "playedUserName1", null);
        setIntField(term497209, term497209.getClass(), "playedMusicLevel1", 0);
        setLongField(term497209, term497209.getClass(), "playedUserId2", 0L);
        setField(term497209, term497209.getClass(), "playedUserName2", null);
        setIntField(term497209, term497209.getClass(), "playedMusicLevel2", 0);
        setLongField(term497209, term497209.getClass(), "playedUserId3", 0L);
        setField(term497209, term497209.getClass(), "playedUserName3", null);
        setIntField(term497209, term497209.getClass(), "playedMusicLevel3", 0);
        setIntField(term497209, term497209.getClass(), "characterId1", 0);
        setIntField(term497209, term497209.getClass(), "characterLevel1", 0);
        setIntField(term497209, term497209.getClass(), "characterAwakening1", 0);
        setIntField(term497209, term497209.getClass(), "characterId2", 0);
        setIntField(term497209, term497209.getClass(), "characterLevel2", 0);
        setIntField(term497209, term497209.getClass(), "characterAwakening2", 0);
        setIntField(term497209, term497209.getClass(), "characterId3", 0);
        setIntField(term497209, term497209.getClass(), "characterLevel3", 0);
        setIntField(term497209, term497209.getClass(), "characterAwakening3", 0);
        setIntField(term497209, term497209.getClass(), "characterId4", 0);
        setIntField(term497209, term497209.getClass(), "characterLevel4", 0);
        setIntField(term497209, term497209.getClass(), "characterAwakening4", 0);
        setIntField(term497209, term497209.getClass(), "characterId5", 0);
        setIntField(term497209, term497209.getClass(), "characterLevel5", 0);
        setIntField(term497209, term497209.getClass(), "characterAwakening5", 0);
        setIntField(term497209, term497209.getClass(), "achievement", 0);
        setIntField(term497209, term497209.getClass(), "deluxscore", 0);
        setIntField(term497209, term497209.getClass(), "scoreRank", 0);
        setIntField(term497209, term497209.getClass(), "maxCombo", 0);
        setIntField(term497209, term497209.getClass(), "totalCombo", 0);
        setIntField(term497209, term497209.getClass(), "maxSync", 0);
        setIntField(term497209, term497209.getClass(), "totalSync", 0);
        setIntField(term497209, term497209.getClass(), "tapCriticalPerfect", 0);
        setIntField(term497209, term497209.getClass(), "tapPerfect", 0);
        setIntField(term497209, term497209.getClass(), "tapGreat", 0);
        setIntField(term497209, term497209.getClass(), "tapGood", 0);
        setIntField(term497209, term497209.getClass(), "tapMiss", 0);
        setIntField(term497209, term497209.getClass(), "holdCriticalPerfect", 0);
        setIntField(term497209, term497209.getClass(), "holdPerfect", 0);
        setIntField(term497209, term497209.getClass(), "holdGreat", 0);
        setIntField(term497209, term497209.getClass(), "holdGood", 0);
        setIntField(term497209, term497209.getClass(), "holdMiss", 0);
        setIntField(term497209, term497209.getClass(), "slideCriticalPerfect", 0);
        setIntField(term497209, term497209.getClass(), "slidePerfect", 0);
        setIntField(term497209, term497209.getClass(), "slideGreat", 0);
        setIntField(term497209, term497209.getClass(), "slideGood", 0);
        setIntField(term497209, term497209.getClass(), "slideMiss", 0);
        setIntField(term497209, term497209.getClass(), "touchCriticalPerfect", 0);
        setIntField(term497209, term497209.getClass(), "touchPerfect", 0);
        setIntField(term497209, term497209.getClass(), "touchGreat", 0);
        setIntField(term497209, term497209.getClass(), "touchGood", 0);
        setIntField(term497209, term497209.getClass(), "touchMiss", 0);
        setIntField(term497209, term497209.getClass(), "breakCriticalPerfect", 0);
        setIntField(term497209, term497209.getClass(), "breakPerfect", 0);
        setIntField(term497209, term497209.getClass(), "breakGreat", 0);
        setIntField(term497209, term497209.getClass(), "breakGood", 0);
        setIntField(term497209, term497209.getClass(), "breakMiss", 0);
        setBooleanField(term497209, term497209.getClass(), "isTap", false);
        setBooleanField(term497209, term497209.getClass(), "isHold", false);
        setBooleanField(term497209, term497209.getClass(), "isSlide", false);
        setBooleanField(term497209, term497209.getClass(), "isTouch", false);
        setBooleanField(term497209, term497209.getClass(), "isBreak", false);
        setBooleanField(term497209, term497209.getClass(), "isCriticalDisp", false);
        setBooleanField(term497209, term497209.getClass(), "isFastLateDisp", false);
        setIntField(term497209, term497209.getClass(), "fastCount", 0);
        setIntField(term497209, term497209.getClass(), "lateCount", 0);
        setBooleanField(term497209, term497209.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term497209, term497209.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term497209, term497209.getClass(), "comboStatus", 0);
        setIntField(term497209, term497209.getClass(), "syncStatus", 0);
        setBooleanField(term497209, term497209.getClass(), "isClear", false);
        setIntField(term497209, term497209.getClass(), "beforeRating", 0);
        setIntField(term497209, term497209.getClass(), "afterRating", 0);
        setIntField(term497209, term497209.getClass(), "beforeGrade", 0);
        setIntField(term497209, term497209.getClass(), "afterGrade", 0);
        setIntField(term497209, term497209.getClass(), "afterGradeRank", 0);
        setIntField(term497209, term497209.getClass(), "beforeDeluxRating", 0);
        setIntField(term497209, term497209.getClass(), "afterDeluxRating", 0);
        setBooleanField(term497209, term497209.getClass(), "isPlayTutorial", false);
        setBooleanField(term497209, term497209.getClass(), "isEventMode", false);
        setBooleanField(term497209, term497209.getClass(), "isFreedomMode", false);
        setIntField(term497209, term497209.getClass(), "playMode", 0);
        setBooleanField(term497209, term497209.getClass(), "isNewFree", false);
        setIntField(term497209, term497209.getClass(), "trialPlayAchievement", 0);
        setIntField(term497209, term497209.getClass(), "extNum1", 0);
        setIntField(term497209, term497209.getClass(), "extNum2", 0);
        term497309 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term497309;
        callMethod(klass, "setTrialPlayAchievement", argTypes, term497209, args);
    }

};


