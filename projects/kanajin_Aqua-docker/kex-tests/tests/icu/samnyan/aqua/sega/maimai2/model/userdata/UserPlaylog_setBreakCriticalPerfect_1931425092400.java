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

public class UserPlaylog_setBreakCriticalPerfect_1931425092400 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term494047;
     Object term494147;

    public UserPlaylog_setBreakCriticalPerfect_1931425092400() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term494047 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term494047, term494047.getClass(), "id", 0L);
        setField(term494047, term494047.getClass(), "user", null);
        setIntField(term494047, term494047.getClass(), "orderId", 0);
        setLongField(term494047, term494047.getClass(), "playlogId", 0L);
        setIntField(term494047, term494047.getClass(), "version", 0);
        setIntField(term494047, term494047.getClass(), "placeId", 0);
        setField(term494047, term494047.getClass(), "placeName", null);
        setLongField(term494047, term494047.getClass(), "loginDate", 0L);
        setField(term494047, term494047.getClass(), "playDate", null);
        setField(term494047, term494047.getClass(), "userPlayDate", null);
        setIntField(term494047, term494047.getClass(), "type", 0);
        setIntField(term494047, term494047.getClass(), "musicId", 0);
        setIntField(term494047, term494047.getClass(), "level", 0);
        setIntField(term494047, term494047.getClass(), "trackNo", 0);
        setIntField(term494047, term494047.getClass(), "vsMode", 0);
        setField(term494047, term494047.getClass(), "vsUserName", null);
        setIntField(term494047, term494047.getClass(), "vsStatus", 0);
        setIntField(term494047, term494047.getClass(), "vsUserRating", 0);
        setIntField(term494047, term494047.getClass(), "vsUserAchievement", 0);
        setIntField(term494047, term494047.getClass(), "vsUserGradeRank", 0);
        setIntField(term494047, term494047.getClass(), "vsRank", 0);
        setIntField(term494047, term494047.getClass(), "playerNum", 0);
        setLongField(term494047, term494047.getClass(), "playedUserId1", 0L);
        setField(term494047, term494047.getClass(), "playedUserName1", null);
        setIntField(term494047, term494047.getClass(), "playedMusicLevel1", 0);
        setLongField(term494047, term494047.getClass(), "playedUserId2", 0L);
        setField(term494047, term494047.getClass(), "playedUserName2", null);
        setIntField(term494047, term494047.getClass(), "playedMusicLevel2", 0);
        setLongField(term494047, term494047.getClass(), "playedUserId3", 0L);
        setField(term494047, term494047.getClass(), "playedUserName3", null);
        setIntField(term494047, term494047.getClass(), "playedMusicLevel3", 0);
        setIntField(term494047, term494047.getClass(), "characterId1", 0);
        setIntField(term494047, term494047.getClass(), "characterLevel1", 0);
        setIntField(term494047, term494047.getClass(), "characterAwakening1", 0);
        setIntField(term494047, term494047.getClass(), "characterId2", 0);
        setIntField(term494047, term494047.getClass(), "characterLevel2", 0);
        setIntField(term494047, term494047.getClass(), "characterAwakening2", 0);
        setIntField(term494047, term494047.getClass(), "characterId3", 0);
        setIntField(term494047, term494047.getClass(), "characterLevel3", 0);
        setIntField(term494047, term494047.getClass(), "characterAwakening3", 0);
        setIntField(term494047, term494047.getClass(), "characterId4", 0);
        setIntField(term494047, term494047.getClass(), "characterLevel4", 0);
        setIntField(term494047, term494047.getClass(), "characterAwakening4", 0);
        setIntField(term494047, term494047.getClass(), "characterId5", 0);
        setIntField(term494047, term494047.getClass(), "characterLevel5", 0);
        setIntField(term494047, term494047.getClass(), "characterAwakening5", 0);
        setIntField(term494047, term494047.getClass(), "achievement", 0);
        setIntField(term494047, term494047.getClass(), "deluxscore", 0);
        setIntField(term494047, term494047.getClass(), "scoreRank", 0);
        setIntField(term494047, term494047.getClass(), "maxCombo", 0);
        setIntField(term494047, term494047.getClass(), "totalCombo", 0);
        setIntField(term494047, term494047.getClass(), "maxSync", 0);
        setIntField(term494047, term494047.getClass(), "totalSync", 0);
        setIntField(term494047, term494047.getClass(), "tapCriticalPerfect", 0);
        setIntField(term494047, term494047.getClass(), "tapPerfect", 0);
        setIntField(term494047, term494047.getClass(), "tapGreat", 0);
        setIntField(term494047, term494047.getClass(), "tapGood", 0);
        setIntField(term494047, term494047.getClass(), "tapMiss", 0);
        setIntField(term494047, term494047.getClass(), "holdCriticalPerfect", 0);
        setIntField(term494047, term494047.getClass(), "holdPerfect", 0);
        setIntField(term494047, term494047.getClass(), "holdGreat", 0);
        setIntField(term494047, term494047.getClass(), "holdGood", 0);
        setIntField(term494047, term494047.getClass(), "holdMiss", 0);
        setIntField(term494047, term494047.getClass(), "slideCriticalPerfect", 0);
        setIntField(term494047, term494047.getClass(), "slidePerfect", 0);
        setIntField(term494047, term494047.getClass(), "slideGreat", 0);
        setIntField(term494047, term494047.getClass(), "slideGood", 0);
        setIntField(term494047, term494047.getClass(), "slideMiss", 0);
        setIntField(term494047, term494047.getClass(), "touchCriticalPerfect", 0);
        setIntField(term494047, term494047.getClass(), "touchPerfect", 0);
        setIntField(term494047, term494047.getClass(), "touchGreat", 0);
        setIntField(term494047, term494047.getClass(), "touchGood", 0);
        setIntField(term494047, term494047.getClass(), "touchMiss", 0);
        setIntField(term494047, term494047.getClass(), "breakCriticalPerfect", 0);
        setIntField(term494047, term494047.getClass(), "breakPerfect", 0);
        setIntField(term494047, term494047.getClass(), "breakGreat", 0);
        setIntField(term494047, term494047.getClass(), "breakGood", 0);
        setIntField(term494047, term494047.getClass(), "breakMiss", 0);
        setBooleanField(term494047, term494047.getClass(), "isTap", false);
        setBooleanField(term494047, term494047.getClass(), "isHold", false);
        setBooleanField(term494047, term494047.getClass(), "isSlide", false);
        setBooleanField(term494047, term494047.getClass(), "isTouch", false);
        setBooleanField(term494047, term494047.getClass(), "isBreak", false);
        setBooleanField(term494047, term494047.getClass(), "isCriticalDisp", false);
        setBooleanField(term494047, term494047.getClass(), "isFastLateDisp", false);
        setIntField(term494047, term494047.getClass(), "fastCount", 0);
        setIntField(term494047, term494047.getClass(), "lateCount", 0);
        setBooleanField(term494047, term494047.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term494047, term494047.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term494047, term494047.getClass(), "comboStatus", 0);
        setIntField(term494047, term494047.getClass(), "syncStatus", 0);
        setBooleanField(term494047, term494047.getClass(), "isClear", false);
        setIntField(term494047, term494047.getClass(), "beforeRating", 0);
        setIntField(term494047, term494047.getClass(), "afterRating", 0);
        setIntField(term494047, term494047.getClass(), "beforeGrade", 0);
        setIntField(term494047, term494047.getClass(), "afterGrade", 0);
        setIntField(term494047, term494047.getClass(), "afterGradeRank", 0);
        setIntField(term494047, term494047.getClass(), "beforeDeluxRating", 0);
        setIntField(term494047, term494047.getClass(), "afterDeluxRating", 0);
        setBooleanField(term494047, term494047.getClass(), "isPlayTutorial", false);
        setBooleanField(term494047, term494047.getClass(), "isEventMode", false);
        setBooleanField(term494047, term494047.getClass(), "isFreedomMode", false);
        setIntField(term494047, term494047.getClass(), "playMode", 0);
        setBooleanField(term494047, term494047.getClass(), "isNewFree", false);
        setIntField(term494047, term494047.getClass(), "trialPlayAchievement", 0);
        setIntField(term494047, term494047.getClass(), "extNum1", 0);
        setIntField(term494047, term494047.getClass(), "extNum2", 0);
        term494147 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term494147;
        callMethod(klass, "setBreakCriticalPerfect", argTypes, term494047, args);
    }

};


