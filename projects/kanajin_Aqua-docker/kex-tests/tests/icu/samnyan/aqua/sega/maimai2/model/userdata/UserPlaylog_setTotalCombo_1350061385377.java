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

public class UserPlaylog_setTotalCombo_1350061385377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term491701;
     Object term491801;

    public UserPlaylog_setTotalCombo_1350061385377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term491701 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term491701, term491701.getClass(), "id", 0L);
        setField(term491701, term491701.getClass(), "user", null);
        setIntField(term491701, term491701.getClass(), "orderId", 0);
        setLongField(term491701, term491701.getClass(), "playlogId", 0L);
        setIntField(term491701, term491701.getClass(), "version", 0);
        setIntField(term491701, term491701.getClass(), "placeId", 0);
        setField(term491701, term491701.getClass(), "placeName", null);
        setLongField(term491701, term491701.getClass(), "loginDate", 0L);
        setField(term491701, term491701.getClass(), "playDate", null);
        setField(term491701, term491701.getClass(), "userPlayDate", null);
        setIntField(term491701, term491701.getClass(), "type", 0);
        setIntField(term491701, term491701.getClass(), "musicId", 0);
        setIntField(term491701, term491701.getClass(), "level", 0);
        setIntField(term491701, term491701.getClass(), "trackNo", 0);
        setIntField(term491701, term491701.getClass(), "vsMode", 0);
        setField(term491701, term491701.getClass(), "vsUserName", null);
        setIntField(term491701, term491701.getClass(), "vsStatus", 0);
        setIntField(term491701, term491701.getClass(), "vsUserRating", 0);
        setIntField(term491701, term491701.getClass(), "vsUserAchievement", 0);
        setIntField(term491701, term491701.getClass(), "vsUserGradeRank", 0);
        setIntField(term491701, term491701.getClass(), "vsRank", 0);
        setIntField(term491701, term491701.getClass(), "playerNum", 0);
        setLongField(term491701, term491701.getClass(), "playedUserId1", 0L);
        setField(term491701, term491701.getClass(), "playedUserName1", null);
        setIntField(term491701, term491701.getClass(), "playedMusicLevel1", 0);
        setLongField(term491701, term491701.getClass(), "playedUserId2", 0L);
        setField(term491701, term491701.getClass(), "playedUserName2", null);
        setIntField(term491701, term491701.getClass(), "playedMusicLevel2", 0);
        setLongField(term491701, term491701.getClass(), "playedUserId3", 0L);
        setField(term491701, term491701.getClass(), "playedUserName3", null);
        setIntField(term491701, term491701.getClass(), "playedMusicLevel3", 0);
        setIntField(term491701, term491701.getClass(), "characterId1", 0);
        setIntField(term491701, term491701.getClass(), "characterLevel1", 0);
        setIntField(term491701, term491701.getClass(), "characterAwakening1", 0);
        setIntField(term491701, term491701.getClass(), "characterId2", 0);
        setIntField(term491701, term491701.getClass(), "characterLevel2", 0);
        setIntField(term491701, term491701.getClass(), "characterAwakening2", 0);
        setIntField(term491701, term491701.getClass(), "characterId3", 0);
        setIntField(term491701, term491701.getClass(), "characterLevel3", 0);
        setIntField(term491701, term491701.getClass(), "characterAwakening3", 0);
        setIntField(term491701, term491701.getClass(), "characterId4", 0);
        setIntField(term491701, term491701.getClass(), "characterLevel4", 0);
        setIntField(term491701, term491701.getClass(), "characterAwakening4", 0);
        setIntField(term491701, term491701.getClass(), "characterId5", 0);
        setIntField(term491701, term491701.getClass(), "characterLevel5", 0);
        setIntField(term491701, term491701.getClass(), "characterAwakening5", 0);
        setIntField(term491701, term491701.getClass(), "achievement", 0);
        setIntField(term491701, term491701.getClass(), "deluxscore", 0);
        setIntField(term491701, term491701.getClass(), "scoreRank", 0);
        setIntField(term491701, term491701.getClass(), "maxCombo", 0);
        setIntField(term491701, term491701.getClass(), "totalCombo", 0);
        setIntField(term491701, term491701.getClass(), "maxSync", 0);
        setIntField(term491701, term491701.getClass(), "totalSync", 0);
        setIntField(term491701, term491701.getClass(), "tapCriticalPerfect", 0);
        setIntField(term491701, term491701.getClass(), "tapPerfect", 0);
        setIntField(term491701, term491701.getClass(), "tapGreat", 0);
        setIntField(term491701, term491701.getClass(), "tapGood", 0);
        setIntField(term491701, term491701.getClass(), "tapMiss", 0);
        setIntField(term491701, term491701.getClass(), "holdCriticalPerfect", 0);
        setIntField(term491701, term491701.getClass(), "holdPerfect", 0);
        setIntField(term491701, term491701.getClass(), "holdGreat", 0);
        setIntField(term491701, term491701.getClass(), "holdGood", 0);
        setIntField(term491701, term491701.getClass(), "holdMiss", 0);
        setIntField(term491701, term491701.getClass(), "slideCriticalPerfect", 0);
        setIntField(term491701, term491701.getClass(), "slidePerfect", 0);
        setIntField(term491701, term491701.getClass(), "slideGreat", 0);
        setIntField(term491701, term491701.getClass(), "slideGood", 0);
        setIntField(term491701, term491701.getClass(), "slideMiss", 0);
        setIntField(term491701, term491701.getClass(), "touchCriticalPerfect", 0);
        setIntField(term491701, term491701.getClass(), "touchPerfect", 0);
        setIntField(term491701, term491701.getClass(), "touchGreat", 0);
        setIntField(term491701, term491701.getClass(), "touchGood", 0);
        setIntField(term491701, term491701.getClass(), "touchMiss", 0);
        setIntField(term491701, term491701.getClass(), "breakCriticalPerfect", 0);
        setIntField(term491701, term491701.getClass(), "breakPerfect", 0);
        setIntField(term491701, term491701.getClass(), "breakGreat", 0);
        setIntField(term491701, term491701.getClass(), "breakGood", 0);
        setIntField(term491701, term491701.getClass(), "breakMiss", 0);
        setBooleanField(term491701, term491701.getClass(), "isTap", false);
        setBooleanField(term491701, term491701.getClass(), "isHold", false);
        setBooleanField(term491701, term491701.getClass(), "isSlide", false);
        setBooleanField(term491701, term491701.getClass(), "isTouch", false);
        setBooleanField(term491701, term491701.getClass(), "isBreak", false);
        setBooleanField(term491701, term491701.getClass(), "isCriticalDisp", false);
        setBooleanField(term491701, term491701.getClass(), "isFastLateDisp", false);
        setIntField(term491701, term491701.getClass(), "fastCount", 0);
        setIntField(term491701, term491701.getClass(), "lateCount", 0);
        setBooleanField(term491701, term491701.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term491701, term491701.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term491701, term491701.getClass(), "comboStatus", 0);
        setIntField(term491701, term491701.getClass(), "syncStatus", 0);
        setBooleanField(term491701, term491701.getClass(), "isClear", false);
        setIntField(term491701, term491701.getClass(), "beforeRating", 0);
        setIntField(term491701, term491701.getClass(), "afterRating", 0);
        setIntField(term491701, term491701.getClass(), "beforeGrade", 0);
        setIntField(term491701, term491701.getClass(), "afterGrade", 0);
        setIntField(term491701, term491701.getClass(), "afterGradeRank", 0);
        setIntField(term491701, term491701.getClass(), "beforeDeluxRating", 0);
        setIntField(term491701, term491701.getClass(), "afterDeluxRating", 0);
        setBooleanField(term491701, term491701.getClass(), "isPlayTutorial", false);
        setBooleanField(term491701, term491701.getClass(), "isEventMode", false);
        setBooleanField(term491701, term491701.getClass(), "isFreedomMode", false);
        setIntField(term491701, term491701.getClass(), "playMode", 0);
        setBooleanField(term491701, term491701.getClass(), "isNewFree", false);
        setIntField(term491701, term491701.getClass(), "trialPlayAchievement", 0);
        setIntField(term491701, term491701.getClass(), "extNum1", 0);
        setIntField(term491701, term491701.getClass(), "extNum2", 0);
        term491801 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term491801;
        callMethod(klass, "setTotalCombo", argTypes, term491701, args);
    }

};


