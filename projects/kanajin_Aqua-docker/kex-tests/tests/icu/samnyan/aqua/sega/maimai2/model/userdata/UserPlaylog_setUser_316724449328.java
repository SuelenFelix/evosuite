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

public class UserPlaylog_setUser_316724449328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term486719;

    public UserPlaylog_setUser_316724449328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term486719 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term486719, term486719.getClass(), "id", 0L);
        setField(term486719, term486719.getClass(), "user", null);
        setIntField(term486719, term486719.getClass(), "orderId", 0);
        setLongField(term486719, term486719.getClass(), "playlogId", 0L);
        setIntField(term486719, term486719.getClass(), "version", 0);
        setIntField(term486719, term486719.getClass(), "placeId", 0);
        setField(term486719, term486719.getClass(), "placeName", null);
        setLongField(term486719, term486719.getClass(), "loginDate", 0L);
        setField(term486719, term486719.getClass(), "playDate", null);
        setField(term486719, term486719.getClass(), "userPlayDate", null);
        setIntField(term486719, term486719.getClass(), "type", 0);
        setIntField(term486719, term486719.getClass(), "musicId", 0);
        setIntField(term486719, term486719.getClass(), "level", 0);
        setIntField(term486719, term486719.getClass(), "trackNo", 0);
        setIntField(term486719, term486719.getClass(), "vsMode", 0);
        setField(term486719, term486719.getClass(), "vsUserName", null);
        setIntField(term486719, term486719.getClass(), "vsStatus", 0);
        setIntField(term486719, term486719.getClass(), "vsUserRating", 0);
        setIntField(term486719, term486719.getClass(), "vsUserAchievement", 0);
        setIntField(term486719, term486719.getClass(), "vsUserGradeRank", 0);
        setIntField(term486719, term486719.getClass(), "vsRank", 0);
        setIntField(term486719, term486719.getClass(), "playerNum", 0);
        setLongField(term486719, term486719.getClass(), "playedUserId1", 0L);
        setField(term486719, term486719.getClass(), "playedUserName1", null);
        setIntField(term486719, term486719.getClass(), "playedMusicLevel1", 0);
        setLongField(term486719, term486719.getClass(), "playedUserId2", 0L);
        setField(term486719, term486719.getClass(), "playedUserName2", null);
        setIntField(term486719, term486719.getClass(), "playedMusicLevel2", 0);
        setLongField(term486719, term486719.getClass(), "playedUserId3", 0L);
        setField(term486719, term486719.getClass(), "playedUserName3", null);
        setIntField(term486719, term486719.getClass(), "playedMusicLevel3", 0);
        setIntField(term486719, term486719.getClass(), "characterId1", 0);
        setIntField(term486719, term486719.getClass(), "characterLevel1", 0);
        setIntField(term486719, term486719.getClass(), "characterAwakening1", 0);
        setIntField(term486719, term486719.getClass(), "characterId2", 0);
        setIntField(term486719, term486719.getClass(), "characterLevel2", 0);
        setIntField(term486719, term486719.getClass(), "characterAwakening2", 0);
        setIntField(term486719, term486719.getClass(), "characterId3", 0);
        setIntField(term486719, term486719.getClass(), "characterLevel3", 0);
        setIntField(term486719, term486719.getClass(), "characterAwakening3", 0);
        setIntField(term486719, term486719.getClass(), "characterId4", 0);
        setIntField(term486719, term486719.getClass(), "characterLevel4", 0);
        setIntField(term486719, term486719.getClass(), "characterAwakening4", 0);
        setIntField(term486719, term486719.getClass(), "characterId5", 0);
        setIntField(term486719, term486719.getClass(), "characterLevel5", 0);
        setIntField(term486719, term486719.getClass(), "characterAwakening5", 0);
        setIntField(term486719, term486719.getClass(), "achievement", 0);
        setIntField(term486719, term486719.getClass(), "deluxscore", 0);
        setIntField(term486719, term486719.getClass(), "scoreRank", 0);
        setIntField(term486719, term486719.getClass(), "maxCombo", 0);
        setIntField(term486719, term486719.getClass(), "totalCombo", 0);
        setIntField(term486719, term486719.getClass(), "maxSync", 0);
        setIntField(term486719, term486719.getClass(), "totalSync", 0);
        setIntField(term486719, term486719.getClass(), "tapCriticalPerfect", 0);
        setIntField(term486719, term486719.getClass(), "tapPerfect", 0);
        setIntField(term486719, term486719.getClass(), "tapGreat", 0);
        setIntField(term486719, term486719.getClass(), "tapGood", 0);
        setIntField(term486719, term486719.getClass(), "tapMiss", 0);
        setIntField(term486719, term486719.getClass(), "holdCriticalPerfect", 0);
        setIntField(term486719, term486719.getClass(), "holdPerfect", 0);
        setIntField(term486719, term486719.getClass(), "holdGreat", 0);
        setIntField(term486719, term486719.getClass(), "holdGood", 0);
        setIntField(term486719, term486719.getClass(), "holdMiss", 0);
        setIntField(term486719, term486719.getClass(), "slideCriticalPerfect", 0);
        setIntField(term486719, term486719.getClass(), "slidePerfect", 0);
        setIntField(term486719, term486719.getClass(), "slideGreat", 0);
        setIntField(term486719, term486719.getClass(), "slideGood", 0);
        setIntField(term486719, term486719.getClass(), "slideMiss", 0);
        setIntField(term486719, term486719.getClass(), "touchCriticalPerfect", 0);
        setIntField(term486719, term486719.getClass(), "touchPerfect", 0);
        setIntField(term486719, term486719.getClass(), "touchGreat", 0);
        setIntField(term486719, term486719.getClass(), "touchGood", 0);
        setIntField(term486719, term486719.getClass(), "touchMiss", 0);
        setIntField(term486719, term486719.getClass(), "breakCriticalPerfect", 0);
        setIntField(term486719, term486719.getClass(), "breakPerfect", 0);
        setIntField(term486719, term486719.getClass(), "breakGreat", 0);
        setIntField(term486719, term486719.getClass(), "breakGood", 0);
        setIntField(term486719, term486719.getClass(), "breakMiss", 0);
        setBooleanField(term486719, term486719.getClass(), "isTap", false);
        setBooleanField(term486719, term486719.getClass(), "isHold", false);
        setBooleanField(term486719, term486719.getClass(), "isSlide", false);
        setBooleanField(term486719, term486719.getClass(), "isTouch", false);
        setBooleanField(term486719, term486719.getClass(), "isBreak", false);
        setBooleanField(term486719, term486719.getClass(), "isCriticalDisp", false);
        setBooleanField(term486719, term486719.getClass(), "isFastLateDisp", false);
        setIntField(term486719, term486719.getClass(), "fastCount", 0);
        setIntField(term486719, term486719.getClass(), "lateCount", 0);
        setBooleanField(term486719, term486719.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term486719, term486719.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term486719, term486719.getClass(), "comboStatus", 0);
        setIntField(term486719, term486719.getClass(), "syncStatus", 0);
        setBooleanField(term486719, term486719.getClass(), "isClear", false);
        setIntField(term486719, term486719.getClass(), "beforeRating", 0);
        setIntField(term486719, term486719.getClass(), "afterRating", 0);
        setIntField(term486719, term486719.getClass(), "beforeGrade", 0);
        setIntField(term486719, term486719.getClass(), "afterGrade", 0);
        setIntField(term486719, term486719.getClass(), "afterGradeRank", 0);
        setIntField(term486719, term486719.getClass(), "beforeDeluxRating", 0);
        setIntField(term486719, term486719.getClass(), "afterDeluxRating", 0);
        setBooleanField(term486719, term486719.getClass(), "isPlayTutorial", false);
        setBooleanField(term486719, term486719.getClass(), "isEventMode", false);
        setBooleanField(term486719, term486719.getClass(), "isFreedomMode", false);
        setIntField(term486719, term486719.getClass(), "playMode", 0);
        setBooleanField(term486719, term486719.getClass(), "isNewFree", false);
        setIntField(term486719, term486719.getClass(), "trialPlayAchievement", 0);
        setIntField(term486719, term486719.getClass(), "extNum1", 0);
        setIntField(term486719, term486719.getClass(), "extNum2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUser", argTypes, term486719, args);
    }

};


