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

public class UserPlaylog_setVsStatus_1644617308343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term488239;
     Object term488339;

    public UserPlaylog_setVsStatus_1644617308343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term488239 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term488239, term488239.getClass(), "id", 0L);
        setField(term488239, term488239.getClass(), "user", null);
        setIntField(term488239, term488239.getClass(), "orderId", 0);
        setLongField(term488239, term488239.getClass(), "playlogId", 0L);
        setIntField(term488239, term488239.getClass(), "version", 0);
        setIntField(term488239, term488239.getClass(), "placeId", 0);
        setField(term488239, term488239.getClass(), "placeName", null);
        setLongField(term488239, term488239.getClass(), "loginDate", 0L);
        setField(term488239, term488239.getClass(), "playDate", null);
        setField(term488239, term488239.getClass(), "userPlayDate", null);
        setIntField(term488239, term488239.getClass(), "type", 0);
        setIntField(term488239, term488239.getClass(), "musicId", 0);
        setIntField(term488239, term488239.getClass(), "level", 0);
        setIntField(term488239, term488239.getClass(), "trackNo", 0);
        setIntField(term488239, term488239.getClass(), "vsMode", 0);
        setField(term488239, term488239.getClass(), "vsUserName", null);
        setIntField(term488239, term488239.getClass(), "vsStatus", 0);
        setIntField(term488239, term488239.getClass(), "vsUserRating", 0);
        setIntField(term488239, term488239.getClass(), "vsUserAchievement", 0);
        setIntField(term488239, term488239.getClass(), "vsUserGradeRank", 0);
        setIntField(term488239, term488239.getClass(), "vsRank", 0);
        setIntField(term488239, term488239.getClass(), "playerNum", 0);
        setLongField(term488239, term488239.getClass(), "playedUserId1", 0L);
        setField(term488239, term488239.getClass(), "playedUserName1", null);
        setIntField(term488239, term488239.getClass(), "playedMusicLevel1", 0);
        setLongField(term488239, term488239.getClass(), "playedUserId2", 0L);
        setField(term488239, term488239.getClass(), "playedUserName2", null);
        setIntField(term488239, term488239.getClass(), "playedMusicLevel2", 0);
        setLongField(term488239, term488239.getClass(), "playedUserId3", 0L);
        setField(term488239, term488239.getClass(), "playedUserName3", null);
        setIntField(term488239, term488239.getClass(), "playedMusicLevel3", 0);
        setIntField(term488239, term488239.getClass(), "characterId1", 0);
        setIntField(term488239, term488239.getClass(), "characterLevel1", 0);
        setIntField(term488239, term488239.getClass(), "characterAwakening1", 0);
        setIntField(term488239, term488239.getClass(), "characterId2", 0);
        setIntField(term488239, term488239.getClass(), "characterLevel2", 0);
        setIntField(term488239, term488239.getClass(), "characterAwakening2", 0);
        setIntField(term488239, term488239.getClass(), "characterId3", 0);
        setIntField(term488239, term488239.getClass(), "characterLevel3", 0);
        setIntField(term488239, term488239.getClass(), "characterAwakening3", 0);
        setIntField(term488239, term488239.getClass(), "characterId4", 0);
        setIntField(term488239, term488239.getClass(), "characterLevel4", 0);
        setIntField(term488239, term488239.getClass(), "characterAwakening4", 0);
        setIntField(term488239, term488239.getClass(), "characterId5", 0);
        setIntField(term488239, term488239.getClass(), "characterLevel5", 0);
        setIntField(term488239, term488239.getClass(), "characterAwakening5", 0);
        setIntField(term488239, term488239.getClass(), "achievement", 0);
        setIntField(term488239, term488239.getClass(), "deluxscore", 0);
        setIntField(term488239, term488239.getClass(), "scoreRank", 0);
        setIntField(term488239, term488239.getClass(), "maxCombo", 0);
        setIntField(term488239, term488239.getClass(), "totalCombo", 0);
        setIntField(term488239, term488239.getClass(), "maxSync", 0);
        setIntField(term488239, term488239.getClass(), "totalSync", 0);
        setIntField(term488239, term488239.getClass(), "tapCriticalPerfect", 0);
        setIntField(term488239, term488239.getClass(), "tapPerfect", 0);
        setIntField(term488239, term488239.getClass(), "tapGreat", 0);
        setIntField(term488239, term488239.getClass(), "tapGood", 0);
        setIntField(term488239, term488239.getClass(), "tapMiss", 0);
        setIntField(term488239, term488239.getClass(), "holdCriticalPerfect", 0);
        setIntField(term488239, term488239.getClass(), "holdPerfect", 0);
        setIntField(term488239, term488239.getClass(), "holdGreat", 0);
        setIntField(term488239, term488239.getClass(), "holdGood", 0);
        setIntField(term488239, term488239.getClass(), "holdMiss", 0);
        setIntField(term488239, term488239.getClass(), "slideCriticalPerfect", 0);
        setIntField(term488239, term488239.getClass(), "slidePerfect", 0);
        setIntField(term488239, term488239.getClass(), "slideGreat", 0);
        setIntField(term488239, term488239.getClass(), "slideGood", 0);
        setIntField(term488239, term488239.getClass(), "slideMiss", 0);
        setIntField(term488239, term488239.getClass(), "touchCriticalPerfect", 0);
        setIntField(term488239, term488239.getClass(), "touchPerfect", 0);
        setIntField(term488239, term488239.getClass(), "touchGreat", 0);
        setIntField(term488239, term488239.getClass(), "touchGood", 0);
        setIntField(term488239, term488239.getClass(), "touchMiss", 0);
        setIntField(term488239, term488239.getClass(), "breakCriticalPerfect", 0);
        setIntField(term488239, term488239.getClass(), "breakPerfect", 0);
        setIntField(term488239, term488239.getClass(), "breakGreat", 0);
        setIntField(term488239, term488239.getClass(), "breakGood", 0);
        setIntField(term488239, term488239.getClass(), "breakMiss", 0);
        setBooleanField(term488239, term488239.getClass(), "isTap", false);
        setBooleanField(term488239, term488239.getClass(), "isHold", false);
        setBooleanField(term488239, term488239.getClass(), "isSlide", false);
        setBooleanField(term488239, term488239.getClass(), "isTouch", false);
        setBooleanField(term488239, term488239.getClass(), "isBreak", false);
        setBooleanField(term488239, term488239.getClass(), "isCriticalDisp", false);
        setBooleanField(term488239, term488239.getClass(), "isFastLateDisp", false);
        setIntField(term488239, term488239.getClass(), "fastCount", 0);
        setIntField(term488239, term488239.getClass(), "lateCount", 0);
        setBooleanField(term488239, term488239.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term488239, term488239.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term488239, term488239.getClass(), "comboStatus", 0);
        setIntField(term488239, term488239.getClass(), "syncStatus", 0);
        setBooleanField(term488239, term488239.getClass(), "isClear", false);
        setIntField(term488239, term488239.getClass(), "beforeRating", 0);
        setIntField(term488239, term488239.getClass(), "afterRating", 0);
        setIntField(term488239, term488239.getClass(), "beforeGrade", 0);
        setIntField(term488239, term488239.getClass(), "afterGrade", 0);
        setIntField(term488239, term488239.getClass(), "afterGradeRank", 0);
        setIntField(term488239, term488239.getClass(), "beforeDeluxRating", 0);
        setIntField(term488239, term488239.getClass(), "afterDeluxRating", 0);
        setBooleanField(term488239, term488239.getClass(), "isPlayTutorial", false);
        setBooleanField(term488239, term488239.getClass(), "isEventMode", false);
        setBooleanField(term488239, term488239.getClass(), "isFreedomMode", false);
        setIntField(term488239, term488239.getClass(), "playMode", 0);
        setBooleanField(term488239, term488239.getClass(), "isNewFree", false);
        setIntField(term488239, term488239.getClass(), "trialPlayAchievement", 0);
        setIntField(term488239, term488239.getClass(), "extNum1", 0);
        setIntField(term488239, term488239.getClass(), "extNum2", 0);
        term488339 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term488339;
        callMethod(klass, "setVsStatus", argTypes, term488239, args);
    }

};


