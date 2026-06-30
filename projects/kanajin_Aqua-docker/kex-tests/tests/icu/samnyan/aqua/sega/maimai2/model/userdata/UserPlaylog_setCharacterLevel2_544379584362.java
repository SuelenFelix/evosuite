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

public class UserPlaylog_setCharacterLevel2_544379584362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term490171;
     Object term490271;

    public UserPlaylog_setCharacterLevel2_544379584362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term490171 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term490171, term490171.getClass(), "id", 0L);
        setField(term490171, term490171.getClass(), "user", null);
        setIntField(term490171, term490171.getClass(), "orderId", 0);
        setLongField(term490171, term490171.getClass(), "playlogId", 0L);
        setIntField(term490171, term490171.getClass(), "version", 0);
        setIntField(term490171, term490171.getClass(), "placeId", 0);
        setField(term490171, term490171.getClass(), "placeName", null);
        setLongField(term490171, term490171.getClass(), "loginDate", 0L);
        setField(term490171, term490171.getClass(), "playDate", null);
        setField(term490171, term490171.getClass(), "userPlayDate", null);
        setIntField(term490171, term490171.getClass(), "type", 0);
        setIntField(term490171, term490171.getClass(), "musicId", 0);
        setIntField(term490171, term490171.getClass(), "level", 0);
        setIntField(term490171, term490171.getClass(), "trackNo", 0);
        setIntField(term490171, term490171.getClass(), "vsMode", 0);
        setField(term490171, term490171.getClass(), "vsUserName", null);
        setIntField(term490171, term490171.getClass(), "vsStatus", 0);
        setIntField(term490171, term490171.getClass(), "vsUserRating", 0);
        setIntField(term490171, term490171.getClass(), "vsUserAchievement", 0);
        setIntField(term490171, term490171.getClass(), "vsUserGradeRank", 0);
        setIntField(term490171, term490171.getClass(), "vsRank", 0);
        setIntField(term490171, term490171.getClass(), "playerNum", 0);
        setLongField(term490171, term490171.getClass(), "playedUserId1", 0L);
        setField(term490171, term490171.getClass(), "playedUserName1", null);
        setIntField(term490171, term490171.getClass(), "playedMusicLevel1", 0);
        setLongField(term490171, term490171.getClass(), "playedUserId2", 0L);
        setField(term490171, term490171.getClass(), "playedUserName2", null);
        setIntField(term490171, term490171.getClass(), "playedMusicLevel2", 0);
        setLongField(term490171, term490171.getClass(), "playedUserId3", 0L);
        setField(term490171, term490171.getClass(), "playedUserName3", null);
        setIntField(term490171, term490171.getClass(), "playedMusicLevel3", 0);
        setIntField(term490171, term490171.getClass(), "characterId1", 0);
        setIntField(term490171, term490171.getClass(), "characterLevel1", 0);
        setIntField(term490171, term490171.getClass(), "characterAwakening1", 0);
        setIntField(term490171, term490171.getClass(), "characterId2", 0);
        setIntField(term490171, term490171.getClass(), "characterLevel2", 0);
        setIntField(term490171, term490171.getClass(), "characterAwakening2", 0);
        setIntField(term490171, term490171.getClass(), "characterId3", 0);
        setIntField(term490171, term490171.getClass(), "characterLevel3", 0);
        setIntField(term490171, term490171.getClass(), "characterAwakening3", 0);
        setIntField(term490171, term490171.getClass(), "characterId4", 0);
        setIntField(term490171, term490171.getClass(), "characterLevel4", 0);
        setIntField(term490171, term490171.getClass(), "characterAwakening4", 0);
        setIntField(term490171, term490171.getClass(), "characterId5", 0);
        setIntField(term490171, term490171.getClass(), "characterLevel5", 0);
        setIntField(term490171, term490171.getClass(), "characterAwakening5", 0);
        setIntField(term490171, term490171.getClass(), "achievement", 0);
        setIntField(term490171, term490171.getClass(), "deluxscore", 0);
        setIntField(term490171, term490171.getClass(), "scoreRank", 0);
        setIntField(term490171, term490171.getClass(), "maxCombo", 0);
        setIntField(term490171, term490171.getClass(), "totalCombo", 0);
        setIntField(term490171, term490171.getClass(), "maxSync", 0);
        setIntField(term490171, term490171.getClass(), "totalSync", 0);
        setIntField(term490171, term490171.getClass(), "tapCriticalPerfect", 0);
        setIntField(term490171, term490171.getClass(), "tapPerfect", 0);
        setIntField(term490171, term490171.getClass(), "tapGreat", 0);
        setIntField(term490171, term490171.getClass(), "tapGood", 0);
        setIntField(term490171, term490171.getClass(), "tapMiss", 0);
        setIntField(term490171, term490171.getClass(), "holdCriticalPerfect", 0);
        setIntField(term490171, term490171.getClass(), "holdPerfect", 0);
        setIntField(term490171, term490171.getClass(), "holdGreat", 0);
        setIntField(term490171, term490171.getClass(), "holdGood", 0);
        setIntField(term490171, term490171.getClass(), "holdMiss", 0);
        setIntField(term490171, term490171.getClass(), "slideCriticalPerfect", 0);
        setIntField(term490171, term490171.getClass(), "slidePerfect", 0);
        setIntField(term490171, term490171.getClass(), "slideGreat", 0);
        setIntField(term490171, term490171.getClass(), "slideGood", 0);
        setIntField(term490171, term490171.getClass(), "slideMiss", 0);
        setIntField(term490171, term490171.getClass(), "touchCriticalPerfect", 0);
        setIntField(term490171, term490171.getClass(), "touchPerfect", 0);
        setIntField(term490171, term490171.getClass(), "touchGreat", 0);
        setIntField(term490171, term490171.getClass(), "touchGood", 0);
        setIntField(term490171, term490171.getClass(), "touchMiss", 0);
        setIntField(term490171, term490171.getClass(), "breakCriticalPerfect", 0);
        setIntField(term490171, term490171.getClass(), "breakPerfect", 0);
        setIntField(term490171, term490171.getClass(), "breakGreat", 0);
        setIntField(term490171, term490171.getClass(), "breakGood", 0);
        setIntField(term490171, term490171.getClass(), "breakMiss", 0);
        setBooleanField(term490171, term490171.getClass(), "isTap", false);
        setBooleanField(term490171, term490171.getClass(), "isHold", false);
        setBooleanField(term490171, term490171.getClass(), "isSlide", false);
        setBooleanField(term490171, term490171.getClass(), "isTouch", false);
        setBooleanField(term490171, term490171.getClass(), "isBreak", false);
        setBooleanField(term490171, term490171.getClass(), "isCriticalDisp", false);
        setBooleanField(term490171, term490171.getClass(), "isFastLateDisp", false);
        setIntField(term490171, term490171.getClass(), "fastCount", 0);
        setIntField(term490171, term490171.getClass(), "lateCount", 0);
        setBooleanField(term490171, term490171.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term490171, term490171.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term490171, term490171.getClass(), "comboStatus", 0);
        setIntField(term490171, term490171.getClass(), "syncStatus", 0);
        setBooleanField(term490171, term490171.getClass(), "isClear", false);
        setIntField(term490171, term490171.getClass(), "beforeRating", 0);
        setIntField(term490171, term490171.getClass(), "afterRating", 0);
        setIntField(term490171, term490171.getClass(), "beforeGrade", 0);
        setIntField(term490171, term490171.getClass(), "afterGrade", 0);
        setIntField(term490171, term490171.getClass(), "afterGradeRank", 0);
        setIntField(term490171, term490171.getClass(), "beforeDeluxRating", 0);
        setIntField(term490171, term490171.getClass(), "afterDeluxRating", 0);
        setBooleanField(term490171, term490171.getClass(), "isPlayTutorial", false);
        setBooleanField(term490171, term490171.getClass(), "isEventMode", false);
        setBooleanField(term490171, term490171.getClass(), "isFreedomMode", false);
        setIntField(term490171, term490171.getClass(), "playMode", 0);
        setBooleanField(term490171, term490171.getClass(), "isNewFree", false);
        setIntField(term490171, term490171.getClass(), "trialPlayAchievement", 0);
        setIntField(term490171, term490171.getClass(), "extNum1", 0);
        setIntField(term490171, term490171.getClass(), "extNum2", 0);
        term490271 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term490271;
        callMethod(klass, "setCharacterLevel2", argTypes, term490171, args);
    }

};


