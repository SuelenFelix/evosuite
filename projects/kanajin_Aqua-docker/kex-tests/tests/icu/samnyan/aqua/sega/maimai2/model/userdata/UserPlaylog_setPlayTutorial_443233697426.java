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

public class UserPlaylog_setPlayTutorial_443233697426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term496699;
     Object term496799;

    public UserPlaylog_setPlayTutorial_443233697426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term496699 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term496699, term496699.getClass(), "id", 0L);
        setField(term496699, term496699.getClass(), "user", null);
        setIntField(term496699, term496699.getClass(), "orderId", 0);
        setLongField(term496699, term496699.getClass(), "playlogId", 0L);
        setIntField(term496699, term496699.getClass(), "version", 0);
        setIntField(term496699, term496699.getClass(), "placeId", 0);
        setField(term496699, term496699.getClass(), "placeName", null);
        setLongField(term496699, term496699.getClass(), "loginDate", 0L);
        setField(term496699, term496699.getClass(), "playDate", null);
        setField(term496699, term496699.getClass(), "userPlayDate", null);
        setIntField(term496699, term496699.getClass(), "type", 0);
        setIntField(term496699, term496699.getClass(), "musicId", 0);
        setIntField(term496699, term496699.getClass(), "level", 0);
        setIntField(term496699, term496699.getClass(), "trackNo", 0);
        setIntField(term496699, term496699.getClass(), "vsMode", 0);
        setField(term496699, term496699.getClass(), "vsUserName", null);
        setIntField(term496699, term496699.getClass(), "vsStatus", 0);
        setIntField(term496699, term496699.getClass(), "vsUserRating", 0);
        setIntField(term496699, term496699.getClass(), "vsUserAchievement", 0);
        setIntField(term496699, term496699.getClass(), "vsUserGradeRank", 0);
        setIntField(term496699, term496699.getClass(), "vsRank", 0);
        setIntField(term496699, term496699.getClass(), "playerNum", 0);
        setLongField(term496699, term496699.getClass(), "playedUserId1", 0L);
        setField(term496699, term496699.getClass(), "playedUserName1", null);
        setIntField(term496699, term496699.getClass(), "playedMusicLevel1", 0);
        setLongField(term496699, term496699.getClass(), "playedUserId2", 0L);
        setField(term496699, term496699.getClass(), "playedUserName2", null);
        setIntField(term496699, term496699.getClass(), "playedMusicLevel2", 0);
        setLongField(term496699, term496699.getClass(), "playedUserId3", 0L);
        setField(term496699, term496699.getClass(), "playedUserName3", null);
        setIntField(term496699, term496699.getClass(), "playedMusicLevel3", 0);
        setIntField(term496699, term496699.getClass(), "characterId1", 0);
        setIntField(term496699, term496699.getClass(), "characterLevel1", 0);
        setIntField(term496699, term496699.getClass(), "characterAwakening1", 0);
        setIntField(term496699, term496699.getClass(), "characterId2", 0);
        setIntField(term496699, term496699.getClass(), "characterLevel2", 0);
        setIntField(term496699, term496699.getClass(), "characterAwakening2", 0);
        setIntField(term496699, term496699.getClass(), "characterId3", 0);
        setIntField(term496699, term496699.getClass(), "characterLevel3", 0);
        setIntField(term496699, term496699.getClass(), "characterAwakening3", 0);
        setIntField(term496699, term496699.getClass(), "characterId4", 0);
        setIntField(term496699, term496699.getClass(), "characterLevel4", 0);
        setIntField(term496699, term496699.getClass(), "characterAwakening4", 0);
        setIntField(term496699, term496699.getClass(), "characterId5", 0);
        setIntField(term496699, term496699.getClass(), "characterLevel5", 0);
        setIntField(term496699, term496699.getClass(), "characterAwakening5", 0);
        setIntField(term496699, term496699.getClass(), "achievement", 0);
        setIntField(term496699, term496699.getClass(), "deluxscore", 0);
        setIntField(term496699, term496699.getClass(), "scoreRank", 0);
        setIntField(term496699, term496699.getClass(), "maxCombo", 0);
        setIntField(term496699, term496699.getClass(), "totalCombo", 0);
        setIntField(term496699, term496699.getClass(), "maxSync", 0);
        setIntField(term496699, term496699.getClass(), "totalSync", 0);
        setIntField(term496699, term496699.getClass(), "tapCriticalPerfect", 0);
        setIntField(term496699, term496699.getClass(), "tapPerfect", 0);
        setIntField(term496699, term496699.getClass(), "tapGreat", 0);
        setIntField(term496699, term496699.getClass(), "tapGood", 0);
        setIntField(term496699, term496699.getClass(), "tapMiss", 0);
        setIntField(term496699, term496699.getClass(), "holdCriticalPerfect", 0);
        setIntField(term496699, term496699.getClass(), "holdPerfect", 0);
        setIntField(term496699, term496699.getClass(), "holdGreat", 0);
        setIntField(term496699, term496699.getClass(), "holdGood", 0);
        setIntField(term496699, term496699.getClass(), "holdMiss", 0);
        setIntField(term496699, term496699.getClass(), "slideCriticalPerfect", 0);
        setIntField(term496699, term496699.getClass(), "slidePerfect", 0);
        setIntField(term496699, term496699.getClass(), "slideGreat", 0);
        setIntField(term496699, term496699.getClass(), "slideGood", 0);
        setIntField(term496699, term496699.getClass(), "slideMiss", 0);
        setIntField(term496699, term496699.getClass(), "touchCriticalPerfect", 0);
        setIntField(term496699, term496699.getClass(), "touchPerfect", 0);
        setIntField(term496699, term496699.getClass(), "touchGreat", 0);
        setIntField(term496699, term496699.getClass(), "touchGood", 0);
        setIntField(term496699, term496699.getClass(), "touchMiss", 0);
        setIntField(term496699, term496699.getClass(), "breakCriticalPerfect", 0);
        setIntField(term496699, term496699.getClass(), "breakPerfect", 0);
        setIntField(term496699, term496699.getClass(), "breakGreat", 0);
        setIntField(term496699, term496699.getClass(), "breakGood", 0);
        setIntField(term496699, term496699.getClass(), "breakMiss", 0);
        setBooleanField(term496699, term496699.getClass(), "isTap", false);
        setBooleanField(term496699, term496699.getClass(), "isHold", false);
        setBooleanField(term496699, term496699.getClass(), "isSlide", false);
        setBooleanField(term496699, term496699.getClass(), "isTouch", false);
        setBooleanField(term496699, term496699.getClass(), "isBreak", false);
        setBooleanField(term496699, term496699.getClass(), "isCriticalDisp", false);
        setBooleanField(term496699, term496699.getClass(), "isFastLateDisp", false);
        setIntField(term496699, term496699.getClass(), "fastCount", 0);
        setIntField(term496699, term496699.getClass(), "lateCount", 0);
        setBooleanField(term496699, term496699.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term496699, term496699.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term496699, term496699.getClass(), "comboStatus", 0);
        setIntField(term496699, term496699.getClass(), "syncStatus", 0);
        setBooleanField(term496699, term496699.getClass(), "isClear", false);
        setIntField(term496699, term496699.getClass(), "beforeRating", 0);
        setIntField(term496699, term496699.getClass(), "afterRating", 0);
        setIntField(term496699, term496699.getClass(), "beforeGrade", 0);
        setIntField(term496699, term496699.getClass(), "afterGrade", 0);
        setIntField(term496699, term496699.getClass(), "afterGradeRank", 0);
        setIntField(term496699, term496699.getClass(), "beforeDeluxRating", 0);
        setIntField(term496699, term496699.getClass(), "afterDeluxRating", 0);
        setBooleanField(term496699, term496699.getClass(), "isPlayTutorial", false);
        setBooleanField(term496699, term496699.getClass(), "isEventMode", false);
        setBooleanField(term496699, term496699.getClass(), "isFreedomMode", false);
        setIntField(term496699, term496699.getClass(), "playMode", 0);
        setBooleanField(term496699, term496699.getClass(), "isNewFree", false);
        setIntField(term496699, term496699.getClass(), "trialPlayAchievement", 0);
        setIntField(term496699, term496699.getClass(), "extNum1", 0);
        setIntField(term496699, term496699.getClass(), "extNum2", 0);
        term496799 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term496799;
        callMethod(klass, "setPlayTutorial", argTypes, term496699, args);
    }

};


