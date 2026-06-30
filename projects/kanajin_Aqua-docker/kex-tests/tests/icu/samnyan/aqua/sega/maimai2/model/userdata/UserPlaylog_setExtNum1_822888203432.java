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

public class UserPlaylog_setExtNum1_822888203432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term497311;
     Object term497411;

    public UserPlaylog_setExtNum1_822888203432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term497311 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term497311, term497311.getClass(), "id", 0L);
        setField(term497311, term497311.getClass(), "user", null);
        setIntField(term497311, term497311.getClass(), "orderId", 0);
        setLongField(term497311, term497311.getClass(), "playlogId", 0L);
        setIntField(term497311, term497311.getClass(), "version", 0);
        setIntField(term497311, term497311.getClass(), "placeId", 0);
        setField(term497311, term497311.getClass(), "placeName", null);
        setLongField(term497311, term497311.getClass(), "loginDate", 0L);
        setField(term497311, term497311.getClass(), "playDate", null);
        setField(term497311, term497311.getClass(), "userPlayDate", null);
        setIntField(term497311, term497311.getClass(), "type", 0);
        setIntField(term497311, term497311.getClass(), "musicId", 0);
        setIntField(term497311, term497311.getClass(), "level", 0);
        setIntField(term497311, term497311.getClass(), "trackNo", 0);
        setIntField(term497311, term497311.getClass(), "vsMode", 0);
        setField(term497311, term497311.getClass(), "vsUserName", null);
        setIntField(term497311, term497311.getClass(), "vsStatus", 0);
        setIntField(term497311, term497311.getClass(), "vsUserRating", 0);
        setIntField(term497311, term497311.getClass(), "vsUserAchievement", 0);
        setIntField(term497311, term497311.getClass(), "vsUserGradeRank", 0);
        setIntField(term497311, term497311.getClass(), "vsRank", 0);
        setIntField(term497311, term497311.getClass(), "playerNum", 0);
        setLongField(term497311, term497311.getClass(), "playedUserId1", 0L);
        setField(term497311, term497311.getClass(), "playedUserName1", null);
        setIntField(term497311, term497311.getClass(), "playedMusicLevel1", 0);
        setLongField(term497311, term497311.getClass(), "playedUserId2", 0L);
        setField(term497311, term497311.getClass(), "playedUserName2", null);
        setIntField(term497311, term497311.getClass(), "playedMusicLevel2", 0);
        setLongField(term497311, term497311.getClass(), "playedUserId3", 0L);
        setField(term497311, term497311.getClass(), "playedUserName3", null);
        setIntField(term497311, term497311.getClass(), "playedMusicLevel3", 0);
        setIntField(term497311, term497311.getClass(), "characterId1", 0);
        setIntField(term497311, term497311.getClass(), "characterLevel1", 0);
        setIntField(term497311, term497311.getClass(), "characterAwakening1", 0);
        setIntField(term497311, term497311.getClass(), "characterId2", 0);
        setIntField(term497311, term497311.getClass(), "characterLevel2", 0);
        setIntField(term497311, term497311.getClass(), "characterAwakening2", 0);
        setIntField(term497311, term497311.getClass(), "characterId3", 0);
        setIntField(term497311, term497311.getClass(), "characterLevel3", 0);
        setIntField(term497311, term497311.getClass(), "characterAwakening3", 0);
        setIntField(term497311, term497311.getClass(), "characterId4", 0);
        setIntField(term497311, term497311.getClass(), "characterLevel4", 0);
        setIntField(term497311, term497311.getClass(), "characterAwakening4", 0);
        setIntField(term497311, term497311.getClass(), "characterId5", 0);
        setIntField(term497311, term497311.getClass(), "characterLevel5", 0);
        setIntField(term497311, term497311.getClass(), "characterAwakening5", 0);
        setIntField(term497311, term497311.getClass(), "achievement", 0);
        setIntField(term497311, term497311.getClass(), "deluxscore", 0);
        setIntField(term497311, term497311.getClass(), "scoreRank", 0);
        setIntField(term497311, term497311.getClass(), "maxCombo", 0);
        setIntField(term497311, term497311.getClass(), "totalCombo", 0);
        setIntField(term497311, term497311.getClass(), "maxSync", 0);
        setIntField(term497311, term497311.getClass(), "totalSync", 0);
        setIntField(term497311, term497311.getClass(), "tapCriticalPerfect", 0);
        setIntField(term497311, term497311.getClass(), "tapPerfect", 0);
        setIntField(term497311, term497311.getClass(), "tapGreat", 0);
        setIntField(term497311, term497311.getClass(), "tapGood", 0);
        setIntField(term497311, term497311.getClass(), "tapMiss", 0);
        setIntField(term497311, term497311.getClass(), "holdCriticalPerfect", 0);
        setIntField(term497311, term497311.getClass(), "holdPerfect", 0);
        setIntField(term497311, term497311.getClass(), "holdGreat", 0);
        setIntField(term497311, term497311.getClass(), "holdGood", 0);
        setIntField(term497311, term497311.getClass(), "holdMiss", 0);
        setIntField(term497311, term497311.getClass(), "slideCriticalPerfect", 0);
        setIntField(term497311, term497311.getClass(), "slidePerfect", 0);
        setIntField(term497311, term497311.getClass(), "slideGreat", 0);
        setIntField(term497311, term497311.getClass(), "slideGood", 0);
        setIntField(term497311, term497311.getClass(), "slideMiss", 0);
        setIntField(term497311, term497311.getClass(), "touchCriticalPerfect", 0);
        setIntField(term497311, term497311.getClass(), "touchPerfect", 0);
        setIntField(term497311, term497311.getClass(), "touchGreat", 0);
        setIntField(term497311, term497311.getClass(), "touchGood", 0);
        setIntField(term497311, term497311.getClass(), "touchMiss", 0);
        setIntField(term497311, term497311.getClass(), "breakCriticalPerfect", 0);
        setIntField(term497311, term497311.getClass(), "breakPerfect", 0);
        setIntField(term497311, term497311.getClass(), "breakGreat", 0);
        setIntField(term497311, term497311.getClass(), "breakGood", 0);
        setIntField(term497311, term497311.getClass(), "breakMiss", 0);
        setBooleanField(term497311, term497311.getClass(), "isTap", false);
        setBooleanField(term497311, term497311.getClass(), "isHold", false);
        setBooleanField(term497311, term497311.getClass(), "isSlide", false);
        setBooleanField(term497311, term497311.getClass(), "isTouch", false);
        setBooleanField(term497311, term497311.getClass(), "isBreak", false);
        setBooleanField(term497311, term497311.getClass(), "isCriticalDisp", false);
        setBooleanField(term497311, term497311.getClass(), "isFastLateDisp", false);
        setIntField(term497311, term497311.getClass(), "fastCount", 0);
        setIntField(term497311, term497311.getClass(), "lateCount", 0);
        setBooleanField(term497311, term497311.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term497311, term497311.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term497311, term497311.getClass(), "comboStatus", 0);
        setIntField(term497311, term497311.getClass(), "syncStatus", 0);
        setBooleanField(term497311, term497311.getClass(), "isClear", false);
        setIntField(term497311, term497311.getClass(), "beforeRating", 0);
        setIntField(term497311, term497311.getClass(), "afterRating", 0);
        setIntField(term497311, term497311.getClass(), "beforeGrade", 0);
        setIntField(term497311, term497311.getClass(), "afterGrade", 0);
        setIntField(term497311, term497311.getClass(), "afterGradeRank", 0);
        setIntField(term497311, term497311.getClass(), "beforeDeluxRating", 0);
        setIntField(term497311, term497311.getClass(), "afterDeluxRating", 0);
        setBooleanField(term497311, term497311.getClass(), "isPlayTutorial", false);
        setBooleanField(term497311, term497311.getClass(), "isEventMode", false);
        setBooleanField(term497311, term497311.getClass(), "isFreedomMode", false);
        setIntField(term497311, term497311.getClass(), "playMode", 0);
        setBooleanField(term497311, term497311.getClass(), "isNewFree", false);
        setIntField(term497311, term497311.getClass(), "trialPlayAchievement", 0);
        setIntField(term497311, term497311.getClass(), "extNum1", 0);
        setIntField(term497311, term497311.getClass(), "extNum2", 0);
        term497411 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term497411;
        callMethod(klass, "setExtNum1", argTypes, term497311, args);
    }

};


