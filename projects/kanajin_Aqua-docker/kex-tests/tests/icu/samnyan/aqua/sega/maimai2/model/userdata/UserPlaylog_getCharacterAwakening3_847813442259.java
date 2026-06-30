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

public class UserPlaylog_getCharacterAwakening3_847813442259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term479817;

    public UserPlaylog_getCharacterAwakening3_847813442259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term479817 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term479817, term479817.getClass(), "id", 0L);
        setField(term479817, term479817.getClass(), "user", null);
        setIntField(term479817, term479817.getClass(), "orderId", 0);
        setLongField(term479817, term479817.getClass(), "playlogId", 0L);
        setIntField(term479817, term479817.getClass(), "version", 0);
        setIntField(term479817, term479817.getClass(), "placeId", 0);
        setField(term479817, term479817.getClass(), "placeName", null);
        setLongField(term479817, term479817.getClass(), "loginDate", 0L);
        setField(term479817, term479817.getClass(), "playDate", null);
        setField(term479817, term479817.getClass(), "userPlayDate", null);
        setIntField(term479817, term479817.getClass(), "type", 0);
        setIntField(term479817, term479817.getClass(), "musicId", 0);
        setIntField(term479817, term479817.getClass(), "level", 0);
        setIntField(term479817, term479817.getClass(), "trackNo", 0);
        setIntField(term479817, term479817.getClass(), "vsMode", 0);
        setField(term479817, term479817.getClass(), "vsUserName", null);
        setIntField(term479817, term479817.getClass(), "vsStatus", 0);
        setIntField(term479817, term479817.getClass(), "vsUserRating", 0);
        setIntField(term479817, term479817.getClass(), "vsUserAchievement", 0);
        setIntField(term479817, term479817.getClass(), "vsUserGradeRank", 0);
        setIntField(term479817, term479817.getClass(), "vsRank", 0);
        setIntField(term479817, term479817.getClass(), "playerNum", 0);
        setLongField(term479817, term479817.getClass(), "playedUserId1", 0L);
        setField(term479817, term479817.getClass(), "playedUserName1", null);
        setIntField(term479817, term479817.getClass(), "playedMusicLevel1", 0);
        setLongField(term479817, term479817.getClass(), "playedUserId2", 0L);
        setField(term479817, term479817.getClass(), "playedUserName2", null);
        setIntField(term479817, term479817.getClass(), "playedMusicLevel2", 0);
        setLongField(term479817, term479817.getClass(), "playedUserId3", 0L);
        setField(term479817, term479817.getClass(), "playedUserName3", null);
        setIntField(term479817, term479817.getClass(), "playedMusicLevel3", 0);
        setIntField(term479817, term479817.getClass(), "characterId1", 0);
        setIntField(term479817, term479817.getClass(), "characterLevel1", 0);
        setIntField(term479817, term479817.getClass(), "characterAwakening1", 0);
        setIntField(term479817, term479817.getClass(), "characterId2", 0);
        setIntField(term479817, term479817.getClass(), "characterLevel2", 0);
        setIntField(term479817, term479817.getClass(), "characterAwakening2", 0);
        setIntField(term479817, term479817.getClass(), "characterId3", 0);
        setIntField(term479817, term479817.getClass(), "characterLevel3", 0);
        setIntField(term479817, term479817.getClass(), "characterAwakening3", 0);
        setIntField(term479817, term479817.getClass(), "characterId4", 0);
        setIntField(term479817, term479817.getClass(), "characterLevel4", 0);
        setIntField(term479817, term479817.getClass(), "characterAwakening4", 0);
        setIntField(term479817, term479817.getClass(), "characterId5", 0);
        setIntField(term479817, term479817.getClass(), "characterLevel5", 0);
        setIntField(term479817, term479817.getClass(), "characterAwakening5", 0);
        setIntField(term479817, term479817.getClass(), "achievement", 0);
        setIntField(term479817, term479817.getClass(), "deluxscore", 0);
        setIntField(term479817, term479817.getClass(), "scoreRank", 0);
        setIntField(term479817, term479817.getClass(), "maxCombo", 0);
        setIntField(term479817, term479817.getClass(), "totalCombo", 0);
        setIntField(term479817, term479817.getClass(), "maxSync", 0);
        setIntField(term479817, term479817.getClass(), "totalSync", 0);
        setIntField(term479817, term479817.getClass(), "tapCriticalPerfect", 0);
        setIntField(term479817, term479817.getClass(), "tapPerfect", 0);
        setIntField(term479817, term479817.getClass(), "tapGreat", 0);
        setIntField(term479817, term479817.getClass(), "tapGood", 0);
        setIntField(term479817, term479817.getClass(), "tapMiss", 0);
        setIntField(term479817, term479817.getClass(), "holdCriticalPerfect", 0);
        setIntField(term479817, term479817.getClass(), "holdPerfect", 0);
        setIntField(term479817, term479817.getClass(), "holdGreat", 0);
        setIntField(term479817, term479817.getClass(), "holdGood", 0);
        setIntField(term479817, term479817.getClass(), "holdMiss", 0);
        setIntField(term479817, term479817.getClass(), "slideCriticalPerfect", 0);
        setIntField(term479817, term479817.getClass(), "slidePerfect", 0);
        setIntField(term479817, term479817.getClass(), "slideGreat", 0);
        setIntField(term479817, term479817.getClass(), "slideGood", 0);
        setIntField(term479817, term479817.getClass(), "slideMiss", 0);
        setIntField(term479817, term479817.getClass(), "touchCriticalPerfect", 0);
        setIntField(term479817, term479817.getClass(), "touchPerfect", 0);
        setIntField(term479817, term479817.getClass(), "touchGreat", 0);
        setIntField(term479817, term479817.getClass(), "touchGood", 0);
        setIntField(term479817, term479817.getClass(), "touchMiss", 0);
        setIntField(term479817, term479817.getClass(), "breakCriticalPerfect", 0);
        setIntField(term479817, term479817.getClass(), "breakPerfect", 0);
        setIntField(term479817, term479817.getClass(), "breakGreat", 0);
        setIntField(term479817, term479817.getClass(), "breakGood", 0);
        setIntField(term479817, term479817.getClass(), "breakMiss", 0);
        setBooleanField(term479817, term479817.getClass(), "isTap", false);
        setBooleanField(term479817, term479817.getClass(), "isHold", false);
        setBooleanField(term479817, term479817.getClass(), "isSlide", false);
        setBooleanField(term479817, term479817.getClass(), "isTouch", false);
        setBooleanField(term479817, term479817.getClass(), "isBreak", false);
        setBooleanField(term479817, term479817.getClass(), "isCriticalDisp", false);
        setBooleanField(term479817, term479817.getClass(), "isFastLateDisp", false);
        setIntField(term479817, term479817.getClass(), "fastCount", 0);
        setIntField(term479817, term479817.getClass(), "lateCount", 0);
        setBooleanField(term479817, term479817.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term479817, term479817.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term479817, term479817.getClass(), "comboStatus", 0);
        setIntField(term479817, term479817.getClass(), "syncStatus", 0);
        setBooleanField(term479817, term479817.getClass(), "isClear", false);
        setIntField(term479817, term479817.getClass(), "beforeRating", 0);
        setIntField(term479817, term479817.getClass(), "afterRating", 0);
        setIntField(term479817, term479817.getClass(), "beforeGrade", 0);
        setIntField(term479817, term479817.getClass(), "afterGrade", 0);
        setIntField(term479817, term479817.getClass(), "afterGradeRank", 0);
        setIntField(term479817, term479817.getClass(), "beforeDeluxRating", 0);
        setIntField(term479817, term479817.getClass(), "afterDeluxRating", 0);
        setBooleanField(term479817, term479817.getClass(), "isPlayTutorial", false);
        setBooleanField(term479817, term479817.getClass(), "isEventMode", false);
        setBooleanField(term479817, term479817.getClass(), "isFreedomMode", false);
        setIntField(term479817, term479817.getClass(), "playMode", 0);
        setBooleanField(term479817, term479817.getClass(), "isNewFree", false);
        setIntField(term479817, term479817.getClass(), "trialPlayAchievement", 0);
        setIntField(term479817, term479817.getClass(), "extNum1", 0);
        setIntField(term479817, term479817.getClass(), "extNum2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharacterAwakening3", argTypes, term479817, args);
    }

};


