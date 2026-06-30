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

public class UserPlaylog_setSlideGood_488753193393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term493333;
     Object term493433;

    public UserPlaylog_setSlideGood_488753193393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term493333 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term493333, term493333.getClass(), "id", 0L);
        setField(term493333, term493333.getClass(), "user", null);
        setIntField(term493333, term493333.getClass(), "orderId", 0);
        setLongField(term493333, term493333.getClass(), "playlogId", 0L);
        setIntField(term493333, term493333.getClass(), "version", 0);
        setIntField(term493333, term493333.getClass(), "placeId", 0);
        setField(term493333, term493333.getClass(), "placeName", null);
        setLongField(term493333, term493333.getClass(), "loginDate", 0L);
        setField(term493333, term493333.getClass(), "playDate", null);
        setField(term493333, term493333.getClass(), "userPlayDate", null);
        setIntField(term493333, term493333.getClass(), "type", 0);
        setIntField(term493333, term493333.getClass(), "musicId", 0);
        setIntField(term493333, term493333.getClass(), "level", 0);
        setIntField(term493333, term493333.getClass(), "trackNo", 0);
        setIntField(term493333, term493333.getClass(), "vsMode", 0);
        setField(term493333, term493333.getClass(), "vsUserName", null);
        setIntField(term493333, term493333.getClass(), "vsStatus", 0);
        setIntField(term493333, term493333.getClass(), "vsUserRating", 0);
        setIntField(term493333, term493333.getClass(), "vsUserAchievement", 0);
        setIntField(term493333, term493333.getClass(), "vsUserGradeRank", 0);
        setIntField(term493333, term493333.getClass(), "vsRank", 0);
        setIntField(term493333, term493333.getClass(), "playerNum", 0);
        setLongField(term493333, term493333.getClass(), "playedUserId1", 0L);
        setField(term493333, term493333.getClass(), "playedUserName1", null);
        setIntField(term493333, term493333.getClass(), "playedMusicLevel1", 0);
        setLongField(term493333, term493333.getClass(), "playedUserId2", 0L);
        setField(term493333, term493333.getClass(), "playedUserName2", null);
        setIntField(term493333, term493333.getClass(), "playedMusicLevel2", 0);
        setLongField(term493333, term493333.getClass(), "playedUserId3", 0L);
        setField(term493333, term493333.getClass(), "playedUserName3", null);
        setIntField(term493333, term493333.getClass(), "playedMusicLevel3", 0);
        setIntField(term493333, term493333.getClass(), "characterId1", 0);
        setIntField(term493333, term493333.getClass(), "characterLevel1", 0);
        setIntField(term493333, term493333.getClass(), "characterAwakening1", 0);
        setIntField(term493333, term493333.getClass(), "characterId2", 0);
        setIntField(term493333, term493333.getClass(), "characterLevel2", 0);
        setIntField(term493333, term493333.getClass(), "characterAwakening2", 0);
        setIntField(term493333, term493333.getClass(), "characterId3", 0);
        setIntField(term493333, term493333.getClass(), "characterLevel3", 0);
        setIntField(term493333, term493333.getClass(), "characterAwakening3", 0);
        setIntField(term493333, term493333.getClass(), "characterId4", 0);
        setIntField(term493333, term493333.getClass(), "characterLevel4", 0);
        setIntField(term493333, term493333.getClass(), "characterAwakening4", 0);
        setIntField(term493333, term493333.getClass(), "characterId5", 0);
        setIntField(term493333, term493333.getClass(), "characterLevel5", 0);
        setIntField(term493333, term493333.getClass(), "characterAwakening5", 0);
        setIntField(term493333, term493333.getClass(), "achievement", 0);
        setIntField(term493333, term493333.getClass(), "deluxscore", 0);
        setIntField(term493333, term493333.getClass(), "scoreRank", 0);
        setIntField(term493333, term493333.getClass(), "maxCombo", 0);
        setIntField(term493333, term493333.getClass(), "totalCombo", 0);
        setIntField(term493333, term493333.getClass(), "maxSync", 0);
        setIntField(term493333, term493333.getClass(), "totalSync", 0);
        setIntField(term493333, term493333.getClass(), "tapCriticalPerfect", 0);
        setIntField(term493333, term493333.getClass(), "tapPerfect", 0);
        setIntField(term493333, term493333.getClass(), "tapGreat", 0);
        setIntField(term493333, term493333.getClass(), "tapGood", 0);
        setIntField(term493333, term493333.getClass(), "tapMiss", 0);
        setIntField(term493333, term493333.getClass(), "holdCriticalPerfect", 0);
        setIntField(term493333, term493333.getClass(), "holdPerfect", 0);
        setIntField(term493333, term493333.getClass(), "holdGreat", 0);
        setIntField(term493333, term493333.getClass(), "holdGood", 0);
        setIntField(term493333, term493333.getClass(), "holdMiss", 0);
        setIntField(term493333, term493333.getClass(), "slideCriticalPerfect", 0);
        setIntField(term493333, term493333.getClass(), "slidePerfect", 0);
        setIntField(term493333, term493333.getClass(), "slideGreat", 0);
        setIntField(term493333, term493333.getClass(), "slideGood", 0);
        setIntField(term493333, term493333.getClass(), "slideMiss", 0);
        setIntField(term493333, term493333.getClass(), "touchCriticalPerfect", 0);
        setIntField(term493333, term493333.getClass(), "touchPerfect", 0);
        setIntField(term493333, term493333.getClass(), "touchGreat", 0);
        setIntField(term493333, term493333.getClass(), "touchGood", 0);
        setIntField(term493333, term493333.getClass(), "touchMiss", 0);
        setIntField(term493333, term493333.getClass(), "breakCriticalPerfect", 0);
        setIntField(term493333, term493333.getClass(), "breakPerfect", 0);
        setIntField(term493333, term493333.getClass(), "breakGreat", 0);
        setIntField(term493333, term493333.getClass(), "breakGood", 0);
        setIntField(term493333, term493333.getClass(), "breakMiss", 0);
        setBooleanField(term493333, term493333.getClass(), "isTap", false);
        setBooleanField(term493333, term493333.getClass(), "isHold", false);
        setBooleanField(term493333, term493333.getClass(), "isSlide", false);
        setBooleanField(term493333, term493333.getClass(), "isTouch", false);
        setBooleanField(term493333, term493333.getClass(), "isBreak", false);
        setBooleanField(term493333, term493333.getClass(), "isCriticalDisp", false);
        setBooleanField(term493333, term493333.getClass(), "isFastLateDisp", false);
        setIntField(term493333, term493333.getClass(), "fastCount", 0);
        setIntField(term493333, term493333.getClass(), "lateCount", 0);
        setBooleanField(term493333, term493333.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term493333, term493333.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term493333, term493333.getClass(), "comboStatus", 0);
        setIntField(term493333, term493333.getClass(), "syncStatus", 0);
        setBooleanField(term493333, term493333.getClass(), "isClear", false);
        setIntField(term493333, term493333.getClass(), "beforeRating", 0);
        setIntField(term493333, term493333.getClass(), "afterRating", 0);
        setIntField(term493333, term493333.getClass(), "beforeGrade", 0);
        setIntField(term493333, term493333.getClass(), "afterGrade", 0);
        setIntField(term493333, term493333.getClass(), "afterGradeRank", 0);
        setIntField(term493333, term493333.getClass(), "beforeDeluxRating", 0);
        setIntField(term493333, term493333.getClass(), "afterDeluxRating", 0);
        setBooleanField(term493333, term493333.getClass(), "isPlayTutorial", false);
        setBooleanField(term493333, term493333.getClass(), "isEventMode", false);
        setBooleanField(term493333, term493333.getClass(), "isFreedomMode", false);
        setIntField(term493333, term493333.getClass(), "playMode", 0);
        setBooleanField(term493333, term493333.getClass(), "isNewFree", false);
        setIntField(term493333, term493333.getClass(), "trialPlayAchievement", 0);
        setIntField(term493333, term493333.getClass(), "extNum1", 0);
        setIntField(term493333, term493333.getClass(), "extNum2", 0);
        term493433 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term493433;
        callMethod(klass, "setSlideGood", argTypes, term493333, args);
    }

};


