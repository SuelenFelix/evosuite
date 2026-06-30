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

public class UserPlaylog_getCharacterAwakening5_847815364265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term480417;

    public UserPlaylog_getCharacterAwakening5_847815364265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term480417 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term480417, term480417.getClass(), "id", 0L);
        setField(term480417, term480417.getClass(), "user", null);
        setIntField(term480417, term480417.getClass(), "orderId", 0);
        setLongField(term480417, term480417.getClass(), "playlogId", 0L);
        setIntField(term480417, term480417.getClass(), "version", 0);
        setIntField(term480417, term480417.getClass(), "placeId", 0);
        setField(term480417, term480417.getClass(), "placeName", null);
        setLongField(term480417, term480417.getClass(), "loginDate", 0L);
        setField(term480417, term480417.getClass(), "playDate", null);
        setField(term480417, term480417.getClass(), "userPlayDate", null);
        setIntField(term480417, term480417.getClass(), "type", 0);
        setIntField(term480417, term480417.getClass(), "musicId", 0);
        setIntField(term480417, term480417.getClass(), "level", 0);
        setIntField(term480417, term480417.getClass(), "trackNo", 0);
        setIntField(term480417, term480417.getClass(), "vsMode", 0);
        setField(term480417, term480417.getClass(), "vsUserName", null);
        setIntField(term480417, term480417.getClass(), "vsStatus", 0);
        setIntField(term480417, term480417.getClass(), "vsUserRating", 0);
        setIntField(term480417, term480417.getClass(), "vsUserAchievement", 0);
        setIntField(term480417, term480417.getClass(), "vsUserGradeRank", 0);
        setIntField(term480417, term480417.getClass(), "vsRank", 0);
        setIntField(term480417, term480417.getClass(), "playerNum", 0);
        setLongField(term480417, term480417.getClass(), "playedUserId1", 0L);
        setField(term480417, term480417.getClass(), "playedUserName1", null);
        setIntField(term480417, term480417.getClass(), "playedMusicLevel1", 0);
        setLongField(term480417, term480417.getClass(), "playedUserId2", 0L);
        setField(term480417, term480417.getClass(), "playedUserName2", null);
        setIntField(term480417, term480417.getClass(), "playedMusicLevel2", 0);
        setLongField(term480417, term480417.getClass(), "playedUserId3", 0L);
        setField(term480417, term480417.getClass(), "playedUserName3", null);
        setIntField(term480417, term480417.getClass(), "playedMusicLevel3", 0);
        setIntField(term480417, term480417.getClass(), "characterId1", 0);
        setIntField(term480417, term480417.getClass(), "characterLevel1", 0);
        setIntField(term480417, term480417.getClass(), "characterAwakening1", 0);
        setIntField(term480417, term480417.getClass(), "characterId2", 0);
        setIntField(term480417, term480417.getClass(), "characterLevel2", 0);
        setIntField(term480417, term480417.getClass(), "characterAwakening2", 0);
        setIntField(term480417, term480417.getClass(), "characterId3", 0);
        setIntField(term480417, term480417.getClass(), "characterLevel3", 0);
        setIntField(term480417, term480417.getClass(), "characterAwakening3", 0);
        setIntField(term480417, term480417.getClass(), "characterId4", 0);
        setIntField(term480417, term480417.getClass(), "characterLevel4", 0);
        setIntField(term480417, term480417.getClass(), "characterAwakening4", 0);
        setIntField(term480417, term480417.getClass(), "characterId5", 0);
        setIntField(term480417, term480417.getClass(), "characterLevel5", 0);
        setIntField(term480417, term480417.getClass(), "characterAwakening5", 0);
        setIntField(term480417, term480417.getClass(), "achievement", 0);
        setIntField(term480417, term480417.getClass(), "deluxscore", 0);
        setIntField(term480417, term480417.getClass(), "scoreRank", 0);
        setIntField(term480417, term480417.getClass(), "maxCombo", 0);
        setIntField(term480417, term480417.getClass(), "totalCombo", 0);
        setIntField(term480417, term480417.getClass(), "maxSync", 0);
        setIntField(term480417, term480417.getClass(), "totalSync", 0);
        setIntField(term480417, term480417.getClass(), "tapCriticalPerfect", 0);
        setIntField(term480417, term480417.getClass(), "tapPerfect", 0);
        setIntField(term480417, term480417.getClass(), "tapGreat", 0);
        setIntField(term480417, term480417.getClass(), "tapGood", 0);
        setIntField(term480417, term480417.getClass(), "tapMiss", 0);
        setIntField(term480417, term480417.getClass(), "holdCriticalPerfect", 0);
        setIntField(term480417, term480417.getClass(), "holdPerfect", 0);
        setIntField(term480417, term480417.getClass(), "holdGreat", 0);
        setIntField(term480417, term480417.getClass(), "holdGood", 0);
        setIntField(term480417, term480417.getClass(), "holdMiss", 0);
        setIntField(term480417, term480417.getClass(), "slideCriticalPerfect", 0);
        setIntField(term480417, term480417.getClass(), "slidePerfect", 0);
        setIntField(term480417, term480417.getClass(), "slideGreat", 0);
        setIntField(term480417, term480417.getClass(), "slideGood", 0);
        setIntField(term480417, term480417.getClass(), "slideMiss", 0);
        setIntField(term480417, term480417.getClass(), "touchCriticalPerfect", 0);
        setIntField(term480417, term480417.getClass(), "touchPerfect", 0);
        setIntField(term480417, term480417.getClass(), "touchGreat", 0);
        setIntField(term480417, term480417.getClass(), "touchGood", 0);
        setIntField(term480417, term480417.getClass(), "touchMiss", 0);
        setIntField(term480417, term480417.getClass(), "breakCriticalPerfect", 0);
        setIntField(term480417, term480417.getClass(), "breakPerfect", 0);
        setIntField(term480417, term480417.getClass(), "breakGreat", 0);
        setIntField(term480417, term480417.getClass(), "breakGood", 0);
        setIntField(term480417, term480417.getClass(), "breakMiss", 0);
        setBooleanField(term480417, term480417.getClass(), "isTap", false);
        setBooleanField(term480417, term480417.getClass(), "isHold", false);
        setBooleanField(term480417, term480417.getClass(), "isSlide", false);
        setBooleanField(term480417, term480417.getClass(), "isTouch", false);
        setBooleanField(term480417, term480417.getClass(), "isBreak", false);
        setBooleanField(term480417, term480417.getClass(), "isCriticalDisp", false);
        setBooleanField(term480417, term480417.getClass(), "isFastLateDisp", false);
        setIntField(term480417, term480417.getClass(), "fastCount", 0);
        setIntField(term480417, term480417.getClass(), "lateCount", 0);
        setBooleanField(term480417, term480417.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term480417, term480417.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term480417, term480417.getClass(), "comboStatus", 0);
        setIntField(term480417, term480417.getClass(), "syncStatus", 0);
        setBooleanField(term480417, term480417.getClass(), "isClear", false);
        setIntField(term480417, term480417.getClass(), "beforeRating", 0);
        setIntField(term480417, term480417.getClass(), "afterRating", 0);
        setIntField(term480417, term480417.getClass(), "beforeGrade", 0);
        setIntField(term480417, term480417.getClass(), "afterGrade", 0);
        setIntField(term480417, term480417.getClass(), "afterGradeRank", 0);
        setIntField(term480417, term480417.getClass(), "beforeDeluxRating", 0);
        setIntField(term480417, term480417.getClass(), "afterDeluxRating", 0);
        setBooleanField(term480417, term480417.getClass(), "isPlayTutorial", false);
        setBooleanField(term480417, term480417.getClass(), "isEventMode", false);
        setBooleanField(term480417, term480417.getClass(), "isFreedomMode", false);
        setIntField(term480417, term480417.getClass(), "playMode", 0);
        setBooleanField(term480417, term480417.getClass(), "isNewFree", false);
        setIntField(term480417, term480417.getClass(), "trialPlayAchievement", 0);
        setIntField(term480417, term480417.getClass(), "extNum1", 0);
        setIntField(term480417, term480417.getClass(), "extNum2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharacterAwakening5", argTypes, term480417, args);
    }

};


