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

public class UserPlaylog_setSlide_243076646407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term494761;
     Object term494861;

    public UserPlaylog_setSlide_243076646407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term494761 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term494761, term494761.getClass(), "id", 0L);
        setField(term494761, term494761.getClass(), "user", null);
        setIntField(term494761, term494761.getClass(), "orderId", 0);
        setLongField(term494761, term494761.getClass(), "playlogId", 0L);
        setIntField(term494761, term494761.getClass(), "version", 0);
        setIntField(term494761, term494761.getClass(), "placeId", 0);
        setField(term494761, term494761.getClass(), "placeName", null);
        setLongField(term494761, term494761.getClass(), "loginDate", 0L);
        setField(term494761, term494761.getClass(), "playDate", null);
        setField(term494761, term494761.getClass(), "userPlayDate", null);
        setIntField(term494761, term494761.getClass(), "type", 0);
        setIntField(term494761, term494761.getClass(), "musicId", 0);
        setIntField(term494761, term494761.getClass(), "level", 0);
        setIntField(term494761, term494761.getClass(), "trackNo", 0);
        setIntField(term494761, term494761.getClass(), "vsMode", 0);
        setField(term494761, term494761.getClass(), "vsUserName", null);
        setIntField(term494761, term494761.getClass(), "vsStatus", 0);
        setIntField(term494761, term494761.getClass(), "vsUserRating", 0);
        setIntField(term494761, term494761.getClass(), "vsUserAchievement", 0);
        setIntField(term494761, term494761.getClass(), "vsUserGradeRank", 0);
        setIntField(term494761, term494761.getClass(), "vsRank", 0);
        setIntField(term494761, term494761.getClass(), "playerNum", 0);
        setLongField(term494761, term494761.getClass(), "playedUserId1", 0L);
        setField(term494761, term494761.getClass(), "playedUserName1", null);
        setIntField(term494761, term494761.getClass(), "playedMusicLevel1", 0);
        setLongField(term494761, term494761.getClass(), "playedUserId2", 0L);
        setField(term494761, term494761.getClass(), "playedUserName2", null);
        setIntField(term494761, term494761.getClass(), "playedMusicLevel2", 0);
        setLongField(term494761, term494761.getClass(), "playedUserId3", 0L);
        setField(term494761, term494761.getClass(), "playedUserName3", null);
        setIntField(term494761, term494761.getClass(), "playedMusicLevel3", 0);
        setIntField(term494761, term494761.getClass(), "characterId1", 0);
        setIntField(term494761, term494761.getClass(), "characterLevel1", 0);
        setIntField(term494761, term494761.getClass(), "characterAwakening1", 0);
        setIntField(term494761, term494761.getClass(), "characterId2", 0);
        setIntField(term494761, term494761.getClass(), "characterLevel2", 0);
        setIntField(term494761, term494761.getClass(), "characterAwakening2", 0);
        setIntField(term494761, term494761.getClass(), "characterId3", 0);
        setIntField(term494761, term494761.getClass(), "characterLevel3", 0);
        setIntField(term494761, term494761.getClass(), "characterAwakening3", 0);
        setIntField(term494761, term494761.getClass(), "characterId4", 0);
        setIntField(term494761, term494761.getClass(), "characterLevel4", 0);
        setIntField(term494761, term494761.getClass(), "characterAwakening4", 0);
        setIntField(term494761, term494761.getClass(), "characterId5", 0);
        setIntField(term494761, term494761.getClass(), "characterLevel5", 0);
        setIntField(term494761, term494761.getClass(), "characterAwakening5", 0);
        setIntField(term494761, term494761.getClass(), "achievement", 0);
        setIntField(term494761, term494761.getClass(), "deluxscore", 0);
        setIntField(term494761, term494761.getClass(), "scoreRank", 0);
        setIntField(term494761, term494761.getClass(), "maxCombo", 0);
        setIntField(term494761, term494761.getClass(), "totalCombo", 0);
        setIntField(term494761, term494761.getClass(), "maxSync", 0);
        setIntField(term494761, term494761.getClass(), "totalSync", 0);
        setIntField(term494761, term494761.getClass(), "tapCriticalPerfect", 0);
        setIntField(term494761, term494761.getClass(), "tapPerfect", 0);
        setIntField(term494761, term494761.getClass(), "tapGreat", 0);
        setIntField(term494761, term494761.getClass(), "tapGood", 0);
        setIntField(term494761, term494761.getClass(), "tapMiss", 0);
        setIntField(term494761, term494761.getClass(), "holdCriticalPerfect", 0);
        setIntField(term494761, term494761.getClass(), "holdPerfect", 0);
        setIntField(term494761, term494761.getClass(), "holdGreat", 0);
        setIntField(term494761, term494761.getClass(), "holdGood", 0);
        setIntField(term494761, term494761.getClass(), "holdMiss", 0);
        setIntField(term494761, term494761.getClass(), "slideCriticalPerfect", 0);
        setIntField(term494761, term494761.getClass(), "slidePerfect", 0);
        setIntField(term494761, term494761.getClass(), "slideGreat", 0);
        setIntField(term494761, term494761.getClass(), "slideGood", 0);
        setIntField(term494761, term494761.getClass(), "slideMiss", 0);
        setIntField(term494761, term494761.getClass(), "touchCriticalPerfect", 0);
        setIntField(term494761, term494761.getClass(), "touchPerfect", 0);
        setIntField(term494761, term494761.getClass(), "touchGreat", 0);
        setIntField(term494761, term494761.getClass(), "touchGood", 0);
        setIntField(term494761, term494761.getClass(), "touchMiss", 0);
        setIntField(term494761, term494761.getClass(), "breakCriticalPerfect", 0);
        setIntField(term494761, term494761.getClass(), "breakPerfect", 0);
        setIntField(term494761, term494761.getClass(), "breakGreat", 0);
        setIntField(term494761, term494761.getClass(), "breakGood", 0);
        setIntField(term494761, term494761.getClass(), "breakMiss", 0);
        setBooleanField(term494761, term494761.getClass(), "isTap", false);
        setBooleanField(term494761, term494761.getClass(), "isHold", false);
        setBooleanField(term494761, term494761.getClass(), "isSlide", false);
        setBooleanField(term494761, term494761.getClass(), "isTouch", false);
        setBooleanField(term494761, term494761.getClass(), "isBreak", false);
        setBooleanField(term494761, term494761.getClass(), "isCriticalDisp", false);
        setBooleanField(term494761, term494761.getClass(), "isFastLateDisp", false);
        setIntField(term494761, term494761.getClass(), "fastCount", 0);
        setIntField(term494761, term494761.getClass(), "lateCount", 0);
        setBooleanField(term494761, term494761.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term494761, term494761.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term494761, term494761.getClass(), "comboStatus", 0);
        setIntField(term494761, term494761.getClass(), "syncStatus", 0);
        setBooleanField(term494761, term494761.getClass(), "isClear", false);
        setIntField(term494761, term494761.getClass(), "beforeRating", 0);
        setIntField(term494761, term494761.getClass(), "afterRating", 0);
        setIntField(term494761, term494761.getClass(), "beforeGrade", 0);
        setIntField(term494761, term494761.getClass(), "afterGrade", 0);
        setIntField(term494761, term494761.getClass(), "afterGradeRank", 0);
        setIntField(term494761, term494761.getClass(), "beforeDeluxRating", 0);
        setIntField(term494761, term494761.getClass(), "afterDeluxRating", 0);
        setBooleanField(term494761, term494761.getClass(), "isPlayTutorial", false);
        setBooleanField(term494761, term494761.getClass(), "isEventMode", false);
        setBooleanField(term494761, term494761.getClass(), "isFreedomMode", false);
        setIntField(term494761, term494761.getClass(), "playMode", 0);
        setBooleanField(term494761, term494761.getClass(), "isNewFree", false);
        setIntField(term494761, term494761.getClass(), "trialPlayAchievement", 0);
        setIntField(term494761, term494761.getClass(), "extNum1", 0);
        setIntField(term494761, term494761.getClass(), "extNum2", 0);
        term494861 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term494861;
        callMethod(klass, "setSlide", argTypes, term494761, args);
    }

};


