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

public class UserPlaylog_setTapGood_1239249865383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term492313;
     Object term492413;

    public UserPlaylog_setTapGood_1239249865383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term492313 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term492313, term492313.getClass(), "id", 0L);
        setField(term492313, term492313.getClass(), "user", null);
        setIntField(term492313, term492313.getClass(), "orderId", 0);
        setLongField(term492313, term492313.getClass(), "playlogId", 0L);
        setIntField(term492313, term492313.getClass(), "version", 0);
        setIntField(term492313, term492313.getClass(), "placeId", 0);
        setField(term492313, term492313.getClass(), "placeName", null);
        setLongField(term492313, term492313.getClass(), "loginDate", 0L);
        setField(term492313, term492313.getClass(), "playDate", null);
        setField(term492313, term492313.getClass(), "userPlayDate", null);
        setIntField(term492313, term492313.getClass(), "type", 0);
        setIntField(term492313, term492313.getClass(), "musicId", 0);
        setIntField(term492313, term492313.getClass(), "level", 0);
        setIntField(term492313, term492313.getClass(), "trackNo", 0);
        setIntField(term492313, term492313.getClass(), "vsMode", 0);
        setField(term492313, term492313.getClass(), "vsUserName", null);
        setIntField(term492313, term492313.getClass(), "vsStatus", 0);
        setIntField(term492313, term492313.getClass(), "vsUserRating", 0);
        setIntField(term492313, term492313.getClass(), "vsUserAchievement", 0);
        setIntField(term492313, term492313.getClass(), "vsUserGradeRank", 0);
        setIntField(term492313, term492313.getClass(), "vsRank", 0);
        setIntField(term492313, term492313.getClass(), "playerNum", 0);
        setLongField(term492313, term492313.getClass(), "playedUserId1", 0L);
        setField(term492313, term492313.getClass(), "playedUserName1", null);
        setIntField(term492313, term492313.getClass(), "playedMusicLevel1", 0);
        setLongField(term492313, term492313.getClass(), "playedUserId2", 0L);
        setField(term492313, term492313.getClass(), "playedUserName2", null);
        setIntField(term492313, term492313.getClass(), "playedMusicLevel2", 0);
        setLongField(term492313, term492313.getClass(), "playedUserId3", 0L);
        setField(term492313, term492313.getClass(), "playedUserName3", null);
        setIntField(term492313, term492313.getClass(), "playedMusicLevel3", 0);
        setIntField(term492313, term492313.getClass(), "characterId1", 0);
        setIntField(term492313, term492313.getClass(), "characterLevel1", 0);
        setIntField(term492313, term492313.getClass(), "characterAwakening1", 0);
        setIntField(term492313, term492313.getClass(), "characterId2", 0);
        setIntField(term492313, term492313.getClass(), "characterLevel2", 0);
        setIntField(term492313, term492313.getClass(), "characterAwakening2", 0);
        setIntField(term492313, term492313.getClass(), "characterId3", 0);
        setIntField(term492313, term492313.getClass(), "characterLevel3", 0);
        setIntField(term492313, term492313.getClass(), "characterAwakening3", 0);
        setIntField(term492313, term492313.getClass(), "characterId4", 0);
        setIntField(term492313, term492313.getClass(), "characterLevel4", 0);
        setIntField(term492313, term492313.getClass(), "characterAwakening4", 0);
        setIntField(term492313, term492313.getClass(), "characterId5", 0);
        setIntField(term492313, term492313.getClass(), "characterLevel5", 0);
        setIntField(term492313, term492313.getClass(), "characterAwakening5", 0);
        setIntField(term492313, term492313.getClass(), "achievement", 0);
        setIntField(term492313, term492313.getClass(), "deluxscore", 0);
        setIntField(term492313, term492313.getClass(), "scoreRank", 0);
        setIntField(term492313, term492313.getClass(), "maxCombo", 0);
        setIntField(term492313, term492313.getClass(), "totalCombo", 0);
        setIntField(term492313, term492313.getClass(), "maxSync", 0);
        setIntField(term492313, term492313.getClass(), "totalSync", 0);
        setIntField(term492313, term492313.getClass(), "tapCriticalPerfect", 0);
        setIntField(term492313, term492313.getClass(), "tapPerfect", 0);
        setIntField(term492313, term492313.getClass(), "tapGreat", 0);
        setIntField(term492313, term492313.getClass(), "tapGood", 0);
        setIntField(term492313, term492313.getClass(), "tapMiss", 0);
        setIntField(term492313, term492313.getClass(), "holdCriticalPerfect", 0);
        setIntField(term492313, term492313.getClass(), "holdPerfect", 0);
        setIntField(term492313, term492313.getClass(), "holdGreat", 0);
        setIntField(term492313, term492313.getClass(), "holdGood", 0);
        setIntField(term492313, term492313.getClass(), "holdMiss", 0);
        setIntField(term492313, term492313.getClass(), "slideCriticalPerfect", 0);
        setIntField(term492313, term492313.getClass(), "slidePerfect", 0);
        setIntField(term492313, term492313.getClass(), "slideGreat", 0);
        setIntField(term492313, term492313.getClass(), "slideGood", 0);
        setIntField(term492313, term492313.getClass(), "slideMiss", 0);
        setIntField(term492313, term492313.getClass(), "touchCriticalPerfect", 0);
        setIntField(term492313, term492313.getClass(), "touchPerfect", 0);
        setIntField(term492313, term492313.getClass(), "touchGreat", 0);
        setIntField(term492313, term492313.getClass(), "touchGood", 0);
        setIntField(term492313, term492313.getClass(), "touchMiss", 0);
        setIntField(term492313, term492313.getClass(), "breakCriticalPerfect", 0);
        setIntField(term492313, term492313.getClass(), "breakPerfect", 0);
        setIntField(term492313, term492313.getClass(), "breakGreat", 0);
        setIntField(term492313, term492313.getClass(), "breakGood", 0);
        setIntField(term492313, term492313.getClass(), "breakMiss", 0);
        setBooleanField(term492313, term492313.getClass(), "isTap", false);
        setBooleanField(term492313, term492313.getClass(), "isHold", false);
        setBooleanField(term492313, term492313.getClass(), "isSlide", false);
        setBooleanField(term492313, term492313.getClass(), "isTouch", false);
        setBooleanField(term492313, term492313.getClass(), "isBreak", false);
        setBooleanField(term492313, term492313.getClass(), "isCriticalDisp", false);
        setBooleanField(term492313, term492313.getClass(), "isFastLateDisp", false);
        setIntField(term492313, term492313.getClass(), "fastCount", 0);
        setIntField(term492313, term492313.getClass(), "lateCount", 0);
        setBooleanField(term492313, term492313.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term492313, term492313.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term492313, term492313.getClass(), "comboStatus", 0);
        setIntField(term492313, term492313.getClass(), "syncStatus", 0);
        setBooleanField(term492313, term492313.getClass(), "isClear", false);
        setIntField(term492313, term492313.getClass(), "beforeRating", 0);
        setIntField(term492313, term492313.getClass(), "afterRating", 0);
        setIntField(term492313, term492313.getClass(), "beforeGrade", 0);
        setIntField(term492313, term492313.getClass(), "afterGrade", 0);
        setIntField(term492313, term492313.getClass(), "afterGradeRank", 0);
        setIntField(term492313, term492313.getClass(), "beforeDeluxRating", 0);
        setIntField(term492313, term492313.getClass(), "afterDeluxRating", 0);
        setBooleanField(term492313, term492313.getClass(), "isPlayTutorial", false);
        setBooleanField(term492313, term492313.getClass(), "isEventMode", false);
        setBooleanField(term492313, term492313.getClass(), "isFreedomMode", false);
        setIntField(term492313, term492313.getClass(), "playMode", 0);
        setBooleanField(term492313, term492313.getClass(), "isNewFree", false);
        setIntField(term492313, term492313.getClass(), "trialPlayAchievement", 0);
        setIntField(term492313, term492313.getClass(), "extNum1", 0);
        setIntField(term492313, term492313.getClass(), "extNum2", 0);
        term492413 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term492413;
        callMethod(klass, "setTapGood", argTypes, term492313, args);
    }

};


