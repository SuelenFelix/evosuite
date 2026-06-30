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

public class UserPlaylog_setTouchGood_2124805861398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term493843;
     Object term493943;

    public UserPlaylog_setTouchGood_2124805861398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term493843 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term493843, term493843.getClass(), "id", 0L);
        setField(term493843, term493843.getClass(), "user", null);
        setIntField(term493843, term493843.getClass(), "orderId", 0);
        setLongField(term493843, term493843.getClass(), "playlogId", 0L);
        setIntField(term493843, term493843.getClass(), "version", 0);
        setIntField(term493843, term493843.getClass(), "placeId", 0);
        setField(term493843, term493843.getClass(), "placeName", null);
        setLongField(term493843, term493843.getClass(), "loginDate", 0L);
        setField(term493843, term493843.getClass(), "playDate", null);
        setField(term493843, term493843.getClass(), "userPlayDate", null);
        setIntField(term493843, term493843.getClass(), "type", 0);
        setIntField(term493843, term493843.getClass(), "musicId", 0);
        setIntField(term493843, term493843.getClass(), "level", 0);
        setIntField(term493843, term493843.getClass(), "trackNo", 0);
        setIntField(term493843, term493843.getClass(), "vsMode", 0);
        setField(term493843, term493843.getClass(), "vsUserName", null);
        setIntField(term493843, term493843.getClass(), "vsStatus", 0);
        setIntField(term493843, term493843.getClass(), "vsUserRating", 0);
        setIntField(term493843, term493843.getClass(), "vsUserAchievement", 0);
        setIntField(term493843, term493843.getClass(), "vsUserGradeRank", 0);
        setIntField(term493843, term493843.getClass(), "vsRank", 0);
        setIntField(term493843, term493843.getClass(), "playerNum", 0);
        setLongField(term493843, term493843.getClass(), "playedUserId1", 0L);
        setField(term493843, term493843.getClass(), "playedUserName1", null);
        setIntField(term493843, term493843.getClass(), "playedMusicLevel1", 0);
        setLongField(term493843, term493843.getClass(), "playedUserId2", 0L);
        setField(term493843, term493843.getClass(), "playedUserName2", null);
        setIntField(term493843, term493843.getClass(), "playedMusicLevel2", 0);
        setLongField(term493843, term493843.getClass(), "playedUserId3", 0L);
        setField(term493843, term493843.getClass(), "playedUserName3", null);
        setIntField(term493843, term493843.getClass(), "playedMusicLevel3", 0);
        setIntField(term493843, term493843.getClass(), "characterId1", 0);
        setIntField(term493843, term493843.getClass(), "characterLevel1", 0);
        setIntField(term493843, term493843.getClass(), "characterAwakening1", 0);
        setIntField(term493843, term493843.getClass(), "characterId2", 0);
        setIntField(term493843, term493843.getClass(), "characterLevel2", 0);
        setIntField(term493843, term493843.getClass(), "characterAwakening2", 0);
        setIntField(term493843, term493843.getClass(), "characterId3", 0);
        setIntField(term493843, term493843.getClass(), "characterLevel3", 0);
        setIntField(term493843, term493843.getClass(), "characterAwakening3", 0);
        setIntField(term493843, term493843.getClass(), "characterId4", 0);
        setIntField(term493843, term493843.getClass(), "characterLevel4", 0);
        setIntField(term493843, term493843.getClass(), "characterAwakening4", 0);
        setIntField(term493843, term493843.getClass(), "characterId5", 0);
        setIntField(term493843, term493843.getClass(), "characterLevel5", 0);
        setIntField(term493843, term493843.getClass(), "characterAwakening5", 0);
        setIntField(term493843, term493843.getClass(), "achievement", 0);
        setIntField(term493843, term493843.getClass(), "deluxscore", 0);
        setIntField(term493843, term493843.getClass(), "scoreRank", 0);
        setIntField(term493843, term493843.getClass(), "maxCombo", 0);
        setIntField(term493843, term493843.getClass(), "totalCombo", 0);
        setIntField(term493843, term493843.getClass(), "maxSync", 0);
        setIntField(term493843, term493843.getClass(), "totalSync", 0);
        setIntField(term493843, term493843.getClass(), "tapCriticalPerfect", 0);
        setIntField(term493843, term493843.getClass(), "tapPerfect", 0);
        setIntField(term493843, term493843.getClass(), "tapGreat", 0);
        setIntField(term493843, term493843.getClass(), "tapGood", 0);
        setIntField(term493843, term493843.getClass(), "tapMiss", 0);
        setIntField(term493843, term493843.getClass(), "holdCriticalPerfect", 0);
        setIntField(term493843, term493843.getClass(), "holdPerfect", 0);
        setIntField(term493843, term493843.getClass(), "holdGreat", 0);
        setIntField(term493843, term493843.getClass(), "holdGood", 0);
        setIntField(term493843, term493843.getClass(), "holdMiss", 0);
        setIntField(term493843, term493843.getClass(), "slideCriticalPerfect", 0);
        setIntField(term493843, term493843.getClass(), "slidePerfect", 0);
        setIntField(term493843, term493843.getClass(), "slideGreat", 0);
        setIntField(term493843, term493843.getClass(), "slideGood", 0);
        setIntField(term493843, term493843.getClass(), "slideMiss", 0);
        setIntField(term493843, term493843.getClass(), "touchCriticalPerfect", 0);
        setIntField(term493843, term493843.getClass(), "touchPerfect", 0);
        setIntField(term493843, term493843.getClass(), "touchGreat", 0);
        setIntField(term493843, term493843.getClass(), "touchGood", 0);
        setIntField(term493843, term493843.getClass(), "touchMiss", 0);
        setIntField(term493843, term493843.getClass(), "breakCriticalPerfect", 0);
        setIntField(term493843, term493843.getClass(), "breakPerfect", 0);
        setIntField(term493843, term493843.getClass(), "breakGreat", 0);
        setIntField(term493843, term493843.getClass(), "breakGood", 0);
        setIntField(term493843, term493843.getClass(), "breakMiss", 0);
        setBooleanField(term493843, term493843.getClass(), "isTap", false);
        setBooleanField(term493843, term493843.getClass(), "isHold", false);
        setBooleanField(term493843, term493843.getClass(), "isSlide", false);
        setBooleanField(term493843, term493843.getClass(), "isTouch", false);
        setBooleanField(term493843, term493843.getClass(), "isBreak", false);
        setBooleanField(term493843, term493843.getClass(), "isCriticalDisp", false);
        setBooleanField(term493843, term493843.getClass(), "isFastLateDisp", false);
        setIntField(term493843, term493843.getClass(), "fastCount", 0);
        setIntField(term493843, term493843.getClass(), "lateCount", 0);
        setBooleanField(term493843, term493843.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term493843, term493843.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term493843, term493843.getClass(), "comboStatus", 0);
        setIntField(term493843, term493843.getClass(), "syncStatus", 0);
        setBooleanField(term493843, term493843.getClass(), "isClear", false);
        setIntField(term493843, term493843.getClass(), "beforeRating", 0);
        setIntField(term493843, term493843.getClass(), "afterRating", 0);
        setIntField(term493843, term493843.getClass(), "beforeGrade", 0);
        setIntField(term493843, term493843.getClass(), "afterGrade", 0);
        setIntField(term493843, term493843.getClass(), "afterGradeRank", 0);
        setIntField(term493843, term493843.getClass(), "beforeDeluxRating", 0);
        setIntField(term493843, term493843.getClass(), "afterDeluxRating", 0);
        setBooleanField(term493843, term493843.getClass(), "isPlayTutorial", false);
        setBooleanField(term493843, term493843.getClass(), "isEventMode", false);
        setBooleanField(term493843, term493843.getClass(), "isFreedomMode", false);
        setIntField(term493843, term493843.getClass(), "playMode", 0);
        setBooleanField(term493843, term493843.getClass(), "isNewFree", false);
        setIntField(term493843, term493843.getClass(), "trialPlayAchievement", 0);
        setIntField(term493843, term493843.getClass(), "extNum1", 0);
        setIntField(term493843, term493843.getClass(), "extNum2", 0);
        term493943 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term493943;
        callMethod(klass, "setTouchGood", argTypes, term493843, args);
    }

};


