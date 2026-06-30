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

public class UserPlaylog_setCharacterAwakening1_47357738360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term489967;
     Object term490067;

    public UserPlaylog_setCharacterAwakening1_47357738360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term489967 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term489967, term489967.getClass(), "id", 0L);
        setField(term489967, term489967.getClass(), "user", null);
        setIntField(term489967, term489967.getClass(), "orderId", 0);
        setLongField(term489967, term489967.getClass(), "playlogId", 0L);
        setIntField(term489967, term489967.getClass(), "version", 0);
        setIntField(term489967, term489967.getClass(), "placeId", 0);
        setField(term489967, term489967.getClass(), "placeName", null);
        setLongField(term489967, term489967.getClass(), "loginDate", 0L);
        setField(term489967, term489967.getClass(), "playDate", null);
        setField(term489967, term489967.getClass(), "userPlayDate", null);
        setIntField(term489967, term489967.getClass(), "type", 0);
        setIntField(term489967, term489967.getClass(), "musicId", 0);
        setIntField(term489967, term489967.getClass(), "level", 0);
        setIntField(term489967, term489967.getClass(), "trackNo", 0);
        setIntField(term489967, term489967.getClass(), "vsMode", 0);
        setField(term489967, term489967.getClass(), "vsUserName", null);
        setIntField(term489967, term489967.getClass(), "vsStatus", 0);
        setIntField(term489967, term489967.getClass(), "vsUserRating", 0);
        setIntField(term489967, term489967.getClass(), "vsUserAchievement", 0);
        setIntField(term489967, term489967.getClass(), "vsUserGradeRank", 0);
        setIntField(term489967, term489967.getClass(), "vsRank", 0);
        setIntField(term489967, term489967.getClass(), "playerNum", 0);
        setLongField(term489967, term489967.getClass(), "playedUserId1", 0L);
        setField(term489967, term489967.getClass(), "playedUserName1", null);
        setIntField(term489967, term489967.getClass(), "playedMusicLevel1", 0);
        setLongField(term489967, term489967.getClass(), "playedUserId2", 0L);
        setField(term489967, term489967.getClass(), "playedUserName2", null);
        setIntField(term489967, term489967.getClass(), "playedMusicLevel2", 0);
        setLongField(term489967, term489967.getClass(), "playedUserId3", 0L);
        setField(term489967, term489967.getClass(), "playedUserName3", null);
        setIntField(term489967, term489967.getClass(), "playedMusicLevel3", 0);
        setIntField(term489967, term489967.getClass(), "characterId1", 0);
        setIntField(term489967, term489967.getClass(), "characterLevel1", 0);
        setIntField(term489967, term489967.getClass(), "characterAwakening1", 0);
        setIntField(term489967, term489967.getClass(), "characterId2", 0);
        setIntField(term489967, term489967.getClass(), "characterLevel2", 0);
        setIntField(term489967, term489967.getClass(), "characterAwakening2", 0);
        setIntField(term489967, term489967.getClass(), "characterId3", 0);
        setIntField(term489967, term489967.getClass(), "characterLevel3", 0);
        setIntField(term489967, term489967.getClass(), "characterAwakening3", 0);
        setIntField(term489967, term489967.getClass(), "characterId4", 0);
        setIntField(term489967, term489967.getClass(), "characterLevel4", 0);
        setIntField(term489967, term489967.getClass(), "characterAwakening4", 0);
        setIntField(term489967, term489967.getClass(), "characterId5", 0);
        setIntField(term489967, term489967.getClass(), "characterLevel5", 0);
        setIntField(term489967, term489967.getClass(), "characterAwakening5", 0);
        setIntField(term489967, term489967.getClass(), "achievement", 0);
        setIntField(term489967, term489967.getClass(), "deluxscore", 0);
        setIntField(term489967, term489967.getClass(), "scoreRank", 0);
        setIntField(term489967, term489967.getClass(), "maxCombo", 0);
        setIntField(term489967, term489967.getClass(), "totalCombo", 0);
        setIntField(term489967, term489967.getClass(), "maxSync", 0);
        setIntField(term489967, term489967.getClass(), "totalSync", 0);
        setIntField(term489967, term489967.getClass(), "tapCriticalPerfect", 0);
        setIntField(term489967, term489967.getClass(), "tapPerfect", 0);
        setIntField(term489967, term489967.getClass(), "tapGreat", 0);
        setIntField(term489967, term489967.getClass(), "tapGood", 0);
        setIntField(term489967, term489967.getClass(), "tapMiss", 0);
        setIntField(term489967, term489967.getClass(), "holdCriticalPerfect", 0);
        setIntField(term489967, term489967.getClass(), "holdPerfect", 0);
        setIntField(term489967, term489967.getClass(), "holdGreat", 0);
        setIntField(term489967, term489967.getClass(), "holdGood", 0);
        setIntField(term489967, term489967.getClass(), "holdMiss", 0);
        setIntField(term489967, term489967.getClass(), "slideCriticalPerfect", 0);
        setIntField(term489967, term489967.getClass(), "slidePerfect", 0);
        setIntField(term489967, term489967.getClass(), "slideGreat", 0);
        setIntField(term489967, term489967.getClass(), "slideGood", 0);
        setIntField(term489967, term489967.getClass(), "slideMiss", 0);
        setIntField(term489967, term489967.getClass(), "touchCriticalPerfect", 0);
        setIntField(term489967, term489967.getClass(), "touchPerfect", 0);
        setIntField(term489967, term489967.getClass(), "touchGreat", 0);
        setIntField(term489967, term489967.getClass(), "touchGood", 0);
        setIntField(term489967, term489967.getClass(), "touchMiss", 0);
        setIntField(term489967, term489967.getClass(), "breakCriticalPerfect", 0);
        setIntField(term489967, term489967.getClass(), "breakPerfect", 0);
        setIntField(term489967, term489967.getClass(), "breakGreat", 0);
        setIntField(term489967, term489967.getClass(), "breakGood", 0);
        setIntField(term489967, term489967.getClass(), "breakMiss", 0);
        setBooleanField(term489967, term489967.getClass(), "isTap", false);
        setBooleanField(term489967, term489967.getClass(), "isHold", false);
        setBooleanField(term489967, term489967.getClass(), "isSlide", false);
        setBooleanField(term489967, term489967.getClass(), "isTouch", false);
        setBooleanField(term489967, term489967.getClass(), "isBreak", false);
        setBooleanField(term489967, term489967.getClass(), "isCriticalDisp", false);
        setBooleanField(term489967, term489967.getClass(), "isFastLateDisp", false);
        setIntField(term489967, term489967.getClass(), "fastCount", 0);
        setIntField(term489967, term489967.getClass(), "lateCount", 0);
        setBooleanField(term489967, term489967.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term489967, term489967.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term489967, term489967.getClass(), "comboStatus", 0);
        setIntField(term489967, term489967.getClass(), "syncStatus", 0);
        setBooleanField(term489967, term489967.getClass(), "isClear", false);
        setIntField(term489967, term489967.getClass(), "beforeRating", 0);
        setIntField(term489967, term489967.getClass(), "afterRating", 0);
        setIntField(term489967, term489967.getClass(), "beforeGrade", 0);
        setIntField(term489967, term489967.getClass(), "afterGrade", 0);
        setIntField(term489967, term489967.getClass(), "afterGradeRank", 0);
        setIntField(term489967, term489967.getClass(), "beforeDeluxRating", 0);
        setIntField(term489967, term489967.getClass(), "afterDeluxRating", 0);
        setBooleanField(term489967, term489967.getClass(), "isPlayTutorial", false);
        setBooleanField(term489967, term489967.getClass(), "isEventMode", false);
        setBooleanField(term489967, term489967.getClass(), "isFreedomMode", false);
        setIntField(term489967, term489967.getClass(), "playMode", 0);
        setBooleanField(term489967, term489967.getClass(), "isNewFree", false);
        setIntField(term489967, term489967.getClass(), "trialPlayAchievement", 0);
        setIntField(term489967, term489967.getClass(), "extNum1", 0);
        setIntField(term489967, term489967.getClass(), "extNum2", 0);
        term490067 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term490067;
        callMethod(klass, "setCharacterAwakening1", argTypes, term489967, args);
    }

};


