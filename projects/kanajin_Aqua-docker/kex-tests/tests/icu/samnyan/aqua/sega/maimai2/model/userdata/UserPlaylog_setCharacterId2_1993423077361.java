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

public class UserPlaylog_setCharacterId2_1993423077361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term490069;
     Object term490169;

    public UserPlaylog_setCharacterId2_1993423077361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term490069 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term490069, term490069.getClass(), "id", 0L);
        setField(term490069, term490069.getClass(), "user", null);
        setIntField(term490069, term490069.getClass(), "orderId", 0);
        setLongField(term490069, term490069.getClass(), "playlogId", 0L);
        setIntField(term490069, term490069.getClass(), "version", 0);
        setIntField(term490069, term490069.getClass(), "placeId", 0);
        setField(term490069, term490069.getClass(), "placeName", null);
        setLongField(term490069, term490069.getClass(), "loginDate", 0L);
        setField(term490069, term490069.getClass(), "playDate", null);
        setField(term490069, term490069.getClass(), "userPlayDate", null);
        setIntField(term490069, term490069.getClass(), "type", 0);
        setIntField(term490069, term490069.getClass(), "musicId", 0);
        setIntField(term490069, term490069.getClass(), "level", 0);
        setIntField(term490069, term490069.getClass(), "trackNo", 0);
        setIntField(term490069, term490069.getClass(), "vsMode", 0);
        setField(term490069, term490069.getClass(), "vsUserName", null);
        setIntField(term490069, term490069.getClass(), "vsStatus", 0);
        setIntField(term490069, term490069.getClass(), "vsUserRating", 0);
        setIntField(term490069, term490069.getClass(), "vsUserAchievement", 0);
        setIntField(term490069, term490069.getClass(), "vsUserGradeRank", 0);
        setIntField(term490069, term490069.getClass(), "vsRank", 0);
        setIntField(term490069, term490069.getClass(), "playerNum", 0);
        setLongField(term490069, term490069.getClass(), "playedUserId1", 0L);
        setField(term490069, term490069.getClass(), "playedUserName1", null);
        setIntField(term490069, term490069.getClass(), "playedMusicLevel1", 0);
        setLongField(term490069, term490069.getClass(), "playedUserId2", 0L);
        setField(term490069, term490069.getClass(), "playedUserName2", null);
        setIntField(term490069, term490069.getClass(), "playedMusicLevel2", 0);
        setLongField(term490069, term490069.getClass(), "playedUserId3", 0L);
        setField(term490069, term490069.getClass(), "playedUserName3", null);
        setIntField(term490069, term490069.getClass(), "playedMusicLevel3", 0);
        setIntField(term490069, term490069.getClass(), "characterId1", 0);
        setIntField(term490069, term490069.getClass(), "characterLevel1", 0);
        setIntField(term490069, term490069.getClass(), "characterAwakening1", 0);
        setIntField(term490069, term490069.getClass(), "characterId2", 0);
        setIntField(term490069, term490069.getClass(), "characterLevel2", 0);
        setIntField(term490069, term490069.getClass(), "characterAwakening2", 0);
        setIntField(term490069, term490069.getClass(), "characterId3", 0);
        setIntField(term490069, term490069.getClass(), "characterLevel3", 0);
        setIntField(term490069, term490069.getClass(), "characterAwakening3", 0);
        setIntField(term490069, term490069.getClass(), "characterId4", 0);
        setIntField(term490069, term490069.getClass(), "characterLevel4", 0);
        setIntField(term490069, term490069.getClass(), "characterAwakening4", 0);
        setIntField(term490069, term490069.getClass(), "characterId5", 0);
        setIntField(term490069, term490069.getClass(), "characterLevel5", 0);
        setIntField(term490069, term490069.getClass(), "characterAwakening5", 0);
        setIntField(term490069, term490069.getClass(), "achievement", 0);
        setIntField(term490069, term490069.getClass(), "deluxscore", 0);
        setIntField(term490069, term490069.getClass(), "scoreRank", 0);
        setIntField(term490069, term490069.getClass(), "maxCombo", 0);
        setIntField(term490069, term490069.getClass(), "totalCombo", 0);
        setIntField(term490069, term490069.getClass(), "maxSync", 0);
        setIntField(term490069, term490069.getClass(), "totalSync", 0);
        setIntField(term490069, term490069.getClass(), "tapCriticalPerfect", 0);
        setIntField(term490069, term490069.getClass(), "tapPerfect", 0);
        setIntField(term490069, term490069.getClass(), "tapGreat", 0);
        setIntField(term490069, term490069.getClass(), "tapGood", 0);
        setIntField(term490069, term490069.getClass(), "tapMiss", 0);
        setIntField(term490069, term490069.getClass(), "holdCriticalPerfect", 0);
        setIntField(term490069, term490069.getClass(), "holdPerfect", 0);
        setIntField(term490069, term490069.getClass(), "holdGreat", 0);
        setIntField(term490069, term490069.getClass(), "holdGood", 0);
        setIntField(term490069, term490069.getClass(), "holdMiss", 0);
        setIntField(term490069, term490069.getClass(), "slideCriticalPerfect", 0);
        setIntField(term490069, term490069.getClass(), "slidePerfect", 0);
        setIntField(term490069, term490069.getClass(), "slideGreat", 0);
        setIntField(term490069, term490069.getClass(), "slideGood", 0);
        setIntField(term490069, term490069.getClass(), "slideMiss", 0);
        setIntField(term490069, term490069.getClass(), "touchCriticalPerfect", 0);
        setIntField(term490069, term490069.getClass(), "touchPerfect", 0);
        setIntField(term490069, term490069.getClass(), "touchGreat", 0);
        setIntField(term490069, term490069.getClass(), "touchGood", 0);
        setIntField(term490069, term490069.getClass(), "touchMiss", 0);
        setIntField(term490069, term490069.getClass(), "breakCriticalPerfect", 0);
        setIntField(term490069, term490069.getClass(), "breakPerfect", 0);
        setIntField(term490069, term490069.getClass(), "breakGreat", 0);
        setIntField(term490069, term490069.getClass(), "breakGood", 0);
        setIntField(term490069, term490069.getClass(), "breakMiss", 0);
        setBooleanField(term490069, term490069.getClass(), "isTap", false);
        setBooleanField(term490069, term490069.getClass(), "isHold", false);
        setBooleanField(term490069, term490069.getClass(), "isSlide", false);
        setBooleanField(term490069, term490069.getClass(), "isTouch", false);
        setBooleanField(term490069, term490069.getClass(), "isBreak", false);
        setBooleanField(term490069, term490069.getClass(), "isCriticalDisp", false);
        setBooleanField(term490069, term490069.getClass(), "isFastLateDisp", false);
        setIntField(term490069, term490069.getClass(), "fastCount", 0);
        setIntField(term490069, term490069.getClass(), "lateCount", 0);
        setBooleanField(term490069, term490069.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term490069, term490069.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term490069, term490069.getClass(), "comboStatus", 0);
        setIntField(term490069, term490069.getClass(), "syncStatus", 0);
        setBooleanField(term490069, term490069.getClass(), "isClear", false);
        setIntField(term490069, term490069.getClass(), "beforeRating", 0);
        setIntField(term490069, term490069.getClass(), "afterRating", 0);
        setIntField(term490069, term490069.getClass(), "beforeGrade", 0);
        setIntField(term490069, term490069.getClass(), "afterGrade", 0);
        setIntField(term490069, term490069.getClass(), "afterGradeRank", 0);
        setIntField(term490069, term490069.getClass(), "beforeDeluxRating", 0);
        setIntField(term490069, term490069.getClass(), "afterDeluxRating", 0);
        setBooleanField(term490069, term490069.getClass(), "isPlayTutorial", false);
        setBooleanField(term490069, term490069.getClass(), "isEventMode", false);
        setBooleanField(term490069, term490069.getClass(), "isFreedomMode", false);
        setIntField(term490069, term490069.getClass(), "playMode", 0);
        setBooleanField(term490069, term490069.getClass(), "isNewFree", false);
        setIntField(term490069, term490069.getClass(), "trialPlayAchievement", 0);
        setIntField(term490069, term490069.getClass(), "extNum1", 0);
        setIntField(term490069, term490069.getClass(), "extNum2", 0);
        term490169 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term490169;
        callMethod(klass, "setCharacterId2", argTypes, term490069, args);
    }

};


