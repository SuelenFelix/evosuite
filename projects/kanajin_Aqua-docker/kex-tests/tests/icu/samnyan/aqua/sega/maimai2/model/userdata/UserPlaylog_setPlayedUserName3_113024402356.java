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

public class UserPlaylog_setPlayedUserName3_113024402356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term489561;

    public UserPlaylog_setPlayedUserName3_113024402356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term489561 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term489561, term489561.getClass(), "id", 0L);
        setField(term489561, term489561.getClass(), "user", null);
        setIntField(term489561, term489561.getClass(), "orderId", 0);
        setLongField(term489561, term489561.getClass(), "playlogId", 0L);
        setIntField(term489561, term489561.getClass(), "version", 0);
        setIntField(term489561, term489561.getClass(), "placeId", 0);
        setField(term489561, term489561.getClass(), "placeName", null);
        setLongField(term489561, term489561.getClass(), "loginDate", 0L);
        setField(term489561, term489561.getClass(), "playDate", null);
        setField(term489561, term489561.getClass(), "userPlayDate", null);
        setIntField(term489561, term489561.getClass(), "type", 0);
        setIntField(term489561, term489561.getClass(), "musicId", 0);
        setIntField(term489561, term489561.getClass(), "level", 0);
        setIntField(term489561, term489561.getClass(), "trackNo", 0);
        setIntField(term489561, term489561.getClass(), "vsMode", 0);
        setField(term489561, term489561.getClass(), "vsUserName", null);
        setIntField(term489561, term489561.getClass(), "vsStatus", 0);
        setIntField(term489561, term489561.getClass(), "vsUserRating", 0);
        setIntField(term489561, term489561.getClass(), "vsUserAchievement", 0);
        setIntField(term489561, term489561.getClass(), "vsUserGradeRank", 0);
        setIntField(term489561, term489561.getClass(), "vsRank", 0);
        setIntField(term489561, term489561.getClass(), "playerNum", 0);
        setLongField(term489561, term489561.getClass(), "playedUserId1", 0L);
        setField(term489561, term489561.getClass(), "playedUserName1", null);
        setIntField(term489561, term489561.getClass(), "playedMusicLevel1", 0);
        setLongField(term489561, term489561.getClass(), "playedUserId2", 0L);
        setField(term489561, term489561.getClass(), "playedUserName2", null);
        setIntField(term489561, term489561.getClass(), "playedMusicLevel2", 0);
        setLongField(term489561, term489561.getClass(), "playedUserId3", 0L);
        setField(term489561, term489561.getClass(), "playedUserName3", null);
        setIntField(term489561, term489561.getClass(), "playedMusicLevel3", 0);
        setIntField(term489561, term489561.getClass(), "characterId1", 0);
        setIntField(term489561, term489561.getClass(), "characterLevel1", 0);
        setIntField(term489561, term489561.getClass(), "characterAwakening1", 0);
        setIntField(term489561, term489561.getClass(), "characterId2", 0);
        setIntField(term489561, term489561.getClass(), "characterLevel2", 0);
        setIntField(term489561, term489561.getClass(), "characterAwakening2", 0);
        setIntField(term489561, term489561.getClass(), "characterId3", 0);
        setIntField(term489561, term489561.getClass(), "characterLevel3", 0);
        setIntField(term489561, term489561.getClass(), "characterAwakening3", 0);
        setIntField(term489561, term489561.getClass(), "characterId4", 0);
        setIntField(term489561, term489561.getClass(), "characterLevel4", 0);
        setIntField(term489561, term489561.getClass(), "characterAwakening4", 0);
        setIntField(term489561, term489561.getClass(), "characterId5", 0);
        setIntField(term489561, term489561.getClass(), "characterLevel5", 0);
        setIntField(term489561, term489561.getClass(), "characterAwakening5", 0);
        setIntField(term489561, term489561.getClass(), "achievement", 0);
        setIntField(term489561, term489561.getClass(), "deluxscore", 0);
        setIntField(term489561, term489561.getClass(), "scoreRank", 0);
        setIntField(term489561, term489561.getClass(), "maxCombo", 0);
        setIntField(term489561, term489561.getClass(), "totalCombo", 0);
        setIntField(term489561, term489561.getClass(), "maxSync", 0);
        setIntField(term489561, term489561.getClass(), "totalSync", 0);
        setIntField(term489561, term489561.getClass(), "tapCriticalPerfect", 0);
        setIntField(term489561, term489561.getClass(), "tapPerfect", 0);
        setIntField(term489561, term489561.getClass(), "tapGreat", 0);
        setIntField(term489561, term489561.getClass(), "tapGood", 0);
        setIntField(term489561, term489561.getClass(), "tapMiss", 0);
        setIntField(term489561, term489561.getClass(), "holdCriticalPerfect", 0);
        setIntField(term489561, term489561.getClass(), "holdPerfect", 0);
        setIntField(term489561, term489561.getClass(), "holdGreat", 0);
        setIntField(term489561, term489561.getClass(), "holdGood", 0);
        setIntField(term489561, term489561.getClass(), "holdMiss", 0);
        setIntField(term489561, term489561.getClass(), "slideCriticalPerfect", 0);
        setIntField(term489561, term489561.getClass(), "slidePerfect", 0);
        setIntField(term489561, term489561.getClass(), "slideGreat", 0);
        setIntField(term489561, term489561.getClass(), "slideGood", 0);
        setIntField(term489561, term489561.getClass(), "slideMiss", 0);
        setIntField(term489561, term489561.getClass(), "touchCriticalPerfect", 0);
        setIntField(term489561, term489561.getClass(), "touchPerfect", 0);
        setIntField(term489561, term489561.getClass(), "touchGreat", 0);
        setIntField(term489561, term489561.getClass(), "touchGood", 0);
        setIntField(term489561, term489561.getClass(), "touchMiss", 0);
        setIntField(term489561, term489561.getClass(), "breakCriticalPerfect", 0);
        setIntField(term489561, term489561.getClass(), "breakPerfect", 0);
        setIntField(term489561, term489561.getClass(), "breakGreat", 0);
        setIntField(term489561, term489561.getClass(), "breakGood", 0);
        setIntField(term489561, term489561.getClass(), "breakMiss", 0);
        setBooleanField(term489561, term489561.getClass(), "isTap", false);
        setBooleanField(term489561, term489561.getClass(), "isHold", false);
        setBooleanField(term489561, term489561.getClass(), "isSlide", false);
        setBooleanField(term489561, term489561.getClass(), "isTouch", false);
        setBooleanField(term489561, term489561.getClass(), "isBreak", false);
        setBooleanField(term489561, term489561.getClass(), "isCriticalDisp", false);
        setBooleanField(term489561, term489561.getClass(), "isFastLateDisp", false);
        setIntField(term489561, term489561.getClass(), "fastCount", 0);
        setIntField(term489561, term489561.getClass(), "lateCount", 0);
        setBooleanField(term489561, term489561.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term489561, term489561.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term489561, term489561.getClass(), "comboStatus", 0);
        setIntField(term489561, term489561.getClass(), "syncStatus", 0);
        setBooleanField(term489561, term489561.getClass(), "isClear", false);
        setIntField(term489561, term489561.getClass(), "beforeRating", 0);
        setIntField(term489561, term489561.getClass(), "afterRating", 0);
        setIntField(term489561, term489561.getClass(), "beforeGrade", 0);
        setIntField(term489561, term489561.getClass(), "afterGrade", 0);
        setIntField(term489561, term489561.getClass(), "afterGradeRank", 0);
        setIntField(term489561, term489561.getClass(), "beforeDeluxRating", 0);
        setIntField(term489561, term489561.getClass(), "afterDeluxRating", 0);
        setBooleanField(term489561, term489561.getClass(), "isPlayTutorial", false);
        setBooleanField(term489561, term489561.getClass(), "isEventMode", false);
        setBooleanField(term489561, term489561.getClass(), "isFreedomMode", false);
        setIntField(term489561, term489561.getClass(), "playMode", 0);
        setBooleanField(term489561, term489561.getClass(), "isNewFree", false);
        setIntField(term489561, term489561.getClass(), "trialPlayAchievement", 0);
        setIntField(term489561, term489561.getClass(), "extNum1", 0);
        setIntField(term489561, term489561.getClass(), "extNum2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlayedUserName3", argTypes, term489561, args);
    }

};


