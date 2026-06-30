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
import java.lang.Boolean;

public class UserPlaylog_setAchieveNewRecord_687895021414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term495475;
     Object term495575;

    public UserPlaylog_setAchieveNewRecord_687895021414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term495475 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term495475, term495475.getClass(), "id", 0L);
        setField(term495475, term495475.getClass(), "user", null);
        setIntField(term495475, term495475.getClass(), "orderId", 0);
        setLongField(term495475, term495475.getClass(), "playlogId", 0L);
        setIntField(term495475, term495475.getClass(), "version", 0);
        setIntField(term495475, term495475.getClass(), "placeId", 0);
        setField(term495475, term495475.getClass(), "placeName", null);
        setLongField(term495475, term495475.getClass(), "loginDate", 0L);
        setField(term495475, term495475.getClass(), "playDate", null);
        setField(term495475, term495475.getClass(), "userPlayDate", null);
        setIntField(term495475, term495475.getClass(), "type", 0);
        setIntField(term495475, term495475.getClass(), "musicId", 0);
        setIntField(term495475, term495475.getClass(), "level", 0);
        setIntField(term495475, term495475.getClass(), "trackNo", 0);
        setIntField(term495475, term495475.getClass(), "vsMode", 0);
        setField(term495475, term495475.getClass(), "vsUserName", null);
        setIntField(term495475, term495475.getClass(), "vsStatus", 0);
        setIntField(term495475, term495475.getClass(), "vsUserRating", 0);
        setIntField(term495475, term495475.getClass(), "vsUserAchievement", 0);
        setIntField(term495475, term495475.getClass(), "vsUserGradeRank", 0);
        setIntField(term495475, term495475.getClass(), "vsRank", 0);
        setIntField(term495475, term495475.getClass(), "playerNum", 0);
        setLongField(term495475, term495475.getClass(), "playedUserId1", 0L);
        setField(term495475, term495475.getClass(), "playedUserName1", null);
        setIntField(term495475, term495475.getClass(), "playedMusicLevel1", 0);
        setLongField(term495475, term495475.getClass(), "playedUserId2", 0L);
        setField(term495475, term495475.getClass(), "playedUserName2", null);
        setIntField(term495475, term495475.getClass(), "playedMusicLevel2", 0);
        setLongField(term495475, term495475.getClass(), "playedUserId3", 0L);
        setField(term495475, term495475.getClass(), "playedUserName3", null);
        setIntField(term495475, term495475.getClass(), "playedMusicLevel3", 0);
        setIntField(term495475, term495475.getClass(), "characterId1", 0);
        setIntField(term495475, term495475.getClass(), "characterLevel1", 0);
        setIntField(term495475, term495475.getClass(), "characterAwakening1", 0);
        setIntField(term495475, term495475.getClass(), "characterId2", 0);
        setIntField(term495475, term495475.getClass(), "characterLevel2", 0);
        setIntField(term495475, term495475.getClass(), "characterAwakening2", 0);
        setIntField(term495475, term495475.getClass(), "characterId3", 0);
        setIntField(term495475, term495475.getClass(), "characterLevel3", 0);
        setIntField(term495475, term495475.getClass(), "characterAwakening3", 0);
        setIntField(term495475, term495475.getClass(), "characterId4", 0);
        setIntField(term495475, term495475.getClass(), "characterLevel4", 0);
        setIntField(term495475, term495475.getClass(), "characterAwakening4", 0);
        setIntField(term495475, term495475.getClass(), "characterId5", 0);
        setIntField(term495475, term495475.getClass(), "characterLevel5", 0);
        setIntField(term495475, term495475.getClass(), "characterAwakening5", 0);
        setIntField(term495475, term495475.getClass(), "achievement", 0);
        setIntField(term495475, term495475.getClass(), "deluxscore", 0);
        setIntField(term495475, term495475.getClass(), "scoreRank", 0);
        setIntField(term495475, term495475.getClass(), "maxCombo", 0);
        setIntField(term495475, term495475.getClass(), "totalCombo", 0);
        setIntField(term495475, term495475.getClass(), "maxSync", 0);
        setIntField(term495475, term495475.getClass(), "totalSync", 0);
        setIntField(term495475, term495475.getClass(), "tapCriticalPerfect", 0);
        setIntField(term495475, term495475.getClass(), "tapPerfect", 0);
        setIntField(term495475, term495475.getClass(), "tapGreat", 0);
        setIntField(term495475, term495475.getClass(), "tapGood", 0);
        setIntField(term495475, term495475.getClass(), "tapMiss", 0);
        setIntField(term495475, term495475.getClass(), "holdCriticalPerfect", 0);
        setIntField(term495475, term495475.getClass(), "holdPerfect", 0);
        setIntField(term495475, term495475.getClass(), "holdGreat", 0);
        setIntField(term495475, term495475.getClass(), "holdGood", 0);
        setIntField(term495475, term495475.getClass(), "holdMiss", 0);
        setIntField(term495475, term495475.getClass(), "slideCriticalPerfect", 0);
        setIntField(term495475, term495475.getClass(), "slidePerfect", 0);
        setIntField(term495475, term495475.getClass(), "slideGreat", 0);
        setIntField(term495475, term495475.getClass(), "slideGood", 0);
        setIntField(term495475, term495475.getClass(), "slideMiss", 0);
        setIntField(term495475, term495475.getClass(), "touchCriticalPerfect", 0);
        setIntField(term495475, term495475.getClass(), "touchPerfect", 0);
        setIntField(term495475, term495475.getClass(), "touchGreat", 0);
        setIntField(term495475, term495475.getClass(), "touchGood", 0);
        setIntField(term495475, term495475.getClass(), "touchMiss", 0);
        setIntField(term495475, term495475.getClass(), "breakCriticalPerfect", 0);
        setIntField(term495475, term495475.getClass(), "breakPerfect", 0);
        setIntField(term495475, term495475.getClass(), "breakGreat", 0);
        setIntField(term495475, term495475.getClass(), "breakGood", 0);
        setIntField(term495475, term495475.getClass(), "breakMiss", 0);
        setBooleanField(term495475, term495475.getClass(), "isTap", false);
        setBooleanField(term495475, term495475.getClass(), "isHold", false);
        setBooleanField(term495475, term495475.getClass(), "isSlide", false);
        setBooleanField(term495475, term495475.getClass(), "isTouch", false);
        setBooleanField(term495475, term495475.getClass(), "isBreak", false);
        setBooleanField(term495475, term495475.getClass(), "isCriticalDisp", false);
        setBooleanField(term495475, term495475.getClass(), "isFastLateDisp", false);
        setIntField(term495475, term495475.getClass(), "fastCount", 0);
        setIntField(term495475, term495475.getClass(), "lateCount", 0);
        setBooleanField(term495475, term495475.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term495475, term495475.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term495475, term495475.getClass(), "comboStatus", 0);
        setIntField(term495475, term495475.getClass(), "syncStatus", 0);
        setBooleanField(term495475, term495475.getClass(), "isClear", false);
        setIntField(term495475, term495475.getClass(), "beforeRating", 0);
        setIntField(term495475, term495475.getClass(), "afterRating", 0);
        setIntField(term495475, term495475.getClass(), "beforeGrade", 0);
        setIntField(term495475, term495475.getClass(), "afterGrade", 0);
        setIntField(term495475, term495475.getClass(), "afterGradeRank", 0);
        setIntField(term495475, term495475.getClass(), "beforeDeluxRating", 0);
        setIntField(term495475, term495475.getClass(), "afterDeluxRating", 0);
        setBooleanField(term495475, term495475.getClass(), "isPlayTutorial", false);
        setBooleanField(term495475, term495475.getClass(), "isEventMode", false);
        setBooleanField(term495475, term495475.getClass(), "isFreedomMode", false);
        setIntField(term495475, term495475.getClass(), "playMode", 0);
        setBooleanField(term495475, term495475.getClass(), "isNewFree", false);
        setIntField(term495475, term495475.getClass(), "trialPlayAchievement", 0);
        setIntField(term495475, term495475.getClass(), "extNum1", 0);
        setIntField(term495475, term495475.getClass(), "extNum2", 0);
        term495575 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term495575;
        callMethod(klass, "setAchieveNewRecord", argTypes, term495475, args);
    }

};


