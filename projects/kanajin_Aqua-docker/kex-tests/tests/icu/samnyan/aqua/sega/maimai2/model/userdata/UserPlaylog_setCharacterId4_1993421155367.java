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

public class UserPlaylog_setCharacterId4_1993421155367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term490681;
     Object term490781;

    public UserPlaylog_setCharacterId4_1993421155367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term490681 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term490681, term490681.getClass(), "id", 0L);
        setField(term490681, term490681.getClass(), "user", null);
        setIntField(term490681, term490681.getClass(), "orderId", 0);
        setLongField(term490681, term490681.getClass(), "playlogId", 0L);
        setIntField(term490681, term490681.getClass(), "version", 0);
        setIntField(term490681, term490681.getClass(), "placeId", 0);
        setField(term490681, term490681.getClass(), "placeName", null);
        setLongField(term490681, term490681.getClass(), "loginDate", 0L);
        setField(term490681, term490681.getClass(), "playDate", null);
        setField(term490681, term490681.getClass(), "userPlayDate", null);
        setIntField(term490681, term490681.getClass(), "type", 0);
        setIntField(term490681, term490681.getClass(), "musicId", 0);
        setIntField(term490681, term490681.getClass(), "level", 0);
        setIntField(term490681, term490681.getClass(), "trackNo", 0);
        setIntField(term490681, term490681.getClass(), "vsMode", 0);
        setField(term490681, term490681.getClass(), "vsUserName", null);
        setIntField(term490681, term490681.getClass(), "vsStatus", 0);
        setIntField(term490681, term490681.getClass(), "vsUserRating", 0);
        setIntField(term490681, term490681.getClass(), "vsUserAchievement", 0);
        setIntField(term490681, term490681.getClass(), "vsUserGradeRank", 0);
        setIntField(term490681, term490681.getClass(), "vsRank", 0);
        setIntField(term490681, term490681.getClass(), "playerNum", 0);
        setLongField(term490681, term490681.getClass(), "playedUserId1", 0L);
        setField(term490681, term490681.getClass(), "playedUserName1", null);
        setIntField(term490681, term490681.getClass(), "playedMusicLevel1", 0);
        setLongField(term490681, term490681.getClass(), "playedUserId2", 0L);
        setField(term490681, term490681.getClass(), "playedUserName2", null);
        setIntField(term490681, term490681.getClass(), "playedMusicLevel2", 0);
        setLongField(term490681, term490681.getClass(), "playedUserId3", 0L);
        setField(term490681, term490681.getClass(), "playedUserName3", null);
        setIntField(term490681, term490681.getClass(), "playedMusicLevel3", 0);
        setIntField(term490681, term490681.getClass(), "characterId1", 0);
        setIntField(term490681, term490681.getClass(), "characterLevel1", 0);
        setIntField(term490681, term490681.getClass(), "characterAwakening1", 0);
        setIntField(term490681, term490681.getClass(), "characterId2", 0);
        setIntField(term490681, term490681.getClass(), "characterLevel2", 0);
        setIntField(term490681, term490681.getClass(), "characterAwakening2", 0);
        setIntField(term490681, term490681.getClass(), "characterId3", 0);
        setIntField(term490681, term490681.getClass(), "characterLevel3", 0);
        setIntField(term490681, term490681.getClass(), "characterAwakening3", 0);
        setIntField(term490681, term490681.getClass(), "characterId4", 0);
        setIntField(term490681, term490681.getClass(), "characterLevel4", 0);
        setIntField(term490681, term490681.getClass(), "characterAwakening4", 0);
        setIntField(term490681, term490681.getClass(), "characterId5", 0);
        setIntField(term490681, term490681.getClass(), "characterLevel5", 0);
        setIntField(term490681, term490681.getClass(), "characterAwakening5", 0);
        setIntField(term490681, term490681.getClass(), "achievement", 0);
        setIntField(term490681, term490681.getClass(), "deluxscore", 0);
        setIntField(term490681, term490681.getClass(), "scoreRank", 0);
        setIntField(term490681, term490681.getClass(), "maxCombo", 0);
        setIntField(term490681, term490681.getClass(), "totalCombo", 0);
        setIntField(term490681, term490681.getClass(), "maxSync", 0);
        setIntField(term490681, term490681.getClass(), "totalSync", 0);
        setIntField(term490681, term490681.getClass(), "tapCriticalPerfect", 0);
        setIntField(term490681, term490681.getClass(), "tapPerfect", 0);
        setIntField(term490681, term490681.getClass(), "tapGreat", 0);
        setIntField(term490681, term490681.getClass(), "tapGood", 0);
        setIntField(term490681, term490681.getClass(), "tapMiss", 0);
        setIntField(term490681, term490681.getClass(), "holdCriticalPerfect", 0);
        setIntField(term490681, term490681.getClass(), "holdPerfect", 0);
        setIntField(term490681, term490681.getClass(), "holdGreat", 0);
        setIntField(term490681, term490681.getClass(), "holdGood", 0);
        setIntField(term490681, term490681.getClass(), "holdMiss", 0);
        setIntField(term490681, term490681.getClass(), "slideCriticalPerfect", 0);
        setIntField(term490681, term490681.getClass(), "slidePerfect", 0);
        setIntField(term490681, term490681.getClass(), "slideGreat", 0);
        setIntField(term490681, term490681.getClass(), "slideGood", 0);
        setIntField(term490681, term490681.getClass(), "slideMiss", 0);
        setIntField(term490681, term490681.getClass(), "touchCriticalPerfect", 0);
        setIntField(term490681, term490681.getClass(), "touchPerfect", 0);
        setIntField(term490681, term490681.getClass(), "touchGreat", 0);
        setIntField(term490681, term490681.getClass(), "touchGood", 0);
        setIntField(term490681, term490681.getClass(), "touchMiss", 0);
        setIntField(term490681, term490681.getClass(), "breakCriticalPerfect", 0);
        setIntField(term490681, term490681.getClass(), "breakPerfect", 0);
        setIntField(term490681, term490681.getClass(), "breakGreat", 0);
        setIntField(term490681, term490681.getClass(), "breakGood", 0);
        setIntField(term490681, term490681.getClass(), "breakMiss", 0);
        setBooleanField(term490681, term490681.getClass(), "isTap", false);
        setBooleanField(term490681, term490681.getClass(), "isHold", false);
        setBooleanField(term490681, term490681.getClass(), "isSlide", false);
        setBooleanField(term490681, term490681.getClass(), "isTouch", false);
        setBooleanField(term490681, term490681.getClass(), "isBreak", false);
        setBooleanField(term490681, term490681.getClass(), "isCriticalDisp", false);
        setBooleanField(term490681, term490681.getClass(), "isFastLateDisp", false);
        setIntField(term490681, term490681.getClass(), "fastCount", 0);
        setIntField(term490681, term490681.getClass(), "lateCount", 0);
        setBooleanField(term490681, term490681.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term490681, term490681.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term490681, term490681.getClass(), "comboStatus", 0);
        setIntField(term490681, term490681.getClass(), "syncStatus", 0);
        setBooleanField(term490681, term490681.getClass(), "isClear", false);
        setIntField(term490681, term490681.getClass(), "beforeRating", 0);
        setIntField(term490681, term490681.getClass(), "afterRating", 0);
        setIntField(term490681, term490681.getClass(), "beforeGrade", 0);
        setIntField(term490681, term490681.getClass(), "afterGrade", 0);
        setIntField(term490681, term490681.getClass(), "afterGradeRank", 0);
        setIntField(term490681, term490681.getClass(), "beforeDeluxRating", 0);
        setIntField(term490681, term490681.getClass(), "afterDeluxRating", 0);
        setBooleanField(term490681, term490681.getClass(), "isPlayTutorial", false);
        setBooleanField(term490681, term490681.getClass(), "isEventMode", false);
        setBooleanField(term490681, term490681.getClass(), "isFreedomMode", false);
        setIntField(term490681, term490681.getClass(), "playMode", 0);
        setBooleanField(term490681, term490681.getClass(), "isNewFree", false);
        setIntField(term490681, term490681.getClass(), "trialPlayAchievement", 0);
        setIntField(term490681, term490681.getClass(), "extNum1", 0);
        setIntField(term490681, term490681.getClass(), "extNum2", 0);
        term490781 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term490781;
        callMethod(klass, "setCharacterId4", argTypes, term490681, args);
    }

};


