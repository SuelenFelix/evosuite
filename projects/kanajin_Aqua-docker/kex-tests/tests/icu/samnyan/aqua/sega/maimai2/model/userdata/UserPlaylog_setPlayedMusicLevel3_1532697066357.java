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

public class UserPlaylog_setPlayedMusicLevel3_1532697066357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term489661;
     Object term489761;

    public UserPlaylog_setPlayedMusicLevel3_1532697066357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term489661 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term489661, term489661.getClass(), "id", 0L);
        setField(term489661, term489661.getClass(), "user", null);
        setIntField(term489661, term489661.getClass(), "orderId", 0);
        setLongField(term489661, term489661.getClass(), "playlogId", 0L);
        setIntField(term489661, term489661.getClass(), "version", 0);
        setIntField(term489661, term489661.getClass(), "placeId", 0);
        setField(term489661, term489661.getClass(), "placeName", null);
        setLongField(term489661, term489661.getClass(), "loginDate", 0L);
        setField(term489661, term489661.getClass(), "playDate", null);
        setField(term489661, term489661.getClass(), "userPlayDate", null);
        setIntField(term489661, term489661.getClass(), "type", 0);
        setIntField(term489661, term489661.getClass(), "musicId", 0);
        setIntField(term489661, term489661.getClass(), "level", 0);
        setIntField(term489661, term489661.getClass(), "trackNo", 0);
        setIntField(term489661, term489661.getClass(), "vsMode", 0);
        setField(term489661, term489661.getClass(), "vsUserName", null);
        setIntField(term489661, term489661.getClass(), "vsStatus", 0);
        setIntField(term489661, term489661.getClass(), "vsUserRating", 0);
        setIntField(term489661, term489661.getClass(), "vsUserAchievement", 0);
        setIntField(term489661, term489661.getClass(), "vsUserGradeRank", 0);
        setIntField(term489661, term489661.getClass(), "vsRank", 0);
        setIntField(term489661, term489661.getClass(), "playerNum", 0);
        setLongField(term489661, term489661.getClass(), "playedUserId1", 0L);
        setField(term489661, term489661.getClass(), "playedUserName1", null);
        setIntField(term489661, term489661.getClass(), "playedMusicLevel1", 0);
        setLongField(term489661, term489661.getClass(), "playedUserId2", 0L);
        setField(term489661, term489661.getClass(), "playedUserName2", null);
        setIntField(term489661, term489661.getClass(), "playedMusicLevel2", 0);
        setLongField(term489661, term489661.getClass(), "playedUserId3", 0L);
        setField(term489661, term489661.getClass(), "playedUserName3", null);
        setIntField(term489661, term489661.getClass(), "playedMusicLevel3", 0);
        setIntField(term489661, term489661.getClass(), "characterId1", 0);
        setIntField(term489661, term489661.getClass(), "characterLevel1", 0);
        setIntField(term489661, term489661.getClass(), "characterAwakening1", 0);
        setIntField(term489661, term489661.getClass(), "characterId2", 0);
        setIntField(term489661, term489661.getClass(), "characterLevel2", 0);
        setIntField(term489661, term489661.getClass(), "characterAwakening2", 0);
        setIntField(term489661, term489661.getClass(), "characterId3", 0);
        setIntField(term489661, term489661.getClass(), "characterLevel3", 0);
        setIntField(term489661, term489661.getClass(), "characterAwakening3", 0);
        setIntField(term489661, term489661.getClass(), "characterId4", 0);
        setIntField(term489661, term489661.getClass(), "characterLevel4", 0);
        setIntField(term489661, term489661.getClass(), "characterAwakening4", 0);
        setIntField(term489661, term489661.getClass(), "characterId5", 0);
        setIntField(term489661, term489661.getClass(), "characterLevel5", 0);
        setIntField(term489661, term489661.getClass(), "characterAwakening5", 0);
        setIntField(term489661, term489661.getClass(), "achievement", 0);
        setIntField(term489661, term489661.getClass(), "deluxscore", 0);
        setIntField(term489661, term489661.getClass(), "scoreRank", 0);
        setIntField(term489661, term489661.getClass(), "maxCombo", 0);
        setIntField(term489661, term489661.getClass(), "totalCombo", 0);
        setIntField(term489661, term489661.getClass(), "maxSync", 0);
        setIntField(term489661, term489661.getClass(), "totalSync", 0);
        setIntField(term489661, term489661.getClass(), "tapCriticalPerfect", 0);
        setIntField(term489661, term489661.getClass(), "tapPerfect", 0);
        setIntField(term489661, term489661.getClass(), "tapGreat", 0);
        setIntField(term489661, term489661.getClass(), "tapGood", 0);
        setIntField(term489661, term489661.getClass(), "tapMiss", 0);
        setIntField(term489661, term489661.getClass(), "holdCriticalPerfect", 0);
        setIntField(term489661, term489661.getClass(), "holdPerfect", 0);
        setIntField(term489661, term489661.getClass(), "holdGreat", 0);
        setIntField(term489661, term489661.getClass(), "holdGood", 0);
        setIntField(term489661, term489661.getClass(), "holdMiss", 0);
        setIntField(term489661, term489661.getClass(), "slideCriticalPerfect", 0);
        setIntField(term489661, term489661.getClass(), "slidePerfect", 0);
        setIntField(term489661, term489661.getClass(), "slideGreat", 0);
        setIntField(term489661, term489661.getClass(), "slideGood", 0);
        setIntField(term489661, term489661.getClass(), "slideMiss", 0);
        setIntField(term489661, term489661.getClass(), "touchCriticalPerfect", 0);
        setIntField(term489661, term489661.getClass(), "touchPerfect", 0);
        setIntField(term489661, term489661.getClass(), "touchGreat", 0);
        setIntField(term489661, term489661.getClass(), "touchGood", 0);
        setIntField(term489661, term489661.getClass(), "touchMiss", 0);
        setIntField(term489661, term489661.getClass(), "breakCriticalPerfect", 0);
        setIntField(term489661, term489661.getClass(), "breakPerfect", 0);
        setIntField(term489661, term489661.getClass(), "breakGreat", 0);
        setIntField(term489661, term489661.getClass(), "breakGood", 0);
        setIntField(term489661, term489661.getClass(), "breakMiss", 0);
        setBooleanField(term489661, term489661.getClass(), "isTap", false);
        setBooleanField(term489661, term489661.getClass(), "isHold", false);
        setBooleanField(term489661, term489661.getClass(), "isSlide", false);
        setBooleanField(term489661, term489661.getClass(), "isTouch", false);
        setBooleanField(term489661, term489661.getClass(), "isBreak", false);
        setBooleanField(term489661, term489661.getClass(), "isCriticalDisp", false);
        setBooleanField(term489661, term489661.getClass(), "isFastLateDisp", false);
        setIntField(term489661, term489661.getClass(), "fastCount", 0);
        setIntField(term489661, term489661.getClass(), "lateCount", 0);
        setBooleanField(term489661, term489661.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term489661, term489661.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term489661, term489661.getClass(), "comboStatus", 0);
        setIntField(term489661, term489661.getClass(), "syncStatus", 0);
        setBooleanField(term489661, term489661.getClass(), "isClear", false);
        setIntField(term489661, term489661.getClass(), "beforeRating", 0);
        setIntField(term489661, term489661.getClass(), "afterRating", 0);
        setIntField(term489661, term489661.getClass(), "beforeGrade", 0);
        setIntField(term489661, term489661.getClass(), "afterGrade", 0);
        setIntField(term489661, term489661.getClass(), "afterGradeRank", 0);
        setIntField(term489661, term489661.getClass(), "beforeDeluxRating", 0);
        setIntField(term489661, term489661.getClass(), "afterDeluxRating", 0);
        setBooleanField(term489661, term489661.getClass(), "isPlayTutorial", false);
        setBooleanField(term489661, term489661.getClass(), "isEventMode", false);
        setBooleanField(term489661, term489661.getClass(), "isFreedomMode", false);
        setIntField(term489661, term489661.getClass(), "playMode", 0);
        setBooleanField(term489661, term489661.getClass(), "isNewFree", false);
        setIntField(term489661, term489661.getClass(), "trialPlayAchievement", 0);
        setIntField(term489661, term489661.getClass(), "extNum1", 0);
        setIntField(term489661, term489661.getClass(), "extNum2", 0);
        term489761 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term489761;
        callMethod(klass, "setPlayedMusicLevel3", argTypes, term489661, args);
    }

};


