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

public class UserPlaylog_setSlidePerfect_792414679391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term493129;
     Object term493229;

    public UserPlaylog_setSlidePerfect_792414679391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term493129 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term493129, term493129.getClass(), "id", 0L);
        setField(term493129, term493129.getClass(), "user", null);
        setIntField(term493129, term493129.getClass(), "orderId", 0);
        setLongField(term493129, term493129.getClass(), "playlogId", 0L);
        setIntField(term493129, term493129.getClass(), "version", 0);
        setIntField(term493129, term493129.getClass(), "placeId", 0);
        setField(term493129, term493129.getClass(), "placeName", null);
        setLongField(term493129, term493129.getClass(), "loginDate", 0L);
        setField(term493129, term493129.getClass(), "playDate", null);
        setField(term493129, term493129.getClass(), "userPlayDate", null);
        setIntField(term493129, term493129.getClass(), "type", 0);
        setIntField(term493129, term493129.getClass(), "musicId", 0);
        setIntField(term493129, term493129.getClass(), "level", 0);
        setIntField(term493129, term493129.getClass(), "trackNo", 0);
        setIntField(term493129, term493129.getClass(), "vsMode", 0);
        setField(term493129, term493129.getClass(), "vsUserName", null);
        setIntField(term493129, term493129.getClass(), "vsStatus", 0);
        setIntField(term493129, term493129.getClass(), "vsUserRating", 0);
        setIntField(term493129, term493129.getClass(), "vsUserAchievement", 0);
        setIntField(term493129, term493129.getClass(), "vsUserGradeRank", 0);
        setIntField(term493129, term493129.getClass(), "vsRank", 0);
        setIntField(term493129, term493129.getClass(), "playerNum", 0);
        setLongField(term493129, term493129.getClass(), "playedUserId1", 0L);
        setField(term493129, term493129.getClass(), "playedUserName1", null);
        setIntField(term493129, term493129.getClass(), "playedMusicLevel1", 0);
        setLongField(term493129, term493129.getClass(), "playedUserId2", 0L);
        setField(term493129, term493129.getClass(), "playedUserName2", null);
        setIntField(term493129, term493129.getClass(), "playedMusicLevel2", 0);
        setLongField(term493129, term493129.getClass(), "playedUserId3", 0L);
        setField(term493129, term493129.getClass(), "playedUserName3", null);
        setIntField(term493129, term493129.getClass(), "playedMusicLevel3", 0);
        setIntField(term493129, term493129.getClass(), "characterId1", 0);
        setIntField(term493129, term493129.getClass(), "characterLevel1", 0);
        setIntField(term493129, term493129.getClass(), "characterAwakening1", 0);
        setIntField(term493129, term493129.getClass(), "characterId2", 0);
        setIntField(term493129, term493129.getClass(), "characterLevel2", 0);
        setIntField(term493129, term493129.getClass(), "characterAwakening2", 0);
        setIntField(term493129, term493129.getClass(), "characterId3", 0);
        setIntField(term493129, term493129.getClass(), "characterLevel3", 0);
        setIntField(term493129, term493129.getClass(), "characterAwakening3", 0);
        setIntField(term493129, term493129.getClass(), "characterId4", 0);
        setIntField(term493129, term493129.getClass(), "characterLevel4", 0);
        setIntField(term493129, term493129.getClass(), "characterAwakening4", 0);
        setIntField(term493129, term493129.getClass(), "characterId5", 0);
        setIntField(term493129, term493129.getClass(), "characterLevel5", 0);
        setIntField(term493129, term493129.getClass(), "characterAwakening5", 0);
        setIntField(term493129, term493129.getClass(), "achievement", 0);
        setIntField(term493129, term493129.getClass(), "deluxscore", 0);
        setIntField(term493129, term493129.getClass(), "scoreRank", 0);
        setIntField(term493129, term493129.getClass(), "maxCombo", 0);
        setIntField(term493129, term493129.getClass(), "totalCombo", 0);
        setIntField(term493129, term493129.getClass(), "maxSync", 0);
        setIntField(term493129, term493129.getClass(), "totalSync", 0);
        setIntField(term493129, term493129.getClass(), "tapCriticalPerfect", 0);
        setIntField(term493129, term493129.getClass(), "tapPerfect", 0);
        setIntField(term493129, term493129.getClass(), "tapGreat", 0);
        setIntField(term493129, term493129.getClass(), "tapGood", 0);
        setIntField(term493129, term493129.getClass(), "tapMiss", 0);
        setIntField(term493129, term493129.getClass(), "holdCriticalPerfect", 0);
        setIntField(term493129, term493129.getClass(), "holdPerfect", 0);
        setIntField(term493129, term493129.getClass(), "holdGreat", 0);
        setIntField(term493129, term493129.getClass(), "holdGood", 0);
        setIntField(term493129, term493129.getClass(), "holdMiss", 0);
        setIntField(term493129, term493129.getClass(), "slideCriticalPerfect", 0);
        setIntField(term493129, term493129.getClass(), "slidePerfect", 0);
        setIntField(term493129, term493129.getClass(), "slideGreat", 0);
        setIntField(term493129, term493129.getClass(), "slideGood", 0);
        setIntField(term493129, term493129.getClass(), "slideMiss", 0);
        setIntField(term493129, term493129.getClass(), "touchCriticalPerfect", 0);
        setIntField(term493129, term493129.getClass(), "touchPerfect", 0);
        setIntField(term493129, term493129.getClass(), "touchGreat", 0);
        setIntField(term493129, term493129.getClass(), "touchGood", 0);
        setIntField(term493129, term493129.getClass(), "touchMiss", 0);
        setIntField(term493129, term493129.getClass(), "breakCriticalPerfect", 0);
        setIntField(term493129, term493129.getClass(), "breakPerfect", 0);
        setIntField(term493129, term493129.getClass(), "breakGreat", 0);
        setIntField(term493129, term493129.getClass(), "breakGood", 0);
        setIntField(term493129, term493129.getClass(), "breakMiss", 0);
        setBooleanField(term493129, term493129.getClass(), "isTap", false);
        setBooleanField(term493129, term493129.getClass(), "isHold", false);
        setBooleanField(term493129, term493129.getClass(), "isSlide", false);
        setBooleanField(term493129, term493129.getClass(), "isTouch", false);
        setBooleanField(term493129, term493129.getClass(), "isBreak", false);
        setBooleanField(term493129, term493129.getClass(), "isCriticalDisp", false);
        setBooleanField(term493129, term493129.getClass(), "isFastLateDisp", false);
        setIntField(term493129, term493129.getClass(), "fastCount", 0);
        setIntField(term493129, term493129.getClass(), "lateCount", 0);
        setBooleanField(term493129, term493129.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term493129, term493129.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term493129, term493129.getClass(), "comboStatus", 0);
        setIntField(term493129, term493129.getClass(), "syncStatus", 0);
        setBooleanField(term493129, term493129.getClass(), "isClear", false);
        setIntField(term493129, term493129.getClass(), "beforeRating", 0);
        setIntField(term493129, term493129.getClass(), "afterRating", 0);
        setIntField(term493129, term493129.getClass(), "beforeGrade", 0);
        setIntField(term493129, term493129.getClass(), "afterGrade", 0);
        setIntField(term493129, term493129.getClass(), "afterGradeRank", 0);
        setIntField(term493129, term493129.getClass(), "beforeDeluxRating", 0);
        setIntField(term493129, term493129.getClass(), "afterDeluxRating", 0);
        setBooleanField(term493129, term493129.getClass(), "isPlayTutorial", false);
        setBooleanField(term493129, term493129.getClass(), "isEventMode", false);
        setBooleanField(term493129, term493129.getClass(), "isFreedomMode", false);
        setIntField(term493129, term493129.getClass(), "playMode", 0);
        setBooleanField(term493129, term493129.getClass(), "isNewFree", false);
        setIntField(term493129, term493129.getClass(), "trialPlayAchievement", 0);
        setIntField(term493129, term493129.getClass(), "extNum1", 0);
        setIntField(term493129, term493129.getClass(), "extNum2", 0);
        term493229 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term493229;
        callMethod(klass, "setSlidePerfect", argTypes, term493129, args);
    }

};


