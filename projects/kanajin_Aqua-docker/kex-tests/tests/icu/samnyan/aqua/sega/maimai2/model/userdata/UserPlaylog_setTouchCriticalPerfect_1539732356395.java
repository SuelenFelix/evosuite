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

public class UserPlaylog_setTouchCriticalPerfect_1539732356395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term493537;
     Object term493637;

    public UserPlaylog_setTouchCriticalPerfect_1539732356395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term493537 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term493537, term493537.getClass(), "id", 0L);
        setField(term493537, term493537.getClass(), "user", null);
        setIntField(term493537, term493537.getClass(), "orderId", 0);
        setLongField(term493537, term493537.getClass(), "playlogId", 0L);
        setIntField(term493537, term493537.getClass(), "version", 0);
        setIntField(term493537, term493537.getClass(), "placeId", 0);
        setField(term493537, term493537.getClass(), "placeName", null);
        setLongField(term493537, term493537.getClass(), "loginDate", 0L);
        setField(term493537, term493537.getClass(), "playDate", null);
        setField(term493537, term493537.getClass(), "userPlayDate", null);
        setIntField(term493537, term493537.getClass(), "type", 0);
        setIntField(term493537, term493537.getClass(), "musicId", 0);
        setIntField(term493537, term493537.getClass(), "level", 0);
        setIntField(term493537, term493537.getClass(), "trackNo", 0);
        setIntField(term493537, term493537.getClass(), "vsMode", 0);
        setField(term493537, term493537.getClass(), "vsUserName", null);
        setIntField(term493537, term493537.getClass(), "vsStatus", 0);
        setIntField(term493537, term493537.getClass(), "vsUserRating", 0);
        setIntField(term493537, term493537.getClass(), "vsUserAchievement", 0);
        setIntField(term493537, term493537.getClass(), "vsUserGradeRank", 0);
        setIntField(term493537, term493537.getClass(), "vsRank", 0);
        setIntField(term493537, term493537.getClass(), "playerNum", 0);
        setLongField(term493537, term493537.getClass(), "playedUserId1", 0L);
        setField(term493537, term493537.getClass(), "playedUserName1", null);
        setIntField(term493537, term493537.getClass(), "playedMusicLevel1", 0);
        setLongField(term493537, term493537.getClass(), "playedUserId2", 0L);
        setField(term493537, term493537.getClass(), "playedUserName2", null);
        setIntField(term493537, term493537.getClass(), "playedMusicLevel2", 0);
        setLongField(term493537, term493537.getClass(), "playedUserId3", 0L);
        setField(term493537, term493537.getClass(), "playedUserName3", null);
        setIntField(term493537, term493537.getClass(), "playedMusicLevel3", 0);
        setIntField(term493537, term493537.getClass(), "characterId1", 0);
        setIntField(term493537, term493537.getClass(), "characterLevel1", 0);
        setIntField(term493537, term493537.getClass(), "characterAwakening1", 0);
        setIntField(term493537, term493537.getClass(), "characterId2", 0);
        setIntField(term493537, term493537.getClass(), "characterLevel2", 0);
        setIntField(term493537, term493537.getClass(), "characterAwakening2", 0);
        setIntField(term493537, term493537.getClass(), "characterId3", 0);
        setIntField(term493537, term493537.getClass(), "characterLevel3", 0);
        setIntField(term493537, term493537.getClass(), "characterAwakening3", 0);
        setIntField(term493537, term493537.getClass(), "characterId4", 0);
        setIntField(term493537, term493537.getClass(), "characterLevel4", 0);
        setIntField(term493537, term493537.getClass(), "characterAwakening4", 0);
        setIntField(term493537, term493537.getClass(), "characterId5", 0);
        setIntField(term493537, term493537.getClass(), "characterLevel5", 0);
        setIntField(term493537, term493537.getClass(), "characterAwakening5", 0);
        setIntField(term493537, term493537.getClass(), "achievement", 0);
        setIntField(term493537, term493537.getClass(), "deluxscore", 0);
        setIntField(term493537, term493537.getClass(), "scoreRank", 0);
        setIntField(term493537, term493537.getClass(), "maxCombo", 0);
        setIntField(term493537, term493537.getClass(), "totalCombo", 0);
        setIntField(term493537, term493537.getClass(), "maxSync", 0);
        setIntField(term493537, term493537.getClass(), "totalSync", 0);
        setIntField(term493537, term493537.getClass(), "tapCriticalPerfect", 0);
        setIntField(term493537, term493537.getClass(), "tapPerfect", 0);
        setIntField(term493537, term493537.getClass(), "tapGreat", 0);
        setIntField(term493537, term493537.getClass(), "tapGood", 0);
        setIntField(term493537, term493537.getClass(), "tapMiss", 0);
        setIntField(term493537, term493537.getClass(), "holdCriticalPerfect", 0);
        setIntField(term493537, term493537.getClass(), "holdPerfect", 0);
        setIntField(term493537, term493537.getClass(), "holdGreat", 0);
        setIntField(term493537, term493537.getClass(), "holdGood", 0);
        setIntField(term493537, term493537.getClass(), "holdMiss", 0);
        setIntField(term493537, term493537.getClass(), "slideCriticalPerfect", 0);
        setIntField(term493537, term493537.getClass(), "slidePerfect", 0);
        setIntField(term493537, term493537.getClass(), "slideGreat", 0);
        setIntField(term493537, term493537.getClass(), "slideGood", 0);
        setIntField(term493537, term493537.getClass(), "slideMiss", 0);
        setIntField(term493537, term493537.getClass(), "touchCriticalPerfect", 0);
        setIntField(term493537, term493537.getClass(), "touchPerfect", 0);
        setIntField(term493537, term493537.getClass(), "touchGreat", 0);
        setIntField(term493537, term493537.getClass(), "touchGood", 0);
        setIntField(term493537, term493537.getClass(), "touchMiss", 0);
        setIntField(term493537, term493537.getClass(), "breakCriticalPerfect", 0);
        setIntField(term493537, term493537.getClass(), "breakPerfect", 0);
        setIntField(term493537, term493537.getClass(), "breakGreat", 0);
        setIntField(term493537, term493537.getClass(), "breakGood", 0);
        setIntField(term493537, term493537.getClass(), "breakMiss", 0);
        setBooleanField(term493537, term493537.getClass(), "isTap", false);
        setBooleanField(term493537, term493537.getClass(), "isHold", false);
        setBooleanField(term493537, term493537.getClass(), "isSlide", false);
        setBooleanField(term493537, term493537.getClass(), "isTouch", false);
        setBooleanField(term493537, term493537.getClass(), "isBreak", false);
        setBooleanField(term493537, term493537.getClass(), "isCriticalDisp", false);
        setBooleanField(term493537, term493537.getClass(), "isFastLateDisp", false);
        setIntField(term493537, term493537.getClass(), "fastCount", 0);
        setIntField(term493537, term493537.getClass(), "lateCount", 0);
        setBooleanField(term493537, term493537.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term493537, term493537.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term493537, term493537.getClass(), "comboStatus", 0);
        setIntField(term493537, term493537.getClass(), "syncStatus", 0);
        setBooleanField(term493537, term493537.getClass(), "isClear", false);
        setIntField(term493537, term493537.getClass(), "beforeRating", 0);
        setIntField(term493537, term493537.getClass(), "afterRating", 0);
        setIntField(term493537, term493537.getClass(), "beforeGrade", 0);
        setIntField(term493537, term493537.getClass(), "afterGrade", 0);
        setIntField(term493537, term493537.getClass(), "afterGradeRank", 0);
        setIntField(term493537, term493537.getClass(), "beforeDeluxRating", 0);
        setIntField(term493537, term493537.getClass(), "afterDeluxRating", 0);
        setBooleanField(term493537, term493537.getClass(), "isPlayTutorial", false);
        setBooleanField(term493537, term493537.getClass(), "isEventMode", false);
        setBooleanField(term493537, term493537.getClass(), "isFreedomMode", false);
        setIntField(term493537, term493537.getClass(), "playMode", 0);
        setBooleanField(term493537, term493537.getClass(), "isNewFree", false);
        setIntField(term493537, term493537.getClass(), "trialPlayAchievement", 0);
        setIntField(term493537, term493537.getClass(), "extNum1", 0);
        setIntField(term493537, term493537.getClass(), "extNum2", 0);
        term493637 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term493637;
        callMethod(klass, "setTouchCriticalPerfect", argTypes, term493537, args);
    }

};


