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
import java.lang.Long;

public class UserPlaylog_setId_887176392327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term486617;
     Object term486717;

    public UserPlaylog_setId_887176392327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term486617 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term486617, term486617.getClass(), "id", 0L);
        setField(term486617, term486617.getClass(), "user", null);
        setIntField(term486617, term486617.getClass(), "orderId", 0);
        setLongField(term486617, term486617.getClass(), "playlogId", 0L);
        setIntField(term486617, term486617.getClass(), "version", 0);
        setIntField(term486617, term486617.getClass(), "placeId", 0);
        setField(term486617, term486617.getClass(), "placeName", null);
        setLongField(term486617, term486617.getClass(), "loginDate", 0L);
        setField(term486617, term486617.getClass(), "playDate", null);
        setField(term486617, term486617.getClass(), "userPlayDate", null);
        setIntField(term486617, term486617.getClass(), "type", 0);
        setIntField(term486617, term486617.getClass(), "musicId", 0);
        setIntField(term486617, term486617.getClass(), "level", 0);
        setIntField(term486617, term486617.getClass(), "trackNo", 0);
        setIntField(term486617, term486617.getClass(), "vsMode", 0);
        setField(term486617, term486617.getClass(), "vsUserName", null);
        setIntField(term486617, term486617.getClass(), "vsStatus", 0);
        setIntField(term486617, term486617.getClass(), "vsUserRating", 0);
        setIntField(term486617, term486617.getClass(), "vsUserAchievement", 0);
        setIntField(term486617, term486617.getClass(), "vsUserGradeRank", 0);
        setIntField(term486617, term486617.getClass(), "vsRank", 0);
        setIntField(term486617, term486617.getClass(), "playerNum", 0);
        setLongField(term486617, term486617.getClass(), "playedUserId1", 0L);
        setField(term486617, term486617.getClass(), "playedUserName1", null);
        setIntField(term486617, term486617.getClass(), "playedMusicLevel1", 0);
        setLongField(term486617, term486617.getClass(), "playedUserId2", 0L);
        setField(term486617, term486617.getClass(), "playedUserName2", null);
        setIntField(term486617, term486617.getClass(), "playedMusicLevel2", 0);
        setLongField(term486617, term486617.getClass(), "playedUserId3", 0L);
        setField(term486617, term486617.getClass(), "playedUserName3", null);
        setIntField(term486617, term486617.getClass(), "playedMusicLevel3", 0);
        setIntField(term486617, term486617.getClass(), "characterId1", 0);
        setIntField(term486617, term486617.getClass(), "characterLevel1", 0);
        setIntField(term486617, term486617.getClass(), "characterAwakening1", 0);
        setIntField(term486617, term486617.getClass(), "characterId2", 0);
        setIntField(term486617, term486617.getClass(), "characterLevel2", 0);
        setIntField(term486617, term486617.getClass(), "characterAwakening2", 0);
        setIntField(term486617, term486617.getClass(), "characterId3", 0);
        setIntField(term486617, term486617.getClass(), "characterLevel3", 0);
        setIntField(term486617, term486617.getClass(), "characterAwakening3", 0);
        setIntField(term486617, term486617.getClass(), "characterId4", 0);
        setIntField(term486617, term486617.getClass(), "characterLevel4", 0);
        setIntField(term486617, term486617.getClass(), "characterAwakening4", 0);
        setIntField(term486617, term486617.getClass(), "characterId5", 0);
        setIntField(term486617, term486617.getClass(), "characterLevel5", 0);
        setIntField(term486617, term486617.getClass(), "characterAwakening5", 0);
        setIntField(term486617, term486617.getClass(), "achievement", 0);
        setIntField(term486617, term486617.getClass(), "deluxscore", 0);
        setIntField(term486617, term486617.getClass(), "scoreRank", 0);
        setIntField(term486617, term486617.getClass(), "maxCombo", 0);
        setIntField(term486617, term486617.getClass(), "totalCombo", 0);
        setIntField(term486617, term486617.getClass(), "maxSync", 0);
        setIntField(term486617, term486617.getClass(), "totalSync", 0);
        setIntField(term486617, term486617.getClass(), "tapCriticalPerfect", 0);
        setIntField(term486617, term486617.getClass(), "tapPerfect", 0);
        setIntField(term486617, term486617.getClass(), "tapGreat", 0);
        setIntField(term486617, term486617.getClass(), "tapGood", 0);
        setIntField(term486617, term486617.getClass(), "tapMiss", 0);
        setIntField(term486617, term486617.getClass(), "holdCriticalPerfect", 0);
        setIntField(term486617, term486617.getClass(), "holdPerfect", 0);
        setIntField(term486617, term486617.getClass(), "holdGreat", 0);
        setIntField(term486617, term486617.getClass(), "holdGood", 0);
        setIntField(term486617, term486617.getClass(), "holdMiss", 0);
        setIntField(term486617, term486617.getClass(), "slideCriticalPerfect", 0);
        setIntField(term486617, term486617.getClass(), "slidePerfect", 0);
        setIntField(term486617, term486617.getClass(), "slideGreat", 0);
        setIntField(term486617, term486617.getClass(), "slideGood", 0);
        setIntField(term486617, term486617.getClass(), "slideMiss", 0);
        setIntField(term486617, term486617.getClass(), "touchCriticalPerfect", 0);
        setIntField(term486617, term486617.getClass(), "touchPerfect", 0);
        setIntField(term486617, term486617.getClass(), "touchGreat", 0);
        setIntField(term486617, term486617.getClass(), "touchGood", 0);
        setIntField(term486617, term486617.getClass(), "touchMiss", 0);
        setIntField(term486617, term486617.getClass(), "breakCriticalPerfect", 0);
        setIntField(term486617, term486617.getClass(), "breakPerfect", 0);
        setIntField(term486617, term486617.getClass(), "breakGreat", 0);
        setIntField(term486617, term486617.getClass(), "breakGood", 0);
        setIntField(term486617, term486617.getClass(), "breakMiss", 0);
        setBooleanField(term486617, term486617.getClass(), "isTap", false);
        setBooleanField(term486617, term486617.getClass(), "isHold", false);
        setBooleanField(term486617, term486617.getClass(), "isSlide", false);
        setBooleanField(term486617, term486617.getClass(), "isTouch", false);
        setBooleanField(term486617, term486617.getClass(), "isBreak", false);
        setBooleanField(term486617, term486617.getClass(), "isCriticalDisp", false);
        setBooleanField(term486617, term486617.getClass(), "isFastLateDisp", false);
        setIntField(term486617, term486617.getClass(), "fastCount", 0);
        setIntField(term486617, term486617.getClass(), "lateCount", 0);
        setBooleanField(term486617, term486617.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term486617, term486617.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term486617, term486617.getClass(), "comboStatus", 0);
        setIntField(term486617, term486617.getClass(), "syncStatus", 0);
        setBooleanField(term486617, term486617.getClass(), "isClear", false);
        setIntField(term486617, term486617.getClass(), "beforeRating", 0);
        setIntField(term486617, term486617.getClass(), "afterRating", 0);
        setIntField(term486617, term486617.getClass(), "beforeGrade", 0);
        setIntField(term486617, term486617.getClass(), "afterGrade", 0);
        setIntField(term486617, term486617.getClass(), "afterGradeRank", 0);
        setIntField(term486617, term486617.getClass(), "beforeDeluxRating", 0);
        setIntField(term486617, term486617.getClass(), "afterDeluxRating", 0);
        setBooleanField(term486617, term486617.getClass(), "isPlayTutorial", false);
        setBooleanField(term486617, term486617.getClass(), "isEventMode", false);
        setBooleanField(term486617, term486617.getClass(), "isFreedomMode", false);
        setIntField(term486617, term486617.getClass(), "playMode", 0);
        setBooleanField(term486617, term486617.getClass(), "isNewFree", false);
        setIntField(term486617, term486617.getClass(), "trialPlayAchievement", 0);
        setIntField(term486617, term486617.getClass(), "extNum1", 0);
        setIntField(term486617, term486617.getClass(), "extNum2", 0);
        term486717 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term486717;
        callMethod(klass, "setId", argTypes, term486617, args);
    }

};


