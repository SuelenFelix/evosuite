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

public class UserPlaylog_getUserPlayDate_1585437539229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term476817;

    public UserPlaylog_getUserPlayDate_1585437539229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term476817 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term476817, term476817.getClass(), "id", 0L);
        setField(term476817, term476817.getClass(), "user", null);
        setIntField(term476817, term476817.getClass(), "orderId", 0);
        setLongField(term476817, term476817.getClass(), "playlogId", 0L);
        setIntField(term476817, term476817.getClass(), "version", 0);
        setIntField(term476817, term476817.getClass(), "placeId", 0);
        setField(term476817, term476817.getClass(), "placeName", null);
        setLongField(term476817, term476817.getClass(), "loginDate", 0L);
        setField(term476817, term476817.getClass(), "playDate", null);
        setField(term476817, term476817.getClass(), "userPlayDate", null);
        setIntField(term476817, term476817.getClass(), "type", 0);
        setIntField(term476817, term476817.getClass(), "musicId", 0);
        setIntField(term476817, term476817.getClass(), "level", 0);
        setIntField(term476817, term476817.getClass(), "trackNo", 0);
        setIntField(term476817, term476817.getClass(), "vsMode", 0);
        setField(term476817, term476817.getClass(), "vsUserName", null);
        setIntField(term476817, term476817.getClass(), "vsStatus", 0);
        setIntField(term476817, term476817.getClass(), "vsUserRating", 0);
        setIntField(term476817, term476817.getClass(), "vsUserAchievement", 0);
        setIntField(term476817, term476817.getClass(), "vsUserGradeRank", 0);
        setIntField(term476817, term476817.getClass(), "vsRank", 0);
        setIntField(term476817, term476817.getClass(), "playerNum", 0);
        setLongField(term476817, term476817.getClass(), "playedUserId1", 0L);
        setField(term476817, term476817.getClass(), "playedUserName1", null);
        setIntField(term476817, term476817.getClass(), "playedMusicLevel1", 0);
        setLongField(term476817, term476817.getClass(), "playedUserId2", 0L);
        setField(term476817, term476817.getClass(), "playedUserName2", null);
        setIntField(term476817, term476817.getClass(), "playedMusicLevel2", 0);
        setLongField(term476817, term476817.getClass(), "playedUserId3", 0L);
        setField(term476817, term476817.getClass(), "playedUserName3", null);
        setIntField(term476817, term476817.getClass(), "playedMusicLevel3", 0);
        setIntField(term476817, term476817.getClass(), "characterId1", 0);
        setIntField(term476817, term476817.getClass(), "characterLevel1", 0);
        setIntField(term476817, term476817.getClass(), "characterAwakening1", 0);
        setIntField(term476817, term476817.getClass(), "characterId2", 0);
        setIntField(term476817, term476817.getClass(), "characterLevel2", 0);
        setIntField(term476817, term476817.getClass(), "characterAwakening2", 0);
        setIntField(term476817, term476817.getClass(), "characterId3", 0);
        setIntField(term476817, term476817.getClass(), "characterLevel3", 0);
        setIntField(term476817, term476817.getClass(), "characterAwakening3", 0);
        setIntField(term476817, term476817.getClass(), "characterId4", 0);
        setIntField(term476817, term476817.getClass(), "characterLevel4", 0);
        setIntField(term476817, term476817.getClass(), "characterAwakening4", 0);
        setIntField(term476817, term476817.getClass(), "characterId5", 0);
        setIntField(term476817, term476817.getClass(), "characterLevel5", 0);
        setIntField(term476817, term476817.getClass(), "characterAwakening5", 0);
        setIntField(term476817, term476817.getClass(), "achievement", 0);
        setIntField(term476817, term476817.getClass(), "deluxscore", 0);
        setIntField(term476817, term476817.getClass(), "scoreRank", 0);
        setIntField(term476817, term476817.getClass(), "maxCombo", 0);
        setIntField(term476817, term476817.getClass(), "totalCombo", 0);
        setIntField(term476817, term476817.getClass(), "maxSync", 0);
        setIntField(term476817, term476817.getClass(), "totalSync", 0);
        setIntField(term476817, term476817.getClass(), "tapCriticalPerfect", 0);
        setIntField(term476817, term476817.getClass(), "tapPerfect", 0);
        setIntField(term476817, term476817.getClass(), "tapGreat", 0);
        setIntField(term476817, term476817.getClass(), "tapGood", 0);
        setIntField(term476817, term476817.getClass(), "tapMiss", 0);
        setIntField(term476817, term476817.getClass(), "holdCriticalPerfect", 0);
        setIntField(term476817, term476817.getClass(), "holdPerfect", 0);
        setIntField(term476817, term476817.getClass(), "holdGreat", 0);
        setIntField(term476817, term476817.getClass(), "holdGood", 0);
        setIntField(term476817, term476817.getClass(), "holdMiss", 0);
        setIntField(term476817, term476817.getClass(), "slideCriticalPerfect", 0);
        setIntField(term476817, term476817.getClass(), "slidePerfect", 0);
        setIntField(term476817, term476817.getClass(), "slideGreat", 0);
        setIntField(term476817, term476817.getClass(), "slideGood", 0);
        setIntField(term476817, term476817.getClass(), "slideMiss", 0);
        setIntField(term476817, term476817.getClass(), "touchCriticalPerfect", 0);
        setIntField(term476817, term476817.getClass(), "touchPerfect", 0);
        setIntField(term476817, term476817.getClass(), "touchGreat", 0);
        setIntField(term476817, term476817.getClass(), "touchGood", 0);
        setIntField(term476817, term476817.getClass(), "touchMiss", 0);
        setIntField(term476817, term476817.getClass(), "breakCriticalPerfect", 0);
        setIntField(term476817, term476817.getClass(), "breakPerfect", 0);
        setIntField(term476817, term476817.getClass(), "breakGreat", 0);
        setIntField(term476817, term476817.getClass(), "breakGood", 0);
        setIntField(term476817, term476817.getClass(), "breakMiss", 0);
        setBooleanField(term476817, term476817.getClass(), "isTap", false);
        setBooleanField(term476817, term476817.getClass(), "isHold", false);
        setBooleanField(term476817, term476817.getClass(), "isSlide", false);
        setBooleanField(term476817, term476817.getClass(), "isTouch", false);
        setBooleanField(term476817, term476817.getClass(), "isBreak", false);
        setBooleanField(term476817, term476817.getClass(), "isCriticalDisp", false);
        setBooleanField(term476817, term476817.getClass(), "isFastLateDisp", false);
        setIntField(term476817, term476817.getClass(), "fastCount", 0);
        setIntField(term476817, term476817.getClass(), "lateCount", 0);
        setBooleanField(term476817, term476817.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term476817, term476817.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term476817, term476817.getClass(), "comboStatus", 0);
        setIntField(term476817, term476817.getClass(), "syncStatus", 0);
        setBooleanField(term476817, term476817.getClass(), "isClear", false);
        setIntField(term476817, term476817.getClass(), "beforeRating", 0);
        setIntField(term476817, term476817.getClass(), "afterRating", 0);
        setIntField(term476817, term476817.getClass(), "beforeGrade", 0);
        setIntField(term476817, term476817.getClass(), "afterGrade", 0);
        setIntField(term476817, term476817.getClass(), "afterGradeRank", 0);
        setIntField(term476817, term476817.getClass(), "beforeDeluxRating", 0);
        setIntField(term476817, term476817.getClass(), "afterDeluxRating", 0);
        setBooleanField(term476817, term476817.getClass(), "isPlayTutorial", false);
        setBooleanField(term476817, term476817.getClass(), "isEventMode", false);
        setBooleanField(term476817, term476817.getClass(), "isFreedomMode", false);
        setIntField(term476817, term476817.getClass(), "playMode", 0);
        setBooleanField(term476817, term476817.getClass(), "isNewFree", false);
        setIntField(term476817, term476817.getClass(), "trialPlayAchievement", 0);
        setIntField(term476817, term476817.getClass(), "extNum1", 0);
        setIntField(term476817, term476817.getClass(), "extNum2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserPlayDate", argTypes, term476817, args);
    }

};


