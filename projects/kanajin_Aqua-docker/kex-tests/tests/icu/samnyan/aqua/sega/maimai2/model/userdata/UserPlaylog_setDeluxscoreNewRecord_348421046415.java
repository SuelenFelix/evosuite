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

public class UserPlaylog_setDeluxscoreNewRecord_348421046415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term495577;
     Object term495677;

    public UserPlaylog_setDeluxscoreNewRecord_348421046415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term495577 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term495577, term495577.getClass(), "id", 0L);
        setField(term495577, term495577.getClass(), "user", null);
        setIntField(term495577, term495577.getClass(), "orderId", 0);
        setLongField(term495577, term495577.getClass(), "playlogId", 0L);
        setIntField(term495577, term495577.getClass(), "version", 0);
        setIntField(term495577, term495577.getClass(), "placeId", 0);
        setField(term495577, term495577.getClass(), "placeName", null);
        setLongField(term495577, term495577.getClass(), "loginDate", 0L);
        setField(term495577, term495577.getClass(), "playDate", null);
        setField(term495577, term495577.getClass(), "userPlayDate", null);
        setIntField(term495577, term495577.getClass(), "type", 0);
        setIntField(term495577, term495577.getClass(), "musicId", 0);
        setIntField(term495577, term495577.getClass(), "level", 0);
        setIntField(term495577, term495577.getClass(), "trackNo", 0);
        setIntField(term495577, term495577.getClass(), "vsMode", 0);
        setField(term495577, term495577.getClass(), "vsUserName", null);
        setIntField(term495577, term495577.getClass(), "vsStatus", 0);
        setIntField(term495577, term495577.getClass(), "vsUserRating", 0);
        setIntField(term495577, term495577.getClass(), "vsUserAchievement", 0);
        setIntField(term495577, term495577.getClass(), "vsUserGradeRank", 0);
        setIntField(term495577, term495577.getClass(), "vsRank", 0);
        setIntField(term495577, term495577.getClass(), "playerNum", 0);
        setLongField(term495577, term495577.getClass(), "playedUserId1", 0L);
        setField(term495577, term495577.getClass(), "playedUserName1", null);
        setIntField(term495577, term495577.getClass(), "playedMusicLevel1", 0);
        setLongField(term495577, term495577.getClass(), "playedUserId2", 0L);
        setField(term495577, term495577.getClass(), "playedUserName2", null);
        setIntField(term495577, term495577.getClass(), "playedMusicLevel2", 0);
        setLongField(term495577, term495577.getClass(), "playedUserId3", 0L);
        setField(term495577, term495577.getClass(), "playedUserName3", null);
        setIntField(term495577, term495577.getClass(), "playedMusicLevel3", 0);
        setIntField(term495577, term495577.getClass(), "characterId1", 0);
        setIntField(term495577, term495577.getClass(), "characterLevel1", 0);
        setIntField(term495577, term495577.getClass(), "characterAwakening1", 0);
        setIntField(term495577, term495577.getClass(), "characterId2", 0);
        setIntField(term495577, term495577.getClass(), "characterLevel2", 0);
        setIntField(term495577, term495577.getClass(), "characterAwakening2", 0);
        setIntField(term495577, term495577.getClass(), "characterId3", 0);
        setIntField(term495577, term495577.getClass(), "characterLevel3", 0);
        setIntField(term495577, term495577.getClass(), "characterAwakening3", 0);
        setIntField(term495577, term495577.getClass(), "characterId4", 0);
        setIntField(term495577, term495577.getClass(), "characterLevel4", 0);
        setIntField(term495577, term495577.getClass(), "characterAwakening4", 0);
        setIntField(term495577, term495577.getClass(), "characterId5", 0);
        setIntField(term495577, term495577.getClass(), "characterLevel5", 0);
        setIntField(term495577, term495577.getClass(), "characterAwakening5", 0);
        setIntField(term495577, term495577.getClass(), "achievement", 0);
        setIntField(term495577, term495577.getClass(), "deluxscore", 0);
        setIntField(term495577, term495577.getClass(), "scoreRank", 0);
        setIntField(term495577, term495577.getClass(), "maxCombo", 0);
        setIntField(term495577, term495577.getClass(), "totalCombo", 0);
        setIntField(term495577, term495577.getClass(), "maxSync", 0);
        setIntField(term495577, term495577.getClass(), "totalSync", 0);
        setIntField(term495577, term495577.getClass(), "tapCriticalPerfect", 0);
        setIntField(term495577, term495577.getClass(), "tapPerfect", 0);
        setIntField(term495577, term495577.getClass(), "tapGreat", 0);
        setIntField(term495577, term495577.getClass(), "tapGood", 0);
        setIntField(term495577, term495577.getClass(), "tapMiss", 0);
        setIntField(term495577, term495577.getClass(), "holdCriticalPerfect", 0);
        setIntField(term495577, term495577.getClass(), "holdPerfect", 0);
        setIntField(term495577, term495577.getClass(), "holdGreat", 0);
        setIntField(term495577, term495577.getClass(), "holdGood", 0);
        setIntField(term495577, term495577.getClass(), "holdMiss", 0);
        setIntField(term495577, term495577.getClass(), "slideCriticalPerfect", 0);
        setIntField(term495577, term495577.getClass(), "slidePerfect", 0);
        setIntField(term495577, term495577.getClass(), "slideGreat", 0);
        setIntField(term495577, term495577.getClass(), "slideGood", 0);
        setIntField(term495577, term495577.getClass(), "slideMiss", 0);
        setIntField(term495577, term495577.getClass(), "touchCriticalPerfect", 0);
        setIntField(term495577, term495577.getClass(), "touchPerfect", 0);
        setIntField(term495577, term495577.getClass(), "touchGreat", 0);
        setIntField(term495577, term495577.getClass(), "touchGood", 0);
        setIntField(term495577, term495577.getClass(), "touchMiss", 0);
        setIntField(term495577, term495577.getClass(), "breakCriticalPerfect", 0);
        setIntField(term495577, term495577.getClass(), "breakPerfect", 0);
        setIntField(term495577, term495577.getClass(), "breakGreat", 0);
        setIntField(term495577, term495577.getClass(), "breakGood", 0);
        setIntField(term495577, term495577.getClass(), "breakMiss", 0);
        setBooleanField(term495577, term495577.getClass(), "isTap", false);
        setBooleanField(term495577, term495577.getClass(), "isHold", false);
        setBooleanField(term495577, term495577.getClass(), "isSlide", false);
        setBooleanField(term495577, term495577.getClass(), "isTouch", false);
        setBooleanField(term495577, term495577.getClass(), "isBreak", false);
        setBooleanField(term495577, term495577.getClass(), "isCriticalDisp", false);
        setBooleanField(term495577, term495577.getClass(), "isFastLateDisp", false);
        setIntField(term495577, term495577.getClass(), "fastCount", 0);
        setIntField(term495577, term495577.getClass(), "lateCount", 0);
        setBooleanField(term495577, term495577.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term495577, term495577.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term495577, term495577.getClass(), "comboStatus", 0);
        setIntField(term495577, term495577.getClass(), "syncStatus", 0);
        setBooleanField(term495577, term495577.getClass(), "isClear", false);
        setIntField(term495577, term495577.getClass(), "beforeRating", 0);
        setIntField(term495577, term495577.getClass(), "afterRating", 0);
        setIntField(term495577, term495577.getClass(), "beforeGrade", 0);
        setIntField(term495577, term495577.getClass(), "afterGrade", 0);
        setIntField(term495577, term495577.getClass(), "afterGradeRank", 0);
        setIntField(term495577, term495577.getClass(), "beforeDeluxRating", 0);
        setIntField(term495577, term495577.getClass(), "afterDeluxRating", 0);
        setBooleanField(term495577, term495577.getClass(), "isPlayTutorial", false);
        setBooleanField(term495577, term495577.getClass(), "isEventMode", false);
        setBooleanField(term495577, term495577.getClass(), "isFreedomMode", false);
        setIntField(term495577, term495577.getClass(), "playMode", 0);
        setBooleanField(term495577, term495577.getClass(), "isNewFree", false);
        setIntField(term495577, term495577.getClass(), "trialPlayAchievement", 0);
        setIntField(term495577, term495577.getClass(), "extNum1", 0);
        setIntField(term495577, term495577.getClass(), "extNum2", 0);
        term495677 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term495677;
        callMethod(klass, "setDeluxscoreNewRecord", argTypes, term495577, args);
    }

};


