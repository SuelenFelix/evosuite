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

public class UserPlaylog_setBreakPerfect_1147171483401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term494149;
     Object term494249;

    public UserPlaylog_setBreakPerfect_1147171483401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term494149 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term494149, term494149.getClass(), "id", 0L);
        setField(term494149, term494149.getClass(), "user", null);
        setIntField(term494149, term494149.getClass(), "orderId", 0);
        setLongField(term494149, term494149.getClass(), "playlogId", 0L);
        setIntField(term494149, term494149.getClass(), "version", 0);
        setIntField(term494149, term494149.getClass(), "placeId", 0);
        setField(term494149, term494149.getClass(), "placeName", null);
        setLongField(term494149, term494149.getClass(), "loginDate", 0L);
        setField(term494149, term494149.getClass(), "playDate", null);
        setField(term494149, term494149.getClass(), "userPlayDate", null);
        setIntField(term494149, term494149.getClass(), "type", 0);
        setIntField(term494149, term494149.getClass(), "musicId", 0);
        setIntField(term494149, term494149.getClass(), "level", 0);
        setIntField(term494149, term494149.getClass(), "trackNo", 0);
        setIntField(term494149, term494149.getClass(), "vsMode", 0);
        setField(term494149, term494149.getClass(), "vsUserName", null);
        setIntField(term494149, term494149.getClass(), "vsStatus", 0);
        setIntField(term494149, term494149.getClass(), "vsUserRating", 0);
        setIntField(term494149, term494149.getClass(), "vsUserAchievement", 0);
        setIntField(term494149, term494149.getClass(), "vsUserGradeRank", 0);
        setIntField(term494149, term494149.getClass(), "vsRank", 0);
        setIntField(term494149, term494149.getClass(), "playerNum", 0);
        setLongField(term494149, term494149.getClass(), "playedUserId1", 0L);
        setField(term494149, term494149.getClass(), "playedUserName1", null);
        setIntField(term494149, term494149.getClass(), "playedMusicLevel1", 0);
        setLongField(term494149, term494149.getClass(), "playedUserId2", 0L);
        setField(term494149, term494149.getClass(), "playedUserName2", null);
        setIntField(term494149, term494149.getClass(), "playedMusicLevel2", 0);
        setLongField(term494149, term494149.getClass(), "playedUserId3", 0L);
        setField(term494149, term494149.getClass(), "playedUserName3", null);
        setIntField(term494149, term494149.getClass(), "playedMusicLevel3", 0);
        setIntField(term494149, term494149.getClass(), "characterId1", 0);
        setIntField(term494149, term494149.getClass(), "characterLevel1", 0);
        setIntField(term494149, term494149.getClass(), "characterAwakening1", 0);
        setIntField(term494149, term494149.getClass(), "characterId2", 0);
        setIntField(term494149, term494149.getClass(), "characterLevel2", 0);
        setIntField(term494149, term494149.getClass(), "characterAwakening2", 0);
        setIntField(term494149, term494149.getClass(), "characterId3", 0);
        setIntField(term494149, term494149.getClass(), "characterLevel3", 0);
        setIntField(term494149, term494149.getClass(), "characterAwakening3", 0);
        setIntField(term494149, term494149.getClass(), "characterId4", 0);
        setIntField(term494149, term494149.getClass(), "characterLevel4", 0);
        setIntField(term494149, term494149.getClass(), "characterAwakening4", 0);
        setIntField(term494149, term494149.getClass(), "characterId5", 0);
        setIntField(term494149, term494149.getClass(), "characterLevel5", 0);
        setIntField(term494149, term494149.getClass(), "characterAwakening5", 0);
        setIntField(term494149, term494149.getClass(), "achievement", 0);
        setIntField(term494149, term494149.getClass(), "deluxscore", 0);
        setIntField(term494149, term494149.getClass(), "scoreRank", 0);
        setIntField(term494149, term494149.getClass(), "maxCombo", 0);
        setIntField(term494149, term494149.getClass(), "totalCombo", 0);
        setIntField(term494149, term494149.getClass(), "maxSync", 0);
        setIntField(term494149, term494149.getClass(), "totalSync", 0);
        setIntField(term494149, term494149.getClass(), "tapCriticalPerfect", 0);
        setIntField(term494149, term494149.getClass(), "tapPerfect", 0);
        setIntField(term494149, term494149.getClass(), "tapGreat", 0);
        setIntField(term494149, term494149.getClass(), "tapGood", 0);
        setIntField(term494149, term494149.getClass(), "tapMiss", 0);
        setIntField(term494149, term494149.getClass(), "holdCriticalPerfect", 0);
        setIntField(term494149, term494149.getClass(), "holdPerfect", 0);
        setIntField(term494149, term494149.getClass(), "holdGreat", 0);
        setIntField(term494149, term494149.getClass(), "holdGood", 0);
        setIntField(term494149, term494149.getClass(), "holdMiss", 0);
        setIntField(term494149, term494149.getClass(), "slideCriticalPerfect", 0);
        setIntField(term494149, term494149.getClass(), "slidePerfect", 0);
        setIntField(term494149, term494149.getClass(), "slideGreat", 0);
        setIntField(term494149, term494149.getClass(), "slideGood", 0);
        setIntField(term494149, term494149.getClass(), "slideMiss", 0);
        setIntField(term494149, term494149.getClass(), "touchCriticalPerfect", 0);
        setIntField(term494149, term494149.getClass(), "touchPerfect", 0);
        setIntField(term494149, term494149.getClass(), "touchGreat", 0);
        setIntField(term494149, term494149.getClass(), "touchGood", 0);
        setIntField(term494149, term494149.getClass(), "touchMiss", 0);
        setIntField(term494149, term494149.getClass(), "breakCriticalPerfect", 0);
        setIntField(term494149, term494149.getClass(), "breakPerfect", 0);
        setIntField(term494149, term494149.getClass(), "breakGreat", 0);
        setIntField(term494149, term494149.getClass(), "breakGood", 0);
        setIntField(term494149, term494149.getClass(), "breakMiss", 0);
        setBooleanField(term494149, term494149.getClass(), "isTap", false);
        setBooleanField(term494149, term494149.getClass(), "isHold", false);
        setBooleanField(term494149, term494149.getClass(), "isSlide", false);
        setBooleanField(term494149, term494149.getClass(), "isTouch", false);
        setBooleanField(term494149, term494149.getClass(), "isBreak", false);
        setBooleanField(term494149, term494149.getClass(), "isCriticalDisp", false);
        setBooleanField(term494149, term494149.getClass(), "isFastLateDisp", false);
        setIntField(term494149, term494149.getClass(), "fastCount", 0);
        setIntField(term494149, term494149.getClass(), "lateCount", 0);
        setBooleanField(term494149, term494149.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term494149, term494149.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term494149, term494149.getClass(), "comboStatus", 0);
        setIntField(term494149, term494149.getClass(), "syncStatus", 0);
        setBooleanField(term494149, term494149.getClass(), "isClear", false);
        setIntField(term494149, term494149.getClass(), "beforeRating", 0);
        setIntField(term494149, term494149.getClass(), "afterRating", 0);
        setIntField(term494149, term494149.getClass(), "beforeGrade", 0);
        setIntField(term494149, term494149.getClass(), "afterGrade", 0);
        setIntField(term494149, term494149.getClass(), "afterGradeRank", 0);
        setIntField(term494149, term494149.getClass(), "beforeDeluxRating", 0);
        setIntField(term494149, term494149.getClass(), "afterDeluxRating", 0);
        setBooleanField(term494149, term494149.getClass(), "isPlayTutorial", false);
        setBooleanField(term494149, term494149.getClass(), "isEventMode", false);
        setBooleanField(term494149, term494149.getClass(), "isFreedomMode", false);
        setIntField(term494149, term494149.getClass(), "playMode", 0);
        setBooleanField(term494149, term494149.getClass(), "isNewFree", false);
        setIntField(term494149, term494149.getClass(), "trialPlayAchievement", 0);
        setIntField(term494149, term494149.getClass(), "extNum1", 0);
        setIntField(term494149, term494149.getClass(), "extNum2", 0);
        term494249 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term494249;
        callMethod(klass, "setBreakPerfect", argTypes, term494149, args);
    }

};


