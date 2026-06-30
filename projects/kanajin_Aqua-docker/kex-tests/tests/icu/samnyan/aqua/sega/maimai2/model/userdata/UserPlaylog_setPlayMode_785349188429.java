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

public class UserPlaylog_setPlayMode_785349188429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term497005;
     Object term497105;

    public UserPlaylog_setPlayMode_785349188429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term497005 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term497005, term497005.getClass(), "id", 0L);
        setField(term497005, term497005.getClass(), "user", null);
        setIntField(term497005, term497005.getClass(), "orderId", 0);
        setLongField(term497005, term497005.getClass(), "playlogId", 0L);
        setIntField(term497005, term497005.getClass(), "version", 0);
        setIntField(term497005, term497005.getClass(), "placeId", 0);
        setField(term497005, term497005.getClass(), "placeName", null);
        setLongField(term497005, term497005.getClass(), "loginDate", 0L);
        setField(term497005, term497005.getClass(), "playDate", null);
        setField(term497005, term497005.getClass(), "userPlayDate", null);
        setIntField(term497005, term497005.getClass(), "type", 0);
        setIntField(term497005, term497005.getClass(), "musicId", 0);
        setIntField(term497005, term497005.getClass(), "level", 0);
        setIntField(term497005, term497005.getClass(), "trackNo", 0);
        setIntField(term497005, term497005.getClass(), "vsMode", 0);
        setField(term497005, term497005.getClass(), "vsUserName", null);
        setIntField(term497005, term497005.getClass(), "vsStatus", 0);
        setIntField(term497005, term497005.getClass(), "vsUserRating", 0);
        setIntField(term497005, term497005.getClass(), "vsUserAchievement", 0);
        setIntField(term497005, term497005.getClass(), "vsUserGradeRank", 0);
        setIntField(term497005, term497005.getClass(), "vsRank", 0);
        setIntField(term497005, term497005.getClass(), "playerNum", 0);
        setLongField(term497005, term497005.getClass(), "playedUserId1", 0L);
        setField(term497005, term497005.getClass(), "playedUserName1", null);
        setIntField(term497005, term497005.getClass(), "playedMusicLevel1", 0);
        setLongField(term497005, term497005.getClass(), "playedUserId2", 0L);
        setField(term497005, term497005.getClass(), "playedUserName2", null);
        setIntField(term497005, term497005.getClass(), "playedMusicLevel2", 0);
        setLongField(term497005, term497005.getClass(), "playedUserId3", 0L);
        setField(term497005, term497005.getClass(), "playedUserName3", null);
        setIntField(term497005, term497005.getClass(), "playedMusicLevel3", 0);
        setIntField(term497005, term497005.getClass(), "characterId1", 0);
        setIntField(term497005, term497005.getClass(), "characterLevel1", 0);
        setIntField(term497005, term497005.getClass(), "characterAwakening1", 0);
        setIntField(term497005, term497005.getClass(), "characterId2", 0);
        setIntField(term497005, term497005.getClass(), "characterLevel2", 0);
        setIntField(term497005, term497005.getClass(), "characterAwakening2", 0);
        setIntField(term497005, term497005.getClass(), "characterId3", 0);
        setIntField(term497005, term497005.getClass(), "characterLevel3", 0);
        setIntField(term497005, term497005.getClass(), "characterAwakening3", 0);
        setIntField(term497005, term497005.getClass(), "characterId4", 0);
        setIntField(term497005, term497005.getClass(), "characterLevel4", 0);
        setIntField(term497005, term497005.getClass(), "characterAwakening4", 0);
        setIntField(term497005, term497005.getClass(), "characterId5", 0);
        setIntField(term497005, term497005.getClass(), "characterLevel5", 0);
        setIntField(term497005, term497005.getClass(), "characterAwakening5", 0);
        setIntField(term497005, term497005.getClass(), "achievement", 0);
        setIntField(term497005, term497005.getClass(), "deluxscore", 0);
        setIntField(term497005, term497005.getClass(), "scoreRank", 0);
        setIntField(term497005, term497005.getClass(), "maxCombo", 0);
        setIntField(term497005, term497005.getClass(), "totalCombo", 0);
        setIntField(term497005, term497005.getClass(), "maxSync", 0);
        setIntField(term497005, term497005.getClass(), "totalSync", 0);
        setIntField(term497005, term497005.getClass(), "tapCriticalPerfect", 0);
        setIntField(term497005, term497005.getClass(), "tapPerfect", 0);
        setIntField(term497005, term497005.getClass(), "tapGreat", 0);
        setIntField(term497005, term497005.getClass(), "tapGood", 0);
        setIntField(term497005, term497005.getClass(), "tapMiss", 0);
        setIntField(term497005, term497005.getClass(), "holdCriticalPerfect", 0);
        setIntField(term497005, term497005.getClass(), "holdPerfect", 0);
        setIntField(term497005, term497005.getClass(), "holdGreat", 0);
        setIntField(term497005, term497005.getClass(), "holdGood", 0);
        setIntField(term497005, term497005.getClass(), "holdMiss", 0);
        setIntField(term497005, term497005.getClass(), "slideCriticalPerfect", 0);
        setIntField(term497005, term497005.getClass(), "slidePerfect", 0);
        setIntField(term497005, term497005.getClass(), "slideGreat", 0);
        setIntField(term497005, term497005.getClass(), "slideGood", 0);
        setIntField(term497005, term497005.getClass(), "slideMiss", 0);
        setIntField(term497005, term497005.getClass(), "touchCriticalPerfect", 0);
        setIntField(term497005, term497005.getClass(), "touchPerfect", 0);
        setIntField(term497005, term497005.getClass(), "touchGreat", 0);
        setIntField(term497005, term497005.getClass(), "touchGood", 0);
        setIntField(term497005, term497005.getClass(), "touchMiss", 0);
        setIntField(term497005, term497005.getClass(), "breakCriticalPerfect", 0);
        setIntField(term497005, term497005.getClass(), "breakPerfect", 0);
        setIntField(term497005, term497005.getClass(), "breakGreat", 0);
        setIntField(term497005, term497005.getClass(), "breakGood", 0);
        setIntField(term497005, term497005.getClass(), "breakMiss", 0);
        setBooleanField(term497005, term497005.getClass(), "isTap", false);
        setBooleanField(term497005, term497005.getClass(), "isHold", false);
        setBooleanField(term497005, term497005.getClass(), "isSlide", false);
        setBooleanField(term497005, term497005.getClass(), "isTouch", false);
        setBooleanField(term497005, term497005.getClass(), "isBreak", false);
        setBooleanField(term497005, term497005.getClass(), "isCriticalDisp", false);
        setBooleanField(term497005, term497005.getClass(), "isFastLateDisp", false);
        setIntField(term497005, term497005.getClass(), "fastCount", 0);
        setIntField(term497005, term497005.getClass(), "lateCount", 0);
        setBooleanField(term497005, term497005.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term497005, term497005.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term497005, term497005.getClass(), "comboStatus", 0);
        setIntField(term497005, term497005.getClass(), "syncStatus", 0);
        setBooleanField(term497005, term497005.getClass(), "isClear", false);
        setIntField(term497005, term497005.getClass(), "beforeRating", 0);
        setIntField(term497005, term497005.getClass(), "afterRating", 0);
        setIntField(term497005, term497005.getClass(), "beforeGrade", 0);
        setIntField(term497005, term497005.getClass(), "afterGrade", 0);
        setIntField(term497005, term497005.getClass(), "afterGradeRank", 0);
        setIntField(term497005, term497005.getClass(), "beforeDeluxRating", 0);
        setIntField(term497005, term497005.getClass(), "afterDeluxRating", 0);
        setBooleanField(term497005, term497005.getClass(), "isPlayTutorial", false);
        setBooleanField(term497005, term497005.getClass(), "isEventMode", false);
        setBooleanField(term497005, term497005.getClass(), "isFreedomMode", false);
        setIntField(term497005, term497005.getClass(), "playMode", 0);
        setBooleanField(term497005, term497005.getClass(), "isNewFree", false);
        setIntField(term497005, term497005.getClass(), "trialPlayAchievement", 0);
        setIntField(term497005, term497005.getClass(), "extNum1", 0);
        setIntField(term497005, term497005.getClass(), "extNum2", 0);
        term497105 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term497105;
        callMethod(klass, "setPlayMode", argTypes, term497005, args);
    }

};


