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

public class UserPlaylog_isClear_824107912311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term485017;

    public UserPlaylog_isClear_824107912311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term485017 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term485017, term485017.getClass(), "id", 0L);
        setField(term485017, term485017.getClass(), "user", null);
        setIntField(term485017, term485017.getClass(), "orderId", 0);
        setLongField(term485017, term485017.getClass(), "playlogId", 0L);
        setIntField(term485017, term485017.getClass(), "version", 0);
        setIntField(term485017, term485017.getClass(), "placeId", 0);
        setField(term485017, term485017.getClass(), "placeName", null);
        setLongField(term485017, term485017.getClass(), "loginDate", 0L);
        setField(term485017, term485017.getClass(), "playDate", null);
        setField(term485017, term485017.getClass(), "userPlayDate", null);
        setIntField(term485017, term485017.getClass(), "type", 0);
        setIntField(term485017, term485017.getClass(), "musicId", 0);
        setIntField(term485017, term485017.getClass(), "level", 0);
        setIntField(term485017, term485017.getClass(), "trackNo", 0);
        setIntField(term485017, term485017.getClass(), "vsMode", 0);
        setField(term485017, term485017.getClass(), "vsUserName", null);
        setIntField(term485017, term485017.getClass(), "vsStatus", 0);
        setIntField(term485017, term485017.getClass(), "vsUserRating", 0);
        setIntField(term485017, term485017.getClass(), "vsUserAchievement", 0);
        setIntField(term485017, term485017.getClass(), "vsUserGradeRank", 0);
        setIntField(term485017, term485017.getClass(), "vsRank", 0);
        setIntField(term485017, term485017.getClass(), "playerNum", 0);
        setLongField(term485017, term485017.getClass(), "playedUserId1", 0L);
        setField(term485017, term485017.getClass(), "playedUserName1", null);
        setIntField(term485017, term485017.getClass(), "playedMusicLevel1", 0);
        setLongField(term485017, term485017.getClass(), "playedUserId2", 0L);
        setField(term485017, term485017.getClass(), "playedUserName2", null);
        setIntField(term485017, term485017.getClass(), "playedMusicLevel2", 0);
        setLongField(term485017, term485017.getClass(), "playedUserId3", 0L);
        setField(term485017, term485017.getClass(), "playedUserName3", null);
        setIntField(term485017, term485017.getClass(), "playedMusicLevel3", 0);
        setIntField(term485017, term485017.getClass(), "characterId1", 0);
        setIntField(term485017, term485017.getClass(), "characterLevel1", 0);
        setIntField(term485017, term485017.getClass(), "characterAwakening1", 0);
        setIntField(term485017, term485017.getClass(), "characterId2", 0);
        setIntField(term485017, term485017.getClass(), "characterLevel2", 0);
        setIntField(term485017, term485017.getClass(), "characterAwakening2", 0);
        setIntField(term485017, term485017.getClass(), "characterId3", 0);
        setIntField(term485017, term485017.getClass(), "characterLevel3", 0);
        setIntField(term485017, term485017.getClass(), "characterAwakening3", 0);
        setIntField(term485017, term485017.getClass(), "characterId4", 0);
        setIntField(term485017, term485017.getClass(), "characterLevel4", 0);
        setIntField(term485017, term485017.getClass(), "characterAwakening4", 0);
        setIntField(term485017, term485017.getClass(), "characterId5", 0);
        setIntField(term485017, term485017.getClass(), "characterLevel5", 0);
        setIntField(term485017, term485017.getClass(), "characterAwakening5", 0);
        setIntField(term485017, term485017.getClass(), "achievement", 0);
        setIntField(term485017, term485017.getClass(), "deluxscore", 0);
        setIntField(term485017, term485017.getClass(), "scoreRank", 0);
        setIntField(term485017, term485017.getClass(), "maxCombo", 0);
        setIntField(term485017, term485017.getClass(), "totalCombo", 0);
        setIntField(term485017, term485017.getClass(), "maxSync", 0);
        setIntField(term485017, term485017.getClass(), "totalSync", 0);
        setIntField(term485017, term485017.getClass(), "tapCriticalPerfect", 0);
        setIntField(term485017, term485017.getClass(), "tapPerfect", 0);
        setIntField(term485017, term485017.getClass(), "tapGreat", 0);
        setIntField(term485017, term485017.getClass(), "tapGood", 0);
        setIntField(term485017, term485017.getClass(), "tapMiss", 0);
        setIntField(term485017, term485017.getClass(), "holdCriticalPerfect", 0);
        setIntField(term485017, term485017.getClass(), "holdPerfect", 0);
        setIntField(term485017, term485017.getClass(), "holdGreat", 0);
        setIntField(term485017, term485017.getClass(), "holdGood", 0);
        setIntField(term485017, term485017.getClass(), "holdMiss", 0);
        setIntField(term485017, term485017.getClass(), "slideCriticalPerfect", 0);
        setIntField(term485017, term485017.getClass(), "slidePerfect", 0);
        setIntField(term485017, term485017.getClass(), "slideGreat", 0);
        setIntField(term485017, term485017.getClass(), "slideGood", 0);
        setIntField(term485017, term485017.getClass(), "slideMiss", 0);
        setIntField(term485017, term485017.getClass(), "touchCriticalPerfect", 0);
        setIntField(term485017, term485017.getClass(), "touchPerfect", 0);
        setIntField(term485017, term485017.getClass(), "touchGreat", 0);
        setIntField(term485017, term485017.getClass(), "touchGood", 0);
        setIntField(term485017, term485017.getClass(), "touchMiss", 0);
        setIntField(term485017, term485017.getClass(), "breakCriticalPerfect", 0);
        setIntField(term485017, term485017.getClass(), "breakPerfect", 0);
        setIntField(term485017, term485017.getClass(), "breakGreat", 0);
        setIntField(term485017, term485017.getClass(), "breakGood", 0);
        setIntField(term485017, term485017.getClass(), "breakMiss", 0);
        setBooleanField(term485017, term485017.getClass(), "isTap", false);
        setBooleanField(term485017, term485017.getClass(), "isHold", false);
        setBooleanField(term485017, term485017.getClass(), "isSlide", false);
        setBooleanField(term485017, term485017.getClass(), "isTouch", false);
        setBooleanField(term485017, term485017.getClass(), "isBreak", false);
        setBooleanField(term485017, term485017.getClass(), "isCriticalDisp", false);
        setBooleanField(term485017, term485017.getClass(), "isFastLateDisp", false);
        setIntField(term485017, term485017.getClass(), "fastCount", 0);
        setIntField(term485017, term485017.getClass(), "lateCount", 0);
        setBooleanField(term485017, term485017.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term485017, term485017.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term485017, term485017.getClass(), "comboStatus", 0);
        setIntField(term485017, term485017.getClass(), "syncStatus", 0);
        setBooleanField(term485017, term485017.getClass(), "isClear", false);
        setIntField(term485017, term485017.getClass(), "beforeRating", 0);
        setIntField(term485017, term485017.getClass(), "afterRating", 0);
        setIntField(term485017, term485017.getClass(), "beforeGrade", 0);
        setIntField(term485017, term485017.getClass(), "afterGrade", 0);
        setIntField(term485017, term485017.getClass(), "afterGradeRank", 0);
        setIntField(term485017, term485017.getClass(), "beforeDeluxRating", 0);
        setIntField(term485017, term485017.getClass(), "afterDeluxRating", 0);
        setBooleanField(term485017, term485017.getClass(), "isPlayTutorial", false);
        setBooleanField(term485017, term485017.getClass(), "isEventMode", false);
        setBooleanField(term485017, term485017.getClass(), "isFreedomMode", false);
        setIntField(term485017, term485017.getClass(), "playMode", 0);
        setBooleanField(term485017, term485017.getClass(), "isNewFree", false);
        setIntField(term485017, term485017.getClass(), "trialPlayAchievement", 0);
        setIntField(term485017, term485017.getClass(), "extNum1", 0);
        setIntField(term485017, term485017.getClass(), "extNum2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isClear", argTypes, term485017, args);
    }

};


