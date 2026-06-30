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

public class UserPlaylog_setAchievement_378501432373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term491293;
     Object term491393;

    public UserPlaylog_setAchievement_378501432373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term491293 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term491293, term491293.getClass(), "id", 0L);
        setField(term491293, term491293.getClass(), "user", null);
        setIntField(term491293, term491293.getClass(), "orderId", 0);
        setLongField(term491293, term491293.getClass(), "playlogId", 0L);
        setIntField(term491293, term491293.getClass(), "version", 0);
        setIntField(term491293, term491293.getClass(), "placeId", 0);
        setField(term491293, term491293.getClass(), "placeName", null);
        setLongField(term491293, term491293.getClass(), "loginDate", 0L);
        setField(term491293, term491293.getClass(), "playDate", null);
        setField(term491293, term491293.getClass(), "userPlayDate", null);
        setIntField(term491293, term491293.getClass(), "type", 0);
        setIntField(term491293, term491293.getClass(), "musicId", 0);
        setIntField(term491293, term491293.getClass(), "level", 0);
        setIntField(term491293, term491293.getClass(), "trackNo", 0);
        setIntField(term491293, term491293.getClass(), "vsMode", 0);
        setField(term491293, term491293.getClass(), "vsUserName", null);
        setIntField(term491293, term491293.getClass(), "vsStatus", 0);
        setIntField(term491293, term491293.getClass(), "vsUserRating", 0);
        setIntField(term491293, term491293.getClass(), "vsUserAchievement", 0);
        setIntField(term491293, term491293.getClass(), "vsUserGradeRank", 0);
        setIntField(term491293, term491293.getClass(), "vsRank", 0);
        setIntField(term491293, term491293.getClass(), "playerNum", 0);
        setLongField(term491293, term491293.getClass(), "playedUserId1", 0L);
        setField(term491293, term491293.getClass(), "playedUserName1", null);
        setIntField(term491293, term491293.getClass(), "playedMusicLevel1", 0);
        setLongField(term491293, term491293.getClass(), "playedUserId2", 0L);
        setField(term491293, term491293.getClass(), "playedUserName2", null);
        setIntField(term491293, term491293.getClass(), "playedMusicLevel2", 0);
        setLongField(term491293, term491293.getClass(), "playedUserId3", 0L);
        setField(term491293, term491293.getClass(), "playedUserName3", null);
        setIntField(term491293, term491293.getClass(), "playedMusicLevel3", 0);
        setIntField(term491293, term491293.getClass(), "characterId1", 0);
        setIntField(term491293, term491293.getClass(), "characterLevel1", 0);
        setIntField(term491293, term491293.getClass(), "characterAwakening1", 0);
        setIntField(term491293, term491293.getClass(), "characterId2", 0);
        setIntField(term491293, term491293.getClass(), "characterLevel2", 0);
        setIntField(term491293, term491293.getClass(), "characterAwakening2", 0);
        setIntField(term491293, term491293.getClass(), "characterId3", 0);
        setIntField(term491293, term491293.getClass(), "characterLevel3", 0);
        setIntField(term491293, term491293.getClass(), "characterAwakening3", 0);
        setIntField(term491293, term491293.getClass(), "characterId4", 0);
        setIntField(term491293, term491293.getClass(), "characterLevel4", 0);
        setIntField(term491293, term491293.getClass(), "characterAwakening4", 0);
        setIntField(term491293, term491293.getClass(), "characterId5", 0);
        setIntField(term491293, term491293.getClass(), "characterLevel5", 0);
        setIntField(term491293, term491293.getClass(), "characterAwakening5", 0);
        setIntField(term491293, term491293.getClass(), "achievement", 0);
        setIntField(term491293, term491293.getClass(), "deluxscore", 0);
        setIntField(term491293, term491293.getClass(), "scoreRank", 0);
        setIntField(term491293, term491293.getClass(), "maxCombo", 0);
        setIntField(term491293, term491293.getClass(), "totalCombo", 0);
        setIntField(term491293, term491293.getClass(), "maxSync", 0);
        setIntField(term491293, term491293.getClass(), "totalSync", 0);
        setIntField(term491293, term491293.getClass(), "tapCriticalPerfect", 0);
        setIntField(term491293, term491293.getClass(), "tapPerfect", 0);
        setIntField(term491293, term491293.getClass(), "tapGreat", 0);
        setIntField(term491293, term491293.getClass(), "tapGood", 0);
        setIntField(term491293, term491293.getClass(), "tapMiss", 0);
        setIntField(term491293, term491293.getClass(), "holdCriticalPerfect", 0);
        setIntField(term491293, term491293.getClass(), "holdPerfect", 0);
        setIntField(term491293, term491293.getClass(), "holdGreat", 0);
        setIntField(term491293, term491293.getClass(), "holdGood", 0);
        setIntField(term491293, term491293.getClass(), "holdMiss", 0);
        setIntField(term491293, term491293.getClass(), "slideCriticalPerfect", 0);
        setIntField(term491293, term491293.getClass(), "slidePerfect", 0);
        setIntField(term491293, term491293.getClass(), "slideGreat", 0);
        setIntField(term491293, term491293.getClass(), "slideGood", 0);
        setIntField(term491293, term491293.getClass(), "slideMiss", 0);
        setIntField(term491293, term491293.getClass(), "touchCriticalPerfect", 0);
        setIntField(term491293, term491293.getClass(), "touchPerfect", 0);
        setIntField(term491293, term491293.getClass(), "touchGreat", 0);
        setIntField(term491293, term491293.getClass(), "touchGood", 0);
        setIntField(term491293, term491293.getClass(), "touchMiss", 0);
        setIntField(term491293, term491293.getClass(), "breakCriticalPerfect", 0);
        setIntField(term491293, term491293.getClass(), "breakPerfect", 0);
        setIntField(term491293, term491293.getClass(), "breakGreat", 0);
        setIntField(term491293, term491293.getClass(), "breakGood", 0);
        setIntField(term491293, term491293.getClass(), "breakMiss", 0);
        setBooleanField(term491293, term491293.getClass(), "isTap", false);
        setBooleanField(term491293, term491293.getClass(), "isHold", false);
        setBooleanField(term491293, term491293.getClass(), "isSlide", false);
        setBooleanField(term491293, term491293.getClass(), "isTouch", false);
        setBooleanField(term491293, term491293.getClass(), "isBreak", false);
        setBooleanField(term491293, term491293.getClass(), "isCriticalDisp", false);
        setBooleanField(term491293, term491293.getClass(), "isFastLateDisp", false);
        setIntField(term491293, term491293.getClass(), "fastCount", 0);
        setIntField(term491293, term491293.getClass(), "lateCount", 0);
        setBooleanField(term491293, term491293.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term491293, term491293.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term491293, term491293.getClass(), "comboStatus", 0);
        setIntField(term491293, term491293.getClass(), "syncStatus", 0);
        setBooleanField(term491293, term491293.getClass(), "isClear", false);
        setIntField(term491293, term491293.getClass(), "beforeRating", 0);
        setIntField(term491293, term491293.getClass(), "afterRating", 0);
        setIntField(term491293, term491293.getClass(), "beforeGrade", 0);
        setIntField(term491293, term491293.getClass(), "afterGrade", 0);
        setIntField(term491293, term491293.getClass(), "afterGradeRank", 0);
        setIntField(term491293, term491293.getClass(), "beforeDeluxRating", 0);
        setIntField(term491293, term491293.getClass(), "afterDeluxRating", 0);
        setBooleanField(term491293, term491293.getClass(), "isPlayTutorial", false);
        setBooleanField(term491293, term491293.getClass(), "isEventMode", false);
        setBooleanField(term491293, term491293.getClass(), "isFreedomMode", false);
        setIntField(term491293, term491293.getClass(), "playMode", 0);
        setBooleanField(term491293, term491293.getClass(), "isNewFree", false);
        setIntField(term491293, term491293.getClass(), "trialPlayAchievement", 0);
        setIntField(term491293, term491293.getClass(), "extNum1", 0);
        setIntField(term491293, term491293.getClass(), "extNum2", 0);
        term491393 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term491393;
        callMethod(klass, "setAchievement", argTypes, term491293, args);
    }

};


