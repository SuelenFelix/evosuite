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
import java.lang.Boolean;

public class UserPlaylog_setBreak_2017227176409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term494965;
     Object term495065;

    public UserPlaylog_setBreak_2017227176409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term494965 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term494965, term494965.getClass(), "id", 0L);
        setField(term494965, term494965.getClass(), "user", null);
        setIntField(term494965, term494965.getClass(), "orderId", 0);
        setLongField(term494965, term494965.getClass(), "playlogId", 0L);
        setIntField(term494965, term494965.getClass(), "version", 0);
        setIntField(term494965, term494965.getClass(), "placeId", 0);
        setField(term494965, term494965.getClass(), "placeName", null);
        setLongField(term494965, term494965.getClass(), "loginDate", 0L);
        setField(term494965, term494965.getClass(), "playDate", null);
        setField(term494965, term494965.getClass(), "userPlayDate", null);
        setIntField(term494965, term494965.getClass(), "type", 0);
        setIntField(term494965, term494965.getClass(), "musicId", 0);
        setIntField(term494965, term494965.getClass(), "level", 0);
        setIntField(term494965, term494965.getClass(), "trackNo", 0);
        setIntField(term494965, term494965.getClass(), "vsMode", 0);
        setField(term494965, term494965.getClass(), "vsUserName", null);
        setIntField(term494965, term494965.getClass(), "vsStatus", 0);
        setIntField(term494965, term494965.getClass(), "vsUserRating", 0);
        setIntField(term494965, term494965.getClass(), "vsUserAchievement", 0);
        setIntField(term494965, term494965.getClass(), "vsUserGradeRank", 0);
        setIntField(term494965, term494965.getClass(), "vsRank", 0);
        setIntField(term494965, term494965.getClass(), "playerNum", 0);
        setLongField(term494965, term494965.getClass(), "playedUserId1", 0L);
        setField(term494965, term494965.getClass(), "playedUserName1", null);
        setIntField(term494965, term494965.getClass(), "playedMusicLevel1", 0);
        setLongField(term494965, term494965.getClass(), "playedUserId2", 0L);
        setField(term494965, term494965.getClass(), "playedUserName2", null);
        setIntField(term494965, term494965.getClass(), "playedMusicLevel2", 0);
        setLongField(term494965, term494965.getClass(), "playedUserId3", 0L);
        setField(term494965, term494965.getClass(), "playedUserName3", null);
        setIntField(term494965, term494965.getClass(), "playedMusicLevel3", 0);
        setIntField(term494965, term494965.getClass(), "characterId1", 0);
        setIntField(term494965, term494965.getClass(), "characterLevel1", 0);
        setIntField(term494965, term494965.getClass(), "characterAwakening1", 0);
        setIntField(term494965, term494965.getClass(), "characterId2", 0);
        setIntField(term494965, term494965.getClass(), "characterLevel2", 0);
        setIntField(term494965, term494965.getClass(), "characterAwakening2", 0);
        setIntField(term494965, term494965.getClass(), "characterId3", 0);
        setIntField(term494965, term494965.getClass(), "characterLevel3", 0);
        setIntField(term494965, term494965.getClass(), "characterAwakening3", 0);
        setIntField(term494965, term494965.getClass(), "characterId4", 0);
        setIntField(term494965, term494965.getClass(), "characterLevel4", 0);
        setIntField(term494965, term494965.getClass(), "characterAwakening4", 0);
        setIntField(term494965, term494965.getClass(), "characterId5", 0);
        setIntField(term494965, term494965.getClass(), "characterLevel5", 0);
        setIntField(term494965, term494965.getClass(), "characterAwakening5", 0);
        setIntField(term494965, term494965.getClass(), "achievement", 0);
        setIntField(term494965, term494965.getClass(), "deluxscore", 0);
        setIntField(term494965, term494965.getClass(), "scoreRank", 0);
        setIntField(term494965, term494965.getClass(), "maxCombo", 0);
        setIntField(term494965, term494965.getClass(), "totalCombo", 0);
        setIntField(term494965, term494965.getClass(), "maxSync", 0);
        setIntField(term494965, term494965.getClass(), "totalSync", 0);
        setIntField(term494965, term494965.getClass(), "tapCriticalPerfect", 0);
        setIntField(term494965, term494965.getClass(), "tapPerfect", 0);
        setIntField(term494965, term494965.getClass(), "tapGreat", 0);
        setIntField(term494965, term494965.getClass(), "tapGood", 0);
        setIntField(term494965, term494965.getClass(), "tapMiss", 0);
        setIntField(term494965, term494965.getClass(), "holdCriticalPerfect", 0);
        setIntField(term494965, term494965.getClass(), "holdPerfect", 0);
        setIntField(term494965, term494965.getClass(), "holdGreat", 0);
        setIntField(term494965, term494965.getClass(), "holdGood", 0);
        setIntField(term494965, term494965.getClass(), "holdMiss", 0);
        setIntField(term494965, term494965.getClass(), "slideCriticalPerfect", 0);
        setIntField(term494965, term494965.getClass(), "slidePerfect", 0);
        setIntField(term494965, term494965.getClass(), "slideGreat", 0);
        setIntField(term494965, term494965.getClass(), "slideGood", 0);
        setIntField(term494965, term494965.getClass(), "slideMiss", 0);
        setIntField(term494965, term494965.getClass(), "touchCriticalPerfect", 0);
        setIntField(term494965, term494965.getClass(), "touchPerfect", 0);
        setIntField(term494965, term494965.getClass(), "touchGreat", 0);
        setIntField(term494965, term494965.getClass(), "touchGood", 0);
        setIntField(term494965, term494965.getClass(), "touchMiss", 0);
        setIntField(term494965, term494965.getClass(), "breakCriticalPerfect", 0);
        setIntField(term494965, term494965.getClass(), "breakPerfect", 0);
        setIntField(term494965, term494965.getClass(), "breakGreat", 0);
        setIntField(term494965, term494965.getClass(), "breakGood", 0);
        setIntField(term494965, term494965.getClass(), "breakMiss", 0);
        setBooleanField(term494965, term494965.getClass(), "isTap", false);
        setBooleanField(term494965, term494965.getClass(), "isHold", false);
        setBooleanField(term494965, term494965.getClass(), "isSlide", false);
        setBooleanField(term494965, term494965.getClass(), "isTouch", false);
        setBooleanField(term494965, term494965.getClass(), "isBreak", false);
        setBooleanField(term494965, term494965.getClass(), "isCriticalDisp", false);
        setBooleanField(term494965, term494965.getClass(), "isFastLateDisp", false);
        setIntField(term494965, term494965.getClass(), "fastCount", 0);
        setIntField(term494965, term494965.getClass(), "lateCount", 0);
        setBooleanField(term494965, term494965.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term494965, term494965.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term494965, term494965.getClass(), "comboStatus", 0);
        setIntField(term494965, term494965.getClass(), "syncStatus", 0);
        setBooleanField(term494965, term494965.getClass(), "isClear", false);
        setIntField(term494965, term494965.getClass(), "beforeRating", 0);
        setIntField(term494965, term494965.getClass(), "afterRating", 0);
        setIntField(term494965, term494965.getClass(), "beforeGrade", 0);
        setIntField(term494965, term494965.getClass(), "afterGrade", 0);
        setIntField(term494965, term494965.getClass(), "afterGradeRank", 0);
        setIntField(term494965, term494965.getClass(), "beforeDeluxRating", 0);
        setIntField(term494965, term494965.getClass(), "afterDeluxRating", 0);
        setBooleanField(term494965, term494965.getClass(), "isPlayTutorial", false);
        setBooleanField(term494965, term494965.getClass(), "isEventMode", false);
        setBooleanField(term494965, term494965.getClass(), "isFreedomMode", false);
        setIntField(term494965, term494965.getClass(), "playMode", 0);
        setBooleanField(term494965, term494965.getClass(), "isNewFree", false);
        setIntField(term494965, term494965.getClass(), "trialPlayAchievement", 0);
        setIntField(term494965, term494965.getClass(), "extNum1", 0);
        setIntField(term494965, term494965.getClass(), "extNum2", 0);
        term495065 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term495065;
        callMethod(klass, "setBreak", argTypes, term494965, args);
    }

};


