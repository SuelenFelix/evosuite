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

public class UserPlaylog_setPlayedMusicLevel1_1532695144351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term489053;
     Object term489153;

    public UserPlaylog_setPlayedMusicLevel1_1532695144351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term489053 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term489053, term489053.getClass(), "id", 0L);
        setField(term489053, term489053.getClass(), "user", null);
        setIntField(term489053, term489053.getClass(), "orderId", 0);
        setLongField(term489053, term489053.getClass(), "playlogId", 0L);
        setIntField(term489053, term489053.getClass(), "version", 0);
        setIntField(term489053, term489053.getClass(), "placeId", 0);
        setField(term489053, term489053.getClass(), "placeName", null);
        setLongField(term489053, term489053.getClass(), "loginDate", 0L);
        setField(term489053, term489053.getClass(), "playDate", null);
        setField(term489053, term489053.getClass(), "userPlayDate", null);
        setIntField(term489053, term489053.getClass(), "type", 0);
        setIntField(term489053, term489053.getClass(), "musicId", 0);
        setIntField(term489053, term489053.getClass(), "level", 0);
        setIntField(term489053, term489053.getClass(), "trackNo", 0);
        setIntField(term489053, term489053.getClass(), "vsMode", 0);
        setField(term489053, term489053.getClass(), "vsUserName", null);
        setIntField(term489053, term489053.getClass(), "vsStatus", 0);
        setIntField(term489053, term489053.getClass(), "vsUserRating", 0);
        setIntField(term489053, term489053.getClass(), "vsUserAchievement", 0);
        setIntField(term489053, term489053.getClass(), "vsUserGradeRank", 0);
        setIntField(term489053, term489053.getClass(), "vsRank", 0);
        setIntField(term489053, term489053.getClass(), "playerNum", 0);
        setLongField(term489053, term489053.getClass(), "playedUserId1", 0L);
        setField(term489053, term489053.getClass(), "playedUserName1", null);
        setIntField(term489053, term489053.getClass(), "playedMusicLevel1", 0);
        setLongField(term489053, term489053.getClass(), "playedUserId2", 0L);
        setField(term489053, term489053.getClass(), "playedUserName2", null);
        setIntField(term489053, term489053.getClass(), "playedMusicLevel2", 0);
        setLongField(term489053, term489053.getClass(), "playedUserId3", 0L);
        setField(term489053, term489053.getClass(), "playedUserName3", null);
        setIntField(term489053, term489053.getClass(), "playedMusicLevel3", 0);
        setIntField(term489053, term489053.getClass(), "characterId1", 0);
        setIntField(term489053, term489053.getClass(), "characterLevel1", 0);
        setIntField(term489053, term489053.getClass(), "characterAwakening1", 0);
        setIntField(term489053, term489053.getClass(), "characterId2", 0);
        setIntField(term489053, term489053.getClass(), "characterLevel2", 0);
        setIntField(term489053, term489053.getClass(), "characterAwakening2", 0);
        setIntField(term489053, term489053.getClass(), "characterId3", 0);
        setIntField(term489053, term489053.getClass(), "characterLevel3", 0);
        setIntField(term489053, term489053.getClass(), "characterAwakening3", 0);
        setIntField(term489053, term489053.getClass(), "characterId4", 0);
        setIntField(term489053, term489053.getClass(), "characterLevel4", 0);
        setIntField(term489053, term489053.getClass(), "characterAwakening4", 0);
        setIntField(term489053, term489053.getClass(), "characterId5", 0);
        setIntField(term489053, term489053.getClass(), "characterLevel5", 0);
        setIntField(term489053, term489053.getClass(), "characterAwakening5", 0);
        setIntField(term489053, term489053.getClass(), "achievement", 0);
        setIntField(term489053, term489053.getClass(), "deluxscore", 0);
        setIntField(term489053, term489053.getClass(), "scoreRank", 0);
        setIntField(term489053, term489053.getClass(), "maxCombo", 0);
        setIntField(term489053, term489053.getClass(), "totalCombo", 0);
        setIntField(term489053, term489053.getClass(), "maxSync", 0);
        setIntField(term489053, term489053.getClass(), "totalSync", 0);
        setIntField(term489053, term489053.getClass(), "tapCriticalPerfect", 0);
        setIntField(term489053, term489053.getClass(), "tapPerfect", 0);
        setIntField(term489053, term489053.getClass(), "tapGreat", 0);
        setIntField(term489053, term489053.getClass(), "tapGood", 0);
        setIntField(term489053, term489053.getClass(), "tapMiss", 0);
        setIntField(term489053, term489053.getClass(), "holdCriticalPerfect", 0);
        setIntField(term489053, term489053.getClass(), "holdPerfect", 0);
        setIntField(term489053, term489053.getClass(), "holdGreat", 0);
        setIntField(term489053, term489053.getClass(), "holdGood", 0);
        setIntField(term489053, term489053.getClass(), "holdMiss", 0);
        setIntField(term489053, term489053.getClass(), "slideCriticalPerfect", 0);
        setIntField(term489053, term489053.getClass(), "slidePerfect", 0);
        setIntField(term489053, term489053.getClass(), "slideGreat", 0);
        setIntField(term489053, term489053.getClass(), "slideGood", 0);
        setIntField(term489053, term489053.getClass(), "slideMiss", 0);
        setIntField(term489053, term489053.getClass(), "touchCriticalPerfect", 0);
        setIntField(term489053, term489053.getClass(), "touchPerfect", 0);
        setIntField(term489053, term489053.getClass(), "touchGreat", 0);
        setIntField(term489053, term489053.getClass(), "touchGood", 0);
        setIntField(term489053, term489053.getClass(), "touchMiss", 0);
        setIntField(term489053, term489053.getClass(), "breakCriticalPerfect", 0);
        setIntField(term489053, term489053.getClass(), "breakPerfect", 0);
        setIntField(term489053, term489053.getClass(), "breakGreat", 0);
        setIntField(term489053, term489053.getClass(), "breakGood", 0);
        setIntField(term489053, term489053.getClass(), "breakMiss", 0);
        setBooleanField(term489053, term489053.getClass(), "isTap", false);
        setBooleanField(term489053, term489053.getClass(), "isHold", false);
        setBooleanField(term489053, term489053.getClass(), "isSlide", false);
        setBooleanField(term489053, term489053.getClass(), "isTouch", false);
        setBooleanField(term489053, term489053.getClass(), "isBreak", false);
        setBooleanField(term489053, term489053.getClass(), "isCriticalDisp", false);
        setBooleanField(term489053, term489053.getClass(), "isFastLateDisp", false);
        setIntField(term489053, term489053.getClass(), "fastCount", 0);
        setIntField(term489053, term489053.getClass(), "lateCount", 0);
        setBooleanField(term489053, term489053.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term489053, term489053.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term489053, term489053.getClass(), "comboStatus", 0);
        setIntField(term489053, term489053.getClass(), "syncStatus", 0);
        setBooleanField(term489053, term489053.getClass(), "isClear", false);
        setIntField(term489053, term489053.getClass(), "beforeRating", 0);
        setIntField(term489053, term489053.getClass(), "afterRating", 0);
        setIntField(term489053, term489053.getClass(), "beforeGrade", 0);
        setIntField(term489053, term489053.getClass(), "afterGrade", 0);
        setIntField(term489053, term489053.getClass(), "afterGradeRank", 0);
        setIntField(term489053, term489053.getClass(), "beforeDeluxRating", 0);
        setIntField(term489053, term489053.getClass(), "afterDeluxRating", 0);
        setBooleanField(term489053, term489053.getClass(), "isPlayTutorial", false);
        setBooleanField(term489053, term489053.getClass(), "isEventMode", false);
        setBooleanField(term489053, term489053.getClass(), "isFreedomMode", false);
        setIntField(term489053, term489053.getClass(), "playMode", 0);
        setBooleanField(term489053, term489053.getClass(), "isNewFree", false);
        setIntField(term489053, term489053.getClass(), "trialPlayAchievement", 0);
        setIntField(term489053, term489053.getClass(), "extNum1", 0);
        setIntField(term489053, term489053.getClass(), "extNum2", 0);
        term489153 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term489153;
        callMethod(klass, "setPlayedMusicLevel1", argTypes, term489053, args);
    }

};


