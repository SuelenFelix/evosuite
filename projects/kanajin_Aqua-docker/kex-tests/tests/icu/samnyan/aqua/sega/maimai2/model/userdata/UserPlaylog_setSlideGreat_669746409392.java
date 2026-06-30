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

public class UserPlaylog_setSlideGreat_669746409392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term493231;
     Object term493331;

    public UserPlaylog_setSlideGreat_669746409392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term493231 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term493231, term493231.getClass(), "id", 0L);
        setField(term493231, term493231.getClass(), "user", null);
        setIntField(term493231, term493231.getClass(), "orderId", 0);
        setLongField(term493231, term493231.getClass(), "playlogId", 0L);
        setIntField(term493231, term493231.getClass(), "version", 0);
        setIntField(term493231, term493231.getClass(), "placeId", 0);
        setField(term493231, term493231.getClass(), "placeName", null);
        setLongField(term493231, term493231.getClass(), "loginDate", 0L);
        setField(term493231, term493231.getClass(), "playDate", null);
        setField(term493231, term493231.getClass(), "userPlayDate", null);
        setIntField(term493231, term493231.getClass(), "type", 0);
        setIntField(term493231, term493231.getClass(), "musicId", 0);
        setIntField(term493231, term493231.getClass(), "level", 0);
        setIntField(term493231, term493231.getClass(), "trackNo", 0);
        setIntField(term493231, term493231.getClass(), "vsMode", 0);
        setField(term493231, term493231.getClass(), "vsUserName", null);
        setIntField(term493231, term493231.getClass(), "vsStatus", 0);
        setIntField(term493231, term493231.getClass(), "vsUserRating", 0);
        setIntField(term493231, term493231.getClass(), "vsUserAchievement", 0);
        setIntField(term493231, term493231.getClass(), "vsUserGradeRank", 0);
        setIntField(term493231, term493231.getClass(), "vsRank", 0);
        setIntField(term493231, term493231.getClass(), "playerNum", 0);
        setLongField(term493231, term493231.getClass(), "playedUserId1", 0L);
        setField(term493231, term493231.getClass(), "playedUserName1", null);
        setIntField(term493231, term493231.getClass(), "playedMusicLevel1", 0);
        setLongField(term493231, term493231.getClass(), "playedUserId2", 0L);
        setField(term493231, term493231.getClass(), "playedUserName2", null);
        setIntField(term493231, term493231.getClass(), "playedMusicLevel2", 0);
        setLongField(term493231, term493231.getClass(), "playedUserId3", 0L);
        setField(term493231, term493231.getClass(), "playedUserName3", null);
        setIntField(term493231, term493231.getClass(), "playedMusicLevel3", 0);
        setIntField(term493231, term493231.getClass(), "characterId1", 0);
        setIntField(term493231, term493231.getClass(), "characterLevel1", 0);
        setIntField(term493231, term493231.getClass(), "characterAwakening1", 0);
        setIntField(term493231, term493231.getClass(), "characterId2", 0);
        setIntField(term493231, term493231.getClass(), "characterLevel2", 0);
        setIntField(term493231, term493231.getClass(), "characterAwakening2", 0);
        setIntField(term493231, term493231.getClass(), "characterId3", 0);
        setIntField(term493231, term493231.getClass(), "characterLevel3", 0);
        setIntField(term493231, term493231.getClass(), "characterAwakening3", 0);
        setIntField(term493231, term493231.getClass(), "characterId4", 0);
        setIntField(term493231, term493231.getClass(), "characterLevel4", 0);
        setIntField(term493231, term493231.getClass(), "characterAwakening4", 0);
        setIntField(term493231, term493231.getClass(), "characterId5", 0);
        setIntField(term493231, term493231.getClass(), "characterLevel5", 0);
        setIntField(term493231, term493231.getClass(), "characterAwakening5", 0);
        setIntField(term493231, term493231.getClass(), "achievement", 0);
        setIntField(term493231, term493231.getClass(), "deluxscore", 0);
        setIntField(term493231, term493231.getClass(), "scoreRank", 0);
        setIntField(term493231, term493231.getClass(), "maxCombo", 0);
        setIntField(term493231, term493231.getClass(), "totalCombo", 0);
        setIntField(term493231, term493231.getClass(), "maxSync", 0);
        setIntField(term493231, term493231.getClass(), "totalSync", 0);
        setIntField(term493231, term493231.getClass(), "tapCriticalPerfect", 0);
        setIntField(term493231, term493231.getClass(), "tapPerfect", 0);
        setIntField(term493231, term493231.getClass(), "tapGreat", 0);
        setIntField(term493231, term493231.getClass(), "tapGood", 0);
        setIntField(term493231, term493231.getClass(), "tapMiss", 0);
        setIntField(term493231, term493231.getClass(), "holdCriticalPerfect", 0);
        setIntField(term493231, term493231.getClass(), "holdPerfect", 0);
        setIntField(term493231, term493231.getClass(), "holdGreat", 0);
        setIntField(term493231, term493231.getClass(), "holdGood", 0);
        setIntField(term493231, term493231.getClass(), "holdMiss", 0);
        setIntField(term493231, term493231.getClass(), "slideCriticalPerfect", 0);
        setIntField(term493231, term493231.getClass(), "slidePerfect", 0);
        setIntField(term493231, term493231.getClass(), "slideGreat", 0);
        setIntField(term493231, term493231.getClass(), "slideGood", 0);
        setIntField(term493231, term493231.getClass(), "slideMiss", 0);
        setIntField(term493231, term493231.getClass(), "touchCriticalPerfect", 0);
        setIntField(term493231, term493231.getClass(), "touchPerfect", 0);
        setIntField(term493231, term493231.getClass(), "touchGreat", 0);
        setIntField(term493231, term493231.getClass(), "touchGood", 0);
        setIntField(term493231, term493231.getClass(), "touchMiss", 0);
        setIntField(term493231, term493231.getClass(), "breakCriticalPerfect", 0);
        setIntField(term493231, term493231.getClass(), "breakPerfect", 0);
        setIntField(term493231, term493231.getClass(), "breakGreat", 0);
        setIntField(term493231, term493231.getClass(), "breakGood", 0);
        setIntField(term493231, term493231.getClass(), "breakMiss", 0);
        setBooleanField(term493231, term493231.getClass(), "isTap", false);
        setBooleanField(term493231, term493231.getClass(), "isHold", false);
        setBooleanField(term493231, term493231.getClass(), "isSlide", false);
        setBooleanField(term493231, term493231.getClass(), "isTouch", false);
        setBooleanField(term493231, term493231.getClass(), "isBreak", false);
        setBooleanField(term493231, term493231.getClass(), "isCriticalDisp", false);
        setBooleanField(term493231, term493231.getClass(), "isFastLateDisp", false);
        setIntField(term493231, term493231.getClass(), "fastCount", 0);
        setIntField(term493231, term493231.getClass(), "lateCount", 0);
        setBooleanField(term493231, term493231.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term493231, term493231.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term493231, term493231.getClass(), "comboStatus", 0);
        setIntField(term493231, term493231.getClass(), "syncStatus", 0);
        setBooleanField(term493231, term493231.getClass(), "isClear", false);
        setIntField(term493231, term493231.getClass(), "beforeRating", 0);
        setIntField(term493231, term493231.getClass(), "afterRating", 0);
        setIntField(term493231, term493231.getClass(), "beforeGrade", 0);
        setIntField(term493231, term493231.getClass(), "afterGrade", 0);
        setIntField(term493231, term493231.getClass(), "afterGradeRank", 0);
        setIntField(term493231, term493231.getClass(), "beforeDeluxRating", 0);
        setIntField(term493231, term493231.getClass(), "afterDeluxRating", 0);
        setBooleanField(term493231, term493231.getClass(), "isPlayTutorial", false);
        setBooleanField(term493231, term493231.getClass(), "isEventMode", false);
        setBooleanField(term493231, term493231.getClass(), "isFreedomMode", false);
        setIntField(term493231, term493231.getClass(), "playMode", 0);
        setBooleanField(term493231, term493231.getClass(), "isNewFree", false);
        setIntField(term493231, term493231.getClass(), "trialPlayAchievement", 0);
        setIntField(term493231, term493231.getClass(), "extNum1", 0);
        setIntField(term493231, term493231.getClass(), "extNum2", 0);
        term493331 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term493331;
        callMethod(klass, "setSlideGreat", argTypes, term493231, args);
    }

};


