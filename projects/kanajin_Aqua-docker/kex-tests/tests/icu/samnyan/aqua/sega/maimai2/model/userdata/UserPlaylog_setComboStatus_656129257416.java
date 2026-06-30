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

public class UserPlaylog_setComboStatus_656129257416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term495679;
     Object term495779;

    public UserPlaylog_setComboStatus_656129257416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term495679 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term495679, term495679.getClass(), "id", 0L);
        setField(term495679, term495679.getClass(), "user", null);
        setIntField(term495679, term495679.getClass(), "orderId", 0);
        setLongField(term495679, term495679.getClass(), "playlogId", 0L);
        setIntField(term495679, term495679.getClass(), "version", 0);
        setIntField(term495679, term495679.getClass(), "placeId", 0);
        setField(term495679, term495679.getClass(), "placeName", null);
        setLongField(term495679, term495679.getClass(), "loginDate", 0L);
        setField(term495679, term495679.getClass(), "playDate", null);
        setField(term495679, term495679.getClass(), "userPlayDate", null);
        setIntField(term495679, term495679.getClass(), "type", 0);
        setIntField(term495679, term495679.getClass(), "musicId", 0);
        setIntField(term495679, term495679.getClass(), "level", 0);
        setIntField(term495679, term495679.getClass(), "trackNo", 0);
        setIntField(term495679, term495679.getClass(), "vsMode", 0);
        setField(term495679, term495679.getClass(), "vsUserName", null);
        setIntField(term495679, term495679.getClass(), "vsStatus", 0);
        setIntField(term495679, term495679.getClass(), "vsUserRating", 0);
        setIntField(term495679, term495679.getClass(), "vsUserAchievement", 0);
        setIntField(term495679, term495679.getClass(), "vsUserGradeRank", 0);
        setIntField(term495679, term495679.getClass(), "vsRank", 0);
        setIntField(term495679, term495679.getClass(), "playerNum", 0);
        setLongField(term495679, term495679.getClass(), "playedUserId1", 0L);
        setField(term495679, term495679.getClass(), "playedUserName1", null);
        setIntField(term495679, term495679.getClass(), "playedMusicLevel1", 0);
        setLongField(term495679, term495679.getClass(), "playedUserId2", 0L);
        setField(term495679, term495679.getClass(), "playedUserName2", null);
        setIntField(term495679, term495679.getClass(), "playedMusicLevel2", 0);
        setLongField(term495679, term495679.getClass(), "playedUserId3", 0L);
        setField(term495679, term495679.getClass(), "playedUserName3", null);
        setIntField(term495679, term495679.getClass(), "playedMusicLevel3", 0);
        setIntField(term495679, term495679.getClass(), "characterId1", 0);
        setIntField(term495679, term495679.getClass(), "characterLevel1", 0);
        setIntField(term495679, term495679.getClass(), "characterAwakening1", 0);
        setIntField(term495679, term495679.getClass(), "characterId2", 0);
        setIntField(term495679, term495679.getClass(), "characterLevel2", 0);
        setIntField(term495679, term495679.getClass(), "characterAwakening2", 0);
        setIntField(term495679, term495679.getClass(), "characterId3", 0);
        setIntField(term495679, term495679.getClass(), "characterLevel3", 0);
        setIntField(term495679, term495679.getClass(), "characterAwakening3", 0);
        setIntField(term495679, term495679.getClass(), "characterId4", 0);
        setIntField(term495679, term495679.getClass(), "characterLevel4", 0);
        setIntField(term495679, term495679.getClass(), "characterAwakening4", 0);
        setIntField(term495679, term495679.getClass(), "characterId5", 0);
        setIntField(term495679, term495679.getClass(), "characterLevel5", 0);
        setIntField(term495679, term495679.getClass(), "characterAwakening5", 0);
        setIntField(term495679, term495679.getClass(), "achievement", 0);
        setIntField(term495679, term495679.getClass(), "deluxscore", 0);
        setIntField(term495679, term495679.getClass(), "scoreRank", 0);
        setIntField(term495679, term495679.getClass(), "maxCombo", 0);
        setIntField(term495679, term495679.getClass(), "totalCombo", 0);
        setIntField(term495679, term495679.getClass(), "maxSync", 0);
        setIntField(term495679, term495679.getClass(), "totalSync", 0);
        setIntField(term495679, term495679.getClass(), "tapCriticalPerfect", 0);
        setIntField(term495679, term495679.getClass(), "tapPerfect", 0);
        setIntField(term495679, term495679.getClass(), "tapGreat", 0);
        setIntField(term495679, term495679.getClass(), "tapGood", 0);
        setIntField(term495679, term495679.getClass(), "tapMiss", 0);
        setIntField(term495679, term495679.getClass(), "holdCriticalPerfect", 0);
        setIntField(term495679, term495679.getClass(), "holdPerfect", 0);
        setIntField(term495679, term495679.getClass(), "holdGreat", 0);
        setIntField(term495679, term495679.getClass(), "holdGood", 0);
        setIntField(term495679, term495679.getClass(), "holdMiss", 0);
        setIntField(term495679, term495679.getClass(), "slideCriticalPerfect", 0);
        setIntField(term495679, term495679.getClass(), "slidePerfect", 0);
        setIntField(term495679, term495679.getClass(), "slideGreat", 0);
        setIntField(term495679, term495679.getClass(), "slideGood", 0);
        setIntField(term495679, term495679.getClass(), "slideMiss", 0);
        setIntField(term495679, term495679.getClass(), "touchCriticalPerfect", 0);
        setIntField(term495679, term495679.getClass(), "touchPerfect", 0);
        setIntField(term495679, term495679.getClass(), "touchGreat", 0);
        setIntField(term495679, term495679.getClass(), "touchGood", 0);
        setIntField(term495679, term495679.getClass(), "touchMiss", 0);
        setIntField(term495679, term495679.getClass(), "breakCriticalPerfect", 0);
        setIntField(term495679, term495679.getClass(), "breakPerfect", 0);
        setIntField(term495679, term495679.getClass(), "breakGreat", 0);
        setIntField(term495679, term495679.getClass(), "breakGood", 0);
        setIntField(term495679, term495679.getClass(), "breakMiss", 0);
        setBooleanField(term495679, term495679.getClass(), "isTap", false);
        setBooleanField(term495679, term495679.getClass(), "isHold", false);
        setBooleanField(term495679, term495679.getClass(), "isSlide", false);
        setBooleanField(term495679, term495679.getClass(), "isTouch", false);
        setBooleanField(term495679, term495679.getClass(), "isBreak", false);
        setBooleanField(term495679, term495679.getClass(), "isCriticalDisp", false);
        setBooleanField(term495679, term495679.getClass(), "isFastLateDisp", false);
        setIntField(term495679, term495679.getClass(), "fastCount", 0);
        setIntField(term495679, term495679.getClass(), "lateCount", 0);
        setBooleanField(term495679, term495679.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term495679, term495679.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term495679, term495679.getClass(), "comboStatus", 0);
        setIntField(term495679, term495679.getClass(), "syncStatus", 0);
        setBooleanField(term495679, term495679.getClass(), "isClear", false);
        setIntField(term495679, term495679.getClass(), "beforeRating", 0);
        setIntField(term495679, term495679.getClass(), "afterRating", 0);
        setIntField(term495679, term495679.getClass(), "beforeGrade", 0);
        setIntField(term495679, term495679.getClass(), "afterGrade", 0);
        setIntField(term495679, term495679.getClass(), "afterGradeRank", 0);
        setIntField(term495679, term495679.getClass(), "beforeDeluxRating", 0);
        setIntField(term495679, term495679.getClass(), "afterDeluxRating", 0);
        setBooleanField(term495679, term495679.getClass(), "isPlayTutorial", false);
        setBooleanField(term495679, term495679.getClass(), "isEventMode", false);
        setBooleanField(term495679, term495679.getClass(), "isFreedomMode", false);
        setIntField(term495679, term495679.getClass(), "playMode", 0);
        setBooleanField(term495679, term495679.getClass(), "isNewFree", false);
        setIntField(term495679, term495679.getClass(), "trialPlayAchievement", 0);
        setIntField(term495679, term495679.getClass(), "extNum1", 0);
        setIntField(term495679, term495679.getClass(), "extNum2", 0);
        term495779 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term495779;
        callMethod(klass, "setComboStatus", argTypes, term495679, args);
    }

};


