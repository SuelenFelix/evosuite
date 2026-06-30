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

public class UserPlaylog_hashCode_898527376436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term497715;

    public UserPlaylog_hashCode_898527376436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term497715 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term497715, term497715.getClass(), "id", 0L);
        setField(term497715, term497715.getClass(), "user", null);
        setIntField(term497715, term497715.getClass(), "orderId", 0);
        setLongField(term497715, term497715.getClass(), "playlogId", 0L);
        setIntField(term497715, term497715.getClass(), "version", 0);
        setIntField(term497715, term497715.getClass(), "placeId", 0);
        setField(term497715, term497715.getClass(), "placeName", null);
        setLongField(term497715, term497715.getClass(), "loginDate", 0L);
        setField(term497715, term497715.getClass(), "playDate", null);
        setField(term497715, term497715.getClass(), "userPlayDate", null);
        setIntField(term497715, term497715.getClass(), "type", 0);
        setIntField(term497715, term497715.getClass(), "musicId", 0);
        setIntField(term497715, term497715.getClass(), "level", 0);
        setIntField(term497715, term497715.getClass(), "trackNo", 0);
        setIntField(term497715, term497715.getClass(), "vsMode", 0);
        setField(term497715, term497715.getClass(), "vsUserName", null);
        setIntField(term497715, term497715.getClass(), "vsStatus", 0);
        setIntField(term497715, term497715.getClass(), "vsUserRating", 0);
        setIntField(term497715, term497715.getClass(), "vsUserAchievement", 0);
        setIntField(term497715, term497715.getClass(), "vsUserGradeRank", 0);
        setIntField(term497715, term497715.getClass(), "vsRank", 0);
        setIntField(term497715, term497715.getClass(), "playerNum", 0);
        setLongField(term497715, term497715.getClass(), "playedUserId1", 0L);
        setField(term497715, term497715.getClass(), "playedUserName1", null);
        setIntField(term497715, term497715.getClass(), "playedMusicLevel1", 0);
        setLongField(term497715, term497715.getClass(), "playedUserId2", 0L);
        setField(term497715, term497715.getClass(), "playedUserName2", null);
        setIntField(term497715, term497715.getClass(), "playedMusicLevel2", 0);
        setLongField(term497715, term497715.getClass(), "playedUserId3", 0L);
        setField(term497715, term497715.getClass(), "playedUserName3", null);
        setIntField(term497715, term497715.getClass(), "playedMusicLevel3", 0);
        setIntField(term497715, term497715.getClass(), "characterId1", 0);
        setIntField(term497715, term497715.getClass(), "characterLevel1", 0);
        setIntField(term497715, term497715.getClass(), "characterAwakening1", 0);
        setIntField(term497715, term497715.getClass(), "characterId2", 0);
        setIntField(term497715, term497715.getClass(), "characterLevel2", 0);
        setIntField(term497715, term497715.getClass(), "characterAwakening2", 0);
        setIntField(term497715, term497715.getClass(), "characterId3", 0);
        setIntField(term497715, term497715.getClass(), "characterLevel3", 0);
        setIntField(term497715, term497715.getClass(), "characterAwakening3", 0);
        setIntField(term497715, term497715.getClass(), "characterId4", 0);
        setIntField(term497715, term497715.getClass(), "characterLevel4", 0);
        setIntField(term497715, term497715.getClass(), "characterAwakening4", 0);
        setIntField(term497715, term497715.getClass(), "characterId5", 0);
        setIntField(term497715, term497715.getClass(), "characterLevel5", 0);
        setIntField(term497715, term497715.getClass(), "characterAwakening5", 0);
        setIntField(term497715, term497715.getClass(), "achievement", 0);
        setIntField(term497715, term497715.getClass(), "deluxscore", 0);
        setIntField(term497715, term497715.getClass(), "scoreRank", 0);
        setIntField(term497715, term497715.getClass(), "maxCombo", 0);
        setIntField(term497715, term497715.getClass(), "totalCombo", 0);
        setIntField(term497715, term497715.getClass(), "maxSync", 0);
        setIntField(term497715, term497715.getClass(), "totalSync", 0);
        setIntField(term497715, term497715.getClass(), "tapCriticalPerfect", 0);
        setIntField(term497715, term497715.getClass(), "tapPerfect", 0);
        setIntField(term497715, term497715.getClass(), "tapGreat", 0);
        setIntField(term497715, term497715.getClass(), "tapGood", 0);
        setIntField(term497715, term497715.getClass(), "tapMiss", 0);
        setIntField(term497715, term497715.getClass(), "holdCriticalPerfect", 0);
        setIntField(term497715, term497715.getClass(), "holdPerfect", 0);
        setIntField(term497715, term497715.getClass(), "holdGreat", 0);
        setIntField(term497715, term497715.getClass(), "holdGood", 0);
        setIntField(term497715, term497715.getClass(), "holdMiss", 0);
        setIntField(term497715, term497715.getClass(), "slideCriticalPerfect", 0);
        setIntField(term497715, term497715.getClass(), "slidePerfect", 0);
        setIntField(term497715, term497715.getClass(), "slideGreat", 0);
        setIntField(term497715, term497715.getClass(), "slideGood", 0);
        setIntField(term497715, term497715.getClass(), "slideMiss", 0);
        setIntField(term497715, term497715.getClass(), "touchCriticalPerfect", 0);
        setIntField(term497715, term497715.getClass(), "touchPerfect", 0);
        setIntField(term497715, term497715.getClass(), "touchGreat", 0);
        setIntField(term497715, term497715.getClass(), "touchGood", 0);
        setIntField(term497715, term497715.getClass(), "touchMiss", 0);
        setIntField(term497715, term497715.getClass(), "breakCriticalPerfect", 0);
        setIntField(term497715, term497715.getClass(), "breakPerfect", 0);
        setIntField(term497715, term497715.getClass(), "breakGreat", 0);
        setIntField(term497715, term497715.getClass(), "breakGood", 0);
        setIntField(term497715, term497715.getClass(), "breakMiss", 0);
        setBooleanField(term497715, term497715.getClass(), "isTap", false);
        setBooleanField(term497715, term497715.getClass(), "isHold", false);
        setBooleanField(term497715, term497715.getClass(), "isSlide", false);
        setBooleanField(term497715, term497715.getClass(), "isTouch", false);
        setBooleanField(term497715, term497715.getClass(), "isBreak", false);
        setBooleanField(term497715, term497715.getClass(), "isCriticalDisp", false);
        setBooleanField(term497715, term497715.getClass(), "isFastLateDisp", false);
        setIntField(term497715, term497715.getClass(), "fastCount", 0);
        setIntField(term497715, term497715.getClass(), "lateCount", 0);
        setBooleanField(term497715, term497715.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term497715, term497715.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term497715, term497715.getClass(), "comboStatus", 0);
        setIntField(term497715, term497715.getClass(), "syncStatus", 0);
        setBooleanField(term497715, term497715.getClass(), "isClear", false);
        setIntField(term497715, term497715.getClass(), "beforeRating", 0);
        setIntField(term497715, term497715.getClass(), "afterRating", 0);
        setIntField(term497715, term497715.getClass(), "beforeGrade", 0);
        setIntField(term497715, term497715.getClass(), "afterGrade", 0);
        setIntField(term497715, term497715.getClass(), "afterGradeRank", 0);
        setIntField(term497715, term497715.getClass(), "beforeDeluxRating", 0);
        setIntField(term497715, term497715.getClass(), "afterDeluxRating", 0);
        setBooleanField(term497715, term497715.getClass(), "isPlayTutorial", false);
        setBooleanField(term497715, term497715.getClass(), "isEventMode", false);
        setBooleanField(term497715, term497715.getClass(), "isFreedomMode", false);
        setIntField(term497715, term497715.getClass(), "playMode", 0);
        setBooleanField(term497715, term497715.getClass(), "isNewFree", false);
        setIntField(term497715, term497715.getClass(), "trialPlayAchievement", 0);
        setIntField(term497715, term497715.getClass(), "extNum1", 0);
        setIntField(term497715, term497715.getClass(), "extNum2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term497715, args);
    }

};


