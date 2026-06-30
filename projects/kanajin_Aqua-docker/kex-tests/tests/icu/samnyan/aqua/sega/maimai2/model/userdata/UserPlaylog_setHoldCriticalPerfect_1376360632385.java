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

public class UserPlaylog_setHoldCriticalPerfect_1376360632385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term492517;
     Object term492617;

    public UserPlaylog_setHoldCriticalPerfect_1376360632385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term492517 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term492517, term492517.getClass(), "id", 0L);
        setField(term492517, term492517.getClass(), "user", null);
        setIntField(term492517, term492517.getClass(), "orderId", 0);
        setLongField(term492517, term492517.getClass(), "playlogId", 0L);
        setIntField(term492517, term492517.getClass(), "version", 0);
        setIntField(term492517, term492517.getClass(), "placeId", 0);
        setField(term492517, term492517.getClass(), "placeName", null);
        setLongField(term492517, term492517.getClass(), "loginDate", 0L);
        setField(term492517, term492517.getClass(), "playDate", null);
        setField(term492517, term492517.getClass(), "userPlayDate", null);
        setIntField(term492517, term492517.getClass(), "type", 0);
        setIntField(term492517, term492517.getClass(), "musicId", 0);
        setIntField(term492517, term492517.getClass(), "level", 0);
        setIntField(term492517, term492517.getClass(), "trackNo", 0);
        setIntField(term492517, term492517.getClass(), "vsMode", 0);
        setField(term492517, term492517.getClass(), "vsUserName", null);
        setIntField(term492517, term492517.getClass(), "vsStatus", 0);
        setIntField(term492517, term492517.getClass(), "vsUserRating", 0);
        setIntField(term492517, term492517.getClass(), "vsUserAchievement", 0);
        setIntField(term492517, term492517.getClass(), "vsUserGradeRank", 0);
        setIntField(term492517, term492517.getClass(), "vsRank", 0);
        setIntField(term492517, term492517.getClass(), "playerNum", 0);
        setLongField(term492517, term492517.getClass(), "playedUserId1", 0L);
        setField(term492517, term492517.getClass(), "playedUserName1", null);
        setIntField(term492517, term492517.getClass(), "playedMusicLevel1", 0);
        setLongField(term492517, term492517.getClass(), "playedUserId2", 0L);
        setField(term492517, term492517.getClass(), "playedUserName2", null);
        setIntField(term492517, term492517.getClass(), "playedMusicLevel2", 0);
        setLongField(term492517, term492517.getClass(), "playedUserId3", 0L);
        setField(term492517, term492517.getClass(), "playedUserName3", null);
        setIntField(term492517, term492517.getClass(), "playedMusicLevel3", 0);
        setIntField(term492517, term492517.getClass(), "characterId1", 0);
        setIntField(term492517, term492517.getClass(), "characterLevel1", 0);
        setIntField(term492517, term492517.getClass(), "characterAwakening1", 0);
        setIntField(term492517, term492517.getClass(), "characterId2", 0);
        setIntField(term492517, term492517.getClass(), "characterLevel2", 0);
        setIntField(term492517, term492517.getClass(), "characterAwakening2", 0);
        setIntField(term492517, term492517.getClass(), "characterId3", 0);
        setIntField(term492517, term492517.getClass(), "characterLevel3", 0);
        setIntField(term492517, term492517.getClass(), "characterAwakening3", 0);
        setIntField(term492517, term492517.getClass(), "characterId4", 0);
        setIntField(term492517, term492517.getClass(), "characterLevel4", 0);
        setIntField(term492517, term492517.getClass(), "characterAwakening4", 0);
        setIntField(term492517, term492517.getClass(), "characterId5", 0);
        setIntField(term492517, term492517.getClass(), "characterLevel5", 0);
        setIntField(term492517, term492517.getClass(), "characterAwakening5", 0);
        setIntField(term492517, term492517.getClass(), "achievement", 0);
        setIntField(term492517, term492517.getClass(), "deluxscore", 0);
        setIntField(term492517, term492517.getClass(), "scoreRank", 0);
        setIntField(term492517, term492517.getClass(), "maxCombo", 0);
        setIntField(term492517, term492517.getClass(), "totalCombo", 0);
        setIntField(term492517, term492517.getClass(), "maxSync", 0);
        setIntField(term492517, term492517.getClass(), "totalSync", 0);
        setIntField(term492517, term492517.getClass(), "tapCriticalPerfect", 0);
        setIntField(term492517, term492517.getClass(), "tapPerfect", 0);
        setIntField(term492517, term492517.getClass(), "tapGreat", 0);
        setIntField(term492517, term492517.getClass(), "tapGood", 0);
        setIntField(term492517, term492517.getClass(), "tapMiss", 0);
        setIntField(term492517, term492517.getClass(), "holdCriticalPerfect", 0);
        setIntField(term492517, term492517.getClass(), "holdPerfect", 0);
        setIntField(term492517, term492517.getClass(), "holdGreat", 0);
        setIntField(term492517, term492517.getClass(), "holdGood", 0);
        setIntField(term492517, term492517.getClass(), "holdMiss", 0);
        setIntField(term492517, term492517.getClass(), "slideCriticalPerfect", 0);
        setIntField(term492517, term492517.getClass(), "slidePerfect", 0);
        setIntField(term492517, term492517.getClass(), "slideGreat", 0);
        setIntField(term492517, term492517.getClass(), "slideGood", 0);
        setIntField(term492517, term492517.getClass(), "slideMiss", 0);
        setIntField(term492517, term492517.getClass(), "touchCriticalPerfect", 0);
        setIntField(term492517, term492517.getClass(), "touchPerfect", 0);
        setIntField(term492517, term492517.getClass(), "touchGreat", 0);
        setIntField(term492517, term492517.getClass(), "touchGood", 0);
        setIntField(term492517, term492517.getClass(), "touchMiss", 0);
        setIntField(term492517, term492517.getClass(), "breakCriticalPerfect", 0);
        setIntField(term492517, term492517.getClass(), "breakPerfect", 0);
        setIntField(term492517, term492517.getClass(), "breakGreat", 0);
        setIntField(term492517, term492517.getClass(), "breakGood", 0);
        setIntField(term492517, term492517.getClass(), "breakMiss", 0);
        setBooleanField(term492517, term492517.getClass(), "isTap", false);
        setBooleanField(term492517, term492517.getClass(), "isHold", false);
        setBooleanField(term492517, term492517.getClass(), "isSlide", false);
        setBooleanField(term492517, term492517.getClass(), "isTouch", false);
        setBooleanField(term492517, term492517.getClass(), "isBreak", false);
        setBooleanField(term492517, term492517.getClass(), "isCriticalDisp", false);
        setBooleanField(term492517, term492517.getClass(), "isFastLateDisp", false);
        setIntField(term492517, term492517.getClass(), "fastCount", 0);
        setIntField(term492517, term492517.getClass(), "lateCount", 0);
        setBooleanField(term492517, term492517.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term492517, term492517.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term492517, term492517.getClass(), "comboStatus", 0);
        setIntField(term492517, term492517.getClass(), "syncStatus", 0);
        setBooleanField(term492517, term492517.getClass(), "isClear", false);
        setIntField(term492517, term492517.getClass(), "beforeRating", 0);
        setIntField(term492517, term492517.getClass(), "afterRating", 0);
        setIntField(term492517, term492517.getClass(), "beforeGrade", 0);
        setIntField(term492517, term492517.getClass(), "afterGrade", 0);
        setIntField(term492517, term492517.getClass(), "afterGradeRank", 0);
        setIntField(term492517, term492517.getClass(), "beforeDeluxRating", 0);
        setIntField(term492517, term492517.getClass(), "afterDeluxRating", 0);
        setBooleanField(term492517, term492517.getClass(), "isPlayTutorial", false);
        setBooleanField(term492517, term492517.getClass(), "isEventMode", false);
        setBooleanField(term492517, term492517.getClass(), "isFreedomMode", false);
        setIntField(term492517, term492517.getClass(), "playMode", 0);
        setBooleanField(term492517, term492517.getClass(), "isNewFree", false);
        setIntField(term492517, term492517.getClass(), "trialPlayAchievement", 0);
        setIntField(term492517, term492517.getClass(), "extNum1", 0);
        setIntField(term492517, term492517.getClass(), "extNum2", 0);
        term492617 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term492617;
        callMethod(klass, "setHoldCriticalPerfect", argTypes, term492517, args);
    }

};


