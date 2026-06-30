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

public class UserPlaylog_setBeforeDeluxRating_927193717424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term496495;
     Object term496595;

    public UserPlaylog_setBeforeDeluxRating_927193717424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term496495 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term496495, term496495.getClass(), "id", 0L);
        setField(term496495, term496495.getClass(), "user", null);
        setIntField(term496495, term496495.getClass(), "orderId", 0);
        setLongField(term496495, term496495.getClass(), "playlogId", 0L);
        setIntField(term496495, term496495.getClass(), "version", 0);
        setIntField(term496495, term496495.getClass(), "placeId", 0);
        setField(term496495, term496495.getClass(), "placeName", null);
        setLongField(term496495, term496495.getClass(), "loginDate", 0L);
        setField(term496495, term496495.getClass(), "playDate", null);
        setField(term496495, term496495.getClass(), "userPlayDate", null);
        setIntField(term496495, term496495.getClass(), "type", 0);
        setIntField(term496495, term496495.getClass(), "musicId", 0);
        setIntField(term496495, term496495.getClass(), "level", 0);
        setIntField(term496495, term496495.getClass(), "trackNo", 0);
        setIntField(term496495, term496495.getClass(), "vsMode", 0);
        setField(term496495, term496495.getClass(), "vsUserName", null);
        setIntField(term496495, term496495.getClass(), "vsStatus", 0);
        setIntField(term496495, term496495.getClass(), "vsUserRating", 0);
        setIntField(term496495, term496495.getClass(), "vsUserAchievement", 0);
        setIntField(term496495, term496495.getClass(), "vsUserGradeRank", 0);
        setIntField(term496495, term496495.getClass(), "vsRank", 0);
        setIntField(term496495, term496495.getClass(), "playerNum", 0);
        setLongField(term496495, term496495.getClass(), "playedUserId1", 0L);
        setField(term496495, term496495.getClass(), "playedUserName1", null);
        setIntField(term496495, term496495.getClass(), "playedMusicLevel1", 0);
        setLongField(term496495, term496495.getClass(), "playedUserId2", 0L);
        setField(term496495, term496495.getClass(), "playedUserName2", null);
        setIntField(term496495, term496495.getClass(), "playedMusicLevel2", 0);
        setLongField(term496495, term496495.getClass(), "playedUserId3", 0L);
        setField(term496495, term496495.getClass(), "playedUserName3", null);
        setIntField(term496495, term496495.getClass(), "playedMusicLevel3", 0);
        setIntField(term496495, term496495.getClass(), "characterId1", 0);
        setIntField(term496495, term496495.getClass(), "characterLevel1", 0);
        setIntField(term496495, term496495.getClass(), "characterAwakening1", 0);
        setIntField(term496495, term496495.getClass(), "characterId2", 0);
        setIntField(term496495, term496495.getClass(), "characterLevel2", 0);
        setIntField(term496495, term496495.getClass(), "characterAwakening2", 0);
        setIntField(term496495, term496495.getClass(), "characterId3", 0);
        setIntField(term496495, term496495.getClass(), "characterLevel3", 0);
        setIntField(term496495, term496495.getClass(), "characterAwakening3", 0);
        setIntField(term496495, term496495.getClass(), "characterId4", 0);
        setIntField(term496495, term496495.getClass(), "characterLevel4", 0);
        setIntField(term496495, term496495.getClass(), "characterAwakening4", 0);
        setIntField(term496495, term496495.getClass(), "characterId5", 0);
        setIntField(term496495, term496495.getClass(), "characterLevel5", 0);
        setIntField(term496495, term496495.getClass(), "characterAwakening5", 0);
        setIntField(term496495, term496495.getClass(), "achievement", 0);
        setIntField(term496495, term496495.getClass(), "deluxscore", 0);
        setIntField(term496495, term496495.getClass(), "scoreRank", 0);
        setIntField(term496495, term496495.getClass(), "maxCombo", 0);
        setIntField(term496495, term496495.getClass(), "totalCombo", 0);
        setIntField(term496495, term496495.getClass(), "maxSync", 0);
        setIntField(term496495, term496495.getClass(), "totalSync", 0);
        setIntField(term496495, term496495.getClass(), "tapCriticalPerfect", 0);
        setIntField(term496495, term496495.getClass(), "tapPerfect", 0);
        setIntField(term496495, term496495.getClass(), "tapGreat", 0);
        setIntField(term496495, term496495.getClass(), "tapGood", 0);
        setIntField(term496495, term496495.getClass(), "tapMiss", 0);
        setIntField(term496495, term496495.getClass(), "holdCriticalPerfect", 0);
        setIntField(term496495, term496495.getClass(), "holdPerfect", 0);
        setIntField(term496495, term496495.getClass(), "holdGreat", 0);
        setIntField(term496495, term496495.getClass(), "holdGood", 0);
        setIntField(term496495, term496495.getClass(), "holdMiss", 0);
        setIntField(term496495, term496495.getClass(), "slideCriticalPerfect", 0);
        setIntField(term496495, term496495.getClass(), "slidePerfect", 0);
        setIntField(term496495, term496495.getClass(), "slideGreat", 0);
        setIntField(term496495, term496495.getClass(), "slideGood", 0);
        setIntField(term496495, term496495.getClass(), "slideMiss", 0);
        setIntField(term496495, term496495.getClass(), "touchCriticalPerfect", 0);
        setIntField(term496495, term496495.getClass(), "touchPerfect", 0);
        setIntField(term496495, term496495.getClass(), "touchGreat", 0);
        setIntField(term496495, term496495.getClass(), "touchGood", 0);
        setIntField(term496495, term496495.getClass(), "touchMiss", 0);
        setIntField(term496495, term496495.getClass(), "breakCriticalPerfect", 0);
        setIntField(term496495, term496495.getClass(), "breakPerfect", 0);
        setIntField(term496495, term496495.getClass(), "breakGreat", 0);
        setIntField(term496495, term496495.getClass(), "breakGood", 0);
        setIntField(term496495, term496495.getClass(), "breakMiss", 0);
        setBooleanField(term496495, term496495.getClass(), "isTap", false);
        setBooleanField(term496495, term496495.getClass(), "isHold", false);
        setBooleanField(term496495, term496495.getClass(), "isSlide", false);
        setBooleanField(term496495, term496495.getClass(), "isTouch", false);
        setBooleanField(term496495, term496495.getClass(), "isBreak", false);
        setBooleanField(term496495, term496495.getClass(), "isCriticalDisp", false);
        setBooleanField(term496495, term496495.getClass(), "isFastLateDisp", false);
        setIntField(term496495, term496495.getClass(), "fastCount", 0);
        setIntField(term496495, term496495.getClass(), "lateCount", 0);
        setBooleanField(term496495, term496495.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term496495, term496495.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term496495, term496495.getClass(), "comboStatus", 0);
        setIntField(term496495, term496495.getClass(), "syncStatus", 0);
        setBooleanField(term496495, term496495.getClass(), "isClear", false);
        setIntField(term496495, term496495.getClass(), "beforeRating", 0);
        setIntField(term496495, term496495.getClass(), "afterRating", 0);
        setIntField(term496495, term496495.getClass(), "beforeGrade", 0);
        setIntField(term496495, term496495.getClass(), "afterGrade", 0);
        setIntField(term496495, term496495.getClass(), "afterGradeRank", 0);
        setIntField(term496495, term496495.getClass(), "beforeDeluxRating", 0);
        setIntField(term496495, term496495.getClass(), "afterDeluxRating", 0);
        setBooleanField(term496495, term496495.getClass(), "isPlayTutorial", false);
        setBooleanField(term496495, term496495.getClass(), "isEventMode", false);
        setBooleanField(term496495, term496495.getClass(), "isFreedomMode", false);
        setIntField(term496495, term496495.getClass(), "playMode", 0);
        setBooleanField(term496495, term496495.getClass(), "isNewFree", false);
        setIntField(term496495, term496495.getClass(), "trialPlayAchievement", 0);
        setIntField(term496495, term496495.getClass(), "extNum1", 0);
        setIntField(term496495, term496495.getClass(), "extNum2", 0);
        term496595 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term496595;
        callMethod(klass, "setBeforeDeluxRating", argTypes, term496495, args);
    }

};


