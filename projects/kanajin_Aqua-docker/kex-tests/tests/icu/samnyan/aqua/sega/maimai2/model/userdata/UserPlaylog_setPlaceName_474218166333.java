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

public class UserPlaylog_setPlaceName_474218166333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term487227;

    public UserPlaylog_setPlaceName_474218166333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term487227 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term487227, term487227.getClass(), "id", 0L);
        setField(term487227, term487227.getClass(), "user", null);
        setIntField(term487227, term487227.getClass(), "orderId", 0);
        setLongField(term487227, term487227.getClass(), "playlogId", 0L);
        setIntField(term487227, term487227.getClass(), "version", 0);
        setIntField(term487227, term487227.getClass(), "placeId", 0);
        setField(term487227, term487227.getClass(), "placeName", null);
        setLongField(term487227, term487227.getClass(), "loginDate", 0L);
        setField(term487227, term487227.getClass(), "playDate", null);
        setField(term487227, term487227.getClass(), "userPlayDate", null);
        setIntField(term487227, term487227.getClass(), "type", 0);
        setIntField(term487227, term487227.getClass(), "musicId", 0);
        setIntField(term487227, term487227.getClass(), "level", 0);
        setIntField(term487227, term487227.getClass(), "trackNo", 0);
        setIntField(term487227, term487227.getClass(), "vsMode", 0);
        setField(term487227, term487227.getClass(), "vsUserName", null);
        setIntField(term487227, term487227.getClass(), "vsStatus", 0);
        setIntField(term487227, term487227.getClass(), "vsUserRating", 0);
        setIntField(term487227, term487227.getClass(), "vsUserAchievement", 0);
        setIntField(term487227, term487227.getClass(), "vsUserGradeRank", 0);
        setIntField(term487227, term487227.getClass(), "vsRank", 0);
        setIntField(term487227, term487227.getClass(), "playerNum", 0);
        setLongField(term487227, term487227.getClass(), "playedUserId1", 0L);
        setField(term487227, term487227.getClass(), "playedUserName1", null);
        setIntField(term487227, term487227.getClass(), "playedMusicLevel1", 0);
        setLongField(term487227, term487227.getClass(), "playedUserId2", 0L);
        setField(term487227, term487227.getClass(), "playedUserName2", null);
        setIntField(term487227, term487227.getClass(), "playedMusicLevel2", 0);
        setLongField(term487227, term487227.getClass(), "playedUserId3", 0L);
        setField(term487227, term487227.getClass(), "playedUserName3", null);
        setIntField(term487227, term487227.getClass(), "playedMusicLevel3", 0);
        setIntField(term487227, term487227.getClass(), "characterId1", 0);
        setIntField(term487227, term487227.getClass(), "characterLevel1", 0);
        setIntField(term487227, term487227.getClass(), "characterAwakening1", 0);
        setIntField(term487227, term487227.getClass(), "characterId2", 0);
        setIntField(term487227, term487227.getClass(), "characterLevel2", 0);
        setIntField(term487227, term487227.getClass(), "characterAwakening2", 0);
        setIntField(term487227, term487227.getClass(), "characterId3", 0);
        setIntField(term487227, term487227.getClass(), "characterLevel3", 0);
        setIntField(term487227, term487227.getClass(), "characterAwakening3", 0);
        setIntField(term487227, term487227.getClass(), "characterId4", 0);
        setIntField(term487227, term487227.getClass(), "characterLevel4", 0);
        setIntField(term487227, term487227.getClass(), "characterAwakening4", 0);
        setIntField(term487227, term487227.getClass(), "characterId5", 0);
        setIntField(term487227, term487227.getClass(), "characterLevel5", 0);
        setIntField(term487227, term487227.getClass(), "characterAwakening5", 0);
        setIntField(term487227, term487227.getClass(), "achievement", 0);
        setIntField(term487227, term487227.getClass(), "deluxscore", 0);
        setIntField(term487227, term487227.getClass(), "scoreRank", 0);
        setIntField(term487227, term487227.getClass(), "maxCombo", 0);
        setIntField(term487227, term487227.getClass(), "totalCombo", 0);
        setIntField(term487227, term487227.getClass(), "maxSync", 0);
        setIntField(term487227, term487227.getClass(), "totalSync", 0);
        setIntField(term487227, term487227.getClass(), "tapCriticalPerfect", 0);
        setIntField(term487227, term487227.getClass(), "tapPerfect", 0);
        setIntField(term487227, term487227.getClass(), "tapGreat", 0);
        setIntField(term487227, term487227.getClass(), "tapGood", 0);
        setIntField(term487227, term487227.getClass(), "tapMiss", 0);
        setIntField(term487227, term487227.getClass(), "holdCriticalPerfect", 0);
        setIntField(term487227, term487227.getClass(), "holdPerfect", 0);
        setIntField(term487227, term487227.getClass(), "holdGreat", 0);
        setIntField(term487227, term487227.getClass(), "holdGood", 0);
        setIntField(term487227, term487227.getClass(), "holdMiss", 0);
        setIntField(term487227, term487227.getClass(), "slideCriticalPerfect", 0);
        setIntField(term487227, term487227.getClass(), "slidePerfect", 0);
        setIntField(term487227, term487227.getClass(), "slideGreat", 0);
        setIntField(term487227, term487227.getClass(), "slideGood", 0);
        setIntField(term487227, term487227.getClass(), "slideMiss", 0);
        setIntField(term487227, term487227.getClass(), "touchCriticalPerfect", 0);
        setIntField(term487227, term487227.getClass(), "touchPerfect", 0);
        setIntField(term487227, term487227.getClass(), "touchGreat", 0);
        setIntField(term487227, term487227.getClass(), "touchGood", 0);
        setIntField(term487227, term487227.getClass(), "touchMiss", 0);
        setIntField(term487227, term487227.getClass(), "breakCriticalPerfect", 0);
        setIntField(term487227, term487227.getClass(), "breakPerfect", 0);
        setIntField(term487227, term487227.getClass(), "breakGreat", 0);
        setIntField(term487227, term487227.getClass(), "breakGood", 0);
        setIntField(term487227, term487227.getClass(), "breakMiss", 0);
        setBooleanField(term487227, term487227.getClass(), "isTap", false);
        setBooleanField(term487227, term487227.getClass(), "isHold", false);
        setBooleanField(term487227, term487227.getClass(), "isSlide", false);
        setBooleanField(term487227, term487227.getClass(), "isTouch", false);
        setBooleanField(term487227, term487227.getClass(), "isBreak", false);
        setBooleanField(term487227, term487227.getClass(), "isCriticalDisp", false);
        setBooleanField(term487227, term487227.getClass(), "isFastLateDisp", false);
        setIntField(term487227, term487227.getClass(), "fastCount", 0);
        setIntField(term487227, term487227.getClass(), "lateCount", 0);
        setBooleanField(term487227, term487227.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term487227, term487227.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term487227, term487227.getClass(), "comboStatus", 0);
        setIntField(term487227, term487227.getClass(), "syncStatus", 0);
        setBooleanField(term487227, term487227.getClass(), "isClear", false);
        setIntField(term487227, term487227.getClass(), "beforeRating", 0);
        setIntField(term487227, term487227.getClass(), "afterRating", 0);
        setIntField(term487227, term487227.getClass(), "beforeGrade", 0);
        setIntField(term487227, term487227.getClass(), "afterGrade", 0);
        setIntField(term487227, term487227.getClass(), "afterGradeRank", 0);
        setIntField(term487227, term487227.getClass(), "beforeDeluxRating", 0);
        setIntField(term487227, term487227.getClass(), "afterDeluxRating", 0);
        setBooleanField(term487227, term487227.getClass(), "isPlayTutorial", false);
        setBooleanField(term487227, term487227.getClass(), "isEventMode", false);
        setBooleanField(term487227, term487227.getClass(), "isFreedomMode", false);
        setIntField(term487227, term487227.getClass(), "playMode", 0);
        setBooleanField(term487227, term487227.getClass(), "isNewFree", false);
        setIntField(term487227, term487227.getClass(), "trialPlayAchievement", 0);
        setIntField(term487227, term487227.getClass(), "extNum1", 0);
        setIntField(term487227, term487227.getClass(), "extNum2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlaceName", argTypes, term487227, args);
    }

};


