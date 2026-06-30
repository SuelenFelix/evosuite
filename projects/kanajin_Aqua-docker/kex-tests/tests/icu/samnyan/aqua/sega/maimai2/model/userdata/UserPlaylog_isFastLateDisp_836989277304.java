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

public class UserPlaylog_isFastLateDisp_836989277304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term484317;

    public UserPlaylog_isFastLateDisp_836989277304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term484317 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term484317, term484317.getClass(), "id", 0L);
        setField(term484317, term484317.getClass(), "user", null);
        setIntField(term484317, term484317.getClass(), "orderId", 0);
        setLongField(term484317, term484317.getClass(), "playlogId", 0L);
        setIntField(term484317, term484317.getClass(), "version", 0);
        setIntField(term484317, term484317.getClass(), "placeId", 0);
        setField(term484317, term484317.getClass(), "placeName", null);
        setLongField(term484317, term484317.getClass(), "loginDate", 0L);
        setField(term484317, term484317.getClass(), "playDate", null);
        setField(term484317, term484317.getClass(), "userPlayDate", null);
        setIntField(term484317, term484317.getClass(), "type", 0);
        setIntField(term484317, term484317.getClass(), "musicId", 0);
        setIntField(term484317, term484317.getClass(), "level", 0);
        setIntField(term484317, term484317.getClass(), "trackNo", 0);
        setIntField(term484317, term484317.getClass(), "vsMode", 0);
        setField(term484317, term484317.getClass(), "vsUserName", null);
        setIntField(term484317, term484317.getClass(), "vsStatus", 0);
        setIntField(term484317, term484317.getClass(), "vsUserRating", 0);
        setIntField(term484317, term484317.getClass(), "vsUserAchievement", 0);
        setIntField(term484317, term484317.getClass(), "vsUserGradeRank", 0);
        setIntField(term484317, term484317.getClass(), "vsRank", 0);
        setIntField(term484317, term484317.getClass(), "playerNum", 0);
        setLongField(term484317, term484317.getClass(), "playedUserId1", 0L);
        setField(term484317, term484317.getClass(), "playedUserName1", null);
        setIntField(term484317, term484317.getClass(), "playedMusicLevel1", 0);
        setLongField(term484317, term484317.getClass(), "playedUserId2", 0L);
        setField(term484317, term484317.getClass(), "playedUserName2", null);
        setIntField(term484317, term484317.getClass(), "playedMusicLevel2", 0);
        setLongField(term484317, term484317.getClass(), "playedUserId3", 0L);
        setField(term484317, term484317.getClass(), "playedUserName3", null);
        setIntField(term484317, term484317.getClass(), "playedMusicLevel3", 0);
        setIntField(term484317, term484317.getClass(), "characterId1", 0);
        setIntField(term484317, term484317.getClass(), "characterLevel1", 0);
        setIntField(term484317, term484317.getClass(), "characterAwakening1", 0);
        setIntField(term484317, term484317.getClass(), "characterId2", 0);
        setIntField(term484317, term484317.getClass(), "characterLevel2", 0);
        setIntField(term484317, term484317.getClass(), "characterAwakening2", 0);
        setIntField(term484317, term484317.getClass(), "characterId3", 0);
        setIntField(term484317, term484317.getClass(), "characterLevel3", 0);
        setIntField(term484317, term484317.getClass(), "characterAwakening3", 0);
        setIntField(term484317, term484317.getClass(), "characterId4", 0);
        setIntField(term484317, term484317.getClass(), "characterLevel4", 0);
        setIntField(term484317, term484317.getClass(), "characterAwakening4", 0);
        setIntField(term484317, term484317.getClass(), "characterId5", 0);
        setIntField(term484317, term484317.getClass(), "characterLevel5", 0);
        setIntField(term484317, term484317.getClass(), "characterAwakening5", 0);
        setIntField(term484317, term484317.getClass(), "achievement", 0);
        setIntField(term484317, term484317.getClass(), "deluxscore", 0);
        setIntField(term484317, term484317.getClass(), "scoreRank", 0);
        setIntField(term484317, term484317.getClass(), "maxCombo", 0);
        setIntField(term484317, term484317.getClass(), "totalCombo", 0);
        setIntField(term484317, term484317.getClass(), "maxSync", 0);
        setIntField(term484317, term484317.getClass(), "totalSync", 0);
        setIntField(term484317, term484317.getClass(), "tapCriticalPerfect", 0);
        setIntField(term484317, term484317.getClass(), "tapPerfect", 0);
        setIntField(term484317, term484317.getClass(), "tapGreat", 0);
        setIntField(term484317, term484317.getClass(), "tapGood", 0);
        setIntField(term484317, term484317.getClass(), "tapMiss", 0);
        setIntField(term484317, term484317.getClass(), "holdCriticalPerfect", 0);
        setIntField(term484317, term484317.getClass(), "holdPerfect", 0);
        setIntField(term484317, term484317.getClass(), "holdGreat", 0);
        setIntField(term484317, term484317.getClass(), "holdGood", 0);
        setIntField(term484317, term484317.getClass(), "holdMiss", 0);
        setIntField(term484317, term484317.getClass(), "slideCriticalPerfect", 0);
        setIntField(term484317, term484317.getClass(), "slidePerfect", 0);
        setIntField(term484317, term484317.getClass(), "slideGreat", 0);
        setIntField(term484317, term484317.getClass(), "slideGood", 0);
        setIntField(term484317, term484317.getClass(), "slideMiss", 0);
        setIntField(term484317, term484317.getClass(), "touchCriticalPerfect", 0);
        setIntField(term484317, term484317.getClass(), "touchPerfect", 0);
        setIntField(term484317, term484317.getClass(), "touchGreat", 0);
        setIntField(term484317, term484317.getClass(), "touchGood", 0);
        setIntField(term484317, term484317.getClass(), "touchMiss", 0);
        setIntField(term484317, term484317.getClass(), "breakCriticalPerfect", 0);
        setIntField(term484317, term484317.getClass(), "breakPerfect", 0);
        setIntField(term484317, term484317.getClass(), "breakGreat", 0);
        setIntField(term484317, term484317.getClass(), "breakGood", 0);
        setIntField(term484317, term484317.getClass(), "breakMiss", 0);
        setBooleanField(term484317, term484317.getClass(), "isTap", false);
        setBooleanField(term484317, term484317.getClass(), "isHold", false);
        setBooleanField(term484317, term484317.getClass(), "isSlide", false);
        setBooleanField(term484317, term484317.getClass(), "isTouch", false);
        setBooleanField(term484317, term484317.getClass(), "isBreak", false);
        setBooleanField(term484317, term484317.getClass(), "isCriticalDisp", false);
        setBooleanField(term484317, term484317.getClass(), "isFastLateDisp", false);
        setIntField(term484317, term484317.getClass(), "fastCount", 0);
        setIntField(term484317, term484317.getClass(), "lateCount", 0);
        setBooleanField(term484317, term484317.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term484317, term484317.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term484317, term484317.getClass(), "comboStatus", 0);
        setIntField(term484317, term484317.getClass(), "syncStatus", 0);
        setBooleanField(term484317, term484317.getClass(), "isClear", false);
        setIntField(term484317, term484317.getClass(), "beforeRating", 0);
        setIntField(term484317, term484317.getClass(), "afterRating", 0);
        setIntField(term484317, term484317.getClass(), "beforeGrade", 0);
        setIntField(term484317, term484317.getClass(), "afterGrade", 0);
        setIntField(term484317, term484317.getClass(), "afterGradeRank", 0);
        setIntField(term484317, term484317.getClass(), "beforeDeluxRating", 0);
        setIntField(term484317, term484317.getClass(), "afterDeluxRating", 0);
        setBooleanField(term484317, term484317.getClass(), "isPlayTutorial", false);
        setBooleanField(term484317, term484317.getClass(), "isEventMode", false);
        setBooleanField(term484317, term484317.getClass(), "isFreedomMode", false);
        setIntField(term484317, term484317.getClass(), "playMode", 0);
        setBooleanField(term484317, term484317.getClass(), "isNewFree", false);
        setIntField(term484317, term484317.getClass(), "trialPlayAchievement", 0);
        setIntField(term484317, term484317.getClass(), "extNum1", 0);
        setIntField(term484317, term484317.getClass(), "extNum2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFastLateDisp", argTypes, term484317, args);
    }

};


