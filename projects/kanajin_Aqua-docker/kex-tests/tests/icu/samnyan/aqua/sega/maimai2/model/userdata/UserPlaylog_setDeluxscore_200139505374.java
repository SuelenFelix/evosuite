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

public class UserPlaylog_setDeluxscore_200139505374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term491395;
     Object term491495;

    public UserPlaylog_setDeluxscore_200139505374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term491395 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term491395, term491395.getClass(), "id", 0L);
        setField(term491395, term491395.getClass(), "user", null);
        setIntField(term491395, term491395.getClass(), "orderId", 0);
        setLongField(term491395, term491395.getClass(), "playlogId", 0L);
        setIntField(term491395, term491395.getClass(), "version", 0);
        setIntField(term491395, term491395.getClass(), "placeId", 0);
        setField(term491395, term491395.getClass(), "placeName", null);
        setLongField(term491395, term491395.getClass(), "loginDate", 0L);
        setField(term491395, term491395.getClass(), "playDate", null);
        setField(term491395, term491395.getClass(), "userPlayDate", null);
        setIntField(term491395, term491395.getClass(), "type", 0);
        setIntField(term491395, term491395.getClass(), "musicId", 0);
        setIntField(term491395, term491395.getClass(), "level", 0);
        setIntField(term491395, term491395.getClass(), "trackNo", 0);
        setIntField(term491395, term491395.getClass(), "vsMode", 0);
        setField(term491395, term491395.getClass(), "vsUserName", null);
        setIntField(term491395, term491395.getClass(), "vsStatus", 0);
        setIntField(term491395, term491395.getClass(), "vsUserRating", 0);
        setIntField(term491395, term491395.getClass(), "vsUserAchievement", 0);
        setIntField(term491395, term491395.getClass(), "vsUserGradeRank", 0);
        setIntField(term491395, term491395.getClass(), "vsRank", 0);
        setIntField(term491395, term491395.getClass(), "playerNum", 0);
        setLongField(term491395, term491395.getClass(), "playedUserId1", 0L);
        setField(term491395, term491395.getClass(), "playedUserName1", null);
        setIntField(term491395, term491395.getClass(), "playedMusicLevel1", 0);
        setLongField(term491395, term491395.getClass(), "playedUserId2", 0L);
        setField(term491395, term491395.getClass(), "playedUserName2", null);
        setIntField(term491395, term491395.getClass(), "playedMusicLevel2", 0);
        setLongField(term491395, term491395.getClass(), "playedUserId3", 0L);
        setField(term491395, term491395.getClass(), "playedUserName3", null);
        setIntField(term491395, term491395.getClass(), "playedMusicLevel3", 0);
        setIntField(term491395, term491395.getClass(), "characterId1", 0);
        setIntField(term491395, term491395.getClass(), "characterLevel1", 0);
        setIntField(term491395, term491395.getClass(), "characterAwakening1", 0);
        setIntField(term491395, term491395.getClass(), "characterId2", 0);
        setIntField(term491395, term491395.getClass(), "characterLevel2", 0);
        setIntField(term491395, term491395.getClass(), "characterAwakening2", 0);
        setIntField(term491395, term491395.getClass(), "characterId3", 0);
        setIntField(term491395, term491395.getClass(), "characterLevel3", 0);
        setIntField(term491395, term491395.getClass(), "characterAwakening3", 0);
        setIntField(term491395, term491395.getClass(), "characterId4", 0);
        setIntField(term491395, term491395.getClass(), "characterLevel4", 0);
        setIntField(term491395, term491395.getClass(), "characterAwakening4", 0);
        setIntField(term491395, term491395.getClass(), "characterId5", 0);
        setIntField(term491395, term491395.getClass(), "characterLevel5", 0);
        setIntField(term491395, term491395.getClass(), "characterAwakening5", 0);
        setIntField(term491395, term491395.getClass(), "achievement", 0);
        setIntField(term491395, term491395.getClass(), "deluxscore", 0);
        setIntField(term491395, term491395.getClass(), "scoreRank", 0);
        setIntField(term491395, term491395.getClass(), "maxCombo", 0);
        setIntField(term491395, term491395.getClass(), "totalCombo", 0);
        setIntField(term491395, term491395.getClass(), "maxSync", 0);
        setIntField(term491395, term491395.getClass(), "totalSync", 0);
        setIntField(term491395, term491395.getClass(), "tapCriticalPerfect", 0);
        setIntField(term491395, term491395.getClass(), "tapPerfect", 0);
        setIntField(term491395, term491395.getClass(), "tapGreat", 0);
        setIntField(term491395, term491395.getClass(), "tapGood", 0);
        setIntField(term491395, term491395.getClass(), "tapMiss", 0);
        setIntField(term491395, term491395.getClass(), "holdCriticalPerfect", 0);
        setIntField(term491395, term491395.getClass(), "holdPerfect", 0);
        setIntField(term491395, term491395.getClass(), "holdGreat", 0);
        setIntField(term491395, term491395.getClass(), "holdGood", 0);
        setIntField(term491395, term491395.getClass(), "holdMiss", 0);
        setIntField(term491395, term491395.getClass(), "slideCriticalPerfect", 0);
        setIntField(term491395, term491395.getClass(), "slidePerfect", 0);
        setIntField(term491395, term491395.getClass(), "slideGreat", 0);
        setIntField(term491395, term491395.getClass(), "slideGood", 0);
        setIntField(term491395, term491395.getClass(), "slideMiss", 0);
        setIntField(term491395, term491395.getClass(), "touchCriticalPerfect", 0);
        setIntField(term491395, term491395.getClass(), "touchPerfect", 0);
        setIntField(term491395, term491395.getClass(), "touchGreat", 0);
        setIntField(term491395, term491395.getClass(), "touchGood", 0);
        setIntField(term491395, term491395.getClass(), "touchMiss", 0);
        setIntField(term491395, term491395.getClass(), "breakCriticalPerfect", 0);
        setIntField(term491395, term491395.getClass(), "breakPerfect", 0);
        setIntField(term491395, term491395.getClass(), "breakGreat", 0);
        setIntField(term491395, term491395.getClass(), "breakGood", 0);
        setIntField(term491395, term491395.getClass(), "breakMiss", 0);
        setBooleanField(term491395, term491395.getClass(), "isTap", false);
        setBooleanField(term491395, term491395.getClass(), "isHold", false);
        setBooleanField(term491395, term491395.getClass(), "isSlide", false);
        setBooleanField(term491395, term491395.getClass(), "isTouch", false);
        setBooleanField(term491395, term491395.getClass(), "isBreak", false);
        setBooleanField(term491395, term491395.getClass(), "isCriticalDisp", false);
        setBooleanField(term491395, term491395.getClass(), "isFastLateDisp", false);
        setIntField(term491395, term491395.getClass(), "fastCount", 0);
        setIntField(term491395, term491395.getClass(), "lateCount", 0);
        setBooleanField(term491395, term491395.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term491395, term491395.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term491395, term491395.getClass(), "comboStatus", 0);
        setIntField(term491395, term491395.getClass(), "syncStatus", 0);
        setBooleanField(term491395, term491395.getClass(), "isClear", false);
        setIntField(term491395, term491395.getClass(), "beforeRating", 0);
        setIntField(term491395, term491395.getClass(), "afterRating", 0);
        setIntField(term491395, term491395.getClass(), "beforeGrade", 0);
        setIntField(term491395, term491395.getClass(), "afterGrade", 0);
        setIntField(term491395, term491395.getClass(), "afterGradeRank", 0);
        setIntField(term491395, term491395.getClass(), "beforeDeluxRating", 0);
        setIntField(term491395, term491395.getClass(), "afterDeluxRating", 0);
        setBooleanField(term491395, term491395.getClass(), "isPlayTutorial", false);
        setBooleanField(term491395, term491395.getClass(), "isEventMode", false);
        setBooleanField(term491395, term491395.getClass(), "isFreedomMode", false);
        setIntField(term491395, term491395.getClass(), "playMode", 0);
        setBooleanField(term491395, term491395.getClass(), "isNewFree", false);
        setIntField(term491395, term491395.getClass(), "trialPlayAchievement", 0);
        setIntField(term491395, term491395.getClass(), "extNum1", 0);
        setIntField(term491395, term491395.getClass(), "extNum2", 0);
        term491495 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term491495;
        callMethod(klass, "setDeluxscore", argTypes, term491395, args);
    }

};


