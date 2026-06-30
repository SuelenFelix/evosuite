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

public class UserPlaylog_getPlayedMusicLevel3_215941504250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term478917;

    public UserPlaylog_getPlayedMusicLevel3_215941504250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term478917 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term478917, term478917.getClass(), "id", 0L);
        setField(term478917, term478917.getClass(), "user", null);
        setIntField(term478917, term478917.getClass(), "orderId", 0);
        setLongField(term478917, term478917.getClass(), "playlogId", 0L);
        setIntField(term478917, term478917.getClass(), "version", 0);
        setIntField(term478917, term478917.getClass(), "placeId", 0);
        setField(term478917, term478917.getClass(), "placeName", null);
        setLongField(term478917, term478917.getClass(), "loginDate", 0L);
        setField(term478917, term478917.getClass(), "playDate", null);
        setField(term478917, term478917.getClass(), "userPlayDate", null);
        setIntField(term478917, term478917.getClass(), "type", 0);
        setIntField(term478917, term478917.getClass(), "musicId", 0);
        setIntField(term478917, term478917.getClass(), "level", 0);
        setIntField(term478917, term478917.getClass(), "trackNo", 0);
        setIntField(term478917, term478917.getClass(), "vsMode", 0);
        setField(term478917, term478917.getClass(), "vsUserName", null);
        setIntField(term478917, term478917.getClass(), "vsStatus", 0);
        setIntField(term478917, term478917.getClass(), "vsUserRating", 0);
        setIntField(term478917, term478917.getClass(), "vsUserAchievement", 0);
        setIntField(term478917, term478917.getClass(), "vsUserGradeRank", 0);
        setIntField(term478917, term478917.getClass(), "vsRank", 0);
        setIntField(term478917, term478917.getClass(), "playerNum", 0);
        setLongField(term478917, term478917.getClass(), "playedUserId1", 0L);
        setField(term478917, term478917.getClass(), "playedUserName1", null);
        setIntField(term478917, term478917.getClass(), "playedMusicLevel1", 0);
        setLongField(term478917, term478917.getClass(), "playedUserId2", 0L);
        setField(term478917, term478917.getClass(), "playedUserName2", null);
        setIntField(term478917, term478917.getClass(), "playedMusicLevel2", 0);
        setLongField(term478917, term478917.getClass(), "playedUserId3", 0L);
        setField(term478917, term478917.getClass(), "playedUserName3", null);
        setIntField(term478917, term478917.getClass(), "playedMusicLevel3", 0);
        setIntField(term478917, term478917.getClass(), "characterId1", 0);
        setIntField(term478917, term478917.getClass(), "characterLevel1", 0);
        setIntField(term478917, term478917.getClass(), "characterAwakening1", 0);
        setIntField(term478917, term478917.getClass(), "characterId2", 0);
        setIntField(term478917, term478917.getClass(), "characterLevel2", 0);
        setIntField(term478917, term478917.getClass(), "characterAwakening2", 0);
        setIntField(term478917, term478917.getClass(), "characterId3", 0);
        setIntField(term478917, term478917.getClass(), "characterLevel3", 0);
        setIntField(term478917, term478917.getClass(), "characterAwakening3", 0);
        setIntField(term478917, term478917.getClass(), "characterId4", 0);
        setIntField(term478917, term478917.getClass(), "characterLevel4", 0);
        setIntField(term478917, term478917.getClass(), "characterAwakening4", 0);
        setIntField(term478917, term478917.getClass(), "characterId5", 0);
        setIntField(term478917, term478917.getClass(), "characterLevel5", 0);
        setIntField(term478917, term478917.getClass(), "characterAwakening5", 0);
        setIntField(term478917, term478917.getClass(), "achievement", 0);
        setIntField(term478917, term478917.getClass(), "deluxscore", 0);
        setIntField(term478917, term478917.getClass(), "scoreRank", 0);
        setIntField(term478917, term478917.getClass(), "maxCombo", 0);
        setIntField(term478917, term478917.getClass(), "totalCombo", 0);
        setIntField(term478917, term478917.getClass(), "maxSync", 0);
        setIntField(term478917, term478917.getClass(), "totalSync", 0);
        setIntField(term478917, term478917.getClass(), "tapCriticalPerfect", 0);
        setIntField(term478917, term478917.getClass(), "tapPerfect", 0);
        setIntField(term478917, term478917.getClass(), "tapGreat", 0);
        setIntField(term478917, term478917.getClass(), "tapGood", 0);
        setIntField(term478917, term478917.getClass(), "tapMiss", 0);
        setIntField(term478917, term478917.getClass(), "holdCriticalPerfect", 0);
        setIntField(term478917, term478917.getClass(), "holdPerfect", 0);
        setIntField(term478917, term478917.getClass(), "holdGreat", 0);
        setIntField(term478917, term478917.getClass(), "holdGood", 0);
        setIntField(term478917, term478917.getClass(), "holdMiss", 0);
        setIntField(term478917, term478917.getClass(), "slideCriticalPerfect", 0);
        setIntField(term478917, term478917.getClass(), "slidePerfect", 0);
        setIntField(term478917, term478917.getClass(), "slideGreat", 0);
        setIntField(term478917, term478917.getClass(), "slideGood", 0);
        setIntField(term478917, term478917.getClass(), "slideMiss", 0);
        setIntField(term478917, term478917.getClass(), "touchCriticalPerfect", 0);
        setIntField(term478917, term478917.getClass(), "touchPerfect", 0);
        setIntField(term478917, term478917.getClass(), "touchGreat", 0);
        setIntField(term478917, term478917.getClass(), "touchGood", 0);
        setIntField(term478917, term478917.getClass(), "touchMiss", 0);
        setIntField(term478917, term478917.getClass(), "breakCriticalPerfect", 0);
        setIntField(term478917, term478917.getClass(), "breakPerfect", 0);
        setIntField(term478917, term478917.getClass(), "breakGreat", 0);
        setIntField(term478917, term478917.getClass(), "breakGood", 0);
        setIntField(term478917, term478917.getClass(), "breakMiss", 0);
        setBooleanField(term478917, term478917.getClass(), "isTap", false);
        setBooleanField(term478917, term478917.getClass(), "isHold", false);
        setBooleanField(term478917, term478917.getClass(), "isSlide", false);
        setBooleanField(term478917, term478917.getClass(), "isTouch", false);
        setBooleanField(term478917, term478917.getClass(), "isBreak", false);
        setBooleanField(term478917, term478917.getClass(), "isCriticalDisp", false);
        setBooleanField(term478917, term478917.getClass(), "isFastLateDisp", false);
        setIntField(term478917, term478917.getClass(), "fastCount", 0);
        setIntField(term478917, term478917.getClass(), "lateCount", 0);
        setBooleanField(term478917, term478917.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term478917, term478917.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term478917, term478917.getClass(), "comboStatus", 0);
        setIntField(term478917, term478917.getClass(), "syncStatus", 0);
        setBooleanField(term478917, term478917.getClass(), "isClear", false);
        setIntField(term478917, term478917.getClass(), "beforeRating", 0);
        setIntField(term478917, term478917.getClass(), "afterRating", 0);
        setIntField(term478917, term478917.getClass(), "beforeGrade", 0);
        setIntField(term478917, term478917.getClass(), "afterGrade", 0);
        setIntField(term478917, term478917.getClass(), "afterGradeRank", 0);
        setIntField(term478917, term478917.getClass(), "beforeDeluxRating", 0);
        setIntField(term478917, term478917.getClass(), "afterDeluxRating", 0);
        setBooleanField(term478917, term478917.getClass(), "isPlayTutorial", false);
        setBooleanField(term478917, term478917.getClass(), "isEventMode", false);
        setBooleanField(term478917, term478917.getClass(), "isFreedomMode", false);
        setIntField(term478917, term478917.getClass(), "playMode", 0);
        setBooleanField(term478917, term478917.getClass(), "isNewFree", false);
        setIntField(term478917, term478917.getClass(), "trialPlayAchievement", 0);
        setIntField(term478917, term478917.getClass(), "extNum1", 0);
        setIntField(term478917, term478917.getClass(), "extNum2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedMusicLevel3", argTypes, term478917, args);
    }

};


