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

public class UserPlaylog_setSlideCriticalPerfect_1673027510390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term493027;
     Object term493127;

    public UserPlaylog_setSlideCriticalPerfect_1673027510390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term493027 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term493027, term493027.getClass(), "id", 0L);
        setField(term493027, term493027.getClass(), "user", null);
        setIntField(term493027, term493027.getClass(), "orderId", 0);
        setLongField(term493027, term493027.getClass(), "playlogId", 0L);
        setIntField(term493027, term493027.getClass(), "version", 0);
        setIntField(term493027, term493027.getClass(), "placeId", 0);
        setField(term493027, term493027.getClass(), "placeName", null);
        setLongField(term493027, term493027.getClass(), "loginDate", 0L);
        setField(term493027, term493027.getClass(), "playDate", null);
        setField(term493027, term493027.getClass(), "userPlayDate", null);
        setIntField(term493027, term493027.getClass(), "type", 0);
        setIntField(term493027, term493027.getClass(), "musicId", 0);
        setIntField(term493027, term493027.getClass(), "level", 0);
        setIntField(term493027, term493027.getClass(), "trackNo", 0);
        setIntField(term493027, term493027.getClass(), "vsMode", 0);
        setField(term493027, term493027.getClass(), "vsUserName", null);
        setIntField(term493027, term493027.getClass(), "vsStatus", 0);
        setIntField(term493027, term493027.getClass(), "vsUserRating", 0);
        setIntField(term493027, term493027.getClass(), "vsUserAchievement", 0);
        setIntField(term493027, term493027.getClass(), "vsUserGradeRank", 0);
        setIntField(term493027, term493027.getClass(), "vsRank", 0);
        setIntField(term493027, term493027.getClass(), "playerNum", 0);
        setLongField(term493027, term493027.getClass(), "playedUserId1", 0L);
        setField(term493027, term493027.getClass(), "playedUserName1", null);
        setIntField(term493027, term493027.getClass(), "playedMusicLevel1", 0);
        setLongField(term493027, term493027.getClass(), "playedUserId2", 0L);
        setField(term493027, term493027.getClass(), "playedUserName2", null);
        setIntField(term493027, term493027.getClass(), "playedMusicLevel2", 0);
        setLongField(term493027, term493027.getClass(), "playedUserId3", 0L);
        setField(term493027, term493027.getClass(), "playedUserName3", null);
        setIntField(term493027, term493027.getClass(), "playedMusicLevel3", 0);
        setIntField(term493027, term493027.getClass(), "characterId1", 0);
        setIntField(term493027, term493027.getClass(), "characterLevel1", 0);
        setIntField(term493027, term493027.getClass(), "characterAwakening1", 0);
        setIntField(term493027, term493027.getClass(), "characterId2", 0);
        setIntField(term493027, term493027.getClass(), "characterLevel2", 0);
        setIntField(term493027, term493027.getClass(), "characterAwakening2", 0);
        setIntField(term493027, term493027.getClass(), "characterId3", 0);
        setIntField(term493027, term493027.getClass(), "characterLevel3", 0);
        setIntField(term493027, term493027.getClass(), "characterAwakening3", 0);
        setIntField(term493027, term493027.getClass(), "characterId4", 0);
        setIntField(term493027, term493027.getClass(), "characterLevel4", 0);
        setIntField(term493027, term493027.getClass(), "characterAwakening4", 0);
        setIntField(term493027, term493027.getClass(), "characterId5", 0);
        setIntField(term493027, term493027.getClass(), "characterLevel5", 0);
        setIntField(term493027, term493027.getClass(), "characterAwakening5", 0);
        setIntField(term493027, term493027.getClass(), "achievement", 0);
        setIntField(term493027, term493027.getClass(), "deluxscore", 0);
        setIntField(term493027, term493027.getClass(), "scoreRank", 0);
        setIntField(term493027, term493027.getClass(), "maxCombo", 0);
        setIntField(term493027, term493027.getClass(), "totalCombo", 0);
        setIntField(term493027, term493027.getClass(), "maxSync", 0);
        setIntField(term493027, term493027.getClass(), "totalSync", 0);
        setIntField(term493027, term493027.getClass(), "tapCriticalPerfect", 0);
        setIntField(term493027, term493027.getClass(), "tapPerfect", 0);
        setIntField(term493027, term493027.getClass(), "tapGreat", 0);
        setIntField(term493027, term493027.getClass(), "tapGood", 0);
        setIntField(term493027, term493027.getClass(), "tapMiss", 0);
        setIntField(term493027, term493027.getClass(), "holdCriticalPerfect", 0);
        setIntField(term493027, term493027.getClass(), "holdPerfect", 0);
        setIntField(term493027, term493027.getClass(), "holdGreat", 0);
        setIntField(term493027, term493027.getClass(), "holdGood", 0);
        setIntField(term493027, term493027.getClass(), "holdMiss", 0);
        setIntField(term493027, term493027.getClass(), "slideCriticalPerfect", 0);
        setIntField(term493027, term493027.getClass(), "slidePerfect", 0);
        setIntField(term493027, term493027.getClass(), "slideGreat", 0);
        setIntField(term493027, term493027.getClass(), "slideGood", 0);
        setIntField(term493027, term493027.getClass(), "slideMiss", 0);
        setIntField(term493027, term493027.getClass(), "touchCriticalPerfect", 0);
        setIntField(term493027, term493027.getClass(), "touchPerfect", 0);
        setIntField(term493027, term493027.getClass(), "touchGreat", 0);
        setIntField(term493027, term493027.getClass(), "touchGood", 0);
        setIntField(term493027, term493027.getClass(), "touchMiss", 0);
        setIntField(term493027, term493027.getClass(), "breakCriticalPerfect", 0);
        setIntField(term493027, term493027.getClass(), "breakPerfect", 0);
        setIntField(term493027, term493027.getClass(), "breakGreat", 0);
        setIntField(term493027, term493027.getClass(), "breakGood", 0);
        setIntField(term493027, term493027.getClass(), "breakMiss", 0);
        setBooleanField(term493027, term493027.getClass(), "isTap", false);
        setBooleanField(term493027, term493027.getClass(), "isHold", false);
        setBooleanField(term493027, term493027.getClass(), "isSlide", false);
        setBooleanField(term493027, term493027.getClass(), "isTouch", false);
        setBooleanField(term493027, term493027.getClass(), "isBreak", false);
        setBooleanField(term493027, term493027.getClass(), "isCriticalDisp", false);
        setBooleanField(term493027, term493027.getClass(), "isFastLateDisp", false);
        setIntField(term493027, term493027.getClass(), "fastCount", 0);
        setIntField(term493027, term493027.getClass(), "lateCount", 0);
        setBooleanField(term493027, term493027.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term493027, term493027.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term493027, term493027.getClass(), "comboStatus", 0);
        setIntField(term493027, term493027.getClass(), "syncStatus", 0);
        setBooleanField(term493027, term493027.getClass(), "isClear", false);
        setIntField(term493027, term493027.getClass(), "beforeRating", 0);
        setIntField(term493027, term493027.getClass(), "afterRating", 0);
        setIntField(term493027, term493027.getClass(), "beforeGrade", 0);
        setIntField(term493027, term493027.getClass(), "afterGrade", 0);
        setIntField(term493027, term493027.getClass(), "afterGradeRank", 0);
        setIntField(term493027, term493027.getClass(), "beforeDeluxRating", 0);
        setIntField(term493027, term493027.getClass(), "afterDeluxRating", 0);
        setBooleanField(term493027, term493027.getClass(), "isPlayTutorial", false);
        setBooleanField(term493027, term493027.getClass(), "isEventMode", false);
        setBooleanField(term493027, term493027.getClass(), "isFreedomMode", false);
        setIntField(term493027, term493027.getClass(), "playMode", 0);
        setBooleanField(term493027, term493027.getClass(), "isNewFree", false);
        setIntField(term493027, term493027.getClass(), "trialPlayAchievement", 0);
        setIntField(term493027, term493027.getClass(), "extNum1", 0);
        setIntField(term493027, term493027.getClass(), "extNum2", 0);
        term493127 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term493127;
        callMethod(klass, "setSlideCriticalPerfect", argTypes, term493027, args);
    }

};


