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

public class UserPlaylog_setBreakMiss_2013376804404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term494455;
     Object term494555;

    public UserPlaylog_setBreakMiss_2013376804404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term494455 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term494455, term494455.getClass(), "id", 0L);
        setField(term494455, term494455.getClass(), "user", null);
        setIntField(term494455, term494455.getClass(), "orderId", 0);
        setLongField(term494455, term494455.getClass(), "playlogId", 0L);
        setIntField(term494455, term494455.getClass(), "version", 0);
        setIntField(term494455, term494455.getClass(), "placeId", 0);
        setField(term494455, term494455.getClass(), "placeName", null);
        setLongField(term494455, term494455.getClass(), "loginDate", 0L);
        setField(term494455, term494455.getClass(), "playDate", null);
        setField(term494455, term494455.getClass(), "userPlayDate", null);
        setIntField(term494455, term494455.getClass(), "type", 0);
        setIntField(term494455, term494455.getClass(), "musicId", 0);
        setIntField(term494455, term494455.getClass(), "level", 0);
        setIntField(term494455, term494455.getClass(), "trackNo", 0);
        setIntField(term494455, term494455.getClass(), "vsMode", 0);
        setField(term494455, term494455.getClass(), "vsUserName", null);
        setIntField(term494455, term494455.getClass(), "vsStatus", 0);
        setIntField(term494455, term494455.getClass(), "vsUserRating", 0);
        setIntField(term494455, term494455.getClass(), "vsUserAchievement", 0);
        setIntField(term494455, term494455.getClass(), "vsUserGradeRank", 0);
        setIntField(term494455, term494455.getClass(), "vsRank", 0);
        setIntField(term494455, term494455.getClass(), "playerNum", 0);
        setLongField(term494455, term494455.getClass(), "playedUserId1", 0L);
        setField(term494455, term494455.getClass(), "playedUserName1", null);
        setIntField(term494455, term494455.getClass(), "playedMusicLevel1", 0);
        setLongField(term494455, term494455.getClass(), "playedUserId2", 0L);
        setField(term494455, term494455.getClass(), "playedUserName2", null);
        setIntField(term494455, term494455.getClass(), "playedMusicLevel2", 0);
        setLongField(term494455, term494455.getClass(), "playedUserId3", 0L);
        setField(term494455, term494455.getClass(), "playedUserName3", null);
        setIntField(term494455, term494455.getClass(), "playedMusicLevel3", 0);
        setIntField(term494455, term494455.getClass(), "characterId1", 0);
        setIntField(term494455, term494455.getClass(), "characterLevel1", 0);
        setIntField(term494455, term494455.getClass(), "characterAwakening1", 0);
        setIntField(term494455, term494455.getClass(), "characterId2", 0);
        setIntField(term494455, term494455.getClass(), "characterLevel2", 0);
        setIntField(term494455, term494455.getClass(), "characterAwakening2", 0);
        setIntField(term494455, term494455.getClass(), "characterId3", 0);
        setIntField(term494455, term494455.getClass(), "characterLevel3", 0);
        setIntField(term494455, term494455.getClass(), "characterAwakening3", 0);
        setIntField(term494455, term494455.getClass(), "characterId4", 0);
        setIntField(term494455, term494455.getClass(), "characterLevel4", 0);
        setIntField(term494455, term494455.getClass(), "characterAwakening4", 0);
        setIntField(term494455, term494455.getClass(), "characterId5", 0);
        setIntField(term494455, term494455.getClass(), "characterLevel5", 0);
        setIntField(term494455, term494455.getClass(), "characterAwakening5", 0);
        setIntField(term494455, term494455.getClass(), "achievement", 0);
        setIntField(term494455, term494455.getClass(), "deluxscore", 0);
        setIntField(term494455, term494455.getClass(), "scoreRank", 0);
        setIntField(term494455, term494455.getClass(), "maxCombo", 0);
        setIntField(term494455, term494455.getClass(), "totalCombo", 0);
        setIntField(term494455, term494455.getClass(), "maxSync", 0);
        setIntField(term494455, term494455.getClass(), "totalSync", 0);
        setIntField(term494455, term494455.getClass(), "tapCriticalPerfect", 0);
        setIntField(term494455, term494455.getClass(), "tapPerfect", 0);
        setIntField(term494455, term494455.getClass(), "tapGreat", 0);
        setIntField(term494455, term494455.getClass(), "tapGood", 0);
        setIntField(term494455, term494455.getClass(), "tapMiss", 0);
        setIntField(term494455, term494455.getClass(), "holdCriticalPerfect", 0);
        setIntField(term494455, term494455.getClass(), "holdPerfect", 0);
        setIntField(term494455, term494455.getClass(), "holdGreat", 0);
        setIntField(term494455, term494455.getClass(), "holdGood", 0);
        setIntField(term494455, term494455.getClass(), "holdMiss", 0);
        setIntField(term494455, term494455.getClass(), "slideCriticalPerfect", 0);
        setIntField(term494455, term494455.getClass(), "slidePerfect", 0);
        setIntField(term494455, term494455.getClass(), "slideGreat", 0);
        setIntField(term494455, term494455.getClass(), "slideGood", 0);
        setIntField(term494455, term494455.getClass(), "slideMiss", 0);
        setIntField(term494455, term494455.getClass(), "touchCriticalPerfect", 0);
        setIntField(term494455, term494455.getClass(), "touchPerfect", 0);
        setIntField(term494455, term494455.getClass(), "touchGreat", 0);
        setIntField(term494455, term494455.getClass(), "touchGood", 0);
        setIntField(term494455, term494455.getClass(), "touchMiss", 0);
        setIntField(term494455, term494455.getClass(), "breakCriticalPerfect", 0);
        setIntField(term494455, term494455.getClass(), "breakPerfect", 0);
        setIntField(term494455, term494455.getClass(), "breakGreat", 0);
        setIntField(term494455, term494455.getClass(), "breakGood", 0);
        setIntField(term494455, term494455.getClass(), "breakMiss", 0);
        setBooleanField(term494455, term494455.getClass(), "isTap", false);
        setBooleanField(term494455, term494455.getClass(), "isHold", false);
        setBooleanField(term494455, term494455.getClass(), "isSlide", false);
        setBooleanField(term494455, term494455.getClass(), "isTouch", false);
        setBooleanField(term494455, term494455.getClass(), "isBreak", false);
        setBooleanField(term494455, term494455.getClass(), "isCriticalDisp", false);
        setBooleanField(term494455, term494455.getClass(), "isFastLateDisp", false);
        setIntField(term494455, term494455.getClass(), "fastCount", 0);
        setIntField(term494455, term494455.getClass(), "lateCount", 0);
        setBooleanField(term494455, term494455.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term494455, term494455.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term494455, term494455.getClass(), "comboStatus", 0);
        setIntField(term494455, term494455.getClass(), "syncStatus", 0);
        setBooleanField(term494455, term494455.getClass(), "isClear", false);
        setIntField(term494455, term494455.getClass(), "beforeRating", 0);
        setIntField(term494455, term494455.getClass(), "afterRating", 0);
        setIntField(term494455, term494455.getClass(), "beforeGrade", 0);
        setIntField(term494455, term494455.getClass(), "afterGrade", 0);
        setIntField(term494455, term494455.getClass(), "afterGradeRank", 0);
        setIntField(term494455, term494455.getClass(), "beforeDeluxRating", 0);
        setIntField(term494455, term494455.getClass(), "afterDeluxRating", 0);
        setBooleanField(term494455, term494455.getClass(), "isPlayTutorial", false);
        setBooleanField(term494455, term494455.getClass(), "isEventMode", false);
        setBooleanField(term494455, term494455.getClass(), "isFreedomMode", false);
        setIntField(term494455, term494455.getClass(), "playMode", 0);
        setBooleanField(term494455, term494455.getClass(), "isNewFree", false);
        setIntField(term494455, term494455.getClass(), "trialPlayAchievement", 0);
        setIntField(term494455, term494455.getClass(), "extNum1", 0);
        setIntField(term494455, term494455.getClass(), "extNum2", 0);
        term494555 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term494555;
        callMethod(klass, "setBreakMiss", argTypes, term494455, args);
    }

};


