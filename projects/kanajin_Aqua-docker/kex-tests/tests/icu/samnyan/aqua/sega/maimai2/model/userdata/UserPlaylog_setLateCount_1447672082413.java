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

public class UserPlaylog_setLateCount_1447672082413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term495373;
     Object term495473;

    public UserPlaylog_setLateCount_1447672082413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term495373 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term495373, term495373.getClass(), "id", 0L);
        setField(term495373, term495373.getClass(), "user", null);
        setIntField(term495373, term495373.getClass(), "orderId", 0);
        setLongField(term495373, term495373.getClass(), "playlogId", 0L);
        setIntField(term495373, term495373.getClass(), "version", 0);
        setIntField(term495373, term495373.getClass(), "placeId", 0);
        setField(term495373, term495373.getClass(), "placeName", null);
        setLongField(term495373, term495373.getClass(), "loginDate", 0L);
        setField(term495373, term495373.getClass(), "playDate", null);
        setField(term495373, term495373.getClass(), "userPlayDate", null);
        setIntField(term495373, term495373.getClass(), "type", 0);
        setIntField(term495373, term495373.getClass(), "musicId", 0);
        setIntField(term495373, term495373.getClass(), "level", 0);
        setIntField(term495373, term495373.getClass(), "trackNo", 0);
        setIntField(term495373, term495373.getClass(), "vsMode", 0);
        setField(term495373, term495373.getClass(), "vsUserName", null);
        setIntField(term495373, term495373.getClass(), "vsStatus", 0);
        setIntField(term495373, term495373.getClass(), "vsUserRating", 0);
        setIntField(term495373, term495373.getClass(), "vsUserAchievement", 0);
        setIntField(term495373, term495373.getClass(), "vsUserGradeRank", 0);
        setIntField(term495373, term495373.getClass(), "vsRank", 0);
        setIntField(term495373, term495373.getClass(), "playerNum", 0);
        setLongField(term495373, term495373.getClass(), "playedUserId1", 0L);
        setField(term495373, term495373.getClass(), "playedUserName1", null);
        setIntField(term495373, term495373.getClass(), "playedMusicLevel1", 0);
        setLongField(term495373, term495373.getClass(), "playedUserId2", 0L);
        setField(term495373, term495373.getClass(), "playedUserName2", null);
        setIntField(term495373, term495373.getClass(), "playedMusicLevel2", 0);
        setLongField(term495373, term495373.getClass(), "playedUserId3", 0L);
        setField(term495373, term495373.getClass(), "playedUserName3", null);
        setIntField(term495373, term495373.getClass(), "playedMusicLevel3", 0);
        setIntField(term495373, term495373.getClass(), "characterId1", 0);
        setIntField(term495373, term495373.getClass(), "characterLevel1", 0);
        setIntField(term495373, term495373.getClass(), "characterAwakening1", 0);
        setIntField(term495373, term495373.getClass(), "characterId2", 0);
        setIntField(term495373, term495373.getClass(), "characterLevel2", 0);
        setIntField(term495373, term495373.getClass(), "characterAwakening2", 0);
        setIntField(term495373, term495373.getClass(), "characterId3", 0);
        setIntField(term495373, term495373.getClass(), "characterLevel3", 0);
        setIntField(term495373, term495373.getClass(), "characterAwakening3", 0);
        setIntField(term495373, term495373.getClass(), "characterId4", 0);
        setIntField(term495373, term495373.getClass(), "characterLevel4", 0);
        setIntField(term495373, term495373.getClass(), "characterAwakening4", 0);
        setIntField(term495373, term495373.getClass(), "characterId5", 0);
        setIntField(term495373, term495373.getClass(), "characterLevel5", 0);
        setIntField(term495373, term495373.getClass(), "characterAwakening5", 0);
        setIntField(term495373, term495373.getClass(), "achievement", 0);
        setIntField(term495373, term495373.getClass(), "deluxscore", 0);
        setIntField(term495373, term495373.getClass(), "scoreRank", 0);
        setIntField(term495373, term495373.getClass(), "maxCombo", 0);
        setIntField(term495373, term495373.getClass(), "totalCombo", 0);
        setIntField(term495373, term495373.getClass(), "maxSync", 0);
        setIntField(term495373, term495373.getClass(), "totalSync", 0);
        setIntField(term495373, term495373.getClass(), "tapCriticalPerfect", 0);
        setIntField(term495373, term495373.getClass(), "tapPerfect", 0);
        setIntField(term495373, term495373.getClass(), "tapGreat", 0);
        setIntField(term495373, term495373.getClass(), "tapGood", 0);
        setIntField(term495373, term495373.getClass(), "tapMiss", 0);
        setIntField(term495373, term495373.getClass(), "holdCriticalPerfect", 0);
        setIntField(term495373, term495373.getClass(), "holdPerfect", 0);
        setIntField(term495373, term495373.getClass(), "holdGreat", 0);
        setIntField(term495373, term495373.getClass(), "holdGood", 0);
        setIntField(term495373, term495373.getClass(), "holdMiss", 0);
        setIntField(term495373, term495373.getClass(), "slideCriticalPerfect", 0);
        setIntField(term495373, term495373.getClass(), "slidePerfect", 0);
        setIntField(term495373, term495373.getClass(), "slideGreat", 0);
        setIntField(term495373, term495373.getClass(), "slideGood", 0);
        setIntField(term495373, term495373.getClass(), "slideMiss", 0);
        setIntField(term495373, term495373.getClass(), "touchCriticalPerfect", 0);
        setIntField(term495373, term495373.getClass(), "touchPerfect", 0);
        setIntField(term495373, term495373.getClass(), "touchGreat", 0);
        setIntField(term495373, term495373.getClass(), "touchGood", 0);
        setIntField(term495373, term495373.getClass(), "touchMiss", 0);
        setIntField(term495373, term495373.getClass(), "breakCriticalPerfect", 0);
        setIntField(term495373, term495373.getClass(), "breakPerfect", 0);
        setIntField(term495373, term495373.getClass(), "breakGreat", 0);
        setIntField(term495373, term495373.getClass(), "breakGood", 0);
        setIntField(term495373, term495373.getClass(), "breakMiss", 0);
        setBooleanField(term495373, term495373.getClass(), "isTap", false);
        setBooleanField(term495373, term495373.getClass(), "isHold", false);
        setBooleanField(term495373, term495373.getClass(), "isSlide", false);
        setBooleanField(term495373, term495373.getClass(), "isTouch", false);
        setBooleanField(term495373, term495373.getClass(), "isBreak", false);
        setBooleanField(term495373, term495373.getClass(), "isCriticalDisp", false);
        setBooleanField(term495373, term495373.getClass(), "isFastLateDisp", false);
        setIntField(term495373, term495373.getClass(), "fastCount", 0);
        setIntField(term495373, term495373.getClass(), "lateCount", 0);
        setBooleanField(term495373, term495373.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term495373, term495373.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term495373, term495373.getClass(), "comboStatus", 0);
        setIntField(term495373, term495373.getClass(), "syncStatus", 0);
        setBooleanField(term495373, term495373.getClass(), "isClear", false);
        setIntField(term495373, term495373.getClass(), "beforeRating", 0);
        setIntField(term495373, term495373.getClass(), "afterRating", 0);
        setIntField(term495373, term495373.getClass(), "beforeGrade", 0);
        setIntField(term495373, term495373.getClass(), "afterGrade", 0);
        setIntField(term495373, term495373.getClass(), "afterGradeRank", 0);
        setIntField(term495373, term495373.getClass(), "beforeDeluxRating", 0);
        setIntField(term495373, term495373.getClass(), "afterDeluxRating", 0);
        setBooleanField(term495373, term495373.getClass(), "isPlayTutorial", false);
        setBooleanField(term495373, term495373.getClass(), "isEventMode", false);
        setBooleanField(term495373, term495373.getClass(), "isFreedomMode", false);
        setIntField(term495373, term495373.getClass(), "playMode", 0);
        setBooleanField(term495373, term495373.getClass(), "isNewFree", false);
        setIntField(term495373, term495373.getClass(), "trialPlayAchievement", 0);
        setIntField(term495373, term495373.getClass(), "extNum1", 0);
        setIntField(term495373, term495373.getClass(), "extNum2", 0);
        term495473 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term495473;
        callMethod(klass, "setLateCount", argTypes, term495373, args);
    }

};


