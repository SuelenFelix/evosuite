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

public class UserPlaylog_getBreakMiss_513481542297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term483617;

    public UserPlaylog_getBreakMiss_513481542297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term483617 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term483617, term483617.getClass(), "id", 0L);
        setField(term483617, term483617.getClass(), "user", null);
        setIntField(term483617, term483617.getClass(), "orderId", 0);
        setLongField(term483617, term483617.getClass(), "playlogId", 0L);
        setIntField(term483617, term483617.getClass(), "version", 0);
        setIntField(term483617, term483617.getClass(), "placeId", 0);
        setField(term483617, term483617.getClass(), "placeName", null);
        setLongField(term483617, term483617.getClass(), "loginDate", 0L);
        setField(term483617, term483617.getClass(), "playDate", null);
        setField(term483617, term483617.getClass(), "userPlayDate", null);
        setIntField(term483617, term483617.getClass(), "type", 0);
        setIntField(term483617, term483617.getClass(), "musicId", 0);
        setIntField(term483617, term483617.getClass(), "level", 0);
        setIntField(term483617, term483617.getClass(), "trackNo", 0);
        setIntField(term483617, term483617.getClass(), "vsMode", 0);
        setField(term483617, term483617.getClass(), "vsUserName", null);
        setIntField(term483617, term483617.getClass(), "vsStatus", 0);
        setIntField(term483617, term483617.getClass(), "vsUserRating", 0);
        setIntField(term483617, term483617.getClass(), "vsUserAchievement", 0);
        setIntField(term483617, term483617.getClass(), "vsUserGradeRank", 0);
        setIntField(term483617, term483617.getClass(), "vsRank", 0);
        setIntField(term483617, term483617.getClass(), "playerNum", 0);
        setLongField(term483617, term483617.getClass(), "playedUserId1", 0L);
        setField(term483617, term483617.getClass(), "playedUserName1", null);
        setIntField(term483617, term483617.getClass(), "playedMusicLevel1", 0);
        setLongField(term483617, term483617.getClass(), "playedUserId2", 0L);
        setField(term483617, term483617.getClass(), "playedUserName2", null);
        setIntField(term483617, term483617.getClass(), "playedMusicLevel2", 0);
        setLongField(term483617, term483617.getClass(), "playedUserId3", 0L);
        setField(term483617, term483617.getClass(), "playedUserName3", null);
        setIntField(term483617, term483617.getClass(), "playedMusicLevel3", 0);
        setIntField(term483617, term483617.getClass(), "characterId1", 0);
        setIntField(term483617, term483617.getClass(), "characterLevel1", 0);
        setIntField(term483617, term483617.getClass(), "characterAwakening1", 0);
        setIntField(term483617, term483617.getClass(), "characterId2", 0);
        setIntField(term483617, term483617.getClass(), "characterLevel2", 0);
        setIntField(term483617, term483617.getClass(), "characterAwakening2", 0);
        setIntField(term483617, term483617.getClass(), "characterId3", 0);
        setIntField(term483617, term483617.getClass(), "characterLevel3", 0);
        setIntField(term483617, term483617.getClass(), "characterAwakening3", 0);
        setIntField(term483617, term483617.getClass(), "characterId4", 0);
        setIntField(term483617, term483617.getClass(), "characterLevel4", 0);
        setIntField(term483617, term483617.getClass(), "characterAwakening4", 0);
        setIntField(term483617, term483617.getClass(), "characterId5", 0);
        setIntField(term483617, term483617.getClass(), "characterLevel5", 0);
        setIntField(term483617, term483617.getClass(), "characterAwakening5", 0);
        setIntField(term483617, term483617.getClass(), "achievement", 0);
        setIntField(term483617, term483617.getClass(), "deluxscore", 0);
        setIntField(term483617, term483617.getClass(), "scoreRank", 0);
        setIntField(term483617, term483617.getClass(), "maxCombo", 0);
        setIntField(term483617, term483617.getClass(), "totalCombo", 0);
        setIntField(term483617, term483617.getClass(), "maxSync", 0);
        setIntField(term483617, term483617.getClass(), "totalSync", 0);
        setIntField(term483617, term483617.getClass(), "tapCriticalPerfect", 0);
        setIntField(term483617, term483617.getClass(), "tapPerfect", 0);
        setIntField(term483617, term483617.getClass(), "tapGreat", 0);
        setIntField(term483617, term483617.getClass(), "tapGood", 0);
        setIntField(term483617, term483617.getClass(), "tapMiss", 0);
        setIntField(term483617, term483617.getClass(), "holdCriticalPerfect", 0);
        setIntField(term483617, term483617.getClass(), "holdPerfect", 0);
        setIntField(term483617, term483617.getClass(), "holdGreat", 0);
        setIntField(term483617, term483617.getClass(), "holdGood", 0);
        setIntField(term483617, term483617.getClass(), "holdMiss", 0);
        setIntField(term483617, term483617.getClass(), "slideCriticalPerfect", 0);
        setIntField(term483617, term483617.getClass(), "slidePerfect", 0);
        setIntField(term483617, term483617.getClass(), "slideGreat", 0);
        setIntField(term483617, term483617.getClass(), "slideGood", 0);
        setIntField(term483617, term483617.getClass(), "slideMiss", 0);
        setIntField(term483617, term483617.getClass(), "touchCriticalPerfect", 0);
        setIntField(term483617, term483617.getClass(), "touchPerfect", 0);
        setIntField(term483617, term483617.getClass(), "touchGreat", 0);
        setIntField(term483617, term483617.getClass(), "touchGood", 0);
        setIntField(term483617, term483617.getClass(), "touchMiss", 0);
        setIntField(term483617, term483617.getClass(), "breakCriticalPerfect", 0);
        setIntField(term483617, term483617.getClass(), "breakPerfect", 0);
        setIntField(term483617, term483617.getClass(), "breakGreat", 0);
        setIntField(term483617, term483617.getClass(), "breakGood", 0);
        setIntField(term483617, term483617.getClass(), "breakMiss", 0);
        setBooleanField(term483617, term483617.getClass(), "isTap", false);
        setBooleanField(term483617, term483617.getClass(), "isHold", false);
        setBooleanField(term483617, term483617.getClass(), "isSlide", false);
        setBooleanField(term483617, term483617.getClass(), "isTouch", false);
        setBooleanField(term483617, term483617.getClass(), "isBreak", false);
        setBooleanField(term483617, term483617.getClass(), "isCriticalDisp", false);
        setBooleanField(term483617, term483617.getClass(), "isFastLateDisp", false);
        setIntField(term483617, term483617.getClass(), "fastCount", 0);
        setIntField(term483617, term483617.getClass(), "lateCount", 0);
        setBooleanField(term483617, term483617.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term483617, term483617.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term483617, term483617.getClass(), "comboStatus", 0);
        setIntField(term483617, term483617.getClass(), "syncStatus", 0);
        setBooleanField(term483617, term483617.getClass(), "isClear", false);
        setIntField(term483617, term483617.getClass(), "beforeRating", 0);
        setIntField(term483617, term483617.getClass(), "afterRating", 0);
        setIntField(term483617, term483617.getClass(), "beforeGrade", 0);
        setIntField(term483617, term483617.getClass(), "afterGrade", 0);
        setIntField(term483617, term483617.getClass(), "afterGradeRank", 0);
        setIntField(term483617, term483617.getClass(), "beforeDeluxRating", 0);
        setIntField(term483617, term483617.getClass(), "afterDeluxRating", 0);
        setBooleanField(term483617, term483617.getClass(), "isPlayTutorial", false);
        setBooleanField(term483617, term483617.getClass(), "isEventMode", false);
        setBooleanField(term483617, term483617.getClass(), "isFreedomMode", false);
        setIntField(term483617, term483617.getClass(), "playMode", 0);
        setBooleanField(term483617, term483617.getClass(), "isNewFree", false);
        setIntField(term483617, term483617.getClass(), "trialPlayAchievement", 0);
        setIntField(term483617, term483617.getClass(), "extNum1", 0);
        setIntField(term483617, term483617.getClass(), "extNum2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBreakMiss", argTypes, term483617, args);
    }

};


