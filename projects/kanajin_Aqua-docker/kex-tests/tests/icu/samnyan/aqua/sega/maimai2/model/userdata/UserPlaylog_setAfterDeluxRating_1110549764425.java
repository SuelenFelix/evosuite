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

public class UserPlaylog_setAfterDeluxRating_1110549764425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term496597;
     Object term496697;

    public UserPlaylog_setAfterDeluxRating_1110549764425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term496597 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term496597, term496597.getClass(), "id", 0L);
        setField(term496597, term496597.getClass(), "user", null);
        setIntField(term496597, term496597.getClass(), "orderId", 0);
        setLongField(term496597, term496597.getClass(), "playlogId", 0L);
        setIntField(term496597, term496597.getClass(), "version", 0);
        setIntField(term496597, term496597.getClass(), "placeId", 0);
        setField(term496597, term496597.getClass(), "placeName", null);
        setLongField(term496597, term496597.getClass(), "loginDate", 0L);
        setField(term496597, term496597.getClass(), "playDate", null);
        setField(term496597, term496597.getClass(), "userPlayDate", null);
        setIntField(term496597, term496597.getClass(), "type", 0);
        setIntField(term496597, term496597.getClass(), "musicId", 0);
        setIntField(term496597, term496597.getClass(), "level", 0);
        setIntField(term496597, term496597.getClass(), "trackNo", 0);
        setIntField(term496597, term496597.getClass(), "vsMode", 0);
        setField(term496597, term496597.getClass(), "vsUserName", null);
        setIntField(term496597, term496597.getClass(), "vsStatus", 0);
        setIntField(term496597, term496597.getClass(), "vsUserRating", 0);
        setIntField(term496597, term496597.getClass(), "vsUserAchievement", 0);
        setIntField(term496597, term496597.getClass(), "vsUserGradeRank", 0);
        setIntField(term496597, term496597.getClass(), "vsRank", 0);
        setIntField(term496597, term496597.getClass(), "playerNum", 0);
        setLongField(term496597, term496597.getClass(), "playedUserId1", 0L);
        setField(term496597, term496597.getClass(), "playedUserName1", null);
        setIntField(term496597, term496597.getClass(), "playedMusicLevel1", 0);
        setLongField(term496597, term496597.getClass(), "playedUserId2", 0L);
        setField(term496597, term496597.getClass(), "playedUserName2", null);
        setIntField(term496597, term496597.getClass(), "playedMusicLevel2", 0);
        setLongField(term496597, term496597.getClass(), "playedUserId3", 0L);
        setField(term496597, term496597.getClass(), "playedUserName3", null);
        setIntField(term496597, term496597.getClass(), "playedMusicLevel3", 0);
        setIntField(term496597, term496597.getClass(), "characterId1", 0);
        setIntField(term496597, term496597.getClass(), "characterLevel1", 0);
        setIntField(term496597, term496597.getClass(), "characterAwakening1", 0);
        setIntField(term496597, term496597.getClass(), "characterId2", 0);
        setIntField(term496597, term496597.getClass(), "characterLevel2", 0);
        setIntField(term496597, term496597.getClass(), "characterAwakening2", 0);
        setIntField(term496597, term496597.getClass(), "characterId3", 0);
        setIntField(term496597, term496597.getClass(), "characterLevel3", 0);
        setIntField(term496597, term496597.getClass(), "characterAwakening3", 0);
        setIntField(term496597, term496597.getClass(), "characterId4", 0);
        setIntField(term496597, term496597.getClass(), "characterLevel4", 0);
        setIntField(term496597, term496597.getClass(), "characterAwakening4", 0);
        setIntField(term496597, term496597.getClass(), "characterId5", 0);
        setIntField(term496597, term496597.getClass(), "characterLevel5", 0);
        setIntField(term496597, term496597.getClass(), "characterAwakening5", 0);
        setIntField(term496597, term496597.getClass(), "achievement", 0);
        setIntField(term496597, term496597.getClass(), "deluxscore", 0);
        setIntField(term496597, term496597.getClass(), "scoreRank", 0);
        setIntField(term496597, term496597.getClass(), "maxCombo", 0);
        setIntField(term496597, term496597.getClass(), "totalCombo", 0);
        setIntField(term496597, term496597.getClass(), "maxSync", 0);
        setIntField(term496597, term496597.getClass(), "totalSync", 0);
        setIntField(term496597, term496597.getClass(), "tapCriticalPerfect", 0);
        setIntField(term496597, term496597.getClass(), "tapPerfect", 0);
        setIntField(term496597, term496597.getClass(), "tapGreat", 0);
        setIntField(term496597, term496597.getClass(), "tapGood", 0);
        setIntField(term496597, term496597.getClass(), "tapMiss", 0);
        setIntField(term496597, term496597.getClass(), "holdCriticalPerfect", 0);
        setIntField(term496597, term496597.getClass(), "holdPerfect", 0);
        setIntField(term496597, term496597.getClass(), "holdGreat", 0);
        setIntField(term496597, term496597.getClass(), "holdGood", 0);
        setIntField(term496597, term496597.getClass(), "holdMiss", 0);
        setIntField(term496597, term496597.getClass(), "slideCriticalPerfect", 0);
        setIntField(term496597, term496597.getClass(), "slidePerfect", 0);
        setIntField(term496597, term496597.getClass(), "slideGreat", 0);
        setIntField(term496597, term496597.getClass(), "slideGood", 0);
        setIntField(term496597, term496597.getClass(), "slideMiss", 0);
        setIntField(term496597, term496597.getClass(), "touchCriticalPerfect", 0);
        setIntField(term496597, term496597.getClass(), "touchPerfect", 0);
        setIntField(term496597, term496597.getClass(), "touchGreat", 0);
        setIntField(term496597, term496597.getClass(), "touchGood", 0);
        setIntField(term496597, term496597.getClass(), "touchMiss", 0);
        setIntField(term496597, term496597.getClass(), "breakCriticalPerfect", 0);
        setIntField(term496597, term496597.getClass(), "breakPerfect", 0);
        setIntField(term496597, term496597.getClass(), "breakGreat", 0);
        setIntField(term496597, term496597.getClass(), "breakGood", 0);
        setIntField(term496597, term496597.getClass(), "breakMiss", 0);
        setBooleanField(term496597, term496597.getClass(), "isTap", false);
        setBooleanField(term496597, term496597.getClass(), "isHold", false);
        setBooleanField(term496597, term496597.getClass(), "isSlide", false);
        setBooleanField(term496597, term496597.getClass(), "isTouch", false);
        setBooleanField(term496597, term496597.getClass(), "isBreak", false);
        setBooleanField(term496597, term496597.getClass(), "isCriticalDisp", false);
        setBooleanField(term496597, term496597.getClass(), "isFastLateDisp", false);
        setIntField(term496597, term496597.getClass(), "fastCount", 0);
        setIntField(term496597, term496597.getClass(), "lateCount", 0);
        setBooleanField(term496597, term496597.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term496597, term496597.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term496597, term496597.getClass(), "comboStatus", 0);
        setIntField(term496597, term496597.getClass(), "syncStatus", 0);
        setBooleanField(term496597, term496597.getClass(), "isClear", false);
        setIntField(term496597, term496597.getClass(), "beforeRating", 0);
        setIntField(term496597, term496597.getClass(), "afterRating", 0);
        setIntField(term496597, term496597.getClass(), "beforeGrade", 0);
        setIntField(term496597, term496597.getClass(), "afterGrade", 0);
        setIntField(term496597, term496597.getClass(), "afterGradeRank", 0);
        setIntField(term496597, term496597.getClass(), "beforeDeluxRating", 0);
        setIntField(term496597, term496597.getClass(), "afterDeluxRating", 0);
        setBooleanField(term496597, term496597.getClass(), "isPlayTutorial", false);
        setBooleanField(term496597, term496597.getClass(), "isEventMode", false);
        setBooleanField(term496597, term496597.getClass(), "isFreedomMode", false);
        setIntField(term496597, term496597.getClass(), "playMode", 0);
        setBooleanField(term496597, term496597.getClass(), "isNewFree", false);
        setIntField(term496597, term496597.getClass(), "trialPlayAchievement", 0);
        setIntField(term496597, term496597.getClass(), "extNum1", 0);
        setIntField(term496597, term496597.getClass(), "extNum2", 0);
        term496697 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term496697;
        callMethod(klass, "setAfterDeluxRating", argTypes, term496597, args);
    }

};


