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

public class UserPlaylog_setEventMode_715812230427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term496801;
     Object term496901;

    public UserPlaylog_setEventMode_715812230427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term496801 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term496801, term496801.getClass(), "id", 0L);
        setField(term496801, term496801.getClass(), "user", null);
        setIntField(term496801, term496801.getClass(), "orderId", 0);
        setLongField(term496801, term496801.getClass(), "playlogId", 0L);
        setIntField(term496801, term496801.getClass(), "version", 0);
        setIntField(term496801, term496801.getClass(), "placeId", 0);
        setField(term496801, term496801.getClass(), "placeName", null);
        setLongField(term496801, term496801.getClass(), "loginDate", 0L);
        setField(term496801, term496801.getClass(), "playDate", null);
        setField(term496801, term496801.getClass(), "userPlayDate", null);
        setIntField(term496801, term496801.getClass(), "type", 0);
        setIntField(term496801, term496801.getClass(), "musicId", 0);
        setIntField(term496801, term496801.getClass(), "level", 0);
        setIntField(term496801, term496801.getClass(), "trackNo", 0);
        setIntField(term496801, term496801.getClass(), "vsMode", 0);
        setField(term496801, term496801.getClass(), "vsUserName", null);
        setIntField(term496801, term496801.getClass(), "vsStatus", 0);
        setIntField(term496801, term496801.getClass(), "vsUserRating", 0);
        setIntField(term496801, term496801.getClass(), "vsUserAchievement", 0);
        setIntField(term496801, term496801.getClass(), "vsUserGradeRank", 0);
        setIntField(term496801, term496801.getClass(), "vsRank", 0);
        setIntField(term496801, term496801.getClass(), "playerNum", 0);
        setLongField(term496801, term496801.getClass(), "playedUserId1", 0L);
        setField(term496801, term496801.getClass(), "playedUserName1", null);
        setIntField(term496801, term496801.getClass(), "playedMusicLevel1", 0);
        setLongField(term496801, term496801.getClass(), "playedUserId2", 0L);
        setField(term496801, term496801.getClass(), "playedUserName2", null);
        setIntField(term496801, term496801.getClass(), "playedMusicLevel2", 0);
        setLongField(term496801, term496801.getClass(), "playedUserId3", 0L);
        setField(term496801, term496801.getClass(), "playedUserName3", null);
        setIntField(term496801, term496801.getClass(), "playedMusicLevel3", 0);
        setIntField(term496801, term496801.getClass(), "characterId1", 0);
        setIntField(term496801, term496801.getClass(), "characterLevel1", 0);
        setIntField(term496801, term496801.getClass(), "characterAwakening1", 0);
        setIntField(term496801, term496801.getClass(), "characterId2", 0);
        setIntField(term496801, term496801.getClass(), "characterLevel2", 0);
        setIntField(term496801, term496801.getClass(), "characterAwakening2", 0);
        setIntField(term496801, term496801.getClass(), "characterId3", 0);
        setIntField(term496801, term496801.getClass(), "characterLevel3", 0);
        setIntField(term496801, term496801.getClass(), "characterAwakening3", 0);
        setIntField(term496801, term496801.getClass(), "characterId4", 0);
        setIntField(term496801, term496801.getClass(), "characterLevel4", 0);
        setIntField(term496801, term496801.getClass(), "characterAwakening4", 0);
        setIntField(term496801, term496801.getClass(), "characterId5", 0);
        setIntField(term496801, term496801.getClass(), "characterLevel5", 0);
        setIntField(term496801, term496801.getClass(), "characterAwakening5", 0);
        setIntField(term496801, term496801.getClass(), "achievement", 0);
        setIntField(term496801, term496801.getClass(), "deluxscore", 0);
        setIntField(term496801, term496801.getClass(), "scoreRank", 0);
        setIntField(term496801, term496801.getClass(), "maxCombo", 0);
        setIntField(term496801, term496801.getClass(), "totalCombo", 0);
        setIntField(term496801, term496801.getClass(), "maxSync", 0);
        setIntField(term496801, term496801.getClass(), "totalSync", 0);
        setIntField(term496801, term496801.getClass(), "tapCriticalPerfect", 0);
        setIntField(term496801, term496801.getClass(), "tapPerfect", 0);
        setIntField(term496801, term496801.getClass(), "tapGreat", 0);
        setIntField(term496801, term496801.getClass(), "tapGood", 0);
        setIntField(term496801, term496801.getClass(), "tapMiss", 0);
        setIntField(term496801, term496801.getClass(), "holdCriticalPerfect", 0);
        setIntField(term496801, term496801.getClass(), "holdPerfect", 0);
        setIntField(term496801, term496801.getClass(), "holdGreat", 0);
        setIntField(term496801, term496801.getClass(), "holdGood", 0);
        setIntField(term496801, term496801.getClass(), "holdMiss", 0);
        setIntField(term496801, term496801.getClass(), "slideCriticalPerfect", 0);
        setIntField(term496801, term496801.getClass(), "slidePerfect", 0);
        setIntField(term496801, term496801.getClass(), "slideGreat", 0);
        setIntField(term496801, term496801.getClass(), "slideGood", 0);
        setIntField(term496801, term496801.getClass(), "slideMiss", 0);
        setIntField(term496801, term496801.getClass(), "touchCriticalPerfect", 0);
        setIntField(term496801, term496801.getClass(), "touchPerfect", 0);
        setIntField(term496801, term496801.getClass(), "touchGreat", 0);
        setIntField(term496801, term496801.getClass(), "touchGood", 0);
        setIntField(term496801, term496801.getClass(), "touchMiss", 0);
        setIntField(term496801, term496801.getClass(), "breakCriticalPerfect", 0);
        setIntField(term496801, term496801.getClass(), "breakPerfect", 0);
        setIntField(term496801, term496801.getClass(), "breakGreat", 0);
        setIntField(term496801, term496801.getClass(), "breakGood", 0);
        setIntField(term496801, term496801.getClass(), "breakMiss", 0);
        setBooleanField(term496801, term496801.getClass(), "isTap", false);
        setBooleanField(term496801, term496801.getClass(), "isHold", false);
        setBooleanField(term496801, term496801.getClass(), "isSlide", false);
        setBooleanField(term496801, term496801.getClass(), "isTouch", false);
        setBooleanField(term496801, term496801.getClass(), "isBreak", false);
        setBooleanField(term496801, term496801.getClass(), "isCriticalDisp", false);
        setBooleanField(term496801, term496801.getClass(), "isFastLateDisp", false);
        setIntField(term496801, term496801.getClass(), "fastCount", 0);
        setIntField(term496801, term496801.getClass(), "lateCount", 0);
        setBooleanField(term496801, term496801.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term496801, term496801.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term496801, term496801.getClass(), "comboStatus", 0);
        setIntField(term496801, term496801.getClass(), "syncStatus", 0);
        setBooleanField(term496801, term496801.getClass(), "isClear", false);
        setIntField(term496801, term496801.getClass(), "beforeRating", 0);
        setIntField(term496801, term496801.getClass(), "afterRating", 0);
        setIntField(term496801, term496801.getClass(), "beforeGrade", 0);
        setIntField(term496801, term496801.getClass(), "afterGrade", 0);
        setIntField(term496801, term496801.getClass(), "afterGradeRank", 0);
        setIntField(term496801, term496801.getClass(), "beforeDeluxRating", 0);
        setIntField(term496801, term496801.getClass(), "afterDeluxRating", 0);
        setBooleanField(term496801, term496801.getClass(), "isPlayTutorial", false);
        setBooleanField(term496801, term496801.getClass(), "isEventMode", false);
        setBooleanField(term496801, term496801.getClass(), "isFreedomMode", false);
        setIntField(term496801, term496801.getClass(), "playMode", 0);
        setBooleanField(term496801, term496801.getClass(), "isNewFree", false);
        setIntField(term496801, term496801.getClass(), "trialPlayAchievement", 0);
        setIntField(term496801, term496801.getClass(), "extNum1", 0);
        setIntField(term496801, term496801.getClass(), "extNum2", 0);
        term496901 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term496901;
        callMethod(klass, "setEventMode", argTypes, term496801, args);
    }

};


