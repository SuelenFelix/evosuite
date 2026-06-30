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

public class UserPlaylog_setPlayedUserName1_113026324350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term488953;

    public UserPlaylog_setPlayedUserName1_113026324350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term488953 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term488953, term488953.getClass(), "id", 0L);
        setField(term488953, term488953.getClass(), "user", null);
        setIntField(term488953, term488953.getClass(), "orderId", 0);
        setLongField(term488953, term488953.getClass(), "playlogId", 0L);
        setIntField(term488953, term488953.getClass(), "version", 0);
        setIntField(term488953, term488953.getClass(), "placeId", 0);
        setField(term488953, term488953.getClass(), "placeName", null);
        setLongField(term488953, term488953.getClass(), "loginDate", 0L);
        setField(term488953, term488953.getClass(), "playDate", null);
        setField(term488953, term488953.getClass(), "userPlayDate", null);
        setIntField(term488953, term488953.getClass(), "type", 0);
        setIntField(term488953, term488953.getClass(), "musicId", 0);
        setIntField(term488953, term488953.getClass(), "level", 0);
        setIntField(term488953, term488953.getClass(), "trackNo", 0);
        setIntField(term488953, term488953.getClass(), "vsMode", 0);
        setField(term488953, term488953.getClass(), "vsUserName", null);
        setIntField(term488953, term488953.getClass(), "vsStatus", 0);
        setIntField(term488953, term488953.getClass(), "vsUserRating", 0);
        setIntField(term488953, term488953.getClass(), "vsUserAchievement", 0);
        setIntField(term488953, term488953.getClass(), "vsUserGradeRank", 0);
        setIntField(term488953, term488953.getClass(), "vsRank", 0);
        setIntField(term488953, term488953.getClass(), "playerNum", 0);
        setLongField(term488953, term488953.getClass(), "playedUserId1", 0L);
        setField(term488953, term488953.getClass(), "playedUserName1", null);
        setIntField(term488953, term488953.getClass(), "playedMusicLevel1", 0);
        setLongField(term488953, term488953.getClass(), "playedUserId2", 0L);
        setField(term488953, term488953.getClass(), "playedUserName2", null);
        setIntField(term488953, term488953.getClass(), "playedMusicLevel2", 0);
        setLongField(term488953, term488953.getClass(), "playedUserId3", 0L);
        setField(term488953, term488953.getClass(), "playedUserName3", null);
        setIntField(term488953, term488953.getClass(), "playedMusicLevel3", 0);
        setIntField(term488953, term488953.getClass(), "characterId1", 0);
        setIntField(term488953, term488953.getClass(), "characterLevel1", 0);
        setIntField(term488953, term488953.getClass(), "characterAwakening1", 0);
        setIntField(term488953, term488953.getClass(), "characterId2", 0);
        setIntField(term488953, term488953.getClass(), "characterLevel2", 0);
        setIntField(term488953, term488953.getClass(), "characterAwakening2", 0);
        setIntField(term488953, term488953.getClass(), "characterId3", 0);
        setIntField(term488953, term488953.getClass(), "characterLevel3", 0);
        setIntField(term488953, term488953.getClass(), "characterAwakening3", 0);
        setIntField(term488953, term488953.getClass(), "characterId4", 0);
        setIntField(term488953, term488953.getClass(), "characterLevel4", 0);
        setIntField(term488953, term488953.getClass(), "characterAwakening4", 0);
        setIntField(term488953, term488953.getClass(), "characterId5", 0);
        setIntField(term488953, term488953.getClass(), "characterLevel5", 0);
        setIntField(term488953, term488953.getClass(), "characterAwakening5", 0);
        setIntField(term488953, term488953.getClass(), "achievement", 0);
        setIntField(term488953, term488953.getClass(), "deluxscore", 0);
        setIntField(term488953, term488953.getClass(), "scoreRank", 0);
        setIntField(term488953, term488953.getClass(), "maxCombo", 0);
        setIntField(term488953, term488953.getClass(), "totalCombo", 0);
        setIntField(term488953, term488953.getClass(), "maxSync", 0);
        setIntField(term488953, term488953.getClass(), "totalSync", 0);
        setIntField(term488953, term488953.getClass(), "tapCriticalPerfect", 0);
        setIntField(term488953, term488953.getClass(), "tapPerfect", 0);
        setIntField(term488953, term488953.getClass(), "tapGreat", 0);
        setIntField(term488953, term488953.getClass(), "tapGood", 0);
        setIntField(term488953, term488953.getClass(), "tapMiss", 0);
        setIntField(term488953, term488953.getClass(), "holdCriticalPerfect", 0);
        setIntField(term488953, term488953.getClass(), "holdPerfect", 0);
        setIntField(term488953, term488953.getClass(), "holdGreat", 0);
        setIntField(term488953, term488953.getClass(), "holdGood", 0);
        setIntField(term488953, term488953.getClass(), "holdMiss", 0);
        setIntField(term488953, term488953.getClass(), "slideCriticalPerfect", 0);
        setIntField(term488953, term488953.getClass(), "slidePerfect", 0);
        setIntField(term488953, term488953.getClass(), "slideGreat", 0);
        setIntField(term488953, term488953.getClass(), "slideGood", 0);
        setIntField(term488953, term488953.getClass(), "slideMiss", 0);
        setIntField(term488953, term488953.getClass(), "touchCriticalPerfect", 0);
        setIntField(term488953, term488953.getClass(), "touchPerfect", 0);
        setIntField(term488953, term488953.getClass(), "touchGreat", 0);
        setIntField(term488953, term488953.getClass(), "touchGood", 0);
        setIntField(term488953, term488953.getClass(), "touchMiss", 0);
        setIntField(term488953, term488953.getClass(), "breakCriticalPerfect", 0);
        setIntField(term488953, term488953.getClass(), "breakPerfect", 0);
        setIntField(term488953, term488953.getClass(), "breakGreat", 0);
        setIntField(term488953, term488953.getClass(), "breakGood", 0);
        setIntField(term488953, term488953.getClass(), "breakMiss", 0);
        setBooleanField(term488953, term488953.getClass(), "isTap", false);
        setBooleanField(term488953, term488953.getClass(), "isHold", false);
        setBooleanField(term488953, term488953.getClass(), "isSlide", false);
        setBooleanField(term488953, term488953.getClass(), "isTouch", false);
        setBooleanField(term488953, term488953.getClass(), "isBreak", false);
        setBooleanField(term488953, term488953.getClass(), "isCriticalDisp", false);
        setBooleanField(term488953, term488953.getClass(), "isFastLateDisp", false);
        setIntField(term488953, term488953.getClass(), "fastCount", 0);
        setIntField(term488953, term488953.getClass(), "lateCount", 0);
        setBooleanField(term488953, term488953.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term488953, term488953.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term488953, term488953.getClass(), "comboStatus", 0);
        setIntField(term488953, term488953.getClass(), "syncStatus", 0);
        setBooleanField(term488953, term488953.getClass(), "isClear", false);
        setIntField(term488953, term488953.getClass(), "beforeRating", 0);
        setIntField(term488953, term488953.getClass(), "afterRating", 0);
        setIntField(term488953, term488953.getClass(), "beforeGrade", 0);
        setIntField(term488953, term488953.getClass(), "afterGrade", 0);
        setIntField(term488953, term488953.getClass(), "afterGradeRank", 0);
        setIntField(term488953, term488953.getClass(), "beforeDeluxRating", 0);
        setIntField(term488953, term488953.getClass(), "afterDeluxRating", 0);
        setBooleanField(term488953, term488953.getClass(), "isPlayTutorial", false);
        setBooleanField(term488953, term488953.getClass(), "isEventMode", false);
        setBooleanField(term488953, term488953.getClass(), "isFreedomMode", false);
        setIntField(term488953, term488953.getClass(), "playMode", 0);
        setBooleanField(term488953, term488953.getClass(), "isNewFree", false);
        setIntField(term488953, term488953.getClass(), "trialPlayAchievement", 0);
        setIntField(term488953, term488953.getClass(), "extNum1", 0);
        setIntField(term488953, term488953.getClass(), "extNum2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlayedUserName1", argTypes, term488953, args);
    }

};


