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

public class UserPlaylog_setOrderId_49995666329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term486819;
     Object term486919;

    public UserPlaylog_setOrderId_49995666329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term486819 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term486819, term486819.getClass(), "id", 0L);
        setField(term486819, term486819.getClass(), "user", null);
        setIntField(term486819, term486819.getClass(), "orderId", 0);
        setLongField(term486819, term486819.getClass(), "playlogId", 0L);
        setIntField(term486819, term486819.getClass(), "version", 0);
        setIntField(term486819, term486819.getClass(), "placeId", 0);
        setField(term486819, term486819.getClass(), "placeName", null);
        setLongField(term486819, term486819.getClass(), "loginDate", 0L);
        setField(term486819, term486819.getClass(), "playDate", null);
        setField(term486819, term486819.getClass(), "userPlayDate", null);
        setIntField(term486819, term486819.getClass(), "type", 0);
        setIntField(term486819, term486819.getClass(), "musicId", 0);
        setIntField(term486819, term486819.getClass(), "level", 0);
        setIntField(term486819, term486819.getClass(), "trackNo", 0);
        setIntField(term486819, term486819.getClass(), "vsMode", 0);
        setField(term486819, term486819.getClass(), "vsUserName", null);
        setIntField(term486819, term486819.getClass(), "vsStatus", 0);
        setIntField(term486819, term486819.getClass(), "vsUserRating", 0);
        setIntField(term486819, term486819.getClass(), "vsUserAchievement", 0);
        setIntField(term486819, term486819.getClass(), "vsUserGradeRank", 0);
        setIntField(term486819, term486819.getClass(), "vsRank", 0);
        setIntField(term486819, term486819.getClass(), "playerNum", 0);
        setLongField(term486819, term486819.getClass(), "playedUserId1", 0L);
        setField(term486819, term486819.getClass(), "playedUserName1", null);
        setIntField(term486819, term486819.getClass(), "playedMusicLevel1", 0);
        setLongField(term486819, term486819.getClass(), "playedUserId2", 0L);
        setField(term486819, term486819.getClass(), "playedUserName2", null);
        setIntField(term486819, term486819.getClass(), "playedMusicLevel2", 0);
        setLongField(term486819, term486819.getClass(), "playedUserId3", 0L);
        setField(term486819, term486819.getClass(), "playedUserName3", null);
        setIntField(term486819, term486819.getClass(), "playedMusicLevel3", 0);
        setIntField(term486819, term486819.getClass(), "characterId1", 0);
        setIntField(term486819, term486819.getClass(), "characterLevel1", 0);
        setIntField(term486819, term486819.getClass(), "characterAwakening1", 0);
        setIntField(term486819, term486819.getClass(), "characterId2", 0);
        setIntField(term486819, term486819.getClass(), "characterLevel2", 0);
        setIntField(term486819, term486819.getClass(), "characterAwakening2", 0);
        setIntField(term486819, term486819.getClass(), "characterId3", 0);
        setIntField(term486819, term486819.getClass(), "characterLevel3", 0);
        setIntField(term486819, term486819.getClass(), "characterAwakening3", 0);
        setIntField(term486819, term486819.getClass(), "characterId4", 0);
        setIntField(term486819, term486819.getClass(), "characterLevel4", 0);
        setIntField(term486819, term486819.getClass(), "characterAwakening4", 0);
        setIntField(term486819, term486819.getClass(), "characterId5", 0);
        setIntField(term486819, term486819.getClass(), "characterLevel5", 0);
        setIntField(term486819, term486819.getClass(), "characterAwakening5", 0);
        setIntField(term486819, term486819.getClass(), "achievement", 0);
        setIntField(term486819, term486819.getClass(), "deluxscore", 0);
        setIntField(term486819, term486819.getClass(), "scoreRank", 0);
        setIntField(term486819, term486819.getClass(), "maxCombo", 0);
        setIntField(term486819, term486819.getClass(), "totalCombo", 0);
        setIntField(term486819, term486819.getClass(), "maxSync", 0);
        setIntField(term486819, term486819.getClass(), "totalSync", 0);
        setIntField(term486819, term486819.getClass(), "tapCriticalPerfect", 0);
        setIntField(term486819, term486819.getClass(), "tapPerfect", 0);
        setIntField(term486819, term486819.getClass(), "tapGreat", 0);
        setIntField(term486819, term486819.getClass(), "tapGood", 0);
        setIntField(term486819, term486819.getClass(), "tapMiss", 0);
        setIntField(term486819, term486819.getClass(), "holdCriticalPerfect", 0);
        setIntField(term486819, term486819.getClass(), "holdPerfect", 0);
        setIntField(term486819, term486819.getClass(), "holdGreat", 0);
        setIntField(term486819, term486819.getClass(), "holdGood", 0);
        setIntField(term486819, term486819.getClass(), "holdMiss", 0);
        setIntField(term486819, term486819.getClass(), "slideCriticalPerfect", 0);
        setIntField(term486819, term486819.getClass(), "slidePerfect", 0);
        setIntField(term486819, term486819.getClass(), "slideGreat", 0);
        setIntField(term486819, term486819.getClass(), "slideGood", 0);
        setIntField(term486819, term486819.getClass(), "slideMiss", 0);
        setIntField(term486819, term486819.getClass(), "touchCriticalPerfect", 0);
        setIntField(term486819, term486819.getClass(), "touchPerfect", 0);
        setIntField(term486819, term486819.getClass(), "touchGreat", 0);
        setIntField(term486819, term486819.getClass(), "touchGood", 0);
        setIntField(term486819, term486819.getClass(), "touchMiss", 0);
        setIntField(term486819, term486819.getClass(), "breakCriticalPerfect", 0);
        setIntField(term486819, term486819.getClass(), "breakPerfect", 0);
        setIntField(term486819, term486819.getClass(), "breakGreat", 0);
        setIntField(term486819, term486819.getClass(), "breakGood", 0);
        setIntField(term486819, term486819.getClass(), "breakMiss", 0);
        setBooleanField(term486819, term486819.getClass(), "isTap", false);
        setBooleanField(term486819, term486819.getClass(), "isHold", false);
        setBooleanField(term486819, term486819.getClass(), "isSlide", false);
        setBooleanField(term486819, term486819.getClass(), "isTouch", false);
        setBooleanField(term486819, term486819.getClass(), "isBreak", false);
        setBooleanField(term486819, term486819.getClass(), "isCriticalDisp", false);
        setBooleanField(term486819, term486819.getClass(), "isFastLateDisp", false);
        setIntField(term486819, term486819.getClass(), "fastCount", 0);
        setIntField(term486819, term486819.getClass(), "lateCount", 0);
        setBooleanField(term486819, term486819.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term486819, term486819.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term486819, term486819.getClass(), "comboStatus", 0);
        setIntField(term486819, term486819.getClass(), "syncStatus", 0);
        setBooleanField(term486819, term486819.getClass(), "isClear", false);
        setIntField(term486819, term486819.getClass(), "beforeRating", 0);
        setIntField(term486819, term486819.getClass(), "afterRating", 0);
        setIntField(term486819, term486819.getClass(), "beforeGrade", 0);
        setIntField(term486819, term486819.getClass(), "afterGrade", 0);
        setIntField(term486819, term486819.getClass(), "afterGradeRank", 0);
        setIntField(term486819, term486819.getClass(), "beforeDeluxRating", 0);
        setIntField(term486819, term486819.getClass(), "afterDeluxRating", 0);
        setBooleanField(term486819, term486819.getClass(), "isPlayTutorial", false);
        setBooleanField(term486819, term486819.getClass(), "isEventMode", false);
        setBooleanField(term486819, term486819.getClass(), "isFreedomMode", false);
        setIntField(term486819, term486819.getClass(), "playMode", 0);
        setBooleanField(term486819, term486819.getClass(), "isNewFree", false);
        setIntField(term486819, term486819.getClass(), "trialPlayAchievement", 0);
        setIntField(term486819, term486819.getClass(), "extNum1", 0);
        setIntField(term486819, term486819.getClass(), "extNum2", 0);
        term486919 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term486919;
        callMethod(klass, "setOrderId", argTypes, term486819, args);
    }

};


