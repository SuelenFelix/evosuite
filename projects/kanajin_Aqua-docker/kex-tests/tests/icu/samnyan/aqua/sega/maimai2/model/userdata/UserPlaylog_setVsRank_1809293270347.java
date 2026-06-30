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

public class UserPlaylog_setVsRank_1809293270347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term488647;
     Object term488747;

    public UserPlaylog_setVsRank_1809293270347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term488647 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term488647, term488647.getClass(), "id", 0L);
        setField(term488647, term488647.getClass(), "user", null);
        setIntField(term488647, term488647.getClass(), "orderId", 0);
        setLongField(term488647, term488647.getClass(), "playlogId", 0L);
        setIntField(term488647, term488647.getClass(), "version", 0);
        setIntField(term488647, term488647.getClass(), "placeId", 0);
        setField(term488647, term488647.getClass(), "placeName", null);
        setLongField(term488647, term488647.getClass(), "loginDate", 0L);
        setField(term488647, term488647.getClass(), "playDate", null);
        setField(term488647, term488647.getClass(), "userPlayDate", null);
        setIntField(term488647, term488647.getClass(), "type", 0);
        setIntField(term488647, term488647.getClass(), "musicId", 0);
        setIntField(term488647, term488647.getClass(), "level", 0);
        setIntField(term488647, term488647.getClass(), "trackNo", 0);
        setIntField(term488647, term488647.getClass(), "vsMode", 0);
        setField(term488647, term488647.getClass(), "vsUserName", null);
        setIntField(term488647, term488647.getClass(), "vsStatus", 0);
        setIntField(term488647, term488647.getClass(), "vsUserRating", 0);
        setIntField(term488647, term488647.getClass(), "vsUserAchievement", 0);
        setIntField(term488647, term488647.getClass(), "vsUserGradeRank", 0);
        setIntField(term488647, term488647.getClass(), "vsRank", 0);
        setIntField(term488647, term488647.getClass(), "playerNum", 0);
        setLongField(term488647, term488647.getClass(), "playedUserId1", 0L);
        setField(term488647, term488647.getClass(), "playedUserName1", null);
        setIntField(term488647, term488647.getClass(), "playedMusicLevel1", 0);
        setLongField(term488647, term488647.getClass(), "playedUserId2", 0L);
        setField(term488647, term488647.getClass(), "playedUserName2", null);
        setIntField(term488647, term488647.getClass(), "playedMusicLevel2", 0);
        setLongField(term488647, term488647.getClass(), "playedUserId3", 0L);
        setField(term488647, term488647.getClass(), "playedUserName3", null);
        setIntField(term488647, term488647.getClass(), "playedMusicLevel3", 0);
        setIntField(term488647, term488647.getClass(), "characterId1", 0);
        setIntField(term488647, term488647.getClass(), "characterLevel1", 0);
        setIntField(term488647, term488647.getClass(), "characterAwakening1", 0);
        setIntField(term488647, term488647.getClass(), "characterId2", 0);
        setIntField(term488647, term488647.getClass(), "characterLevel2", 0);
        setIntField(term488647, term488647.getClass(), "characterAwakening2", 0);
        setIntField(term488647, term488647.getClass(), "characterId3", 0);
        setIntField(term488647, term488647.getClass(), "characterLevel3", 0);
        setIntField(term488647, term488647.getClass(), "characterAwakening3", 0);
        setIntField(term488647, term488647.getClass(), "characterId4", 0);
        setIntField(term488647, term488647.getClass(), "characterLevel4", 0);
        setIntField(term488647, term488647.getClass(), "characterAwakening4", 0);
        setIntField(term488647, term488647.getClass(), "characterId5", 0);
        setIntField(term488647, term488647.getClass(), "characterLevel5", 0);
        setIntField(term488647, term488647.getClass(), "characterAwakening5", 0);
        setIntField(term488647, term488647.getClass(), "achievement", 0);
        setIntField(term488647, term488647.getClass(), "deluxscore", 0);
        setIntField(term488647, term488647.getClass(), "scoreRank", 0);
        setIntField(term488647, term488647.getClass(), "maxCombo", 0);
        setIntField(term488647, term488647.getClass(), "totalCombo", 0);
        setIntField(term488647, term488647.getClass(), "maxSync", 0);
        setIntField(term488647, term488647.getClass(), "totalSync", 0);
        setIntField(term488647, term488647.getClass(), "tapCriticalPerfect", 0);
        setIntField(term488647, term488647.getClass(), "tapPerfect", 0);
        setIntField(term488647, term488647.getClass(), "tapGreat", 0);
        setIntField(term488647, term488647.getClass(), "tapGood", 0);
        setIntField(term488647, term488647.getClass(), "tapMiss", 0);
        setIntField(term488647, term488647.getClass(), "holdCriticalPerfect", 0);
        setIntField(term488647, term488647.getClass(), "holdPerfect", 0);
        setIntField(term488647, term488647.getClass(), "holdGreat", 0);
        setIntField(term488647, term488647.getClass(), "holdGood", 0);
        setIntField(term488647, term488647.getClass(), "holdMiss", 0);
        setIntField(term488647, term488647.getClass(), "slideCriticalPerfect", 0);
        setIntField(term488647, term488647.getClass(), "slidePerfect", 0);
        setIntField(term488647, term488647.getClass(), "slideGreat", 0);
        setIntField(term488647, term488647.getClass(), "slideGood", 0);
        setIntField(term488647, term488647.getClass(), "slideMiss", 0);
        setIntField(term488647, term488647.getClass(), "touchCriticalPerfect", 0);
        setIntField(term488647, term488647.getClass(), "touchPerfect", 0);
        setIntField(term488647, term488647.getClass(), "touchGreat", 0);
        setIntField(term488647, term488647.getClass(), "touchGood", 0);
        setIntField(term488647, term488647.getClass(), "touchMiss", 0);
        setIntField(term488647, term488647.getClass(), "breakCriticalPerfect", 0);
        setIntField(term488647, term488647.getClass(), "breakPerfect", 0);
        setIntField(term488647, term488647.getClass(), "breakGreat", 0);
        setIntField(term488647, term488647.getClass(), "breakGood", 0);
        setIntField(term488647, term488647.getClass(), "breakMiss", 0);
        setBooleanField(term488647, term488647.getClass(), "isTap", false);
        setBooleanField(term488647, term488647.getClass(), "isHold", false);
        setBooleanField(term488647, term488647.getClass(), "isSlide", false);
        setBooleanField(term488647, term488647.getClass(), "isTouch", false);
        setBooleanField(term488647, term488647.getClass(), "isBreak", false);
        setBooleanField(term488647, term488647.getClass(), "isCriticalDisp", false);
        setBooleanField(term488647, term488647.getClass(), "isFastLateDisp", false);
        setIntField(term488647, term488647.getClass(), "fastCount", 0);
        setIntField(term488647, term488647.getClass(), "lateCount", 0);
        setBooleanField(term488647, term488647.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term488647, term488647.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term488647, term488647.getClass(), "comboStatus", 0);
        setIntField(term488647, term488647.getClass(), "syncStatus", 0);
        setBooleanField(term488647, term488647.getClass(), "isClear", false);
        setIntField(term488647, term488647.getClass(), "beforeRating", 0);
        setIntField(term488647, term488647.getClass(), "afterRating", 0);
        setIntField(term488647, term488647.getClass(), "beforeGrade", 0);
        setIntField(term488647, term488647.getClass(), "afterGrade", 0);
        setIntField(term488647, term488647.getClass(), "afterGradeRank", 0);
        setIntField(term488647, term488647.getClass(), "beforeDeluxRating", 0);
        setIntField(term488647, term488647.getClass(), "afterDeluxRating", 0);
        setBooleanField(term488647, term488647.getClass(), "isPlayTutorial", false);
        setBooleanField(term488647, term488647.getClass(), "isEventMode", false);
        setBooleanField(term488647, term488647.getClass(), "isFreedomMode", false);
        setIntField(term488647, term488647.getClass(), "playMode", 0);
        setBooleanField(term488647, term488647.getClass(), "isNewFree", false);
        setIntField(term488647, term488647.getClass(), "trialPlayAchievement", 0);
        setIntField(term488647, term488647.getClass(), "extNum1", 0);
        setIntField(term488647, term488647.getClass(), "extNum2", 0);
        term488747 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term488747;
        callMethod(klass, "setVsRank", argTypes, term488647, args);
    }

};


