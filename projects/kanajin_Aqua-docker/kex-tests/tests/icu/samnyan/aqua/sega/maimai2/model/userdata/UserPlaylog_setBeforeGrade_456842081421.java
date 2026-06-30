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

public class UserPlaylog_setBeforeGrade_456842081421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term496189;
     Object term496289;

    public UserPlaylog_setBeforeGrade_456842081421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term496189 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term496189, term496189.getClass(), "id", 0L);
        setField(term496189, term496189.getClass(), "user", null);
        setIntField(term496189, term496189.getClass(), "orderId", 0);
        setLongField(term496189, term496189.getClass(), "playlogId", 0L);
        setIntField(term496189, term496189.getClass(), "version", 0);
        setIntField(term496189, term496189.getClass(), "placeId", 0);
        setField(term496189, term496189.getClass(), "placeName", null);
        setLongField(term496189, term496189.getClass(), "loginDate", 0L);
        setField(term496189, term496189.getClass(), "playDate", null);
        setField(term496189, term496189.getClass(), "userPlayDate", null);
        setIntField(term496189, term496189.getClass(), "type", 0);
        setIntField(term496189, term496189.getClass(), "musicId", 0);
        setIntField(term496189, term496189.getClass(), "level", 0);
        setIntField(term496189, term496189.getClass(), "trackNo", 0);
        setIntField(term496189, term496189.getClass(), "vsMode", 0);
        setField(term496189, term496189.getClass(), "vsUserName", null);
        setIntField(term496189, term496189.getClass(), "vsStatus", 0);
        setIntField(term496189, term496189.getClass(), "vsUserRating", 0);
        setIntField(term496189, term496189.getClass(), "vsUserAchievement", 0);
        setIntField(term496189, term496189.getClass(), "vsUserGradeRank", 0);
        setIntField(term496189, term496189.getClass(), "vsRank", 0);
        setIntField(term496189, term496189.getClass(), "playerNum", 0);
        setLongField(term496189, term496189.getClass(), "playedUserId1", 0L);
        setField(term496189, term496189.getClass(), "playedUserName1", null);
        setIntField(term496189, term496189.getClass(), "playedMusicLevel1", 0);
        setLongField(term496189, term496189.getClass(), "playedUserId2", 0L);
        setField(term496189, term496189.getClass(), "playedUserName2", null);
        setIntField(term496189, term496189.getClass(), "playedMusicLevel2", 0);
        setLongField(term496189, term496189.getClass(), "playedUserId3", 0L);
        setField(term496189, term496189.getClass(), "playedUserName3", null);
        setIntField(term496189, term496189.getClass(), "playedMusicLevel3", 0);
        setIntField(term496189, term496189.getClass(), "characterId1", 0);
        setIntField(term496189, term496189.getClass(), "characterLevel1", 0);
        setIntField(term496189, term496189.getClass(), "characterAwakening1", 0);
        setIntField(term496189, term496189.getClass(), "characterId2", 0);
        setIntField(term496189, term496189.getClass(), "characterLevel2", 0);
        setIntField(term496189, term496189.getClass(), "characterAwakening2", 0);
        setIntField(term496189, term496189.getClass(), "characterId3", 0);
        setIntField(term496189, term496189.getClass(), "characterLevel3", 0);
        setIntField(term496189, term496189.getClass(), "characterAwakening3", 0);
        setIntField(term496189, term496189.getClass(), "characterId4", 0);
        setIntField(term496189, term496189.getClass(), "characterLevel4", 0);
        setIntField(term496189, term496189.getClass(), "characterAwakening4", 0);
        setIntField(term496189, term496189.getClass(), "characterId5", 0);
        setIntField(term496189, term496189.getClass(), "characterLevel5", 0);
        setIntField(term496189, term496189.getClass(), "characterAwakening5", 0);
        setIntField(term496189, term496189.getClass(), "achievement", 0);
        setIntField(term496189, term496189.getClass(), "deluxscore", 0);
        setIntField(term496189, term496189.getClass(), "scoreRank", 0);
        setIntField(term496189, term496189.getClass(), "maxCombo", 0);
        setIntField(term496189, term496189.getClass(), "totalCombo", 0);
        setIntField(term496189, term496189.getClass(), "maxSync", 0);
        setIntField(term496189, term496189.getClass(), "totalSync", 0);
        setIntField(term496189, term496189.getClass(), "tapCriticalPerfect", 0);
        setIntField(term496189, term496189.getClass(), "tapPerfect", 0);
        setIntField(term496189, term496189.getClass(), "tapGreat", 0);
        setIntField(term496189, term496189.getClass(), "tapGood", 0);
        setIntField(term496189, term496189.getClass(), "tapMiss", 0);
        setIntField(term496189, term496189.getClass(), "holdCriticalPerfect", 0);
        setIntField(term496189, term496189.getClass(), "holdPerfect", 0);
        setIntField(term496189, term496189.getClass(), "holdGreat", 0);
        setIntField(term496189, term496189.getClass(), "holdGood", 0);
        setIntField(term496189, term496189.getClass(), "holdMiss", 0);
        setIntField(term496189, term496189.getClass(), "slideCriticalPerfect", 0);
        setIntField(term496189, term496189.getClass(), "slidePerfect", 0);
        setIntField(term496189, term496189.getClass(), "slideGreat", 0);
        setIntField(term496189, term496189.getClass(), "slideGood", 0);
        setIntField(term496189, term496189.getClass(), "slideMiss", 0);
        setIntField(term496189, term496189.getClass(), "touchCriticalPerfect", 0);
        setIntField(term496189, term496189.getClass(), "touchPerfect", 0);
        setIntField(term496189, term496189.getClass(), "touchGreat", 0);
        setIntField(term496189, term496189.getClass(), "touchGood", 0);
        setIntField(term496189, term496189.getClass(), "touchMiss", 0);
        setIntField(term496189, term496189.getClass(), "breakCriticalPerfect", 0);
        setIntField(term496189, term496189.getClass(), "breakPerfect", 0);
        setIntField(term496189, term496189.getClass(), "breakGreat", 0);
        setIntField(term496189, term496189.getClass(), "breakGood", 0);
        setIntField(term496189, term496189.getClass(), "breakMiss", 0);
        setBooleanField(term496189, term496189.getClass(), "isTap", false);
        setBooleanField(term496189, term496189.getClass(), "isHold", false);
        setBooleanField(term496189, term496189.getClass(), "isSlide", false);
        setBooleanField(term496189, term496189.getClass(), "isTouch", false);
        setBooleanField(term496189, term496189.getClass(), "isBreak", false);
        setBooleanField(term496189, term496189.getClass(), "isCriticalDisp", false);
        setBooleanField(term496189, term496189.getClass(), "isFastLateDisp", false);
        setIntField(term496189, term496189.getClass(), "fastCount", 0);
        setIntField(term496189, term496189.getClass(), "lateCount", 0);
        setBooleanField(term496189, term496189.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term496189, term496189.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term496189, term496189.getClass(), "comboStatus", 0);
        setIntField(term496189, term496189.getClass(), "syncStatus", 0);
        setBooleanField(term496189, term496189.getClass(), "isClear", false);
        setIntField(term496189, term496189.getClass(), "beforeRating", 0);
        setIntField(term496189, term496189.getClass(), "afterRating", 0);
        setIntField(term496189, term496189.getClass(), "beforeGrade", 0);
        setIntField(term496189, term496189.getClass(), "afterGrade", 0);
        setIntField(term496189, term496189.getClass(), "afterGradeRank", 0);
        setIntField(term496189, term496189.getClass(), "beforeDeluxRating", 0);
        setIntField(term496189, term496189.getClass(), "afterDeluxRating", 0);
        setBooleanField(term496189, term496189.getClass(), "isPlayTutorial", false);
        setBooleanField(term496189, term496189.getClass(), "isEventMode", false);
        setBooleanField(term496189, term496189.getClass(), "isFreedomMode", false);
        setIntField(term496189, term496189.getClass(), "playMode", 0);
        setBooleanField(term496189, term496189.getClass(), "isNewFree", false);
        setIntField(term496189, term496189.getClass(), "trialPlayAchievement", 0);
        setIntField(term496189, term496189.getClass(), "extNum1", 0);
        setIntField(term496189, term496189.getClass(), "extNum2", 0);
        term496289 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term496289;
        callMethod(klass, "setBeforeGrade", argTypes, term496189, args);
    }

};


