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
import java.lang.Long;

public class UserPlaylog_setPlayedUserId1_727049345349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term488851;
     Object term488951;

    public UserPlaylog_setPlayedUserId1_727049345349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term488851 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term488851, term488851.getClass(), "id", 0L);
        setField(term488851, term488851.getClass(), "user", null);
        setIntField(term488851, term488851.getClass(), "orderId", 0);
        setLongField(term488851, term488851.getClass(), "playlogId", 0L);
        setIntField(term488851, term488851.getClass(), "version", 0);
        setIntField(term488851, term488851.getClass(), "placeId", 0);
        setField(term488851, term488851.getClass(), "placeName", null);
        setLongField(term488851, term488851.getClass(), "loginDate", 0L);
        setField(term488851, term488851.getClass(), "playDate", null);
        setField(term488851, term488851.getClass(), "userPlayDate", null);
        setIntField(term488851, term488851.getClass(), "type", 0);
        setIntField(term488851, term488851.getClass(), "musicId", 0);
        setIntField(term488851, term488851.getClass(), "level", 0);
        setIntField(term488851, term488851.getClass(), "trackNo", 0);
        setIntField(term488851, term488851.getClass(), "vsMode", 0);
        setField(term488851, term488851.getClass(), "vsUserName", null);
        setIntField(term488851, term488851.getClass(), "vsStatus", 0);
        setIntField(term488851, term488851.getClass(), "vsUserRating", 0);
        setIntField(term488851, term488851.getClass(), "vsUserAchievement", 0);
        setIntField(term488851, term488851.getClass(), "vsUserGradeRank", 0);
        setIntField(term488851, term488851.getClass(), "vsRank", 0);
        setIntField(term488851, term488851.getClass(), "playerNum", 0);
        setLongField(term488851, term488851.getClass(), "playedUserId1", 0L);
        setField(term488851, term488851.getClass(), "playedUserName1", null);
        setIntField(term488851, term488851.getClass(), "playedMusicLevel1", 0);
        setLongField(term488851, term488851.getClass(), "playedUserId2", 0L);
        setField(term488851, term488851.getClass(), "playedUserName2", null);
        setIntField(term488851, term488851.getClass(), "playedMusicLevel2", 0);
        setLongField(term488851, term488851.getClass(), "playedUserId3", 0L);
        setField(term488851, term488851.getClass(), "playedUserName3", null);
        setIntField(term488851, term488851.getClass(), "playedMusicLevel3", 0);
        setIntField(term488851, term488851.getClass(), "characterId1", 0);
        setIntField(term488851, term488851.getClass(), "characterLevel1", 0);
        setIntField(term488851, term488851.getClass(), "characterAwakening1", 0);
        setIntField(term488851, term488851.getClass(), "characterId2", 0);
        setIntField(term488851, term488851.getClass(), "characterLevel2", 0);
        setIntField(term488851, term488851.getClass(), "characterAwakening2", 0);
        setIntField(term488851, term488851.getClass(), "characterId3", 0);
        setIntField(term488851, term488851.getClass(), "characterLevel3", 0);
        setIntField(term488851, term488851.getClass(), "characterAwakening3", 0);
        setIntField(term488851, term488851.getClass(), "characterId4", 0);
        setIntField(term488851, term488851.getClass(), "characterLevel4", 0);
        setIntField(term488851, term488851.getClass(), "characterAwakening4", 0);
        setIntField(term488851, term488851.getClass(), "characterId5", 0);
        setIntField(term488851, term488851.getClass(), "characterLevel5", 0);
        setIntField(term488851, term488851.getClass(), "characterAwakening5", 0);
        setIntField(term488851, term488851.getClass(), "achievement", 0);
        setIntField(term488851, term488851.getClass(), "deluxscore", 0);
        setIntField(term488851, term488851.getClass(), "scoreRank", 0);
        setIntField(term488851, term488851.getClass(), "maxCombo", 0);
        setIntField(term488851, term488851.getClass(), "totalCombo", 0);
        setIntField(term488851, term488851.getClass(), "maxSync", 0);
        setIntField(term488851, term488851.getClass(), "totalSync", 0);
        setIntField(term488851, term488851.getClass(), "tapCriticalPerfect", 0);
        setIntField(term488851, term488851.getClass(), "tapPerfect", 0);
        setIntField(term488851, term488851.getClass(), "tapGreat", 0);
        setIntField(term488851, term488851.getClass(), "tapGood", 0);
        setIntField(term488851, term488851.getClass(), "tapMiss", 0);
        setIntField(term488851, term488851.getClass(), "holdCriticalPerfect", 0);
        setIntField(term488851, term488851.getClass(), "holdPerfect", 0);
        setIntField(term488851, term488851.getClass(), "holdGreat", 0);
        setIntField(term488851, term488851.getClass(), "holdGood", 0);
        setIntField(term488851, term488851.getClass(), "holdMiss", 0);
        setIntField(term488851, term488851.getClass(), "slideCriticalPerfect", 0);
        setIntField(term488851, term488851.getClass(), "slidePerfect", 0);
        setIntField(term488851, term488851.getClass(), "slideGreat", 0);
        setIntField(term488851, term488851.getClass(), "slideGood", 0);
        setIntField(term488851, term488851.getClass(), "slideMiss", 0);
        setIntField(term488851, term488851.getClass(), "touchCriticalPerfect", 0);
        setIntField(term488851, term488851.getClass(), "touchPerfect", 0);
        setIntField(term488851, term488851.getClass(), "touchGreat", 0);
        setIntField(term488851, term488851.getClass(), "touchGood", 0);
        setIntField(term488851, term488851.getClass(), "touchMiss", 0);
        setIntField(term488851, term488851.getClass(), "breakCriticalPerfect", 0);
        setIntField(term488851, term488851.getClass(), "breakPerfect", 0);
        setIntField(term488851, term488851.getClass(), "breakGreat", 0);
        setIntField(term488851, term488851.getClass(), "breakGood", 0);
        setIntField(term488851, term488851.getClass(), "breakMiss", 0);
        setBooleanField(term488851, term488851.getClass(), "isTap", false);
        setBooleanField(term488851, term488851.getClass(), "isHold", false);
        setBooleanField(term488851, term488851.getClass(), "isSlide", false);
        setBooleanField(term488851, term488851.getClass(), "isTouch", false);
        setBooleanField(term488851, term488851.getClass(), "isBreak", false);
        setBooleanField(term488851, term488851.getClass(), "isCriticalDisp", false);
        setBooleanField(term488851, term488851.getClass(), "isFastLateDisp", false);
        setIntField(term488851, term488851.getClass(), "fastCount", 0);
        setIntField(term488851, term488851.getClass(), "lateCount", 0);
        setBooleanField(term488851, term488851.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term488851, term488851.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term488851, term488851.getClass(), "comboStatus", 0);
        setIntField(term488851, term488851.getClass(), "syncStatus", 0);
        setBooleanField(term488851, term488851.getClass(), "isClear", false);
        setIntField(term488851, term488851.getClass(), "beforeRating", 0);
        setIntField(term488851, term488851.getClass(), "afterRating", 0);
        setIntField(term488851, term488851.getClass(), "beforeGrade", 0);
        setIntField(term488851, term488851.getClass(), "afterGrade", 0);
        setIntField(term488851, term488851.getClass(), "afterGradeRank", 0);
        setIntField(term488851, term488851.getClass(), "beforeDeluxRating", 0);
        setIntField(term488851, term488851.getClass(), "afterDeluxRating", 0);
        setBooleanField(term488851, term488851.getClass(), "isPlayTutorial", false);
        setBooleanField(term488851, term488851.getClass(), "isEventMode", false);
        setBooleanField(term488851, term488851.getClass(), "isFreedomMode", false);
        setIntField(term488851, term488851.getClass(), "playMode", 0);
        setBooleanField(term488851, term488851.getClass(), "isNewFree", false);
        setIntField(term488851, term488851.getClass(), "trialPlayAchievement", 0);
        setIntField(term488851, term488851.getClass(), "extNum1", 0);
        setIntField(term488851, term488851.getClass(), "extNum2", 0);
        term488951 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term488951;
        callMethod(klass, "setPlayedUserId1", argTypes, term488851, args);
    }

};


