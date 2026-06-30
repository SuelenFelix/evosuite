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

public class UserPlaylog_setAfterGradeRank_1975227380423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term496393;
     Object term496493;

    public UserPlaylog_setAfterGradeRank_1975227380423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term496393 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term496393, term496393.getClass(), "id", 0L);
        setField(term496393, term496393.getClass(), "user", null);
        setIntField(term496393, term496393.getClass(), "orderId", 0);
        setLongField(term496393, term496393.getClass(), "playlogId", 0L);
        setIntField(term496393, term496393.getClass(), "version", 0);
        setIntField(term496393, term496393.getClass(), "placeId", 0);
        setField(term496393, term496393.getClass(), "placeName", null);
        setLongField(term496393, term496393.getClass(), "loginDate", 0L);
        setField(term496393, term496393.getClass(), "playDate", null);
        setField(term496393, term496393.getClass(), "userPlayDate", null);
        setIntField(term496393, term496393.getClass(), "type", 0);
        setIntField(term496393, term496393.getClass(), "musicId", 0);
        setIntField(term496393, term496393.getClass(), "level", 0);
        setIntField(term496393, term496393.getClass(), "trackNo", 0);
        setIntField(term496393, term496393.getClass(), "vsMode", 0);
        setField(term496393, term496393.getClass(), "vsUserName", null);
        setIntField(term496393, term496393.getClass(), "vsStatus", 0);
        setIntField(term496393, term496393.getClass(), "vsUserRating", 0);
        setIntField(term496393, term496393.getClass(), "vsUserAchievement", 0);
        setIntField(term496393, term496393.getClass(), "vsUserGradeRank", 0);
        setIntField(term496393, term496393.getClass(), "vsRank", 0);
        setIntField(term496393, term496393.getClass(), "playerNum", 0);
        setLongField(term496393, term496393.getClass(), "playedUserId1", 0L);
        setField(term496393, term496393.getClass(), "playedUserName1", null);
        setIntField(term496393, term496393.getClass(), "playedMusicLevel1", 0);
        setLongField(term496393, term496393.getClass(), "playedUserId2", 0L);
        setField(term496393, term496393.getClass(), "playedUserName2", null);
        setIntField(term496393, term496393.getClass(), "playedMusicLevel2", 0);
        setLongField(term496393, term496393.getClass(), "playedUserId3", 0L);
        setField(term496393, term496393.getClass(), "playedUserName3", null);
        setIntField(term496393, term496393.getClass(), "playedMusicLevel3", 0);
        setIntField(term496393, term496393.getClass(), "characterId1", 0);
        setIntField(term496393, term496393.getClass(), "characterLevel1", 0);
        setIntField(term496393, term496393.getClass(), "characterAwakening1", 0);
        setIntField(term496393, term496393.getClass(), "characterId2", 0);
        setIntField(term496393, term496393.getClass(), "characterLevel2", 0);
        setIntField(term496393, term496393.getClass(), "characterAwakening2", 0);
        setIntField(term496393, term496393.getClass(), "characterId3", 0);
        setIntField(term496393, term496393.getClass(), "characterLevel3", 0);
        setIntField(term496393, term496393.getClass(), "characterAwakening3", 0);
        setIntField(term496393, term496393.getClass(), "characterId4", 0);
        setIntField(term496393, term496393.getClass(), "characterLevel4", 0);
        setIntField(term496393, term496393.getClass(), "characterAwakening4", 0);
        setIntField(term496393, term496393.getClass(), "characterId5", 0);
        setIntField(term496393, term496393.getClass(), "characterLevel5", 0);
        setIntField(term496393, term496393.getClass(), "characterAwakening5", 0);
        setIntField(term496393, term496393.getClass(), "achievement", 0);
        setIntField(term496393, term496393.getClass(), "deluxscore", 0);
        setIntField(term496393, term496393.getClass(), "scoreRank", 0);
        setIntField(term496393, term496393.getClass(), "maxCombo", 0);
        setIntField(term496393, term496393.getClass(), "totalCombo", 0);
        setIntField(term496393, term496393.getClass(), "maxSync", 0);
        setIntField(term496393, term496393.getClass(), "totalSync", 0);
        setIntField(term496393, term496393.getClass(), "tapCriticalPerfect", 0);
        setIntField(term496393, term496393.getClass(), "tapPerfect", 0);
        setIntField(term496393, term496393.getClass(), "tapGreat", 0);
        setIntField(term496393, term496393.getClass(), "tapGood", 0);
        setIntField(term496393, term496393.getClass(), "tapMiss", 0);
        setIntField(term496393, term496393.getClass(), "holdCriticalPerfect", 0);
        setIntField(term496393, term496393.getClass(), "holdPerfect", 0);
        setIntField(term496393, term496393.getClass(), "holdGreat", 0);
        setIntField(term496393, term496393.getClass(), "holdGood", 0);
        setIntField(term496393, term496393.getClass(), "holdMiss", 0);
        setIntField(term496393, term496393.getClass(), "slideCriticalPerfect", 0);
        setIntField(term496393, term496393.getClass(), "slidePerfect", 0);
        setIntField(term496393, term496393.getClass(), "slideGreat", 0);
        setIntField(term496393, term496393.getClass(), "slideGood", 0);
        setIntField(term496393, term496393.getClass(), "slideMiss", 0);
        setIntField(term496393, term496393.getClass(), "touchCriticalPerfect", 0);
        setIntField(term496393, term496393.getClass(), "touchPerfect", 0);
        setIntField(term496393, term496393.getClass(), "touchGreat", 0);
        setIntField(term496393, term496393.getClass(), "touchGood", 0);
        setIntField(term496393, term496393.getClass(), "touchMiss", 0);
        setIntField(term496393, term496393.getClass(), "breakCriticalPerfect", 0);
        setIntField(term496393, term496393.getClass(), "breakPerfect", 0);
        setIntField(term496393, term496393.getClass(), "breakGreat", 0);
        setIntField(term496393, term496393.getClass(), "breakGood", 0);
        setIntField(term496393, term496393.getClass(), "breakMiss", 0);
        setBooleanField(term496393, term496393.getClass(), "isTap", false);
        setBooleanField(term496393, term496393.getClass(), "isHold", false);
        setBooleanField(term496393, term496393.getClass(), "isSlide", false);
        setBooleanField(term496393, term496393.getClass(), "isTouch", false);
        setBooleanField(term496393, term496393.getClass(), "isBreak", false);
        setBooleanField(term496393, term496393.getClass(), "isCriticalDisp", false);
        setBooleanField(term496393, term496393.getClass(), "isFastLateDisp", false);
        setIntField(term496393, term496393.getClass(), "fastCount", 0);
        setIntField(term496393, term496393.getClass(), "lateCount", 0);
        setBooleanField(term496393, term496393.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term496393, term496393.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term496393, term496393.getClass(), "comboStatus", 0);
        setIntField(term496393, term496393.getClass(), "syncStatus", 0);
        setBooleanField(term496393, term496393.getClass(), "isClear", false);
        setIntField(term496393, term496393.getClass(), "beforeRating", 0);
        setIntField(term496393, term496393.getClass(), "afterRating", 0);
        setIntField(term496393, term496393.getClass(), "beforeGrade", 0);
        setIntField(term496393, term496393.getClass(), "afterGrade", 0);
        setIntField(term496393, term496393.getClass(), "afterGradeRank", 0);
        setIntField(term496393, term496393.getClass(), "beforeDeluxRating", 0);
        setIntField(term496393, term496393.getClass(), "afterDeluxRating", 0);
        setBooleanField(term496393, term496393.getClass(), "isPlayTutorial", false);
        setBooleanField(term496393, term496393.getClass(), "isEventMode", false);
        setBooleanField(term496393, term496393.getClass(), "isFreedomMode", false);
        setIntField(term496393, term496393.getClass(), "playMode", 0);
        setBooleanField(term496393, term496393.getClass(), "isNewFree", false);
        setIntField(term496393, term496393.getClass(), "trialPlayAchievement", 0);
        setIntField(term496393, term496393.getClass(), "extNum1", 0);
        setIntField(term496393, term496393.getClass(), "extNum2", 0);
        term496493 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term496493;
        callMethod(klass, "setAfterGradeRank", argTypes, term496393, args);
    }

};


