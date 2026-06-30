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

public class UserPlaylog_setCharacterAwakening2_47358699363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term490273;
     Object term490373;

    public UserPlaylog_setCharacterAwakening2_47358699363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term490273 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term490273, term490273.getClass(), "id", 0L);
        setField(term490273, term490273.getClass(), "user", null);
        setIntField(term490273, term490273.getClass(), "orderId", 0);
        setLongField(term490273, term490273.getClass(), "playlogId", 0L);
        setIntField(term490273, term490273.getClass(), "version", 0);
        setIntField(term490273, term490273.getClass(), "placeId", 0);
        setField(term490273, term490273.getClass(), "placeName", null);
        setLongField(term490273, term490273.getClass(), "loginDate", 0L);
        setField(term490273, term490273.getClass(), "playDate", null);
        setField(term490273, term490273.getClass(), "userPlayDate", null);
        setIntField(term490273, term490273.getClass(), "type", 0);
        setIntField(term490273, term490273.getClass(), "musicId", 0);
        setIntField(term490273, term490273.getClass(), "level", 0);
        setIntField(term490273, term490273.getClass(), "trackNo", 0);
        setIntField(term490273, term490273.getClass(), "vsMode", 0);
        setField(term490273, term490273.getClass(), "vsUserName", null);
        setIntField(term490273, term490273.getClass(), "vsStatus", 0);
        setIntField(term490273, term490273.getClass(), "vsUserRating", 0);
        setIntField(term490273, term490273.getClass(), "vsUserAchievement", 0);
        setIntField(term490273, term490273.getClass(), "vsUserGradeRank", 0);
        setIntField(term490273, term490273.getClass(), "vsRank", 0);
        setIntField(term490273, term490273.getClass(), "playerNum", 0);
        setLongField(term490273, term490273.getClass(), "playedUserId1", 0L);
        setField(term490273, term490273.getClass(), "playedUserName1", null);
        setIntField(term490273, term490273.getClass(), "playedMusicLevel1", 0);
        setLongField(term490273, term490273.getClass(), "playedUserId2", 0L);
        setField(term490273, term490273.getClass(), "playedUserName2", null);
        setIntField(term490273, term490273.getClass(), "playedMusicLevel2", 0);
        setLongField(term490273, term490273.getClass(), "playedUserId3", 0L);
        setField(term490273, term490273.getClass(), "playedUserName3", null);
        setIntField(term490273, term490273.getClass(), "playedMusicLevel3", 0);
        setIntField(term490273, term490273.getClass(), "characterId1", 0);
        setIntField(term490273, term490273.getClass(), "characterLevel1", 0);
        setIntField(term490273, term490273.getClass(), "characterAwakening1", 0);
        setIntField(term490273, term490273.getClass(), "characterId2", 0);
        setIntField(term490273, term490273.getClass(), "characterLevel2", 0);
        setIntField(term490273, term490273.getClass(), "characterAwakening2", 0);
        setIntField(term490273, term490273.getClass(), "characterId3", 0);
        setIntField(term490273, term490273.getClass(), "characterLevel3", 0);
        setIntField(term490273, term490273.getClass(), "characterAwakening3", 0);
        setIntField(term490273, term490273.getClass(), "characterId4", 0);
        setIntField(term490273, term490273.getClass(), "characterLevel4", 0);
        setIntField(term490273, term490273.getClass(), "characterAwakening4", 0);
        setIntField(term490273, term490273.getClass(), "characterId5", 0);
        setIntField(term490273, term490273.getClass(), "characterLevel5", 0);
        setIntField(term490273, term490273.getClass(), "characterAwakening5", 0);
        setIntField(term490273, term490273.getClass(), "achievement", 0);
        setIntField(term490273, term490273.getClass(), "deluxscore", 0);
        setIntField(term490273, term490273.getClass(), "scoreRank", 0);
        setIntField(term490273, term490273.getClass(), "maxCombo", 0);
        setIntField(term490273, term490273.getClass(), "totalCombo", 0);
        setIntField(term490273, term490273.getClass(), "maxSync", 0);
        setIntField(term490273, term490273.getClass(), "totalSync", 0);
        setIntField(term490273, term490273.getClass(), "tapCriticalPerfect", 0);
        setIntField(term490273, term490273.getClass(), "tapPerfect", 0);
        setIntField(term490273, term490273.getClass(), "tapGreat", 0);
        setIntField(term490273, term490273.getClass(), "tapGood", 0);
        setIntField(term490273, term490273.getClass(), "tapMiss", 0);
        setIntField(term490273, term490273.getClass(), "holdCriticalPerfect", 0);
        setIntField(term490273, term490273.getClass(), "holdPerfect", 0);
        setIntField(term490273, term490273.getClass(), "holdGreat", 0);
        setIntField(term490273, term490273.getClass(), "holdGood", 0);
        setIntField(term490273, term490273.getClass(), "holdMiss", 0);
        setIntField(term490273, term490273.getClass(), "slideCriticalPerfect", 0);
        setIntField(term490273, term490273.getClass(), "slidePerfect", 0);
        setIntField(term490273, term490273.getClass(), "slideGreat", 0);
        setIntField(term490273, term490273.getClass(), "slideGood", 0);
        setIntField(term490273, term490273.getClass(), "slideMiss", 0);
        setIntField(term490273, term490273.getClass(), "touchCriticalPerfect", 0);
        setIntField(term490273, term490273.getClass(), "touchPerfect", 0);
        setIntField(term490273, term490273.getClass(), "touchGreat", 0);
        setIntField(term490273, term490273.getClass(), "touchGood", 0);
        setIntField(term490273, term490273.getClass(), "touchMiss", 0);
        setIntField(term490273, term490273.getClass(), "breakCriticalPerfect", 0);
        setIntField(term490273, term490273.getClass(), "breakPerfect", 0);
        setIntField(term490273, term490273.getClass(), "breakGreat", 0);
        setIntField(term490273, term490273.getClass(), "breakGood", 0);
        setIntField(term490273, term490273.getClass(), "breakMiss", 0);
        setBooleanField(term490273, term490273.getClass(), "isTap", false);
        setBooleanField(term490273, term490273.getClass(), "isHold", false);
        setBooleanField(term490273, term490273.getClass(), "isSlide", false);
        setBooleanField(term490273, term490273.getClass(), "isTouch", false);
        setBooleanField(term490273, term490273.getClass(), "isBreak", false);
        setBooleanField(term490273, term490273.getClass(), "isCriticalDisp", false);
        setBooleanField(term490273, term490273.getClass(), "isFastLateDisp", false);
        setIntField(term490273, term490273.getClass(), "fastCount", 0);
        setIntField(term490273, term490273.getClass(), "lateCount", 0);
        setBooleanField(term490273, term490273.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term490273, term490273.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term490273, term490273.getClass(), "comboStatus", 0);
        setIntField(term490273, term490273.getClass(), "syncStatus", 0);
        setBooleanField(term490273, term490273.getClass(), "isClear", false);
        setIntField(term490273, term490273.getClass(), "beforeRating", 0);
        setIntField(term490273, term490273.getClass(), "afterRating", 0);
        setIntField(term490273, term490273.getClass(), "beforeGrade", 0);
        setIntField(term490273, term490273.getClass(), "afterGrade", 0);
        setIntField(term490273, term490273.getClass(), "afterGradeRank", 0);
        setIntField(term490273, term490273.getClass(), "beforeDeluxRating", 0);
        setIntField(term490273, term490273.getClass(), "afterDeluxRating", 0);
        setBooleanField(term490273, term490273.getClass(), "isPlayTutorial", false);
        setBooleanField(term490273, term490273.getClass(), "isEventMode", false);
        setBooleanField(term490273, term490273.getClass(), "isFreedomMode", false);
        setIntField(term490273, term490273.getClass(), "playMode", 0);
        setBooleanField(term490273, term490273.getClass(), "isNewFree", false);
        setIntField(term490273, term490273.getClass(), "trialPlayAchievement", 0);
        setIntField(term490273, term490273.getClass(), "extNum1", 0);
        setIntField(term490273, term490273.getClass(), "extNum2", 0);
        term490373 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term490373;
        callMethod(klass, "setCharacterAwakening2", argTypes, term490273, args);
    }

};


