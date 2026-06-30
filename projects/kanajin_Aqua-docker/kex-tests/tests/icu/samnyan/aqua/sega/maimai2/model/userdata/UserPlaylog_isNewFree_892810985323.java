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

public class UserPlaylog_isNewFree_892810985323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term486217;

    public UserPlaylog_isNewFree_892810985323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term486217 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term486217, term486217.getClass(), "id", 0L);
        setField(term486217, term486217.getClass(), "user", null);
        setIntField(term486217, term486217.getClass(), "orderId", 0);
        setLongField(term486217, term486217.getClass(), "playlogId", 0L);
        setIntField(term486217, term486217.getClass(), "version", 0);
        setIntField(term486217, term486217.getClass(), "placeId", 0);
        setField(term486217, term486217.getClass(), "placeName", null);
        setLongField(term486217, term486217.getClass(), "loginDate", 0L);
        setField(term486217, term486217.getClass(), "playDate", null);
        setField(term486217, term486217.getClass(), "userPlayDate", null);
        setIntField(term486217, term486217.getClass(), "type", 0);
        setIntField(term486217, term486217.getClass(), "musicId", 0);
        setIntField(term486217, term486217.getClass(), "level", 0);
        setIntField(term486217, term486217.getClass(), "trackNo", 0);
        setIntField(term486217, term486217.getClass(), "vsMode", 0);
        setField(term486217, term486217.getClass(), "vsUserName", null);
        setIntField(term486217, term486217.getClass(), "vsStatus", 0);
        setIntField(term486217, term486217.getClass(), "vsUserRating", 0);
        setIntField(term486217, term486217.getClass(), "vsUserAchievement", 0);
        setIntField(term486217, term486217.getClass(), "vsUserGradeRank", 0);
        setIntField(term486217, term486217.getClass(), "vsRank", 0);
        setIntField(term486217, term486217.getClass(), "playerNum", 0);
        setLongField(term486217, term486217.getClass(), "playedUserId1", 0L);
        setField(term486217, term486217.getClass(), "playedUserName1", null);
        setIntField(term486217, term486217.getClass(), "playedMusicLevel1", 0);
        setLongField(term486217, term486217.getClass(), "playedUserId2", 0L);
        setField(term486217, term486217.getClass(), "playedUserName2", null);
        setIntField(term486217, term486217.getClass(), "playedMusicLevel2", 0);
        setLongField(term486217, term486217.getClass(), "playedUserId3", 0L);
        setField(term486217, term486217.getClass(), "playedUserName3", null);
        setIntField(term486217, term486217.getClass(), "playedMusicLevel3", 0);
        setIntField(term486217, term486217.getClass(), "characterId1", 0);
        setIntField(term486217, term486217.getClass(), "characterLevel1", 0);
        setIntField(term486217, term486217.getClass(), "characterAwakening1", 0);
        setIntField(term486217, term486217.getClass(), "characterId2", 0);
        setIntField(term486217, term486217.getClass(), "characterLevel2", 0);
        setIntField(term486217, term486217.getClass(), "characterAwakening2", 0);
        setIntField(term486217, term486217.getClass(), "characterId3", 0);
        setIntField(term486217, term486217.getClass(), "characterLevel3", 0);
        setIntField(term486217, term486217.getClass(), "characterAwakening3", 0);
        setIntField(term486217, term486217.getClass(), "characterId4", 0);
        setIntField(term486217, term486217.getClass(), "characterLevel4", 0);
        setIntField(term486217, term486217.getClass(), "characterAwakening4", 0);
        setIntField(term486217, term486217.getClass(), "characterId5", 0);
        setIntField(term486217, term486217.getClass(), "characterLevel5", 0);
        setIntField(term486217, term486217.getClass(), "characterAwakening5", 0);
        setIntField(term486217, term486217.getClass(), "achievement", 0);
        setIntField(term486217, term486217.getClass(), "deluxscore", 0);
        setIntField(term486217, term486217.getClass(), "scoreRank", 0);
        setIntField(term486217, term486217.getClass(), "maxCombo", 0);
        setIntField(term486217, term486217.getClass(), "totalCombo", 0);
        setIntField(term486217, term486217.getClass(), "maxSync", 0);
        setIntField(term486217, term486217.getClass(), "totalSync", 0);
        setIntField(term486217, term486217.getClass(), "tapCriticalPerfect", 0);
        setIntField(term486217, term486217.getClass(), "tapPerfect", 0);
        setIntField(term486217, term486217.getClass(), "tapGreat", 0);
        setIntField(term486217, term486217.getClass(), "tapGood", 0);
        setIntField(term486217, term486217.getClass(), "tapMiss", 0);
        setIntField(term486217, term486217.getClass(), "holdCriticalPerfect", 0);
        setIntField(term486217, term486217.getClass(), "holdPerfect", 0);
        setIntField(term486217, term486217.getClass(), "holdGreat", 0);
        setIntField(term486217, term486217.getClass(), "holdGood", 0);
        setIntField(term486217, term486217.getClass(), "holdMiss", 0);
        setIntField(term486217, term486217.getClass(), "slideCriticalPerfect", 0);
        setIntField(term486217, term486217.getClass(), "slidePerfect", 0);
        setIntField(term486217, term486217.getClass(), "slideGreat", 0);
        setIntField(term486217, term486217.getClass(), "slideGood", 0);
        setIntField(term486217, term486217.getClass(), "slideMiss", 0);
        setIntField(term486217, term486217.getClass(), "touchCriticalPerfect", 0);
        setIntField(term486217, term486217.getClass(), "touchPerfect", 0);
        setIntField(term486217, term486217.getClass(), "touchGreat", 0);
        setIntField(term486217, term486217.getClass(), "touchGood", 0);
        setIntField(term486217, term486217.getClass(), "touchMiss", 0);
        setIntField(term486217, term486217.getClass(), "breakCriticalPerfect", 0);
        setIntField(term486217, term486217.getClass(), "breakPerfect", 0);
        setIntField(term486217, term486217.getClass(), "breakGreat", 0);
        setIntField(term486217, term486217.getClass(), "breakGood", 0);
        setIntField(term486217, term486217.getClass(), "breakMiss", 0);
        setBooleanField(term486217, term486217.getClass(), "isTap", false);
        setBooleanField(term486217, term486217.getClass(), "isHold", false);
        setBooleanField(term486217, term486217.getClass(), "isSlide", false);
        setBooleanField(term486217, term486217.getClass(), "isTouch", false);
        setBooleanField(term486217, term486217.getClass(), "isBreak", false);
        setBooleanField(term486217, term486217.getClass(), "isCriticalDisp", false);
        setBooleanField(term486217, term486217.getClass(), "isFastLateDisp", false);
        setIntField(term486217, term486217.getClass(), "fastCount", 0);
        setIntField(term486217, term486217.getClass(), "lateCount", 0);
        setBooleanField(term486217, term486217.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term486217, term486217.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term486217, term486217.getClass(), "comboStatus", 0);
        setIntField(term486217, term486217.getClass(), "syncStatus", 0);
        setBooleanField(term486217, term486217.getClass(), "isClear", false);
        setIntField(term486217, term486217.getClass(), "beforeRating", 0);
        setIntField(term486217, term486217.getClass(), "afterRating", 0);
        setIntField(term486217, term486217.getClass(), "beforeGrade", 0);
        setIntField(term486217, term486217.getClass(), "afterGrade", 0);
        setIntField(term486217, term486217.getClass(), "afterGradeRank", 0);
        setIntField(term486217, term486217.getClass(), "beforeDeluxRating", 0);
        setIntField(term486217, term486217.getClass(), "afterDeluxRating", 0);
        setBooleanField(term486217, term486217.getClass(), "isPlayTutorial", false);
        setBooleanField(term486217, term486217.getClass(), "isEventMode", false);
        setBooleanField(term486217, term486217.getClass(), "isFreedomMode", false);
        setIntField(term486217, term486217.getClass(), "playMode", 0);
        setBooleanField(term486217, term486217.getClass(), "isNewFree", false);
        setIntField(term486217, term486217.getClass(), "trialPlayAchievement", 0);
        setIntField(term486217, term486217.getClass(), "extNum1", 0);
        setIntField(term486217, term486217.getClass(), "extNum2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isNewFree", argTypes, term486217, args);
    }

};


