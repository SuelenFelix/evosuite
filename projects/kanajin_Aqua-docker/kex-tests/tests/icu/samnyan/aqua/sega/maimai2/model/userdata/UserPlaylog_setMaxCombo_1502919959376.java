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

public class UserPlaylog_setMaxCombo_1502919959376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term491599;
     Object term491699;

    public UserPlaylog_setMaxCombo_1502919959376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term491599 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term491599, term491599.getClass(), "id", 0L);
        setField(term491599, term491599.getClass(), "user", null);
        setIntField(term491599, term491599.getClass(), "orderId", 0);
        setLongField(term491599, term491599.getClass(), "playlogId", 0L);
        setIntField(term491599, term491599.getClass(), "version", 0);
        setIntField(term491599, term491599.getClass(), "placeId", 0);
        setField(term491599, term491599.getClass(), "placeName", null);
        setLongField(term491599, term491599.getClass(), "loginDate", 0L);
        setField(term491599, term491599.getClass(), "playDate", null);
        setField(term491599, term491599.getClass(), "userPlayDate", null);
        setIntField(term491599, term491599.getClass(), "type", 0);
        setIntField(term491599, term491599.getClass(), "musicId", 0);
        setIntField(term491599, term491599.getClass(), "level", 0);
        setIntField(term491599, term491599.getClass(), "trackNo", 0);
        setIntField(term491599, term491599.getClass(), "vsMode", 0);
        setField(term491599, term491599.getClass(), "vsUserName", null);
        setIntField(term491599, term491599.getClass(), "vsStatus", 0);
        setIntField(term491599, term491599.getClass(), "vsUserRating", 0);
        setIntField(term491599, term491599.getClass(), "vsUserAchievement", 0);
        setIntField(term491599, term491599.getClass(), "vsUserGradeRank", 0);
        setIntField(term491599, term491599.getClass(), "vsRank", 0);
        setIntField(term491599, term491599.getClass(), "playerNum", 0);
        setLongField(term491599, term491599.getClass(), "playedUserId1", 0L);
        setField(term491599, term491599.getClass(), "playedUserName1", null);
        setIntField(term491599, term491599.getClass(), "playedMusicLevel1", 0);
        setLongField(term491599, term491599.getClass(), "playedUserId2", 0L);
        setField(term491599, term491599.getClass(), "playedUserName2", null);
        setIntField(term491599, term491599.getClass(), "playedMusicLevel2", 0);
        setLongField(term491599, term491599.getClass(), "playedUserId3", 0L);
        setField(term491599, term491599.getClass(), "playedUserName3", null);
        setIntField(term491599, term491599.getClass(), "playedMusicLevel3", 0);
        setIntField(term491599, term491599.getClass(), "characterId1", 0);
        setIntField(term491599, term491599.getClass(), "characterLevel1", 0);
        setIntField(term491599, term491599.getClass(), "characterAwakening1", 0);
        setIntField(term491599, term491599.getClass(), "characterId2", 0);
        setIntField(term491599, term491599.getClass(), "characterLevel2", 0);
        setIntField(term491599, term491599.getClass(), "characterAwakening2", 0);
        setIntField(term491599, term491599.getClass(), "characterId3", 0);
        setIntField(term491599, term491599.getClass(), "characterLevel3", 0);
        setIntField(term491599, term491599.getClass(), "characterAwakening3", 0);
        setIntField(term491599, term491599.getClass(), "characterId4", 0);
        setIntField(term491599, term491599.getClass(), "characterLevel4", 0);
        setIntField(term491599, term491599.getClass(), "characterAwakening4", 0);
        setIntField(term491599, term491599.getClass(), "characterId5", 0);
        setIntField(term491599, term491599.getClass(), "characterLevel5", 0);
        setIntField(term491599, term491599.getClass(), "characterAwakening5", 0);
        setIntField(term491599, term491599.getClass(), "achievement", 0);
        setIntField(term491599, term491599.getClass(), "deluxscore", 0);
        setIntField(term491599, term491599.getClass(), "scoreRank", 0);
        setIntField(term491599, term491599.getClass(), "maxCombo", 0);
        setIntField(term491599, term491599.getClass(), "totalCombo", 0);
        setIntField(term491599, term491599.getClass(), "maxSync", 0);
        setIntField(term491599, term491599.getClass(), "totalSync", 0);
        setIntField(term491599, term491599.getClass(), "tapCriticalPerfect", 0);
        setIntField(term491599, term491599.getClass(), "tapPerfect", 0);
        setIntField(term491599, term491599.getClass(), "tapGreat", 0);
        setIntField(term491599, term491599.getClass(), "tapGood", 0);
        setIntField(term491599, term491599.getClass(), "tapMiss", 0);
        setIntField(term491599, term491599.getClass(), "holdCriticalPerfect", 0);
        setIntField(term491599, term491599.getClass(), "holdPerfect", 0);
        setIntField(term491599, term491599.getClass(), "holdGreat", 0);
        setIntField(term491599, term491599.getClass(), "holdGood", 0);
        setIntField(term491599, term491599.getClass(), "holdMiss", 0);
        setIntField(term491599, term491599.getClass(), "slideCriticalPerfect", 0);
        setIntField(term491599, term491599.getClass(), "slidePerfect", 0);
        setIntField(term491599, term491599.getClass(), "slideGreat", 0);
        setIntField(term491599, term491599.getClass(), "slideGood", 0);
        setIntField(term491599, term491599.getClass(), "slideMiss", 0);
        setIntField(term491599, term491599.getClass(), "touchCriticalPerfect", 0);
        setIntField(term491599, term491599.getClass(), "touchPerfect", 0);
        setIntField(term491599, term491599.getClass(), "touchGreat", 0);
        setIntField(term491599, term491599.getClass(), "touchGood", 0);
        setIntField(term491599, term491599.getClass(), "touchMiss", 0);
        setIntField(term491599, term491599.getClass(), "breakCriticalPerfect", 0);
        setIntField(term491599, term491599.getClass(), "breakPerfect", 0);
        setIntField(term491599, term491599.getClass(), "breakGreat", 0);
        setIntField(term491599, term491599.getClass(), "breakGood", 0);
        setIntField(term491599, term491599.getClass(), "breakMiss", 0);
        setBooleanField(term491599, term491599.getClass(), "isTap", false);
        setBooleanField(term491599, term491599.getClass(), "isHold", false);
        setBooleanField(term491599, term491599.getClass(), "isSlide", false);
        setBooleanField(term491599, term491599.getClass(), "isTouch", false);
        setBooleanField(term491599, term491599.getClass(), "isBreak", false);
        setBooleanField(term491599, term491599.getClass(), "isCriticalDisp", false);
        setBooleanField(term491599, term491599.getClass(), "isFastLateDisp", false);
        setIntField(term491599, term491599.getClass(), "fastCount", 0);
        setIntField(term491599, term491599.getClass(), "lateCount", 0);
        setBooleanField(term491599, term491599.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term491599, term491599.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term491599, term491599.getClass(), "comboStatus", 0);
        setIntField(term491599, term491599.getClass(), "syncStatus", 0);
        setBooleanField(term491599, term491599.getClass(), "isClear", false);
        setIntField(term491599, term491599.getClass(), "beforeRating", 0);
        setIntField(term491599, term491599.getClass(), "afterRating", 0);
        setIntField(term491599, term491599.getClass(), "beforeGrade", 0);
        setIntField(term491599, term491599.getClass(), "afterGrade", 0);
        setIntField(term491599, term491599.getClass(), "afterGradeRank", 0);
        setIntField(term491599, term491599.getClass(), "beforeDeluxRating", 0);
        setIntField(term491599, term491599.getClass(), "afterDeluxRating", 0);
        setBooleanField(term491599, term491599.getClass(), "isPlayTutorial", false);
        setBooleanField(term491599, term491599.getClass(), "isEventMode", false);
        setBooleanField(term491599, term491599.getClass(), "isFreedomMode", false);
        setIntField(term491599, term491599.getClass(), "playMode", 0);
        setBooleanField(term491599, term491599.getClass(), "isNewFree", false);
        setIntField(term491599, term491599.getClass(), "trialPlayAchievement", 0);
        setIntField(term491599, term491599.getClass(), "extNum1", 0);
        setIntField(term491599, term491599.getClass(), "extNum2", 0);
        term491699 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term491699;
        callMethod(klass, "setMaxCombo", argTypes, term491599, args);
    }

};


