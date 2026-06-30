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

public class UserPlaylog_setTouch_741369832408 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term494863;
     Object term494963;

    public UserPlaylog_setTouch_741369832408() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term494863 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term494863, term494863.getClass(), "id", 0L);
        setField(term494863, term494863.getClass(), "user", null);
        setIntField(term494863, term494863.getClass(), "orderId", 0);
        setLongField(term494863, term494863.getClass(), "playlogId", 0L);
        setIntField(term494863, term494863.getClass(), "version", 0);
        setIntField(term494863, term494863.getClass(), "placeId", 0);
        setField(term494863, term494863.getClass(), "placeName", null);
        setLongField(term494863, term494863.getClass(), "loginDate", 0L);
        setField(term494863, term494863.getClass(), "playDate", null);
        setField(term494863, term494863.getClass(), "userPlayDate", null);
        setIntField(term494863, term494863.getClass(), "type", 0);
        setIntField(term494863, term494863.getClass(), "musicId", 0);
        setIntField(term494863, term494863.getClass(), "level", 0);
        setIntField(term494863, term494863.getClass(), "trackNo", 0);
        setIntField(term494863, term494863.getClass(), "vsMode", 0);
        setField(term494863, term494863.getClass(), "vsUserName", null);
        setIntField(term494863, term494863.getClass(), "vsStatus", 0);
        setIntField(term494863, term494863.getClass(), "vsUserRating", 0);
        setIntField(term494863, term494863.getClass(), "vsUserAchievement", 0);
        setIntField(term494863, term494863.getClass(), "vsUserGradeRank", 0);
        setIntField(term494863, term494863.getClass(), "vsRank", 0);
        setIntField(term494863, term494863.getClass(), "playerNum", 0);
        setLongField(term494863, term494863.getClass(), "playedUserId1", 0L);
        setField(term494863, term494863.getClass(), "playedUserName1", null);
        setIntField(term494863, term494863.getClass(), "playedMusicLevel1", 0);
        setLongField(term494863, term494863.getClass(), "playedUserId2", 0L);
        setField(term494863, term494863.getClass(), "playedUserName2", null);
        setIntField(term494863, term494863.getClass(), "playedMusicLevel2", 0);
        setLongField(term494863, term494863.getClass(), "playedUserId3", 0L);
        setField(term494863, term494863.getClass(), "playedUserName3", null);
        setIntField(term494863, term494863.getClass(), "playedMusicLevel3", 0);
        setIntField(term494863, term494863.getClass(), "characterId1", 0);
        setIntField(term494863, term494863.getClass(), "characterLevel1", 0);
        setIntField(term494863, term494863.getClass(), "characterAwakening1", 0);
        setIntField(term494863, term494863.getClass(), "characterId2", 0);
        setIntField(term494863, term494863.getClass(), "characterLevel2", 0);
        setIntField(term494863, term494863.getClass(), "characterAwakening2", 0);
        setIntField(term494863, term494863.getClass(), "characterId3", 0);
        setIntField(term494863, term494863.getClass(), "characterLevel3", 0);
        setIntField(term494863, term494863.getClass(), "characterAwakening3", 0);
        setIntField(term494863, term494863.getClass(), "characterId4", 0);
        setIntField(term494863, term494863.getClass(), "characterLevel4", 0);
        setIntField(term494863, term494863.getClass(), "characterAwakening4", 0);
        setIntField(term494863, term494863.getClass(), "characterId5", 0);
        setIntField(term494863, term494863.getClass(), "characterLevel5", 0);
        setIntField(term494863, term494863.getClass(), "characterAwakening5", 0);
        setIntField(term494863, term494863.getClass(), "achievement", 0);
        setIntField(term494863, term494863.getClass(), "deluxscore", 0);
        setIntField(term494863, term494863.getClass(), "scoreRank", 0);
        setIntField(term494863, term494863.getClass(), "maxCombo", 0);
        setIntField(term494863, term494863.getClass(), "totalCombo", 0);
        setIntField(term494863, term494863.getClass(), "maxSync", 0);
        setIntField(term494863, term494863.getClass(), "totalSync", 0);
        setIntField(term494863, term494863.getClass(), "tapCriticalPerfect", 0);
        setIntField(term494863, term494863.getClass(), "tapPerfect", 0);
        setIntField(term494863, term494863.getClass(), "tapGreat", 0);
        setIntField(term494863, term494863.getClass(), "tapGood", 0);
        setIntField(term494863, term494863.getClass(), "tapMiss", 0);
        setIntField(term494863, term494863.getClass(), "holdCriticalPerfect", 0);
        setIntField(term494863, term494863.getClass(), "holdPerfect", 0);
        setIntField(term494863, term494863.getClass(), "holdGreat", 0);
        setIntField(term494863, term494863.getClass(), "holdGood", 0);
        setIntField(term494863, term494863.getClass(), "holdMiss", 0);
        setIntField(term494863, term494863.getClass(), "slideCriticalPerfect", 0);
        setIntField(term494863, term494863.getClass(), "slidePerfect", 0);
        setIntField(term494863, term494863.getClass(), "slideGreat", 0);
        setIntField(term494863, term494863.getClass(), "slideGood", 0);
        setIntField(term494863, term494863.getClass(), "slideMiss", 0);
        setIntField(term494863, term494863.getClass(), "touchCriticalPerfect", 0);
        setIntField(term494863, term494863.getClass(), "touchPerfect", 0);
        setIntField(term494863, term494863.getClass(), "touchGreat", 0);
        setIntField(term494863, term494863.getClass(), "touchGood", 0);
        setIntField(term494863, term494863.getClass(), "touchMiss", 0);
        setIntField(term494863, term494863.getClass(), "breakCriticalPerfect", 0);
        setIntField(term494863, term494863.getClass(), "breakPerfect", 0);
        setIntField(term494863, term494863.getClass(), "breakGreat", 0);
        setIntField(term494863, term494863.getClass(), "breakGood", 0);
        setIntField(term494863, term494863.getClass(), "breakMiss", 0);
        setBooleanField(term494863, term494863.getClass(), "isTap", false);
        setBooleanField(term494863, term494863.getClass(), "isHold", false);
        setBooleanField(term494863, term494863.getClass(), "isSlide", false);
        setBooleanField(term494863, term494863.getClass(), "isTouch", false);
        setBooleanField(term494863, term494863.getClass(), "isBreak", false);
        setBooleanField(term494863, term494863.getClass(), "isCriticalDisp", false);
        setBooleanField(term494863, term494863.getClass(), "isFastLateDisp", false);
        setIntField(term494863, term494863.getClass(), "fastCount", 0);
        setIntField(term494863, term494863.getClass(), "lateCount", 0);
        setBooleanField(term494863, term494863.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term494863, term494863.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term494863, term494863.getClass(), "comboStatus", 0);
        setIntField(term494863, term494863.getClass(), "syncStatus", 0);
        setBooleanField(term494863, term494863.getClass(), "isClear", false);
        setIntField(term494863, term494863.getClass(), "beforeRating", 0);
        setIntField(term494863, term494863.getClass(), "afterRating", 0);
        setIntField(term494863, term494863.getClass(), "beforeGrade", 0);
        setIntField(term494863, term494863.getClass(), "afterGrade", 0);
        setIntField(term494863, term494863.getClass(), "afterGradeRank", 0);
        setIntField(term494863, term494863.getClass(), "beforeDeluxRating", 0);
        setIntField(term494863, term494863.getClass(), "afterDeluxRating", 0);
        setBooleanField(term494863, term494863.getClass(), "isPlayTutorial", false);
        setBooleanField(term494863, term494863.getClass(), "isEventMode", false);
        setBooleanField(term494863, term494863.getClass(), "isFreedomMode", false);
        setIntField(term494863, term494863.getClass(), "playMode", 0);
        setBooleanField(term494863, term494863.getClass(), "isNewFree", false);
        setIntField(term494863, term494863.getClass(), "trialPlayAchievement", 0);
        setIntField(term494863, term494863.getClass(), "extNum1", 0);
        setIntField(term494863, term494863.getClass(), "extNum2", 0);
        term494963 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term494963;
        callMethod(klass, "setTouch", argTypes, term494863, args);
    }

};


