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

public class UserPlaylog_getTotalSync_1822550302272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term481117;

    public UserPlaylog_getTotalSync_1822550302272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term481117 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term481117, term481117.getClass(), "id", 0L);
        setField(term481117, term481117.getClass(), "user", null);
        setIntField(term481117, term481117.getClass(), "orderId", 0);
        setLongField(term481117, term481117.getClass(), "playlogId", 0L);
        setIntField(term481117, term481117.getClass(), "version", 0);
        setIntField(term481117, term481117.getClass(), "placeId", 0);
        setField(term481117, term481117.getClass(), "placeName", null);
        setLongField(term481117, term481117.getClass(), "loginDate", 0L);
        setField(term481117, term481117.getClass(), "playDate", null);
        setField(term481117, term481117.getClass(), "userPlayDate", null);
        setIntField(term481117, term481117.getClass(), "type", 0);
        setIntField(term481117, term481117.getClass(), "musicId", 0);
        setIntField(term481117, term481117.getClass(), "level", 0);
        setIntField(term481117, term481117.getClass(), "trackNo", 0);
        setIntField(term481117, term481117.getClass(), "vsMode", 0);
        setField(term481117, term481117.getClass(), "vsUserName", null);
        setIntField(term481117, term481117.getClass(), "vsStatus", 0);
        setIntField(term481117, term481117.getClass(), "vsUserRating", 0);
        setIntField(term481117, term481117.getClass(), "vsUserAchievement", 0);
        setIntField(term481117, term481117.getClass(), "vsUserGradeRank", 0);
        setIntField(term481117, term481117.getClass(), "vsRank", 0);
        setIntField(term481117, term481117.getClass(), "playerNum", 0);
        setLongField(term481117, term481117.getClass(), "playedUserId1", 0L);
        setField(term481117, term481117.getClass(), "playedUserName1", null);
        setIntField(term481117, term481117.getClass(), "playedMusicLevel1", 0);
        setLongField(term481117, term481117.getClass(), "playedUserId2", 0L);
        setField(term481117, term481117.getClass(), "playedUserName2", null);
        setIntField(term481117, term481117.getClass(), "playedMusicLevel2", 0);
        setLongField(term481117, term481117.getClass(), "playedUserId3", 0L);
        setField(term481117, term481117.getClass(), "playedUserName3", null);
        setIntField(term481117, term481117.getClass(), "playedMusicLevel3", 0);
        setIntField(term481117, term481117.getClass(), "characterId1", 0);
        setIntField(term481117, term481117.getClass(), "characterLevel1", 0);
        setIntField(term481117, term481117.getClass(), "characterAwakening1", 0);
        setIntField(term481117, term481117.getClass(), "characterId2", 0);
        setIntField(term481117, term481117.getClass(), "characterLevel2", 0);
        setIntField(term481117, term481117.getClass(), "characterAwakening2", 0);
        setIntField(term481117, term481117.getClass(), "characterId3", 0);
        setIntField(term481117, term481117.getClass(), "characterLevel3", 0);
        setIntField(term481117, term481117.getClass(), "characterAwakening3", 0);
        setIntField(term481117, term481117.getClass(), "characterId4", 0);
        setIntField(term481117, term481117.getClass(), "characterLevel4", 0);
        setIntField(term481117, term481117.getClass(), "characterAwakening4", 0);
        setIntField(term481117, term481117.getClass(), "characterId5", 0);
        setIntField(term481117, term481117.getClass(), "characterLevel5", 0);
        setIntField(term481117, term481117.getClass(), "characterAwakening5", 0);
        setIntField(term481117, term481117.getClass(), "achievement", 0);
        setIntField(term481117, term481117.getClass(), "deluxscore", 0);
        setIntField(term481117, term481117.getClass(), "scoreRank", 0);
        setIntField(term481117, term481117.getClass(), "maxCombo", 0);
        setIntField(term481117, term481117.getClass(), "totalCombo", 0);
        setIntField(term481117, term481117.getClass(), "maxSync", 0);
        setIntField(term481117, term481117.getClass(), "totalSync", 0);
        setIntField(term481117, term481117.getClass(), "tapCriticalPerfect", 0);
        setIntField(term481117, term481117.getClass(), "tapPerfect", 0);
        setIntField(term481117, term481117.getClass(), "tapGreat", 0);
        setIntField(term481117, term481117.getClass(), "tapGood", 0);
        setIntField(term481117, term481117.getClass(), "tapMiss", 0);
        setIntField(term481117, term481117.getClass(), "holdCriticalPerfect", 0);
        setIntField(term481117, term481117.getClass(), "holdPerfect", 0);
        setIntField(term481117, term481117.getClass(), "holdGreat", 0);
        setIntField(term481117, term481117.getClass(), "holdGood", 0);
        setIntField(term481117, term481117.getClass(), "holdMiss", 0);
        setIntField(term481117, term481117.getClass(), "slideCriticalPerfect", 0);
        setIntField(term481117, term481117.getClass(), "slidePerfect", 0);
        setIntField(term481117, term481117.getClass(), "slideGreat", 0);
        setIntField(term481117, term481117.getClass(), "slideGood", 0);
        setIntField(term481117, term481117.getClass(), "slideMiss", 0);
        setIntField(term481117, term481117.getClass(), "touchCriticalPerfect", 0);
        setIntField(term481117, term481117.getClass(), "touchPerfect", 0);
        setIntField(term481117, term481117.getClass(), "touchGreat", 0);
        setIntField(term481117, term481117.getClass(), "touchGood", 0);
        setIntField(term481117, term481117.getClass(), "touchMiss", 0);
        setIntField(term481117, term481117.getClass(), "breakCriticalPerfect", 0);
        setIntField(term481117, term481117.getClass(), "breakPerfect", 0);
        setIntField(term481117, term481117.getClass(), "breakGreat", 0);
        setIntField(term481117, term481117.getClass(), "breakGood", 0);
        setIntField(term481117, term481117.getClass(), "breakMiss", 0);
        setBooleanField(term481117, term481117.getClass(), "isTap", false);
        setBooleanField(term481117, term481117.getClass(), "isHold", false);
        setBooleanField(term481117, term481117.getClass(), "isSlide", false);
        setBooleanField(term481117, term481117.getClass(), "isTouch", false);
        setBooleanField(term481117, term481117.getClass(), "isBreak", false);
        setBooleanField(term481117, term481117.getClass(), "isCriticalDisp", false);
        setBooleanField(term481117, term481117.getClass(), "isFastLateDisp", false);
        setIntField(term481117, term481117.getClass(), "fastCount", 0);
        setIntField(term481117, term481117.getClass(), "lateCount", 0);
        setBooleanField(term481117, term481117.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term481117, term481117.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term481117, term481117.getClass(), "comboStatus", 0);
        setIntField(term481117, term481117.getClass(), "syncStatus", 0);
        setBooleanField(term481117, term481117.getClass(), "isClear", false);
        setIntField(term481117, term481117.getClass(), "beforeRating", 0);
        setIntField(term481117, term481117.getClass(), "afterRating", 0);
        setIntField(term481117, term481117.getClass(), "beforeGrade", 0);
        setIntField(term481117, term481117.getClass(), "afterGrade", 0);
        setIntField(term481117, term481117.getClass(), "afterGradeRank", 0);
        setIntField(term481117, term481117.getClass(), "beforeDeluxRating", 0);
        setIntField(term481117, term481117.getClass(), "afterDeluxRating", 0);
        setBooleanField(term481117, term481117.getClass(), "isPlayTutorial", false);
        setBooleanField(term481117, term481117.getClass(), "isEventMode", false);
        setBooleanField(term481117, term481117.getClass(), "isFreedomMode", false);
        setIntField(term481117, term481117.getClass(), "playMode", 0);
        setBooleanField(term481117, term481117.getClass(), "isNewFree", false);
        setIntField(term481117, term481117.getClass(), "trialPlayAchievement", 0);
        setIntField(term481117, term481117.getClass(), "extNum1", 0);
        setIntField(term481117, term481117.getClass(), "extNum2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalSync", argTypes, term481117, args);
    }

};


