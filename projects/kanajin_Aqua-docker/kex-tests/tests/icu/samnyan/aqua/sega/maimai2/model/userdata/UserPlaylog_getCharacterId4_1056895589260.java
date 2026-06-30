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

public class UserPlaylog_getCharacterId4_1056895589260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term479917;

    public UserPlaylog_getCharacterId4_1056895589260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term479917 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term479917, term479917.getClass(), "id", 0L);
        setField(term479917, term479917.getClass(), "user", null);
        setIntField(term479917, term479917.getClass(), "orderId", 0);
        setLongField(term479917, term479917.getClass(), "playlogId", 0L);
        setIntField(term479917, term479917.getClass(), "version", 0);
        setIntField(term479917, term479917.getClass(), "placeId", 0);
        setField(term479917, term479917.getClass(), "placeName", null);
        setLongField(term479917, term479917.getClass(), "loginDate", 0L);
        setField(term479917, term479917.getClass(), "playDate", null);
        setField(term479917, term479917.getClass(), "userPlayDate", null);
        setIntField(term479917, term479917.getClass(), "type", 0);
        setIntField(term479917, term479917.getClass(), "musicId", 0);
        setIntField(term479917, term479917.getClass(), "level", 0);
        setIntField(term479917, term479917.getClass(), "trackNo", 0);
        setIntField(term479917, term479917.getClass(), "vsMode", 0);
        setField(term479917, term479917.getClass(), "vsUserName", null);
        setIntField(term479917, term479917.getClass(), "vsStatus", 0);
        setIntField(term479917, term479917.getClass(), "vsUserRating", 0);
        setIntField(term479917, term479917.getClass(), "vsUserAchievement", 0);
        setIntField(term479917, term479917.getClass(), "vsUserGradeRank", 0);
        setIntField(term479917, term479917.getClass(), "vsRank", 0);
        setIntField(term479917, term479917.getClass(), "playerNum", 0);
        setLongField(term479917, term479917.getClass(), "playedUserId1", 0L);
        setField(term479917, term479917.getClass(), "playedUserName1", null);
        setIntField(term479917, term479917.getClass(), "playedMusicLevel1", 0);
        setLongField(term479917, term479917.getClass(), "playedUserId2", 0L);
        setField(term479917, term479917.getClass(), "playedUserName2", null);
        setIntField(term479917, term479917.getClass(), "playedMusicLevel2", 0);
        setLongField(term479917, term479917.getClass(), "playedUserId3", 0L);
        setField(term479917, term479917.getClass(), "playedUserName3", null);
        setIntField(term479917, term479917.getClass(), "playedMusicLevel3", 0);
        setIntField(term479917, term479917.getClass(), "characterId1", 0);
        setIntField(term479917, term479917.getClass(), "characterLevel1", 0);
        setIntField(term479917, term479917.getClass(), "characterAwakening1", 0);
        setIntField(term479917, term479917.getClass(), "characterId2", 0);
        setIntField(term479917, term479917.getClass(), "characterLevel2", 0);
        setIntField(term479917, term479917.getClass(), "characterAwakening2", 0);
        setIntField(term479917, term479917.getClass(), "characterId3", 0);
        setIntField(term479917, term479917.getClass(), "characterLevel3", 0);
        setIntField(term479917, term479917.getClass(), "characterAwakening3", 0);
        setIntField(term479917, term479917.getClass(), "characterId4", 0);
        setIntField(term479917, term479917.getClass(), "characterLevel4", 0);
        setIntField(term479917, term479917.getClass(), "characterAwakening4", 0);
        setIntField(term479917, term479917.getClass(), "characterId5", 0);
        setIntField(term479917, term479917.getClass(), "characterLevel5", 0);
        setIntField(term479917, term479917.getClass(), "characterAwakening5", 0);
        setIntField(term479917, term479917.getClass(), "achievement", 0);
        setIntField(term479917, term479917.getClass(), "deluxscore", 0);
        setIntField(term479917, term479917.getClass(), "scoreRank", 0);
        setIntField(term479917, term479917.getClass(), "maxCombo", 0);
        setIntField(term479917, term479917.getClass(), "totalCombo", 0);
        setIntField(term479917, term479917.getClass(), "maxSync", 0);
        setIntField(term479917, term479917.getClass(), "totalSync", 0);
        setIntField(term479917, term479917.getClass(), "tapCriticalPerfect", 0);
        setIntField(term479917, term479917.getClass(), "tapPerfect", 0);
        setIntField(term479917, term479917.getClass(), "tapGreat", 0);
        setIntField(term479917, term479917.getClass(), "tapGood", 0);
        setIntField(term479917, term479917.getClass(), "tapMiss", 0);
        setIntField(term479917, term479917.getClass(), "holdCriticalPerfect", 0);
        setIntField(term479917, term479917.getClass(), "holdPerfect", 0);
        setIntField(term479917, term479917.getClass(), "holdGreat", 0);
        setIntField(term479917, term479917.getClass(), "holdGood", 0);
        setIntField(term479917, term479917.getClass(), "holdMiss", 0);
        setIntField(term479917, term479917.getClass(), "slideCriticalPerfect", 0);
        setIntField(term479917, term479917.getClass(), "slidePerfect", 0);
        setIntField(term479917, term479917.getClass(), "slideGreat", 0);
        setIntField(term479917, term479917.getClass(), "slideGood", 0);
        setIntField(term479917, term479917.getClass(), "slideMiss", 0);
        setIntField(term479917, term479917.getClass(), "touchCriticalPerfect", 0);
        setIntField(term479917, term479917.getClass(), "touchPerfect", 0);
        setIntField(term479917, term479917.getClass(), "touchGreat", 0);
        setIntField(term479917, term479917.getClass(), "touchGood", 0);
        setIntField(term479917, term479917.getClass(), "touchMiss", 0);
        setIntField(term479917, term479917.getClass(), "breakCriticalPerfect", 0);
        setIntField(term479917, term479917.getClass(), "breakPerfect", 0);
        setIntField(term479917, term479917.getClass(), "breakGreat", 0);
        setIntField(term479917, term479917.getClass(), "breakGood", 0);
        setIntField(term479917, term479917.getClass(), "breakMiss", 0);
        setBooleanField(term479917, term479917.getClass(), "isTap", false);
        setBooleanField(term479917, term479917.getClass(), "isHold", false);
        setBooleanField(term479917, term479917.getClass(), "isSlide", false);
        setBooleanField(term479917, term479917.getClass(), "isTouch", false);
        setBooleanField(term479917, term479917.getClass(), "isBreak", false);
        setBooleanField(term479917, term479917.getClass(), "isCriticalDisp", false);
        setBooleanField(term479917, term479917.getClass(), "isFastLateDisp", false);
        setIntField(term479917, term479917.getClass(), "fastCount", 0);
        setIntField(term479917, term479917.getClass(), "lateCount", 0);
        setBooleanField(term479917, term479917.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term479917, term479917.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term479917, term479917.getClass(), "comboStatus", 0);
        setIntField(term479917, term479917.getClass(), "syncStatus", 0);
        setBooleanField(term479917, term479917.getClass(), "isClear", false);
        setIntField(term479917, term479917.getClass(), "beforeRating", 0);
        setIntField(term479917, term479917.getClass(), "afterRating", 0);
        setIntField(term479917, term479917.getClass(), "beforeGrade", 0);
        setIntField(term479917, term479917.getClass(), "afterGrade", 0);
        setIntField(term479917, term479917.getClass(), "afterGradeRank", 0);
        setIntField(term479917, term479917.getClass(), "beforeDeluxRating", 0);
        setIntField(term479917, term479917.getClass(), "afterDeluxRating", 0);
        setBooleanField(term479917, term479917.getClass(), "isPlayTutorial", false);
        setBooleanField(term479917, term479917.getClass(), "isEventMode", false);
        setBooleanField(term479917, term479917.getClass(), "isFreedomMode", false);
        setIntField(term479917, term479917.getClass(), "playMode", 0);
        setBooleanField(term479917, term479917.getClass(), "isNewFree", false);
        setIntField(term479917, term479917.getClass(), "trialPlayAchievement", 0);
        setIntField(term479917, term479917.getClass(), "extNum1", 0);
        setIntField(term479917, term479917.getClass(), "extNum2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharacterId4", argTypes, term479917, args);
    }

};


