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

public class UserPlaylog_setVsUserName_2021776293342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term488139;

    public UserPlaylog_setVsUserName_2021776293342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term488139 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term488139, term488139.getClass(), "id", 0L);
        setField(term488139, term488139.getClass(), "user", null);
        setIntField(term488139, term488139.getClass(), "orderId", 0);
        setLongField(term488139, term488139.getClass(), "playlogId", 0L);
        setIntField(term488139, term488139.getClass(), "version", 0);
        setIntField(term488139, term488139.getClass(), "placeId", 0);
        setField(term488139, term488139.getClass(), "placeName", null);
        setLongField(term488139, term488139.getClass(), "loginDate", 0L);
        setField(term488139, term488139.getClass(), "playDate", null);
        setField(term488139, term488139.getClass(), "userPlayDate", null);
        setIntField(term488139, term488139.getClass(), "type", 0);
        setIntField(term488139, term488139.getClass(), "musicId", 0);
        setIntField(term488139, term488139.getClass(), "level", 0);
        setIntField(term488139, term488139.getClass(), "trackNo", 0);
        setIntField(term488139, term488139.getClass(), "vsMode", 0);
        setField(term488139, term488139.getClass(), "vsUserName", null);
        setIntField(term488139, term488139.getClass(), "vsStatus", 0);
        setIntField(term488139, term488139.getClass(), "vsUserRating", 0);
        setIntField(term488139, term488139.getClass(), "vsUserAchievement", 0);
        setIntField(term488139, term488139.getClass(), "vsUserGradeRank", 0);
        setIntField(term488139, term488139.getClass(), "vsRank", 0);
        setIntField(term488139, term488139.getClass(), "playerNum", 0);
        setLongField(term488139, term488139.getClass(), "playedUserId1", 0L);
        setField(term488139, term488139.getClass(), "playedUserName1", null);
        setIntField(term488139, term488139.getClass(), "playedMusicLevel1", 0);
        setLongField(term488139, term488139.getClass(), "playedUserId2", 0L);
        setField(term488139, term488139.getClass(), "playedUserName2", null);
        setIntField(term488139, term488139.getClass(), "playedMusicLevel2", 0);
        setLongField(term488139, term488139.getClass(), "playedUserId3", 0L);
        setField(term488139, term488139.getClass(), "playedUserName3", null);
        setIntField(term488139, term488139.getClass(), "playedMusicLevel3", 0);
        setIntField(term488139, term488139.getClass(), "characterId1", 0);
        setIntField(term488139, term488139.getClass(), "characterLevel1", 0);
        setIntField(term488139, term488139.getClass(), "characterAwakening1", 0);
        setIntField(term488139, term488139.getClass(), "characterId2", 0);
        setIntField(term488139, term488139.getClass(), "characterLevel2", 0);
        setIntField(term488139, term488139.getClass(), "characterAwakening2", 0);
        setIntField(term488139, term488139.getClass(), "characterId3", 0);
        setIntField(term488139, term488139.getClass(), "characterLevel3", 0);
        setIntField(term488139, term488139.getClass(), "characterAwakening3", 0);
        setIntField(term488139, term488139.getClass(), "characterId4", 0);
        setIntField(term488139, term488139.getClass(), "characterLevel4", 0);
        setIntField(term488139, term488139.getClass(), "characterAwakening4", 0);
        setIntField(term488139, term488139.getClass(), "characterId5", 0);
        setIntField(term488139, term488139.getClass(), "characterLevel5", 0);
        setIntField(term488139, term488139.getClass(), "characterAwakening5", 0);
        setIntField(term488139, term488139.getClass(), "achievement", 0);
        setIntField(term488139, term488139.getClass(), "deluxscore", 0);
        setIntField(term488139, term488139.getClass(), "scoreRank", 0);
        setIntField(term488139, term488139.getClass(), "maxCombo", 0);
        setIntField(term488139, term488139.getClass(), "totalCombo", 0);
        setIntField(term488139, term488139.getClass(), "maxSync", 0);
        setIntField(term488139, term488139.getClass(), "totalSync", 0);
        setIntField(term488139, term488139.getClass(), "tapCriticalPerfect", 0);
        setIntField(term488139, term488139.getClass(), "tapPerfect", 0);
        setIntField(term488139, term488139.getClass(), "tapGreat", 0);
        setIntField(term488139, term488139.getClass(), "tapGood", 0);
        setIntField(term488139, term488139.getClass(), "tapMiss", 0);
        setIntField(term488139, term488139.getClass(), "holdCriticalPerfect", 0);
        setIntField(term488139, term488139.getClass(), "holdPerfect", 0);
        setIntField(term488139, term488139.getClass(), "holdGreat", 0);
        setIntField(term488139, term488139.getClass(), "holdGood", 0);
        setIntField(term488139, term488139.getClass(), "holdMiss", 0);
        setIntField(term488139, term488139.getClass(), "slideCriticalPerfect", 0);
        setIntField(term488139, term488139.getClass(), "slidePerfect", 0);
        setIntField(term488139, term488139.getClass(), "slideGreat", 0);
        setIntField(term488139, term488139.getClass(), "slideGood", 0);
        setIntField(term488139, term488139.getClass(), "slideMiss", 0);
        setIntField(term488139, term488139.getClass(), "touchCriticalPerfect", 0);
        setIntField(term488139, term488139.getClass(), "touchPerfect", 0);
        setIntField(term488139, term488139.getClass(), "touchGreat", 0);
        setIntField(term488139, term488139.getClass(), "touchGood", 0);
        setIntField(term488139, term488139.getClass(), "touchMiss", 0);
        setIntField(term488139, term488139.getClass(), "breakCriticalPerfect", 0);
        setIntField(term488139, term488139.getClass(), "breakPerfect", 0);
        setIntField(term488139, term488139.getClass(), "breakGreat", 0);
        setIntField(term488139, term488139.getClass(), "breakGood", 0);
        setIntField(term488139, term488139.getClass(), "breakMiss", 0);
        setBooleanField(term488139, term488139.getClass(), "isTap", false);
        setBooleanField(term488139, term488139.getClass(), "isHold", false);
        setBooleanField(term488139, term488139.getClass(), "isSlide", false);
        setBooleanField(term488139, term488139.getClass(), "isTouch", false);
        setBooleanField(term488139, term488139.getClass(), "isBreak", false);
        setBooleanField(term488139, term488139.getClass(), "isCriticalDisp", false);
        setBooleanField(term488139, term488139.getClass(), "isFastLateDisp", false);
        setIntField(term488139, term488139.getClass(), "fastCount", 0);
        setIntField(term488139, term488139.getClass(), "lateCount", 0);
        setBooleanField(term488139, term488139.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term488139, term488139.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term488139, term488139.getClass(), "comboStatus", 0);
        setIntField(term488139, term488139.getClass(), "syncStatus", 0);
        setBooleanField(term488139, term488139.getClass(), "isClear", false);
        setIntField(term488139, term488139.getClass(), "beforeRating", 0);
        setIntField(term488139, term488139.getClass(), "afterRating", 0);
        setIntField(term488139, term488139.getClass(), "beforeGrade", 0);
        setIntField(term488139, term488139.getClass(), "afterGrade", 0);
        setIntField(term488139, term488139.getClass(), "afterGradeRank", 0);
        setIntField(term488139, term488139.getClass(), "beforeDeluxRating", 0);
        setIntField(term488139, term488139.getClass(), "afterDeluxRating", 0);
        setBooleanField(term488139, term488139.getClass(), "isPlayTutorial", false);
        setBooleanField(term488139, term488139.getClass(), "isEventMode", false);
        setBooleanField(term488139, term488139.getClass(), "isFreedomMode", false);
        setIntField(term488139, term488139.getClass(), "playMode", 0);
        setBooleanField(term488139, term488139.getClass(), "isNewFree", false);
        setIntField(term488139, term488139.getClass(), "trialPlayAchievement", 0);
        setIntField(term488139, term488139.getClass(), "extNum1", 0);
        setIntField(term488139, term488139.getClass(), "extNum2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setVsUserName", argTypes, term488139, args);
    }

};


