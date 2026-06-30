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

public class UserPlaylog_setCharacterLevel5_544382467371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term491089;
     Object term491189;

    public UserPlaylog_setCharacterLevel5_544382467371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term491089 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term491089, term491089.getClass(), "id", 0L);
        setField(term491089, term491089.getClass(), "user", null);
        setIntField(term491089, term491089.getClass(), "orderId", 0);
        setLongField(term491089, term491089.getClass(), "playlogId", 0L);
        setIntField(term491089, term491089.getClass(), "version", 0);
        setIntField(term491089, term491089.getClass(), "placeId", 0);
        setField(term491089, term491089.getClass(), "placeName", null);
        setLongField(term491089, term491089.getClass(), "loginDate", 0L);
        setField(term491089, term491089.getClass(), "playDate", null);
        setField(term491089, term491089.getClass(), "userPlayDate", null);
        setIntField(term491089, term491089.getClass(), "type", 0);
        setIntField(term491089, term491089.getClass(), "musicId", 0);
        setIntField(term491089, term491089.getClass(), "level", 0);
        setIntField(term491089, term491089.getClass(), "trackNo", 0);
        setIntField(term491089, term491089.getClass(), "vsMode", 0);
        setField(term491089, term491089.getClass(), "vsUserName", null);
        setIntField(term491089, term491089.getClass(), "vsStatus", 0);
        setIntField(term491089, term491089.getClass(), "vsUserRating", 0);
        setIntField(term491089, term491089.getClass(), "vsUserAchievement", 0);
        setIntField(term491089, term491089.getClass(), "vsUserGradeRank", 0);
        setIntField(term491089, term491089.getClass(), "vsRank", 0);
        setIntField(term491089, term491089.getClass(), "playerNum", 0);
        setLongField(term491089, term491089.getClass(), "playedUserId1", 0L);
        setField(term491089, term491089.getClass(), "playedUserName1", null);
        setIntField(term491089, term491089.getClass(), "playedMusicLevel1", 0);
        setLongField(term491089, term491089.getClass(), "playedUserId2", 0L);
        setField(term491089, term491089.getClass(), "playedUserName2", null);
        setIntField(term491089, term491089.getClass(), "playedMusicLevel2", 0);
        setLongField(term491089, term491089.getClass(), "playedUserId3", 0L);
        setField(term491089, term491089.getClass(), "playedUserName3", null);
        setIntField(term491089, term491089.getClass(), "playedMusicLevel3", 0);
        setIntField(term491089, term491089.getClass(), "characterId1", 0);
        setIntField(term491089, term491089.getClass(), "characterLevel1", 0);
        setIntField(term491089, term491089.getClass(), "characterAwakening1", 0);
        setIntField(term491089, term491089.getClass(), "characterId2", 0);
        setIntField(term491089, term491089.getClass(), "characterLevel2", 0);
        setIntField(term491089, term491089.getClass(), "characterAwakening2", 0);
        setIntField(term491089, term491089.getClass(), "characterId3", 0);
        setIntField(term491089, term491089.getClass(), "characterLevel3", 0);
        setIntField(term491089, term491089.getClass(), "characterAwakening3", 0);
        setIntField(term491089, term491089.getClass(), "characterId4", 0);
        setIntField(term491089, term491089.getClass(), "characterLevel4", 0);
        setIntField(term491089, term491089.getClass(), "characterAwakening4", 0);
        setIntField(term491089, term491089.getClass(), "characterId5", 0);
        setIntField(term491089, term491089.getClass(), "characterLevel5", 0);
        setIntField(term491089, term491089.getClass(), "characterAwakening5", 0);
        setIntField(term491089, term491089.getClass(), "achievement", 0);
        setIntField(term491089, term491089.getClass(), "deluxscore", 0);
        setIntField(term491089, term491089.getClass(), "scoreRank", 0);
        setIntField(term491089, term491089.getClass(), "maxCombo", 0);
        setIntField(term491089, term491089.getClass(), "totalCombo", 0);
        setIntField(term491089, term491089.getClass(), "maxSync", 0);
        setIntField(term491089, term491089.getClass(), "totalSync", 0);
        setIntField(term491089, term491089.getClass(), "tapCriticalPerfect", 0);
        setIntField(term491089, term491089.getClass(), "tapPerfect", 0);
        setIntField(term491089, term491089.getClass(), "tapGreat", 0);
        setIntField(term491089, term491089.getClass(), "tapGood", 0);
        setIntField(term491089, term491089.getClass(), "tapMiss", 0);
        setIntField(term491089, term491089.getClass(), "holdCriticalPerfect", 0);
        setIntField(term491089, term491089.getClass(), "holdPerfect", 0);
        setIntField(term491089, term491089.getClass(), "holdGreat", 0);
        setIntField(term491089, term491089.getClass(), "holdGood", 0);
        setIntField(term491089, term491089.getClass(), "holdMiss", 0);
        setIntField(term491089, term491089.getClass(), "slideCriticalPerfect", 0);
        setIntField(term491089, term491089.getClass(), "slidePerfect", 0);
        setIntField(term491089, term491089.getClass(), "slideGreat", 0);
        setIntField(term491089, term491089.getClass(), "slideGood", 0);
        setIntField(term491089, term491089.getClass(), "slideMiss", 0);
        setIntField(term491089, term491089.getClass(), "touchCriticalPerfect", 0);
        setIntField(term491089, term491089.getClass(), "touchPerfect", 0);
        setIntField(term491089, term491089.getClass(), "touchGreat", 0);
        setIntField(term491089, term491089.getClass(), "touchGood", 0);
        setIntField(term491089, term491089.getClass(), "touchMiss", 0);
        setIntField(term491089, term491089.getClass(), "breakCriticalPerfect", 0);
        setIntField(term491089, term491089.getClass(), "breakPerfect", 0);
        setIntField(term491089, term491089.getClass(), "breakGreat", 0);
        setIntField(term491089, term491089.getClass(), "breakGood", 0);
        setIntField(term491089, term491089.getClass(), "breakMiss", 0);
        setBooleanField(term491089, term491089.getClass(), "isTap", false);
        setBooleanField(term491089, term491089.getClass(), "isHold", false);
        setBooleanField(term491089, term491089.getClass(), "isSlide", false);
        setBooleanField(term491089, term491089.getClass(), "isTouch", false);
        setBooleanField(term491089, term491089.getClass(), "isBreak", false);
        setBooleanField(term491089, term491089.getClass(), "isCriticalDisp", false);
        setBooleanField(term491089, term491089.getClass(), "isFastLateDisp", false);
        setIntField(term491089, term491089.getClass(), "fastCount", 0);
        setIntField(term491089, term491089.getClass(), "lateCount", 0);
        setBooleanField(term491089, term491089.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term491089, term491089.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term491089, term491089.getClass(), "comboStatus", 0);
        setIntField(term491089, term491089.getClass(), "syncStatus", 0);
        setBooleanField(term491089, term491089.getClass(), "isClear", false);
        setIntField(term491089, term491089.getClass(), "beforeRating", 0);
        setIntField(term491089, term491089.getClass(), "afterRating", 0);
        setIntField(term491089, term491089.getClass(), "beforeGrade", 0);
        setIntField(term491089, term491089.getClass(), "afterGrade", 0);
        setIntField(term491089, term491089.getClass(), "afterGradeRank", 0);
        setIntField(term491089, term491089.getClass(), "beforeDeluxRating", 0);
        setIntField(term491089, term491089.getClass(), "afterDeluxRating", 0);
        setBooleanField(term491089, term491089.getClass(), "isPlayTutorial", false);
        setBooleanField(term491089, term491089.getClass(), "isEventMode", false);
        setBooleanField(term491089, term491089.getClass(), "isFreedomMode", false);
        setIntField(term491089, term491089.getClass(), "playMode", 0);
        setBooleanField(term491089, term491089.getClass(), "isNewFree", false);
        setIntField(term491089, term491089.getClass(), "trialPlayAchievement", 0);
        setIntField(term491089, term491089.getClass(), "extNum1", 0);
        setIntField(term491089, term491089.getClass(), "extNum2", 0);
        term491189 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term491189;
        callMethod(klass, "setCharacterLevel5", argTypes, term491089, args);
    }

};


