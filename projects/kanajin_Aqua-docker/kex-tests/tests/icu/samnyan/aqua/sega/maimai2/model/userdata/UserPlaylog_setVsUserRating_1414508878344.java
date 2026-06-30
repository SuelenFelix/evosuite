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

public class UserPlaylog_setVsUserRating_1414508878344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term488341;
     Object term488441;

    public UserPlaylog_setVsUserRating_1414508878344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term488341 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term488341, term488341.getClass(), "id", 0L);
        setField(term488341, term488341.getClass(), "user", null);
        setIntField(term488341, term488341.getClass(), "orderId", 0);
        setLongField(term488341, term488341.getClass(), "playlogId", 0L);
        setIntField(term488341, term488341.getClass(), "version", 0);
        setIntField(term488341, term488341.getClass(), "placeId", 0);
        setField(term488341, term488341.getClass(), "placeName", null);
        setLongField(term488341, term488341.getClass(), "loginDate", 0L);
        setField(term488341, term488341.getClass(), "playDate", null);
        setField(term488341, term488341.getClass(), "userPlayDate", null);
        setIntField(term488341, term488341.getClass(), "type", 0);
        setIntField(term488341, term488341.getClass(), "musicId", 0);
        setIntField(term488341, term488341.getClass(), "level", 0);
        setIntField(term488341, term488341.getClass(), "trackNo", 0);
        setIntField(term488341, term488341.getClass(), "vsMode", 0);
        setField(term488341, term488341.getClass(), "vsUserName", null);
        setIntField(term488341, term488341.getClass(), "vsStatus", 0);
        setIntField(term488341, term488341.getClass(), "vsUserRating", 0);
        setIntField(term488341, term488341.getClass(), "vsUserAchievement", 0);
        setIntField(term488341, term488341.getClass(), "vsUserGradeRank", 0);
        setIntField(term488341, term488341.getClass(), "vsRank", 0);
        setIntField(term488341, term488341.getClass(), "playerNum", 0);
        setLongField(term488341, term488341.getClass(), "playedUserId1", 0L);
        setField(term488341, term488341.getClass(), "playedUserName1", null);
        setIntField(term488341, term488341.getClass(), "playedMusicLevel1", 0);
        setLongField(term488341, term488341.getClass(), "playedUserId2", 0L);
        setField(term488341, term488341.getClass(), "playedUserName2", null);
        setIntField(term488341, term488341.getClass(), "playedMusicLevel2", 0);
        setLongField(term488341, term488341.getClass(), "playedUserId3", 0L);
        setField(term488341, term488341.getClass(), "playedUserName3", null);
        setIntField(term488341, term488341.getClass(), "playedMusicLevel3", 0);
        setIntField(term488341, term488341.getClass(), "characterId1", 0);
        setIntField(term488341, term488341.getClass(), "characterLevel1", 0);
        setIntField(term488341, term488341.getClass(), "characterAwakening1", 0);
        setIntField(term488341, term488341.getClass(), "characterId2", 0);
        setIntField(term488341, term488341.getClass(), "characterLevel2", 0);
        setIntField(term488341, term488341.getClass(), "characterAwakening2", 0);
        setIntField(term488341, term488341.getClass(), "characterId3", 0);
        setIntField(term488341, term488341.getClass(), "characterLevel3", 0);
        setIntField(term488341, term488341.getClass(), "characterAwakening3", 0);
        setIntField(term488341, term488341.getClass(), "characterId4", 0);
        setIntField(term488341, term488341.getClass(), "characterLevel4", 0);
        setIntField(term488341, term488341.getClass(), "characterAwakening4", 0);
        setIntField(term488341, term488341.getClass(), "characterId5", 0);
        setIntField(term488341, term488341.getClass(), "characterLevel5", 0);
        setIntField(term488341, term488341.getClass(), "characterAwakening5", 0);
        setIntField(term488341, term488341.getClass(), "achievement", 0);
        setIntField(term488341, term488341.getClass(), "deluxscore", 0);
        setIntField(term488341, term488341.getClass(), "scoreRank", 0);
        setIntField(term488341, term488341.getClass(), "maxCombo", 0);
        setIntField(term488341, term488341.getClass(), "totalCombo", 0);
        setIntField(term488341, term488341.getClass(), "maxSync", 0);
        setIntField(term488341, term488341.getClass(), "totalSync", 0);
        setIntField(term488341, term488341.getClass(), "tapCriticalPerfect", 0);
        setIntField(term488341, term488341.getClass(), "tapPerfect", 0);
        setIntField(term488341, term488341.getClass(), "tapGreat", 0);
        setIntField(term488341, term488341.getClass(), "tapGood", 0);
        setIntField(term488341, term488341.getClass(), "tapMiss", 0);
        setIntField(term488341, term488341.getClass(), "holdCriticalPerfect", 0);
        setIntField(term488341, term488341.getClass(), "holdPerfect", 0);
        setIntField(term488341, term488341.getClass(), "holdGreat", 0);
        setIntField(term488341, term488341.getClass(), "holdGood", 0);
        setIntField(term488341, term488341.getClass(), "holdMiss", 0);
        setIntField(term488341, term488341.getClass(), "slideCriticalPerfect", 0);
        setIntField(term488341, term488341.getClass(), "slidePerfect", 0);
        setIntField(term488341, term488341.getClass(), "slideGreat", 0);
        setIntField(term488341, term488341.getClass(), "slideGood", 0);
        setIntField(term488341, term488341.getClass(), "slideMiss", 0);
        setIntField(term488341, term488341.getClass(), "touchCriticalPerfect", 0);
        setIntField(term488341, term488341.getClass(), "touchPerfect", 0);
        setIntField(term488341, term488341.getClass(), "touchGreat", 0);
        setIntField(term488341, term488341.getClass(), "touchGood", 0);
        setIntField(term488341, term488341.getClass(), "touchMiss", 0);
        setIntField(term488341, term488341.getClass(), "breakCriticalPerfect", 0);
        setIntField(term488341, term488341.getClass(), "breakPerfect", 0);
        setIntField(term488341, term488341.getClass(), "breakGreat", 0);
        setIntField(term488341, term488341.getClass(), "breakGood", 0);
        setIntField(term488341, term488341.getClass(), "breakMiss", 0);
        setBooleanField(term488341, term488341.getClass(), "isTap", false);
        setBooleanField(term488341, term488341.getClass(), "isHold", false);
        setBooleanField(term488341, term488341.getClass(), "isSlide", false);
        setBooleanField(term488341, term488341.getClass(), "isTouch", false);
        setBooleanField(term488341, term488341.getClass(), "isBreak", false);
        setBooleanField(term488341, term488341.getClass(), "isCriticalDisp", false);
        setBooleanField(term488341, term488341.getClass(), "isFastLateDisp", false);
        setIntField(term488341, term488341.getClass(), "fastCount", 0);
        setIntField(term488341, term488341.getClass(), "lateCount", 0);
        setBooleanField(term488341, term488341.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term488341, term488341.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term488341, term488341.getClass(), "comboStatus", 0);
        setIntField(term488341, term488341.getClass(), "syncStatus", 0);
        setBooleanField(term488341, term488341.getClass(), "isClear", false);
        setIntField(term488341, term488341.getClass(), "beforeRating", 0);
        setIntField(term488341, term488341.getClass(), "afterRating", 0);
        setIntField(term488341, term488341.getClass(), "beforeGrade", 0);
        setIntField(term488341, term488341.getClass(), "afterGrade", 0);
        setIntField(term488341, term488341.getClass(), "afterGradeRank", 0);
        setIntField(term488341, term488341.getClass(), "beforeDeluxRating", 0);
        setIntField(term488341, term488341.getClass(), "afterDeluxRating", 0);
        setBooleanField(term488341, term488341.getClass(), "isPlayTutorial", false);
        setBooleanField(term488341, term488341.getClass(), "isEventMode", false);
        setBooleanField(term488341, term488341.getClass(), "isFreedomMode", false);
        setIntField(term488341, term488341.getClass(), "playMode", 0);
        setBooleanField(term488341, term488341.getClass(), "isNewFree", false);
        setIntField(term488341, term488341.getClass(), "trialPlayAchievement", 0);
        setIntField(term488341, term488341.getClass(), "extNum1", 0);
        setIntField(term488341, term488341.getClass(), "extNum2", 0);
        term488441 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term488441;
        callMethod(klass, "setVsUserRating", argTypes, term488341, args);
    }

};


