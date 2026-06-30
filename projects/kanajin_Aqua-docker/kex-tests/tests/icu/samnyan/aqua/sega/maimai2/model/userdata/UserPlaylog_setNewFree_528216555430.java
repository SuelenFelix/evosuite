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

public class UserPlaylog_setNewFree_528216555430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term497107;
     Object term497207;

    public UserPlaylog_setNewFree_528216555430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term497107 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term497107, term497107.getClass(), "id", 0L);
        setField(term497107, term497107.getClass(), "user", null);
        setIntField(term497107, term497107.getClass(), "orderId", 0);
        setLongField(term497107, term497107.getClass(), "playlogId", 0L);
        setIntField(term497107, term497107.getClass(), "version", 0);
        setIntField(term497107, term497107.getClass(), "placeId", 0);
        setField(term497107, term497107.getClass(), "placeName", null);
        setLongField(term497107, term497107.getClass(), "loginDate", 0L);
        setField(term497107, term497107.getClass(), "playDate", null);
        setField(term497107, term497107.getClass(), "userPlayDate", null);
        setIntField(term497107, term497107.getClass(), "type", 0);
        setIntField(term497107, term497107.getClass(), "musicId", 0);
        setIntField(term497107, term497107.getClass(), "level", 0);
        setIntField(term497107, term497107.getClass(), "trackNo", 0);
        setIntField(term497107, term497107.getClass(), "vsMode", 0);
        setField(term497107, term497107.getClass(), "vsUserName", null);
        setIntField(term497107, term497107.getClass(), "vsStatus", 0);
        setIntField(term497107, term497107.getClass(), "vsUserRating", 0);
        setIntField(term497107, term497107.getClass(), "vsUserAchievement", 0);
        setIntField(term497107, term497107.getClass(), "vsUserGradeRank", 0);
        setIntField(term497107, term497107.getClass(), "vsRank", 0);
        setIntField(term497107, term497107.getClass(), "playerNum", 0);
        setLongField(term497107, term497107.getClass(), "playedUserId1", 0L);
        setField(term497107, term497107.getClass(), "playedUserName1", null);
        setIntField(term497107, term497107.getClass(), "playedMusicLevel1", 0);
        setLongField(term497107, term497107.getClass(), "playedUserId2", 0L);
        setField(term497107, term497107.getClass(), "playedUserName2", null);
        setIntField(term497107, term497107.getClass(), "playedMusicLevel2", 0);
        setLongField(term497107, term497107.getClass(), "playedUserId3", 0L);
        setField(term497107, term497107.getClass(), "playedUserName3", null);
        setIntField(term497107, term497107.getClass(), "playedMusicLevel3", 0);
        setIntField(term497107, term497107.getClass(), "characterId1", 0);
        setIntField(term497107, term497107.getClass(), "characterLevel1", 0);
        setIntField(term497107, term497107.getClass(), "characterAwakening1", 0);
        setIntField(term497107, term497107.getClass(), "characterId2", 0);
        setIntField(term497107, term497107.getClass(), "characterLevel2", 0);
        setIntField(term497107, term497107.getClass(), "characterAwakening2", 0);
        setIntField(term497107, term497107.getClass(), "characterId3", 0);
        setIntField(term497107, term497107.getClass(), "characterLevel3", 0);
        setIntField(term497107, term497107.getClass(), "characterAwakening3", 0);
        setIntField(term497107, term497107.getClass(), "characterId4", 0);
        setIntField(term497107, term497107.getClass(), "characterLevel4", 0);
        setIntField(term497107, term497107.getClass(), "characterAwakening4", 0);
        setIntField(term497107, term497107.getClass(), "characterId5", 0);
        setIntField(term497107, term497107.getClass(), "characterLevel5", 0);
        setIntField(term497107, term497107.getClass(), "characterAwakening5", 0);
        setIntField(term497107, term497107.getClass(), "achievement", 0);
        setIntField(term497107, term497107.getClass(), "deluxscore", 0);
        setIntField(term497107, term497107.getClass(), "scoreRank", 0);
        setIntField(term497107, term497107.getClass(), "maxCombo", 0);
        setIntField(term497107, term497107.getClass(), "totalCombo", 0);
        setIntField(term497107, term497107.getClass(), "maxSync", 0);
        setIntField(term497107, term497107.getClass(), "totalSync", 0);
        setIntField(term497107, term497107.getClass(), "tapCriticalPerfect", 0);
        setIntField(term497107, term497107.getClass(), "tapPerfect", 0);
        setIntField(term497107, term497107.getClass(), "tapGreat", 0);
        setIntField(term497107, term497107.getClass(), "tapGood", 0);
        setIntField(term497107, term497107.getClass(), "tapMiss", 0);
        setIntField(term497107, term497107.getClass(), "holdCriticalPerfect", 0);
        setIntField(term497107, term497107.getClass(), "holdPerfect", 0);
        setIntField(term497107, term497107.getClass(), "holdGreat", 0);
        setIntField(term497107, term497107.getClass(), "holdGood", 0);
        setIntField(term497107, term497107.getClass(), "holdMiss", 0);
        setIntField(term497107, term497107.getClass(), "slideCriticalPerfect", 0);
        setIntField(term497107, term497107.getClass(), "slidePerfect", 0);
        setIntField(term497107, term497107.getClass(), "slideGreat", 0);
        setIntField(term497107, term497107.getClass(), "slideGood", 0);
        setIntField(term497107, term497107.getClass(), "slideMiss", 0);
        setIntField(term497107, term497107.getClass(), "touchCriticalPerfect", 0);
        setIntField(term497107, term497107.getClass(), "touchPerfect", 0);
        setIntField(term497107, term497107.getClass(), "touchGreat", 0);
        setIntField(term497107, term497107.getClass(), "touchGood", 0);
        setIntField(term497107, term497107.getClass(), "touchMiss", 0);
        setIntField(term497107, term497107.getClass(), "breakCriticalPerfect", 0);
        setIntField(term497107, term497107.getClass(), "breakPerfect", 0);
        setIntField(term497107, term497107.getClass(), "breakGreat", 0);
        setIntField(term497107, term497107.getClass(), "breakGood", 0);
        setIntField(term497107, term497107.getClass(), "breakMiss", 0);
        setBooleanField(term497107, term497107.getClass(), "isTap", false);
        setBooleanField(term497107, term497107.getClass(), "isHold", false);
        setBooleanField(term497107, term497107.getClass(), "isSlide", false);
        setBooleanField(term497107, term497107.getClass(), "isTouch", false);
        setBooleanField(term497107, term497107.getClass(), "isBreak", false);
        setBooleanField(term497107, term497107.getClass(), "isCriticalDisp", false);
        setBooleanField(term497107, term497107.getClass(), "isFastLateDisp", false);
        setIntField(term497107, term497107.getClass(), "fastCount", 0);
        setIntField(term497107, term497107.getClass(), "lateCount", 0);
        setBooleanField(term497107, term497107.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term497107, term497107.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term497107, term497107.getClass(), "comboStatus", 0);
        setIntField(term497107, term497107.getClass(), "syncStatus", 0);
        setBooleanField(term497107, term497107.getClass(), "isClear", false);
        setIntField(term497107, term497107.getClass(), "beforeRating", 0);
        setIntField(term497107, term497107.getClass(), "afterRating", 0);
        setIntField(term497107, term497107.getClass(), "beforeGrade", 0);
        setIntField(term497107, term497107.getClass(), "afterGrade", 0);
        setIntField(term497107, term497107.getClass(), "afterGradeRank", 0);
        setIntField(term497107, term497107.getClass(), "beforeDeluxRating", 0);
        setIntField(term497107, term497107.getClass(), "afterDeluxRating", 0);
        setBooleanField(term497107, term497107.getClass(), "isPlayTutorial", false);
        setBooleanField(term497107, term497107.getClass(), "isEventMode", false);
        setBooleanField(term497107, term497107.getClass(), "isFreedomMode", false);
        setIntField(term497107, term497107.getClass(), "playMode", 0);
        setBooleanField(term497107, term497107.getClass(), "isNewFree", false);
        setIntField(term497107, term497107.getClass(), "trialPlayAchievement", 0);
        setIntField(term497107, term497107.getClass(), "extNum1", 0);
        setIntField(term497107, term497107.getClass(), "extNum2", 0);
        term497207 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term497207;
        callMethod(klass, "setNewFree", argTypes, term497107, args);
    }

};


