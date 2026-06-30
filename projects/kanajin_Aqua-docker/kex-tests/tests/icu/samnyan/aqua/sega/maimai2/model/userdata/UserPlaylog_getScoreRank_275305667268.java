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

public class UserPlaylog_getScoreRank_275305667268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term480717;

    public UserPlaylog_getScoreRank_275305667268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term480717 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term480717, term480717.getClass(), "id", 0L);
        setField(term480717, term480717.getClass(), "user", null);
        setIntField(term480717, term480717.getClass(), "orderId", 0);
        setLongField(term480717, term480717.getClass(), "playlogId", 0L);
        setIntField(term480717, term480717.getClass(), "version", 0);
        setIntField(term480717, term480717.getClass(), "placeId", 0);
        setField(term480717, term480717.getClass(), "placeName", null);
        setLongField(term480717, term480717.getClass(), "loginDate", 0L);
        setField(term480717, term480717.getClass(), "playDate", null);
        setField(term480717, term480717.getClass(), "userPlayDate", null);
        setIntField(term480717, term480717.getClass(), "type", 0);
        setIntField(term480717, term480717.getClass(), "musicId", 0);
        setIntField(term480717, term480717.getClass(), "level", 0);
        setIntField(term480717, term480717.getClass(), "trackNo", 0);
        setIntField(term480717, term480717.getClass(), "vsMode", 0);
        setField(term480717, term480717.getClass(), "vsUserName", null);
        setIntField(term480717, term480717.getClass(), "vsStatus", 0);
        setIntField(term480717, term480717.getClass(), "vsUserRating", 0);
        setIntField(term480717, term480717.getClass(), "vsUserAchievement", 0);
        setIntField(term480717, term480717.getClass(), "vsUserGradeRank", 0);
        setIntField(term480717, term480717.getClass(), "vsRank", 0);
        setIntField(term480717, term480717.getClass(), "playerNum", 0);
        setLongField(term480717, term480717.getClass(), "playedUserId1", 0L);
        setField(term480717, term480717.getClass(), "playedUserName1", null);
        setIntField(term480717, term480717.getClass(), "playedMusicLevel1", 0);
        setLongField(term480717, term480717.getClass(), "playedUserId2", 0L);
        setField(term480717, term480717.getClass(), "playedUserName2", null);
        setIntField(term480717, term480717.getClass(), "playedMusicLevel2", 0);
        setLongField(term480717, term480717.getClass(), "playedUserId3", 0L);
        setField(term480717, term480717.getClass(), "playedUserName3", null);
        setIntField(term480717, term480717.getClass(), "playedMusicLevel3", 0);
        setIntField(term480717, term480717.getClass(), "characterId1", 0);
        setIntField(term480717, term480717.getClass(), "characterLevel1", 0);
        setIntField(term480717, term480717.getClass(), "characterAwakening1", 0);
        setIntField(term480717, term480717.getClass(), "characterId2", 0);
        setIntField(term480717, term480717.getClass(), "characterLevel2", 0);
        setIntField(term480717, term480717.getClass(), "characterAwakening2", 0);
        setIntField(term480717, term480717.getClass(), "characterId3", 0);
        setIntField(term480717, term480717.getClass(), "characterLevel3", 0);
        setIntField(term480717, term480717.getClass(), "characterAwakening3", 0);
        setIntField(term480717, term480717.getClass(), "characterId4", 0);
        setIntField(term480717, term480717.getClass(), "characterLevel4", 0);
        setIntField(term480717, term480717.getClass(), "characterAwakening4", 0);
        setIntField(term480717, term480717.getClass(), "characterId5", 0);
        setIntField(term480717, term480717.getClass(), "characterLevel5", 0);
        setIntField(term480717, term480717.getClass(), "characterAwakening5", 0);
        setIntField(term480717, term480717.getClass(), "achievement", 0);
        setIntField(term480717, term480717.getClass(), "deluxscore", 0);
        setIntField(term480717, term480717.getClass(), "scoreRank", 0);
        setIntField(term480717, term480717.getClass(), "maxCombo", 0);
        setIntField(term480717, term480717.getClass(), "totalCombo", 0);
        setIntField(term480717, term480717.getClass(), "maxSync", 0);
        setIntField(term480717, term480717.getClass(), "totalSync", 0);
        setIntField(term480717, term480717.getClass(), "tapCriticalPerfect", 0);
        setIntField(term480717, term480717.getClass(), "tapPerfect", 0);
        setIntField(term480717, term480717.getClass(), "tapGreat", 0);
        setIntField(term480717, term480717.getClass(), "tapGood", 0);
        setIntField(term480717, term480717.getClass(), "tapMiss", 0);
        setIntField(term480717, term480717.getClass(), "holdCriticalPerfect", 0);
        setIntField(term480717, term480717.getClass(), "holdPerfect", 0);
        setIntField(term480717, term480717.getClass(), "holdGreat", 0);
        setIntField(term480717, term480717.getClass(), "holdGood", 0);
        setIntField(term480717, term480717.getClass(), "holdMiss", 0);
        setIntField(term480717, term480717.getClass(), "slideCriticalPerfect", 0);
        setIntField(term480717, term480717.getClass(), "slidePerfect", 0);
        setIntField(term480717, term480717.getClass(), "slideGreat", 0);
        setIntField(term480717, term480717.getClass(), "slideGood", 0);
        setIntField(term480717, term480717.getClass(), "slideMiss", 0);
        setIntField(term480717, term480717.getClass(), "touchCriticalPerfect", 0);
        setIntField(term480717, term480717.getClass(), "touchPerfect", 0);
        setIntField(term480717, term480717.getClass(), "touchGreat", 0);
        setIntField(term480717, term480717.getClass(), "touchGood", 0);
        setIntField(term480717, term480717.getClass(), "touchMiss", 0);
        setIntField(term480717, term480717.getClass(), "breakCriticalPerfect", 0);
        setIntField(term480717, term480717.getClass(), "breakPerfect", 0);
        setIntField(term480717, term480717.getClass(), "breakGreat", 0);
        setIntField(term480717, term480717.getClass(), "breakGood", 0);
        setIntField(term480717, term480717.getClass(), "breakMiss", 0);
        setBooleanField(term480717, term480717.getClass(), "isTap", false);
        setBooleanField(term480717, term480717.getClass(), "isHold", false);
        setBooleanField(term480717, term480717.getClass(), "isSlide", false);
        setBooleanField(term480717, term480717.getClass(), "isTouch", false);
        setBooleanField(term480717, term480717.getClass(), "isBreak", false);
        setBooleanField(term480717, term480717.getClass(), "isCriticalDisp", false);
        setBooleanField(term480717, term480717.getClass(), "isFastLateDisp", false);
        setIntField(term480717, term480717.getClass(), "fastCount", 0);
        setIntField(term480717, term480717.getClass(), "lateCount", 0);
        setBooleanField(term480717, term480717.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term480717, term480717.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term480717, term480717.getClass(), "comboStatus", 0);
        setIntField(term480717, term480717.getClass(), "syncStatus", 0);
        setBooleanField(term480717, term480717.getClass(), "isClear", false);
        setIntField(term480717, term480717.getClass(), "beforeRating", 0);
        setIntField(term480717, term480717.getClass(), "afterRating", 0);
        setIntField(term480717, term480717.getClass(), "beforeGrade", 0);
        setIntField(term480717, term480717.getClass(), "afterGrade", 0);
        setIntField(term480717, term480717.getClass(), "afterGradeRank", 0);
        setIntField(term480717, term480717.getClass(), "beforeDeluxRating", 0);
        setIntField(term480717, term480717.getClass(), "afterDeluxRating", 0);
        setBooleanField(term480717, term480717.getClass(), "isPlayTutorial", false);
        setBooleanField(term480717, term480717.getClass(), "isEventMode", false);
        setBooleanField(term480717, term480717.getClass(), "isFreedomMode", false);
        setIntField(term480717, term480717.getClass(), "playMode", 0);
        setBooleanField(term480717, term480717.getClass(), "isNewFree", false);
        setIntField(term480717, term480717.getClass(), "trialPlayAchievement", 0);
        setIntField(term480717, term480717.getClass(), "extNum1", 0);
        setIntField(term480717, term480717.getClass(), "extNum2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScoreRank", argTypes, term480717, args);
    }

};


