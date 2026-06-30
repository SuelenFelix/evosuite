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

public class UserPlaylog_setVsMode_1678773133341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term488037;
     Object term488137;

    public UserPlaylog_setVsMode_1678773133341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term488037 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term488037, term488037.getClass(), "id", 0L);
        setField(term488037, term488037.getClass(), "user", null);
        setIntField(term488037, term488037.getClass(), "orderId", 0);
        setLongField(term488037, term488037.getClass(), "playlogId", 0L);
        setIntField(term488037, term488037.getClass(), "version", 0);
        setIntField(term488037, term488037.getClass(), "placeId", 0);
        setField(term488037, term488037.getClass(), "placeName", null);
        setLongField(term488037, term488037.getClass(), "loginDate", 0L);
        setField(term488037, term488037.getClass(), "playDate", null);
        setField(term488037, term488037.getClass(), "userPlayDate", null);
        setIntField(term488037, term488037.getClass(), "type", 0);
        setIntField(term488037, term488037.getClass(), "musicId", 0);
        setIntField(term488037, term488037.getClass(), "level", 0);
        setIntField(term488037, term488037.getClass(), "trackNo", 0);
        setIntField(term488037, term488037.getClass(), "vsMode", 0);
        setField(term488037, term488037.getClass(), "vsUserName", null);
        setIntField(term488037, term488037.getClass(), "vsStatus", 0);
        setIntField(term488037, term488037.getClass(), "vsUserRating", 0);
        setIntField(term488037, term488037.getClass(), "vsUserAchievement", 0);
        setIntField(term488037, term488037.getClass(), "vsUserGradeRank", 0);
        setIntField(term488037, term488037.getClass(), "vsRank", 0);
        setIntField(term488037, term488037.getClass(), "playerNum", 0);
        setLongField(term488037, term488037.getClass(), "playedUserId1", 0L);
        setField(term488037, term488037.getClass(), "playedUserName1", null);
        setIntField(term488037, term488037.getClass(), "playedMusicLevel1", 0);
        setLongField(term488037, term488037.getClass(), "playedUserId2", 0L);
        setField(term488037, term488037.getClass(), "playedUserName2", null);
        setIntField(term488037, term488037.getClass(), "playedMusicLevel2", 0);
        setLongField(term488037, term488037.getClass(), "playedUserId3", 0L);
        setField(term488037, term488037.getClass(), "playedUserName3", null);
        setIntField(term488037, term488037.getClass(), "playedMusicLevel3", 0);
        setIntField(term488037, term488037.getClass(), "characterId1", 0);
        setIntField(term488037, term488037.getClass(), "characterLevel1", 0);
        setIntField(term488037, term488037.getClass(), "characterAwakening1", 0);
        setIntField(term488037, term488037.getClass(), "characterId2", 0);
        setIntField(term488037, term488037.getClass(), "characterLevel2", 0);
        setIntField(term488037, term488037.getClass(), "characterAwakening2", 0);
        setIntField(term488037, term488037.getClass(), "characterId3", 0);
        setIntField(term488037, term488037.getClass(), "characterLevel3", 0);
        setIntField(term488037, term488037.getClass(), "characterAwakening3", 0);
        setIntField(term488037, term488037.getClass(), "characterId4", 0);
        setIntField(term488037, term488037.getClass(), "characterLevel4", 0);
        setIntField(term488037, term488037.getClass(), "characterAwakening4", 0);
        setIntField(term488037, term488037.getClass(), "characterId5", 0);
        setIntField(term488037, term488037.getClass(), "characterLevel5", 0);
        setIntField(term488037, term488037.getClass(), "characterAwakening5", 0);
        setIntField(term488037, term488037.getClass(), "achievement", 0);
        setIntField(term488037, term488037.getClass(), "deluxscore", 0);
        setIntField(term488037, term488037.getClass(), "scoreRank", 0);
        setIntField(term488037, term488037.getClass(), "maxCombo", 0);
        setIntField(term488037, term488037.getClass(), "totalCombo", 0);
        setIntField(term488037, term488037.getClass(), "maxSync", 0);
        setIntField(term488037, term488037.getClass(), "totalSync", 0);
        setIntField(term488037, term488037.getClass(), "tapCriticalPerfect", 0);
        setIntField(term488037, term488037.getClass(), "tapPerfect", 0);
        setIntField(term488037, term488037.getClass(), "tapGreat", 0);
        setIntField(term488037, term488037.getClass(), "tapGood", 0);
        setIntField(term488037, term488037.getClass(), "tapMiss", 0);
        setIntField(term488037, term488037.getClass(), "holdCriticalPerfect", 0);
        setIntField(term488037, term488037.getClass(), "holdPerfect", 0);
        setIntField(term488037, term488037.getClass(), "holdGreat", 0);
        setIntField(term488037, term488037.getClass(), "holdGood", 0);
        setIntField(term488037, term488037.getClass(), "holdMiss", 0);
        setIntField(term488037, term488037.getClass(), "slideCriticalPerfect", 0);
        setIntField(term488037, term488037.getClass(), "slidePerfect", 0);
        setIntField(term488037, term488037.getClass(), "slideGreat", 0);
        setIntField(term488037, term488037.getClass(), "slideGood", 0);
        setIntField(term488037, term488037.getClass(), "slideMiss", 0);
        setIntField(term488037, term488037.getClass(), "touchCriticalPerfect", 0);
        setIntField(term488037, term488037.getClass(), "touchPerfect", 0);
        setIntField(term488037, term488037.getClass(), "touchGreat", 0);
        setIntField(term488037, term488037.getClass(), "touchGood", 0);
        setIntField(term488037, term488037.getClass(), "touchMiss", 0);
        setIntField(term488037, term488037.getClass(), "breakCriticalPerfect", 0);
        setIntField(term488037, term488037.getClass(), "breakPerfect", 0);
        setIntField(term488037, term488037.getClass(), "breakGreat", 0);
        setIntField(term488037, term488037.getClass(), "breakGood", 0);
        setIntField(term488037, term488037.getClass(), "breakMiss", 0);
        setBooleanField(term488037, term488037.getClass(), "isTap", false);
        setBooleanField(term488037, term488037.getClass(), "isHold", false);
        setBooleanField(term488037, term488037.getClass(), "isSlide", false);
        setBooleanField(term488037, term488037.getClass(), "isTouch", false);
        setBooleanField(term488037, term488037.getClass(), "isBreak", false);
        setBooleanField(term488037, term488037.getClass(), "isCriticalDisp", false);
        setBooleanField(term488037, term488037.getClass(), "isFastLateDisp", false);
        setIntField(term488037, term488037.getClass(), "fastCount", 0);
        setIntField(term488037, term488037.getClass(), "lateCount", 0);
        setBooleanField(term488037, term488037.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term488037, term488037.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term488037, term488037.getClass(), "comboStatus", 0);
        setIntField(term488037, term488037.getClass(), "syncStatus", 0);
        setBooleanField(term488037, term488037.getClass(), "isClear", false);
        setIntField(term488037, term488037.getClass(), "beforeRating", 0);
        setIntField(term488037, term488037.getClass(), "afterRating", 0);
        setIntField(term488037, term488037.getClass(), "beforeGrade", 0);
        setIntField(term488037, term488037.getClass(), "afterGrade", 0);
        setIntField(term488037, term488037.getClass(), "afterGradeRank", 0);
        setIntField(term488037, term488037.getClass(), "beforeDeluxRating", 0);
        setIntField(term488037, term488037.getClass(), "afterDeluxRating", 0);
        setBooleanField(term488037, term488037.getClass(), "isPlayTutorial", false);
        setBooleanField(term488037, term488037.getClass(), "isEventMode", false);
        setBooleanField(term488037, term488037.getClass(), "isFreedomMode", false);
        setIntField(term488037, term488037.getClass(), "playMode", 0);
        setBooleanField(term488037, term488037.getClass(), "isNewFree", false);
        setIntField(term488037, term488037.getClass(), "trialPlayAchievement", 0);
        setIntField(term488037, term488037.getClass(), "extNum1", 0);
        setIntField(term488037, term488037.getClass(), "extNum2", 0);
        term488137 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term488137;
        callMethod(klass, "setVsMode", argTypes, term488037, args);
    }

};


