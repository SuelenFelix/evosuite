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

public class UserPlaylog_setTap_307361484405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term494557;
     Object term494657;

    public UserPlaylog_setTap_307361484405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term494557 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term494557, term494557.getClass(), "id", 0L);
        setField(term494557, term494557.getClass(), "user", null);
        setIntField(term494557, term494557.getClass(), "orderId", 0);
        setLongField(term494557, term494557.getClass(), "playlogId", 0L);
        setIntField(term494557, term494557.getClass(), "version", 0);
        setIntField(term494557, term494557.getClass(), "placeId", 0);
        setField(term494557, term494557.getClass(), "placeName", null);
        setLongField(term494557, term494557.getClass(), "loginDate", 0L);
        setField(term494557, term494557.getClass(), "playDate", null);
        setField(term494557, term494557.getClass(), "userPlayDate", null);
        setIntField(term494557, term494557.getClass(), "type", 0);
        setIntField(term494557, term494557.getClass(), "musicId", 0);
        setIntField(term494557, term494557.getClass(), "level", 0);
        setIntField(term494557, term494557.getClass(), "trackNo", 0);
        setIntField(term494557, term494557.getClass(), "vsMode", 0);
        setField(term494557, term494557.getClass(), "vsUserName", null);
        setIntField(term494557, term494557.getClass(), "vsStatus", 0);
        setIntField(term494557, term494557.getClass(), "vsUserRating", 0);
        setIntField(term494557, term494557.getClass(), "vsUserAchievement", 0);
        setIntField(term494557, term494557.getClass(), "vsUserGradeRank", 0);
        setIntField(term494557, term494557.getClass(), "vsRank", 0);
        setIntField(term494557, term494557.getClass(), "playerNum", 0);
        setLongField(term494557, term494557.getClass(), "playedUserId1", 0L);
        setField(term494557, term494557.getClass(), "playedUserName1", null);
        setIntField(term494557, term494557.getClass(), "playedMusicLevel1", 0);
        setLongField(term494557, term494557.getClass(), "playedUserId2", 0L);
        setField(term494557, term494557.getClass(), "playedUserName2", null);
        setIntField(term494557, term494557.getClass(), "playedMusicLevel2", 0);
        setLongField(term494557, term494557.getClass(), "playedUserId3", 0L);
        setField(term494557, term494557.getClass(), "playedUserName3", null);
        setIntField(term494557, term494557.getClass(), "playedMusicLevel3", 0);
        setIntField(term494557, term494557.getClass(), "characterId1", 0);
        setIntField(term494557, term494557.getClass(), "characterLevel1", 0);
        setIntField(term494557, term494557.getClass(), "characterAwakening1", 0);
        setIntField(term494557, term494557.getClass(), "characterId2", 0);
        setIntField(term494557, term494557.getClass(), "characterLevel2", 0);
        setIntField(term494557, term494557.getClass(), "characterAwakening2", 0);
        setIntField(term494557, term494557.getClass(), "characterId3", 0);
        setIntField(term494557, term494557.getClass(), "characterLevel3", 0);
        setIntField(term494557, term494557.getClass(), "characterAwakening3", 0);
        setIntField(term494557, term494557.getClass(), "characterId4", 0);
        setIntField(term494557, term494557.getClass(), "characterLevel4", 0);
        setIntField(term494557, term494557.getClass(), "characterAwakening4", 0);
        setIntField(term494557, term494557.getClass(), "characterId5", 0);
        setIntField(term494557, term494557.getClass(), "characterLevel5", 0);
        setIntField(term494557, term494557.getClass(), "characterAwakening5", 0);
        setIntField(term494557, term494557.getClass(), "achievement", 0);
        setIntField(term494557, term494557.getClass(), "deluxscore", 0);
        setIntField(term494557, term494557.getClass(), "scoreRank", 0);
        setIntField(term494557, term494557.getClass(), "maxCombo", 0);
        setIntField(term494557, term494557.getClass(), "totalCombo", 0);
        setIntField(term494557, term494557.getClass(), "maxSync", 0);
        setIntField(term494557, term494557.getClass(), "totalSync", 0);
        setIntField(term494557, term494557.getClass(), "tapCriticalPerfect", 0);
        setIntField(term494557, term494557.getClass(), "tapPerfect", 0);
        setIntField(term494557, term494557.getClass(), "tapGreat", 0);
        setIntField(term494557, term494557.getClass(), "tapGood", 0);
        setIntField(term494557, term494557.getClass(), "tapMiss", 0);
        setIntField(term494557, term494557.getClass(), "holdCriticalPerfect", 0);
        setIntField(term494557, term494557.getClass(), "holdPerfect", 0);
        setIntField(term494557, term494557.getClass(), "holdGreat", 0);
        setIntField(term494557, term494557.getClass(), "holdGood", 0);
        setIntField(term494557, term494557.getClass(), "holdMiss", 0);
        setIntField(term494557, term494557.getClass(), "slideCriticalPerfect", 0);
        setIntField(term494557, term494557.getClass(), "slidePerfect", 0);
        setIntField(term494557, term494557.getClass(), "slideGreat", 0);
        setIntField(term494557, term494557.getClass(), "slideGood", 0);
        setIntField(term494557, term494557.getClass(), "slideMiss", 0);
        setIntField(term494557, term494557.getClass(), "touchCriticalPerfect", 0);
        setIntField(term494557, term494557.getClass(), "touchPerfect", 0);
        setIntField(term494557, term494557.getClass(), "touchGreat", 0);
        setIntField(term494557, term494557.getClass(), "touchGood", 0);
        setIntField(term494557, term494557.getClass(), "touchMiss", 0);
        setIntField(term494557, term494557.getClass(), "breakCriticalPerfect", 0);
        setIntField(term494557, term494557.getClass(), "breakPerfect", 0);
        setIntField(term494557, term494557.getClass(), "breakGreat", 0);
        setIntField(term494557, term494557.getClass(), "breakGood", 0);
        setIntField(term494557, term494557.getClass(), "breakMiss", 0);
        setBooleanField(term494557, term494557.getClass(), "isTap", false);
        setBooleanField(term494557, term494557.getClass(), "isHold", false);
        setBooleanField(term494557, term494557.getClass(), "isSlide", false);
        setBooleanField(term494557, term494557.getClass(), "isTouch", false);
        setBooleanField(term494557, term494557.getClass(), "isBreak", false);
        setBooleanField(term494557, term494557.getClass(), "isCriticalDisp", false);
        setBooleanField(term494557, term494557.getClass(), "isFastLateDisp", false);
        setIntField(term494557, term494557.getClass(), "fastCount", 0);
        setIntField(term494557, term494557.getClass(), "lateCount", 0);
        setBooleanField(term494557, term494557.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term494557, term494557.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term494557, term494557.getClass(), "comboStatus", 0);
        setIntField(term494557, term494557.getClass(), "syncStatus", 0);
        setBooleanField(term494557, term494557.getClass(), "isClear", false);
        setIntField(term494557, term494557.getClass(), "beforeRating", 0);
        setIntField(term494557, term494557.getClass(), "afterRating", 0);
        setIntField(term494557, term494557.getClass(), "beforeGrade", 0);
        setIntField(term494557, term494557.getClass(), "afterGrade", 0);
        setIntField(term494557, term494557.getClass(), "afterGradeRank", 0);
        setIntField(term494557, term494557.getClass(), "beforeDeluxRating", 0);
        setIntField(term494557, term494557.getClass(), "afterDeluxRating", 0);
        setBooleanField(term494557, term494557.getClass(), "isPlayTutorial", false);
        setBooleanField(term494557, term494557.getClass(), "isEventMode", false);
        setBooleanField(term494557, term494557.getClass(), "isFreedomMode", false);
        setIntField(term494557, term494557.getClass(), "playMode", 0);
        setBooleanField(term494557, term494557.getClass(), "isNewFree", false);
        setIntField(term494557, term494557.getClass(), "trialPlayAchievement", 0);
        setIntField(term494557, term494557.getClass(), "extNum1", 0);
        setIntField(term494557, term494557.getClass(), "extNum2", 0);
        term494657 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term494657;
        callMethod(klass, "setTap", argTypes, term494557, args);
    }

};


