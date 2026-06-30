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

public class UserPlaylog_getVsStatus_866858842236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term477517;

    public UserPlaylog_getVsStatus_866858842236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term477517 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term477517, term477517.getClass(), "id", 0L);
        setField(term477517, term477517.getClass(), "user", null);
        setIntField(term477517, term477517.getClass(), "orderId", 0);
        setLongField(term477517, term477517.getClass(), "playlogId", 0L);
        setIntField(term477517, term477517.getClass(), "version", 0);
        setIntField(term477517, term477517.getClass(), "placeId", 0);
        setField(term477517, term477517.getClass(), "placeName", null);
        setLongField(term477517, term477517.getClass(), "loginDate", 0L);
        setField(term477517, term477517.getClass(), "playDate", null);
        setField(term477517, term477517.getClass(), "userPlayDate", null);
        setIntField(term477517, term477517.getClass(), "type", 0);
        setIntField(term477517, term477517.getClass(), "musicId", 0);
        setIntField(term477517, term477517.getClass(), "level", 0);
        setIntField(term477517, term477517.getClass(), "trackNo", 0);
        setIntField(term477517, term477517.getClass(), "vsMode", 0);
        setField(term477517, term477517.getClass(), "vsUserName", null);
        setIntField(term477517, term477517.getClass(), "vsStatus", 0);
        setIntField(term477517, term477517.getClass(), "vsUserRating", 0);
        setIntField(term477517, term477517.getClass(), "vsUserAchievement", 0);
        setIntField(term477517, term477517.getClass(), "vsUserGradeRank", 0);
        setIntField(term477517, term477517.getClass(), "vsRank", 0);
        setIntField(term477517, term477517.getClass(), "playerNum", 0);
        setLongField(term477517, term477517.getClass(), "playedUserId1", 0L);
        setField(term477517, term477517.getClass(), "playedUserName1", null);
        setIntField(term477517, term477517.getClass(), "playedMusicLevel1", 0);
        setLongField(term477517, term477517.getClass(), "playedUserId2", 0L);
        setField(term477517, term477517.getClass(), "playedUserName2", null);
        setIntField(term477517, term477517.getClass(), "playedMusicLevel2", 0);
        setLongField(term477517, term477517.getClass(), "playedUserId3", 0L);
        setField(term477517, term477517.getClass(), "playedUserName3", null);
        setIntField(term477517, term477517.getClass(), "playedMusicLevel3", 0);
        setIntField(term477517, term477517.getClass(), "characterId1", 0);
        setIntField(term477517, term477517.getClass(), "characterLevel1", 0);
        setIntField(term477517, term477517.getClass(), "characterAwakening1", 0);
        setIntField(term477517, term477517.getClass(), "characterId2", 0);
        setIntField(term477517, term477517.getClass(), "characterLevel2", 0);
        setIntField(term477517, term477517.getClass(), "characterAwakening2", 0);
        setIntField(term477517, term477517.getClass(), "characterId3", 0);
        setIntField(term477517, term477517.getClass(), "characterLevel3", 0);
        setIntField(term477517, term477517.getClass(), "characterAwakening3", 0);
        setIntField(term477517, term477517.getClass(), "characterId4", 0);
        setIntField(term477517, term477517.getClass(), "characterLevel4", 0);
        setIntField(term477517, term477517.getClass(), "characterAwakening4", 0);
        setIntField(term477517, term477517.getClass(), "characterId5", 0);
        setIntField(term477517, term477517.getClass(), "characterLevel5", 0);
        setIntField(term477517, term477517.getClass(), "characterAwakening5", 0);
        setIntField(term477517, term477517.getClass(), "achievement", 0);
        setIntField(term477517, term477517.getClass(), "deluxscore", 0);
        setIntField(term477517, term477517.getClass(), "scoreRank", 0);
        setIntField(term477517, term477517.getClass(), "maxCombo", 0);
        setIntField(term477517, term477517.getClass(), "totalCombo", 0);
        setIntField(term477517, term477517.getClass(), "maxSync", 0);
        setIntField(term477517, term477517.getClass(), "totalSync", 0);
        setIntField(term477517, term477517.getClass(), "tapCriticalPerfect", 0);
        setIntField(term477517, term477517.getClass(), "tapPerfect", 0);
        setIntField(term477517, term477517.getClass(), "tapGreat", 0);
        setIntField(term477517, term477517.getClass(), "tapGood", 0);
        setIntField(term477517, term477517.getClass(), "tapMiss", 0);
        setIntField(term477517, term477517.getClass(), "holdCriticalPerfect", 0);
        setIntField(term477517, term477517.getClass(), "holdPerfect", 0);
        setIntField(term477517, term477517.getClass(), "holdGreat", 0);
        setIntField(term477517, term477517.getClass(), "holdGood", 0);
        setIntField(term477517, term477517.getClass(), "holdMiss", 0);
        setIntField(term477517, term477517.getClass(), "slideCriticalPerfect", 0);
        setIntField(term477517, term477517.getClass(), "slidePerfect", 0);
        setIntField(term477517, term477517.getClass(), "slideGreat", 0);
        setIntField(term477517, term477517.getClass(), "slideGood", 0);
        setIntField(term477517, term477517.getClass(), "slideMiss", 0);
        setIntField(term477517, term477517.getClass(), "touchCriticalPerfect", 0);
        setIntField(term477517, term477517.getClass(), "touchPerfect", 0);
        setIntField(term477517, term477517.getClass(), "touchGreat", 0);
        setIntField(term477517, term477517.getClass(), "touchGood", 0);
        setIntField(term477517, term477517.getClass(), "touchMiss", 0);
        setIntField(term477517, term477517.getClass(), "breakCriticalPerfect", 0);
        setIntField(term477517, term477517.getClass(), "breakPerfect", 0);
        setIntField(term477517, term477517.getClass(), "breakGreat", 0);
        setIntField(term477517, term477517.getClass(), "breakGood", 0);
        setIntField(term477517, term477517.getClass(), "breakMiss", 0);
        setBooleanField(term477517, term477517.getClass(), "isTap", false);
        setBooleanField(term477517, term477517.getClass(), "isHold", false);
        setBooleanField(term477517, term477517.getClass(), "isSlide", false);
        setBooleanField(term477517, term477517.getClass(), "isTouch", false);
        setBooleanField(term477517, term477517.getClass(), "isBreak", false);
        setBooleanField(term477517, term477517.getClass(), "isCriticalDisp", false);
        setBooleanField(term477517, term477517.getClass(), "isFastLateDisp", false);
        setIntField(term477517, term477517.getClass(), "fastCount", 0);
        setIntField(term477517, term477517.getClass(), "lateCount", 0);
        setBooleanField(term477517, term477517.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term477517, term477517.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term477517, term477517.getClass(), "comboStatus", 0);
        setIntField(term477517, term477517.getClass(), "syncStatus", 0);
        setBooleanField(term477517, term477517.getClass(), "isClear", false);
        setIntField(term477517, term477517.getClass(), "beforeRating", 0);
        setIntField(term477517, term477517.getClass(), "afterRating", 0);
        setIntField(term477517, term477517.getClass(), "beforeGrade", 0);
        setIntField(term477517, term477517.getClass(), "afterGrade", 0);
        setIntField(term477517, term477517.getClass(), "afterGradeRank", 0);
        setIntField(term477517, term477517.getClass(), "beforeDeluxRating", 0);
        setIntField(term477517, term477517.getClass(), "afterDeluxRating", 0);
        setBooleanField(term477517, term477517.getClass(), "isPlayTutorial", false);
        setBooleanField(term477517, term477517.getClass(), "isEventMode", false);
        setBooleanField(term477517, term477517.getClass(), "isFreedomMode", false);
        setIntField(term477517, term477517.getClass(), "playMode", 0);
        setBooleanField(term477517, term477517.getClass(), "isNewFree", false);
        setIntField(term477517, term477517.getClass(), "trialPlayAchievement", 0);
        setIntField(term477517, term477517.getClass(), "extNum1", 0);
        setIntField(term477517, term477517.getClass(), "extNum2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVsStatus", argTypes, term477517, args);
    }

};


