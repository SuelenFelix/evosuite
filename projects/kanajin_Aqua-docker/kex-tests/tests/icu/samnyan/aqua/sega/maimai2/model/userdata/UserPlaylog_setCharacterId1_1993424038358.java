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

public class UserPlaylog_setCharacterId1_1993424038358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term489763;
     Object term489863;

    public UserPlaylog_setCharacterId1_1993424038358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term489763 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term489763, term489763.getClass(), "id", 0L);
        setField(term489763, term489763.getClass(), "user", null);
        setIntField(term489763, term489763.getClass(), "orderId", 0);
        setLongField(term489763, term489763.getClass(), "playlogId", 0L);
        setIntField(term489763, term489763.getClass(), "version", 0);
        setIntField(term489763, term489763.getClass(), "placeId", 0);
        setField(term489763, term489763.getClass(), "placeName", null);
        setLongField(term489763, term489763.getClass(), "loginDate", 0L);
        setField(term489763, term489763.getClass(), "playDate", null);
        setField(term489763, term489763.getClass(), "userPlayDate", null);
        setIntField(term489763, term489763.getClass(), "type", 0);
        setIntField(term489763, term489763.getClass(), "musicId", 0);
        setIntField(term489763, term489763.getClass(), "level", 0);
        setIntField(term489763, term489763.getClass(), "trackNo", 0);
        setIntField(term489763, term489763.getClass(), "vsMode", 0);
        setField(term489763, term489763.getClass(), "vsUserName", null);
        setIntField(term489763, term489763.getClass(), "vsStatus", 0);
        setIntField(term489763, term489763.getClass(), "vsUserRating", 0);
        setIntField(term489763, term489763.getClass(), "vsUserAchievement", 0);
        setIntField(term489763, term489763.getClass(), "vsUserGradeRank", 0);
        setIntField(term489763, term489763.getClass(), "vsRank", 0);
        setIntField(term489763, term489763.getClass(), "playerNum", 0);
        setLongField(term489763, term489763.getClass(), "playedUserId1", 0L);
        setField(term489763, term489763.getClass(), "playedUserName1", null);
        setIntField(term489763, term489763.getClass(), "playedMusicLevel1", 0);
        setLongField(term489763, term489763.getClass(), "playedUserId2", 0L);
        setField(term489763, term489763.getClass(), "playedUserName2", null);
        setIntField(term489763, term489763.getClass(), "playedMusicLevel2", 0);
        setLongField(term489763, term489763.getClass(), "playedUserId3", 0L);
        setField(term489763, term489763.getClass(), "playedUserName3", null);
        setIntField(term489763, term489763.getClass(), "playedMusicLevel3", 0);
        setIntField(term489763, term489763.getClass(), "characterId1", 0);
        setIntField(term489763, term489763.getClass(), "characterLevel1", 0);
        setIntField(term489763, term489763.getClass(), "characterAwakening1", 0);
        setIntField(term489763, term489763.getClass(), "characterId2", 0);
        setIntField(term489763, term489763.getClass(), "characterLevel2", 0);
        setIntField(term489763, term489763.getClass(), "characterAwakening2", 0);
        setIntField(term489763, term489763.getClass(), "characterId3", 0);
        setIntField(term489763, term489763.getClass(), "characterLevel3", 0);
        setIntField(term489763, term489763.getClass(), "characterAwakening3", 0);
        setIntField(term489763, term489763.getClass(), "characterId4", 0);
        setIntField(term489763, term489763.getClass(), "characterLevel4", 0);
        setIntField(term489763, term489763.getClass(), "characterAwakening4", 0);
        setIntField(term489763, term489763.getClass(), "characterId5", 0);
        setIntField(term489763, term489763.getClass(), "characterLevel5", 0);
        setIntField(term489763, term489763.getClass(), "characterAwakening5", 0);
        setIntField(term489763, term489763.getClass(), "achievement", 0);
        setIntField(term489763, term489763.getClass(), "deluxscore", 0);
        setIntField(term489763, term489763.getClass(), "scoreRank", 0);
        setIntField(term489763, term489763.getClass(), "maxCombo", 0);
        setIntField(term489763, term489763.getClass(), "totalCombo", 0);
        setIntField(term489763, term489763.getClass(), "maxSync", 0);
        setIntField(term489763, term489763.getClass(), "totalSync", 0);
        setIntField(term489763, term489763.getClass(), "tapCriticalPerfect", 0);
        setIntField(term489763, term489763.getClass(), "tapPerfect", 0);
        setIntField(term489763, term489763.getClass(), "tapGreat", 0);
        setIntField(term489763, term489763.getClass(), "tapGood", 0);
        setIntField(term489763, term489763.getClass(), "tapMiss", 0);
        setIntField(term489763, term489763.getClass(), "holdCriticalPerfect", 0);
        setIntField(term489763, term489763.getClass(), "holdPerfect", 0);
        setIntField(term489763, term489763.getClass(), "holdGreat", 0);
        setIntField(term489763, term489763.getClass(), "holdGood", 0);
        setIntField(term489763, term489763.getClass(), "holdMiss", 0);
        setIntField(term489763, term489763.getClass(), "slideCriticalPerfect", 0);
        setIntField(term489763, term489763.getClass(), "slidePerfect", 0);
        setIntField(term489763, term489763.getClass(), "slideGreat", 0);
        setIntField(term489763, term489763.getClass(), "slideGood", 0);
        setIntField(term489763, term489763.getClass(), "slideMiss", 0);
        setIntField(term489763, term489763.getClass(), "touchCriticalPerfect", 0);
        setIntField(term489763, term489763.getClass(), "touchPerfect", 0);
        setIntField(term489763, term489763.getClass(), "touchGreat", 0);
        setIntField(term489763, term489763.getClass(), "touchGood", 0);
        setIntField(term489763, term489763.getClass(), "touchMiss", 0);
        setIntField(term489763, term489763.getClass(), "breakCriticalPerfect", 0);
        setIntField(term489763, term489763.getClass(), "breakPerfect", 0);
        setIntField(term489763, term489763.getClass(), "breakGreat", 0);
        setIntField(term489763, term489763.getClass(), "breakGood", 0);
        setIntField(term489763, term489763.getClass(), "breakMiss", 0);
        setBooleanField(term489763, term489763.getClass(), "isTap", false);
        setBooleanField(term489763, term489763.getClass(), "isHold", false);
        setBooleanField(term489763, term489763.getClass(), "isSlide", false);
        setBooleanField(term489763, term489763.getClass(), "isTouch", false);
        setBooleanField(term489763, term489763.getClass(), "isBreak", false);
        setBooleanField(term489763, term489763.getClass(), "isCriticalDisp", false);
        setBooleanField(term489763, term489763.getClass(), "isFastLateDisp", false);
        setIntField(term489763, term489763.getClass(), "fastCount", 0);
        setIntField(term489763, term489763.getClass(), "lateCount", 0);
        setBooleanField(term489763, term489763.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term489763, term489763.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term489763, term489763.getClass(), "comboStatus", 0);
        setIntField(term489763, term489763.getClass(), "syncStatus", 0);
        setBooleanField(term489763, term489763.getClass(), "isClear", false);
        setIntField(term489763, term489763.getClass(), "beforeRating", 0);
        setIntField(term489763, term489763.getClass(), "afterRating", 0);
        setIntField(term489763, term489763.getClass(), "beforeGrade", 0);
        setIntField(term489763, term489763.getClass(), "afterGrade", 0);
        setIntField(term489763, term489763.getClass(), "afterGradeRank", 0);
        setIntField(term489763, term489763.getClass(), "beforeDeluxRating", 0);
        setIntField(term489763, term489763.getClass(), "afterDeluxRating", 0);
        setBooleanField(term489763, term489763.getClass(), "isPlayTutorial", false);
        setBooleanField(term489763, term489763.getClass(), "isEventMode", false);
        setBooleanField(term489763, term489763.getClass(), "isFreedomMode", false);
        setIntField(term489763, term489763.getClass(), "playMode", 0);
        setBooleanField(term489763, term489763.getClass(), "isNewFree", false);
        setIntField(term489763, term489763.getClass(), "trialPlayAchievement", 0);
        setIntField(term489763, term489763.getClass(), "extNum1", 0);
        setIntField(term489763, term489763.getClass(), "extNum2", 0);
        term489863 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term489863;
        callMethod(klass, "setCharacterId1", argTypes, term489763, args);
    }

};


