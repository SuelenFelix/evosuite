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

public class UserPlaylog_setTrackNo_1171550773340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term487935;
     Object term488035;

    public UserPlaylog_setTrackNo_1171550773340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term487935 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term487935, term487935.getClass(), "id", 0L);
        setField(term487935, term487935.getClass(), "user", null);
        setIntField(term487935, term487935.getClass(), "orderId", 0);
        setLongField(term487935, term487935.getClass(), "playlogId", 0L);
        setIntField(term487935, term487935.getClass(), "version", 0);
        setIntField(term487935, term487935.getClass(), "placeId", 0);
        setField(term487935, term487935.getClass(), "placeName", null);
        setLongField(term487935, term487935.getClass(), "loginDate", 0L);
        setField(term487935, term487935.getClass(), "playDate", null);
        setField(term487935, term487935.getClass(), "userPlayDate", null);
        setIntField(term487935, term487935.getClass(), "type", 0);
        setIntField(term487935, term487935.getClass(), "musicId", 0);
        setIntField(term487935, term487935.getClass(), "level", 0);
        setIntField(term487935, term487935.getClass(), "trackNo", 0);
        setIntField(term487935, term487935.getClass(), "vsMode", 0);
        setField(term487935, term487935.getClass(), "vsUserName", null);
        setIntField(term487935, term487935.getClass(), "vsStatus", 0);
        setIntField(term487935, term487935.getClass(), "vsUserRating", 0);
        setIntField(term487935, term487935.getClass(), "vsUserAchievement", 0);
        setIntField(term487935, term487935.getClass(), "vsUserGradeRank", 0);
        setIntField(term487935, term487935.getClass(), "vsRank", 0);
        setIntField(term487935, term487935.getClass(), "playerNum", 0);
        setLongField(term487935, term487935.getClass(), "playedUserId1", 0L);
        setField(term487935, term487935.getClass(), "playedUserName1", null);
        setIntField(term487935, term487935.getClass(), "playedMusicLevel1", 0);
        setLongField(term487935, term487935.getClass(), "playedUserId2", 0L);
        setField(term487935, term487935.getClass(), "playedUserName2", null);
        setIntField(term487935, term487935.getClass(), "playedMusicLevel2", 0);
        setLongField(term487935, term487935.getClass(), "playedUserId3", 0L);
        setField(term487935, term487935.getClass(), "playedUserName3", null);
        setIntField(term487935, term487935.getClass(), "playedMusicLevel3", 0);
        setIntField(term487935, term487935.getClass(), "characterId1", 0);
        setIntField(term487935, term487935.getClass(), "characterLevel1", 0);
        setIntField(term487935, term487935.getClass(), "characterAwakening1", 0);
        setIntField(term487935, term487935.getClass(), "characterId2", 0);
        setIntField(term487935, term487935.getClass(), "characterLevel2", 0);
        setIntField(term487935, term487935.getClass(), "characterAwakening2", 0);
        setIntField(term487935, term487935.getClass(), "characterId3", 0);
        setIntField(term487935, term487935.getClass(), "characterLevel3", 0);
        setIntField(term487935, term487935.getClass(), "characterAwakening3", 0);
        setIntField(term487935, term487935.getClass(), "characterId4", 0);
        setIntField(term487935, term487935.getClass(), "characterLevel4", 0);
        setIntField(term487935, term487935.getClass(), "characterAwakening4", 0);
        setIntField(term487935, term487935.getClass(), "characterId5", 0);
        setIntField(term487935, term487935.getClass(), "characterLevel5", 0);
        setIntField(term487935, term487935.getClass(), "characterAwakening5", 0);
        setIntField(term487935, term487935.getClass(), "achievement", 0);
        setIntField(term487935, term487935.getClass(), "deluxscore", 0);
        setIntField(term487935, term487935.getClass(), "scoreRank", 0);
        setIntField(term487935, term487935.getClass(), "maxCombo", 0);
        setIntField(term487935, term487935.getClass(), "totalCombo", 0);
        setIntField(term487935, term487935.getClass(), "maxSync", 0);
        setIntField(term487935, term487935.getClass(), "totalSync", 0);
        setIntField(term487935, term487935.getClass(), "tapCriticalPerfect", 0);
        setIntField(term487935, term487935.getClass(), "tapPerfect", 0);
        setIntField(term487935, term487935.getClass(), "tapGreat", 0);
        setIntField(term487935, term487935.getClass(), "tapGood", 0);
        setIntField(term487935, term487935.getClass(), "tapMiss", 0);
        setIntField(term487935, term487935.getClass(), "holdCriticalPerfect", 0);
        setIntField(term487935, term487935.getClass(), "holdPerfect", 0);
        setIntField(term487935, term487935.getClass(), "holdGreat", 0);
        setIntField(term487935, term487935.getClass(), "holdGood", 0);
        setIntField(term487935, term487935.getClass(), "holdMiss", 0);
        setIntField(term487935, term487935.getClass(), "slideCriticalPerfect", 0);
        setIntField(term487935, term487935.getClass(), "slidePerfect", 0);
        setIntField(term487935, term487935.getClass(), "slideGreat", 0);
        setIntField(term487935, term487935.getClass(), "slideGood", 0);
        setIntField(term487935, term487935.getClass(), "slideMiss", 0);
        setIntField(term487935, term487935.getClass(), "touchCriticalPerfect", 0);
        setIntField(term487935, term487935.getClass(), "touchPerfect", 0);
        setIntField(term487935, term487935.getClass(), "touchGreat", 0);
        setIntField(term487935, term487935.getClass(), "touchGood", 0);
        setIntField(term487935, term487935.getClass(), "touchMiss", 0);
        setIntField(term487935, term487935.getClass(), "breakCriticalPerfect", 0);
        setIntField(term487935, term487935.getClass(), "breakPerfect", 0);
        setIntField(term487935, term487935.getClass(), "breakGreat", 0);
        setIntField(term487935, term487935.getClass(), "breakGood", 0);
        setIntField(term487935, term487935.getClass(), "breakMiss", 0);
        setBooleanField(term487935, term487935.getClass(), "isTap", false);
        setBooleanField(term487935, term487935.getClass(), "isHold", false);
        setBooleanField(term487935, term487935.getClass(), "isSlide", false);
        setBooleanField(term487935, term487935.getClass(), "isTouch", false);
        setBooleanField(term487935, term487935.getClass(), "isBreak", false);
        setBooleanField(term487935, term487935.getClass(), "isCriticalDisp", false);
        setBooleanField(term487935, term487935.getClass(), "isFastLateDisp", false);
        setIntField(term487935, term487935.getClass(), "fastCount", 0);
        setIntField(term487935, term487935.getClass(), "lateCount", 0);
        setBooleanField(term487935, term487935.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term487935, term487935.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term487935, term487935.getClass(), "comboStatus", 0);
        setIntField(term487935, term487935.getClass(), "syncStatus", 0);
        setBooleanField(term487935, term487935.getClass(), "isClear", false);
        setIntField(term487935, term487935.getClass(), "beforeRating", 0);
        setIntField(term487935, term487935.getClass(), "afterRating", 0);
        setIntField(term487935, term487935.getClass(), "beforeGrade", 0);
        setIntField(term487935, term487935.getClass(), "afterGrade", 0);
        setIntField(term487935, term487935.getClass(), "afterGradeRank", 0);
        setIntField(term487935, term487935.getClass(), "beforeDeluxRating", 0);
        setIntField(term487935, term487935.getClass(), "afterDeluxRating", 0);
        setBooleanField(term487935, term487935.getClass(), "isPlayTutorial", false);
        setBooleanField(term487935, term487935.getClass(), "isEventMode", false);
        setBooleanField(term487935, term487935.getClass(), "isFreedomMode", false);
        setIntField(term487935, term487935.getClass(), "playMode", 0);
        setBooleanField(term487935, term487935.getClass(), "isNewFree", false);
        setIntField(term487935, term487935.getClass(), "trialPlayAchievement", 0);
        setIntField(term487935, term487935.getClass(), "extNum1", 0);
        setIntField(term487935, term487935.getClass(), "extNum2", 0);
        term488035 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term488035;
        callMethod(klass, "setTrackNo", argTypes, term487935, args);
    }

};


