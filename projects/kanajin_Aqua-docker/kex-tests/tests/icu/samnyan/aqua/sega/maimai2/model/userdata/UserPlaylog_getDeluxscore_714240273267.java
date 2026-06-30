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

public class UserPlaylog_getDeluxscore_714240273267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term480617;

    public UserPlaylog_getDeluxscore_714240273267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term480617 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term480617, term480617.getClass(), "id", 0L);
        setField(term480617, term480617.getClass(), "user", null);
        setIntField(term480617, term480617.getClass(), "orderId", 0);
        setLongField(term480617, term480617.getClass(), "playlogId", 0L);
        setIntField(term480617, term480617.getClass(), "version", 0);
        setIntField(term480617, term480617.getClass(), "placeId", 0);
        setField(term480617, term480617.getClass(), "placeName", null);
        setLongField(term480617, term480617.getClass(), "loginDate", 0L);
        setField(term480617, term480617.getClass(), "playDate", null);
        setField(term480617, term480617.getClass(), "userPlayDate", null);
        setIntField(term480617, term480617.getClass(), "type", 0);
        setIntField(term480617, term480617.getClass(), "musicId", 0);
        setIntField(term480617, term480617.getClass(), "level", 0);
        setIntField(term480617, term480617.getClass(), "trackNo", 0);
        setIntField(term480617, term480617.getClass(), "vsMode", 0);
        setField(term480617, term480617.getClass(), "vsUserName", null);
        setIntField(term480617, term480617.getClass(), "vsStatus", 0);
        setIntField(term480617, term480617.getClass(), "vsUserRating", 0);
        setIntField(term480617, term480617.getClass(), "vsUserAchievement", 0);
        setIntField(term480617, term480617.getClass(), "vsUserGradeRank", 0);
        setIntField(term480617, term480617.getClass(), "vsRank", 0);
        setIntField(term480617, term480617.getClass(), "playerNum", 0);
        setLongField(term480617, term480617.getClass(), "playedUserId1", 0L);
        setField(term480617, term480617.getClass(), "playedUserName1", null);
        setIntField(term480617, term480617.getClass(), "playedMusicLevel1", 0);
        setLongField(term480617, term480617.getClass(), "playedUserId2", 0L);
        setField(term480617, term480617.getClass(), "playedUserName2", null);
        setIntField(term480617, term480617.getClass(), "playedMusicLevel2", 0);
        setLongField(term480617, term480617.getClass(), "playedUserId3", 0L);
        setField(term480617, term480617.getClass(), "playedUserName3", null);
        setIntField(term480617, term480617.getClass(), "playedMusicLevel3", 0);
        setIntField(term480617, term480617.getClass(), "characterId1", 0);
        setIntField(term480617, term480617.getClass(), "characterLevel1", 0);
        setIntField(term480617, term480617.getClass(), "characterAwakening1", 0);
        setIntField(term480617, term480617.getClass(), "characterId2", 0);
        setIntField(term480617, term480617.getClass(), "characterLevel2", 0);
        setIntField(term480617, term480617.getClass(), "characterAwakening2", 0);
        setIntField(term480617, term480617.getClass(), "characterId3", 0);
        setIntField(term480617, term480617.getClass(), "characterLevel3", 0);
        setIntField(term480617, term480617.getClass(), "characterAwakening3", 0);
        setIntField(term480617, term480617.getClass(), "characterId4", 0);
        setIntField(term480617, term480617.getClass(), "characterLevel4", 0);
        setIntField(term480617, term480617.getClass(), "characterAwakening4", 0);
        setIntField(term480617, term480617.getClass(), "characterId5", 0);
        setIntField(term480617, term480617.getClass(), "characterLevel5", 0);
        setIntField(term480617, term480617.getClass(), "characterAwakening5", 0);
        setIntField(term480617, term480617.getClass(), "achievement", 0);
        setIntField(term480617, term480617.getClass(), "deluxscore", 0);
        setIntField(term480617, term480617.getClass(), "scoreRank", 0);
        setIntField(term480617, term480617.getClass(), "maxCombo", 0);
        setIntField(term480617, term480617.getClass(), "totalCombo", 0);
        setIntField(term480617, term480617.getClass(), "maxSync", 0);
        setIntField(term480617, term480617.getClass(), "totalSync", 0);
        setIntField(term480617, term480617.getClass(), "tapCriticalPerfect", 0);
        setIntField(term480617, term480617.getClass(), "tapPerfect", 0);
        setIntField(term480617, term480617.getClass(), "tapGreat", 0);
        setIntField(term480617, term480617.getClass(), "tapGood", 0);
        setIntField(term480617, term480617.getClass(), "tapMiss", 0);
        setIntField(term480617, term480617.getClass(), "holdCriticalPerfect", 0);
        setIntField(term480617, term480617.getClass(), "holdPerfect", 0);
        setIntField(term480617, term480617.getClass(), "holdGreat", 0);
        setIntField(term480617, term480617.getClass(), "holdGood", 0);
        setIntField(term480617, term480617.getClass(), "holdMiss", 0);
        setIntField(term480617, term480617.getClass(), "slideCriticalPerfect", 0);
        setIntField(term480617, term480617.getClass(), "slidePerfect", 0);
        setIntField(term480617, term480617.getClass(), "slideGreat", 0);
        setIntField(term480617, term480617.getClass(), "slideGood", 0);
        setIntField(term480617, term480617.getClass(), "slideMiss", 0);
        setIntField(term480617, term480617.getClass(), "touchCriticalPerfect", 0);
        setIntField(term480617, term480617.getClass(), "touchPerfect", 0);
        setIntField(term480617, term480617.getClass(), "touchGreat", 0);
        setIntField(term480617, term480617.getClass(), "touchGood", 0);
        setIntField(term480617, term480617.getClass(), "touchMiss", 0);
        setIntField(term480617, term480617.getClass(), "breakCriticalPerfect", 0);
        setIntField(term480617, term480617.getClass(), "breakPerfect", 0);
        setIntField(term480617, term480617.getClass(), "breakGreat", 0);
        setIntField(term480617, term480617.getClass(), "breakGood", 0);
        setIntField(term480617, term480617.getClass(), "breakMiss", 0);
        setBooleanField(term480617, term480617.getClass(), "isTap", false);
        setBooleanField(term480617, term480617.getClass(), "isHold", false);
        setBooleanField(term480617, term480617.getClass(), "isSlide", false);
        setBooleanField(term480617, term480617.getClass(), "isTouch", false);
        setBooleanField(term480617, term480617.getClass(), "isBreak", false);
        setBooleanField(term480617, term480617.getClass(), "isCriticalDisp", false);
        setBooleanField(term480617, term480617.getClass(), "isFastLateDisp", false);
        setIntField(term480617, term480617.getClass(), "fastCount", 0);
        setIntField(term480617, term480617.getClass(), "lateCount", 0);
        setBooleanField(term480617, term480617.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term480617, term480617.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term480617, term480617.getClass(), "comboStatus", 0);
        setIntField(term480617, term480617.getClass(), "syncStatus", 0);
        setBooleanField(term480617, term480617.getClass(), "isClear", false);
        setIntField(term480617, term480617.getClass(), "beforeRating", 0);
        setIntField(term480617, term480617.getClass(), "afterRating", 0);
        setIntField(term480617, term480617.getClass(), "beforeGrade", 0);
        setIntField(term480617, term480617.getClass(), "afterGrade", 0);
        setIntField(term480617, term480617.getClass(), "afterGradeRank", 0);
        setIntField(term480617, term480617.getClass(), "beforeDeluxRating", 0);
        setIntField(term480617, term480617.getClass(), "afterDeluxRating", 0);
        setBooleanField(term480617, term480617.getClass(), "isPlayTutorial", false);
        setBooleanField(term480617, term480617.getClass(), "isEventMode", false);
        setBooleanField(term480617, term480617.getClass(), "isFreedomMode", false);
        setIntField(term480617, term480617.getClass(), "playMode", 0);
        setBooleanField(term480617, term480617.getClass(), "isNewFree", false);
        setIntField(term480617, term480617.getClass(), "trialPlayAchievement", 0);
        setIntField(term480617, term480617.getClass(), "extNum1", 0);
        setIntField(term480617, term480617.getClass(), "extNum2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeluxscore", argTypes, term480617, args);
    }

};


