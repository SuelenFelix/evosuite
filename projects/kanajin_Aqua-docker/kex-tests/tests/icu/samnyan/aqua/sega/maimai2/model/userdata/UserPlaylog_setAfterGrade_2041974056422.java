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

public class UserPlaylog_setAfterGrade_2041974056422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term496291;
     Object term496391;

    public UserPlaylog_setAfterGrade_2041974056422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term496291 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term496291, term496291.getClass(), "id", 0L);
        setField(term496291, term496291.getClass(), "user", null);
        setIntField(term496291, term496291.getClass(), "orderId", 0);
        setLongField(term496291, term496291.getClass(), "playlogId", 0L);
        setIntField(term496291, term496291.getClass(), "version", 0);
        setIntField(term496291, term496291.getClass(), "placeId", 0);
        setField(term496291, term496291.getClass(), "placeName", null);
        setLongField(term496291, term496291.getClass(), "loginDate", 0L);
        setField(term496291, term496291.getClass(), "playDate", null);
        setField(term496291, term496291.getClass(), "userPlayDate", null);
        setIntField(term496291, term496291.getClass(), "type", 0);
        setIntField(term496291, term496291.getClass(), "musicId", 0);
        setIntField(term496291, term496291.getClass(), "level", 0);
        setIntField(term496291, term496291.getClass(), "trackNo", 0);
        setIntField(term496291, term496291.getClass(), "vsMode", 0);
        setField(term496291, term496291.getClass(), "vsUserName", null);
        setIntField(term496291, term496291.getClass(), "vsStatus", 0);
        setIntField(term496291, term496291.getClass(), "vsUserRating", 0);
        setIntField(term496291, term496291.getClass(), "vsUserAchievement", 0);
        setIntField(term496291, term496291.getClass(), "vsUserGradeRank", 0);
        setIntField(term496291, term496291.getClass(), "vsRank", 0);
        setIntField(term496291, term496291.getClass(), "playerNum", 0);
        setLongField(term496291, term496291.getClass(), "playedUserId1", 0L);
        setField(term496291, term496291.getClass(), "playedUserName1", null);
        setIntField(term496291, term496291.getClass(), "playedMusicLevel1", 0);
        setLongField(term496291, term496291.getClass(), "playedUserId2", 0L);
        setField(term496291, term496291.getClass(), "playedUserName2", null);
        setIntField(term496291, term496291.getClass(), "playedMusicLevel2", 0);
        setLongField(term496291, term496291.getClass(), "playedUserId3", 0L);
        setField(term496291, term496291.getClass(), "playedUserName3", null);
        setIntField(term496291, term496291.getClass(), "playedMusicLevel3", 0);
        setIntField(term496291, term496291.getClass(), "characterId1", 0);
        setIntField(term496291, term496291.getClass(), "characterLevel1", 0);
        setIntField(term496291, term496291.getClass(), "characterAwakening1", 0);
        setIntField(term496291, term496291.getClass(), "characterId2", 0);
        setIntField(term496291, term496291.getClass(), "characterLevel2", 0);
        setIntField(term496291, term496291.getClass(), "characterAwakening2", 0);
        setIntField(term496291, term496291.getClass(), "characterId3", 0);
        setIntField(term496291, term496291.getClass(), "characterLevel3", 0);
        setIntField(term496291, term496291.getClass(), "characterAwakening3", 0);
        setIntField(term496291, term496291.getClass(), "characterId4", 0);
        setIntField(term496291, term496291.getClass(), "characterLevel4", 0);
        setIntField(term496291, term496291.getClass(), "characterAwakening4", 0);
        setIntField(term496291, term496291.getClass(), "characterId5", 0);
        setIntField(term496291, term496291.getClass(), "characterLevel5", 0);
        setIntField(term496291, term496291.getClass(), "characterAwakening5", 0);
        setIntField(term496291, term496291.getClass(), "achievement", 0);
        setIntField(term496291, term496291.getClass(), "deluxscore", 0);
        setIntField(term496291, term496291.getClass(), "scoreRank", 0);
        setIntField(term496291, term496291.getClass(), "maxCombo", 0);
        setIntField(term496291, term496291.getClass(), "totalCombo", 0);
        setIntField(term496291, term496291.getClass(), "maxSync", 0);
        setIntField(term496291, term496291.getClass(), "totalSync", 0);
        setIntField(term496291, term496291.getClass(), "tapCriticalPerfect", 0);
        setIntField(term496291, term496291.getClass(), "tapPerfect", 0);
        setIntField(term496291, term496291.getClass(), "tapGreat", 0);
        setIntField(term496291, term496291.getClass(), "tapGood", 0);
        setIntField(term496291, term496291.getClass(), "tapMiss", 0);
        setIntField(term496291, term496291.getClass(), "holdCriticalPerfect", 0);
        setIntField(term496291, term496291.getClass(), "holdPerfect", 0);
        setIntField(term496291, term496291.getClass(), "holdGreat", 0);
        setIntField(term496291, term496291.getClass(), "holdGood", 0);
        setIntField(term496291, term496291.getClass(), "holdMiss", 0);
        setIntField(term496291, term496291.getClass(), "slideCriticalPerfect", 0);
        setIntField(term496291, term496291.getClass(), "slidePerfect", 0);
        setIntField(term496291, term496291.getClass(), "slideGreat", 0);
        setIntField(term496291, term496291.getClass(), "slideGood", 0);
        setIntField(term496291, term496291.getClass(), "slideMiss", 0);
        setIntField(term496291, term496291.getClass(), "touchCriticalPerfect", 0);
        setIntField(term496291, term496291.getClass(), "touchPerfect", 0);
        setIntField(term496291, term496291.getClass(), "touchGreat", 0);
        setIntField(term496291, term496291.getClass(), "touchGood", 0);
        setIntField(term496291, term496291.getClass(), "touchMiss", 0);
        setIntField(term496291, term496291.getClass(), "breakCriticalPerfect", 0);
        setIntField(term496291, term496291.getClass(), "breakPerfect", 0);
        setIntField(term496291, term496291.getClass(), "breakGreat", 0);
        setIntField(term496291, term496291.getClass(), "breakGood", 0);
        setIntField(term496291, term496291.getClass(), "breakMiss", 0);
        setBooleanField(term496291, term496291.getClass(), "isTap", false);
        setBooleanField(term496291, term496291.getClass(), "isHold", false);
        setBooleanField(term496291, term496291.getClass(), "isSlide", false);
        setBooleanField(term496291, term496291.getClass(), "isTouch", false);
        setBooleanField(term496291, term496291.getClass(), "isBreak", false);
        setBooleanField(term496291, term496291.getClass(), "isCriticalDisp", false);
        setBooleanField(term496291, term496291.getClass(), "isFastLateDisp", false);
        setIntField(term496291, term496291.getClass(), "fastCount", 0);
        setIntField(term496291, term496291.getClass(), "lateCount", 0);
        setBooleanField(term496291, term496291.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term496291, term496291.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term496291, term496291.getClass(), "comboStatus", 0);
        setIntField(term496291, term496291.getClass(), "syncStatus", 0);
        setBooleanField(term496291, term496291.getClass(), "isClear", false);
        setIntField(term496291, term496291.getClass(), "beforeRating", 0);
        setIntField(term496291, term496291.getClass(), "afterRating", 0);
        setIntField(term496291, term496291.getClass(), "beforeGrade", 0);
        setIntField(term496291, term496291.getClass(), "afterGrade", 0);
        setIntField(term496291, term496291.getClass(), "afterGradeRank", 0);
        setIntField(term496291, term496291.getClass(), "beforeDeluxRating", 0);
        setIntField(term496291, term496291.getClass(), "afterDeluxRating", 0);
        setBooleanField(term496291, term496291.getClass(), "isPlayTutorial", false);
        setBooleanField(term496291, term496291.getClass(), "isEventMode", false);
        setBooleanField(term496291, term496291.getClass(), "isFreedomMode", false);
        setIntField(term496291, term496291.getClass(), "playMode", 0);
        setBooleanField(term496291, term496291.getClass(), "isNewFree", false);
        setIntField(term496291, term496291.getClass(), "trialPlayAchievement", 0);
        setIntField(term496291, term496291.getClass(), "extNum1", 0);
        setIntField(term496291, term496291.getClass(), "extNum2", 0);
        term496391 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term496391;
        callMethod(klass, "setAfterGrade", argTypes, term496291, args);
    }

};


