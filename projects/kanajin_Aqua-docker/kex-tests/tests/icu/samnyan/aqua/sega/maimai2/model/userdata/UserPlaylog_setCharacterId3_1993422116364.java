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

public class UserPlaylog_setCharacterId3_1993422116364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term490375;
     Object term490475;

    public UserPlaylog_setCharacterId3_1993422116364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term490375 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term490375, term490375.getClass(), "id", 0L);
        setField(term490375, term490375.getClass(), "user", null);
        setIntField(term490375, term490375.getClass(), "orderId", 0);
        setLongField(term490375, term490375.getClass(), "playlogId", 0L);
        setIntField(term490375, term490375.getClass(), "version", 0);
        setIntField(term490375, term490375.getClass(), "placeId", 0);
        setField(term490375, term490375.getClass(), "placeName", null);
        setLongField(term490375, term490375.getClass(), "loginDate", 0L);
        setField(term490375, term490375.getClass(), "playDate", null);
        setField(term490375, term490375.getClass(), "userPlayDate", null);
        setIntField(term490375, term490375.getClass(), "type", 0);
        setIntField(term490375, term490375.getClass(), "musicId", 0);
        setIntField(term490375, term490375.getClass(), "level", 0);
        setIntField(term490375, term490375.getClass(), "trackNo", 0);
        setIntField(term490375, term490375.getClass(), "vsMode", 0);
        setField(term490375, term490375.getClass(), "vsUserName", null);
        setIntField(term490375, term490375.getClass(), "vsStatus", 0);
        setIntField(term490375, term490375.getClass(), "vsUserRating", 0);
        setIntField(term490375, term490375.getClass(), "vsUserAchievement", 0);
        setIntField(term490375, term490375.getClass(), "vsUserGradeRank", 0);
        setIntField(term490375, term490375.getClass(), "vsRank", 0);
        setIntField(term490375, term490375.getClass(), "playerNum", 0);
        setLongField(term490375, term490375.getClass(), "playedUserId1", 0L);
        setField(term490375, term490375.getClass(), "playedUserName1", null);
        setIntField(term490375, term490375.getClass(), "playedMusicLevel1", 0);
        setLongField(term490375, term490375.getClass(), "playedUserId2", 0L);
        setField(term490375, term490375.getClass(), "playedUserName2", null);
        setIntField(term490375, term490375.getClass(), "playedMusicLevel2", 0);
        setLongField(term490375, term490375.getClass(), "playedUserId3", 0L);
        setField(term490375, term490375.getClass(), "playedUserName3", null);
        setIntField(term490375, term490375.getClass(), "playedMusicLevel3", 0);
        setIntField(term490375, term490375.getClass(), "characterId1", 0);
        setIntField(term490375, term490375.getClass(), "characterLevel1", 0);
        setIntField(term490375, term490375.getClass(), "characterAwakening1", 0);
        setIntField(term490375, term490375.getClass(), "characterId2", 0);
        setIntField(term490375, term490375.getClass(), "characterLevel2", 0);
        setIntField(term490375, term490375.getClass(), "characterAwakening2", 0);
        setIntField(term490375, term490375.getClass(), "characterId3", 0);
        setIntField(term490375, term490375.getClass(), "characterLevel3", 0);
        setIntField(term490375, term490375.getClass(), "characterAwakening3", 0);
        setIntField(term490375, term490375.getClass(), "characterId4", 0);
        setIntField(term490375, term490375.getClass(), "characterLevel4", 0);
        setIntField(term490375, term490375.getClass(), "characterAwakening4", 0);
        setIntField(term490375, term490375.getClass(), "characterId5", 0);
        setIntField(term490375, term490375.getClass(), "characterLevel5", 0);
        setIntField(term490375, term490375.getClass(), "characterAwakening5", 0);
        setIntField(term490375, term490375.getClass(), "achievement", 0);
        setIntField(term490375, term490375.getClass(), "deluxscore", 0);
        setIntField(term490375, term490375.getClass(), "scoreRank", 0);
        setIntField(term490375, term490375.getClass(), "maxCombo", 0);
        setIntField(term490375, term490375.getClass(), "totalCombo", 0);
        setIntField(term490375, term490375.getClass(), "maxSync", 0);
        setIntField(term490375, term490375.getClass(), "totalSync", 0);
        setIntField(term490375, term490375.getClass(), "tapCriticalPerfect", 0);
        setIntField(term490375, term490375.getClass(), "tapPerfect", 0);
        setIntField(term490375, term490375.getClass(), "tapGreat", 0);
        setIntField(term490375, term490375.getClass(), "tapGood", 0);
        setIntField(term490375, term490375.getClass(), "tapMiss", 0);
        setIntField(term490375, term490375.getClass(), "holdCriticalPerfect", 0);
        setIntField(term490375, term490375.getClass(), "holdPerfect", 0);
        setIntField(term490375, term490375.getClass(), "holdGreat", 0);
        setIntField(term490375, term490375.getClass(), "holdGood", 0);
        setIntField(term490375, term490375.getClass(), "holdMiss", 0);
        setIntField(term490375, term490375.getClass(), "slideCriticalPerfect", 0);
        setIntField(term490375, term490375.getClass(), "slidePerfect", 0);
        setIntField(term490375, term490375.getClass(), "slideGreat", 0);
        setIntField(term490375, term490375.getClass(), "slideGood", 0);
        setIntField(term490375, term490375.getClass(), "slideMiss", 0);
        setIntField(term490375, term490375.getClass(), "touchCriticalPerfect", 0);
        setIntField(term490375, term490375.getClass(), "touchPerfect", 0);
        setIntField(term490375, term490375.getClass(), "touchGreat", 0);
        setIntField(term490375, term490375.getClass(), "touchGood", 0);
        setIntField(term490375, term490375.getClass(), "touchMiss", 0);
        setIntField(term490375, term490375.getClass(), "breakCriticalPerfect", 0);
        setIntField(term490375, term490375.getClass(), "breakPerfect", 0);
        setIntField(term490375, term490375.getClass(), "breakGreat", 0);
        setIntField(term490375, term490375.getClass(), "breakGood", 0);
        setIntField(term490375, term490375.getClass(), "breakMiss", 0);
        setBooleanField(term490375, term490375.getClass(), "isTap", false);
        setBooleanField(term490375, term490375.getClass(), "isHold", false);
        setBooleanField(term490375, term490375.getClass(), "isSlide", false);
        setBooleanField(term490375, term490375.getClass(), "isTouch", false);
        setBooleanField(term490375, term490375.getClass(), "isBreak", false);
        setBooleanField(term490375, term490375.getClass(), "isCriticalDisp", false);
        setBooleanField(term490375, term490375.getClass(), "isFastLateDisp", false);
        setIntField(term490375, term490375.getClass(), "fastCount", 0);
        setIntField(term490375, term490375.getClass(), "lateCount", 0);
        setBooleanField(term490375, term490375.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term490375, term490375.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term490375, term490375.getClass(), "comboStatus", 0);
        setIntField(term490375, term490375.getClass(), "syncStatus", 0);
        setBooleanField(term490375, term490375.getClass(), "isClear", false);
        setIntField(term490375, term490375.getClass(), "beforeRating", 0);
        setIntField(term490375, term490375.getClass(), "afterRating", 0);
        setIntField(term490375, term490375.getClass(), "beforeGrade", 0);
        setIntField(term490375, term490375.getClass(), "afterGrade", 0);
        setIntField(term490375, term490375.getClass(), "afterGradeRank", 0);
        setIntField(term490375, term490375.getClass(), "beforeDeluxRating", 0);
        setIntField(term490375, term490375.getClass(), "afterDeluxRating", 0);
        setBooleanField(term490375, term490375.getClass(), "isPlayTutorial", false);
        setBooleanField(term490375, term490375.getClass(), "isEventMode", false);
        setBooleanField(term490375, term490375.getClass(), "isFreedomMode", false);
        setIntField(term490375, term490375.getClass(), "playMode", 0);
        setBooleanField(term490375, term490375.getClass(), "isNewFree", false);
        setIntField(term490375, term490375.getClass(), "trialPlayAchievement", 0);
        setIntField(term490375, term490375.getClass(), "extNum1", 0);
        setIntField(term490375, term490375.getClass(), "extNum2", 0);
        term490475 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term490475;
        callMethod(klass, "setCharacterId3", argTypes, term490375, args);
    }

};


