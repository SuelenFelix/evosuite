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

public class UserPlaylog_setBeforeRating_179076873419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term495985;
     Object term496085;

    public UserPlaylog_setBeforeRating_179076873419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term495985 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term495985, term495985.getClass(), "id", 0L);
        setField(term495985, term495985.getClass(), "user", null);
        setIntField(term495985, term495985.getClass(), "orderId", 0);
        setLongField(term495985, term495985.getClass(), "playlogId", 0L);
        setIntField(term495985, term495985.getClass(), "version", 0);
        setIntField(term495985, term495985.getClass(), "placeId", 0);
        setField(term495985, term495985.getClass(), "placeName", null);
        setLongField(term495985, term495985.getClass(), "loginDate", 0L);
        setField(term495985, term495985.getClass(), "playDate", null);
        setField(term495985, term495985.getClass(), "userPlayDate", null);
        setIntField(term495985, term495985.getClass(), "type", 0);
        setIntField(term495985, term495985.getClass(), "musicId", 0);
        setIntField(term495985, term495985.getClass(), "level", 0);
        setIntField(term495985, term495985.getClass(), "trackNo", 0);
        setIntField(term495985, term495985.getClass(), "vsMode", 0);
        setField(term495985, term495985.getClass(), "vsUserName", null);
        setIntField(term495985, term495985.getClass(), "vsStatus", 0);
        setIntField(term495985, term495985.getClass(), "vsUserRating", 0);
        setIntField(term495985, term495985.getClass(), "vsUserAchievement", 0);
        setIntField(term495985, term495985.getClass(), "vsUserGradeRank", 0);
        setIntField(term495985, term495985.getClass(), "vsRank", 0);
        setIntField(term495985, term495985.getClass(), "playerNum", 0);
        setLongField(term495985, term495985.getClass(), "playedUserId1", 0L);
        setField(term495985, term495985.getClass(), "playedUserName1", null);
        setIntField(term495985, term495985.getClass(), "playedMusicLevel1", 0);
        setLongField(term495985, term495985.getClass(), "playedUserId2", 0L);
        setField(term495985, term495985.getClass(), "playedUserName2", null);
        setIntField(term495985, term495985.getClass(), "playedMusicLevel2", 0);
        setLongField(term495985, term495985.getClass(), "playedUserId3", 0L);
        setField(term495985, term495985.getClass(), "playedUserName3", null);
        setIntField(term495985, term495985.getClass(), "playedMusicLevel3", 0);
        setIntField(term495985, term495985.getClass(), "characterId1", 0);
        setIntField(term495985, term495985.getClass(), "characterLevel1", 0);
        setIntField(term495985, term495985.getClass(), "characterAwakening1", 0);
        setIntField(term495985, term495985.getClass(), "characterId2", 0);
        setIntField(term495985, term495985.getClass(), "characterLevel2", 0);
        setIntField(term495985, term495985.getClass(), "characterAwakening2", 0);
        setIntField(term495985, term495985.getClass(), "characterId3", 0);
        setIntField(term495985, term495985.getClass(), "characterLevel3", 0);
        setIntField(term495985, term495985.getClass(), "characterAwakening3", 0);
        setIntField(term495985, term495985.getClass(), "characterId4", 0);
        setIntField(term495985, term495985.getClass(), "characterLevel4", 0);
        setIntField(term495985, term495985.getClass(), "characterAwakening4", 0);
        setIntField(term495985, term495985.getClass(), "characterId5", 0);
        setIntField(term495985, term495985.getClass(), "characterLevel5", 0);
        setIntField(term495985, term495985.getClass(), "characterAwakening5", 0);
        setIntField(term495985, term495985.getClass(), "achievement", 0);
        setIntField(term495985, term495985.getClass(), "deluxscore", 0);
        setIntField(term495985, term495985.getClass(), "scoreRank", 0);
        setIntField(term495985, term495985.getClass(), "maxCombo", 0);
        setIntField(term495985, term495985.getClass(), "totalCombo", 0);
        setIntField(term495985, term495985.getClass(), "maxSync", 0);
        setIntField(term495985, term495985.getClass(), "totalSync", 0);
        setIntField(term495985, term495985.getClass(), "tapCriticalPerfect", 0);
        setIntField(term495985, term495985.getClass(), "tapPerfect", 0);
        setIntField(term495985, term495985.getClass(), "tapGreat", 0);
        setIntField(term495985, term495985.getClass(), "tapGood", 0);
        setIntField(term495985, term495985.getClass(), "tapMiss", 0);
        setIntField(term495985, term495985.getClass(), "holdCriticalPerfect", 0);
        setIntField(term495985, term495985.getClass(), "holdPerfect", 0);
        setIntField(term495985, term495985.getClass(), "holdGreat", 0);
        setIntField(term495985, term495985.getClass(), "holdGood", 0);
        setIntField(term495985, term495985.getClass(), "holdMiss", 0);
        setIntField(term495985, term495985.getClass(), "slideCriticalPerfect", 0);
        setIntField(term495985, term495985.getClass(), "slidePerfect", 0);
        setIntField(term495985, term495985.getClass(), "slideGreat", 0);
        setIntField(term495985, term495985.getClass(), "slideGood", 0);
        setIntField(term495985, term495985.getClass(), "slideMiss", 0);
        setIntField(term495985, term495985.getClass(), "touchCriticalPerfect", 0);
        setIntField(term495985, term495985.getClass(), "touchPerfect", 0);
        setIntField(term495985, term495985.getClass(), "touchGreat", 0);
        setIntField(term495985, term495985.getClass(), "touchGood", 0);
        setIntField(term495985, term495985.getClass(), "touchMiss", 0);
        setIntField(term495985, term495985.getClass(), "breakCriticalPerfect", 0);
        setIntField(term495985, term495985.getClass(), "breakPerfect", 0);
        setIntField(term495985, term495985.getClass(), "breakGreat", 0);
        setIntField(term495985, term495985.getClass(), "breakGood", 0);
        setIntField(term495985, term495985.getClass(), "breakMiss", 0);
        setBooleanField(term495985, term495985.getClass(), "isTap", false);
        setBooleanField(term495985, term495985.getClass(), "isHold", false);
        setBooleanField(term495985, term495985.getClass(), "isSlide", false);
        setBooleanField(term495985, term495985.getClass(), "isTouch", false);
        setBooleanField(term495985, term495985.getClass(), "isBreak", false);
        setBooleanField(term495985, term495985.getClass(), "isCriticalDisp", false);
        setBooleanField(term495985, term495985.getClass(), "isFastLateDisp", false);
        setIntField(term495985, term495985.getClass(), "fastCount", 0);
        setIntField(term495985, term495985.getClass(), "lateCount", 0);
        setBooleanField(term495985, term495985.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term495985, term495985.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term495985, term495985.getClass(), "comboStatus", 0);
        setIntField(term495985, term495985.getClass(), "syncStatus", 0);
        setBooleanField(term495985, term495985.getClass(), "isClear", false);
        setIntField(term495985, term495985.getClass(), "beforeRating", 0);
        setIntField(term495985, term495985.getClass(), "afterRating", 0);
        setIntField(term495985, term495985.getClass(), "beforeGrade", 0);
        setIntField(term495985, term495985.getClass(), "afterGrade", 0);
        setIntField(term495985, term495985.getClass(), "afterGradeRank", 0);
        setIntField(term495985, term495985.getClass(), "beforeDeluxRating", 0);
        setIntField(term495985, term495985.getClass(), "afterDeluxRating", 0);
        setBooleanField(term495985, term495985.getClass(), "isPlayTutorial", false);
        setBooleanField(term495985, term495985.getClass(), "isEventMode", false);
        setBooleanField(term495985, term495985.getClass(), "isFreedomMode", false);
        setIntField(term495985, term495985.getClass(), "playMode", 0);
        setBooleanField(term495985, term495985.getClass(), "isNewFree", false);
        setIntField(term495985, term495985.getClass(), "trialPlayAchievement", 0);
        setIntField(term495985, term495985.getClass(), "extNum1", 0);
        setIntField(term495985, term495985.getClass(), "extNum2", 0);
        term496085 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term496085;
        callMethod(klass, "setBeforeRating", argTypes, term495985, args);
    }

};


