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

public class UserPlaylog_setTouchPerfect_578221147396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term493639;
     Object term493739;

    public UserPlaylog_setTouchPerfect_578221147396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term493639 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term493639, term493639.getClass(), "id", 0L);
        setField(term493639, term493639.getClass(), "user", null);
        setIntField(term493639, term493639.getClass(), "orderId", 0);
        setLongField(term493639, term493639.getClass(), "playlogId", 0L);
        setIntField(term493639, term493639.getClass(), "version", 0);
        setIntField(term493639, term493639.getClass(), "placeId", 0);
        setField(term493639, term493639.getClass(), "placeName", null);
        setLongField(term493639, term493639.getClass(), "loginDate", 0L);
        setField(term493639, term493639.getClass(), "playDate", null);
        setField(term493639, term493639.getClass(), "userPlayDate", null);
        setIntField(term493639, term493639.getClass(), "type", 0);
        setIntField(term493639, term493639.getClass(), "musicId", 0);
        setIntField(term493639, term493639.getClass(), "level", 0);
        setIntField(term493639, term493639.getClass(), "trackNo", 0);
        setIntField(term493639, term493639.getClass(), "vsMode", 0);
        setField(term493639, term493639.getClass(), "vsUserName", null);
        setIntField(term493639, term493639.getClass(), "vsStatus", 0);
        setIntField(term493639, term493639.getClass(), "vsUserRating", 0);
        setIntField(term493639, term493639.getClass(), "vsUserAchievement", 0);
        setIntField(term493639, term493639.getClass(), "vsUserGradeRank", 0);
        setIntField(term493639, term493639.getClass(), "vsRank", 0);
        setIntField(term493639, term493639.getClass(), "playerNum", 0);
        setLongField(term493639, term493639.getClass(), "playedUserId1", 0L);
        setField(term493639, term493639.getClass(), "playedUserName1", null);
        setIntField(term493639, term493639.getClass(), "playedMusicLevel1", 0);
        setLongField(term493639, term493639.getClass(), "playedUserId2", 0L);
        setField(term493639, term493639.getClass(), "playedUserName2", null);
        setIntField(term493639, term493639.getClass(), "playedMusicLevel2", 0);
        setLongField(term493639, term493639.getClass(), "playedUserId3", 0L);
        setField(term493639, term493639.getClass(), "playedUserName3", null);
        setIntField(term493639, term493639.getClass(), "playedMusicLevel3", 0);
        setIntField(term493639, term493639.getClass(), "characterId1", 0);
        setIntField(term493639, term493639.getClass(), "characterLevel1", 0);
        setIntField(term493639, term493639.getClass(), "characterAwakening1", 0);
        setIntField(term493639, term493639.getClass(), "characterId2", 0);
        setIntField(term493639, term493639.getClass(), "characterLevel2", 0);
        setIntField(term493639, term493639.getClass(), "characterAwakening2", 0);
        setIntField(term493639, term493639.getClass(), "characterId3", 0);
        setIntField(term493639, term493639.getClass(), "characterLevel3", 0);
        setIntField(term493639, term493639.getClass(), "characterAwakening3", 0);
        setIntField(term493639, term493639.getClass(), "characterId4", 0);
        setIntField(term493639, term493639.getClass(), "characterLevel4", 0);
        setIntField(term493639, term493639.getClass(), "characterAwakening4", 0);
        setIntField(term493639, term493639.getClass(), "characterId5", 0);
        setIntField(term493639, term493639.getClass(), "characterLevel5", 0);
        setIntField(term493639, term493639.getClass(), "characterAwakening5", 0);
        setIntField(term493639, term493639.getClass(), "achievement", 0);
        setIntField(term493639, term493639.getClass(), "deluxscore", 0);
        setIntField(term493639, term493639.getClass(), "scoreRank", 0);
        setIntField(term493639, term493639.getClass(), "maxCombo", 0);
        setIntField(term493639, term493639.getClass(), "totalCombo", 0);
        setIntField(term493639, term493639.getClass(), "maxSync", 0);
        setIntField(term493639, term493639.getClass(), "totalSync", 0);
        setIntField(term493639, term493639.getClass(), "tapCriticalPerfect", 0);
        setIntField(term493639, term493639.getClass(), "tapPerfect", 0);
        setIntField(term493639, term493639.getClass(), "tapGreat", 0);
        setIntField(term493639, term493639.getClass(), "tapGood", 0);
        setIntField(term493639, term493639.getClass(), "tapMiss", 0);
        setIntField(term493639, term493639.getClass(), "holdCriticalPerfect", 0);
        setIntField(term493639, term493639.getClass(), "holdPerfect", 0);
        setIntField(term493639, term493639.getClass(), "holdGreat", 0);
        setIntField(term493639, term493639.getClass(), "holdGood", 0);
        setIntField(term493639, term493639.getClass(), "holdMiss", 0);
        setIntField(term493639, term493639.getClass(), "slideCriticalPerfect", 0);
        setIntField(term493639, term493639.getClass(), "slidePerfect", 0);
        setIntField(term493639, term493639.getClass(), "slideGreat", 0);
        setIntField(term493639, term493639.getClass(), "slideGood", 0);
        setIntField(term493639, term493639.getClass(), "slideMiss", 0);
        setIntField(term493639, term493639.getClass(), "touchCriticalPerfect", 0);
        setIntField(term493639, term493639.getClass(), "touchPerfect", 0);
        setIntField(term493639, term493639.getClass(), "touchGreat", 0);
        setIntField(term493639, term493639.getClass(), "touchGood", 0);
        setIntField(term493639, term493639.getClass(), "touchMiss", 0);
        setIntField(term493639, term493639.getClass(), "breakCriticalPerfect", 0);
        setIntField(term493639, term493639.getClass(), "breakPerfect", 0);
        setIntField(term493639, term493639.getClass(), "breakGreat", 0);
        setIntField(term493639, term493639.getClass(), "breakGood", 0);
        setIntField(term493639, term493639.getClass(), "breakMiss", 0);
        setBooleanField(term493639, term493639.getClass(), "isTap", false);
        setBooleanField(term493639, term493639.getClass(), "isHold", false);
        setBooleanField(term493639, term493639.getClass(), "isSlide", false);
        setBooleanField(term493639, term493639.getClass(), "isTouch", false);
        setBooleanField(term493639, term493639.getClass(), "isBreak", false);
        setBooleanField(term493639, term493639.getClass(), "isCriticalDisp", false);
        setBooleanField(term493639, term493639.getClass(), "isFastLateDisp", false);
        setIntField(term493639, term493639.getClass(), "fastCount", 0);
        setIntField(term493639, term493639.getClass(), "lateCount", 0);
        setBooleanField(term493639, term493639.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term493639, term493639.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term493639, term493639.getClass(), "comboStatus", 0);
        setIntField(term493639, term493639.getClass(), "syncStatus", 0);
        setBooleanField(term493639, term493639.getClass(), "isClear", false);
        setIntField(term493639, term493639.getClass(), "beforeRating", 0);
        setIntField(term493639, term493639.getClass(), "afterRating", 0);
        setIntField(term493639, term493639.getClass(), "beforeGrade", 0);
        setIntField(term493639, term493639.getClass(), "afterGrade", 0);
        setIntField(term493639, term493639.getClass(), "afterGradeRank", 0);
        setIntField(term493639, term493639.getClass(), "beforeDeluxRating", 0);
        setIntField(term493639, term493639.getClass(), "afterDeluxRating", 0);
        setBooleanField(term493639, term493639.getClass(), "isPlayTutorial", false);
        setBooleanField(term493639, term493639.getClass(), "isEventMode", false);
        setBooleanField(term493639, term493639.getClass(), "isFreedomMode", false);
        setIntField(term493639, term493639.getClass(), "playMode", 0);
        setBooleanField(term493639, term493639.getClass(), "isNewFree", false);
        setIntField(term493639, term493639.getClass(), "trialPlayAchievement", 0);
        setIntField(term493639, term493639.getClass(), "extNum1", 0);
        setIntField(term493639, term493639.getClass(), "extNum2", 0);
        term493739 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term493739;
        callMethod(klass, "setTouchPerfect", argTypes, term493639, args);
    }

};


